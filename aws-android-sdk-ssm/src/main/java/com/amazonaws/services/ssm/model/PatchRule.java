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
 * Defines an approval rule for a patch baseline.
 * </p>
 */
public class PatchRule implements Serializable {
    /**
     * <p>
     * The patch filter group that defines the criteria for the rule.
     * </p>
     */
    private PatchFilterGroup patchFilterGroup;

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline.
     * Valid compliance severity levels include the following: Unspecified,
     * Critical, High, Medium, Low, and Informational.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     */
    private String complianceLevel;

    /**
     * <p>
     * The number of days after the release date of each patch matched by the
     * rule that the patch is marked as approved in the patch baseline. For
     * example, a value of <code>7</code> means that patches are approved seven
     * days after they are released.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer approveAfterDays;

    /**
     * <p>
     * Example API
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     */
    private String approveUntilDate;

    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch
     * baseline to apply non-security updates available in the specified
     * repository. The default value is 'false'. Applies to Linux instances
     * only.
     * </p>
     */
    private Boolean enableNonSecurity;

    /**
     * <p>
     * The patch filter group that defines the criteria for the rule.
     * </p>
     *
     * @return <p>
     *         The patch filter group that defines the criteria for the rule.
     *         </p>
     */
    public PatchFilterGroup getPatchFilterGroup() {
        return patchFilterGroup;
    }

    /**
     * <p>
     * The patch filter group that defines the criteria for the rule.
     * </p>
     *
     * @param patchFilterGroup <p>
     *            The patch filter group that defines the criteria for the rule.
     *            </p>
     */
    public void setPatchFilterGroup(PatchFilterGroup patchFilterGroup) {
        this.patchFilterGroup = patchFilterGroup;
    }

