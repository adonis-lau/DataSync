package bid.adonis.lau.utisl;

import org.springframework.data.domain.PageRequest;

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
        return new PageRequest(pageNumber - 1, pagzSize, null);
    }
}
