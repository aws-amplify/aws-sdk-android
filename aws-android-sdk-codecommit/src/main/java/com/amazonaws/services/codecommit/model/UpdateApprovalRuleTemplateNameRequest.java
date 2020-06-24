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
 * Updates the name of a specified approval rule template.
 * </p>
 */
public class UpdateApprovalRuleTemplateNameRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The current name of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String oldApprovalRuleTemplateName;

    /**
     * <p>
     * The new name you want to apply to the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String newApprovalRuleTemplateName;

    /**
     * <p>
     * The current name of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The current name of the approval rule template.
     *         </p>
     */
    public String getOldApprovalRuleTemplateName() {
        return oldApprovalRuleTemplateName;
    }

    /**
     * <p>
     * The current name of the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param oldApprovalRuleTemplateName <p>
     *            The current name of the approval rule template.
     *            </p>
     */
    public void setOldApprovalRuleTemplateName(String oldApprovalRuleTemplateName) {
        this.oldApprovalRuleTemplateName = oldApprovalRuleTemplateName;
    }

    /**
     * <p>
     * The current name of the approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param oldApprovalRuleTemplateName <p>
     *            The current name of the approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApprovalRuleTemplateNameRequest withOldApprovalRuleTemplateName(
            String oldApprovalRuleTemplateName) {
        this.oldApprovalRuleTemplateName = oldApprovalRuleTemplateName;
        return this;
    }

    /**
     * <p>
     * The new name you want to apply to the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The new name you want to apply to the approval rule template.
     *         </p>
     */
    public String getNewApprovalRuleTemplateName() {
        return newApprovalRuleTemplateName;
    }

    /**
     * <p>
     * The new name you want to apply to the approval rule template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param newApprovalRuleTemplateName <p>
     *            The new name you want to apply to the approval rule template.
     *            </p>
     */
    public void setNewApprovalRuleTemplateName(String newApprovalRuleTemplateName) {
        this.newApprovalRuleTemplateName = newApprovalRuleTemplateName;
    }

    /**
     * <p>
     * The new name you want to apply to the approval rule template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param newApprovalRuleTemplateName <p>
     *            The new name you want to apply to the approval rule template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApprovalRuleTemplateNameRequest withNewApprovalRuleTemplateName(
            String newApprovalRuleTemplateName) {
        this.newApprovalRuleTemplateName = newApprovalRuleTemplateName;
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
        if (getOldApprovalRuleTemplateName() != null)
            sb.append("oldApprovalRuleTemplateName: " + getOldApprovalRuleTemplateName() + ",");
        if (getNewApprovalRuleTemplateName() != null)
            sb.append("newApprovalRuleTemplateName: " + getNewApprovalRuleTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOldApprovalRuleTemplateName() == null) ? 0
                        : getOldApprovalRuleTemplateName().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewApprovalRuleTemplateName() == null) ? 0
                        : getNewApprovalRuleTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApprovalRuleTemplateNameRequest == false)
            return false;
        UpdateApprovalRuleTemplateNameRequest other = (UpdateApprovalRuleTemplateNameRequest) obj;

        if (other.getOldApprovalRuleTemplateName() == null
                ^ this.getOldApprovalRuleTemplateName() == null)
            return false;
        if (other.getOldApprovalRuleTemplateName() != null
                && other.getOldApprovalRuleTemplateName().equals(
                        this.getOldApprovalRuleTemplateName()) == false)
            return false;
        if (other.getNewApprovalRuleTemplateName() == null
                ^ this.getNewApprovalRuleTemplateName() == null)
            return false;
        if (other.getNewApprovalRuleTemplateName() != null
                && other.getNewApprovalRuleTemplateName().equals(
                        this.getNewApprovalRuleTemplateName()) == false)
            return false;
        return true;
    }
}
