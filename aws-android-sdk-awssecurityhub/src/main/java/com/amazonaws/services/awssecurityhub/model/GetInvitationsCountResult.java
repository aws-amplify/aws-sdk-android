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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class GetInvitationsCountResult implements Serializable {
    /**
     * <p>
     * The number of all membership invitations sent to this Security Hub member
     * account, not including the currently accepted invitation.
     * </p>
     */
    private Integer invitationsCount;

    /**
     * <p>
     * The number of all membership invitations sent to this Security Hub member
     * account, not including the currently accepted invitation.
     * </p>
     *
     * @return <p>
     *         The number of all membership invitations sent to this Security
     *         Hub member account, not including the currently accepted
     *         invitation.
     *         </p>
     */
    public Integer getInvitationsCount() {
        return invitationsCount;
    }

    /**
     * <p>
     * The number of all membership invitations sent to this Security Hub member
     * account, not including the currently accepted invitation.
     * </p>
     *
     * @param invitationsCount <p>
     *            The number of all membership invitations sent to this Security
     *            Hub member account, not including the currently accepted
     *            invitation.
     *            </p>
     */
    public void setInvitationsCount(Integer invitationsCount) {
        this.invitationsCount = invitationsCount;
    }

    /**
     * <p>
     * The number of all membership invitations sent to this Security Hub member
     * account, not including the currently accepted invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitationsCount <p>
     *            The number of all membership invitations sent to this Security
     *            Hub member account, not including the currently accepted
     *            invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInvitationsCountResult withInvitationsCount(Integer invitationsCount) {
        this.invitationsCount = invitationsCount;
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
        if (getInvitationsCount() != null)
            sb.append("InvitationsCount: " + getInvitationsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInvitationsCount() == null) ? 0 : getInvitationsCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInvitationsCountResult == false)
            return false;
        GetInvitationsCountResult other = (GetInvitationsCountResult) obj;

        if (other.getInvitationsCount() == null ^ this.getInvitationsCount() == null)
            return false;
        if (other.getInvitationsCount() != null
                && other.getInvitationsCount().equals(this.getInvitationsCount()) == false)
            return false;
        return true;
    }
}
