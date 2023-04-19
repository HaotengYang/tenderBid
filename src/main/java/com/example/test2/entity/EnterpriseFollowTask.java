package com.example.test2.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 企业跟进任务(EnterpriseFollowTask)实体类
 * 主键 private Integer id;
   任务名称 private String taskName;
   private String taskType;
   private Date endTime;
  创建时间 private Date createTime;

 * @author makejava
 * @since 2023-04-17 09:40:42
 */
public class EnterpriseFollowTask implements Serializable {
    private static final long serialVersionUID = -18274605106743550L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务类型
     */
    private String taskType;
    /**
     * 任务截止时间
     */
    private Date endTime;
    /**
     * 交易中心
     */
    private String tradeCenter;
    /**
     * 项目名称
     */
    private String prjName;
    /**
     * 渠道商
     */
    private String channelsPartners;
    /**
     * 保函类型
     */
    private String guaranteeType;
    /**
     * 优先级
     */
    private String priority;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建用户
     */
    private String createPerson;
    /**
     * 指导话术
     */
    private String guideLanguage;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTradeCenter() {
        return tradeCenter;
    }

    public void setTradeCenter(String tradeCenter) {
        this.tradeCenter = tradeCenter;
    }

    public String getPrjName() {
        return prjName;
    }

    public void setPrjName(String prjName) {
        this.prjName = prjName;
    }

    public String getChannelsPartners() {
        return channelsPartners;
    }

    public void setChannelsPartners(String channelsPartners) {
        this.channelsPartners = channelsPartners;
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
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

    public String getGuideLanguage() {
        return guideLanguage;
    }

    public void setGuideLanguage(String guideLanguage) {
        this.guideLanguage = guideLanguage;
    }

}

