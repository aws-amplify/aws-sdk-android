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
 * Returns information about an approval rule template.
 * </p>
 */
public class ApprovalRuleTemplate implements Serializable {
    /**
     * <p>
     * The system-generated ID of the approval rule template.
     * </p>
     */
    private String approvalRuleTemplateId;

    /**
     * <p>
     * The name of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleTemplateName;

    /**
     * <p>
     * The description of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String approvalRuleTemplateDescription;

    /**
     * <p>
     * The content of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     */
    private String approvalRuleTemplateContent;

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule template.
     * </p>
     */
    private String ruleContentSha256;

    /**
     * <p>
     * The date the approval rule template was most recently changed, in
     * timestamp format.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The date the approval rule template was created, in timestamp format.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent
     * changes to the approval rule template.
     * </p>
     */
    private String lastModifiedUser;

    /**
     * <p>
     * The system-generated ID of the approval rule template.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the approval rule template.
     *         </p>
     */
    public String getApprovalRuleTemplateId() {
        return approvalRuleTemplateId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule template.
     * </p>
     *
     * @param approvalRuleTemplateId <p>
     *            The system-generated ID of the approval rule template.
     *            </p>
     */
    public void setApprovalRuleTemplateId(String approvalRuleTemplateId) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleTemplateId <p>
     *            The system-generated ID of the approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleTemplate withApprovalRuleTemplateId(String approvalRuleTemplateId) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
        return this;
    }

    /**
     * <p>
     * The name of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the approval rule template.
     *         </p>
     */
    public String getApprovalRuleTemplateName() {
        return approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the approval rule template.
     *            </p>
     */
    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleTemplate withApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
        return this;
    }

    /**
     * <p>
     * The description of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The description of the approval rule template.
     *         </p>
     */
    public String getApprovalRuleTemplateDescription() {
        return approvalRuleTemplateDescription;
    }

    /**
     * <p>
     * The description of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param approvalRuleTemplateDescription <p>
     *            The description of the approval rule template.
     *            </p>
     */
    public void setApprovalRuleTemplateDescription(String approvalRuleTemplateDescription) {
        this.approvalRuleTemplateDescription = approvalRuleTemplateDescription;
    }

    /**
     * <p>
     * The description of the approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param approvalRuleTemplateDescription <p>
     *            The description of the approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleTemplate withApprovalRuleTemplateDescription(
            String approvalRuleTemplateDescription) {
        this.approvalRuleTemplateDescription = approvalRuleTemplateDescription;
        return this;
    }

    /**
     * <p>
     * The content of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @return <p>
     *         The content of the approval rule template.
     *         </p>
     */
    public String getApprovalRuleTemplateContent() {
        return approvalRuleTemplateContent;
    }

    /**
     * <p>
     * The content of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param approvalRuleTemplateContent <p>
     *            The content of the approval rule template.
     *            </p>
     */
    public void setApprovalRuleTemplateContent(String approvalRuleTemplateContent) {
        this.approvalRuleTemplateContent = approvalRuleTemplateContent;
    }

