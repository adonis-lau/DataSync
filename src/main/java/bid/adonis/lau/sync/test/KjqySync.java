package bid.adonis.lau.sync.test;

import bid.adonis.lau.entity.Kjqy;
import bid.adonis.lau.service.KjqyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 13:29
 */
public class KjqySync {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        KjqyService kjqyService = (KjqyService) ac.getBean("kjqyService");

        List<Kjqy> kjqyList = kjqyService.findAll();
        System.out.println(kjqyList.size());
    }
}
