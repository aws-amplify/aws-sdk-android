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

public class GetPullRequestApprovalStatesResult implements Serializable {
    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     */
    private java.util.List<Approval> approvals;

    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     *
     * @return <p>
     *         Information about users who have approved the pull request.
     *         </p>
     */
    public java.util.List<Approval> getApprovals() {
        return approvals;
    }

    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     *
     * @param approvals <p>
     *            Information about users who have approved the pull request.
     *            </p>
     */
    public void setApprovals(java.util.Collection<Approval> approvals) {
        if (approvals == null) {
            this.approvals = null;
            return;
        }

        this.approvals = new java.util.ArrayList<Approval>(approvals);
    }

    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvals <p>
     *            Information about users who have approved the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPullRequestApprovalStatesResult withApprovals(Approval... approvals) {
        if (getApprovals() == null) {
            this.approvals = new java.util.ArrayList<Approval>(approvals.length);
        }
        for (Approval value : approvals) {
            this.approvals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvals <p>
     *            Information about users who have approved the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPullRequestApprovalStatesResult withApprovals(java.util.Collection<Approval> approvals) {
        setApprovals(approvals);
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
        if (getApprovals() != null)
            sb.append("approvals: " + getApprovals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovals() == null) ? 0 : getApprovals().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPullRequestApprovalStatesResult == false)
            return false;
        GetPullRequestApprovalStatesResult other = (GetPullRequestApprovalStatesResult) obj;

        if (other.getApprovals() == null ^ this.getApprovals() == null)
            return false;
        if (other.getApprovals() != null
                && other.getApprovals().equals(this.getApprovals()) == false)
            return false;
        return true;
    }
}
