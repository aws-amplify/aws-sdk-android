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

package com.amazonaws.services.firewallmanagementservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the AWS Firewall Manager administrator account. AWS Firewall Manager
 * must be associated with the master account of your AWS organization or
 * associated with a member account that has the appropriate permissions. If the
 * account ID that you submit is not an AWS Organizations master account, AWS
 * Firewall Manager will set the appropriate permissions for the given member
 * account.
 * </p>
 * <p>
 * The account that you associate with AWS Firewall Manager is called the AWS
 * Firewall Manager administrator account.
 * </p>
 */
public class AssociateAdminAccountRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The AWS account ID to associate with AWS Firewall Manager as the AWS
     * Firewall Manager administrator account. This can be an AWS Organizations
     * master account or a member account. For more information about AWS
     * Organizations and master accounts, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html"
     * >Managing the AWS Accounts in Your Organization</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String adminAccount;

    /**
     * <p>
     * The AWS account ID to associate with AWS Firewall Manager as the AWS
     * Firewall Manager administrator account. This can be an AWS Organizations
     * master account or a member account. For more information about AWS
     * Organizations and master accounts, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html"
     * >Managing the AWS Accounts in Your Organization</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The AWS account ID to associate with AWS Firewall Manager as the
     *         AWS Firewall Manager administrator account. This can be an AWS
     *         Organizations master account or a member account. For more
     *         information about AWS Organizations and master accounts, see <a
     *         href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html"
     *         >Managing the AWS Accounts in Your Organization</a>.
     *         </p>
     */
    public String getAdminAccount() {
        return adminAccount;
    }

    /**
     * <p>
     * The AWS account ID to associate with AWS Firewall Manager as the AWS
     * Firewall Manager administrator account. This can be an AWS Organizations
     * master account or a member account. For more information about AWS
     * Organizations and master accounts, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html"
     * >Managing the AWS Accounts in Your Organization</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param adminAccount <p>
     *            The AWS account ID to associate with AWS Firewall Manager as
     *            the AWS Firewall Manager administrator account. This can be an
     *            AWS Organizations master account or a member account. For more
     *            information about AWS Organizations and master accounts, see
     *            <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html"
     *            >Managing the AWS Accounts in Your Organization</a>.
     *            </p>
     */
    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    /**
     * <p>
     * The AWS account ID to associate with AWS Firewall Manager as the AWS
     * Firewall Manager administrator account. This can be an AWS Organizations
     * master account or a member account. For more information about AWS
     * Organizations and master accounts, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html"
     * >Managing the AWS Accounts in Your Organization</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param adminAccount <p>
     *            The AWS account ID to associate with AWS Firewall Manager as
     *            the AWS Firewall Manager administrator account. This can be an
     *            AWS Organizations master account or a member account. For more
     *            information about AWS Organizations and master accounts, see
     *            <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html"
     *            >Managing the AWS Accounts in Your Organization</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateAdminAccountRequest withAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
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
        if (getAdminAccount() != null)
            sb.append("AdminAccount: " + getAdminAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdminAccount() == null) ? 0 : getAdminAccount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAdminAccountRequest == false)
            return false;
        AssociateAdminAccountRequest other = (AssociateAdminAccountRequest) obj;

        if (other.getAdminAccount() == null ^ this.getAdminAccount() == null)
            return false;
        if (other.getAdminAccount() != null
                && other.getAdminAccount().equals(this.getAdminAccount()) == false)
            return false;
        return true;
    }
}
