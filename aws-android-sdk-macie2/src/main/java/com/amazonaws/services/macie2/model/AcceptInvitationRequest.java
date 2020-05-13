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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Accepts an Amazon Macie membership invitation that was received from a
 * specific account.
 * </p>
 */
public class AcceptInvitationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the invitation to accept.
     * </p>
     */
    private String invitationId;

    /**
     * <p>
     * The AWS account ID for the account that sent the invitation.
     * </p>
     */
    private String masterAccount;

    /**
     * <p>
     * The unique identifier for the invitation to accept.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the invitation to accept.
     *         </p>
     */
    public String getInvitationId() {
        return invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation to accept.
     * </p>
     *
     * @param invitationId <p>
     *            The unique identifier for the invitation to accept.
     *            </p>
     */
    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation to accept.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitationId <p>
     *            The unique identifier for the invitation to accept.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptInvitationRequest withInvitationId(String invitationId) {
        this.invitationId = invitationId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID for the account that sent the invitation.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the account that sent the invitation.
     *         </p>
     */
    public String getMasterAccount() {
        return masterAccount;
    }

    /**
     * <p>
     * The AWS account ID for the account that sent the invitation.
     * </p>
     *
     * @param masterAccount <p>
     *            The AWS account ID for the account that sent the invitation.
     *            </p>
     */
    public void setMasterAccount(String masterAccount) {
        this.masterAccount = masterAccount;
    }

    /**
     * <p>
     * The AWS account ID for the account that sent the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterAccount <p>
     *            The AWS account ID for the account that sent the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptInvitationRequest withMasterAccount(String masterAccount) {
        this.masterAccount = masterAccount;
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
        if (getInvitationId() != null)
            sb.append("invitationId: " + getInvitationId() + ",");
        if (getMasterAccount() != null)
            sb.append("masterAccount: " + getMasterAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        hashCode = prime * hashCode
                + ((getMasterAccount() == null) ? 0 : getMasterAccount().hashCode());
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

        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null
                && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        if (other.getMasterAccount() == null ^ this.getMasterAccount() == null)
            return false;
        if (other.getMasterAccount() != null
                && other.getMasterAccount().equals(this.getMasterAccount()) == false)
            return false;
        return true;
    }
}
