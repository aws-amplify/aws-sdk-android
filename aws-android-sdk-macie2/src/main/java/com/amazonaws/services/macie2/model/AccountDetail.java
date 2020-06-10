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
 * Specifies details for an account to associate with an Amazon Macie master
 * account.
 * </p>
 */
public class AccountDetail implements Serializable {
    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The email address for the account.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the account.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     *
     * @param accountId <p>
     *            The AWS account ID for the account.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The AWS account ID for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountDetail withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The email address for the account.
     * </p>
     *
     * @return <p>
     *         The email address for the account.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address for the account.
     * </p>
     *
     * @param email <p>
     *            The email address for the account.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            The email address for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountDetail withEmail(String email) {
        this.email = email;
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
        if (getEmail() != null)
            sb.append("email: " + getEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountDetail == false)
            return false;
        AccountDetail other = (AccountDetail) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        return true;
    }
}
