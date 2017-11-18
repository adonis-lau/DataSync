package bid.adonis.lau.sync;

import bid.adonis.lau.entity.TEnterpriseAddress;
import bid.adonis.lau.service.TEnterpriseAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 11:53
 */
public class TEnterpriseAddressSync {


    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        TEnterpriseAddressService enterpriseAddressService = (TEnterpriseAddressService) ac.getBean("tEnterpriseAddressService");



        TEnterpriseAddress enterpriseAddress = enterpriseAddressService.findOne("5555");
        System.out.println(enterpriseAddress);
    }
}
