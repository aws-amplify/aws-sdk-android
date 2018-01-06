/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The capacity units consumed by an operation. The data returned includes the
 * total provisioned throughput consumed, along with statistics for the table
 * and any indexes involved in the operation. <i>ConsumedCapacity</i> is only
 * returned if the request asked for it. For more information, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
 * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 */
public class ConsumedCapacity implements Serializable {
    /**
     * <p>
     * The name of the table that was affected by the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * The total number of capacity units consumed by the operation.
     * </p>
     */
    private Double capacityUnits;

    /**
     * <p>
     * The amount of throughput consumed on the table affected by the operation.
     * </p>
     */
    private Capacity table;

    /**
     * <p>
     * The amount of throughput consumed on each local index affected by the
     * operation.
     * </p>
     */
    private java.util.Map<String, Capacity> localSecondaryIndexes;

    /**
     * <p>
     * The amount of throughput consumed on each global index affected by the
     * operation.
     * </p>
     */
    private java.util.Map<String, Capacity> globalSecondaryIndexes;

    /**
     * <p>
     * The name of the table that was affected by the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table that was affected by the operation.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table that was affected by the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table that was affected by the operation.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table that was affected by the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table that was affected by the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConsumedCapacity withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The total number of capacity units consumed by the operation.
     * </p>
     *
     * @return <p>
     *         The total number of capacity units consumed by the operation.
     *         </p>
     */
    public Double getCapacityUnits() {
        return capacityUnits;
    }

    /**
     * <p>
     * The total number of capacity units consumed by the operation.
     * </p>
     *
     * @param capacityUnits <p>
     *            The total number of capacity units consumed by the operation.
     *            </p>
     */
    public void setCapacityUnits(Double capacityUnits) {
        this.capacityUnits = capacityUnits;
    }

    /**
     * <p>
     * The total number of capacity units consumed by the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityUnits <p>
     *            The total number of capacity units consumed by the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConsumedCapacity withCapacityUnits(Double capacityUnits) {
        this.capacityUnits = capacityUnits;
        return this;
    }

    /**
     * <p>
     * The amount of throughput consumed on the table affected by the operation.
     * </p>
     *
     * @return <p>
     *         The amount of throughput consumed on the table affected by the
     *         operation.
     *         </p>
     */
    public Capacity getTable() {
        return table;
    }

    /**
     * <p>
     * The amount of throughput consumed on the table affected by the operation.
     * </p>
     *
     * @param table <p>
     *            The amount of throughput consumed on the table affected by the
     *            operation.
     *            </p>
     */
    public void setTable(Capacity table) {
        this.table = table;
    }

    /**
     * <p>
     * The amount of throughput consumed on the table affected by the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param table <p>
     *            The amount of throughput consumed on the table affected by the
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConsumedCapacity withTable(Capacity table) {
        this.table = table;
        return this;
    }

    /**
     * <p>
     * The amount of throughput consumed on each local index affected by the
     * operation.
     * </p>
     *
     * @return <p>
     *         The amount of throughput consumed on each local index affected by
     *         the operation.
     *         </p>
     */
    public java.util.Map<String, Capacity> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    /**
     * <p>
     * The amount of throughput consumed on each local index affected by the
     * operation.
     * </p>
     *
     * @param localSecondaryIndexes <p>
     *            The amount of throughput consumed on each local index affected
     *            by the operation.
     *            </p>
     */
    public void setLocalSecondaryIndexes(java.util.Map<String, Capacity> localSecondaryIndexes) {
        this.localSecondaryIndexes = localSecondaryIndexes;
    }

    /**
     * <p>
     * The amount of throughput consumed on each local index affected by the
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localSecondaryIndexes <p>
     *            The amount of throughput consumed on each local index affected
     *            by the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConsumedCapacity withLocalSecondaryIndexes(
            java.util.Map<String, Capacity> localSecondaryIndexes) {
        this.localSecondaryIndexes = localSecondaryIndexes;
        return this;
    }

    /**
     * <p>
     * The amount of throughput consumed on each local index affected by the
     * operation.
     * </p>
     * <p>
     * The method adds a new key-value pair into LocalSecondaryIndexes
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into LocalSecondaryIndexes.
     * @param value The corresponding value of the entry to be added into
     *            LocalSecondaryIndexes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConsumedCapacity addLocalSecondaryIndexesEntry(String key, Capacity value) {
        if (null == this.localSecondaryIndexes) {
            this.localSecondaryIndexes = new java.util.HashMap<String, Capacity>();
        }
        if (this.localSecondaryIndexes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.localSecondaryIndexes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LocalSecondaryIndexes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ConsumedCapacity clearLocalSecondaryIndexesEntries() {
        this.localSecondaryIndexes = null;
        return this;
    }

    /**
     * <p>
     * The amount of throughput consumed on each global index affected by the
     * operation.
     * </p>
     *
     * @return <p>
     *         The amount of throughput consumed on each global index affected
     *         by the operation.
     *         </p>
     */
    public java.util.Map<String, Capacity> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * The amount of throughput consumed on each global index affected by the
     * operation.
     * </p>
     *
     * @param globalSecondaryIndexes <p>
     *            The amount of throughput consumed on each global index
     *            affected by the operation.
     *            </p>
     */
    public void setGlobalSecondaryIndexes(java.util.Map<String, Capacity> globalSecondaryIndexes) {
        this.globalSecondaryIndexes = globalSecondaryIndexes;
    }

    /**
     * <p>
     * The amount of throughput consumed on each global index affected by the
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexes <p>
     *            The amount of throughput consumed on each global index
     *            affected by the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConsumedCapacity withGlobalSecondaryIndexes(
            java.util.Map<String, Capacity> globalSecondaryIndexes) {
        this.globalSecondaryIndexes = globalSecondaryIndexes;
        return this;
    }

    /**
     * <p>
     * The amount of throughput consumed on each global index affected by the
     * operation.
     * </p>
     * <p>
     * The method adds a new key-value pair into GlobalSecondaryIndexes
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into GlobalSecondaryIndexes.
     * @param value The corresponding value of the entry to be added into
     *            GlobalSecondaryIndexes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConsumedCapacity addGlobalSecondaryIndexesEntry(String key, Capacity value) {
        if (null == this.globalSecondaryIndexes) {
            this.globalSecondaryIndexes = new java.util.HashMap<String, Capacity>();
        }
        if (this.globalSecondaryIndexes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.globalSecondaryIndexes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into GlobalSecondaryIndexes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ConsumedCapacity clearGlobalSecondaryIndexesEntries() {
        this.globalSecondaryIndexes = null;
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
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getCapacityUnits() != null)
            sb.append("CapacityUnits: " + getCapacityUnits() + ",");
        if (getTable() != null)
            sb.append("Table: " + getTable() + ",");
        if (getLocalSecondaryIndexes() != null)
            sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getCapacityUnits() == null) ? 0 : getCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConsumedCapacity == false)
            return false;
        ConsumedCapacity other = (ConsumedCapacity) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null)
            return false;
        if (other.getCapacityUnits() != null
                && other.getCapacityUnits().equals(this.getCapacityUnits()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null)
            return false;
        if (other.getLocalSecondaryIndexes() != null
                && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null
                && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        return true;
    }
}
