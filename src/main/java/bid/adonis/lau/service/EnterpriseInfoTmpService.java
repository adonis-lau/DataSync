package bid.adonis.lau.service;

import bid.adonis.lau.entity.EnterpriseInfoTmp;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 13:15
 */
public interface EnterpriseInfoTmpService {
    /**
     * 查询所有
     * @return
     */
    List<EnterpriseInfoTmp> findAll();

    /**
     * 保存一列数据
     * @param enterpriseInfoTmpList
     */
    void save(List<EnterpriseInfoTmp> enterpriseInfoTmpList);
}
