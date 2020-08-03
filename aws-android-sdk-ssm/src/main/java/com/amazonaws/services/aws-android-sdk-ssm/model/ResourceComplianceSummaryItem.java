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
 * <p>Compliance summary information for a specific resource. </p>
 */
public class ResourceComplianceSummaryItem implements Serializable {
    /**
     * <p>The compliance type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     */
    private String complianceType;

    /**
     * <p>The resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String resourceType;

    /**
     * <p>The resource ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String resourceId;

    /**
     * <p>The compliance status for the resource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     */
    private String status;

    /**
     * <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     */
    private String overallSeverity;

    /**
     * <p>Information about the execution.</p>
     */
    private ComplianceExecutionSummary executionSummary;

    /**
     * <p>A list of items that are compliant for the resource.</p>
     */
    private CompliantSummary compliantSummary;

    /**
     * <p>A list of items that aren't compliant for the resource.</p>
     */
    private NonCompliantSummary nonCompliantSummary;

    /**
     * <p>The compliance type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @return <p>The compliance type.</p>
     */
    public String getComplianceType() {
        return complianceType;
    }

    /**
     * <p>The compliance type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @param complianceType <p>The compliance type.</p>
     */
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>The compliance type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @param complianceType <p>The compliance type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceComplianceSummaryItem withComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }

    /**
     * <p>The resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>The resource type.</p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>The resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param resourceType <p>The resource type.</p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>The resource type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param resourceType <p>The resource type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceComplianceSummaryItem withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>The resource ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>The resource ID.</p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>The resource ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param resourceId <p>The resource ID.</p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>The resource ID.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param resourceId <p>The resource ID.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceComplianceSummaryItem withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>The compliance status for the resource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @return <p>The compliance status for the resource.</p>
     *
     * @see ComplianceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The compliance status for the resource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>The compliance status for the resource.</p>
     *
     * @see ComplianceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The compliance status for the resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>The compliance status for the resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ComplianceStatus
     */
    public ResourceComplianceSummaryItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The compliance status for the resource.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>The compliance status for the resource.</p>
     *
     * @see ComplianceStatus
     */
    public void setStatus(ComplianceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The compliance status for the resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>The compliance status for the resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ComplianceStatus
     */
    public ResourceComplianceSummaryItem withStatus(ComplianceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @return <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     *
     * @see ComplianceSeverity
     */
    public String getOverallSeverity() {
        return overallSeverity;
    }

    /**
     * <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param overallSeverity <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     *
     * @see ComplianceSeverity
     */
    public void setOverallSeverity(String overallSeverity) {
        this.overallSeverity = overallSeverity;
    }

    /**
     * <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param overallSeverity <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ComplianceSeverity
     */
    public ResourceComplianceSummaryItem withOverallSeverity(String overallSeverity) {
        this.overallSeverity = overallSeverity;
        return this;
    }

    /**
     * <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param overallSeverity <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     *
     * @see ComplianceSeverity
     */
    public void setOverallSeverity(ComplianceSeverity overallSeverity) {
        this.overallSeverity = overallSeverity.toString();
    }

    /**
     * <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param overallSeverity <p>The highest severity item found for the resource. The resource is compliant for this item.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ComplianceSeverity
     */
    public ResourceComplianceSummaryItem withOverallSeverity(ComplianceSeverity overallSeverity) {
        this.overallSeverity = overallSeverity.toString();
        return this;
    }

    /**
     * <p>Information about the execution.</p>
     *
     * @return <p>Information about the execution.</p>
     */
    public ComplianceExecutionSummary getExecutionSummary() {
        return executionSummary;
    }

    /**
     * <p>Information about the execution.</p>
     *
     * @param executionSummary <p>Information about the execution.</p>
     */
    public void setExecutionSummary(ComplianceExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
    }

    /**
     * <p>Information about the execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionSummary <p>Information about the execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceComplianceSummaryItem withExecutionSummary(ComplianceExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
        return this;
    }

    /**
     * <p>A list of items that are compliant for the resource.</p>
     *
     * @return <p>A list of items that are compliant for the resource.</p>
     */
    public CompliantSummary getCompliantSummary() {
        return compliantSummary;
    }

    /**
     * <p>A list of items that are compliant for the resource.</p>
     *
     * @param compliantSummary <p>A list of items that are compliant for the resource.</p>
     */
    public void setCompliantSummary(CompliantSummary compliantSummary) {
        this.compliantSummary = compliantSummary;
    }

    /**
     * <p>A list of items that are compliant for the resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param compliantSummary <p>A list of items that are compliant for the resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceComplianceSummaryItem withCompliantSummary(CompliantSummary compliantSummary) {
        this.compliantSummary = compliantSummary;
        return this;
    }

    /**
     * <p>A list of items that aren't compliant for the resource.</p>
     *
     * @return <p>A list of items that aren't compliant for the resource.</p>
     */
    public NonCompliantSummary getNonCompliantSummary() {
        return nonCompliantSummary;
    }

    /**
     * <p>A list of items that aren't compliant for the resource.</p>
     *
     * @param nonCompliantSummary <p>A list of items that aren't compliant for the resource.</p>
     */
    public void setNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        this.nonCompliantSummary = nonCompliantSummary;
    }

    /**
     * <p>A list of items that aren't compliant for the resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nonCompliantSummary <p>A list of items that aren't compliant for the resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResourceComplianceSummaryItem withNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        this.nonCompliantSummary = nonCompliantSummary;
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
        if (getComplianceType() != null) sb.append("ComplianceType: " + getComplianceType() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getOverallSeverity() != null) sb.append("OverallSeverity: " + getOverallSeverity() + ",");
        if (getExecutionSummary() != null) sb.append("ExecutionSummary: " + getExecutionSummary() + ",");
        if (getCompliantSummary() != null) sb.append("CompliantSummary: " + getCompliantSummary() + ",");
        if (getNonCompliantSummary() != null) sb.append("NonCompliantSummary: " + getNonCompliantSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOverallSeverity() == null) ? 0 : getOverallSeverity().hashCode());
        hashCode = prime * hashCode + ((getExecutionSummary() == null) ? 0 : getExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getCompliantSummary() == null) ? 0 : getCompliantSummary().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantSummary() == null) ? 0 : getNonCompliantSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResourceComplianceSummaryItem == false) return false;
        ResourceComplianceSummaryItem other = (ResourceComplianceSummaryItem)obj;

        if (other.getComplianceType() == null ^ this.getComplianceType() == null) return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false) return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getOverallSeverity() == null ^ this.getOverallSeverity() == null) return false;
        if (other.getOverallSeverity() != null && other.getOverallSeverity().equals(this.getOverallSeverity()) == false) return false;
        if (other.getExecutionSummary() == null ^ this.getExecutionSummary() == null) return false;
        if (other.getExecutionSummary() != null && other.getExecutionSummary().equals(this.getExecutionSummary()) == false) return false;
        if (other.getCompliantSummary() == null ^ this.getCompliantSummary() == null) return false;
        if (other.getCompliantSummary() != null && other.getCompliantSummary().equals(this.getCompliantSummary()) == false) return false;
        if (other.getNonCompliantSummary() == null ^ this.getNonCompliantSummary() == null) return false;
        if (other.getNonCompliantSummary() != null && other.getNonCompliantSummary().equals(this.getNonCompliantSummary()) == false) return false;
        return true;
    }
}
