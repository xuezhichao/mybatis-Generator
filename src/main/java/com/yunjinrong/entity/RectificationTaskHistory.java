package com.yunjinrong.entity;

import java.util.Date;

public class RectificationTaskHistory {
    private String id;

    /**企业整改热发热舒舒服服的士大夫*/
    private String enterpriseMsgId;

    /**审批节点*/
    private String point;

    /**审批人员*/
    private String userId;

    /**审批结果*/
    private String approvalResult;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**获取企业整改id*/
    public String getEnterpriseMsgId() {
        return enterpriseMsgId;
    }

    /**设置企业整改id*/
    public void setEnterpriseMsgId(String enterpriseMsgId) {
        this.enterpriseMsgId = enterpriseMsgId == null ? null : enterpriseMsgId.trim();
    }

    /**获取审批节点*/
    public String getPoint() {
        return point;
    }

    /**设置审批节点*/
    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    /**获取审批人员*/
    public String getUserId() {
        return userId;
    }

    /**设置审批人员*/
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**获取审批结果*/
    public String getApprovalResult() {
        return approvalResult;
    }

    /**设置审批结果*/
    public void setApprovalResult(String approvalResult) {
        this.approvalResult = approvalResult == null ? null : approvalResult.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}