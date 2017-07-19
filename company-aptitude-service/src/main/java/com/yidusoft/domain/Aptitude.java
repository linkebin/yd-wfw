package com.yidusoft.domain;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/5.
 */
public class Aptitude {

    private Long aptitudeId;

    private String name;
    private String code;
    private String number;
    private String grade;
    private String issueTime;
    private String validityTime;
    private String issuingAuthority;
    private String urlQuery;
    private String explains;
    private String companyName;

    private String companyAddress;
    private String companyLegal;
    private String companyOibc;
    private Integer deleted;
    private String createTime;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getAptitudeId() {
        return aptitudeId;
    }

    public void setAptitudeId(Long aptitudeId) {
        this.aptitudeId = aptitudeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public String getValidityTime() {
        return validityTime;
    }

    public void setValidityTime(String validityTime) {
        this.validityTime = validityTime;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public String getUrlQuery() {
        return urlQuery;
    }

    public void setUrlQuery(String urlQuery) {
        this.urlQuery = urlQuery;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyLegal() {
        return companyLegal;
    }

    public void setCompanyLegal(String companyLegal) {
        this.companyLegal = companyLegal;
    }

    public String getCompanyOibc() {
        return companyOibc;
    }

    public void setCompanyOibc(String companyOibc) {
        this.companyOibc = companyOibc;
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
