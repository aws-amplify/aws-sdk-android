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

public class ListOrganizationAdminAccountsResult implements Serializable {
    /**
     * <p>
     * An AdminAccounts object that includes a list of accounts configured as
     * GuardDuty delegated administrators.
     * </p>
     */
    private java.util.List<AdminAccount> adminAccounts;

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An AdminAccounts object that includes a list of accounts configured as
     * GuardDuty delegated administrators.
     * </p>
     *
     * @return <p>
     *         An AdminAccounts object that includes a list of accounts
     *         configured as GuardDuty delegated administrators.
     *         </p>
     */
    public java.util.List<AdminAccount> getAdminAccounts() {
        return adminAccounts;
    }

    /**
     * <p>
     * An AdminAccounts object that includes a list of accounts configured as
     * GuardDuty delegated administrators.
     * </p>
     *
     * @param adminAccounts <p>
     *            An AdminAccounts object that includes a list of accounts
     *            configured as GuardDuty delegated administrators.
     *            </p>
     */
    public void setAdminAccounts(java.util.Collection<AdminAccount> adminAccounts) {
        if (adminAccounts == null) {
            this.adminAccounts = null;
            return;
        }

        this.adminAccounts = new java.util.ArrayList<AdminAccount>(adminAccounts);
    }

    /**
     * <p>
     * An AdminAccounts object that includes a list of accounts configured as
     * GuardDuty delegated administrators.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminAccounts <p>
     *            An AdminAccounts object that includes a list of accounts
     *            configured as GuardDuty delegated administrators.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationAdminAccountsResult withAdminAccounts(AdminAccount... adminAccounts) {
        if (getAdminAccounts() == null) {
            this.adminAccounts = new java.util.ArrayList<AdminAccount>(adminAccounts.length);
        }
        for (AdminAccount value : adminAccounts) {
            this.adminAccounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An AdminAccounts object that includes a list of accounts configured as
     * GuardDuty delegated administrators.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminAccounts <p>
     *            An AdminAccounts object that includes a list of accounts
     *            configured as GuardDuty delegated administrators.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationAdminAccountsResult withAdminAccounts(
            java.util.Collection<AdminAccount> adminAccounts) {
        setAdminAccounts(adminAccounts);
        return this;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @return <p>
     *         The pagination parameter to be used on the next list operation to
     *         retrieve more items.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to
     * retrieve more items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination parameter to be used on the next list operation
     *            to retrieve more items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationAdminAccountsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getAdminAccounts() != null)
            sb.append("AdminAccounts: " + getAdminAccounts() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdminAccounts() == null) ? 0 : getAdminAccounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOrganizationAdminAccountsResult == false)
            return false;
        ListOrganizationAdminAccountsResult other = (ListOrganizationAdminAccountsResult) obj;

        if (other.getAdminAccounts() == null ^ this.getAdminAccounts() == null)
            return false;
        if (other.getAdminAccounts() != null
                && other.getAdminAccounts().equals(this.getAdminAccounts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
