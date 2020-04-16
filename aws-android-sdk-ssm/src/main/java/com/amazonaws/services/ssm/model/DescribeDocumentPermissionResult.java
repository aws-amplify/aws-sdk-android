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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class DescribeDocumentPermissionResult implements Serializable {
    /**
     * <p>
     * The account IDs that have permission to use this document. The ID can be
     * either an AWS account or <i>All</i>.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * A list of of AWS accounts where the current document is shared and the
     * version shared with each account.
     * </p>
     */
    private java.util.List<AccountSharingInfo> accountSharingInfoList;

    /**
     * <p>
     * The account IDs that have permission to use this document. The ID can be
     * either an AWS account or <i>All</i>.
     * </p>
     *
     * @return <p>
     *         The account IDs that have permission to use this document. The ID
     *         can be either an AWS account or <i>All</i>.
     *         </p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The account IDs that have permission to use this document. The ID can be
     * either an AWS account or <i>All</i>.
     * </p>
     *
     * @param accountIds <p>
     *            The account IDs that have permission to use this document. The
     *            ID can be either an AWS account or <i>All</i>.
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
     * The account IDs that have permission to use this document. The ID can be
     * either an AWS account or <i>All</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            The account IDs that have permission to use this document. The
     *            ID can be either an AWS account or <i>All</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDocumentPermissionResult withAccountIds(String... accountIds) {
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
     * The account IDs that have permission to use this document. The ID can be
     * either an AWS account or <i>All</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            The account IDs that have permission to use this document. The
     *            ID can be either an AWS account or <i>All</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDocumentPermissionResult withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * A list of of AWS accounts where the current document is shared and the
     * version shared with each account.
     * </p>
     *
     * @return <p>
     *         A list of of AWS accounts where the current document is shared
     *         and the version shared with each account.
     *         </p>
     */
    public java.util.List<AccountSharingInfo> getAccountSharingInfoList() {
        return accountSharingInfoList;
    }

    /**
     * <p>
     * A list of of AWS accounts where the current document is shared and the
     * version shared with each account.
     * </p>
     *
     * @param accountSharingInfoList <p>
     *            A list of of AWS accounts where the current document is shared
     *            and the version shared with each account.
     *            </p>
     */
    public void setAccountSharingInfoList(
            java.util.Collection<AccountSharingInfo> accountSharingInfoList) {
        if (accountSharingInfoList == null) {
            this.accountSharingInfoList = null;
            return;
        }

        this.accountSharingInfoList = new java.util.ArrayList<AccountSharingInfo>(
                accountSharingInfoList);
    }

    /**
     * <p>
     * A list of of AWS accounts where the current document is shared and the
     * version shared with each account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountSharingInfoList <p>
     *            A list of of AWS accounts where the current document is shared
     *            and the version shared with each account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDocumentPermissionResult withAccountSharingInfoList(
            AccountSharingInfo... accountSharingInfoList) {
        if (getAccountSharingInfoList() == null) {
            this.accountSharingInfoList = new java.util.ArrayList<AccountSharingInfo>(
                    accountSharingInfoList.length);
        }
        for (AccountSharingInfo value : accountSharingInfoList) {
            this.accountSharingInfoList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of of AWS accounts where the current document is shared and the
     * version shared with each account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountSharingInfoList <p>
     *            A list of of AWS accounts where the current document is shared
     *            and the version shared with each account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDocumentPermissionResult withAccountSharingInfoList(
            java.util.Collection<AccountSharingInfo> accountSharingInfoList) {
        setAccountSharingInfoList(accountSharingInfoList);
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
            sb.append("AccountIds: " + getAccountIds() + ",");
        if (getAccountSharingInfoList() != null)
            sb.append("AccountSharingInfoList: " + getAccountSharingInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccountSharingInfoList() == null) ? 0 : getAccountSharingInfoList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDocumentPermissionResult == false)
            return false;
        DescribeDocumentPermissionResult other = (DescribeDocumentPermissionResult) obj;

        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null
                && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getAccountSharingInfoList() == null ^ this.getAccountSharingInfoList() == null)
            return false;
        if (other.getAccountSharingInfoList() != null
                && other.getAccountSharingInfoList().equals(this.getAccountSharingInfoList()) == false)
            return false;
        return true;
    }
}
