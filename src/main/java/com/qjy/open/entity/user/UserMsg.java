package com.qjy.open.entity.user;

import java.io.Serializable;
import java.util.Date;

import com.qjy.open.entity.common.BaseVo;

public class UserMsg extends BaseVo  implements Serializable {
    private static final long serialVersionUID = -3843268623678956582L;

	private Integer id;

    private Integer salesmanid;

    private Date businessLife;

    private String lastjob;

    private String duty;

    private String idCard;

    private String certificateNum;

    private String exhibitionCard;

    private String licenseCard;

    private String personalProfile;

    private Double hxScore;

    private String extension400;

    private Date overdue;

    private String status400;

    private Integer surplus400;

    private String mdrt;

    private String ljxsbe;

    private String nxsbe;

    private String tsjl;

    private String shotmsg400;

    private Double xbl;

    private Integer sndkhs;

    private Integer ljkhs;

    private Date recordtime;

    private String qq;

    private String ida;

    private Integer busylife;

    private String snzjyj;

    private Integer clickrate;

    private String constellation;

    private String source;

    private String serviceNum;

    private String certificateNumUrl1;

    private String certificateNumUrl2;

    private String exhibitionCardUrl1;

    private String exhibitionCardUrl2;

    private String certificationUrl;

    private String hobby;

    private String speciality;

    private String idCardUrl1;

    private String ageIsPublish;

    private String weixin;

    private String weibo;

    private String boke;

    private Date regTime;

    private Date paymentTime;

    private Date startTime;

    private Date overTime;

    private Date certificateNumTime;

    private Date exhibitionCardTime;

    private String partnercode;

    private String awards;

    private String servicepack;

    private String picifvalid;

    private String weimendian;

    private String weimendianName;

    private String weimendianCompany;

    private String weimendianAddress;

    private String weimendianStyle;

    private String weimendianServicepack;

    private Date weimendianStart;

    private String wechatAccount;

    private String buscardStyle;

    private String auth;

    private String weimendianStyleBig;

    private String wechatImgPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalesmanid() {
        return salesmanid;
    }

    public void setSalesmanid(Integer salesmanid) {
        this.salesmanid = salesmanid;
    }

    public Date getBusinessLife() {
        return businessLife;
    }

    public void setBusinessLife(Date businessLife) {
        this.businessLife = businessLife;
    }

    public String getLastjob() {
        return lastjob;
    }

    public void setLastjob(String lastjob) {
        this.lastjob = lastjob == null ? null : lastjob.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum == null ? null : certificateNum.trim();
    }

    public String getExhibitionCard() {
        return exhibitionCard;
    }

    public void setExhibitionCard(String exhibitionCard) {
        this.exhibitionCard = exhibitionCard == null ? null : exhibitionCard.trim();
    }

    public String getLicenseCard() {
        return licenseCard;
    }

