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

/**
 * <p>
 * The findings (results) of the audit.
 * </p>
 */
public class AuditFinding implements Serializable {
    /**
     * <p>
     * The ID of the audit that generated this result (finding)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String taskId;

    /**
     * <p>
     * The audit check that generated this result.
     * </p>
     */
    private String checkName;

    /**
     * <p>
     * The time the audit started.
     * </p>
     */
    private java.util.Date taskStartTime;

    /**
     * <p>
     * The time the result (finding) was discovered.
     * </p>
     */
    private java.util.Date findingTime;

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW
     */
    private String severity;

    /**
     * <p>
     * The resource that was found to be non-compliant with the audit check.
     * </p>
     */
    private NonCompliantResource nonCompliantResource;

    /**
     * <p>
     * The list of related resources.
     * </p>
     */
    private java.util.List<RelatedResource> relatedResources;

    /**
     * <p>
     * The reason the resource was non-compliant.
     * </p>
     */
    private String reasonForNonCompliance;

    /**
     * <p>
     * A code which indicates the reason that the resource was non-compliant.
     * </p>
     */
    private String reasonForNonComplianceCode;

    /**
     * <p>
     * The ID of the audit that generated this result (finding)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The ID of the audit that generated this result (finding)
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The ID of the audit that generated this result (finding)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param taskId <p>
     *            The ID of the audit that generated this result (finding)
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the audit that generated this result (finding)
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
     *            The ID of the audit that generated this result (finding)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditFinding withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * The audit check that generated this result.
     * </p>
     *
     * @return <p>
     *         The audit check that generated this result.
     *         </p>
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * <p>
     * The audit check that generated this result.
     * </p>
     *
     * @param checkName <p>
     *            The audit check that generated this result.
     *            </p>
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * <p>
     * The audit check that generated this result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkName <p>
     *            The audit check that generated this result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditFinding withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     *
     * @return <p>
     *         The time the audit started.
     *         </p>
     */
    public java.util.Date getTaskStartTime() {
        return taskStartTime;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     *
     * @param taskStartTime <p>
     *            The time the audit started.
     *            </p>
     */
    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * The time the audit started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskStartTime <p>
     *            The time the audit started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditFinding withTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
        return this;
    }

    /**
     * <p>
     * The time the result (finding) was discovered.
     * </p>
     *
     * @return <p>
     *         The time the result (finding) was discovered.
     *         </p>
     */
    public java.util.Date getFindingTime() {
        return findingTime;
    }

    /**
     * <p>
     * The time the result (finding) was discovered.
     * </p>
     *
     * @param findingTime <p>
     *            The time the result (finding) was discovered.
     *            </p>
     */
    public void setFindingTime(java.util.Date findingTime) {
        this.findingTime = findingTime;
    }

    /**
     * <p>
     * The time the result (finding) was discovered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingTime <p>
     *            The time the result (finding) was discovered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditFinding withFindingTime(java.util.Date findingTime) {
        this.findingTime = findingTime;
        return this;
    }

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW
     *
     * @return <p>
     *         The severity of the result (finding).
     *         </p>
     * @see AuditFindingSeverity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW
     *
     * @param severity <p>
     *            The severity of the result (finding).
     *            </p>
     * @see AuditFindingSeverity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW
     *
     * @param severity <p>
     *            The severity of the result (finding).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditFindingSeverity
     */
    public AuditFinding withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW
     *
     * @param severity <p>
     *            The severity of the result (finding).
     *            </p>
     * @see AuditFindingSeverity
     */
    public void setSeverity(AuditFindingSeverity severity) {
        this.severity = severity.toString();
    }

