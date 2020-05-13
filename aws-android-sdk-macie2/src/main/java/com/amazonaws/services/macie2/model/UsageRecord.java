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
 * Provides quota and aggregated usage data for an account.
 * </p>
 */
public class UsageRecord implements Serializable {
    /**
     * <p>
     * The AWS account ID for the account that the data applies to.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the free
     * trial period started for the account. This value is null if the account
     * didn't participate in the free trial.
     * </p>
     */
    private java.util.Date freeTrialStartDate;

    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account.
     * Each object contains the data for a specific usage metric and the
     * corresponding quota.
     * </p>
     */
    private java.util.List<UsageByAccount> usage;

    /**
     * <p>
     * The AWS account ID for the account that the data applies to.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the account that the data applies to.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The AWS account ID for the account that the data applies to.
     * </p>
     *
     * @param accountId <p>
     *            The AWS account ID for the account that the data applies to.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID for the account that the data applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The AWS account ID for the account that the data applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecord withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the free
     * trial period started for the account. This value is null if the account
     * didn't participate in the free trial.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         free trial period started for the account. This value is null if
     *         the account didn't participate in the free trial.
     *         </p>
     */
    public java.util.Date getFreeTrialStartDate() {
        return freeTrialStartDate;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the free
     * trial period started for the account. This value is null if the account
     * didn't participate in the free trial.
     * </p>
     *
     * @param freeTrialStartDate <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the free trial period started for the account. This value is
     *            null if the account didn't participate in the free trial.
     *            </p>
     */
    public void setFreeTrialStartDate(java.util.Date freeTrialStartDate) {
        this.freeTrialStartDate = freeTrialStartDate;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the free
     * trial period started for the account. This value is null if the account
     * didn't participate in the free trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param freeTrialStartDate <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the free trial period started for the account. This value is
     *            null if the account didn't participate in the free trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecord withFreeTrialStartDate(java.util.Date freeTrialStartDate) {
        this.freeTrialStartDate = freeTrialStartDate;
        return this;
    }

    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account.
     * Each object contains the data for a specific usage metric and the
     * corresponding quota.
     * </p>
     *
     * @return <p>
     *         An array of objects that contains usage data and quotas for the
     *         account. Each object contains the data for a specific usage
     *         metric and the corresponding quota.
     *         </p>
     */
    public java.util.List<UsageByAccount> getUsage() {
        return usage;
    }

    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account.
     * Each object contains the data for a specific usage metric and the
     * corresponding quota.
     * </p>
     *
     * @param usage <p>
     *            An array of objects that contains usage data and quotas for
     *            the account. Each object contains the data for a specific
     *            usage metric and the corresponding quota.
     *            </p>
     */
    public void setUsage(java.util.Collection<UsageByAccount> usage) {
        if (usage == null) {
            this.usage = null;
            return;
        }

        this.usage = new java.util.ArrayList<UsageByAccount>(usage);
    }

    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account.
     * Each object contains the data for a specific usage metric and the
     * corresponding quota.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usage <p>
     *            An array of objects that contains usage data and quotas for
     *            the account. Each object contains the data for a specific
     *            usage metric and the corresponding quota.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecord withUsage(UsageByAccount... usage) {
        if (getUsage() == null) {
            this.usage = new java.util.ArrayList<UsageByAccount>(usage.length);
        }
        for (UsageByAccount value : usage) {
            this.usage.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account.
     * Each object contains the data for a specific usage metric and the
     * corresponding quota.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usage <p>
     *            An array of objects that contains usage data and quotas for
     *            the account. Each object contains the data for a specific
     *            usage metric and the corresponding quota.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecord withUsage(java.util.Collection<UsageByAccount> usage) {
        setUsage(usage);
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
        if (getFreeTrialStartDate() != null)
            sb.append("freeTrialStartDate: " + getFreeTrialStartDate() + ",");
        if (getUsage() != null)
            sb.append("usage: " + getUsage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getFreeTrialStartDate() == null) ? 0 : getFreeTrialStartDate().hashCode());
        hashCode = prime * hashCode + ((getUsage() == null) ? 0 : getUsage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageRecord == false)
            return false;
        UsageRecord other = (UsageRecord) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getFreeTrialStartDate() == null ^ this.getFreeTrialStartDate() == null)
            return false;
        if (other.getFreeTrialStartDate() != null
                && other.getFreeTrialStartDate().equals(this.getFreeTrialStartDate()) == false)
            return false;
        if (other.getUsage() == null ^ this.getUsage() == null)
            return false;
        if (other.getUsage() != null && other.getUsage().equals(this.getUsage()) == false)
            return false;
        return true;
    }
}
