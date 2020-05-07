/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Includes information about the specified association.
 * </p>
 */
public class AssociationExecution implements Serializable {
    /**
     * <p>
     * The association ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String associationId;

    /**
     * <p>
     * The association version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     */
    private String associationVersion;

    /**
     * <p>
     * The execution ID for the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String executionId;

    /**
     * <p>
     * The status of the association execution.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Detailed status information about the execution.
     * </p>
     */
    private String detailedStatus;

    /**
     * <p>
     * The time the execution started.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The date of the last execution.
     * </p>
     */
    private java.util.Date lastExecutionDate;

    /**
     * <p>
     * An aggregate status of the resources in the execution based on the status
     * type.
     * </p>
     */
    private String resourceCountByStatus;

    /**
     * <p>
     * The association ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The association ID.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>
     *            The association ID.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>
     *            The association ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociationExecution withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @return <p>
     *         The association version.
     *         </p>
     */
    public String getAssociationVersion() {
        return associationVersion;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @param associationVersion <p>
     *            The association version.
     *            </p>
     */
    public void setAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @param associationVersion <p>
     *            The association version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociationExecution withAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
        return this;
    }

    /**
     * <p>
     * The execution ID for the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The execution ID for the association.
     *         </p>
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * <p>
     * The execution ID for the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param executionId <p>
     *            The execution ID for the association.
     *            </p>
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The execution ID for the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param executionId <p>
     *            The execution ID for the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociationExecution withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * <p>
     * The status of the association execution.
     * </p>
     *
     * @return <p>
     *         The status of the association execution.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the association execution.
     * </p>
     *
     * @param status <p>
     *            The status of the association execution.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the association execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the association execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociationExecution withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Detailed status information about the execution.
     * </p>
     *
     * @return <p>
     *         Detailed status information about the execution.
     *         </p>
     */
    public String getDetailedStatus() {
        return detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the execution.
     * </p>
     *
     * @param detailedStatus <p>
     *            Detailed status information about the execution.
     *            </p>
     */
    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detailedStatus <p>
     *            Detailed status information about the execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociationExecution withDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     *
     * @return <p>
     *         The time the execution started.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     *
     * @param createdTime <p>
     *            The time the execution started.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time the execution started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociationExecution withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The date of the last execution.
     * </p>
     *
     * @return <p>
     *         The date of the last execution.
     *         </p>
     */
    public java.util.Date getLastExecutionDate() {
        return lastExecutionDate;
    }

    /**
     * <p>
     * The date of the last execution.
     * </p>
     *
     * @param lastExecutionDate <p>
     *            The date of the last execution.
     *            </p>
     */
    public void setLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
    }

    /**
     * <p>
     * The date of the last execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastExecutionDate <p>
     *            The date of the last execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociationExecution withLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
        return this;
    }

    /**
     * <p>
     * An aggregate status of the resources in the execution based on the status
     * type.
     * </p>
     *
     * @return <p>
     *         An aggregate status of the resources in the execution based on
     *         the status type.
     *         </p>
     */
    public String getResourceCountByStatus() {
        return resourceCountByStatus;
    }

    /**
     * <p>
     * An aggregate status of the resources in the execution based on the status
     * type.
     * </p>
     *
     * @param resourceCountByStatus <p>
     *            An aggregate status of the resources in the execution based on
     *            the status type.
     *            </p>
     */
    public void setResourceCountByStatus(String resourceCountByStatus) {
        this.resourceCountByStatus = resourceCountByStatus;
    }

    /**
     * <p>
     * An aggregate status of the resources in the execution based on the status
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceCountByStatus <p>
     *            An aggregate status of the resources in the execution based on
     *            the status type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociationExecution withResourceCountByStatus(String resourceCountByStatus) {
        this.resourceCountByStatus = resourceCountByStatus;
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
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getAssociationVersion() != null)
            sb.append("AssociationVersion: " + getAssociationVersion() + ",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: " + getExecutionId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: " + getDetailedStatus() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastExecutionDate() != null)
            sb.append("LastExecutionDate: " + getLastExecutionDate() + ",");
        if (getResourceCountByStatus() != null)
            sb.append("ResourceCountByStatus: " + getResourceCountByStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastExecutionDate() == null) ? 0 : getLastExecutionDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceCountByStatus() == null) ? 0 : getResourceCountByStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationExecution == false)
            return false;
        AssociationExecution other = (AssociationExecution) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null)
            return false;
        if (other.getAssociationVersion() != null
                && other.getAssociationVersion().equals(this.getAssociationVersion()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null
                && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null
                && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastExecutionDate() == null ^ this.getLastExecutionDate() == null)
            return false;
        if (other.getLastExecutionDate() != null
                && other.getLastExecutionDate().equals(this.getLastExecutionDate()) == false)
            return false;
        if (other.getResourceCountByStatus() == null ^ this.getResourceCountByStatus() == null)
            return false;
        if (other.getResourceCountByStatus() != null
                && other.getResourceCountByStatus().equals(this.getResourceCountByStatus()) == false)
            return false;
        return true;
    }
}
