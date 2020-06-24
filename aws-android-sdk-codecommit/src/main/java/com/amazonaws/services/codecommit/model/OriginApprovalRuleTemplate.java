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
 * Returns information about the template that created the approval rule for a
 * pull request.
 * </p>
 */
public class OriginApprovalRuleTemplate implements Serializable {
    /**
     * <p>
     * The ID of the template that created the approval rule.
     * </p>
     */
    private String approvalRuleTemplateId;

    /**
     * <p>
     * The name of the template that created the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleTemplateName;

    /**
     * <p>
     * The ID of the template that created the approval rule.
     * </p>
     *
     * @return <p>
     *         The ID of the template that created the approval rule.
     *         </p>
     */
    public String getApprovalRuleTemplateId() {
        return approvalRuleTemplateId;
    }

    /**
     * <p>
     * The ID of the template that created the approval rule.
     * </p>
     *
     * @param approvalRuleTemplateId <p>
     *            The ID of the template that created the approval rule.
     *            </p>
     */
    public void setApprovalRuleTemplateId(String approvalRuleTemplateId) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
    }

    /**
     * <p>
     * The ID of the template that created the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleTemplateId <p>
     *            The ID of the template that created the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginApprovalRuleTemplate withApprovalRuleTemplateId(String approvalRuleTemplateId) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
        return this;
    }

    /**
     * <p>
     * The name of the template that created the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the template that created the approval rule.
     *         </p>
     */
    public String getApprovalRuleTemplateName() {
        return approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template that created the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the template that created the approval rule.
     *            </p>
     */
    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the template that created the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleTemplateName <p>
     *            The name of the template that created the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginApprovalRuleTemplate withApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
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
            sb.append("approvalRuleTemplateName: " + getApprovalRuleTemplateName());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginApprovalRuleTemplate == false)
            return false;
        OriginApprovalRuleTemplate other = (OriginApprovalRuleTemplate) obj;

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
        return true;
    }
}
