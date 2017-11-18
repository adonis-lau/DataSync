package bid.adonis.lau.dao;

import bid.adonis.lau.entity.TEnterpriseAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 11:17
 */
@Repository
public interface TEnterpriseAddressDao extends JpaRepository<TEnterpriseAddress, String> {
}
