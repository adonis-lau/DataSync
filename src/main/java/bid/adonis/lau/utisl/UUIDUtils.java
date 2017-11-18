package bid.adonis.lau.utisl;

import java.util.UUID;

/**
 * @Author: adonis lau
 * @Eamil: adonis.lau.dev@gmail.com
 * @Date: 2017/10/26 23:44
 */

public class UUIDUtils {
    /**
     * 生成UUID
     *
     * @return
     */
    public static String genUUID() {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        s = s.replace("-", "");
        return s;
    }

}
