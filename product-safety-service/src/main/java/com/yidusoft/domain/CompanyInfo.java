package com.yidusoft.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "company_info")
public class CompanyInfo {
    @Id
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 组织机构代码
     */
    private String oibc;

    /**
     * 企业名称
     */
    private String name;

    /**
     * 企业负责人
     */
    private String principal;

    /**
     * 企业法定代表人
     */
    private String legal;

    /**
     * 企业法定代表人身份证号
     */
    @Column(name = "legal_id_number")
    private String legalIdNumber;

    /**
     * 注册资本
     */
    @Column(name = "sign_capital")
    private String signCapital;

    /**
     * 营业执照注册号
     */
    @Column(name = "license_number")
    private String licenseNumber;

    /**
     * 企业类型
     */
    private String type;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮件
     */
    private String email;

    /**
     * 传真
     */
    private String fax;

    /**
     * 邮政编码
     */
    private String postalcode;

    /**
     * 地址
     */
    private String address;

    /**
     * 企业成立时间
     */
    @Column(name = "found_time")
    private String foundTime;

    private Integer deleted;

    /**
     * 记录创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return company_id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取组织机构代码
     *
     * @return oibc - 组织机构代码
     */
    public String getOibc() {
        return oibc;
    }

    /**
     * 设置组织机构代码
     *
     * @param oibc 组织机构代码
     */
    public void setOibc(String oibc) {
        this.oibc = oibc;
    }

    /**
     * 获取企业名称
     *
     * @return name - 企业名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置企业名称
     *
     * @param name 企业名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取企业负责人
     *
     * @return principal - 企业负责人
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * 设置企业负责人
     *
     * @param principal 企业负责人
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * 获取企业法定代表人
     *
     * @return legal - 企业法定代表人
     */
    public String getLegal() {
        return legal;
    }

    /**
     * 设置企业法定代表人
     *
     * @param legal 企业法定代表人
     */
    public void setLegal(String legal) {
        this.legal = legal;
    }

    /**
     * 获取企业法定代表人身份证号
     *
     * @return legal_id_number - 企业法定代表人身份证号
     */
    public String getLegalIdNumber() {
        return legalIdNumber;
    }

    /**
     * 设置企业法定代表人身份证号
     *
     * @param legalIdNumber 企业法定代表人身份证号
     */
    public void setLegalIdNumber(String legalIdNumber) {
        this.legalIdNumber = legalIdNumber;
    }

    /**
     * 获取注册资本
     *
     * @return sign_capital - 注册资本
     */
    public String getSignCapital() {
        return signCapital;
    }

    /**
     * 设置注册资本
     *
     * @param signCapital 注册资本
     */
    public void setSignCapital(String signCapital) {
        this.signCapital = signCapital;
    }

    /**
     * 获取营业执照注册号
     *
     * @return license_number - 营业执照注册号
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * 设置营业执照注册号
     *
     * @param licenseNumber 营业执照注册号
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * 获取企业类型
     *
     * @return type - 企业类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置企业类型
     *
     * @param type 企业类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取邮件
     *
     * @return email - 邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮件
     *
     * @param email 邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取传真
     *
     * @return fax - 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置传真
     *
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 获取邮政编码
     *
     * @return postalcode - 邮政编码
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * 设置邮政编码
     *
     * @param postalcode 邮政编码
     */
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取企业成立时间
     *
     * @return found_time - 企业成立时间
     */
    public String getFoundTime() {
        return foundTime;
    }

    /**
     * 设置企业成立时间
     *
     * @param foundTime 企业成立时间
     */
    public void setFoundTime(String foundTime) {
        this.foundTime = foundTime;
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
     * 获取记录创建时间
     *
     * @return create_time - 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间
     *
     * @param createTime 记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}