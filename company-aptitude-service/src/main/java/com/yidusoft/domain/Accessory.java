package com.yidusoft.domain;

/**
 * Created by Administrator on 2017/7/5.
 */
public class Accessory {

    private Long AccessoryId;

    private String explains;
    private String urlDown;
    private Integer deleted;
    private String createTime;

    @Override
    public String toString() {
        return "Accessory{" +
                "AccessoryId=" + AccessoryId +
                ", explains='" + explains + '\'' +
                ", urlDown='" + urlDown + '\'' +
                ", deleted=" + deleted +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Long getAccessoryId() {
        return AccessoryId;
    }

    public void setAccessoryId(Long accessoryId) {
        AccessoryId = accessoryId;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public String getUrlDown() {
        return urlDown;
    }

    public void setUrlDown(String urlDown) {
        this.urlDown = urlDown;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
