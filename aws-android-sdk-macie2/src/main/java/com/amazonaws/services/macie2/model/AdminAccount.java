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
 * Provides information about an account that's designated as a delegated
 * administrator of Amazon Macie for an AWS organization.
 * </p>
 */
public class AdminAccount implements Serializable {
    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The current status of the account as a delegated administrator of Amazon
     * Macie for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLING_IN_PROGRESS
     */
    private String status;

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
    public AdminAccount withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The current status of the account as a delegated administrator of Amazon
     * Macie for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLING_IN_PROGRESS
     *
     * @return <p>
     *         The current status of the account as a delegated administrator of
     *         Amazon Macie for the organization.
     *         </p>
     * @see AdminStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the account as a delegated administrator of Amazon
     * Macie for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLING_IN_PROGRESS
     *
     * @param status <p>
     *            The current status of the account as a delegated administrator
     *            of Amazon Macie for the organization.
     *            </p>
     * @see AdminStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the account as a delegated administrator of Amazon
     * Macie for the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLING_IN_PROGRESS
     *
     * @param status <p>
     *            The current status of the account as a delegated administrator
     *            of Amazon Macie for the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdminStatus
     */
    public AdminAccount withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the account as a delegated administrator of Amazon
     * Macie for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLING_IN_PROGRESS
     *
     * @param status <p>
     *            The current status of the account as a delegated administrator
     *            of Amazon Macie for the organization.
     *            </p>
     * @see AdminStatus
     */
    public void setStatus(AdminStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the account as a delegated administrator of Amazon
     * Macie for the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLING_IN_PROGRESS
     *
     * @param status <p>
     *            The current status of the account as a delegated administrator
     *            of Amazon Macie for the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdminStatus
     */
    public AdminAccount withStatus(AdminStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
