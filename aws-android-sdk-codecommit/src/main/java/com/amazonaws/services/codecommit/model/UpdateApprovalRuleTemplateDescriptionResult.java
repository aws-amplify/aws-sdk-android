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

public class UpdateApprovalRuleTemplateDescriptionResult implements Serializable {
    /**
     * <p>
     * The structure and content of the updated approval rule template.
     * </p>
     */
    private ApprovalRuleTemplate approvalRuleTemplate;

    /**
     * <p>
     * The structure and content of the updated approval rule template.
     * </p>
     *
     * @return <p>
     *         The structure and content of the updated approval rule template.
     *         </p>
     */
    public ApprovalRuleTemplate getApprovalRuleTemplate() {
        return approvalRuleTemplate;
    }

    /**
     * <p>
     * The structure and content of the updated approval rule template.
     * </p>
     *
     * @param approvalRuleTemplate <p>
     *            The structure and content of the updated approval rule
     *            template.
     *            </p>
     */
    public void setApprovalRuleTemplate(ApprovalRuleTemplate approvalRuleTemplate) {
        this.approvalRuleTemplate = approvalRuleTemplate;
    }

    /**
     * <p>
     * The structure and content of the updated approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleTemplate <p>
     *            The structure and content of the updated approval rule
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApprovalRuleTemplateDescriptionResult withApprovalRuleTemplate(
            ApprovalRuleTemplate approvalRuleTemplate) {
        this.approvalRuleTemplate = approvalRuleTemplate;
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
        if (getApprovalRuleTemplate() != null)
            sb.append("approvalRuleTemplate: " + getApprovalRuleTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApprovalRuleTemplate() == null) ? 0 : getApprovalRuleTemplate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApprovalRuleTemplateDescriptionResult == false)
            return false;
        UpdateApprovalRuleTemplateDescriptionResult other = (UpdateApprovalRuleTemplateDescriptionResult) obj;

        if (other.getApprovalRuleTemplate() == null ^ this.getApprovalRuleTemplate() == null)
            return false;
        if (other.getApprovalRuleTemplate() != null
                && other.getApprovalRuleTemplate().equals(this.getApprovalRuleTemplate()) == false)
            return false;
        return true;
    }
}
