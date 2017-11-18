package bid.adonis.lau.utisl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 16:51
 */
public class PageRequestUtils {
    /**
     * 构建PageRequest
     */
    public static PageRequest buildPageRequest(int pageNumber, int pagzSize) {
        return new PageRequest(pageNumber, pagzSize, null);
    }

    /**
     * 构建PageRequest,并排序
     */
    public static PageRequest buildPageRequestWithSort(int pageNumber, int pagzSize, Sort sort) {
        return new PageRequest(pageNumber, pagzSize, sort);
    }
}
