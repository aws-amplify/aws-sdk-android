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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * Invitation object returned after emailing users to invite them to join the
 * Amazon Chime <code>Team</code> account.
 * </p>
 */
public class Invite implements Serializable {
    /**
     * <p>
     * The invite ID.
     * </p>
     */
    private String inviteId;

    /**
     * <p>
     * The status of the invite.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     */
    private String status;

    /**
     * <p>
     * The email address to which the invite is sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     */
    private String emailAddress;

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotSent, Sent, Failed
     */
    private String emailStatus;

    /**
     * <p>
     * The invite ID.
     * </p>
     *
     * @return <p>
     *         The invite ID.
     *         </p>
     */
    public String getInviteId() {
        return inviteId;
    }

    /**
     * <p>
     * The invite ID.
     * </p>
     *
     * @param inviteId <p>
     *            The invite ID.
     *            </p>
     */
    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }

    /**
     * <p>
     * The invite ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inviteId <p>
     *            The invite ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invite withInviteId(String inviteId) {
        this.inviteId = inviteId;
        return this;
    }

    /**
     * <p>
     * The status of the invite.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @return <p>
     *         The status of the invite.
     *         </p>
     * @see InviteStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the invite.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @param status <p>
     *            The status of the invite.
     *            </p>
     * @see InviteStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the invite.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @param status <p>
     *            The status of the invite.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InviteStatus
     */
    public Invite withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the invite.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @param status <p>
     *            The status of the invite.
     *            </p>
     * @see InviteStatus
     */
    public void setStatus(InviteStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the invite.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Accepted, Failed
     *
     * @param status <p>
     *            The status of the invite.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InviteStatus
     */
    public Invite withStatus(InviteStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The email address to which the invite is sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     *
     * @return <p>
     *         The email address to which the invite is sent.
     *         </p>
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * <p>
     * The email address to which the invite is sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     *
     * @param emailAddress <p>
     *            The email address to which the invite is sent.
     *            </p>
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address to which the invite is sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     *
     * @param emailAddress <p>
     *            The email address to which the invite is sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invite withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotSent, Sent, Failed
     *
     * @return <p>
     *         The status of the invite email.
     *         </p>
     * @see EmailStatus
     */
    public String getEmailStatus() {
        return emailStatus;
    }

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotSent, Sent, Failed
     *
     * @param emailStatus <p>
     *            The status of the invite email.
     *            </p>
     * @see EmailStatus
     */
    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotSent, Sent, Failed
     *
     * @param emailStatus <p>
     *            The status of the invite email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EmailStatus
     */
    public Invite withEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
        return this;
    }

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotSent, Sent, Failed
     *
     * @param emailStatus <p>
     *            The status of the invite email.
     *            </p>
     * @see EmailStatus
     */
    public void setEmailStatus(EmailStatus emailStatus) {
        this.emailStatus = emailStatus.toString();
    }

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotSent, Sent, Failed
     *
     * @param emailStatus <p>
     *            The status of the invite email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EmailStatus
     */
    public Invite withEmailStatus(EmailStatus emailStatus) {
        this.emailStatus = emailStatus.toString();
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
        if (getInviteId() != null)
            sb.append("InviteId: " + getInviteId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: " + getEmailAddress() + ",");
        if (getEmailStatus() != null)
            sb.append("EmailStatus: " + getEmailStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInviteId() == null) ? 0 : getInviteId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode
                + ((getEmailStatus() == null) ? 0 : getEmailStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Invite == false)
            return false;
        Invite other = (Invite) obj;

        if (other.getInviteId() == null ^ this.getInviteId() == null)
            return false;
        if (other.getInviteId() != null && other.getInviteId().equals(this.getInviteId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null
                && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getEmailStatus() == null ^ this.getEmailStatus() == null)
            return false;
        if (other.getEmailStatus() != null
                && other.getEmailStatus().equals(this.getEmailStatus()) == false)
            return false;
        return true;
    }
}
