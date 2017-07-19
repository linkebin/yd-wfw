package com.yidusoft.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "quality_test")
public class QualityTest {
    /**
     * 产品质量检测
     */
    @Id
    @Column(name = "quality_test_id")
    private String qualityTestId;

    /**
     * 检测项
     */
    @Column(name = "test_item")
    private String testItem;

    /**
     * 说明
     */
    private String explains;

    /**
     * 检测时间
     */
    @Column(name = "detection_time")
    private String detectionTime;

    /**
     * 检测机构
     */
    @Column(name = "detetion_auth")
    private String detetionAuth;

    /**
     * 标准
     */
    private String standard;

    /**
     * 结果
     */
    private String results;

    @Column(name = "create_time")
    private String createTime;

    private Integer deleted;

    /**
     * 产品ID
     */
    @Column(name = "product_id")
    private String productId;

    private String  name;
    /**
     * 获取产品质量检测
     *
     * @return quality_test_id - 产品质量检测
     */
    public String getQualityTestId() {
        return qualityTestId;
    }

    /**
     * 设置产品质量检测
     *
     * @param qualityTestId 产品质量检测
     */
    public void setQualityTestId(String qualityTestId) {
        this.qualityTestId = qualityTestId;
    }

    /**
     * 获取检测项
     *
     * @return test_item - 检测项
     */
    public String getTestItem() {
        return testItem;
    }

    /**
     * 设置检测项
     *
     * @param testItem 检测项
     */
    public void setTestItem(String testItem) {
        this.testItem = testItem;
    }

    /**
     * 获取说明
     *
     * @return explains - 说明
     */
    public String getExplains() {
        return explains;
    }

    /**
     * 设置说明
     *
     * @param explains 说明
     */
    public void setExplains(String explains) {
        this.explains = explains;
    }

    /**
     * 获取检测时间
     *
     * @return detection_time - 检测时间
     */
    public String getDetectionTime() {
        return detectionTime;
    }

    /**
     * 设置检测时间
     *
     * @param detectionTime 检测时间
     */
    public void setDetectionTime(String detectionTime) {
        this.detectionTime = detectionTime;
    }

    /**
     * 获取检测机构
     *
     * @return detetion_auth - 检测机构
     */
    public String getDetetionAuth() {
        return detetionAuth;
    }

    /**
     * 设置检测机构
     *
     * @param detetionAuth 检测机构
     */
    public void setDetetionAuth(String detetionAuth) {
        this.detetionAuth = detetionAuth;
    }

    /**
     * 获取标准
     *
     * @return standard - 标准
     */
    public String getStandard() {
        return standard;
    }

    /**
     * 设置标准
     *
     * @param standard 标准
     */
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /**
     * 获取结果
     *
     * @return results - 结果
     */
    public String getResults() {
        return results;
    }

    /**
     * 设置结果
     *
     * @param results 结果
     */
    public void setResults(String results) {
        this.results = results;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return deleted
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取产品ID
     *
     * @return product_id - 产品ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品ID
     *
     * @param productId 产品ID
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String  name) { this.name=name; }
}