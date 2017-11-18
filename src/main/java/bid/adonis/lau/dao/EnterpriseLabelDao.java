package bid.adonis.lau.dao;

import bid.adonis.lau.entity.EnterpriseLabel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 12:39
 */
public interface EnterpriseLabelDao extends JpaRepository<EnterpriseLabel, String> {
    /**
     * 通过纳税人代码查询一条数据
     * @param nasrdm
     * @return
     */
    EnterpriseLabel findOneByNasrdm(String nasrdm);
}
