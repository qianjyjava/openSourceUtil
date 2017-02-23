package com.qjy.open.entity.user;

import java.io.Serializable;
import java.util.Date;

public class User extends UserMsg implements Serializable {
    private static final long serialVersionUID = 4083562280814635195L;

	private Integer id;

    private String userName;

    private String password;

    private String userGrade;

    private String userHeadUrl;

    private String userBigHeadUrl;

    private String isSalesman;

    private String status;

    private String flowNumber;

    private String flowNumberAncillary;

    private Integer companyId;

    private Integer companyType;

    private String companySimpleName;

    private String provinceCode;

    private String provinceName;

    private String cityCode;

    private String cityName;

    private String email;

    private String mobilePhone;

    private String realName;

    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade == null ? null : userGrade.trim();
    }

    public String getUserHeadUrl() {
        return userHeadUrl;
    }

    public void setUserHeadUrl(String userHeadUrl) {
        this.userHeadUrl = userHeadUrl == null ? null : userHeadUrl.trim();
    }

    public String getUserBigHeadUrl() {
        return userBigHeadUrl;
    }

    public void setUserBigHeadUrl(String userBigHeadUrl) {
        this.userBigHeadUrl = userBigHeadUrl == null ? null : userBigHeadUrl.trim();
    }

    public String getIsSalesman() {
        return isSalesman;
    }

    public void setIsSalesman(String isSalesman) {
        this.isSalesman = isSalesman == null ? null : isSalesman.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getFlowNumber() {
        return flowNumber;
    }

    public void setFlowNumber(String flowNumber) {
        this.flowNumber = flowNumber == null ? null : flowNumber.trim();
    }

    public String getFlowNumberAncillary() {
        return flowNumberAncillary;
    }

    public void setFlowNumberAncillary(String flowNumberAncillary) {
        this.flowNumberAncillary = flowNumberAncillary == null ? null : flowNumberAncillary.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public String getCompanySimpleName() {
        return companySimpleName;
    }

    public void setCompanySimpleName(String companySimpleName) {
        this.companySimpleName = companySimpleName == null ? null : companySimpleName.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}