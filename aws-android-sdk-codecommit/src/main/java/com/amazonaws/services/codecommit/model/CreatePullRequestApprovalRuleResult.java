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

public class CreatePullRequestApprovalRuleResult implements Serializable {
    /**
     * <p>
     * Information about the created approval rule.
     * </p>
     */
    private ApprovalRule approvalRule;

    /**
     * <p>
     * Information about the created approval rule.
     * </p>
     *
     * @return <p>
     *         Information about the created approval rule.
     *         </p>
     */
    public ApprovalRule getApprovalRule() {
        return approvalRule;
    }

    /**
     * <p>
     * Information about the created approval rule.
     * </p>
     *
     * @param approvalRule <p>
     *            Information about the created approval rule.
     *            </p>
     */
    public void setApprovalRule(ApprovalRule approvalRule) {
        this.approvalRule = approvalRule;
    }

    /**
     * <p>
     * Information about the created approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRule <p>
     *            Information about the created approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePullRequestApprovalRuleResult withApprovalRule(ApprovalRule approvalRule) {
        this.approvalRule = approvalRule;
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
        if (getApprovalRule() != null)
            sb.append("approvalRule: " + getApprovalRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApprovalRule() == null) ? 0 : getApprovalRule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePullRequestApprovalRuleResult == false)
            return false;
        CreatePullRequestApprovalRuleResult other = (CreatePullRequestApprovalRuleResult) obj;

        if (other.getApprovalRule() == null ^ this.getApprovalRule() == null)
            return false;
        if (other.getApprovalRule() != null
                && other.getApprovalRule().equals(this.getApprovalRule()) == false)
            return false;
        return true;
    }
}
