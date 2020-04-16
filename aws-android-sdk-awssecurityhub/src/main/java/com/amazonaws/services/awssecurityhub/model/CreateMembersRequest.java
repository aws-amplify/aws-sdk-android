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
 * Creates a member association in Security Hub between the specified accounts
 * and the account used to make the request, which is the master account. To
 * successfully create a member, you must use this action from an account that
 * already has Security Hub enabled. To enable Security Hub, you can use the
 * <code> <a>EnableSecurityHub</a> </code> operation.
 * </p>
 * <p>
 * After you use <code>CreateMembers</code> to create member account
 * associations in Security Hub, you must use the
 * <code> <a>InviteMembers</a> </code> operation to invite the accounts to
 * enable Security Hub and become member accounts in Security Hub.
 * </p>
 * <p>
 * If the account owner accepts the invitation, the account becomes a member
 * account in Security Hub, and a permission policy is added that permits the
 * master account to view the findings generated in the member account. When
 * Security Hub is enabled in the invited account, findings start to be sent to
 * both the member and master accounts.
 * </p>
 * <p>
 * To remove the association between the master and member accounts, use the
 * <code> <a>DisassociateFromMasterAccount</a> </code> or
 * <code> <a>DisassociateMembers</a> </code> operation.
 * </p>
 */
public class CreateMembersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The list of accounts to associate with the Security Hub master account.
     * For each account, the list includes the account ID and the email address.
     * </p>
     */
    private java.util.List<AccountDetails> accountDetails;

    /**
     * <p>
     * The list of accounts to associate with the Security Hub master account.
     * For each account, the list includes the account ID and the email address.
     * </p>
     *
     * @return <p>
     *         The list of accounts to associate with the Security Hub master
     *         account. For each account, the list includes the account ID and
     *         the email address.
     *         </p>
     */
    public java.util.List<AccountDetails> getAccountDetails() {
        return accountDetails;
    }

    /**
     * <p>
     * The list of accounts to associate with the Security Hub master account.
     * For each account, the list includes the account ID and the email address.
     * </p>
     *
     * @param accountDetails <p>
     *            The list of accounts to associate with the Security Hub master
     *            account. For each account, the list includes the account ID
     *            and the email address.
     *            </p>
     */
    public void setAccountDetails(java.util.Collection<AccountDetails> accountDetails) {
        if (accountDetails == null) {
            this.accountDetails = null;
            return;
        }

        this.accountDetails = new java.util.ArrayList<AccountDetails>(accountDetails);
    }

    /**
     * <p>
     * The list of accounts to associate with the Security Hub master account.
     * For each account, the list includes the account ID and the email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountDetails <p>
     *            The list of accounts to associate with the Security Hub master
     *            account. For each account, the list includes the account ID
     *            and the email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMembersRequest withAccountDetails(AccountDetails... accountDetails) {
        if (getAccountDetails() == null) {
            this.accountDetails = new java.util.ArrayList<AccountDetails>(accountDetails.length);
        }
        for (AccountDetails value : accountDetails) {
            this.accountDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of accounts to associate with the Security Hub master account.
     * For each account, the list includes the account ID and the email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountDetails <p>
     *            The list of accounts to associate with the Security Hub master
     *            account. For each account, the list includes the account ID
     *            and the email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMembersRequest withAccountDetails(
            java.util.Collection<AccountDetails> accountDetails) {
        setAccountDetails(accountDetails);
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
        if (getAccountDetails() != null)
            sb.append("AccountDetails: " + getAccountDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccountDetails() == null) ? 0 : getAccountDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMembersRequest == false)
            return false;
        CreateMembersRequest other = (CreateMembersRequest) obj;

        if (other.getAccountDetails() == null ^ this.getAccountDetails() == null)
            return false;
        if (other.getAccountDetails() != null
                && other.getAccountDetails().equals(this.getAccountDetails()) == false)
            return false;
        return true;
    }
}
