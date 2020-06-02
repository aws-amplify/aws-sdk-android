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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * The account within the organization specified as the GuardDuty delegated
 * administrator.
 * </p>
 */
public class AdminAccount implements Serializable {
    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     */
    private String adminAccountId;

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>ENABLED, DISABLE_IN_PROGRESS
     */
    private String adminStatus;

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the account.
     *         </p>
     */
    public String getAdminAccountId() {
        return adminAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     *
     * @param adminAccountId <p>
     *            The AWS account ID for the account.
     *            </p>
     */
    public void setAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminAccountId <p>
     *            The AWS account ID for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminAccount withAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
        return this;
    }

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>ENABLED, DISABLE_IN_PROGRESS
     *
     * @return <p>
     *         Indicates whether the account is enabled as the delegated
     *         administrator.
     *         </p>
     * @see AdminStatus
     */
    public String getAdminStatus() {
        return adminStatus;
    }

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>ENABLED, DISABLE_IN_PROGRESS
     *
     * @param adminStatus <p>
     *            Indicates whether the account is enabled as the delegated
     *            administrator.
     *            </p>
     * @see AdminStatus
     */
    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>ENABLED, DISABLE_IN_PROGRESS
     *
     * @param adminStatus <p>
     *            Indicates whether the account is enabled as the delegated
     *            administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdminStatus
     */
    public AdminAccount withAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
        return this;
    }

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>ENABLED, DISABLE_IN_PROGRESS
     *
     * @param adminStatus <p>
     *            Indicates whether the account is enabled as the delegated
     *            administrator.
     *            </p>
     * @see AdminStatus
     */
    public void setAdminStatus(AdminStatus adminStatus) {
        this.adminStatus = adminStatus.toString();
    }

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>ENABLED, DISABLE_IN_PROGRESS
     *
     * @param adminStatus <p>
     *            Indicates whether the account is enabled as the delegated
     *            administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdminStatus
     */
    public AdminAccount withAdminStatus(AdminStatus adminStatus) {
        this.adminStatus = adminStatus.toString();
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
        if (getAdminAccountId() != null)
            sb.append("AdminAccountId: " + getAdminAccountId() + ",");
        if (getAdminStatus() != null)
            sb.append("AdminStatus: " + getAdminStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdminAccountId() == null) ? 0 : getAdminAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getAdminStatus() == null) ? 0 : getAdminStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminAccount == false)
            return false;
        AdminAccount other = (AdminAccount) obj;

        if (other.getAdminAccountId() == null ^ this.getAdminAccountId() == null)
            return false;
        if (other.getAdminAccountId() != null
                && other.getAdminAccountId().equals(this.getAdminAccountId()) == false)
            return false;
        if (other.getAdminStatus() == null ^ this.getAdminStatus() == null)
            return false;
        if (other.getAdminStatus() != null
                && other.getAdminStatus().equals(this.getAdminStatus()) == false)
            return false;
        return true;
    }
}
