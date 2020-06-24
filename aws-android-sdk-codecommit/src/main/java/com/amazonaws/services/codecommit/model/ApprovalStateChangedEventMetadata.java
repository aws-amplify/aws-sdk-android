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
 * Returns information about a change in the approval state for a pull request.
 * </p>
 */
public class ApprovalStateChangedEventMetadata implements Serializable {
    /**
     * <p>
     * The revision ID of the pull request when the approval state changed.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     */
    private String approvalStatus;

    /**
     * <p>
     * The revision ID of the pull request when the approval state changed.
     * </p>
     *
     * @return <p>
     *         The revision ID of the pull request when the approval state
     *         changed.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The revision ID of the pull request when the approval state changed.
     * </p>
     *
     * @param revisionId <p>
     *            The revision ID of the pull request when the approval state
     *            changed.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision ID of the pull request when the approval state changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The revision ID of the pull request when the approval state
     *            changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalStateChangedEventMetadata withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @return <p>
     *         The approval status for the pull request.
     *         </p>
     * @see ApprovalState
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalStatus <p>
     *            The approval status for the pull request.
     *            </p>
     * @see ApprovalState
     */
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalStatus <p>
     *            The approval status for the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApprovalState
     */
    public ApprovalStateChangedEventMetadata withApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalStatus <p>
     *            The approval status for the pull request.
     *            </p>
     * @see ApprovalState
     */
    public void setApprovalStatus(ApprovalState approvalStatus) {
        this.approvalStatus = approvalStatus.toString();
    }

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalStatus <p>
     *            The approval status for the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApprovalState
     */
    public ApprovalStateChangedEventMetadata withApprovalStatus(ApprovalState approvalStatus) {
        this.approvalStatus = approvalStatus.toString();
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
        if (getRevisionId() != null)
            sb.append("revisionId: " + getRevisionId() + ",");
        if (getApprovalStatus() != null)
            sb.append("approvalStatus: " + getApprovalStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalStatus() == null) ? 0 : getApprovalStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalStateChangedEventMetadata == false)
            return false;
        ApprovalStateChangedEventMetadata other = (ApprovalStateChangedEventMetadata) obj;

        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getApprovalStatus() == null ^ this.getApprovalStatus() == null)
            return false;
        if (other.getApprovalStatus() != null
                && other.getApprovalStatus().equals(this.getApprovalStatus()) == false)
            return false;
        return true;
    }
}
