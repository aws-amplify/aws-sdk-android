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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Returns information about an approval rule.
 * </p>
 */
public class ApprovalRule implements Serializable {
    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     */
    private String approvalRuleId;

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleName;

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     */
    private String approvalRuleContent;

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule.
     * </p>
     */
    private String ruleContentSha256;

    /**
     * <p>
     * The date the approval rule was most recently changed, in timestamp
     * format.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The date the approval rule was created, in timestamp format.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent
     * changes to the approval rule.
     * </p>
     */
    private String lastModifiedUser;

    /**
     * <p>
     * The approval rule template used to create the rule.
     * </p>
     */
    private OriginApprovalRuleTemplate originApprovalRuleTemplate;

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the approval rule.
     *         </p>
     */
    public String getApprovalRuleId() {
        return approvalRuleId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     *
     * @param approvalRuleId <p>
     *            The system-generated ID of the approval rule.
     *            </p>
     */
    public void setApprovalRuleId(String approvalRuleId) {
        this.approvalRuleId = approvalRuleId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleId <p>
     *            The system-generated ID of the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRule withApprovalRuleId(String approvalRuleId) {
        this.approvalRuleId = approvalRuleId;
        return this;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the approval rule.
     *         </p>
     */
    public String getApprovalRuleName() {
        return approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleName <p>
     *            The name of the approval rule.
     *            </p>
     */
    public void setApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleName <p>
     *            The name of the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRule withApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
        return this;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @return <p>
     *         The content of the approval rule.
     *         </p>
     */
    public String getApprovalRuleContent() {
        return approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param approvalRuleContent <p>
     *            The content of the approval rule.
     *            </p>
     */
    public void setApprovalRuleContent(String approvalRuleContent) {
        this.approvalRuleContent = approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param approvalRuleContent <p>
     *            The content of the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRule withApprovalRuleContent(String approvalRuleContent) {
        this.approvalRuleContent = approvalRuleContent;
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule.
     * </p>
     *
     * @return <p>
     *         The SHA-256 hash signature for the content of the approval rule.
     *         </p>
     */
    public String getRuleContentSha256() {
        return ruleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule.
     * </p>
     *
     * @param ruleContentSha256 <p>
     *            The SHA-256 hash signature for the content of the approval
     *            rule.
     *            </p>
     */
    public void setRuleContentSha256(String ruleContentSha256) {
        this.ruleContentSha256 = ruleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleContentSha256 <p>
     *            The SHA-256 hash signature for the content of the approval
     *            rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRule withRuleContentSha256(String ruleContentSha256) {
        this.ruleContentSha256 = ruleContentSha256;
        return this;
    }

    /**
     * <p>
     * The date the approval rule was most recently changed, in timestamp
     * format.
     * </p>
     *
     * @return <p>
     *         The date the approval rule was most recently changed, in
     *         timestamp format.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date the approval rule was most recently changed, in timestamp
     * format.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date the approval rule was most recently changed, in
     *            timestamp format.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the approval rule was most recently changed, in timestamp
     * format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date the approval rule was most recently changed, in
     *            timestamp format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRule withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The date the approval rule was created, in timestamp format.
     * </p>
     *
     * @return <p>
     *         The date the approval rule was created, in timestamp format.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the approval rule was created, in timestamp format.
     * </p>
     *
     * @param creationDate <p>
     *            The date the approval rule was created, in timestamp format.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the approval rule was created, in timestamp format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the approval rule was created, in timestamp format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRule withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent
     * changes to the approval rule.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who made the most
     *         recent changes to the approval rule.
     *         </p>
     */
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent
     * changes to the approval rule.
     * </p>
     *
     * @param lastModifiedUser <p>
     *            The Amazon Resource Name (ARN) of the user who made the most
     *            recent changes to the approval rule.
     *            </p>
     */
    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent
     * changes to the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedUser <p>
     *            The Amazon Resource Name (ARN) of the user who made the most
     *            recent changes to the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRule withLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
        return this;
    }

    /**
     * <p>
     * The approval rule template used to create the rule.
     * </p>
     *
     * @return <p>
     *         The approval rule template used to create the rule.
     *         </p>
     */
    public OriginApprovalRuleTemplate getOriginApprovalRuleTemplate() {
        return originApprovalRuleTemplate;
    }

    /**
     * <p>
     * The approval rule template used to create the rule.
     * </p>
     *
     * @param originApprovalRuleTemplate <p>
     *            The approval rule template used to create the rule.
     *            </p>
     */
    public void setOriginApprovalRuleTemplate(OriginApprovalRuleTemplate originApprovalRuleTemplate) {
        this.originApprovalRuleTemplate = originApprovalRuleTemplate;
    }

    /**
     * <p>
     * The approval rule template used to create the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originApprovalRuleTemplate <p>
     *            The approval rule template used to create the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRule withOriginApprovalRuleTemplate(
            OriginApprovalRuleTemplate originApprovalRuleTemplate) {
        this.originApprovalRuleTemplate = originApprovalRuleTemplate;
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
        if (getApprovalRuleId() != null)
            sb.append("approvalRuleId: " + getApprovalRuleId() + ",");
        if (getApprovalRuleName() != null)
            sb.append("approvalRuleName: " + getApprovalRuleName() + ",");
        if (getApprovalRuleContent() != null)
            sb.append("approvalRuleContent: " + getApprovalRuleContent() + ",");
        if (getRuleContentSha256() != null)
            sb.append("ruleContentSha256: " + getRuleContentSha256() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedUser() != null)
            sb.append("lastModifiedUser: " + getLastModifiedUser() + ",");
        if (getOriginApprovalRuleTemplate() != null)
            sb.append("originApprovalRuleTemplate: " + getOriginApprovalRuleTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApprovalRuleId() == null) ? 0 : getApprovalRuleId().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRuleName() == null) ? 0 : getApprovalRuleName().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRuleContent() == null) ? 0 : getApprovalRuleContent().hashCode());
        hashCode = prime * hashCode
                + ((getRuleContentSha256() == null) ? 0 : getRuleContentSha256().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        hashCode = prime
                * hashCode
                + ((getOriginApprovalRuleTemplate() == null) ? 0 : getOriginApprovalRuleTemplate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalRule == false)
            return false;
        ApprovalRule other = (ApprovalRule) obj;

        if (other.getApprovalRuleId() == null ^ this.getApprovalRuleId() == null)
            return false;
        if (other.getApprovalRuleId() != null
                && other.getApprovalRuleId().equals(this.getApprovalRuleId()) == false)
            return false;
        if (other.getApprovalRuleName() == null ^ this.getApprovalRuleName() == null)
            return false;
        if (other.getApprovalRuleName() != null
                && other.getApprovalRuleName().equals(this.getApprovalRuleName()) == false)
            return false;
        if (other.getApprovalRuleContent() == null ^ this.getApprovalRuleContent() == null)
            return false;
        if (other.getApprovalRuleContent() != null
                && other.getApprovalRuleContent().equals(this.getApprovalRuleContent()) == false)
            return false;
        if (other.getRuleContentSha256() == null ^ this.getRuleContentSha256() == null)
            return false;
        if (other.getRuleContentSha256() != null
                && other.getRuleContentSha256().equals(this.getRuleContentSha256()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedUser() == null ^ this.getLastModifiedUser() == null)
            return false;
        if (other.getLastModifiedUser() != null
                && other.getLastModifiedUser().equals(this.getLastModifiedUser()) == false)
            return false;
        if (other.getOriginApprovalRuleTemplate() == null
                ^ this.getOriginApprovalRuleTemplate() == null)
            return false;
        if (other.getOriginApprovalRuleTemplate() != null
                && other.getOriginApprovalRuleTemplate().equals(
                        this.getOriginApprovalRuleTemplate()) == false)
            return false;
        return true;
    }
}
