package bid.adonis.lau.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 12:17
 */
@Entity
@Table(name = "T_ENTERPRISE_LABEL")
public class EnterpriseLabel {
    @Id
    private String id;
    /**
     * 纳税人代码
     */
    private String nasrdm;
    /**
     * 统计日期
     */
    private String tjrq;
    /**
     * 在地纳税类型（1:本区经营本区纳税，2：本区经营外区纳税，3：外区经营本区纳税）
     */
    private String zdnslx;
    /**
     * 五大行业
     */
    private String wdhy;
    /**
     * 五大行业类型
     */
    private String wdhylx;
    /**
     * 纳税区域
     */
    private String nsqy;
    /**
     * 总部/关联企业（1:总部，2：关联）
     */
    private String zbqy;
    /**
     * 电子商务（1：是  9：否）
     */
    private String dzsw;
    /**
     * 外资企业（1：是，0：否）
     */
    private String wzqy;
    /**
     * 私营企业（1：是，0：否）
     */
    private String syqy;
    /**
     * 科技企业（1：是，0：否）
     */
    private String kjqy;
    /**
     * 品牌企业（1：是，0：否）
     */
    private String ppqy;
    /**
     * 投资方国别
     */
    private String tzfgb;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNasrdm() {
        return nasrdm;
    }

    public void setNasrdm(String nasrdm) {
        this.nasrdm = nasrdm;
    }

    public String getTjrq() {
        return tjrq;
    }

    public void setTjrq(String tjrq) {
        this.tjrq = tjrq;
    }

    public String getZdnslx() {
        return zdnslx;
    }

    public void setZdnslx(String zdnslx) {
        this.zdnslx = zdnslx;
    }

    public String getWdhy() {
        return wdhy;
    }

    public void setWdhy(String wdhy) {
        this.wdhy = wdhy;
    }

    public String getWdhylx() {
        return wdhylx;
    }

    public void setWdhylx(String wdhylx) {
        this.wdhylx = wdhylx;
    }

    public String getNsqy() {
        return nsqy;
    }

    public void setNsqy(String nsqy) {
        this.nsqy = nsqy;
    }

    public String getZbqy() {
        return zbqy;
    }

    public void setZbqy(String zbqy) {
        this.zbqy = zbqy;
    }

    public String getDzsw() {
        return dzsw;
    }

    public void setDzsw(String dzsw) {
        this.dzsw = dzsw;
    }

    public String getWzqy() {
        return wzqy;
    }

    public void setWzqy(String wzqy) {
        this.wzqy = wzqy;
    }

    public String getSyqy() {
        return syqy;
    }

    public void setSyqy(String syqy) {
        this.syqy = syqy;
    }

    public String getKjqy() {
        return kjqy;
    }

    public void setKjqy(String kjqy) {
        this.kjqy = kjqy;
    }

    public String getPpqy() {
        return ppqy;
    }

    public void setPpqy(String ppqy) {
        this.ppqy = ppqy;
    }

    public String getTzfgb() {
        return tzfgb;
    }

    public void setTzfgb(String tzfgb) {
        this.tzfgb = tzfgb;
    }
}
