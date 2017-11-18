package bid.adonis.lau.service;

import bid.adonis.lau.entity.TEnterpriseAddress;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 11:25
 */
public interface TEnterpriseAddressService {

    /**
     * 通过ID查询一条信息
     * @param id
     * @return
     */
    TEnterpriseAddress findOne(String id);
}
