package bid.adonis.lau.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Adonis Lau
 * @eamil adonis.lau.dev@gmail.com
 * @date Created in 2017/11/18 14:23
 */
@Entity
@Table(name = "H_TEMP")
public class HTemp {
    @Id
    @Column(name = "NASRDM")
    private String nasrdm;
    @Column(name = "NASRMC")
    private String nasrmc;
    @Column(name = "TJRQ")
    private String tjrq;
    @Column(name = "SWDJZH")
    private String swdjzh;
    @Column(name = "SHXYDM")
    private String shxydm;
    @Column(name = "FRDB")
    private String frdb;
    @Column(name = "LXR")
    private String lxr;
    @Column(name = "LXDH")
    private String lxdh;
    @Column(name = "HUG_FL")
    private String hugFl;
    @Column(name = "ZHUCDZ")
    private String zhucdz;
    @Column(name = "ZHUCDZ_OLD")
    private String zhucdzOld;
    @Column(name = "ZHUCDZDH")
    private String zhucdzdh;
    @Column(name = "JYDZ")
    private String jydz;
    @Column(name = "JYDZ_OLD")
    private String jydzOld;
    @Column(name = "JYDZDH")
    private String jydzdh;
    @Column(name = "ZYHZH")
    private String zyhzh;
    @Column(name = "HYML")
    private String hyml;
    @Column(name = "HYDL")
    private String hydl;
    @Column(name = "HYLB")
    private String hylb;
    @Column(name = "HUG_ZT")
    private String hugZt;
    @Column(name = "CYRS")
    private String cyrs;
    @Column(name = "SW_F01")
    private String swF01;
    @Column(name = "SW_F02")
    private String swF02;
    @Column(name = "SW_F03")
    private String swF03;
    @Column(name = "SW_F04")
    private String swF04;
    @Column(name = "SW_F05")
    private String swF05;
    @Column(name = "SW_F06")
    private String swF06;
    @Column(name = "SW_F07")
    private String swF07;
    @Column(name = "SW_F071")
    private String swF071;
    @Column(name = "SW_F072")
    private String swF072;
    @Column(name = "SW_F08")
    private String swF08;
    @Column(name = "SW_F10")
    private String swF10;
    @Column(name = "SW_F11")
    private String swF11;
    @Column(name = "SW_F12")
    private String swF12;
    @Column(name = "SW_F13")
    private String swF13;
    @Column(name = "SW_F14")
    private String swF14;
    @Column(name = "SW_F15")
    private String swF15;
    @Column(name = "SW_F16")
    private String swF16;
    @Column(name = "SW_F17")
    private String swF17;
    @Column(name = "SW_F170")
    private String swF170;
    @Column(name = "SW_F18")
    private String swF18;
    @Column(name = "SW_F19")
    private String swF19;
    @Column(name = "SW_F20")
    private String swF20;
    @Column(name = "SW_F21")
    private String swF21;
    @Column(name = "SW_F22")
    private String swF22;
    @Column(name = "SW_F23")
    private String swF23;
    @Column(name = "SW_F24")
    private String swF24;
    @Column(name = "SW_F240")
    private String swF240;
    @Column(name = "SW_F27")
    private String swF27;
    @Column(name = "SW_F33")
    private String swF33;
    @Column(name = "SW_F88")
    private String swF88;
    @Column(name = "SW_F90")
    private String swF90;
    @Column(name = "SW_F110")
    private String swF110;
    @Column(name = "SW_F111")
    private String swF111;
    @Column(name = "SW_F112")
    private String swF112;
    @Column(name = "SW_F19r")
    private String swF19r;
    @Column(name = "SW_F20r")
    private String swF20r;
    @Column(name = "sw_f140")
    private String swF140;
    @Column(name = "sw_f141")
    private String swF141;
    @Column(name = "sw_f600")
    private String swF600;
    @Column(name = "sw_f601")
    private String swF601;
    @Column(name = "sw_f602")
    private String swF602;

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

    public String getTjrq() {
        return tjrq;
    }

