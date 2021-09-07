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
 * Gets the status of audit mitigation action tasks that were executed.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >ListAuditMitigationActionsExecutions</a> action.
 * </p>
 */
public class ListAuditMitigationActionsExecutionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specify this filter to limit results to actions for a specific audit
     * mitigation actions task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String taskId;

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     */
    private String actionStatus;

    /**
     * <p>
     * Specify this filter to limit results to those that were applied to a
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
     * Specify this filter to limit results to actions for a specific audit
     * mitigation actions task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         Specify this filter to limit results to actions for a specific
     *         audit mitigation actions task.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * Specify this filter to limit results to actions for a specific audit
     * mitigation actions task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param taskId <p>
     *            Specify this filter to limit results to actions for a specific
     *            audit mitigation actions task.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * Specify this filter to limit results to actions for a specific audit
     * mitigation actions task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param taskId <p>
     *            Specify this filter to limit results to actions for a specific
     *            audit mitigation actions task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditMitigationActionsExecutionsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @return <p>
     *         Specify this filter to limit results to those with a specific
     *         status.
     *         </p>
     * @see AuditMitigationActionsExecutionStatus
     */
    public String getActionStatus() {
        return actionStatus;
    }

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @param actionStatus <p>
     *            Specify this filter to limit results to those with a specific
     *            status.
     *            </p>
     * @see AuditMitigationActionsExecutionStatus
     */
    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @param actionStatus <p>
     *            Specify this filter to limit results to those with a specific
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditMitigationActionsExecutionStatus
     */
    public ListAuditMitigationActionsExecutionsRequest withActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @param actionStatus <p>
     *            Specify this filter to limit results to those with a specific
     *            status.
     *            </p>
     * @see AuditMitigationActionsExecutionStatus
     */
    public void setActionStatus(AuditMitigationActionsExecutionStatus actionStatus) {
        this.actionStatus = actionStatus.toString();
    }

    /**
     * <p>
     * Specify this filter to limit results to those with a specific status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED,
     * PENDING
     *
     * @param actionStatus <p>
     *            Specify this filter to limit results to those with a specific
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditMitigationActionsExecutionStatus
     */
    public ListAuditMitigationActionsExecutionsRequest withActionStatus(
            AuditMitigationActionsExecutionStatus actionStatus) {
        this.actionStatus = actionStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specify this filter to limit results to those that were applied to a
     * specific audit finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         Specify this filter to limit results to those that were applied
     *         to a specific audit finding.
     *         </p>
     */
    public String getFindingId() {
        return findingId;
    }

    /**
     * <p>
     * Specify this filter to limit results to those that were applied to a
     * specific audit finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param findingId <p>
     *            Specify this filter to limit results to those that were
     *            applied to a specific audit finding.
     *            </p>
     */
    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * Specify this filter to limit results to those that were applied to a
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
     *            Specify this filter to limit results to those that were
     *            applied to a specific audit finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditMitigationActionsExecutionsRequest withFindingId(String findingId) {
        this.findingId = findingId;
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
    public ListAuditMitigationActionsExecutionsRequest withMaxResults(Integer maxResults) {
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
    public ListAuditMitigationActionsExecutionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTaskId() != null)
            sb.append("taskId: " + getTaskId() + ",");
        if (getActionStatus() != null)
            sb.append("actionStatus: " + getActionStatus() + ",");
        if (getFindingId() != null)
            sb.append("findingId: " + getFindingId() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode
                + ((getActionStatus() == null) ? 0 : getActionStatus().hashCode());
        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAuditMitigationActionsExecutionsRequest == false)
            return false;
        ListAuditMitigationActionsExecutionsRequest other = (ListAuditMitigationActionsExecutionsRequest) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getActionStatus() == null ^ this.getActionStatus() == null)
            return false;
        if (other.getActionStatus() != null
                && other.getActionStatus().equals(this.getActionStatus()) == false)
            return false;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null
                && other.getFindingId().equals(this.getFindingId()) == false)
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
        return true;
    }
}
