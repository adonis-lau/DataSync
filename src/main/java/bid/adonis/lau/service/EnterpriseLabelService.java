package bid.adonis.lau.service;

import bid.adonis.lau.entity.EnterpriseInfoTmp;
import bid.adonis.lau.entity.EnterpriseLabel;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 12:30
 */
public interface EnterpriseLabelService {
    /**
     * 查询一条数据
     * @param nasrdm
     * @return
     */
    EnterpriseLabel findOneByNasrdm(String nasrdm);

    /**
     * 保存一列数据
     * @param enterpriseLabelList
     */
    void save(List<EnterpriseLabel> enterpriseLabelList);

    /**
     * 通过纳税人代码和添加日期查询一条数据
     * @param nasrdm
     * @param tjrq
     * @return
     */
    EnterpriseLabel findOneByNasrdmAndTjrq(String nasrdm, String tjrq);
}
