package bid.adonis.lau.service.impl;

import bid.adonis.lau.dao.EnterpriseInfoTmpDao;
import bid.adonis.lau.entity.EnterpriseInfoTmp;
import bid.adonis.lau.service.EnterpriseInfoTmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 13:16
 */
@Service("enterpriseInfoTmpService")
@Transactional(rollbackFor = Exception.class)
public class EnterpriseInfoTmpServiceImpl implements EnterpriseInfoTmpService {

    private static final Logger logger = LoggerFactory.getLogger(EnterpriseInfoTmpServiceImpl.class);

    @Autowired
    private EnterpriseInfoTmpDao enterpriseInfoTmpDao;

    /**
     * 查询所有科技企业
     *
     * @return
     */
    @Override
    public List<EnterpriseInfoTmp> findAll() {
        return enterpriseInfoTmpDao.findAll();
    }

    /**
     * 保存一列数据
     *
     * @param enterpriseInfoTmpList
     */
    @Override
    public void save(List<EnterpriseInfoTmp> enterpriseInfoTmpList) {
        enterpriseInfoTmpDao.save(enterpriseInfoTmpList);
    }
}
