package bid.adonis.lau.service.impl;

import bid.adonis.lau.dao.HTemp2015Dao;
import bid.adonis.lau.entity.HTemp2015;
import bid.adonis.lau.service.HTemp2015Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 14:32
 */
@Service("hTemp2015Service")
@Transactional(rollbackFor = Exception.class)
public class HTemp2015ServiceImpl implements HTemp2015Service {
    private static final Logger logger = LoggerFactory.getLogger(HTemp2015ServiceImpl.class);

    @Autowired
    private HTemp2015Dao temp2015Dao;


    /**
     * 查询所有数据
     *
     * @return
     */
    @Override
    public List<HTemp2015> findAll() {
        return temp2015Dao.findAll();
    }

    /**
     * 分页查询
     *
     * @param pageRequest
     * @return
     */
    @Override
    public Page<HTemp2015> findPage(PageRequest pageRequest) {
        return temp2015Dao.findAll(pageRequest);
    }

    /**
     * 查询总条数
     *
     * @return
     */
    @Override
    public Long count() {
        return temp2015Dao.count();
    }
}
