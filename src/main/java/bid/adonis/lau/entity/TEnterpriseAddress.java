package bid.adonis.lau.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Description:
 * @author: adonis lau
 * @Eamil: adonis.lau.dev@gmail.com
 * @Date: 2017/9/26 22:43
 */
@Entity
@Table(name = "t_enterprise_address")
public class TEnterpriseAddress {

    @Id
    /**
     * ID
     */
    private String id;
    /**
     * 原始地址
     */
    private String ysdz;
    /**
     * 数据来源
     */
    private String sjly;
    /**
     * 路
     */
    private String road;
    /**
     * 弄
     */
    private String lane;
    /**
     * 楼号
     */
    private String floornum;
    /**
     * 门牌号
     */
    private String doorplate;
    /**
     * 采集时间
     */
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYsdz() {
        return ysdz;
    }

    public void setYsdz(String ysdz) {
        this.ysdz = ysdz;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getFloornum() {
        return floornum;
    }

    public void setFloornum(String floornum) {
        this.floornum = floornum;
    }

    public String getDoorplate() {
        return doorplate;
    }

    public void setDoorplate(String doorplate) {
        this.doorplate = doorplate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
