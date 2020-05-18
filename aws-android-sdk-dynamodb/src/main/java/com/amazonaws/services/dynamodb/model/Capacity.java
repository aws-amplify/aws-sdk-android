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

package com.amazonaws.services.dynamodb.model;

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
     * The total number of read capacity units consumed on a table or an index.
     * </p>
     */
    private Double readCapacityUnits;

    /**
     * <p>
     * The total number of write capacity units consumed on a table or an index.
     * </p>
     */
    private Double writeCapacityUnits;

    /**
     * <p>
     * The total number of capacity units consumed on a table or an index.
     * </p>
     */
    private Double capacityUnits;

    /**
     * <p>
     * The total number of read capacity units consumed on a table or an index.
     * </p>
     *
     * @return <p>
     *         The total number of read capacity units consumed on a table or an
     *         index.
     *         </p>
     */
    public Double getReadCapacityUnits() {
        return readCapacityUnits;
    }

    /**
     * <p>
     * The total number of read capacity units consumed on a table or an index.
     * </p>
     *
     * @param readCapacityUnits <p>
     *            The total number of read capacity units consumed on a table or
     *            an index.
     *            </p>
     */
    public void setReadCapacityUnits(Double readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * The total number of read capacity units consumed on a table or an index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readCapacityUnits <p>
     *            The total number of read capacity units consumed on a table or
     *            an index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Capacity withReadCapacityUnits(Double readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
        return this;
    }

    /**
     * <p>
     * The total number of write capacity units consumed on a table or an index.
     * </p>
     *
     * @return <p>
     *         The total number of write capacity units consumed on a table or
     *         an index.
     *         </p>
     */
    public Double getWriteCapacityUnits() {
        return writeCapacityUnits;
    }

    /**
     * <p>
     * The total number of write capacity units consumed on a table or an index.
     * </p>
     *
     * @param writeCapacityUnits <p>
     *            The total number of write capacity units consumed on a table
     *            or an index.
     *            </p>
     */
    public void setWriteCapacityUnits(Double writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
    }

    /**
     * <p>
     * The total number of write capacity units consumed on a table or an index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeCapacityUnits <p>
     *            The total number of write capacity units consumed on a table
     *            or an index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Capacity withWriteCapacityUnits(Double writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
        return this;
    }

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
        if (getReadCapacityUnits() != null)
            sb.append("ReadCapacityUnits: " + getReadCapacityUnits() + ",");
        if (getWriteCapacityUnits() != null)
            sb.append("WriteCapacityUnits: " + getWriteCapacityUnits() + ",");
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
                + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode());
        hashCode = prime * hashCode
                + ((getWriteCapacityUnits() == null) ? 0 : getWriteCapacityUnits().hashCode());
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

        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null)
            return false;
        if (other.getReadCapacityUnits() != null
                && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false)
            return false;
        if (other.getWriteCapacityUnits() == null ^ this.getWriteCapacityUnits() == null)
            return false;
        if (other.getWriteCapacityUnits() != null
                && other.getWriteCapacityUnits().equals(this.getWriteCapacityUnits()) == false)
            return false;
        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null)
            return false;
        if (other.getCapacityUnits() != null
                && other.getCapacityUnits().equals(this.getCapacityUnits()) == false)
            return false;
        return true;
    }
}
