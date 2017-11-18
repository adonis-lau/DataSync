package bid.adonis.lau.service;

import bid.adonis.lau.entity.Tzfgb;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 13:15
 */
public interface TzfgbService {
    /**
     * 查询所有科技企业
     * @return
     */
    List<Tzfgb> findAll();

    /**
     * 保存一列数据
     * @param tzfgbList
     */
    void save(List<Tzfgb> tzfgbList);
}
