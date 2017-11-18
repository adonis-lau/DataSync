package bid.adonis.lau.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 12:56
 */
@Entity
@Table(name = "T_KJQY_LIST")
public class Kjqy {
    @Id
    private String name;
    private String nsrdm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNsrdm() {
        return nsrdm;
    }

    public void setNsrdm(String nsrdm) {
        this.nsrdm = nsrdm;
    }
}
