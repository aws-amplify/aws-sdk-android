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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the invitation to become a member account.
 * </p>
 */
public class Invitation implements Serializable {
    /**
     * <p>
     * The ID of the account that the invitation was sent from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     */
    private String accountId;

    /**
     * <p>
     * The ID of the invitation. This value is used to validate the inviter
     * account to the member account.
     * </p>
     */
    private String invitationId;

    /**
     * <p>
     * The status of the relationship between the inviter and invitee accounts.
     * </p>
     */
    private String relationshipStatus;

    /**
     * <p>
     * The timestamp when the invitation was sent.
     * </p>
     */
    private String invitedAt;

    /**
     * <p>
     * The ID of the account that the invitation was sent from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @return <p>
     *         The ID of the account that the invitation was sent from.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The ID of the account that the invitation was sent from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param accountId <p>
     *            The ID of the account that the invitation was sent from.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the account that the invitation was sent from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param accountId <p>
     *            The ID of the account that the invitation was sent from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invitation withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The ID of the invitation. This value is used to validate the inviter
     * account to the member account.
     * </p>
     *
     * @return <p>
     *         The ID of the invitation. This value is used to validate the
     *         inviter account to the member account.
     *         </p>
     */
    public String getInvitationId() {
        return invitationId;
    }

    /**
     * <p>
     * The ID of the invitation. This value is used to validate the inviter
     * account to the member account.
     * </p>
     *
     * @param invitationId <p>
     *            The ID of the invitation. This value is used to validate the
     *            inviter account to the member account.
     *            </p>
     */
    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The ID of the invitation. This value is used to validate the inviter
     * account to the member account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitationId <p>
     *            The ID of the invitation. This value is used to validate the
     *            inviter account to the member account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invitation withInvitationId(String invitationId) {
        this.invitationId = invitationId;
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the inviter and invitee accounts.
     * </p>
     *
     * @return <p>
     *         The status of the relationship between the inviter and invitee
     *         accounts.
     *         </p>
     */
    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the inviter and invitee accounts.
     * </p>
     *
     * @param relationshipStatus <p>
     *            The status of the relationship between the inviter and invitee
     *            accounts.
     *            </p>
     */
    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the inviter and invitee accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationshipStatus <p>
     *            The status of the relationship between the inviter and invitee
     *            accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invitation withRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
        return this;
    }

    /**
     * <p>
     * The timestamp when the invitation was sent.
     * </p>
     *
     * @return <p>
     *         The timestamp when the invitation was sent.
     *         </p>
     */
    public String getInvitedAt() {
        return invitedAt;
    }

    /**
     * <p>
     * The timestamp when the invitation was sent.
     * </p>
     *
     * @param invitedAt <p>
     *            The timestamp when the invitation was sent.
     *            </p>
     */
    public void setInvitedAt(String invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * The timestamp when the invitation was sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitedAt <p>
     *            The timestamp when the invitation was sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invitation withInvitedAt(String invitedAt) {
        this.invitedAt = invitedAt;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getInvitationId() != null)
            sb.append("InvitationId: " + getInvitationId() + ",");
        if (getRelationshipStatus() != null)
            sb.append("RelationshipStatus: " + getRelationshipStatus() + ",");
        if (getInvitedAt() != null)
            sb.append("InvitedAt: " + getInvitedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        hashCode = prime * hashCode
                + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Invitation == false)
            return false;
        Invitation other = (Invitation) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null
                && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null
                && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
            return false;
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null
                && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        return true;
    }
}
