package bid.adonis.lau.service.impl;

import bid.adonis.lau.dao.HTempDao;
import bid.adonis.lau.entity.HTemp;
import bid.adonis.lau.service.HTempService;
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
@Service("hTempService")
@Transactional(rollbackFor = Exception.class)
public class HTempServiceImpl implements HTempService {
    private static final Logger logger = LoggerFactory.getLogger(HTempServiceImpl.class);

    @Autowired
    private HTempDao tempDao;


    /**
     * 查询所有数据
     *
     * @return
     */
    @Override
    public List<HTemp> findAll() {
        return tempDao.findAll();
    }
}
