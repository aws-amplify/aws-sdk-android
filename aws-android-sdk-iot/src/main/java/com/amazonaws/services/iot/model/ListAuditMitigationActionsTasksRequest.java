/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Gets a list of audit mitigation action tasks that match the specified
 * filters.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >ListAuditMitigationActionsTasks</a> action.
 * </p>
 */
public class ListAuditMitigationActionsTasksRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to
     * results for a specific audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String auditTaskId;

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to a
     * specific audit finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String findingId;

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific
     * state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     */
    private String taskStatus;

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
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specify this filter to limit results to tasks that began on or after a
     * specific date and time.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * Specify this filter to limit results to tasks that were completed or
     * canceled on or before a specific date and time.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to
     * results for a specific audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         Specify this filter to limit results to tasks that were applied
     *         to results for a specific audit.
     *         </p>
     */
    public String getAuditTaskId() {
        return auditTaskId;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to
     * results for a specific audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param auditTaskId <p>
     *            Specify this filter to limit results to tasks that were
     *            applied to results for a specific audit.
     *            </p>
     */
    public void setAuditTaskId(String auditTaskId) {
        this.auditTaskId = auditTaskId;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to
     * results for a specific audit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param auditTaskId <p>
     *            Specify this filter to limit results to tasks that were
     *            applied to results for a specific audit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditMitigationActionsTasksRequest withAuditTaskId(String auditTaskId) {
        this.auditTaskId = auditTaskId;
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to a
     * specific audit finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         Specify this filter to limit results to tasks that were applied
     *         to a specific audit finding.
     *         </p>
     */
    public String getFindingId() {
        return findingId;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to a
     * specific audit finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param findingId <p>
     *            Specify this filter to limit results to tasks that were
     *            applied to a specific audit finding.
     *            </p>
     */
    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were applied to a
     * specific audit finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param findingId <p>
     *            Specify this filter to limit results to tasks that were
     *            applied to a specific audit finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditMitigationActionsTasksRequest withFindingId(String findingId) {
        this.findingId = findingId;
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific
     * state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @return <p>
     *         Specify this filter to limit results to tasks that are in a
     *         specific state.
     *         </p>
     * @see AuditMitigationActionsTaskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific
     * state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            Specify this filter to limit results to tasks that are in a
     *            specific state.
     *            </p>
     * @see AuditMitigationActionsTaskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific
     * state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            Specify this filter to limit results to tasks that are in a
     *            specific state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditMitigationActionsTaskStatus
     */
    public ListAuditMitigationActionsTasksRequest withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific
     * state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            Specify this filter to limit results to tasks that are in a
     *            specific state.
     *            </p>
     * @see AuditMitigationActionsTaskStatus
     */
    public void setTaskStatus(AuditMitigationActionsTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that are in a specific
     * state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED
     *
     * @param taskStatus <p>
     *            Specify this filter to limit results to tasks that are in a
     *            specific state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditMitigationActionsTaskStatus
     */
    public ListAuditMitigationActionsTasksRequest withTaskStatus(
            AuditMitigationActionsTaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
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
    public ListAuditMitigationActionsTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
    public ListAuditMitigationActionsTasksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that began on or after a
     * specific date and time.
     * </p>
     *
     * @return <p>
     *         Specify this filter to limit results to tasks that began on or
     *         after a specific date and time.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that began on or after a
     * specific date and time.
     * </p>
     *
     * @param startTime <p>
     *            Specify this filter to limit results to tasks that began on or
     *            after a specific date and time.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that began on or after a
     * specific date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            Specify this filter to limit results to tasks that began on or
     *            after a specific date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditMitigationActionsTasksRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were completed or
     * canceled on or before a specific date and time.
     * </p>
     *
     * @return <p>
     *         Specify this filter to limit results to tasks that were completed
     *         or canceled on or before a specific date and time.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were completed or
     * canceled on or before a specific date and time.
     * </p>
     *
     * @param endTime <p>
     *            Specify this filter to limit results to tasks that were
     *            completed or canceled on or before a specific date and time.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Specify this filter to limit results to tasks that were completed or
     * canceled on or before a specific date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            Specify this filter to limit results to tasks that were
     *            completed or canceled on or before a specific date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditMitigationActionsTasksRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
        if (getAuditTaskId() != null)
            sb.append("auditTaskId: " + getAuditTaskId() + ",");
        if (getFindingId() != null)
            sb.append("findingId: " + getFindingId() + ",");
        if (getTaskStatus() != null)
            sb.append("taskStatus: " + getTaskStatus() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuditTaskId() == null) ? 0 : getAuditTaskId().hashCode());
        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAuditMitigationActionsTasksRequest == false)
            return false;
        ListAuditMitigationActionsTasksRequest other = (ListAuditMitigationActionsTasksRequest) obj;

        if (other.getAuditTaskId() == null ^ this.getAuditTaskId() == null)
            return false;
        if (other.getAuditTaskId() != null
                && other.getAuditTaskId().equals(this.getAuditTaskId()) == false)
            return false;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null
                && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null
                && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }
}
