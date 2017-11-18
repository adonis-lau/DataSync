package bid.adonis.lau.utisl;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Adonis Lau
 * @date 2017/7/15
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
    public static Integer getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    public static Integer getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    public static Integer getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static Date buildFromYMD(Integer year, Integer month, Integer day) {
        day = day == null ? 1 : day;
        String ymd = year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day);
        try {
            return org.apache.commons.lang3.time.DateUtils.parseDate(ymd, "yyyy-MM-dd");
        } catch (ParseException e) {
            throw new RuntimeException("组建日期异常");
        }
    }

    public static Date addDate(Date date, int type, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(type, num);
        return calendar.getTime();
    }

    public static Date getCurrentDate(Date date, String format) {
        String dateStr = DateFormatUtils.format(date, format);
        try {
            return org.apache.commons.lang3.time.DateUtils.parseDate(dateStr, format);
        } catch (ParseException e) {
            throw new RuntimeException("日期转换异常");
        }
    }
    public static String getCurrentDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }


}
