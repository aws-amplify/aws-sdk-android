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
 * Updates the state of a user's approval on a pull request. The user is derived
 * from the signed-in account when the request is made.
 * </p>
 */
public class UpdatePullRequestApprovalStateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The system-generated ID of the revision.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The approval state to associate with the user on the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     */
    private String approvalState;

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the pull request.
     *         </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request.
     *            </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePullRequestApprovalStateRequest withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The system-generated ID of the revision.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the revision.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The system-generated ID of the revision.
     * </p>
     *
     * @param revisionId <p>
     *            The system-generated ID of the revision.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The system-generated ID of the revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The system-generated ID of the revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePullRequestApprovalStateRequest withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    /**
     * <p>
     * The approval state to associate with the user on the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @return <p>
     *         The approval state to associate with the user on the pull
     *         request.
     *         </p>
     * @see ApprovalState
     */
    public String getApprovalState() {
        return approvalState;
    }

    /**
     * <p>
     * The approval state to associate with the user on the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalState <p>
     *            The approval state to associate with the user on the pull
     *            request.
     *            </p>
     * @see ApprovalState
     */
    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState;
    }

    /**
     * <p>
     * The approval state to associate with the user on the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalState <p>
     *            The approval state to associate with the user on the pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApprovalState
     */
    public UpdatePullRequestApprovalStateRequest withApprovalState(String approvalState) {
        this.approvalState = approvalState;
        return this;
    }

    /**
     * <p>
     * The approval state to associate with the user on the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalState <p>
     *            The approval state to associate with the user on the pull
     *            request.
     *            </p>
     * @see ApprovalState
     */
    public void setApprovalState(ApprovalState approvalState) {
        this.approvalState = approvalState.toString();
    }

    /**
     * <p>
     * The approval state to associate with the user on the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalState <p>
     *            The approval state to associate with the user on the pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApprovalState
     */
    public UpdatePullRequestApprovalStateRequest withApprovalState(ApprovalState approvalState) {
        this.approvalState = approvalState.toString();
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
        if (getRevisionId() != null)
            sb.append("revisionId: " + getRevisionId() + ",");
        if (getApprovalState() != null)
            sb.append("approvalState: " + getApprovalState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalState() == null) ? 0 : getApprovalState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePullRequestApprovalStateRequest == false)
            return false;
        UpdatePullRequestApprovalStateRequest other = (UpdatePullRequestApprovalStateRequest) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getApprovalState() == null ^ this.getApprovalState() == null)
            return false;
        if (other.getApprovalState() != null
                && other.getApprovalState().equals(this.getApprovalState()) == false)
            return false;
        return true;
    }
}