    /**
     * <p>
     * The content of the approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param approvalRuleTemplateContent <p>
     *            The content of the approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleTemplate withApprovalRuleTemplateContent(String approvalRuleTemplateContent) {
        this.approvalRuleTemplateContent = approvalRuleTemplateContent;
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule template.
     * </p>
     *
     * @return <p>
     *         The SHA-256 hash signature for the content of the approval rule
     *         template.
     *         </p>
     */
    public String getRuleContentSha256() {
        return ruleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule template.
     * </p>
     *
     * @param ruleContentSha256 <p>
     *            The SHA-256 hash signature for the content of the approval
     *            rule template.
     *            </p>
     */
    public void setRuleContentSha256(String ruleContentSha256) {
        this.ruleContentSha256 = ruleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleContentSha256 <p>
     *            The SHA-256 hash signature for the content of the approval
     *            rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleTemplate withRuleContentSha256(String ruleContentSha256) {
        this.ruleContentSha256 = ruleContentSha256;
        return this;
    }

    /**
     * <p>
     * The date the approval rule template was most recently changed, in
     * timestamp format.
     * </p>
     *
     * @return <p>
     *         The date the approval rule template was most recently changed, in
     *         timestamp format.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date the approval rule template was most recently changed, in
     * timestamp format.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date the approval rule template was most recently changed,
     *            in timestamp format.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the approval rule template was most recently changed, in
     * timestamp format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date the approval rule template was most recently changed,
     *            in timestamp format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleTemplate withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The date the approval rule template was created, in timestamp format.
     * </p>
     *
     * @return <p>
     *         The date the approval rule template was created, in timestamp
     *         format.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the approval rule template was created, in timestamp format.
     * </p>
     *
     * @param creationDate <p>
     *            The date the approval rule template was created, in timestamp
     *            format.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the approval rule template was created, in timestamp format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the approval rule template was created, in timestamp
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleTemplate withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent
     * changes to the approval rule template.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who made the most
     *         recent changes to the approval rule template.
     *         </p>
     */
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent
     * changes to the approval rule template.
     * </p>
     *
     * @param lastModifiedUser <p>
     *            The Amazon Resource Name (ARN) of the user who made the most
     *            recent changes to the approval rule template.
     *            </p>
     */
    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who made the most recent
     * changes to the approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedUser <p>
     *            The Amazon Resource Name (ARN) of the user who made the most
     *            recent changes to the approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleTemplate withLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
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
        if (getApprovalRuleTemplateId() != null)
            sb.append("approvalRuleTemplateId: " + getApprovalRuleTemplateId() + ",");
        if (getApprovalRuleTemplateName() != null)
            sb.append("approvalRuleTemplateName: " + getApprovalRuleTemplateName() + ",");
        if (getApprovalRuleTemplateDescription() != null)
            sb.append("approvalRuleTemplateDescription: " + getApprovalRuleTemplateDescription()
                    + ",");
        if (getApprovalRuleTemplateContent() != null)
            sb.append("approvalRuleTemplateContent: " + getApprovalRuleTemplateContent() + ",");
        if (getRuleContentSha256() != null)
            sb.append("ruleContentSha256: " + getRuleContentSha256() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedUser() != null)
            sb.append("lastModifiedUser: " + getLastModifiedUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateId() == null) ? 0 : getApprovalRuleTemplateId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateDescription() == null) ? 0
                        : getApprovalRuleTemplateDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateContent() == null) ? 0
                        : getApprovalRuleTemplateContent().hashCode());
        hashCode = prime * hashCode
                + ((getRuleContentSha256() == null) ? 0 : getRuleContentSha256().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalRuleTemplate == false)
            return false;
        ApprovalRuleTemplate other = (ApprovalRuleTemplate) obj;

        if (other.getApprovalRuleTemplateId() == null ^ this.getApprovalRuleTemplateId() == null)
            return false;
        if (other.getApprovalRuleTemplateId() != null
                && other.getApprovalRuleTemplateId().equals(this.getApprovalRuleTemplateId()) == false)
            return false;
        if (other.getApprovalRuleTemplateName() == null
                ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null
                && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getApprovalRuleTemplateDescription() == null
                ^ this.getApprovalRuleTemplateDescription() == null)
            return false;
        if (other.getApprovalRuleTemplateDescription() != null
                && other.getApprovalRuleTemplateDescription().equals(
                        this.getApprovalRuleTemplateDescription()) == false)
            return false;
        if (other.getApprovalRuleTemplateContent() == null
                ^ this.getApprovalRuleTemplateContent() == null)
            return false;
        if (other.getApprovalRuleTemplateContent() != null
                && other.getApprovalRuleTemplateContent().equals(
                        this.getApprovalRuleTemplateContent()) == false)
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
        return true;
    }
}