    public void setTjrq(String tjrq) {
        this.tjrq = tjrq;
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

    public String getHugFl() {
        return hugFl;
    }

    public void setHugFl(String hugFl) {
        this.hugFl = hugFl;
    }

    public String getZhucdz() {
        return zhucdz;
    }

    public void setZhucdz(String zhucdz) {
        this.zhucdz = zhucdz;
    }

    public String getZhucdzOld() {
        return zhucdzOld;
    }

    public void setZhucdzOld(String zhucdzOld) {
        this.zhucdzOld = zhucdzOld;
    }

    public String getZhucdzdh() {
        return zhucdzdh;
    }

    public void setZhucdzdh(String zhucdzdh) {
        this.zhucdzdh = zhucdzdh;
    }

    public String getJydz() {
        return jydz;
    }

    public void setJydz(String jydz) {
        this.jydz = jydz;
    }

    public String getJydzOld() {
        return jydzOld;
    }

    public void setJydzOld(String jydzOld) {
        this.jydzOld = jydzOld;
    }

    public String getJydzdh() {
        return jydzdh;
    }

    public void setJydzdh(String jydzdh) {
        this.jydzdh = jydzdh;
    }

    public String getZyhzh() {
        return zyhzh;
    }

    public void setZyhzh(String zyhzh) {
        this.zyhzh = zyhzh;
    }

    public String getHyml() {
        return hyml;
    }

    public void setHyml(String hyml) {
        this.hyml = hyml;
    }

    public String getHydl() {
        return hydl;
    }

    public void setHydl(String hydl) {
        this.hydl = hydl;
    }

    public String getHylb() {
        return hylb;
    }

    public void setHylb(String hylb) {
        this.hylb = hylb;
    }

    public String getHugZt() {
        return hugZt;
    }

    public void setHugZt(String hugZt) {
        this.hugZt = hugZt;
    }

    public String getCyrs() {
        return cyrs;
    }

    public void setCyrs(String cyrs) {
        this.cyrs = cyrs;
    }

    public String getSwF01() {
        return swF01;
    }

    public void setSwF01(String swF01) {
        this.swF01 = swF01;
    }

    public String getSwF02() {
        return swF02;
    }

    public void setSwF02(String swF02) {
        this.swF02 = swF02;
    }

    public String getSwF03() {
        return swF03;
    }

    public void setSwF03(String swF03) {
        this.swF03 = swF03;
    }

    public String getSwF04() {
        return swF04;
    }

    public void setSwF04(String swF04) {
        this.swF04 = swF04;
    }

    public String getSwF05() {
        return swF05;
    }

    public void setSwF05(String swF05) {
        this.swF05 = swF05;
    }

    public String getSwF06() {
        return swF06;
    }

    public void setSwF06(String swF06) {
        this.swF06 = swF06;
    }

    public String getSwF07() {
        return swF07;
    }

    public void setSwF07(String swF07) {
        this.swF07 = swF07;
    }

    public String getSwF071() {
        return swF071;
    }

    public void setSwF071(String swF071) {
        this.swF071 = swF071;
    }

    public String getSwF072() {
        return swF072;
    }

    public void setSwF072(String swF072) {
        this.swF072 = swF072;
    }

    public String getSwF08() {
        return swF08;
    }

    public void setSwF08(String swF08) {
        this.swF08 = swF08;
    }

    public String getSwF10() {
        return swF10;
    }

    public void setSwF10(String swF10) {
        this.swF10 = swF10;
    }

    public String getSwF11() {
        return swF11;
    }

    public void setSwF11(String swF11) {
        this.swF11 = swF11;
    }

    public String getSwF12() {
        return swF12;
    }

    public void setSwF12(String swF12) {
        this.swF12 = swF12;
    }

    public String getSwF13() {
        return swF13;
    }

    public void setSwF13(String swF13) {
        this.swF13 = swF13;
    }

    public String getSwF14() {
        return swF14;
    }

    public void setSwF14(String swF14) {
        this.swF14 = swF14;
    }

    public String getSwF15() {
        return swF15;
    }

    public void setSwF15(String swF15) {
        this.swF15 = swF15;
    }

    public String getSwF16() {
        return swF16;
    }

    public void setSwF16(String swF16) {
        this.swF16 = swF16;
    }

    public String getSwF17() {
        return swF17;
    }

    public void setSwF17(String swF17) {
        this.swF17 = swF17;
    }

    public String getSwF170() {
        return swF170;
    }

    public void setSwF170(String swF170) {
        this.swF170 = swF170;
    }

    public String getSwF18() {
        return swF18;
    }

    public void setSwF18(String swF18) {
        this.swF18 = swF18;
    }

    public String getSwF19() {
        return swF19;
    }

    public void setSwF19(String swF19) {
        this.swF19 = swF19;
    }

    public String getSwF20() {
        return swF20;
    }

    public void setSwF20(String swF20) {
        this.swF20 = swF20;
    }

    public String getSwF21() {
        return swF21;
    }

    public void setSwF21(String swF21) {
        this.swF21 = swF21;
    }

    public String getSwF22() {
        return swF22;
    }

    public void setSwF22(String swF22) {
        this.swF22 = swF22;
    }

    public String getSwF23() {
        return swF23;
    }

    public void setSwF23(String swF23) {
        this.swF23 = swF23;
    }

    public String getSwF24() {
        return swF24;
    }

    public void setSwF24(String swF24) {
        this.swF24 = swF24;
    }

    public String getSwF240() {
        return swF240;
    }

    public void setSwF240(String swF240) {
        this.swF240 = swF240;
    }

    public String getSwF27() {
        return swF27;
    }

    public void setSwF27(String swF27) {
        this.swF27 = swF27;
    }

    public String getSwF33() {
        return swF33;
    }

    public void setSwF33(String swF33) {
        this.swF33 = swF33;
    }

    public String getSwF88() {
        return swF88;
    }

    public void setSwF88(String swF88) {
        this.swF88 = swF88;
    }

    public String getSwF90() {
        return swF90;
    }

    public void setSwF90(String swF90) {
        this.swF90 = swF90;
    }

    public String getSwF110() {
        return swF110;
    }

    public void setSwF110(String swF110) {
        this.swF110 = swF110;
    }

    public String getSwF111() {
        return swF111;
    }

    public void setSwF111(String swF111) {
        this.swF111 = swF111;
    }

    public String getSwF112() {
        return swF112;
    }

    public void setSwF112(String swF112) {
        this.swF112 = swF112;
    }

    public String getSwF19r() {
        return swF19r;
    }

    public void setSwF19r(String swF19r) {
        this.swF19r = swF19r;
    }

    public String getSwF20r() {
        return swF20r;
    }

    public void setSwF20r(String swF20r) {
        this.swF20r = swF20r;
    }

    public String getSwF140() {
        return swF140;
    }

    public void setSwF140(String swF140) {
        this.swF140 = swF140;
    }

    public String getSwF141() {
        return swF141;
    }

    public void setSwF141(String swF141) {
        this.swF141 = swF141;
    }

    public String getSwF600() {
        return swF600;
    }

    public void setSwF600(String swF600) {
        this.swF600 = swF600;
    }

    public String getSwF601() {
        return swF601;
    }

    public void setSwF601(String swF601) {
        this.swF601 = swF601;
    }

    public String getSwF602() {
        return swF602;
    }

    public void setSwF602(String swF602) {
        this.swF602 = swF602;
    }
}
