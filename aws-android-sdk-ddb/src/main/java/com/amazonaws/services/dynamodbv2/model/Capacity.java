/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the amount of provisioned throughput capacity consumed on a table
 * or an index.
 * </p>
 */
public class Capacity implements Serializable {
    /**
     * <p>
     * The total number of capacity units consumed on a table or an index.
     * </p>
     */
    private Double capacityUnits;

    /**
     * <p>
     * The total number of capacity units consumed on a table or an index.
     * </p>
     *
     * @return <p>
     *         The total number of capacity units consumed on a table or an
     *         index.
     *         </p>
     */
    public Double getCapacityUnits() {
        return capacityUnits;
    }

    /**
     * <p>
     * The total number of capacity units consumed on a table or an index.
     * </p>
     *
     * @param capacityUnits <p>
     *            The total number of capacity units consumed on a table or an
     *            index.
     *            </p>
     */
    public void setCapacityUnits(Double capacityUnits) {
        this.capacityUnits = capacityUnits;
    }

    /**
     * <p>
     * The total number of capacity units consumed on a table or an index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityUnits <p>
     *            The total number of capacity units consumed on a table or an
     *            index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Capacity withCapacityUnits(Double capacityUnits) {
        this.capacityUnits = capacityUnits;
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
        if (getCapacityUnits() != null)
            sb.append("CapacityUnits: " + getCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCapacityUnits() == null) ? 0 : getCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Capacity == false)
            return false;
        Capacity other = (Capacity) obj;

        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null)
            return false;
        if (other.getCapacityUnits() != null
                && other.getCapacityUnits().equals(this.getCapacityUnits()) == false)
            return false;
        return true;
    }
}