    /**
     * <p>
     * The severity of the result (finding).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW
     *
     * @param severity <p>
     *            The severity of the result (finding).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditFindingSeverity
     */
    public AuditFinding withSeverity(AuditFindingSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The resource that was found to be non-compliant with the audit check.
     * </p>
     *
     * @return <p>
     *         The resource that was found to be non-compliant with the audit
     *         check.
     *         </p>
     */
    public NonCompliantResource getNonCompliantResource() {
        return nonCompliantResource;
    }

    /**
     * <p>
     * The resource that was found to be non-compliant with the audit check.
     * </p>
     *
     * @param nonCompliantResource <p>
     *            The resource that was found to be non-compliant with the audit
     *            check.
     *            </p>
     */
    public void setNonCompliantResource(NonCompliantResource nonCompliantResource) {
        this.nonCompliantResource = nonCompliantResource;
    }

    /**
     * <p>
     * The resource that was found to be non-compliant with the audit check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nonCompliantResource <p>
     *            The resource that was found to be non-compliant with the audit
     *            check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditFinding withNonCompliantResource(NonCompliantResource nonCompliantResource) {
        this.nonCompliantResource = nonCompliantResource;
        return this;
    }

    /**
     * <p>
     * The list of related resources.
     * </p>
     *
     * @return <p>
     *         The list of related resources.
     *         </p>
     */
    public java.util.List<RelatedResource> getRelatedResources() {
        return relatedResources;
    }

    /**
     * <p>
     * The list of related resources.
     * </p>
     *
     * @param relatedResources <p>
     *            The list of related resources.
     *            </p>
     */
    public void setRelatedResources(java.util.Collection<RelatedResource> relatedResources) {
        if (relatedResources == null) {
            this.relatedResources = null;
            return;
        }

        this.relatedResources = new java.util.ArrayList<RelatedResource>(relatedResources);
    }

    /**
     * <p>
     * The list of related resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedResources <p>
     *            The list of related resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditFinding withRelatedResources(RelatedResource... relatedResources) {
        if (getRelatedResources() == null) {
            this.relatedResources = new java.util.ArrayList<RelatedResource>(
                    relatedResources.length);
        }
        for (RelatedResource value : relatedResources) {
            this.relatedResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of related resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedResources <p>
     *            The list of related resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditFinding withRelatedResources(java.util.Collection<RelatedResource> relatedResources) {
        setRelatedResources(relatedResources);
        return this;
    }

    /**
     * <p>
     * The reason the resource was non-compliant.
     * </p>
     *
     * @return <p>
     *         The reason the resource was non-compliant.
     *         </p>
     */
    public String getReasonForNonCompliance() {
        return reasonForNonCompliance;
    }

    /**
     * <p>
     * The reason the resource was non-compliant.
     * </p>
     *
     * @param reasonForNonCompliance <p>
     *            The reason the resource was non-compliant.
     *            </p>
     */
    public void setReasonForNonCompliance(String reasonForNonCompliance) {
        this.reasonForNonCompliance = reasonForNonCompliance;
    }

    /**
     * <p>
     * The reason the resource was non-compliant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reasonForNonCompliance <p>
     *            The reason the resource was non-compliant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditFinding withReasonForNonCompliance(String reasonForNonCompliance) {
        this.reasonForNonCompliance = reasonForNonCompliance;
        return this;
    }

    /**
     * <p>
     * A code which indicates the reason that the resource was non-compliant.
     * </p>
     *
     * @return <p>
     *         A code which indicates the reason that the resource was
     *         non-compliant.
     *         </p>
     */
    public String getReasonForNonComplianceCode() {
        return reasonForNonComplianceCode;
    }

    /**
     * <p>
     * A code which indicates the reason that the resource was non-compliant.
     * </p>
     *
     * @param reasonForNonComplianceCode <p>
     *            A code which indicates the reason that the resource was
     *            non-compliant.
     *            </p>
     */
    public void setReasonForNonComplianceCode(String reasonForNonComplianceCode) {
        this.reasonForNonComplianceCode = reasonForNonComplianceCode;
    }

    /**
     * <p>
     * A code which indicates the reason that the resource was non-compliant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reasonForNonComplianceCode <p>
     *            A code which indicates the reason that the resource was
     *            non-compliant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditFinding withReasonForNonComplianceCode(String reasonForNonComplianceCode) {
        this.reasonForNonComplianceCode = reasonForNonComplianceCode;
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
        if (getTaskStartTime() != null)
            sb.append("taskStartTime: " + getTaskStartTime() + ",");
        if (getFindingTime() != null)
            sb.append("findingTime: " + getFindingTime() + ",");
        if (getSeverity() != null)
            sb.append("severity: " + getSeverity() + ",");
        if (getNonCompliantResource() != null)
            sb.append("nonCompliantResource: " + getNonCompliantResource() + ",");
        if (getRelatedResources() != null)
            sb.append("relatedResources: " + getRelatedResources() + ",");
        if (getReasonForNonCompliance() != null)
            sb.append("reasonForNonCompliance: " + getReasonForNonCompliance() + ",");
        if (getReasonForNonComplianceCode() != null)
            sb.append("reasonForNonComplianceCode: " + getReasonForNonComplianceCode());
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
                + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getFindingTime() == null) ? 0 : getFindingTime().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode
                + ((getNonCompliantResource() == null) ? 0 : getNonCompliantResource().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedResources() == null) ? 0 : getRelatedResources().hashCode());
        hashCode = prime
                * hashCode
                + ((getReasonForNonCompliance() == null) ? 0 : getReasonForNonCompliance()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReasonForNonComplianceCode() == null) ? 0 : getReasonForNonComplianceCode()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditFinding == false)
            return false;
        AuditFinding other = (AuditFinding) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getCheckName() == null ^ this.getCheckName() == null)
            return false;
        if (other.getCheckName() != null
                && other.getCheckName().equals(this.getCheckName()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null
                && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getFindingTime() == null ^ this.getFindingTime() == null)
            return false;
        if (other.getFindingTime() != null
                && other.getFindingTime().equals(this.getFindingTime()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getNonCompliantResource() == null ^ this.getNonCompliantResource() == null)
            return false;
        if (other.getNonCompliantResource() != null
                && other.getNonCompliantResource().equals(this.getNonCompliantResource()) == false)
            return false;
        if (other.getRelatedResources() == null ^ this.getRelatedResources() == null)
            return false;
        if (other.getRelatedResources() != null
                && other.getRelatedResources().equals(this.getRelatedResources()) == false)
            return false;
        if (other.getReasonForNonCompliance() == null ^ this.getReasonForNonCompliance() == null)
            return false;
        if (other.getReasonForNonCompliance() != null
                && other.getReasonForNonCompliance().equals(this.getReasonForNonCompliance()) == false)
            return false;
        if (other.getReasonForNonComplianceCode() == null
                ^ this.getReasonForNonComplianceCode() == null)
            return false;
        if (other.getReasonForNonComplianceCode() != null
                && other.getReasonForNonComplianceCode().equals(
                        this.getReasonForNonComplianceCode()) == false)
            return false;
        return true;
    }
}
