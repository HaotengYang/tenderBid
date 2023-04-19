package com.example.test2.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 企业跟进任务关联企业(EnterpriseFollowTaskLink)实体类
 *  主键private Integer id;
 任务主键private Integer taskId;
 企业主键private Integer enterpriseId;
 客服主键private Integer userId;

 * @author makejava
 * @since 2023-04-17 09:40:43
 */
public class EnterpriseFollowTaskLink implements Serializable {
    private static final long serialVersionUID = 245708584308819721L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 任务主键
     */
    private Integer taskId;
    /**
     * 企业主键
     */
    private Integer enterpriseId;
    /**
     * 客服主键
     */
    private Integer userId;
    /**
     * 客服名称
     */
    private String customerName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否营销 0否 1是
     */
    private String isMarket;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建用户
     */
    private String createPerson;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIsMarket() {
        return isMarket;
    }

    public void setIsMarket(String isMarket) {
        this.isMarket = isMarket;
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

}

