package bid.adonis.lau.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 19:07
 */
@Entity
@Table(name = "T_ENTERPRISE_INFO_TMP")
public class EnterpriseInfoTmp {
    @Id
    private String nasrdm;
    private String nasrmc;
    private String zcdz;
    private String jydz;
    private String swdjzh;
    private String shxydm;
    private String frdb;
    private String lxr;
    private String lxdh;

    public String getNasrdm() {
        return nasrdm;
    }

    public void setNasrdm(String nasrdm) {
        this.nasrdm = nasrdm;
    }

    public String getNasrmc() {
        return nasrmc;
    }

    public void setNasrmc(String nasrmc) {
        this.nasrmc = nasrmc;
    }

    public String getZcdz() {
        return zcdz;
    }

    public void setZcdz(String zcdz) {
        this.zcdz = zcdz;
    }

    public String getJydz() {
        return jydz;
    }

    public void setJydz(String jydz) {
        this.jydz = jydz;
    }

    public String getSwdjzh() {
        return swdjzh;
    }

    public void setSwdjzh(String swdjzh) {
        this.swdjzh = swdjzh;
    }

    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }

    public String getFrdb() {
        return frdb;
    }

    public void setFrdb(String frdb) {
        this.frdb = frdb;
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }
}
