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
 * Information about a compliance item.
 * </p>
 */
public class ComplianceItemEntry implements Serializable {
    /**
     * <p>
     * The compliance item ID. For example, if the compliance item is a Windows
     * patch, the ID could be the number of the KB article.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The title of the compliance item. For example, if the compliance item is
     * a Windows patch, the title could be the title of the KB article for the
     * patch; for example: Security Update for Active Directory Federation
     * Services.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String title;

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the
     * following: Critical, High, Medium, Low, Informational, Unspecified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     */
    private String severity;

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or
     * NON_COMPLIANT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     */
    private String status;

    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     */
    private java.util.Map<String, String> details;

    /**
     * <p>
     * The compliance item ID. For example, if the compliance item is a Windows
     * patch, the ID could be the number of the KB article.
     * </p>
     *
     * @return <p>
     *         The compliance item ID. For example, if the compliance item is a
     *         Windows patch, the ID could be the number of the KB article.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The compliance item ID. For example, if the compliance item is a Windows
     * patch, the ID could be the number of the KB article.
     * </p>
     *
     * @param id <p>
     *            The compliance item ID. For example, if the compliance item is
     *            a Windows patch, the ID could be the number of the KB article.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The compliance item ID. For example, if the compliance item is a Windows
     * patch, the ID could be the number of the KB article.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The compliance item ID. For example, if the compliance item is
     *            a Windows patch, the ID could be the number of the KB article.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceItemEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The title of the compliance item. For example, if the compliance item is
     * a Windows patch, the title could be the title of the KB article for the
     * patch; for example: Security Update for Active Directory Federation
     * Services.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The title of the compliance item. For example, if the compliance
     *         item is a Windows patch, the title could be the title of the KB
     *         article for the patch; for example: Security Update for Active
     *         Directory Federation Services.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the compliance item. For example, if the compliance item is
     * a Windows patch, the title could be the title of the KB article for the
     * patch; for example: Security Update for Active Directory Federation
     * Services.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param title <p>
     *            The title of the compliance item. For example, if the
     *            compliance item is a Windows patch, the title could be the
     *            title of the KB article for the patch; for example: Security
     *            Update for Active Directory Federation Services.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the compliance item. For example, if the compliance item is
     * a Windows patch, the title could be the title of the KB article for the
     * patch; for example: Security Update for Active Directory Federation
     * Services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param title <p>
     *            The title of the compliance item. For example, if the
     *            compliance item is a Windows patch, the title could be the
     *            title of the KB article for the patch; for example: Security
     *            Update for Active Directory Federation Services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceItemEntry withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the
     * following: Critical, High, Medium, Low, Informational, Unspecified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @return <p>
     *         The severity of the compliance status. Severity can be one of the
     *         following: Critical, High, Medium, Low, Informational,
     *         Unspecified.
     *         </p>
     * @see ComplianceSeverity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the
     * following: Critical, High, Medium, Low, Informational, Unspecified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param severity <p>
     *            The severity of the compliance status. Severity can be one of
     *            the following: Critical, High, Medium, Low, Informational,
     *            Unspecified.
     *            </p>
     * @see ComplianceSeverity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the
     * following: Critical, High, Medium, Low, Informational, Unspecified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param severity <p>
     *            The severity of the compliance status. Severity can be one of
     *            the following: Critical, High, Medium, Low, Informational,
     *            Unspecified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceSeverity
     */
    public ComplianceItemEntry withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the
     * following: Critical, High, Medium, Low, Informational, Unspecified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param severity <p>
     *            The severity of the compliance status. Severity can be one of
     *            the following: Critical, High, Medium, Low, Informational,
     *            Unspecified.
     *            </p>
     * @see ComplianceSeverity
     */
    public void setSeverity(ComplianceSeverity severity) {
        this.severity = severity.toString();
    }

    /**
     * <p>
     * The severity of the compliance status. Severity can be one of the
     * following: Critical, High, Medium, Low, Informational, Unspecified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param severity <p>
     *            The severity of the compliance status. Severity can be one of
     *            the following: Critical, High, Medium, Low, Informational,
     *            Unspecified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceSeverity
     */
    public ComplianceItemEntry withSeverity(ComplianceSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or
     * NON_COMPLIANT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @return <p>
     *         The status of the compliance item. An item is either COMPLIANT or
     *         NON_COMPLIANT.
     *         </p>
     * @see ComplianceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or
     * NON_COMPLIANT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>
     *            The status of the compliance item. An item is either COMPLIANT
     *            or NON_COMPLIANT.
     *            </p>
     * @see ComplianceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or
     * NON_COMPLIANT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>
     *            The status of the compliance item. An item is either COMPLIANT
     *            or NON_COMPLIANT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceStatus
     */
    public ComplianceItemEntry withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or
     * NON_COMPLIANT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>
     *            The status of the compliance item. An item is either COMPLIANT
     *            or NON_COMPLIANT.
     *            </p>
     * @see ComplianceStatus
     */
    public void setStatus(ComplianceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the compliance item. An item is either COMPLIANT or
     * NON_COMPLIANT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT
     *
     * @param status <p>
     *            The status of the compliance item. An item is either COMPLIANT
     *            or NON_COMPLIANT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceStatus
     */
    public ComplianceItemEntry withStatus(ComplianceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     *
     * @return <p>
     *         A "Key": "Value" tag combination for the compliance item.
     *         </p>
     */
    public java.util.Map<String, String> getDetails() {
        return details;
    }

    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     *
     * @param details <p>
     *            A "Key": "Value" tag combination for the compliance item.
     *            </p>
     */
    public void setDetails(java.util.Map<String, String> details) {
        this.details = details;
    }

    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            A "Key": "Value" tag combination for the compliance item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceItemEntry withDetails(java.util.Map<String, String> details) {
        this.details = details;
        return this;
    }

    /**
     * <p>
     * A "Key": "Value" tag combination for the compliance item.
     * </p>
     * <p>
     * The method adds a new key-value pair into Details parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Details.
     * @param value The corresponding value of the entry to be added into
     *            Details.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceItemEntry addDetailsEntry(String key, String value) {
        if (null == this.details) {
            this.details = new java.util.HashMap<String, String>();
        }
        if (this.details.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.details.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Details.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ComplianceItemEntry clearDetailsEntries() {
        this.details = null;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getSeverity() != null)
            sb.append("Severity: " + getSeverity() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceItemEntry == false)
            return false;
        ComplianceItemEntry other = (ComplianceItemEntry) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
