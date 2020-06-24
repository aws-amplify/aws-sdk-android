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
 * Deletes an approval rule from a specified pull request. Approval rules can be
 * deleted from a pull request only if the pull request is open, and if the
 * approval rule was created specifically for a pull request and not generated
 * from an approval rule template associated with the repository where the pull
 * request was created. You cannot delete an approval rule from a merged or
 * closed pull request.
 * </p>
 */
public class DeletePullRequestApprovalRuleRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request that contains the approval
     * rule you want to delete.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The name of the approval rule you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleName;

    /**
     * <p>
     * The system-generated ID of the pull request that contains the approval
     * rule you want to delete.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the pull request that contains the
     *         approval rule you want to delete.
     *         </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request that contains the approval
     * rule you want to delete.
     * </p>
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request that contains the
     *            approval rule you want to delete.
     *            </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request that contains the approval
     * rule you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request that contains the
     *            approval rule you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletePullRequestApprovalRuleRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The name of the approval rule you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the approval rule you want to delete.
     *         </p>
     */
    public String getApprovalRuleName() {
        return approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleName <p>
     *            The name of the approval rule you want to delete.
     *            </p>
     */
    public void setApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleName <p>
     *            The name of the approval rule you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletePullRequestApprovalRuleRequest withApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
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
        if (getPullRequestId() != null)
            sb.append("pullRequestId: " + getPullRequestId() + ",");
        if (getApprovalRuleName() != null)
            sb.append("approvalRuleName: " + getApprovalRuleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRuleName() == null) ? 0 : getApprovalRuleName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePullRequestApprovalRuleRequest == false)
            return false;
        DeletePullRequestApprovalRuleRequest other = (DeletePullRequestApprovalRuleRequest) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getApprovalRuleName() == null ^ this.getApprovalRuleName() == null)
            return false;
        if (other.getApprovalRuleName() != null
                && other.getApprovalRuleName().equals(this.getApprovalRuleName()) == false)
            return false;
        return true;
    }
}
