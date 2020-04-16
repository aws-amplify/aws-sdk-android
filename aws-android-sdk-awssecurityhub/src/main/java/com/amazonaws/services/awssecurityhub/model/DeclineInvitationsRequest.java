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
 * Declines invitations to become a member account.
 * </p>
 */
public class DeclineInvitationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The list of account IDs for the accounts from which to decline the
     * invitations to Security Hub.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * The list of account IDs for the accounts from which to decline the
     * invitations to Security Hub.
     * </p>
     *
     * @return <p>
     *         The list of account IDs for the accounts from which to decline
     *         the invitations to Security Hub.
     *         </p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The list of account IDs for the accounts from which to decline the
     * invitations to Security Hub.
     * </p>
     *
     * @param accountIds <p>
     *            The list of account IDs for the accounts from which to decline
     *            the invitations to Security Hub.
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
     * The list of account IDs for the accounts from which to decline the
     * invitations to Security Hub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            The list of account IDs for the accounts from which to decline
     *            the invitations to Security Hub.
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
     * The list of account IDs for the accounts from which to decline the
     * invitations to Security Hub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            The list of account IDs for the accounts from which to decline
     *            the invitations to Security Hub.
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
