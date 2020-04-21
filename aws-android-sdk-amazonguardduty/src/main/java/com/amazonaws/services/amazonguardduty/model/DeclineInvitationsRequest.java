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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Declines invitations sent to the current member account by AWS accounts
 * specified by their account IDs.
 * </p>
 */
public class DeclineInvitationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of account IDs of the AWS accounts that sent invitations to the
     * current member account that you want to decline invitations from.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * A list of account IDs of the AWS accounts that sent invitations to the
     * current member account that you want to decline invitations from.
     * </p>
     *
     * @return <p>
     *         A list of account IDs of the AWS accounts that sent invitations
     *         to the current member account that you want to decline
     *         invitations from.
     *         </p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * A list of account IDs of the AWS accounts that sent invitations to the
     * current member account that you want to decline invitations from.
     * </p>
     *
     * @param accountIds <p>
     *            A list of account IDs of the AWS accounts that sent
     *            invitations to the current member account that you want to
     *            decline invitations from.
     *            </p>
     */
    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * A list of account IDs of the AWS accounts that sent invitations to the
     * current member account that you want to decline invitations from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            A list of account IDs of the AWS accounts that sent
     *            invitations to the current member account that you want to
     *            decline invitations from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeclineInvitationsRequest withAccountIds(String... accountIds) {
        if (getAccountIds() == null) {
            this.accountIds = new java.util.ArrayList<String>(accountIds.length);
        }
        for (String value : accountIds) {
            this.accountIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of account IDs of the AWS accounts that sent invitations to the
     * current member account that you want to decline invitations from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            A list of account IDs of the AWS accounts that sent
     *            invitations to the current member account that you want to
     *            decline invitations from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeclineInvitationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
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
        if (getAccountIds() != null)
            sb.append("AccountIds: " + getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeclineInvitationsRequest == false)
            return false;
        DeclineInvitationsRequest other = (DeclineInvitationsRequest) obj;

        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null
                && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }
}
