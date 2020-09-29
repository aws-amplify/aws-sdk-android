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
 * <p>Information about the compliance as defined by the resource type. For example, for a patch resource type, <code>Items</code> includes information about the PatchSeverity, Classification, and so on.</p>
 */
public class ComplianceItem implements Serializable {
    /**
     * <p>The compliance type. For example, Association (for a State Manager association), Patch, or Custom:<code>string</code> are all valid compliance types.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     */
    private String complianceType;

    /**
     * <p>The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String resourceType;

    /**
     * <p>An ID for the resource. For a managed instance, this is the instance ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String resourceId;

    /**
     * <p>An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.</p>
     */
    private String id;

    /**
     * <p>A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String title;

    /**
     * <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     */
    private String status;

    /**
     * <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     */
    private String severity;

    /**
     * <p>A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.</p>
     */
    private ComplianceExecutionSummary executionSummary;

    /**
     * <p>A "Key": "Value" tag combination for the compliance item.</p>
     */
    private java.util.Map<String, String> details;

    /**
     * <p>The compliance type. For example, Association (for a State Manager association), Patch, or Custom:<code>string</code> are all valid compliance types.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @return <p>The compliance type. For example, Association (for a State Manager association), Patch, or Custom:<code>string</code> are all valid compliance types.</p>
     */
    public String getComplianceType() {
        return complianceType;
    }

    /**
     * <p>The compliance type. For example, Association (for a State Manager association), Patch, or Custom:<code>string</code> are all valid compliance types.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @param complianceType <p>The compliance type. For example, Association (for a State Manager association), Patch, or Custom:<code>string</code> are all valid compliance types.</p>
     */
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>The compliance type. For example, Association (for a State Manager association), Patch, or Custom:<code>string</code> are all valid compliance types.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+<br/>
     *
     * @param complianceType <p>The compliance type. For example, Association (for a State Manager association), Patch, or Custom:<code>string</code> are all valid compliance types.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceItem withComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }

    /**
     * <p>The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.</p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param resourceType <p>The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.</p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param resourceType <p>The type of resource. <code>ManagedInstance</code> is currently the only supported resource type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceItem withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>An ID for the resource. For a managed instance, this is the instance ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>An ID for the resource. For a managed instance, this is the instance ID.</p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>An ID for the resource. For a managed instance, this is the instance ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param resourceId <p>An ID for the resource. For a managed instance, this is the instance ID.</p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>An ID for the resource. For a managed instance, this is the instance ID.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param resourceId <p>An ID for the resource. For a managed instance, this is the instance ID.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceItem withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.</p>
     *
     * @return <p>An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.</p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.</p>
     *
     * @param id <p>An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.</p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id <p>An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.</p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param title <p>A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.</p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param title <p>A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceItem withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @return <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     *
     * @see ComplianceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     *
     * @see ComplianceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ComplianceStatus
     */
    public ComplianceItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     *
     * @see ComplianceStatus
     */
    public void setStatus(ComplianceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ComplianceStatus
     */
    public ComplianceItem withStatus(ComplianceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @return <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     *
     * @see ComplianceSeverity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param severity <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     *
     * @see ComplianceSeverity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param severity <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ComplianceSeverity
     */
    public ComplianceItem withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param severity <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     *
     * @see ComplianceSeverity
     */
    public void setSeverity(ComplianceSeverity severity) {
        this.severity = severity.toString();
    }

    /**
     * <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED
     *
     * @param severity <p>The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ComplianceSeverity
     */
    public ComplianceItem withSeverity(ComplianceSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.</p>
     *
     * @return <p>A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.</p>
     */
    public ComplianceExecutionSummary getExecutionSummary() {
        return executionSummary;
    }

    /**
     * <p>A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.</p>
     *
     * @param executionSummary <p>A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.</p>
     */
    public void setExecutionSummary(ComplianceExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
    }

    /**
     * <p>A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionSummary <p>A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceItem withExecutionSummary(ComplianceExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
        return this;
    }

    /**
     * <p>A "Key": "Value" tag combination for the compliance item.</p>
     *
     * @return <p>A "Key": "Value" tag combination for the compliance item.</p>
     */
    public java.util.Map<String, String> getDetails() {
        return details;
    }

    /**
     * <p>A "Key": "Value" tag combination for the compliance item.</p>
     *
     * @param details <p>A "Key": "Value" tag combination for the compliance item.</p>
     */
    public void setDetails(java.util.Map<String, String> details) {
        this.details = details;
    }

    /**
     * <p>A "Key": "Value" tag combination for the compliance item.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param details <p>A "Key": "Value" tag combination for the compliance item.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceItem withDetails(java.util.Map<String, String> details) {
        this.details = details;
        return this;
    }

    /**
     * <p>A "Key": "Value" tag combination for the compliance item.</p>
     * <p>
     * The method adds a new key-value pair into Details parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Details.
     * @param value The corresponding value of the entry to be added into Details.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ComplianceItem addDetailsEntry(String key, String value) {
        if (null == this.details) {
            this.details = new java.util.HashMap<String, String>();
        }
        if (this.details.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.details.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public ComplianceItem clearDetailsEntries() {
        this.details = null;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getTitle() != null) sb.append("Title: " + getTitle() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getSeverity() != null) sb.append("Severity: " + getSeverity() + ",");
        if (getExecutionSummary() != null) sb.append("ExecutionSummary: " + getExecutionSummary() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails());
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
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getExecutionSummary() == null) ? 0 : getExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ComplianceItem == false) return false;
        ComplianceItem other = (ComplianceItem)obj;

        if (other.getComplianceType() == null ^ this.getComplianceType() == null) return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false) return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false;
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false;
        if (other.getTitle() == null ^ this.getTitle() == null) return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null) return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false) return false;
        if (other.getExecutionSummary() == null ^ this.getExecutionSummary() == null) return false;
        if (other.getExecutionSummary() != null && other.getExecutionSummary().equals(this.getExecutionSummary()) == false) return false;
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false;
        return true;
    }
}
