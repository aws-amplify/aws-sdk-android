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

public class GetAdminAccountResult implements Serializable {
    /**
     * <p>
     * The AWS account that is set as the AWS Firewall Manager administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String adminAccount;

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager
     * administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, CREATING, PENDING_DELETION, DELETING,
     * DELETED
     */
    private String roleStatus;

    /**
     * <p>
     * The AWS account that is set as the AWS Firewall Manager administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The AWS account that is set as the AWS Firewall Manager
     *         administrator.
     *         </p>
     */
    public String getAdminAccount() {
        return adminAccount;
    }

    /**
     * <p>
     * The AWS account that is set as the AWS Firewall Manager administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param adminAccount <p>
     *            The AWS account that is set as the AWS Firewall Manager
     *            administrator.
     *            </p>
     */
    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    /**
     * <p>
     * The AWS account that is set as the AWS Firewall Manager administrator.
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
     *            The AWS account that is set as the AWS Firewall Manager
     *            administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdminAccountResult withAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
        return this;
    }

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager
     * administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, CREATING, PENDING_DELETION, DELETING,
     * DELETED
     *
     * @return <p>
     *         The status of the AWS account that you set as the AWS Firewall
     *         Manager administrator.
     *         </p>
     * @see AccountRoleStatus
     */
    public String getRoleStatus() {
        return roleStatus;
    }

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager
     * administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, CREATING, PENDING_DELETION, DELETING,
     * DELETED
     *
     * @param roleStatus <p>
     *            The status of the AWS account that you set as the AWS Firewall
     *            Manager administrator.
     *            </p>
     * @see AccountRoleStatus
     */
    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager
     * administrator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, CREATING, PENDING_DELETION, DELETING,
     * DELETED
     *
     * @param roleStatus <p>
     *            The status of the AWS account that you set as the AWS Firewall
     *            Manager administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountRoleStatus
     */
    public GetAdminAccountResult withRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
        return this;
    }

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager
     * administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, CREATING, PENDING_DELETION, DELETING,
     * DELETED
     *
     * @param roleStatus <p>
     *            The status of the AWS account that you set as the AWS Firewall
     *            Manager administrator.
     *            </p>
     * @see AccountRoleStatus
     */
    public void setRoleStatus(AccountRoleStatus roleStatus) {
        this.roleStatus = roleStatus.toString();
    }

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager
     * administrator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, CREATING, PENDING_DELETION, DELETING,
     * DELETED
     *
     * @param roleStatus <p>
     *            The status of the AWS account that you set as the AWS Firewall
     *            Manager administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountRoleStatus
     */
    public GetAdminAccountResult withRoleStatus(AccountRoleStatus roleStatus) {
        this.roleStatus = roleStatus.toString();
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
            sb.append("AdminAccount: " + getAdminAccount() + ",");
        if (getRoleStatus() != null)
            sb.append("RoleStatus: " + getRoleStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdminAccount() == null) ? 0 : getAdminAccount().hashCode());
        hashCode = prime * hashCode + ((getRoleStatus() == null) ? 0 : getRoleStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAdminAccountResult == false)
            return false;
        GetAdminAccountResult other = (GetAdminAccountResult) obj;

        if (other.getAdminAccount() == null ^ this.getAdminAccount() == null)
            return false;
        if (other.getAdminAccount() != null
                && other.getAdminAccount().equals(this.getAdminAccount()) == false)
            return false;
        if (other.getRoleStatus() == null ^ this.getRoleStatus() == null)
            return false;
        if (other.getRoleStatus() != null
                && other.getRoleStatus().equals(this.getRoleStatus()) == false)
            return false;
        return true;
    }
}
