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
     * 保存一列数据
     * @param enterpriseLabelList
     */
    void save(List<EnterpriseLabel> enterpriseLabelList);
}
