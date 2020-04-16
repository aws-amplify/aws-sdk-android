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

/**
 * <p>
 * Details about an invitation.
 * </p>
 */
public class Invitation implements Serializable {
    /**
     * <p>
     * The account ID of the Security Hub master account that the invitation was
     * sent from.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The ID of the invitation sent to the member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String invitationId;

    /**
     * <p>
     * The timestamp of when the invitation was sent.
     * </p>
     */
    private java.util.Date invitedAt;

    /**
     * <p>
     * The current status of the association between the member and master
     * accounts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String memberStatus;

    /**
     * <p>
     * The account ID of the Security Hub master account that the invitation was
     * sent from.
     * </p>
     *
     * @return <p>
     *         The account ID of the Security Hub master account that the
     *         invitation was sent from.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account ID of the Security Hub master account that the invitation was
     * sent from.
     * </p>
     *
     * @param accountId <p>
     *            The account ID of the Security Hub master account that the
     *            invitation was sent from.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of the Security Hub master account that the invitation was
     * sent from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The account ID of the Security Hub master account that the
     *            invitation was sent from.
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
     * The ID of the invitation sent to the member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the invitation sent to the member account.
     *         </p>
     */
    public String getInvitationId() {
        return invitationId;
    }

    /**
     * <p>
     * The ID of the invitation sent to the member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param invitationId <p>
     *            The ID of the invitation sent to the member account.
     *            </p>
     */
    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The ID of the invitation sent to the member account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param invitationId <p>
     *            The ID of the invitation sent to the member account.
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
     * The timestamp of when the invitation was sent.
     * </p>
     *
     * @return <p>
     *         The timestamp of when the invitation was sent.
     *         </p>
     */
    public java.util.Date getInvitedAt() {
        return invitedAt;
    }

    /**
     * <p>
     * The timestamp of when the invitation was sent.
     * </p>
     *
     * @param invitedAt <p>
     *            The timestamp of when the invitation was sent.
     *            </p>
     */
    public void setInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * The timestamp of when the invitation was sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitedAt <p>
     *            The timestamp of when the invitation was sent.
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
     * The current status of the association between the member and master
     * accounts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The current status of the association between the member and
     *         master accounts.
     *         </p>
     */
    public String getMemberStatus() {
        return memberStatus;
    }

    /**
     * <p>
     * The current status of the association between the member and master
     * accounts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberStatus <p>
     *            The current status of the association between the member and
     *            master accounts.
     *            </p>
     */
    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    /**
     * <p>
     * The current status of the association between the member and master
     * accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberStatus <p>
     *            The current status of the association between the member and
     *            master accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invitation withMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
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
        if (getInvitedAt() != null)
            sb.append("InvitedAt: " + getInvitedAt() + ",");
        if (getMemberStatus() != null)
            sb.append("MemberStatus: " + getMemberStatus());
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
                + ((getMemberStatus() == null) ? 0 : getMemberStatus().hashCode());
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
        if (other.getMemberStatus() == null ^ this.getMemberStatus() == null)
            return false;
        if (other.getMemberStatus() != null
                && other.getMemberStatus().equals(this.getMemberStatus()) == false)
            return false;
        return true;
    }
}
