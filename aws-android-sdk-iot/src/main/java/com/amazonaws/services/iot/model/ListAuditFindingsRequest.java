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
 * Lists the findings (results) of a Device Defender audit or of the audits
 * performed during a specified time period. (Findings are retained for 90
 * days.)
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >ListAuditFindings</a> action.
 * </p>
 */
public class ListAuditFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A filter to limit results to the audit with the specified ID. You must
     * specify either the taskId or the startTime and endTime, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String taskId;

    /**
     * <p>
     * A filter to limit results to the findings for the specified audit check.
     * </p>
     */
    private String checkName;

    /**
     * <p>
     * Information identifying the noncompliant resource.
     * </p>
     */
    private ResourceIdentifier resourceIdentifier;

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
     * A filter to limit results to those found after the specified time. You
     * must specify either the startTime and endTime or the taskId, but not
     * both.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * A filter to limit results to those found before the specified time. You
     * must specify either the startTime and endTime or the taskId, but not
     * both.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Boolean flag indicating whether only the suppressed findings or the
     * unsuppressed findings should be listed. If this parameter isn't provided,
     * the response will list both suppressed and unsuppressed findings.
     * </p>
     */
    private Boolean listSuppressedFindings;

    /**
     * <p>
     * A filter to limit results to the audit with the specified ID. You must
     * specify either the taskId or the startTime and endTime, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         A filter to limit results to the audit with the specified ID. You
     *         must specify either the taskId or the startTime and endTime, but
     *         not both.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * A filter to limit results to the audit with the specified ID. You must
     * specify either the taskId or the startTime and endTime, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param taskId <p>
     *            A filter to limit results to the audit with the specified ID.
     *            You must specify either the taskId or the startTime and
     *            endTime, but not both.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * A filter to limit results to the audit with the specified ID. You must
     * specify either the taskId or the startTime and endTime, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param taskId <p>
     *            A filter to limit results to the audit with the specified ID.
     *            You must specify either the taskId or the startTime and
     *            endTime, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditFindingsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * A filter to limit results to the findings for the specified audit check.
     * </p>
     *
     * @return <p>
     *         A filter to limit results to the findings for the specified audit
     *         check.
     *         </p>
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * <p>
     * A filter to limit results to the findings for the specified audit check.
     * </p>
     *
     * @param checkName <p>
     *            A filter to limit results to the findings for the specified
     *            audit check.
     *            </p>
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * <p>
     * A filter to limit results to the findings for the specified audit check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkName <p>
     *            A filter to limit results to the findings for the specified
     *            audit check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditFindingsRequest withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * <p>
     * Information identifying the noncompliant resource.
     * </p>
     *
     * @return <p>
     *         Information identifying the noncompliant resource.
     *         </p>
     */
    public ResourceIdentifier getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * <p>
     * Information identifying the noncompliant resource.
     * </p>
     *
     * @param resourceIdentifier <p>
     *            Information identifying the noncompliant resource.
     *            </p>
     */
    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Information identifying the noncompliant resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifier <p>
     *            Information identifying the noncompliant resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditFindingsRequest withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
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
    public ListAuditFindingsRequest withMaxResults(Integer maxResults) {
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
    public ListAuditFindingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A filter to limit results to those found after the specified time. You
     * must specify either the startTime and endTime or the taskId, but not
     * both.
     * </p>
     *
     * @return <p>
     *         A filter to limit results to those found after the specified
     *         time. You must specify either the startTime and endTime or the
     *         taskId, but not both.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A filter to limit results to those found after the specified time. You
     * must specify either the startTime and endTime or the taskId, but not
     * both.
     * </p>
     *
     * @param startTime <p>
     *            A filter to limit results to those found after the specified
     *            time. You must specify either the startTime and endTime or the
     *            taskId, but not both.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A filter to limit results to those found after the specified time. You
     * must specify either the startTime and endTime or the taskId, but not
     * both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A filter to limit results to those found after the specified
     *            time. You must specify either the startTime and endTime or the
     *            taskId, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditFindingsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * A filter to limit results to those found before the specified time. You
     * must specify either the startTime and endTime or the taskId, but not
     * both.
     * </p>
     *
     * @return <p>
     *         A filter to limit results to those found before the specified
     *         time. You must specify either the startTime and endTime or the
     *         taskId, but not both.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * A filter to limit results to those found before the specified time. You
     * must specify either the startTime and endTime or the taskId, but not
     * both.
     * </p>
     *
     * @param endTime <p>
     *            A filter to limit results to those found before the specified
     *            time. You must specify either the startTime and endTime or the
     *            taskId, but not both.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A filter to limit results to those found before the specified time. You
     * must specify either the startTime and endTime or the taskId, but not
     * both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            A filter to limit results to those found before the specified
     *            time. You must specify either the startTime and endTime or the
     *            taskId, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditFindingsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Boolean flag indicating whether only the suppressed findings or the
     * unsuppressed findings should be listed. If this parameter isn't provided,
     * the response will list both suppressed and unsuppressed findings.
     * </p>
     *
     * @return <p>
     *         Boolean flag indicating whether only the suppressed findings or
     *         the unsuppressed findings should be listed. If this parameter
     *         isn't provided, the response will list both suppressed and
     *         unsuppressed findings.
     *         </p>
     */
    public Boolean isListSuppressedFindings() {
        return listSuppressedFindings;
    }

    /**
     * <p>
     * Boolean flag indicating whether only the suppressed findings or the
     * unsuppressed findings should be listed. If this parameter isn't provided,
     * the response will list both suppressed and unsuppressed findings.
     * </p>
     *
     * @return <p>
     *         Boolean flag indicating whether only the suppressed findings or
     *         the unsuppressed findings should be listed. If this parameter
     *         isn't provided, the response will list both suppressed and
     *         unsuppressed findings.
     *         </p>
     */
    public Boolean getListSuppressedFindings() {
        return listSuppressedFindings;
    }

    /**
     * <p>
     * Boolean flag indicating whether only the suppressed findings or the
     * unsuppressed findings should be listed. If this parameter isn't provided,
     * the response will list both suppressed and unsuppressed findings.
     * </p>
     *
     * @param listSuppressedFindings <p>
     *            Boolean flag indicating whether only the suppressed findings
     *            or the unsuppressed findings should be listed. If this
     *            parameter isn't provided, the response will list both
     *            suppressed and unsuppressed findings.
     *            </p>
     */
    public void setListSuppressedFindings(Boolean listSuppressedFindings) {
        this.listSuppressedFindings = listSuppressedFindings;
    }

    /**
     * <p>
     * Boolean flag indicating whether only the suppressed findings or the
     * unsuppressed findings should be listed. If this parameter isn't provided,
     * the response will list both suppressed and unsuppressed findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listSuppressedFindings <p>
     *            Boolean flag indicating whether only the suppressed findings
     *            or the unsuppressed findings should be listed. If this
     *            parameter isn't provided, the response will list both
     *            suppressed and unsuppressed findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditFindingsRequest withListSuppressedFindings(Boolean listSuppressedFindings) {
        this.listSuppressedFindings = listSuppressedFindings;
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
        if (getCheckName() != null)
            sb.append("checkName: " + getCheckName() + ",");
        if (getResourceIdentifier() != null)
            sb.append("resourceIdentifier: " + getResourceIdentifier() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getListSuppressedFindings() != null)
            sb.append("listSuppressedFindings: " + getListSuppressedFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getListSuppressedFindings() == null) ? 0 : getListSuppressedFindings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAuditFindingsRequest == false)
            return false;
        ListAuditFindingsRequest other = (ListAuditFindingsRequest) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getCheckName() == null ^ this.getCheckName() == null)
            return false;
        if (other.getCheckName() != null
                && other.getCheckName().equals(this.getCheckName()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null
                && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
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
        if (other.getListSuppressedFindings() == null ^ this.getListSuppressedFindings() == null)
            return false;
        if (other.getListSuppressedFindings() != null
                && other.getListSuppressedFindings().equals(this.getListSuppressedFindings()) == false)
            return false;
        return true;
    }
}
