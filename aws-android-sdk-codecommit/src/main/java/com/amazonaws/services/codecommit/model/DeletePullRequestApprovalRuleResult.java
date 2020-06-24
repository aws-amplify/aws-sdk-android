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

public class DeletePullRequestApprovalRuleResult implements Serializable {
    /**
     * <p>
     * The ID of the deleted approval rule.
     * </p>
     * <note>
     * <p>
     * If the approval rule was deleted in an earlier API call, the response is
     * 200 OK without content.
     * </p>
     * </note>
     */
    private String approvalRuleId;

    /**
     * <p>
     * The ID of the deleted approval rule.
     * </p>
     * <note>
     * <p>
     * If the approval rule was deleted in an earlier API call, the response is
     * 200 OK without content.
     * </p>
     * </note>
     *
     * @return <p>
     *         The ID of the deleted approval rule.
     *         </p>
     *         <note>
     *         <p>
     *         If the approval rule was deleted in an earlier API call, the
     *         response is 200 OK without content.
     *         </p>
     *         </note>
     */
    public String getApprovalRuleId() {
        return approvalRuleId;
    }

    /**
     * <p>
     * The ID of the deleted approval rule.
     * </p>
     * <note>
     * <p>
     * If the approval rule was deleted in an earlier API call, the response is
     * 200 OK without content.
     * </p>
     * </note>
     *
     * @param approvalRuleId <p>
     *            The ID of the deleted approval rule.
     *            </p>
     *            <note>
     *            <p>
     *            If the approval rule was deleted in an earlier API call, the
     *            response is 200 OK without content.
     *            </p>
     *            </note>
     */
    public void setApprovalRuleId(String approvalRuleId) {
        this.approvalRuleId = approvalRuleId;
    }

    /**
     * <p>
     * The ID of the deleted approval rule.
     * </p>
     * <note>
     * <p>
     * If the approval rule was deleted in an earlier API call, the response is
     * 200 OK without content.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleId <p>
     *            The ID of the deleted approval rule.
     *            </p>
     *            <note>
     *            <p>
     *            If the approval rule was deleted in an earlier API call, the
     *            response is 200 OK without content.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletePullRequestApprovalRuleResult withApprovalRuleId(String approvalRuleId) {
        this.approvalRuleId = approvalRuleId;
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
            sb.append("approvalRuleId: " + getApprovalRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApprovalRuleId() == null) ? 0 : getApprovalRuleId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePullRequestApprovalRuleResult == false)
            return false;
        DeletePullRequestApprovalRuleResult other = (DeletePullRequestApprovalRuleResult) obj;

        if (other.getApprovalRuleId() == null ^ this.getApprovalRuleId() == null)
            return false;
        if (other.getApprovalRuleId() != null
                && other.getApprovalRuleId().equals(this.getApprovalRuleId()) == false)
            return false;
        return true;
    }
}
