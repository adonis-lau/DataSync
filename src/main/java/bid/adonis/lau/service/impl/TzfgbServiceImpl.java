package bid.adonis.lau.service.impl;

import bid.adonis.lau.dao.TzfgbDao;
import bid.adonis.lau.entity.Tzfgb;
import bid.adonis.lau.service.TzfgbService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 13:16
 */
@Service("tzfgbService")
@Transactional(rollbackFor = Exception.class)
public class TzfgbServiceImpl implements TzfgbService {

    private static final Logger logger = LoggerFactory.getLogger(TzfgbServiceImpl.class);

    @Autowired
    private TzfgbDao tzfgbDao;

    /**
     * 查询所有科技企业
     *
     * @return
     */
    @Override
    public List<Tzfgb> findAll() {
        return tzfgbDao.findAll();
    }

    /**
     * 保存一列数据
     *
     * @param tzfgbList
     */
    @Override
    public void save(List<Tzfgb> tzfgbList) {
        tzfgbDao.save(tzfgbList);
    }
}
