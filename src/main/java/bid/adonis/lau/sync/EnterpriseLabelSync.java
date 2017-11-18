package bid.adonis.lau.sync;

import bid.adonis.lau.entity.Kjqy;
import bid.adonis.lau.service.EnterpriseLabelService;
import bid.adonis.lau.service.KjqyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 13:38
 */
public class EnterpriseLabelSync {

    private final static Logger logger = LoggerFactory.getLogger(EnterpriseLabelSync.class);

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        logger.info("配置文件读取成功，开始注入bean");

        EnterpriseLabelService enterpriseLabelService = (EnterpriseLabelService) ac.getBean("enterpriseLabelService");
        KjqyService kjqyService = (KjqyService) ac.getBean("kjqyService");

        List<Kjqy> kjqyList = kjqyService.findAll();
        System.out.println(kjqyList.size());
    }
}
