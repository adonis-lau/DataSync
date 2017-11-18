package bid.adonis.lau.service.impl;

import bid.adonis.lau.dao.HTemp2016Dao;
import bid.adonis.lau.entity.HTemp2016;
import bid.adonis.lau.service.HTemp2016Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 14:32
 */
@Service("hTemp2016Service")
@Transactional(rollbackFor = Exception.class)
public class HTemp2016ServiceImpl implements HTemp2016Service {
    private static final Logger logger = LoggerFactory.getLogger(HTemp2016ServiceImpl.class);

    @Autowired
    private HTemp2016Dao temp2016Dao;


    /**
     * 查询所有数据
     *
     * @return
     */
    @Override
    public List<HTemp2016> findAll() {
        return temp2016Dao.findAll();
    }
}
