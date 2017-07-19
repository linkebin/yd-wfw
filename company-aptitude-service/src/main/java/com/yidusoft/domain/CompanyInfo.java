package com.yidusoft.domain;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/5.
 */
public class CompanyInfo {

    private Long companyId;

    private String oibc;
    private String code;
    private String name;
    private String principal;
    private String legal;
    private String legalIdNumber;
    private String signCapital;
    private String licenseNumber;
    private String type;
    private String phone;

    private String email;
    private String fax;
    private String postalcode;
    private String address;
    private String foundTime;
    private Integer deleted;
    private String createTime;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getOibc() {
        return oibc;
    }

    public void setOibc(String oibc) {
        this.oibc = oibc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public String getLegalIdNumber() {
        return legalIdNumber;
    }

    public void setLegalIdNumber(String legalIdNumber) {
        this.legalIdNumber = legalIdNumber;
    }

    public String getSignCapital() {
        return signCapital;
    }

    public void setSignCapital(String signCapital) {
        this.signCapital = signCapital;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoundTime() {
        return foundTime;
    }

    public void setFoundTime(String foundTime) {
        this.foundTime = foundTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

}
