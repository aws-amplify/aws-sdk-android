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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an AWS customer account authorized to restore a snapshot.
 * </p>
 */
public class AccountWithRestoreAccess implements Serializable {
    /**
     * <p>
     * The identifier of an AWS customer account authorized to restore a
     * snapshot.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The identifier of an AWS support account authorized to restore a
     * snapshot. For AWS support, the identifier is
     * <code>amazon-redshift-support</code>.
     * </p>
     */
    private String accountAlias;

    /**
     * <p>
     * The identifier of an AWS customer account authorized to restore a
     * snapshot.
     * </p>
     *
     * @return <p>
     *         The identifier of an AWS customer account authorized to restore a
     *         snapshot.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The identifier of an AWS customer account authorized to restore a
     * snapshot.
     * </p>
     *
     * @param accountId <p>
     *            The identifier of an AWS customer account authorized to
     *            restore a snapshot.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The identifier of an AWS customer account authorized to restore a
     * snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The identifier of an AWS customer account authorized to
     *            restore a snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountWithRestoreAccess withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The identifier of an AWS support account authorized to restore a
     * snapshot. For AWS support, the identifier is
     * <code>amazon-redshift-support</code>.
     * </p>
     *
     * @return <p>
     *         The identifier of an AWS support account authorized to restore a
     *         snapshot. For AWS support, the identifier is
     *         <code>amazon-redshift-support</code>.
     *         </p>
     */
    public String getAccountAlias() {
        return accountAlias;
    }

    /**
     * <p>
     * The identifier of an AWS support account authorized to restore a
     * snapshot. For AWS support, the identifier is
     * <code>amazon-redshift-support</code>.
     * </p>
     *
     * @param accountAlias <p>
     *            The identifier of an AWS support account authorized to restore
     *            a snapshot. For AWS support, the identifier is
     *            <code>amazon-redshift-support</code>.
     *            </p>
     */
    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }

    /**
     * <p>
     * The identifier of an AWS support account authorized to restore a
     * snapshot. For AWS support, the identifier is
     * <code>amazon-redshift-support</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountAlias <p>
     *            The identifier of an AWS support account authorized to restore
     *            a snapshot. For AWS support, the identifier is
     *            <code>amazon-redshift-support</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountWithRestoreAccess withAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
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
        if (getAccountAlias() != null)
            sb.append("AccountAlias: " + getAccountAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getAccountAlias() == null) ? 0 : getAccountAlias().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountWithRestoreAccess == false)
            return false;
        AccountWithRestoreAccess other = (AccountWithRestoreAccess) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAccountAlias() == null ^ this.getAccountAlias() == null)
            return false;
        if (other.getAccountAlias() != null
                && other.getAccountAlias().equals(this.getAccountAlias()) == false)
            return false;
        return true;
    }
}
