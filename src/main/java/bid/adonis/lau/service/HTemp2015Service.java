package bid.adonis.lau.service;

import bid.adonis.lau.entity.HTemp2015;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 14:32
 */
public interface HTemp2015Service {
    /**
     * 查询所有数据
     * @return
     */
    List<HTemp2015> findAll();

    /**
     * 分页查询
     * @return
     */
    Page<HTemp2015> findPage(PageRequest pageRequest);

    /**
     * 查询总条数
     * @return
     */
    Long count();
}
