package bid.adonis.lau.sync;

import bid.adonis.lau.entity.Tzfgb;
import bid.adonis.lau.service.TzfgbService;
import bid.adonis.lau.utisl.ExcelUtil;
import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 15:03
 */
public class TzfgbSync {

    private final static Logger logger = LoggerFactory.getLogger(TzfgbSync.class);

    public static void main(String[] args) throws FileNotFoundException, FileFormatException {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        logger.info("配置文件读取成功，开始注入bean");

        TzfgbService tzfgbService = (TzfgbService) ac.getBean("tzfgbService");

        List<List<String>> lists = ExcelUtil.readExcel("F:\\Work\\Outside\\静安决策\\国别.xlsx");

        ArrayList<Tzfgb> tzfgbList = new ArrayList<>();

        for (List<String> list : lists) {
            Tzfgb tzfgb = new Tzfgb();
            tzfgb.setNumbering(list.get(0));
            tzfgb.setCountry(list.get(1));
            tzfgbList.add(tzfgb);
        }

        tzfgbService.save(tzfgbList);

        List<Tzfgb> all = tzfgbService.findAll();
        System.out.println(all.size());
    }
}
