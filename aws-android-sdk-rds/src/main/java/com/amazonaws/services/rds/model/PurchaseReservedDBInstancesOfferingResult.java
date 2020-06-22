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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

public class PurchaseReservedDBInstancesOfferingResult implements Serializable {
    /**
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeReservedDBInstances</code> and
     * <code>PurchaseReservedDBInstancesOffering</code> actions.
     * </p>
     */
    private ReservedDBInstance reservedDBInstance;

    /**
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeReservedDBInstances</code> and
     * <code>PurchaseReservedDBInstancesOffering</code> actions.
     * </p>
     *
     * @return <p>
     *         This data type is used as a response element in the
     *         <code>DescribeReservedDBInstances</code> and
     *         <code>PurchaseReservedDBInstancesOffering</code> actions.
     *         </p>
     */
    public ReservedDBInstance getReservedDBInstance() {
        return reservedDBInstance;
    }

    /**
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeReservedDBInstances</code> and
     * <code>PurchaseReservedDBInstancesOffering</code> actions.
     * </p>
     *
     * @param reservedDBInstance <p>
     *            This data type is used as a response element in the
     *            <code>DescribeReservedDBInstances</code> and
     *            <code>PurchaseReservedDBInstancesOffering</code> actions.
     *            </p>
     */
    public void setReservedDBInstance(ReservedDBInstance reservedDBInstance) {
        this.reservedDBInstance = reservedDBInstance;
    }

    /**
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeReservedDBInstances</code> and
     * <code>PurchaseReservedDBInstancesOffering</code> actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstance <p>
     *            This data type is used as a response element in the
     *            <code>DescribeReservedDBInstances</code> and
     *            <code>PurchaseReservedDBInstancesOffering</code> actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedDBInstancesOfferingResult withReservedDBInstance(
            ReservedDBInstance reservedDBInstance) {
        this.reservedDBInstance = reservedDBInstance;
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
        if (getReservedDBInstance() != null)
            sb.append("ReservedDBInstance: " + getReservedDBInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservedDBInstance() == null) ? 0 : getReservedDBInstance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedDBInstancesOfferingResult == false)
            return false;
        PurchaseReservedDBInstancesOfferingResult other = (PurchaseReservedDBInstancesOfferingResult) obj;

        if (other.getReservedDBInstance() == null ^ this.getReservedDBInstance() == null)
            return false;
        if (other.getReservedDBInstance() != null
                && other.getReservedDBInstance().equals(this.getReservedDBInstance()) == false)
            return false;
        return true;
    }
}
