package com.example.test2.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 企业跟进记录(EnterpriseFollowRecord)实体类
 *  主键 private Integer id;
    private Integer userId;
    待办ID 关联 enterprise_handle_info
 *  private Integer handleId;
    private Integer taskId;
    企业主键 private Integer enterpriseId;
    是否二次跟进  0 否  1 是 private String isSecondFollow;
    二次跟进时间   yyyy-MM-dd private String secondFollowTime;
    更新时间 private Date updateTime;

 * @author makejava
 * @since 2023-04-17 09:40:44
 */
public class EnterpriseFollowRecord implements Serializable {
    private static final long serialVersionUID = 718738006186627236L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 待办ID 关联enterprise_handle_info
     */
    private Integer handleId;
    /**
     * 任务ID
     */
    private Integer taskId;
    /**
     * 企业主键
     */
    private Integer enterpriseId;
    /**
     * 服务类型 数据字典 followServiceType
     */
    private String serviceType;
    /**
     * 电话拨打情况 数据字典 followPhoneSituation
     */
    private String phoneSituation;
    /**
     * 营销类型 数据字典 followMarketType
     */
    private String marketType;
    /**
     * 咨询类型 数据字典 followConsultType
     */
    private String consultType;
    /**
     * 保函类型 数据字典 followGuaranteeType
     */
    private String guaranteeType;
    /**
     * 用户问题
     */
    private String userQua;
    /**
     * 处理结果 数据字典 followProcessResult
     */
    private String processResult;
    /**
     * 是否成交 0 否 1 是
     */
    private String isDeal;
    /**
     * 通知类型 数据字典 followNoticeType
     */
    private String noticeType;
    /**
     * 通知方式 数据字典 followNoticeType
     */
    private String noticeWay;
    /**
     * 回访类型 数据字典 followReturnVisitType
     */
    private String returnVisitType;
    /**
     * 用户回复情况 数据字典 followUserReply
     */
    private String userReply;
    /**
     * 审核类型
     */
    private String auditType;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 图片路径
     */
    private String pictureUrl;
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 沟通情况(问题描述)
     */
    private String communicateSituetion;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建用户
     */
    private String createPerson;
    /**
     * 用户购买意向  数据字典 userFeedback
     */
    private String userFeedback;
    /**
     * 无购买意向原因  数据字典  noIntentionBuy
     */
    private String noIntentionBuy;
    /**
     * 是否二次跟进  0 否  1 是
     */
    private String isSecondFollow;
    /**
     * 二次跟进时间   yyyy-MM-dd
     */
    private String secondFollowTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新人
     */
    private String updatePerson;
    /**
     * 跟进来源  服务渠道 数据字典 followSource
     */
    private String followSource;
    /**
     * 服务对象 1企业 2金融机构 3个人
     */
    private String serviceObj;
    /**
     * 参投区域，服务区域
     */
    private String responsibleRegion;
    /**
     * 是否添加QQ 0否 1是
     */
    private String isAddQq;
    /**
     * 是否添加WX  0否 1是
     */
    private String isAddWx;
    /**
     * 解决方案
     */
    private String solution;
    /**
     * 备注
     */
    private String remark;
    /**
     * 金融机构
     */
    private String channelsPartners;
    /**
     * 触达方式 数据字典 followTouchMode
     */
    private String touchMode;
    /**
     * 服务类型描述
     */
    private String serviceTypeDescribe;
    /**
     * 无意向购买原因描述
     */
    private String noIntentionBuyDescribe;
    /**
     * 用户购买意向描述
     */
    private String userFeedbackDescribe;
    /**
     * 沟通方式 数据字典 followCommunicateMode
     */
    private String communicateMode;
    /**
     * 部门类型 1 网销 2 运营
     */
    private String deptType;
    /**
     * 部门ID
     */
    private Long deptId;
    /**
     * 是否接通 0 否 1 是
     */
    private String isCall;
    /**
     * 是否加入社群 0 否 1 是
     */
    private String isAddGroup;
    /**
     * 外呼渠道 0 线上 1 线下
     */
    private Integer callType;
    /**
     * 拒绝的原因 数据字典 followRejectReason
     */
    private String rejectReason;
    /**
     * 是否意向添加WX  0否 1是
     */
    private Integer isWantAddWx;
    /**
     * 竞品提取
     */
    private String competitionExtraction;
    /**
     * 点数 10.5%
     */
    private Double point;
    /**
     * 是否任务最新跟进 0 否 1是
     */
    private String isLatest;
    /**
     * 产品业务线 数据字典 productBusinessLine
     */
    private String productBusinessLine;
    /**
     * 问题分类 数据字典 followServiceType
     */
    private String questionClassify;
    /**
     * 联系电话
     */
    private String contactNumber;
    /**
     * 微信号
     */
    private String wxNumber;
    /**
     * 外呼结果 数据字典callResultType
     */
    private String callResult;
    /**
     * 服务区域(市)
     */
    private String responsibleRegionCity;
    /**
     * 是否加微信/QQ (1是、0否)
     */
    private String isAddQv;
    /**
     * 咨询来源
     */
    private String consultResource;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHandleId() {
        return handleId;
    }

