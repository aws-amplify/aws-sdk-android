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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Accepts the invitation to be a member account and be monitored by the
 * Security Hub master account that the invitation was sent from.
 * </p>
 * <p>
 * When the member account accepts the invitation, permission is granted to the
 * master account to view findings generated in the member account.
 * </p>
 */
public class AcceptInvitationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The account ID of the Security Hub master account that sent the
     * invitation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String masterId;

    /**
     * <p>
     * The ID of the invitation sent from the Security Hub master account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String invitationId;

    /**
     * <p>
     * The account ID of the Security Hub master account that sent the
     * invitation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The account ID of the Security Hub master account that sent the
     *         invitation.
     *         </p>
     */
    public String getMasterId() {
        return masterId;
    }

    /**
     * <p>
     * The account ID of the Security Hub master account that sent the
     * invitation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param masterId <p>
     *            The account ID of the Security Hub master account that sent
     *            the invitation.
     *            </p>
     */
    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * The account ID of the Security Hub master account that sent the
     * invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param masterId <p>
     *            The account ID of the Security Hub master account that sent
     *            the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptInvitationRequest withMasterId(String masterId) {
        this.masterId = masterId;
        return this;
    }

    /**
     * <p>
     * The ID of the invitation sent from the Security Hub master account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the invitation sent from the Security Hub master
     *         account.
     *         </p>
     */
    public String getInvitationId() {
        return invitationId;
    }

    /**
     * <p>
     * The ID of the invitation sent from the Security Hub master account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param invitationId <p>
     *            The ID of the invitation sent from the Security Hub master
     *            account.
     *            </p>
     */
    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The ID of the invitation sent from the Security Hub master account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param invitationId <p>
     *            The ID of the invitation sent from the Security Hub master
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptInvitationRequest withInvitationId(String invitationId) {
        this.invitationId = invitationId;
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
        if (getMasterId() != null)
            sb.append("MasterId: " + getMasterId() + ",");
        if (getInvitationId() != null)
            sb.append("InvitationId: " + getInvitationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        hashCode = prime * hashCode
                + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptInvitationRequest == false)
            return false;
        AcceptInvitationRequest other = (AcceptInvitationRequest) obj;

        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
            return false;
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null
                && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        return true;
    }
}
