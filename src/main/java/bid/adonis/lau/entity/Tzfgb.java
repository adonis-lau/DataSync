package bid.adonis.lau.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 14:46
 */
@Entity
@Table(name = "T_TZFGB_LIST")
public class Tzfgb {
    @Id
    private String numbering;
    private String country;

    public String getNumbering() {
        return numbering;
    }

    public void setNumbering(String numbering) {
        this.numbering = numbering;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