    public void setLicenseCard(String licenseCard) {
        this.licenseCard = licenseCard == null ? null : licenseCard.trim();
    }

    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile == null ? null : personalProfile.trim();
    }

    public Double getHxScore() {
        return hxScore;
    }

    public void setHxScore(Double hxScore) {
        this.hxScore = hxScore;
    }

    public String getExtension400() {
        return extension400;
    }

    public void setExtension400(String extension400) {
        this.extension400 = extension400 == null ? null : extension400.trim();
    }

    public Date getOverdue() {
        return overdue;
    }

    public void setOverdue(Date overdue) {
        this.overdue = overdue;
    }

    public String getStatus400() {
        return status400;
    }

    public void setStatus400(String status400) {
        this.status400 = status400 == null ? null : status400.trim();
    }

    public Integer getSurplus400() {
        return surplus400;
    }

    public void setSurplus400(Integer surplus400) {
        this.surplus400 = surplus400;
    }

    public String getMdrt() {
        return mdrt;
    }

    public void setMdrt(String mdrt) {
        this.mdrt = mdrt == null ? null : mdrt.trim();
    }

    public String getLjxsbe() {
        return ljxsbe;
    }

    public void setLjxsbe(String ljxsbe) {
        this.ljxsbe = ljxsbe == null ? null : ljxsbe.trim();
    }

    public String getNxsbe() {
        return nxsbe;
    }

    public void setNxsbe(String nxsbe) {
        this.nxsbe = nxsbe == null ? null : nxsbe.trim();
    }

    public String getTsjl() {
        return tsjl;
    }

    public void setTsjl(String tsjl) {
        this.tsjl = tsjl == null ? null : tsjl.trim();
    }

    public String getShotmsg400() {
        return shotmsg400;
    }

    public void setShotmsg400(String shotmsg400) {
        this.shotmsg400 = shotmsg400 == null ? null : shotmsg400.trim();
    }

    public Double getXbl() {
        return xbl;
    }

    public void setXbl(Double xbl) {
        this.xbl = xbl;
    }

    public Integer getSndkhs() {
        return sndkhs;
    }

    public void setSndkhs(Integer sndkhs) {
        this.sndkhs = sndkhs;
    }

    public Integer getLjkhs() {
        return ljkhs;
    }

    public void setLjkhs(Integer ljkhs) {
        this.ljkhs = ljkhs;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getIda() {
        return ida;
    }

    public void setIda(String ida) {
        this.ida = ida == null ? null : ida.trim();
    }

    public Integer getBusylife() {
        return busylife;
    }

    public void setBusylife(Integer busylife) {
        this.busylife = busylife;
    }

    public String getSnzjyj() {
        return snzjyj;
    }

    public void setSnzjyj(String snzjyj) {
        this.snzjyj = snzjyj == null ? null : snzjyj.trim();
    }

    public Integer getClickrate() {
        return clickrate;
    }

    public void setClickrate(Integer clickrate) {
        this.clickrate = clickrate;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(String serviceNum) {
        this.serviceNum = serviceNum == null ? null : serviceNum.trim();
    }

    public String getCertificateNumUrl1() {
        return certificateNumUrl1;
    }

    public void setCertificateNumUrl1(String certificateNumUrl1) {
        this.certificateNumUrl1 = certificateNumUrl1 == null ? null : certificateNumUrl1.trim();
    }

    public String getCertificateNumUrl2() {
        return certificateNumUrl2;
    }

    public void setCertificateNumUrl2(String certificateNumUrl2) {
        this.certificateNumUrl2 = certificateNumUrl2 == null ? null : certificateNumUrl2.trim();
    }

    public String getExhibitionCardUrl1() {
        return exhibitionCardUrl1;
    }

    public void setExhibitionCardUrl1(String exhibitionCardUrl1) {
        this.exhibitionCardUrl1 = exhibitionCardUrl1 == null ? null : exhibitionCardUrl1.trim();
    }

    public String getExhibitionCardUrl2() {
        return exhibitionCardUrl2;
    }

    public void setExhibitionCardUrl2(String exhibitionCardUrl2) {
        this.exhibitionCardUrl2 = exhibitionCardUrl2 == null ? null : exhibitionCardUrl2.trim();
    }

    public String getCertificationUrl() {
        return certificationUrl;
    }

    public void setCertificationUrl(String certificationUrl) {
        this.certificationUrl = certificationUrl == null ? null : certificationUrl.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getIdCardUrl1() {
        return idCardUrl1;
    }

    public void setIdCardUrl1(String idCardUrl1) {
        this.idCardUrl1 = idCardUrl1 == null ? null : idCardUrl1.trim();
    }

    public String getAgeIsPublish() {
        return ageIsPublish;
    }

    public void setAgeIsPublish(String ageIsPublish) {
        this.ageIsPublish = ageIsPublish == null ? null : ageIsPublish.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    public String getBoke() {
        return boke;
    }

    public void setBoke(String boke) {
        this.boke = boke == null ? null : boke.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    public Date getCertificateNumTime() {
        return certificateNumTime;
    }

    public void setCertificateNumTime(Date certificateNumTime) {
        this.certificateNumTime = certificateNumTime;
    }

    public Date getExhibitionCardTime() {
        return exhibitionCardTime;
    }

    public void setExhibitionCardTime(Date exhibitionCardTime) {
        this.exhibitionCardTime = exhibitionCardTime;
    }

    public String getPartnercode() {
        return partnercode;
    }

    public void setPartnercode(String partnercode) {
        this.partnercode = partnercode == null ? null : partnercode.trim();
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards == null ? null : awards.trim();
    }

    public String getServicepack() {
        return servicepack;
    }

    public void setServicepack(String servicepack) {
        this.servicepack = servicepack == null ? null : servicepack.trim();
    }

    public String getPicifvalid() {
        return picifvalid;
    }

    public void setPicifvalid(String picifvalid) {
        this.picifvalid = picifvalid == null ? null : picifvalid.trim();
    }

    public String getWeimendian() {
        return weimendian;
    }

    public void setWeimendian(String weimendian) {
        this.weimendian = weimendian == null ? null : weimendian.trim();
    }

    public String getWeimendianName() {
        return weimendianName;
    }

    public void setWeimendianName(String weimendianName) {
        this.weimendianName = weimendianName == null ? null : weimendianName.trim();
    }

    public String getWeimendianCompany() {
        return weimendianCompany;
    }

    public void setWeimendianCompany(String weimendianCompany) {
        this.weimendianCompany = weimendianCompany == null ? null : weimendianCompany.trim();
    }

    public String getWeimendianAddress() {
        return weimendianAddress;
    }

    public void setWeimendianAddress(String weimendianAddress) {
        this.weimendianAddress = weimendianAddress == null ? null : weimendianAddress.trim();
    }

    public String getWeimendianStyle() {
        return weimendianStyle;
    }

    public void setWeimendianStyle(String weimendianStyle) {
        this.weimendianStyle = weimendianStyle == null ? null : weimendianStyle.trim();
    }

    public String getWeimendianServicepack() {
        return weimendianServicepack;
    }

    public void setWeimendianServicepack(String weimendianServicepack) {
        this.weimendianServicepack = weimendianServicepack == null ? null : weimendianServicepack.trim();
    }

    public Date getWeimendianStart() {
        return weimendianStart;
    }

    public void setWeimendianStart(Date weimendianStart) {
        this.weimendianStart = weimendianStart;
    }

    public String getWechatAccount() {
        return wechatAccount;
    }

    public void setWechatAccount(String wechatAccount) {
        this.wechatAccount = wechatAccount == null ? null : wechatAccount.trim();
    }

    public String getBuscardStyle() {
        return buscardStyle;
    }

    public void setBuscardStyle(String buscardStyle) {
        this.buscardStyle = buscardStyle == null ? null : buscardStyle.trim();
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth == null ? null : auth.trim();
    }

    public String getWeimendianStyleBig() {
        return weimendianStyleBig;
    }

    public void setWeimendianStyleBig(String weimendianStyleBig) {
        this.weimendianStyleBig = weimendianStyleBig == null ? null : weimendianStyleBig.trim();
    }

    public String getWechatImgPath() {
        return wechatImgPath;
    }

    public void setWechatImgPath(String wechatImgPath) {
        this.wechatImgPath = wechatImgPath == null ? null : wechatImgPath.trim();
    }
}