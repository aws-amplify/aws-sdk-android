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

public class GetMembersResult implements Serializable {
    /**
     * <p>
     * The list of details about the Security Hub member accounts.
     * </p>
     */
    private java.util.List<Member> members;

    /**
     * <p>
     * The list of AWS accounts that could not be processed. For each account,
     * the list includes the account ID and the email address.
     * </p>
     */
    private java.util.List<Result> unprocessedAccounts;

    /**
     * <p>
     * The list of details about the Security Hub member accounts.
     * </p>
     *
     * @return <p>
     *         The list of details about the Security Hub member accounts.
     *         </p>
     */
    public java.util.List<Member> getMembers() {
        return members;
    }

    /**
     * <p>
     * The list of details about the Security Hub member accounts.
     * </p>
     *
     * @param members <p>
     *            The list of details about the Security Hub member accounts.
     *            </p>
     */
    public void setMembers(java.util.Collection<Member> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<Member>(members);
    }

    /**
     * <p>
     * The list of details about the Security Hub member accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param members <p>
     *            The list of details about the Security Hub member accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMembersResult withMembers(Member... members) {
        if (getMembers() == null) {
            this.members = new java.util.ArrayList<Member>(members.length);
        }
        for (Member value : members) {
            this.members.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of details about the Security Hub member accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param members <p>
     *            The list of details about the Security Hub member accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMembersResult withMembers(java.util.Collection<Member> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * The list of AWS accounts that could not be processed. For each account,
     * the list includes the account ID and the email address.
     * </p>
     *
     * @return <p>
     *         The list of AWS accounts that could not be processed. For each
     *         account, the list includes the account ID and the email address.
     *         </p>
     */
    public java.util.List<Result> getUnprocessedAccounts() {
        return unprocessedAccounts;
    }

    /**
     * <p>
     * The list of AWS accounts that could not be processed. For each account,
     * the list includes the account ID and the email address.
     * </p>
     *
     * @param unprocessedAccounts <p>
     *            The list of AWS accounts that could not be processed. For each
     *            account, the list includes the account ID and the email
     *            address.
     *            </p>
     */
    public void setUnprocessedAccounts(java.util.Collection<Result> unprocessedAccounts) {
        if (unprocessedAccounts == null) {
            this.unprocessedAccounts = null;
            return;
        }

        this.unprocessedAccounts = new java.util.ArrayList<Result>(unprocessedAccounts);
    }

    /**
     * <p>
     * The list of AWS accounts that could not be processed. For each account,
     * the list includes the account ID and the email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedAccounts <p>
     *            The list of AWS accounts that could not be processed. For each
     *            account, the list includes the account ID and the email
     *            address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMembersResult withUnprocessedAccounts(Result... unprocessedAccounts) {
        if (getUnprocessedAccounts() == null) {
            this.unprocessedAccounts = new java.util.ArrayList<Result>(unprocessedAccounts.length);
        }
        for (Result value : unprocessedAccounts) {
            this.unprocessedAccounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of AWS accounts that could not be processed. For each account,
     * the list includes the account ID and the email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedAccounts <p>
     *            The list of AWS accounts that could not be processed. For each
     *            account, the list includes the account ID and the email
     *            address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMembersResult withUnprocessedAccounts(java.util.Collection<Result> unprocessedAccounts) {
        setUnprocessedAccounts(unprocessedAccounts);
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
        if (getMembers() != null)
            sb.append("Members: " + getMembers() + ",");
        if (getUnprocessedAccounts() != null)
            sb.append("UnprocessedAccounts: " + getUnprocessedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode
                + ((getUnprocessedAccounts() == null) ? 0 : getUnprocessedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMembersResult == false)
            return false;
        GetMembersResult other = (GetMembersResult) obj;

        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getUnprocessedAccounts() == null ^ this.getUnprocessedAccounts() == null)
            return false;
        if (other.getUnprocessedAccounts() != null
                && other.getUnprocessedAccounts().equals(this.getUnprocessedAccounts()) == false)
            return false;
        return true;
    }
}
