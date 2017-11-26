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
     * 查询一条数据
     *
     * @param nasrdm
     * @return
     */
    @Override
    public EnterpriseLabel findOneByNasrdm(String nasrdm) {
        return enterpriseLabelDao.findOneByNasrdm(nasrdm);
    }

    /**
     * 保存一列数据
     *
     * @param enterpriseLabelList
     */
    @Override
    public void save(List<EnterpriseLabel> enterpriseLabelList) {
        enterpriseLabelDao.save(enterpriseLabelList);
    }

    /**
     * 通过纳税人代码和添加日期查询一条数据
     *
     * @param nasrdm
     * @param tjrq
     * @return
     */
    @Override
    public EnterpriseLabel findOneByNasrdmAndTjrq(String nasrdm, String tjrq) {
        return enterpriseLabelDao.findOneByNasrdmAndTjrq(nasrdm,tjrq);
    }
}
