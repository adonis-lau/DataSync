package bid.adonis.lau.service;

import bid.adonis.lau.entity.HTemp;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 14:32
 */
public interface HTempService {
    /**
     * 查询所有数据
     * @return
     */
    List<HTemp> findAll();
}
