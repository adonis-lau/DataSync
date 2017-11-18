package bid.adonis.lau.service;

import bid.adonis.lau.entity.Kjqy;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 13:15
 */
public interface KjqyService {
    /**
     * 查询所有科技企业
     * @return
     */
    List<Kjqy> findAll();
}
