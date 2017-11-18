package bid.adonis.lau.service.impl;

import bid.adonis.lau.entity.TEnterpriseAddress;
import bid.adonis.lau.service.TEnterpriseAddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 11:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class TEnterpriseAddressServiceTest {

    @Autowired
    TEnterpriseAddressService enterpriseAddressService;

    @Test
    public void findOne() {
        TEnterpriseAddress enterpriseAddress = enterpriseAddressService.findOne("5555");
        System.out.println(enterpriseAddress);
    }

}