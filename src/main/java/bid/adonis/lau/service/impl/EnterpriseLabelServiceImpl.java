package bid.adonis.lau.service.impl;

import bid.adonis.lau.dao.EnterpriseLabelDao;
import bid.adonis.lau.entity.EnterpriseLabel;
import bid.adonis.lau.service.EnterpriseLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 12:31
 */
@Service("enterpriseLabelService")
@Transactional(rollbackFor = Exception.class)
public class EnterpriseLabelServiceImpl implements EnterpriseLabelService {

    @Autowired
    private EnterpriseLabelDao enterpriseLabelDao;

    /**
     * 保存一列数据
     *
     * @param enterpriseLabelList
     */
    @Override
    public void save(List<EnterpriseLabel> enterpriseLabelList) {
        enterpriseLabelDao.save(enterpriseLabelList);
    }
}
