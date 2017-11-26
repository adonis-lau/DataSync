package bid.adonis.lau.dao;

import bid.adonis.lau.entity.EnterpriseLabel;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 12:39
 */
public interface EnterpriseLabelDao extends JpaRepository<EnterpriseLabel, String>,EntityManager {
    /**
     * 通过纳税人代码查询一条数据
     * @param nasrdm
     * @return
     */
    EnterpriseLabel findOneByNasrdm(String nasrdm);

    /**
     * 通过纳税人代码和添加日期查询一条数据
     * @param nasrdm
     * @param tjrq
     * @return
     */
    EnterpriseLabel findOneByNasrdmAndTjrq(String nasrdm, String tjrq);
}
