package com.example.test2.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 企业经办信息(EnterpriseHandleInfo)实体类
 *主键private Integer id;
   企业主键private Integer enterpriseId;
   用户IDprivate Integer userId;
    经办名称private String handleName;

 * @author makejava
 * @since 2023-04-17 09:40:43
 */
public class EnterpriseHandleInfo implements Serializable {
    private static final long serialVersionUID = -95226720406020244L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 企业主键
     */
    private Integer enterpriseId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 经办名称
     */
    private String handleName;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 负责地区
     */
    private String responsibleRegion;
    /**
     * 经办身份 1 经办 2 管理层
     */
    private String identity;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建用户
     */
    private String createPerson;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新用户
     */
    private String updatePerson;
    /**
     * 联系方式时间
     */
    private Date mobileTime;
    /**
     * 来源
     */
    private String dataSource;
    /**
     * 是否展示 0 否 1 是
     */
    private String isShow;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getResponsibleRegion() {
        return responsibleRegion;
    }

    public void setResponsibleRegion(String responsibleRegion) {
        this.responsibleRegion = responsibleRegion;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Date getMobileTime() {
        return mobileTime;
    }

    public void setMobileTime(Date mobileTime) {
        this.mobileTime = mobileTime;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

}

