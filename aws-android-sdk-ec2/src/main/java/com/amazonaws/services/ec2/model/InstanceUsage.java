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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the Capacity Reservation usage.
 * </p>
 */
public class InstanceUsage implements Serializable {
    /**
     * <p>
     * The ID of the AWS account that is making use of the Capacity Reservation.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The number of instances the AWS account currently has in the Capacity
     * Reservation.
     * </p>
     */
    private Integer usedInstanceCount;

    /**
     * <p>
     * The ID of the AWS account that is making use of the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that is making use of the Capacity
     *         Reservation.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The ID of the AWS account that is making use of the Capacity Reservation.
     * </p>
     *
     * @param accountId <p>
     *            The ID of the AWS account that is making use of the Capacity
     *            Reservation.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the AWS account that is making use of the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The ID of the AWS account that is making use of the Capacity
     *            Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceUsage withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The number of instances the AWS account currently has in the Capacity
     * Reservation.
     * </p>
     *
     * @return <p>
     *         The number of instances the AWS account currently has in the
     *         Capacity Reservation.
     *         </p>
     */
    public Integer getUsedInstanceCount() {
        return usedInstanceCount;
    }

    /**
     * <p>
     * The number of instances the AWS account currently has in the Capacity
     * Reservation.
     * </p>
     *
     * @param usedInstanceCount <p>
     *            The number of instances the AWS account currently has in the
     *            Capacity Reservation.
     *            </p>
     */
    public void setUsedInstanceCount(Integer usedInstanceCount) {
        this.usedInstanceCount = usedInstanceCount;
    }

    /**
     * <p>
     * The number of instances the AWS account currently has in the Capacity
     * Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usedInstanceCount <p>
     *            The number of instances the AWS account currently has in the
     *            Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceUsage withUsedInstanceCount(Integer usedInstanceCount) {
        this.usedInstanceCount = usedInstanceCount;
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
        if (getUsedInstanceCount() != null)
            sb.append("UsedInstanceCount: " + getUsedInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getUsedInstanceCount() == null) ? 0 : getUsedInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceUsage == false)
            return false;
        InstanceUsage other = (InstanceUsage) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUsedInstanceCount() == null ^ this.getUsedInstanceCount() == null)
            return false;
        if (other.getUsedInstanceCount() != null
                && other.getUsedInstanceCount().equals(this.getUsedInstanceCount()) == false)
            return false;
        return true;
    }
}
