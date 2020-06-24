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

public class DeleteApprovalRuleTemplateResult implements Serializable {
    /**
     * <p>
     * The system-generated ID of the deleted approval rule template. If the
     * template has been previously deleted, the only response is a 200 OK.
     * </p>
     */
    private String approvalRuleTemplateId;

    /**
     * <p>
     * The system-generated ID of the deleted approval rule template. If the
     * template has been previously deleted, the only response is a 200 OK.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the deleted approval rule template. If
     *         the template has been previously deleted, the only response is a
     *         200 OK.
     *         </p>
     */
    public String getApprovalRuleTemplateId() {
        return approvalRuleTemplateId;
    }

    /**
     * <p>
     * The system-generated ID of the deleted approval rule template. If the
     * template has been previously deleted, the only response is a 200 OK.
     * </p>
     *
     * @param approvalRuleTemplateId <p>
     *            The system-generated ID of the deleted approval rule template.
     *            If the template has been previously deleted, the only response
     *            is a 200 OK.
     *            </p>
     */
    public void setApprovalRuleTemplateId(String approvalRuleTemplateId) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
    }

    /**
     * <p>
     * The system-generated ID of the deleted approval rule template. If the
     * template has been previously deleted, the only response is a 200 OK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleTemplateId <p>
     *            The system-generated ID of the deleted approval rule template.
     *            If the template has been previously deleted, the only response
     *            is a 200 OK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteApprovalRuleTemplateResult withApprovalRuleTemplateId(String approvalRuleTemplateId) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
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
            sb.append("approvalRuleTemplateId: " + getApprovalRuleTemplateId());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApprovalRuleTemplateResult == false)
            return false;
        DeleteApprovalRuleTemplateResult other = (DeleteApprovalRuleTemplateResult) obj;

        if (other.getApprovalRuleTemplateId() == null ^ this.getApprovalRuleTemplateId() == null)
            return false;
        if (other.getApprovalRuleTemplateId() != null
                && other.getApprovalRuleTemplateId().equals(this.getApprovalRuleTemplateId()) == false)
            return false;
        return true;
    }
}
