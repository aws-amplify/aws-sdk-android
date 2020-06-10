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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about an Amazon Macie membership invitation that was
 * received by an account.
 * </p>
 */
public class Invitation implements Serializable {
    /**
     * <p>
     * The AWS account ID for the account that sent the invitation.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The unique identifier for the invitation. Amazon Macie uses this
     * identifier to validate the inviter account with the invitee account.
     * </p>
     */
    private String invitationId;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the
     * invitation was sent.
     * </p>
     */
    private java.util.Date invitedAt;

    /**
     * <p>
     * The status of the relationship between the account that sent the
     * invitation (<i>inviter account</i>) and the account that received the
     * invitation (<i>invitee account</i>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     */
    private String relationshipStatus;

    /**
     * <p>
     * The AWS account ID for the account that sent the invitation.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the account that sent the invitation.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The AWS account ID for the account that sent the invitation.
     * </p>
     *
     * @param accountId <p>
     *            The AWS account ID for the account that sent the invitation.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID for the account that sent the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The AWS account ID for the account that sent the invitation.
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
     * The unique identifier for the invitation. Amazon Macie uses this
     * identifier to validate the inviter account with the invitee account.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the invitation. Amazon Macie uses this
     *         identifier to validate the inviter account with the invitee
     *         account.
     *         </p>
     */
    public String getInvitationId() {
        return invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation. Amazon Macie uses this
     * identifier to validate the inviter account with the invitee account.
     * </p>
     *
     * @param invitationId <p>
     *            The unique identifier for the invitation. Amazon Macie uses
     *            this identifier to validate the inviter account with the
     *            invitee account.
     *            </p>
     */
    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation. Amazon Macie uses this
     * identifier to validate the inviter account with the invitee account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitationId <p>
     *            The unique identifier for the invitation. Amazon Macie uses
     *            this identifier to validate the inviter account with the
     *            invitee account.
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
     * The date and time, in UTC and extended ISO 8601 format, when the
     * invitation was sent.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         invitation was sent.
     *         </p>
     */
    public java.util.Date getInvitedAt() {
        return invitedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the
     * invitation was sent.
     * </p>
     *
     * @param invitedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the invitation was sent.
     *            </p>
     */
    public void setInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the
     * invitation was sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the invitation was sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invitation withInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the account that sent the
     * invitation (<i>inviter account</i>) and the account that received the
     * invitation (<i>invitee account</i>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @return <p>
     *         The status of the relationship between the account that sent the
     *         invitation (<i>inviter account</i>) and the account that received
     *         the invitation (<i>invitee account</i>).
     *         </p>
     * @see RelationshipStatus
     */
    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the account that sent the
     * invitation (<i>inviter account</i>) and the account that received the
     * invitation (<i>invitee account</i>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @param relationshipStatus <p>
     *            The status of the relationship between the account that sent
     *            the invitation (<i>inviter account</i>) and the account that
     *            received the invitation (<i>invitee account</i>).
     *            </p>
     * @see RelationshipStatus
     */
    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the account that sent the
     * invitation (<i>inviter account</i>) and the account that received the
     * invitation (<i>invitee account</i>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @param relationshipStatus <p>
     *            The status of the relationship between the account that sent
     *            the invitation (<i>inviter account</i>) and the account that
     *            received the invitation (<i>invitee account</i>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipStatus
     */
    public Invitation withRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the account that sent the
     * invitation (<i>inviter account</i>) and the account that received the
     * invitation (<i>invitee account</i>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @param relationshipStatus <p>
     *            The status of the relationship between the account that sent
     *            the invitation (<i>inviter account</i>) and the account that
     *            received the invitation (<i>invitee account</i>).
     *            </p>
     * @see RelationshipStatus
     */
    public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus.toString();
    }

    /**
     * <p>
     * The status of the relationship between the account that sent the
     * invitation (<i>inviter account</i>) and the account that received the
     * invitation (<i>invitee account</i>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @param relationshipStatus <p>
     *            The status of the relationship between the account that sent
     *            the invitation (<i>inviter account</i>) and the account that
     *            received the invitation (<i>invitee account</i>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipStatus
     */
    public Invitation withRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus.toString();
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
            sb.append("accountId: " + getAccountId() + ",");
        if (getInvitationId() != null)
            sb.append("invitationId: " + getInvitationId() + ",");
        if (getInvitedAt() != null)
            sb.append("invitedAt: " + getInvitedAt() + ",");
        if (getRelationshipStatus() != null)
            sb.append("relationshipStatus: " + getRelationshipStatus());
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
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        hashCode = prime * hashCode
                + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
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
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null
                && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null
                && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
            return false;
        return true;
    }
}
