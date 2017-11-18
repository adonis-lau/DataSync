package bid.adonis.lau.service.impl;

import bid.adonis.lau.dao.KjqyDao;
import bid.adonis.lau.entity.Kjqy;
import bid.adonis.lau.service.KjqyService;
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
@Service("kjqyService")
@Transactional(rollbackFor = Exception.class)
public class KjqyServiceImpl implements KjqyService {

    private static final Logger logger = LoggerFactory.getLogger(KjqyServiceImpl.class);

    @Autowired
    private KjqyDao kjqyDao;

    /**
     * 查询所有科技企业
     *
     * @return
     */
    @Override
    public List<Kjqy> findAll() {
        return kjqyDao.findAll();
    }
}
