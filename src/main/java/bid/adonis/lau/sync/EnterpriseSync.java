package bid.adonis.lau.sync;

import bid.adonis.lau.entity.*;
import bid.adonis.lau.service.*;
import bid.adonis.lau.utisl.PageRequestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 13:38
 */
public class EnterpriseSync {

    private final static Logger logger = LoggerFactory.getLogger(EnterpriseSync.class);

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        logger.info("配置文件读取成功，开始注入bean");

        EnterpriseLabelService enterpriseLabelService = (EnterpriseLabelService) ac.getBean("enterpriseLabelService");
        EnterpriseInfoTmpService enterpriseInfoTmpService = (EnterpriseInfoTmpService) ac.getBean("enterpriseInfoTmpService");
        KjqyService kjqyService = (KjqyService) ac.getBean("kjqyService");
        HTemp2015Service hTemp2015Service = (HTemp2015Service) ac.getBean("hTemp2015Service");
        TzfgbService tzfgbService = (TzfgbService) ac.getBean("tzfgbService");

        //获取投资方国别列表，放入Map
        List<Tzfgb> tzfgbList = tzfgbService.findAll();
        HashMap<String, String> tzfgbMap = new HashMap<>();
        for (Tzfgb tzfgb : tzfgbList) {
            tzfgbMap.put(tzfgb.getNumbering(), tzfgb.getCountry());
        }

        //获取科技企业名称，放入List
        List<Kjqy> kjqyList = kjqyService.findAll();
        List<String> kjqymcList = new ArrayList<>();
        for (Kjqy kjqy : kjqyList) {
            kjqymcList.add(kjqy.getName());
        }

        //获取户管库2015所有数据总条数
        Long count = hTemp2015Service.count();
        logger.info("H_TEMP_2015总共有{}条数据", count);

        //每次处理5000条数据
        Long times = count / 5000;
        Long last = count % 5000;
        logger.info("总共需要循环{}次",times);
        for (Integer current = 0; current <= times; current++) {
            Sort sort = new Sort(Sort.Direction.ASC, "tjrq");
            List<HTemp2015> before = hTemp2015Service.findPage(PageRequestUtils.buildPageRequestWithSort(current, 5000, sort)).getContent();
            ArrayList<EnterpriseLabel> enterpriseLabelAfter = new ArrayList<>();
            ArrayList<EnterpriseInfoTmp> enterpriseInfoTmpAfter = new ArrayList<>();
            for (HTemp2015 temp : before) {
                //处理enterpriseLabel表数据
                EnterpriseLabel enterpriseLabel = null;
                enterpriseLabel = enterpriseLabelService.findOneByNasrdmAndTjrq(temp.getNasrdm(),"%2015%");
                if (enterpriseLabel == null) {
                    enterpriseLabel = new EnterpriseLabel();
                }
                enterpriseLabel.setNasrdm(temp.getNasrdm());
                enterpriseLabel.setWdhy(temp.getSwF10());
                enterpriseLabel.setWdhylx(temp.getSwF11());
                enterpriseLabel.setZbqy(temp.getSwF602());
                enterpriseLabel.setDzsw(temp.getSwF600());
                enterpriseLabel.setWzqy(isWzqy(temp.getSwF24()));
                enterpriseLabel.setSyqy("17".equals(temp.getSwF07().substring(0, 2)) ? "1" : "0");
                enterpriseLabel.setKjqy(kjqymcList.contains(temp.getNasrmc()) ? "1" : "0");
                enterpriseLabel.setTzfgb(getTzfgb(temp.getSwF24(), tzfgbMap));
                enterpriseLabel.setYzsdjy(temp.getSwF14());
                enterpriseLabel.setYzsdzc(temp.getSwF13());
                enterpriseLabel.setTjrq("2015");
                enterpriseLabelAfter.add(enterpriseLabel);

                //处理enterpriseInfoTmp表数据
                EnterpriseInfoTmp enterpriseInfoTmp = new EnterpriseInfoTmp();
                enterpriseInfoTmp.setNasrdm(temp.getNasrdm());
                enterpriseInfoTmp.setNasrmc(temp.getNasrmc());
                enterpriseInfoTmp.setZcdz(temp.getZhucdz());
                enterpriseInfoTmp.setJydz(temp.getJydz());
                enterpriseInfoTmp.setSwdjzh(temp.getSwdjzh());
                enterpriseInfoTmp.setShxydm(temp.getShxydm());
                enterpriseInfoTmp.setFrdb(temp.getFrdb());
                enterpriseInfoTmp.setLxr(temp.getLxr());
                enterpriseInfoTmp.setLxdh(temp.getLxdh());
                enterpriseInfoTmpAfter.add(enterpriseInfoTmp);
            }
            //保存enterpriseLabel表数据
            enterpriseLabelService.save(enterpriseLabelAfter);
            //保存enterpriseInfoTmp表数据
            enterpriseInfoTmpService.save(enterpriseInfoTmpAfter);

            logger.info("当前是第{}次，共处理{}条数据", (current + 1), current.equals(times) ? (current + 1) * 5000 + last : (current + 1) * 5000);
        }


    }

    private static String isWzqy(String before) {
        String[] split = before.split(",");
        String yes = "1";
        String no = "0";
        for (String s : split) {
            if (!"156".equals(s)) {
                return yes;
            }
        }
        return no;
    }

    private static String getTzfgb(String before, HashMap<String, String> tzfgbMap) {
        StringBuilder sb = new StringBuilder();
        String[] split = before.split(",");
        for (String num : split) {
            sb.append(tzfgbMap.get(num)).append(",");
        }
        String after = sb.toString();
        return after.substring(0, after.length() - 1);
    }
}