    /**
     * <p>
     * The patch filter group that defines the criteria for the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param patchFilterGroup <p>
     *            The patch filter group that defines the criteria for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchRule withPatchFilterGroup(PatchFilterGroup patchFilterGroup) {
        this.patchFilterGroup = patchFilterGroup;
        return this;
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline.
     * Valid compliance severity levels include the following: Unspecified,
     * Critical, High, Medium, Low, and Informational.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @return <p>
     *         A compliance severity level for all approved patches in a patch
     *         baseline. Valid compliance severity levels include the following:
     *         Unspecified, Critical, High, Medium, Low, and Informational.
     *         </p>
     * @see PatchComplianceLevel
     */
    public String getComplianceLevel() {
        return complianceLevel;
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline.
     * Valid compliance severity levels include the following: Unspecified,
     * Critical, High, Medium, Low, and Informational.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param complianceLevel <p>
     *            A compliance severity level for all approved patches in a
     *            patch baseline. Valid compliance severity levels include the
     *            following: Unspecified, Critical, High, Medium, Low, and
     *            Informational.
     *            </p>
     * @see PatchComplianceLevel
     */
    public void setComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline.
     * Valid compliance severity levels include the following: Unspecified,
     * Critical, High, Medium, Low, and Informational.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param complianceLevel <p>
     *            A compliance severity level for all approved patches in a
     *            patch baseline. Valid compliance severity levels include the
     *            following: Unspecified, Critical, High, Medium, Low, and
     *            Informational.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchComplianceLevel
     */
    public PatchRule withComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
        return this;
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline.
     * Valid compliance severity levels include the following: Unspecified,
     * Critical, High, Medium, Low, and Informational.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param complianceLevel <p>
     *            A compliance severity level for all approved patches in a
     *            patch baseline. Valid compliance severity levels include the
     *            following: Unspecified, Critical, High, Medium, Low, and
     *            Informational.
     *            </p>
     * @see PatchComplianceLevel
     */
    public void setComplianceLevel(PatchComplianceLevel complianceLevel) {
        this.complianceLevel = complianceLevel.toString();
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline.
     * Valid compliance severity levels include the following: Unspecified,
     * Critical, High, Medium, Low, and Informational.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param complianceLevel <p>
     *            A compliance severity level for all approved patches in a
     *            patch baseline. Valid compliance severity levels include the
     *            following: Unspecified, Critical, High, Medium, Low, and
     *            Informational.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchComplianceLevel
     */
    public PatchRule withComplianceLevel(PatchComplianceLevel complianceLevel) {
        this.complianceLevel = complianceLevel.toString();
        return this;
    }

    /**
     * <p>
     * The number of days after the release date of each patch matched by the
     * rule that the patch is marked as approved in the patch baseline. For
     * example, a value of <code>7</code> means that patches are approved seven
     * days after they are released.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The number of days after the release date of each patch matched
     *         by the rule that the patch is marked as approved in the patch
     *         baseline. For example, a value of <code>7</code> means that
     *         patches are approved seven days after they are released.
     *         </p>
     */
    public Integer getApproveAfterDays() {
        return approveAfterDays;
    }

    /**
     * <p>
     * The number of days after the release date of each patch matched by the
     * rule that the patch is marked as approved in the patch baseline. For
     * example, a value of <code>7</code> means that patches are approved seven
     * days after they are released.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param approveAfterDays <p>
     *            The number of days after the release date of each patch
     *            matched by the rule that the patch is marked as approved in
     *            the patch baseline. For example, a value of <code>7</code>
     *            means that patches are approved seven days after they are
     *            released.
     *            </p>
     */
    public void setApproveAfterDays(Integer approveAfterDays) {
        this.approveAfterDays = approveAfterDays;
    }

    /**
     * <p>
     * The number of days after the release date of each patch matched by the
     * rule that the patch is marked as approved in the patch baseline. For
     * example, a value of <code>7</code> means that patches are approved seven
     * days after they are released.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param approveAfterDays <p>
     *            The number of days after the release date of each patch
     *            matched by the rule that the patch is marked as approved in
     *            the patch baseline. For example, a value of <code>7</code>
     *            means that patches are approved seven days after they are
     *            released.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchRule withApproveAfterDays(Integer approveAfterDays) {
        this.approveAfterDays = approveAfterDays;
        return this;
    }

    /**
     * <p>
     * Example API
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @return <p>
     *         Example API
     *         </p>
     */
    public String getApproveUntilDate() {
        return approveUntilDate;
    }

    /**
     * <p>
     * Example API
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param approveUntilDate <p>
     *            Example API
     *            </p>
     */
    public void setApproveUntilDate(String approveUntilDate) {
        this.approveUntilDate = approveUntilDate;
    }

    /**
     * <p>
     * Example API
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param approveUntilDate <p>
     *            Example API
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchRule withApproveUntilDate(String approveUntilDate) {
        this.approveUntilDate = approveUntilDate;
        return this;
    }

    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch
     * baseline to apply non-security updates available in the specified
     * repository. The default value is 'false'. Applies to Linux instances
     * only.
     * </p>
     *
     * @return <p>
     *         For instances identified by the approval rule filters, enables a
     *         patch baseline to apply non-security updates available in the
     *         specified repository. The default value is 'false'. Applies to
     *         Linux instances only.
     *         </p>
     */
    public Boolean isEnableNonSecurity() {
        return enableNonSecurity;
    }

    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch
     * baseline to apply non-security updates available in the specified
     * repository. The default value is 'false'. Applies to Linux instances
     * only.
     * </p>
     *
     * @return <p>
     *         For instances identified by the approval rule filters, enables a
     *         patch baseline to apply non-security updates available in the
     *         specified repository. The default value is 'false'. Applies to
     *         Linux instances only.
     *         </p>
     */
    public Boolean getEnableNonSecurity() {
        return enableNonSecurity;
    }

    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch
     * baseline to apply non-security updates available in the specified
     * repository. The default value is 'false'. Applies to Linux instances
     * only.
     * </p>
     *
     * @param enableNonSecurity <p>
     *            For instances identified by the approval rule filters, enables
     *            a patch baseline to apply non-security updates available in
     *            the specified repository. The default value is 'false'.
     *            Applies to Linux instances only.
     *            </p>
     */
    public void setEnableNonSecurity(Boolean enableNonSecurity) {
        this.enableNonSecurity = enableNonSecurity;
    }

    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch
     * baseline to apply non-security updates available in the specified
     * repository. The default value is 'false'. Applies to Linux instances
     * only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableNonSecurity <p>
     *            For instances identified by the approval rule filters, enables
     *            a patch baseline to apply non-security updates available in
     *            the specified repository. The default value is 'false'.
     *            Applies to Linux instances only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchRule withEnableNonSecurity(Boolean enableNonSecurity) {
        this.enableNonSecurity = enableNonSecurity;
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
        if (getPatchFilterGroup() != null)
            sb.append("PatchFilterGroup: " + getPatchFilterGroup() + ",");
        if (getComplianceLevel() != null)
            sb.append("ComplianceLevel: " + getComplianceLevel() + ",");
        if (getApproveAfterDays() != null)
            sb.append("ApproveAfterDays: " + getApproveAfterDays() + ",");
        if (getApproveUntilDate() != null)
            sb.append("ApproveUntilDate: " + getApproveUntilDate() + ",");
        if (getEnableNonSecurity() != null)
            sb.append("EnableNonSecurity: " + getEnableNonSecurity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPatchFilterGroup() == null) ? 0 : getPatchFilterGroup().hashCode());
        hashCode = prime * hashCode
                + ((getComplianceLevel() == null) ? 0 : getComplianceLevel().hashCode());
        hashCode = prime * hashCode
                + ((getApproveAfterDays() == null) ? 0 : getApproveAfterDays().hashCode());
        hashCode = prime * hashCode
                + ((getApproveUntilDate() == null) ? 0 : getApproveUntilDate().hashCode());
        hashCode = prime * hashCode
                + ((getEnableNonSecurity() == null) ? 0 : getEnableNonSecurity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchRule == false)
            return false;
        PatchRule other = (PatchRule) obj;

        if (other.getPatchFilterGroup() == null ^ this.getPatchFilterGroup() == null)
            return false;
        if (other.getPatchFilterGroup() != null
                && other.getPatchFilterGroup().equals(this.getPatchFilterGroup()) == false)
            return false;
        if (other.getComplianceLevel() == null ^ this.getComplianceLevel() == null)
            return false;
        if (other.getComplianceLevel() != null
                && other.getComplianceLevel().equals(this.getComplianceLevel()) == false)
            return false;
        if (other.getApproveAfterDays() == null ^ this.getApproveAfterDays() == null)
            return false;
        if (other.getApproveAfterDays() != null
                && other.getApproveAfterDays().equals(this.getApproveAfterDays()) == false)
            return false;
        if (other.getApproveUntilDate() == null ^ this.getApproveUntilDate() == null)
            return false;
        if (other.getApproveUntilDate() != null
                && other.getApproveUntilDate().equals(this.getApproveUntilDate()) == false)
            return false;
        if (other.getEnableNonSecurity() == null ^ this.getEnableNonSecurity() == null)
            return false;
        if (other.getEnableNonSecurity() != null
                && other.getEnableNonSecurity().equals(this.getEnableNonSecurity()) == false)
            return false;
        return true;
    }
}
