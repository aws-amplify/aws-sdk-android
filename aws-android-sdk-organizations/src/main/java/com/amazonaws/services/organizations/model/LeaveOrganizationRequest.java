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
 * Removes a member account from its parent organization. This version of the
 * operation is performed by the account that wants to leave. To remove a member
 * account as a user in the master account, use
 * <a>RemoveAccountFromOrganization</a> instead.
 * </p>
 * <p>
 * This operation can be called only from a member account in the organization.
 * </p>
 * <important>
 * <ul>
 * <li>
 * <p>
 * The master account in an organization with all features enabled can set
 * service control policies (SCPs) that can restrict what administrators of
 * member accounts can do. This includes preventing them from successfully
 * calling <code>LeaveOrganization</code> and leaving the organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can leave an organization as a member account only if the account is
 * configured with the information required to operate as a standalone account.
 * When you create an account in an organization using the AWS Organizations
 * console, API, or CLI commands, the information required of standalone
 * accounts is <i>not</i> automatically collected. For each account that you
 * want to make standalone, you must do the following steps:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Accept the end user license agreement (EULA)
 * </p>
 * </li>
 * <li>
 * <p>
 * Choose a support plan
 * </p>
 * </li>
 * <li>
 * <p>
 * Provide and verify the required contact information
 * </p>
 * </li>
 * <li>
 * <p>
 * Provide a current payment method
 * </p>
 * </li>
 * </ul>
 * <p>
 * AWS uses the payment method to charge for any billable (not free tier) AWS
 * activity that occurs while the account isn't attached to an organization.
 * Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * > To leave an organization when all required account information has not yet
 * been provided</a> in the <i>AWS Organizations User Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * You can leave an organization only after you enable IAM user access to
 * billing in your account. For more information, see <a href=
 * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
 * >Activating Access to the Billing and Cost Management Console</a> in the
 * <i>AWS Billing and Cost Management User Guide.</i>
 * </p>
 * </li>
 * </ul>
 * </important>
 */
public class LeaveOrganizationRequest extends AmazonWebServiceRequest implements Serializable {
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
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LeaveOrganizationRequest == false)
            return false;
        LeaveOrganizationRequest other = (LeaveOrganizationRequest) obj;

        return true;
    }
}
