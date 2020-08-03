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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Includes information about the specified association execution.</p>
 */
public class AssociationExecutionTarget implements Serializable {
    /**
     * <p>The association ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     */
    private String associationId;

    /**
     * <p>The association version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     */
    private String associationVersion;

    /**
     * <p>The execution ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     */
    private String executionId;

    /**
     * <p>The resource ID, for example, the instance ID where the association ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String resourceId;

    /**
     * <p>The resource type, for example, instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String resourceType;

    /**
     * <p>The association execution status.</p>
     */
    private String status;

    /**
     * <p>Detailed information about the execution status.</p>
     */
    private String detailedStatus;

    /**
     * <p>The date of the last execution.</p>
     */
    private java.util.Date lastExecutionDate;

    /**
     * <p>The location where the association details are saved.</p>
     */
    private OutputSource outputSource;

    /**
     * <p>The association ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>The association ID.</p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>The association ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>The association ID.</p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>The association ID.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>The association ID.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionTarget withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>The association version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @return <p>The association version.</p>
     */
    public String getAssociationVersion() {
        return associationVersion;
    }

    /**
     * <p>The association version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @param associationVersion <p>The association version.</p>
     */
    public void setAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
    }

    /**
     * <p>The association version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @param associationVersion <p>The association version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionTarget withAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
        return this;
    }

    /**
     * <p>The execution ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>The execution ID.</p>
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * <p>The execution ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param executionId <p>The execution ID.</p>
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>The execution ID.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param executionId <p>The execution ID.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionTarget withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * <p>The resource ID, for example, the instance ID where the association ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>The resource ID, for example, the instance ID where the association ran.</p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>The resource ID, for example, the instance ID where the association ran.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param resourceId <p>The resource ID, for example, the instance ID where the association ran.</p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>The resource ID, for example, the instance ID where the association ran.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param resourceId <p>The resource ID, for example, the instance ID where the association ran.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionTarget withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>The resource type, for example, instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>The resource type, for example, instance.</p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>The resource type, for example, instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param resourceType <p>The resource type, for example, instance.</p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>The resource type, for example, instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param resourceType <p>The resource type, for example, instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionTarget withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>The association execution status.</p>
     *
     * @return <p>The association execution status.</p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The association execution status.</p>
     *
     * @param status <p>The association execution status.</p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The association execution status.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status <p>The association execution status.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionTarget withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>Detailed information about the execution status.</p>
     *
     * @return <p>Detailed information about the execution status.</p>
     */
    public String getDetailedStatus() {
        return detailedStatus;
    }

    /**
     * <p>Detailed information about the execution status.</p>
     *
     * @param detailedStatus <p>Detailed information about the execution status.</p>
     */
    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <p>Detailed information about the execution status.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param detailedStatus <p>Detailed information about the execution status.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionTarget withDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * <p>The date of the last execution.</p>
     *
     * @return <p>The date of the last execution.</p>
     */
    public java.util.Date getLastExecutionDate() {
        return lastExecutionDate;
    }

    /**
     * <p>The date of the last execution.</p>
     *
     * @param lastExecutionDate <p>The date of the last execution.</p>
     */
    public void setLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
    }

    /**
     * <p>The date of the last execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastExecutionDate <p>The date of the last execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionTarget withLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
        return this;
    }

    /**
     * <p>The location where the association details are saved.</p>
     *
     * @return <p>The location where the association details are saved.</p>
     */
    public OutputSource getOutputSource() {
        return outputSource;
    }

    /**
     * <p>The location where the association details are saved.</p>
     *
     * @param outputSource <p>The location where the association details are saved.</p>
     */
    public void setOutputSource(OutputSource outputSource) {
        this.outputSource = outputSource;
    }

    /**
     * <p>The location where the association details are saved.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param outputSource <p>The location where the association details are saved.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionTarget withOutputSource(OutputSource outputSource) {
        this.outputSource = outputSource;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssociationId() != null) sb.append("AssociationId: " + getAssociationId() + ",");
        if (getAssociationVersion() != null) sb.append("AssociationVersion: " + getAssociationVersion() + ",");
        if (getExecutionId() != null) sb.append("ExecutionId: " + getExecutionId() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getDetailedStatus() != null) sb.append("DetailedStatus: " + getDetailedStatus() + ",");
        if (getLastExecutionDate() != null) sb.append("LastExecutionDate: " + getLastExecutionDate() + ",");
        if (getOutputSource() != null) sb.append("OutputSource: " + getOutputSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        hashCode = prime * hashCode + ((getLastExecutionDate() == null) ? 0 : getLastExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getOutputSource() == null) ? 0 : getOutputSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssociationExecutionTarget == false) return false;
        AssociationExecutionTarget other = (AssociationExecutionTarget)obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null) return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false) return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null) return false;
        if (other.getAssociationVersion() != null && other.getAssociationVersion().equals(this.getAssociationVersion()) == false) return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null) return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false) return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null) return false;
        if (other.getDetailedStatus() != null && other.getDetailedStatus().equals(this.getDetailedStatus()) == false) return false;
        if (other.getLastExecutionDate() == null ^ this.getLastExecutionDate() == null) return false;
        if (other.getLastExecutionDate() != null && other.getLastExecutionDate().equals(this.getLastExecutionDate()) == false) return false;
        if (other.getOutputSource() == null ^ this.getOutputSource() == null) return false;
        if (other.getOutputSource() != null && other.getOutputSource().equals(this.getOutputSource()) == false) return false;
        return true;
    }
}
