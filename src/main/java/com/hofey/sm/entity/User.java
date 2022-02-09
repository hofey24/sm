package com.hofey.sm.entity;

import java.sql.Timestamp;

/**
 * @Author: hofey
 * @Date: 2022/2/8 17:37
 * @Description:
 */
public class User {
    private Integer id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String moduleCode;
    private String authId;
    private String mobile;
    private String name;
    private Integer status;
    private String password;
    private String nickName;
    private String headUrl;
    private Integer sex;
    private String wechatNum;
    private String unionid;
    private String channelCode;
    private String oldSaleid;

    /**
     * DTC、普通用户区别
     **/
    private Integer userType;
    private String brandCode;
    private String brandName;
    private Integer level;

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getWechatNum() {
        return wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getOldSaleid() {
        return oldSaleid;
    }

    public void setOldSaleid(String oldSaleid) {
        this.oldSaleid = oldSaleid;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", moduleCode='" + moduleCode + '\'' +
                ", authId='" + authId + '\'' +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", headUrl='" + headUrl + '\'' +
                ", sex=" + sex +
                ", wechatNum='" + wechatNum + '\'' +
                ", unionid='" + unionid + '\'' +
                ", channelCode='" + channelCode + '\'' +
                ", oldSaleid='" + oldSaleid + '\'' +
                ", userType=" + userType +
                ", brandCode='" + brandCode + '\'' +
                ", brandName='" + brandName + '\'' +
                ", level=" + level +
                '}';
    }
}
