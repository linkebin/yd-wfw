package com.yidusoft.domain;

import java.util.Date;
import javax.persistence.*;

public class Product {
    /**
     * 企业产品表
     */
    @Id
    @Column(name = "product_id")
    private String productId;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 产品编号
     */
    private String number;

    /**
     * 规格型号
     */
    private String sam;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    private Integer deleted;

    /**
     * 企业组织机构代码
     */
    @Column(name = "company_oibc")
    private String companyOibc;

    /**
     * 产品介绍
     */
    private String introduce;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取产品名称
     *
     * @return name - 产品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置产品名称
     *
     * @param name 产品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取产品编号
     *
     * @return number - 产品编号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置产品编号
     *
     * @param number 产品编号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取规格型号
     *
     * @return sam - 规格型号
     */
    public String getSam() {
        return sam;
    }

    /**
     * 设置规格型号
     *
     * @param sam 规格型号
     */
    public void setSam(String sam) {
        this.sam = sam;
    }

    public String getCreateTime() {
        return createTime;
    }

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
     * 获取企业组织机构代码
     *
     * @return company_oibc - 企业组织机构代码
     */
    public String getCompanyOibc() {
        return companyOibc;
    }

    /**
     * 设置企业组织机构代码
     *
     * @param companyOibc 企业组织机构代码
     */
    public void setCompanyOibc(String companyOibc) {
        this.companyOibc = companyOibc;
    }

    /**
     * 获取产品介绍
     *
     * @return introduce - 产品介绍
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 设置产品介绍
     *
     * @param introduce 产品介绍
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}