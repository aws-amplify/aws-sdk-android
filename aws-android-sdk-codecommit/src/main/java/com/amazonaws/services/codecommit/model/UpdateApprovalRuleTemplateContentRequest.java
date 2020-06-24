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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the content of an approval rule template. You can change the number
 * of required approvals, the membership of the approval rule, and whether an
 * approval pool is defined.
 * </p>
 */
public class UpdateApprovalRuleTemplateContentRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the approval rule template where you want to update the
     * content of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleTemplateName;

    /**
     * <p>
     * The content that replaces the existing content of the rule. Content
     * statements must be complete. You cannot provide only the changes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     */
    private String newRuleContent;

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can
     * retrieve this information by using <a>GetPullRequest</a>.
     * </p>
     */
    private String existingRuleContentSha256;

    /**
     * <p>
     * The name of the approval rule template where you want to update the
     * content of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the approval rule template where you want to update
     *         the content of the rule.
     *         </p>
     */
    public String getApprovalRuleTemplateName() {
        return approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template where you want to update the
     * content of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the approval rule template where you want to
     *            update the content of the rule.
     *            </p>
     */
    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template where you want to update the
     * content of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the approval rule template where you want to
     *            update the content of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApprovalRuleTemplateContentRequest withApprovalRuleTemplateName(
            String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
        return this;
    }

    /**
     * <p>
     * The content that replaces the existing content of the rule. Content
     * statements must be complete. You cannot provide only the changes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @return <p>
     *         The content that replaces the existing content of the rule.
     *         Content statements must be complete. You cannot provide only the
     *         changes.
     *         </p>
     */
    public String getNewRuleContent() {
        return newRuleContent;
    }

    /**
     * <p>
     * The content that replaces the existing content of the rule. Content
     * statements must be complete. You cannot provide only the changes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param newRuleContent <p>
     *            The content that replaces the existing content of the rule.
     *            Content statements must be complete. You cannot provide only
     *            the changes.
     *            </p>
     */
    public void setNewRuleContent(String newRuleContent) {
        this.newRuleContent = newRuleContent;
    }

    /**
     * <p>
     * The content that replaces the existing content of the rule. Content
     * statements must be complete. You cannot provide only the changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param newRuleContent <p>
     *            The content that replaces the existing content of the rule.
     *            Content statements must be complete. You cannot provide only
     *            the changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApprovalRuleTemplateContentRequest withNewRuleContent(String newRuleContent) {
        this.newRuleContent = newRuleContent;
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can
     * retrieve this information by using <a>GetPullRequest</a>.
     * </p>
     *
     * @return <p>
     *         The SHA-256 hash signature for the content of the approval rule.
     *         You can retrieve this information by using <a>GetPullRequest</a>.
     *         </p>
     */
    public String getExistingRuleContentSha256() {
        return existingRuleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can
     * retrieve this information by using <a>GetPullRequest</a>.
     * </p>
     *
     * @param existingRuleContentSha256 <p>
     *            The SHA-256 hash signature for the content of the approval
     *            rule. You can retrieve this information by using
     *            <a>GetPullRequest</a>.
     *            </p>
     */
    public void setExistingRuleContentSha256(String existingRuleContentSha256) {
        this.existingRuleContentSha256 = existingRuleContentSha256;
    }

    /**
     * <p>
     * The SHA-256 hash signature for the content of the approval rule. You can
     * retrieve this information by using <a>GetPullRequest</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param existingRuleContentSha256 <p>
     *            The SHA-256 hash signature for the content of the approval
     *            rule. You can retrieve this information by using
     *            <a>GetPullRequest</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApprovalRuleTemplateContentRequest withExistingRuleContentSha256(
            String existingRuleContentSha256) {
        this.existingRuleContentSha256 = existingRuleContentSha256;
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
        if (getApprovalRuleTemplateName() != null)
            sb.append("approvalRuleTemplateName: " + getApprovalRuleTemplateName() + ",");
        if (getNewRuleContent() != null)
            sb.append("newRuleContent: " + getNewRuleContent() + ",");
        if (getExistingRuleContentSha256() != null)
            sb.append("existingRuleContentSha256: " + getExistingRuleContentSha256());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNewRuleContent() == null) ? 0 : getNewRuleContent().hashCode());
        hashCode = prime
                * hashCode
                + ((getExistingRuleContentSha256() == null) ? 0 : getExistingRuleContentSha256()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApprovalRuleTemplateContentRequest == false)
            return false;
        UpdateApprovalRuleTemplateContentRequest other = (UpdateApprovalRuleTemplateContentRequest) obj;

        if (other.getApprovalRuleTemplateName() == null
                ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null
                && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getNewRuleContent() == null ^ this.getNewRuleContent() == null)
            return false;
        if (other.getNewRuleContent() != null
                && other.getNewRuleContent().equals(this.getNewRuleContent()) == false)
            return false;
        if (other.getExistingRuleContentSha256() == null
                ^ this.getExistingRuleContentSha256() == null)
            return false;
        if (other.getExistingRuleContentSha256() != null
                && other.getExistingRuleContentSha256().equals(this.getExistingRuleContentSha256()) == false)
            return false;
        return true;
    }
}
