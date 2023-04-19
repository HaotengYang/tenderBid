package com.example.test2.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 企业基本信息(EnterpriseInfo)实体类
 *企业IDprivate Integer enterpriseId;
   企业名称*private String enterpriseName;
 企业性质private Integer enterpriseNature;
   统一信用代码private String enterpriseCreditCode;
   所在地区private String regionCode;
   联系人private String enterpriseContact;
 联系人手机号private String mobile;

 * @author makejava
 * @since 2023-04-17 09:48:15
 */
public class EnterpriseInfo implements Serializable {
    private static final long serialVersionUID = -82958810792050576L;
    /**
     * 企业ID
     */
    private Integer enterpriseId;
    /**
     * 企业名称
     */
    private String enterpriseName;
    /**
     * 企业性质
     */
    private Integer enterpriseNature;
    /**
     * 统一信用代码
     */
    private String enterpriseCreditCode;
    /**
     * 所在地区
     */
    private String regionCode;
    /**
     * 详细地址
     */
    private String enterpriseAddress;
    /**
     * 联系人
     */
    private String enterpriseContact;
    /**
     * 联系人手机号
     */
    private String mobile;
    /**
     * 营业执照
     */
    private Long enterpriseLicense;
    /**
     * 企业LOGO
     */
    private Long enterpriseLogo;
    /**
     * 法人证件
     */
    private Long legalLicense;
    /**
     * 法人代表
     */
    private String legalMan;
    /**
     * 认证状态 （0:认证失败; 1:待认证; 2:认证成功; ）
     */
    private Integer enterpriseStatus;
    /**
     * 企业资质证书
     */
    private Long enterpriseQua;
    /**
     * 企业审核失败原因
     */
    private String enterpriseFailureCause;
    /**
     * 企业邮箱
     */
    private String enterpriseEmail;
    /**
     * 法人身份证
     */
    private String legalIdentityCard;
    /**
     * 企业委托书
     */
    private Long enterpriseEntrust;
    /**
     * 联系人证件
     */
    private Long contactLicense;
    /**
     * 审核状态 （ 1:待审核; 2:审核成功; 3:审核失败;）
     */
    private Integer enterpriseAuthStatus;
    /**
     * 是否发送状态 （ 0:否;1:是）
     */
    private Integer sendAuthStatus;
    /**
     * 是否退回认证状态 （ 0:否;1:是）
     */
    private Integer reauthStatus;
    /**
     * 已认证退回后，需要修改的邮箱号码
     */
    private String reauthOldEmail;
    /**
     * 申请时间
     */
    private Date applyTime;
    /**
     * 审核通过时间
     */
    private Date authPassTime;
    /**
     * 审核不通过时间
     */
    private Date authFailureTime;
    /**
     * 企业注册地省
     */
    private String enterpriseRegisterProvince;
    /**
     * 企业注册地市
     */
    private String enterpriseRegisterCity;
    /**
     * 企业注册地县
     */
    private String enterpriseRegisterCounty;
    /**
     * 联系人身份证号
     */
    private String contactIdentityCard;
    /**
     * 联系人茉莉分
     */
    private Integer contactMoliScore;
    /**
     * 法人茉莉分
     */
    private Integer legalMoliScore;
    /**
     * 返还时间
     */
    private Date paymentTime;
    /**
     * 返还编号
     */
    private String paymentNo;
    /**
     * 联系人真人视频
     */
    private Long contactLicenseVideo;
    /**
     * 视频检测结果 0未通过，1通过
     */
    private Integer contactValidate;
    /**
     * 认证类型0：商汤视屏认证 1，e签宝支付宝认证 2：e签宝腾讯云认证 3：e签宝视屏认证
     */
    private String contactAuthType;
    /**
     * e签宝认证流程id
     */
    private Long flowId;
    /**
     * 打款状态 0:未打款，1：已打款，2：返还中，3：已返还
     */
    private Integer paymentState;
    /**
     * 开户名称
     */
    private String bankAccountName;
    /**
     * 对公银行账户
     */
    private String bankAccountNo;
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 开户银行
     */
    private String bankOrg;
    /**
     * 账户类型：1基本户、2一般户
     */
    private Integer bankAccountType;
    /**
     * 银行ID
     */
    private Integer bankId;
    /**
     * 分行ID
     */
    private Integer bankBranchId;
    /**
     * 银行证明文件
     */
    private Long bankCertificationFile;
    /**
     * 营业期限至类型 1长期 2固定日期
     */
    private Integer businessTermType;
    /**
     * 营业期限日期
     */
    private Date businessTermDate;
    /**
     * 企业注册时间
     */
    private Date enterpriseRegisterDate;
    /**
     * 安心签用户ID
     */
    private String axqUserId;
    /**
     * 法人联系电话
     */
    private String legalPersonTel;
    /**
     * 首次申请时间
     */
    private Date firstApplyTime;
    /**
     * 首次审核通过时间
     */
    private Date firstAuthPassTime;
    /**
     * 用户协议盖章情况 0未盖章 1已盖章
     */
    private String userAgreementStatus;
    /**
     * 用户协议对应附件ID
     */
    private Long userAgreement;
    /**
     * 建筑企业注册人员接口状态
     */
    private Integer interfaceConstructionRegisteredPeopleStatus;
    /**
     * 工商变更记录接口状态
     */
    private Integer interfaceCommercialChangedStatus;
    /**
     * 企业负面信息接口状态
     */
    private Integer interfaceNagetiveInfoStatus;
    /**
     * 建筑企业资质接口状态
     */
    private Integer interfaceConstructionQualification;
    /**
     * 易保全接口是否调用成功过，0没有 1有
     */
    private String ybqApplyStatus;
    /**
     * 认证情况 0首次认证 1重新认证
     */
    private Integer authCase;
    /**
     * 联系人QQ
     */
    private String contactQq;
    /**
     * 易保全认证邮箱
     */
    private String ybqIdentificationEmail;
    /**
     * 联系人微信
     */
    private String contactWx;
    /**
     * 投标了企业ID
     */
    private Integer tblEntId;
    /**
     * 企业数据来源 1投标了  2为自营平台入库 3客服录入
     */
    private Integer dataSource;
    /**
     * 企业审核不通过-提审次数
     */
    private Integer submitAuditNumber;
    /**
     * 企业三要素校验时间
     */
    private Date checkEntCodeOperTime;
    /**
     * 企业经营状态 1 营业 2 已注销
     */
    private String enterpriseManageState;
    /**
     * 联系人身份 1 经办 2 管理层
     */
    private String contactIdentity;
    /**
     * 录入时间
     */
    private Date createTime;
    /**
     * 录入人
     */
    private String createPerson;
    /**
     * 投标了企业主键
     */
    private Integer tblEnterpriseId;
    /**
     * 其他联系方式
     */
    private String otherMobile;
    /**
     * 是否人工审核 0 否 1是
     */
    private String isManualReview;


    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public Integer getEnterpriseNature() {
        return enterpriseNature;
    }

