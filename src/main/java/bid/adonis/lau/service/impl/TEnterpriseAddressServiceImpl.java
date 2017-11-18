package bid.adonis.lau.service.impl;

import bid.adonis.lau.dao.TEnterpriseAddressDao;
import bid.adonis.lau.entity.TEnterpriseAddress;
import bid.adonis.lau.service.TEnterpriseAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 11:26
 */
@Service("tEnterpriseAddressService")
@Transactional(rollbackFor = Exception.class)
public class TEnterpriseAddressServiceImpl implements TEnterpriseAddressService {

    @Autowired
    private TEnterpriseAddressDao enterpriseAddressDao;

    /**
     * 通过ID查询一条信息
     *
     * @param id
     * @return
     */
    @Override
    public TEnterpriseAddress findOne(String id) {
        return enterpriseAddressDao.findOne(id);
    }
}
