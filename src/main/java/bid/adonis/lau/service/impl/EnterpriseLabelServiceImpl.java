package bid.adonis.lau.service.impl;

import bid.adonis.lau.service.EnterpriseLabelService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 12:31
 */
@Service("enterpriseLabelService")
@Transactional(rollbackFor = Exception.class)
public class EnterpriseLabelServiceImpl implements EnterpriseLabelService {

}