    public void setEnterpriseNature(Integer enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    public String getEnterpriseCreditCode() {
        return enterpriseCreditCode;
    }

    public void setEnterpriseCreditCode(String enterpriseCreditCode) {
        this.enterpriseCreditCode = enterpriseCreditCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseContact() {
        return enterpriseContact;
    }

    public void setEnterpriseContact(String enterpriseContact) {
        this.enterpriseContact = enterpriseContact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getEnterpriseLicense() {
        return enterpriseLicense;
    }

    public void setEnterpriseLicense(Long enterpriseLicense) {
        this.enterpriseLicense = enterpriseLicense;
    }

    public Long getEnterpriseLogo() {
        return enterpriseLogo;
    }

    public void setEnterpriseLogo(Long enterpriseLogo) {
        this.enterpriseLogo = enterpriseLogo;
    }

    public Long getLegalLicense() {
        return legalLicense;
    }

    public void setLegalLicense(Long legalLicense) {
        this.legalLicense = legalLicense;
    }

    public String getLegalMan() {
        return legalMan;
    }

    public void setLegalMan(String legalMan) {
        this.legalMan = legalMan;
    }

    public Integer getEnterpriseStatus() {
        return enterpriseStatus;
    }

    public void setEnterpriseStatus(Integer enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
    }

    public Long getEnterpriseQua() {
        return enterpriseQua;
    }

    public void setEnterpriseQua(Long enterpriseQua) {
        this.enterpriseQua = enterpriseQua;
    }

    public String getEnterpriseFailureCause() {
        return enterpriseFailureCause;
    }

    public void setEnterpriseFailureCause(String enterpriseFailureCause) {
        this.enterpriseFailureCause = enterpriseFailureCause;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getLegalIdentityCard() {
        return legalIdentityCard;
    }

    public void setLegalIdentityCard(String legalIdentityCard) {
        this.legalIdentityCard = legalIdentityCard;
    }

    public Long getEnterpriseEntrust() {
        return enterpriseEntrust;
    }

    public void setEnterpriseEntrust(Long enterpriseEntrust) {
        this.enterpriseEntrust = enterpriseEntrust;
    }

    public Long getContactLicense() {
        return contactLicense;
    }

    public void setContactLicense(Long contactLicense) {
        this.contactLicense = contactLicense;
    }

    public Integer getEnterpriseAuthStatus() {
        return enterpriseAuthStatus;
    }

    public void setEnterpriseAuthStatus(Integer enterpriseAuthStatus) {
        this.enterpriseAuthStatus = enterpriseAuthStatus;
    }

    public Integer getSendAuthStatus() {
        return sendAuthStatus;
    }

    public void setSendAuthStatus(Integer sendAuthStatus) {
        this.sendAuthStatus = sendAuthStatus;
    }

    public Integer getReauthStatus() {
        return reauthStatus;
    }

    public void setReauthStatus(Integer reauthStatus) {
        this.reauthStatus = reauthStatus;
    }

    public String getReauthOldEmail() {
        return reauthOldEmail;
    }

    public void setReauthOldEmail(String reauthOldEmail) {
        this.reauthOldEmail = reauthOldEmail;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getAuthPassTime() {
        return authPassTime;
    }

    public void setAuthPassTime(Date authPassTime) {
        this.authPassTime = authPassTime;
    }

    public Date getAuthFailureTime() {
        return authFailureTime;
    }

    public void setAuthFailureTime(Date authFailureTime) {
        this.authFailureTime = authFailureTime;
    }

    public String getEnterpriseRegisterProvince() {
        return enterpriseRegisterProvince;
    }

    public void setEnterpriseRegisterProvince(String enterpriseRegisterProvince) {
        this.enterpriseRegisterProvince = enterpriseRegisterProvince;
    }

    public String getEnterpriseRegisterCity() {
        return enterpriseRegisterCity;
    }

    public void setEnterpriseRegisterCity(String enterpriseRegisterCity) {
        this.enterpriseRegisterCity = enterpriseRegisterCity;
    }

    public String getEnterpriseRegisterCounty() {
        return enterpriseRegisterCounty;
    }

    public void setEnterpriseRegisterCounty(String enterpriseRegisterCounty) {
        this.enterpriseRegisterCounty = enterpriseRegisterCounty;
    }

    public String getContactIdentityCard() {
        return contactIdentityCard;
    }

    public void setContactIdentityCard(String contactIdentityCard) {
        this.contactIdentityCard = contactIdentityCard;
    }

    public Integer getContactMoliScore() {
        return contactMoliScore;
    }

    public void setContactMoliScore(Integer contactMoliScore) {
        this.contactMoliScore = contactMoliScore;
    }

    public Integer getLegalMoliScore() {
        return legalMoliScore;
    }

    public void setLegalMoliScore(Integer legalMoliScore) {
        this.legalMoliScore = legalMoliScore;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public Long getContactLicenseVideo() {
        return contactLicenseVideo;
    }

    public void setContactLicenseVideo(Long contactLicenseVideo) {
        this.contactLicenseVideo = contactLicenseVideo;
    }

    public Integer getContactValidate() {
        return contactValidate;
    }

    public void setContactValidate(Integer contactValidate) {
        this.contactValidate = contactValidate;
    }

    public String getContactAuthType() {
        return contactAuthType;
    }

    public void setContactAuthType(String contactAuthType) {
        this.contactAuthType = contactAuthType;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public Integer getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankOrg() {
        return bankOrg;
    }

    public void setBankOrg(String bankOrg) {
        this.bankOrg = bankOrg;
    }

    public Integer getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(Integer bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getBankBranchId() {
        return bankBranchId;
    }

    public void setBankBranchId(Integer bankBranchId) {
        this.bankBranchId = bankBranchId;
    }

    public Long getBankCertificationFile() {
        return bankCertificationFile;
    }

    public void setBankCertificationFile(Long bankCertificationFile) {
        this.bankCertificationFile = bankCertificationFile;
    }

    public Integer getBusinessTermType() {
        return businessTermType;
    }

    public void setBusinessTermType(Integer businessTermType) {
        this.businessTermType = businessTermType;
    }

    public Date getBusinessTermDate() {
        return businessTermDate;
    }

    public void setBusinessTermDate(Date businessTermDate) {
        this.businessTermDate = businessTermDate;
    }

    public Date getEnterpriseRegisterDate() {
        return enterpriseRegisterDate;
    }

    public void setEnterpriseRegisterDate(Date enterpriseRegisterDate) {
        this.enterpriseRegisterDate = enterpriseRegisterDate;
    }

    public String getAxqUserId() {
        return axqUserId;
    }

    public void setAxqUserId(String axqUserId) {
        this.axqUserId = axqUserId;
    }

    public String getLegalPersonTel() {
        return legalPersonTel;
    }

    public void setLegalPersonTel(String legalPersonTel) {
        this.legalPersonTel = legalPersonTel;
    }

    public Date getFirstApplyTime() {
        return firstApplyTime;
    }

    public void setFirstApplyTime(Date firstApplyTime) {
        this.firstApplyTime = firstApplyTime;
    }

    public Date getFirstAuthPassTime() {
        return firstAuthPassTime;
    }

    public void setFirstAuthPassTime(Date firstAuthPassTime) {
        this.firstAuthPassTime = firstAuthPassTime;
    }

    public String getUserAgreementStatus() {
        return userAgreementStatus;
    }

    public void setUserAgreementStatus(String userAgreementStatus) {
        this.userAgreementStatus = userAgreementStatus;
    }

    public Long getUserAgreement() {
        return userAgreement;
    }

    public void setUserAgreement(Long userAgreement) {
        this.userAgreement = userAgreement;
    }

    public Integer getInterfaceConstructionRegisteredPeopleStatus() {
        return interfaceConstructionRegisteredPeopleStatus;
    }

    public void setInterfaceConstructionRegisteredPeopleStatus(Integer interfaceConstructionRegisteredPeopleStatus) {
        this.interfaceConstructionRegisteredPeopleStatus = interfaceConstructionRegisteredPeopleStatus;
    }

    public Integer getInterfaceCommercialChangedStatus() {
        return interfaceCommercialChangedStatus;
    }

    public void setInterfaceCommercialChangedStatus(Integer interfaceCommercialChangedStatus) {
        this.interfaceCommercialChangedStatus = interfaceCommercialChangedStatus;
    }

    public Integer getInterfaceNagetiveInfoStatus() {
        return interfaceNagetiveInfoStatus;
    }

    public void setInterfaceNagetiveInfoStatus(Integer interfaceNagetiveInfoStatus) {
        this.interfaceNagetiveInfoStatus = interfaceNagetiveInfoStatus;
    }

    public Integer getInterfaceConstructionQualification() {
        return interfaceConstructionQualification;
    }

    public void setInterfaceConstructionQualification(Integer interfaceConstructionQualification) {
        this.interfaceConstructionQualification = interfaceConstructionQualification;
    }

    public String getYbqApplyStatus() {
        return ybqApplyStatus;
    }

    public void setYbqApplyStatus(String ybqApplyStatus) {
        this.ybqApplyStatus = ybqApplyStatus;
    }

    public Integer getAuthCase() {
        return authCase;
    }

    public void setAuthCase(Integer authCase) {
        this.authCase = authCase;
    }

    public String getContactQq() {
        return contactQq;
    }

    public void setContactQq(String contactQq) {
        this.contactQq = contactQq;
    }

    public String getYbqIdentificationEmail() {
        return ybqIdentificationEmail;
    }

    public void setYbqIdentificationEmail(String ybqIdentificationEmail) {
        this.ybqIdentificationEmail = ybqIdentificationEmail;
    }

    public String getContactWx() {
        return contactWx;
    }

    public void setContactWx(String contactWx) {
        this.contactWx = contactWx;
    }

    public Integer getTblEntId() {
        return tblEntId;
    }

    public void setTblEntId(Integer tblEntId) {
        this.tblEntId = tblEntId;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public Integer getSubmitAuditNumber() {
        return submitAuditNumber;
    }

    public void setSubmitAuditNumber(Integer submitAuditNumber) {
        this.submitAuditNumber = submitAuditNumber;
    }

    public Date getCheckEntCodeOperTime() {
        return checkEntCodeOperTime;
    }

    public void setCheckEntCodeOperTime(Date checkEntCodeOperTime) {
        this.checkEntCodeOperTime = checkEntCodeOperTime;
    }

    public String getEnterpriseManageState() {
        return enterpriseManageState;
    }

    public void setEnterpriseManageState(String enterpriseManageState) {
        this.enterpriseManageState = enterpriseManageState;
    }

    public String getContactIdentity() {
        return contactIdentity;
    }

    public void setContactIdentity(String contactIdentity) {
        this.contactIdentity = contactIdentity;
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

    public Integer getTblEnterpriseId() {
        return tblEnterpriseId;
    }

    public void setTblEnterpriseId(Integer tblEnterpriseId) {
        this.tblEnterpriseId = tblEnterpriseId;
    }

    public String getOtherMobile() {
        return otherMobile;
    }

    public void setOtherMobile(String otherMobile) {
        this.otherMobile = otherMobile;
    }

    public String getIsManualReview() {
        return isManualReview;
    }

    public void setIsManualReview(String isManualReview) {
        this.isManualReview = isManualReview;
    }

}

