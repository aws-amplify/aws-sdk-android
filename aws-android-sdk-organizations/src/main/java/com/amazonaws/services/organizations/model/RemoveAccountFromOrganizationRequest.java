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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the specified account from the organization.
 * </p>
 * <p>
 * The removed account becomes a standalone account that isn't a member of any
 * organization. It's no longer subject to any policies and is responsible for
 * its own bill payments. The organization's master account is no longer charged
 * for any expenses accrued by the member account after it's removed from the
 * organization.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * Member accounts can remove themselves with <a>LeaveOrganization</a> instead.
 * </p>
 * <important>
 * <p>
 * You can remove an account from your organization only if the account is
 * configured with the information required to operate as a standalone account.
 * When you create an account in an organization using the AWS Organizations
 * console, API, or CLI commands, the information required of standalone
 * accounts is <i>not</i> automatically collected. For an account that you want
 * to make standalone, you must accept the end user license agreement (EULA),
 * choose a support plan, provide and verify the required contact information,
 * and provide a current payment method. AWS uses the payment method to charge
 * for any billable (not free tier) AWS activity that occurs while the account
 * isn't attached to an organization. To remove an account that doesn't yet have
 * this information, you must sign in as the member account and follow the steps
 * at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * > To leave an organization when all required account information has not yet
 * been provided</a> in the <i>AWS Organizations User Guide.</i>
 * </p>
 * </important>
 */
public class RemoveAccountFromOrganizationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the member account that you want to remove
     * from the organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>
     * The unique identifier (ID) of the member account that you want to remove
     * from the organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the member account that you want to
     *         remove from the organization.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for an account ID string requires exactly 12 digits.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the member account that you want to remove
     * from the organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            The unique identifier (ID) of the member account that you want
     *            to remove from the organization.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the member account that you want to remove
     * from the organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            The unique identifier (ID) of the member account that you want
     *            to remove from the organization.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveAccountFromOrganizationRequest withAccountId(String accountId) {
        this.accountId = accountId;
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
            sb.append("AccountId: " + getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveAccountFromOrganizationRequest == false)
            return false;
        RemoveAccountFromOrganizationRequest other = (RemoveAccountFromOrganizationRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }
}
