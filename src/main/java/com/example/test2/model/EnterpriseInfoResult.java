package com.example.test2.model;

import java.io.Serializable;

public class EnterpriseInfoResult implements Serializable {
    private String enterpriseName;
    private Integer handleCount;
    private Integer taskCount;
    private Integer followCount;
    private String lastFollowTime;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public Integer getHandleCount() {
        return handleCount;
    }

    public void setHandleCount(Integer handleCount) {
        this.handleCount = handleCount;
    }

    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    public Integer getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    public String getLastFollowTime() {
        return lastFollowTime;
    }

    public void setLastFollowTime(String lastFollowTime) {
        this.lastFollowTime = lastFollowTime;
    }
}
