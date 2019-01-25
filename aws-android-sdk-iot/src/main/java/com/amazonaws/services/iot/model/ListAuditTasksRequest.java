/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the Device Defender audits that have been performed during a given time
 * period.
 * </p>
 */
public class ListAuditTasksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The beginning of the time period. Note that audit information is retained
     * for a limited time (180 days). Requesting a start time prior to what is
     * retained results in an "InvalidRequestException".
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end of the time period.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * A filter to limit the output to the specified type of audit: can be one
     * of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED__AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     */
    private String taskType;

    /**
     * <p>
     * A filter to limit the output to audits with the specified completion
     * status: can be one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     */
    private String taskStatus;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The beginning of the time period. Note that audit information is retained
     * for a limited time (180 days). Requesting a start time prior to what is
     * retained results in an "InvalidRequestException".
     * </p>
     *
     * @return <p>
     *         The beginning of the time period. Note that audit information is
     *         retained for a limited time (180 days). Requesting a start time
     *         prior to what is retained results in an
     *         "InvalidRequestException".
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The beginning of the time period. Note that audit information is retained
     * for a limited time (180 days). Requesting a start time prior to what is
     * retained results in an "InvalidRequestException".
     * </p>
     *
     * @param startTime <p>
     *            The beginning of the time period. Note that audit information
     *            is retained for a limited time (180 days). Requesting a start
     *            time prior to what is retained results in an
     *            "InvalidRequestException".
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The beginning of the time period. Note that audit information is retained
     * for a limited time (180 days). Requesting a start time prior to what is
     * retained results in an "InvalidRequestException".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The beginning of the time period. Note that audit information
     *            is retained for a limited time (180 days). Requesting a start
     *            time prior to what is retained results in an
     *            "InvalidRequestException".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditTasksRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end of the time period.
     * </p>
     *
     * @return <p>
     *         The end of the time period.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end of the time period.
     * </p>
     *
     * @param endTime <p>
     *            The end of the time period.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end of the time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditTasksRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * A filter to limit the output to the specified type of audit: can be one
     * of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED__AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @return <p>
     *         A filter to limit the output to the specified type of audit: can
     *         be one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED__AUDIT_TASK".
     *         </p>
     * @see AuditTaskType
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * <p>
     * A filter to limit the output to the specified type of audit: can be one
     * of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED__AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            A filter to limit the output to the specified type of audit:
     *            can be one of "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED__AUDIT_TASK".
     *            </p>
     * @see AuditTaskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * A filter to limit the output to the specified type of audit: can be one
     * of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED__AUDIT_TASK".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            A filter to limit the output to the specified type of audit:
     *            can be one of "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED__AUDIT_TASK".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskType
     */
    public ListAuditTasksRequest withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * <p>
     * A filter to limit the output to the specified type of audit: can be one
     * of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED__AUDIT_TASK".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            A filter to limit the output to the specified type of audit:
     *            can be one of "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED__AUDIT_TASK".
     *            </p>
     * @see AuditTaskType
     */
    public void setTaskType(AuditTaskType taskType) {
        this.taskType = taskType.toString();
    }

    /**
     * <p>
     * A filter to limit the output to the specified type of audit: can be one
     * of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED__AUDIT_TASK".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK
     *
     * @param taskType <p>
     *            A filter to limit the output to the specified type of audit:
     *            can be one of "ON_DEMAND_AUDIT_TASK" or
     *            "SCHEDULED__AUDIT_TASK".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskType
     */
    public ListAuditTasksRequest withTaskType(AuditTaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * A filter to limit the output to audits with the specified completion
     * status: can be one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @return <p>
     *         A filter to limit the output to audits with the specified
     *         completion status: can be one of "IN_PROGRESS", "COMPLETED",
     *         "FAILED" or "CANCELED".
     *         </p>
     * @see AuditTaskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * <p>
     * A filter to limit the output to audits with the specified completion
     * status: can be one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            A filter to limit the output to audits with the specified
     *            completion status: can be one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED" or "CANCELED".
     *            </p>
     * @see AuditTaskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * A filter to limit the output to audits with the specified completion
     * status: can be one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            A filter to limit the output to audits with the specified
     *            completion status: can be one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED" or "CANCELED".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskStatus
     */
    public ListAuditTasksRequest withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * <p>
     * A filter to limit the output to audits with the specified completion
     * status: can be one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            A filter to limit the output to audits with the specified
     *            completion status: can be one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED" or "CANCELED".
     *            </p>
     * @see AuditTaskStatus
     */
    public void setTaskStatus(AuditTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
    }

    /**
     * <p>
     * A filter to limit the output to audits with the specified completion
     * status: can be one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            A filter to limit the output to audits with the specified
     *            completion status: can be one of "IN_PROGRESS", "COMPLETED",
     *            "FAILED" or "CANCELED".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditTaskStatus
     */
    public ListAuditTasksRequest withTaskStatus(AuditTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditTasksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return at one time. The default
     *         is 25.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time. The
     *            default is 25.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time. The
     *            default is 25.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getTaskType() != null)
            sb.append("taskType: " + getTaskType() + ",");
        if (getTaskStatus() != null)
            sb.append("taskStatus: " + getTaskStatus() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAuditTasksRequest == false)
            return false;
        ListAuditTasksRequest other = (ListAuditTasksRequest) obj;

        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null
                && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