    public void setHandleId(Integer handleId) {
        this.handleId = handleId;
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPhoneSituation() {
        return phoneSituation;
    }

    public void setPhoneSituation(String phoneSituation) {
        this.phoneSituation = phoneSituation;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getConsultType() {
        return consultType;
    }

    public void setConsultType(String consultType) {
        this.consultType = consultType;
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public String getUserQua() {
        return userQua;
    }

    public void setUserQua(String userQua) {
        this.userQua = userQua;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }

    public String getIsDeal() {
        return isDeal;
    }

    public void setIsDeal(String isDeal) {
        this.isDeal = isDeal;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public String getNoticeWay() {
        return noticeWay;
    }

    public void setNoticeWay(String noticeWay) {
        this.noticeWay = noticeWay;
    }

    public String getReturnVisitType() {
        return returnVisitType;
    }

    public void setReturnVisitType(String returnVisitType) {
        this.returnVisitType = returnVisitType;
    }

    public String getUserReply() {
        return userReply;
    }

    public void setUserReply(String userReply) {
        this.userReply = userReply;
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getCommunicateSituetion() {
        return communicateSituetion;
    }

    public void setCommunicateSituetion(String communicateSituetion) {
        this.communicateSituetion = communicateSituetion;
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

    public String getUserFeedback() {
        return userFeedback;
    }

    public void setUserFeedback(String userFeedback) {
        this.userFeedback = userFeedback;
    }

    public String getNoIntentionBuy() {
        return noIntentionBuy;
    }

    public void setNoIntentionBuy(String noIntentionBuy) {
        this.noIntentionBuy = noIntentionBuy;
    }

    public String getIsSecondFollow() {
        return isSecondFollow;
    }

    public void setIsSecondFollow(String isSecondFollow) {
        this.isSecondFollow = isSecondFollow;
    }

    public String getSecondFollowTime() {
        return secondFollowTime;
    }

    public void setSecondFollowTime(String secondFollowTime) {
        this.secondFollowTime = secondFollowTime;
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

    public String getFollowSource() {
        return followSource;
    }

    public void setFollowSource(String followSource) {
        this.followSource = followSource;
    }

    public String getServiceObj() {
        return serviceObj;
    }

    public void setServiceObj(String serviceObj) {
        this.serviceObj = serviceObj;
    }

    public String getResponsibleRegion() {
        return responsibleRegion;
    }

    public void setResponsibleRegion(String responsibleRegion) {
        this.responsibleRegion = responsibleRegion;
    }

    public String getIsAddQq() {
        return isAddQq;
    }

    public void setIsAddQq(String isAddQq) {
        this.isAddQq = isAddQq;
    }

    public String getIsAddWx() {
        return isAddWx;
    }

    public void setIsAddWx(String isAddWx) {
        this.isAddWx = isAddWx;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getChannelsPartners() {
        return channelsPartners;
    }

    public void setChannelsPartners(String channelsPartners) {
        this.channelsPartners = channelsPartners;
    }

    public String getTouchMode() {
        return touchMode;
    }

    public void setTouchMode(String touchMode) {
        this.touchMode = touchMode;
    }

    public String getServiceTypeDescribe() {
        return serviceTypeDescribe;
    }

    public void setServiceTypeDescribe(String serviceTypeDescribe) {
        this.serviceTypeDescribe = serviceTypeDescribe;
    }

    public String getNoIntentionBuyDescribe() {
        return noIntentionBuyDescribe;
    }

    public void setNoIntentionBuyDescribe(String noIntentionBuyDescribe) {
        this.noIntentionBuyDescribe = noIntentionBuyDescribe;
    }

    public String getUserFeedbackDescribe() {
        return userFeedbackDescribe;
    }

    public void setUserFeedbackDescribe(String userFeedbackDescribe) {
        this.userFeedbackDescribe = userFeedbackDescribe;
    }

    public String getCommunicateMode() {
        return communicateMode;
    }

    public void setCommunicateMode(String communicateMode) {
        this.communicateMode = communicateMode;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getIsCall() {
        return isCall;
    }

    public void setIsCall(String isCall) {
        this.isCall = isCall;
    }

    public String getIsAddGroup() {
        return isAddGroup;
    }

    public void setIsAddGroup(String isAddGroup) {
        this.isAddGroup = isAddGroup;
    }

    public Integer getCallType() {
        return callType;
    }

    public void setCallType(Integer callType) {
        this.callType = callType;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public Integer getIsWantAddWx() {
        return isWantAddWx;
    }

    public void setIsWantAddWx(Integer isWantAddWx) {
        this.isWantAddWx = isWantAddWx;
    }

    public String getCompetitionExtraction() {
        return competitionExtraction;
    }

    public void setCompetitionExtraction(String competitionExtraction) {
        this.competitionExtraction = competitionExtraction;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public String getIsLatest() {
        return isLatest;
    }

    public void setIsLatest(String isLatest) {
        this.isLatest = isLatest;
    }

    public String getProductBusinessLine() {
        return productBusinessLine;
    }

    public void setProductBusinessLine(String productBusinessLine) {
        this.productBusinessLine = productBusinessLine;
    }

    public String getQuestionClassify() {
        return questionClassify;
    }

    public void setQuestionClassify(String questionClassify) {
        this.questionClassify = questionClassify;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getWxNumber() {
        return wxNumber;
    }

    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    public String getCallResult() {
        return callResult;
    }

    public void setCallResult(String callResult) {
        this.callResult = callResult;
    }

    public String getResponsibleRegionCity() {
        return responsibleRegionCity;
    }

    public void setResponsibleRegionCity(String responsibleRegionCity) {
        this.responsibleRegionCity = responsibleRegionCity;
    }

    public String getIsAddQv() {
        return isAddQv;
    }

    public void setIsAddQv(String isAddQv) {
        this.isAddQv = isAddQv;
    }

    public String getConsultResource() {
        return consultResource;
    }

    public void setConsultResource(String consultResource) {
        this.consultResource = consultResource;
    }

}

