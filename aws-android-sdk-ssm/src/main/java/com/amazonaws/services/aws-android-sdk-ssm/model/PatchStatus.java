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
 * <p>Information about the approval status of a patch.</p>
 */
public class PatchStatus implements Serializable {
    /**
     * <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED
     */
    private String deploymentStatus;

    /**
     * <p>The compliance severity level for a patch.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     */
    private String complianceLevel;

    /**
     * <p>The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).</p>
     */
    private java.util.Date approvalDate;

    /**
     * <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED
     *
     * @return <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     *
     * @see PatchDeploymentStatus
     */
    public String getDeploymentStatus() {
        return deploymentStatus;
    }

    /**
     * <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED
     *
     * @param deploymentStatus <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     *
     * @see PatchDeploymentStatus
     */
    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED
     *
     * @param deploymentStatus <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchDeploymentStatus
     */
    public PatchStatus withDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    /**
     * <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED
     *
     * @param deploymentStatus <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     *
     * @see PatchDeploymentStatus
     */
    public void setDeploymentStatus(PatchDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
    }

    /**
     * <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED
     *
     * @param deploymentStatus <p>The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchDeploymentStatus
     */
    public PatchStatus withDeploymentStatus(PatchDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>The compliance severity level for a patch.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @return <p>The compliance severity level for a patch.</p>
     *
     * @see PatchComplianceLevel
     */
    public String getComplianceLevel() {
        return complianceLevel;
    }

    /**
     * <p>The compliance severity level for a patch.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param complianceLevel <p>The compliance severity level for a patch.</p>
     *
     * @see PatchComplianceLevel
     */
    public void setComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    /**
     * <p>The compliance severity level for a patch.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param complianceLevel <p>The compliance severity level for a patch.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchComplianceLevel
     */
    public PatchStatus withComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
        return this;
    }

    /**
     * <p>The compliance severity level for a patch.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param complianceLevel <p>The compliance severity level for a patch.</p>
     *
     * @see PatchComplianceLevel
     */
    public void setComplianceLevel(PatchComplianceLevel complianceLevel) {
        this.complianceLevel = complianceLevel.toString();
    }

    /**
     * <p>The compliance severity level for a patch.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param complianceLevel <p>The compliance severity level for a patch.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PatchComplianceLevel
     */
    public PatchStatus withComplianceLevel(PatchComplianceLevel complianceLevel) {
        this.complianceLevel = complianceLevel.toString();
        return this;
    }

    /**
     * <p>The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).</p>
     *
     * @return <p>The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).</p>
     */
    public java.util.Date getApprovalDate() {
        return approvalDate;
    }

    /**
     * <p>The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).</p>
     *
     * @param approvalDate <p>The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).</p>
     */
    public void setApprovalDate(java.util.Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    /**
     * <p>The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param approvalDate <p>The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PatchStatus withApprovalDate(java.util.Date approvalDate) {
        this.approvalDate = approvalDate;
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
        if (getDeploymentStatus() != null) sb.append("DeploymentStatus: " + getDeploymentStatus() + ",");
        if (getComplianceLevel() != null) sb.append("ComplianceLevel: " + getComplianceLevel() + ",");
        if (getApprovalDate() != null) sb.append("ApprovalDate: " + getApprovalDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getComplianceLevel() == null) ? 0 : getComplianceLevel().hashCode());
        hashCode = prime * hashCode + ((getApprovalDate() == null) ? 0 : getApprovalDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PatchStatus == false) return false;
        PatchStatus other = (PatchStatus)obj;

        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null) return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false) return false;
        if (other.getComplianceLevel() == null ^ this.getComplianceLevel() == null) return false;
        if (other.getComplianceLevel() != null && other.getComplianceLevel().equals(this.getComplianceLevel()) == false) return false;
        if (other.getApprovalDate() == null ^ this.getApprovalDate() == null) return false;
        if (other.getApprovalDate() != null && other.getApprovalDate().equals(this.getApprovalDate()) == false) return false;
        return true;
    }
}
