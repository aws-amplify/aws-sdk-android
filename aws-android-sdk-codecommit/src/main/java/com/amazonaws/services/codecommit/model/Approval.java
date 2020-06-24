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
 * Returns information about a specific approval on a pull request.
 * </p>
 */
public class Approval implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     */
    private String userArn;

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not
     * stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     */
    private String approvalState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user.
     *         </p>
     */
    public String getUserArn() {
        return userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     *
     * @param userArn <p>
     *            The Amazon Resource Name (ARN) of the user.
     *            </p>
     */
    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userArn <p>
     *            The Amazon Resource Name (ARN) of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Approval withUserArn(String userArn) {
        this.userArn = userArn;
        return this;
    }

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not
     * stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @return <p>
     *         The state of the approval, APPROVE or REVOKE. REVOKE states are
     *         not stored.
     *         </p>
     * @see ApprovalState
     */
    public String getApprovalState() {
        return approvalState;
    }

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not
     * stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalState <p>
     *            The state of the approval, APPROVE or REVOKE. REVOKE states
     *            are not stored.
     *            </p>
     * @see ApprovalState
     */
    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState;
    }

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not
     * stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalState <p>
     *            The state of the approval, APPROVE or REVOKE. REVOKE states
     *            are not stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApprovalState
     */
    public Approval withApprovalState(String approvalState) {
        this.approvalState = approvalState;
        return this;
    }

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not
     * stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalState <p>
     *            The state of the approval, APPROVE or REVOKE. REVOKE states
     *            are not stored.
     *            </p>
     * @see ApprovalState
     */
    public void setApprovalState(ApprovalState approvalState) {
        this.approvalState = approvalState.toString();
    }

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not
     * stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPROVE, REVOKE
     *
     * @param approvalState <p>
     *            The state of the approval, APPROVE or REVOKE. REVOKE states
     *            are not stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApprovalState
     */
    public Approval withApprovalState(ApprovalState approvalState) {
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
        if (getUserArn() != null)
            sb.append("userArn: " + getUserArn() + ",");
        if (getApprovalState() != null)
            sb.append("approvalState: " + getApprovalState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
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

        if (obj instanceof Approval == false)
            return false;
        Approval other = (Approval) obj;

        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getApprovalState() == null ^ this.getApprovalState() == null)
            return false;
        if (other.getApprovalState() != null
                && other.getApprovalState().equals(this.getApprovalState()) == false)
            return false;
        return true;
    }
}
