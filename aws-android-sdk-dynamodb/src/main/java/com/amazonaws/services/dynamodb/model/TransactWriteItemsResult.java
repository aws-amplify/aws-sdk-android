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

public class TransactWriteItemsResult implements Serializable {
    /**
     * <p>
     * The capacity units consumed by the entire <code>TransactWriteItems</code>
     * operation. The values of the list are ordered according to the ordering
     * of the <code>TransactItems</code> request parameter.
     * </p>
     */
    private java.util.List<ConsumedCapacity> consumedCapacity;

    /**
     * <p>
     * A list of tables that were processed by <code>TransactWriteItems</code>
     * and, for each table, information about any item collections that were
     * affected by individual <code>UpdateItem</code>, <code>PutItem</code>, or
     * <code>DeleteItem</code> operations.
     * </p>
     */
    private java.util.Map<String, java.util.List<ItemCollectionMetrics>> itemCollectionMetrics;

    /**
     * <p>
     * The capacity units consumed by the entire <code>TransactWriteItems</code>
     * operation. The values of the list are ordered according to the ordering
     * of the <code>TransactItems</code> request parameter.
     * </p>
     *
     * @return <p>
     *         The capacity units consumed by the entire
     *         <code>TransactWriteItems</code> operation. The values of the list
     *         are ordered according to the ordering of the
     *         <code>TransactItems</code> request parameter.
     *         </p>
     */
    public java.util.List<ConsumedCapacity> getConsumedCapacity() {
        return consumedCapacity;
    }

    /**
     * <p>
     * The capacity units consumed by the entire <code>TransactWriteItems</code>
     * operation. The values of the list are ordered according to the ordering
     * of the <code>TransactItems</code> request parameter.
     * </p>
     *
     * @param consumedCapacity <p>
     *            The capacity units consumed by the entire
     *            <code>TransactWriteItems</code> operation. The values of the
     *            list are ordered according to the ordering of the
     *            <code>TransactItems</code> request parameter.
     *            </p>
     */
    public void setConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
            return;
        }

        this.consumedCapacity = new java.util.ArrayList<ConsumedCapacity>(consumedCapacity);
    }

    /**
     * <p>
     * The capacity units consumed by the entire <code>TransactWriteItems</code>
     * operation. The values of the list are ordered according to the ordering
     * of the <code>TransactItems</code> request parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consumedCapacity <p>
     *            The capacity units consumed by the entire
     *            <code>TransactWriteItems</code> operation. The values of the
     *            list are ordered according to the ordering of the
     *            <code>TransactItems</code> request parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItemsResult withConsumedCapacity(ConsumedCapacity... consumedCapacity) {
        if (getConsumedCapacity() == null) {
            this.consumedCapacity = new java.util.ArrayList<ConsumedCapacity>(
                    consumedCapacity.length);
        }
        for (ConsumedCapacity value : consumedCapacity) {
            this.consumedCapacity.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capacity units consumed by the entire <code>TransactWriteItems</code>
     * operation. The values of the list are ordered according to the ordering
     * of the <code>TransactItems</code> request parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consumedCapacity <p>
     *            The capacity units consumed by the entire
     *            <code>TransactWriteItems</code> operation. The values of the
     *            list are ordered according to the ordering of the
     *            <code>TransactItems</code> request parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItemsResult withConsumedCapacity(
            java.util.Collection<ConsumedCapacity> consumedCapacity) {
        setConsumedCapacity(consumedCapacity);
        return this;
    }

    /**
     * <p>
     * A list of tables that were processed by <code>TransactWriteItems</code>
     * and, for each table, information about any item collections that were
     * affected by individual <code>UpdateItem</code>, <code>PutItem</code>, or
     * <code>DeleteItem</code> operations.
     * </p>
     *
     * @return <p>
     *         A list of tables that were processed by
     *         <code>TransactWriteItems</code> and, for each table, information
     *         about any item collections that were affected by individual
     *         <code>UpdateItem</code>, <code>PutItem</code>, or
     *         <code>DeleteItem</code> operations.
     *         </p>
     */
    public java.util.Map<String, java.util.List<ItemCollectionMetrics>> getItemCollectionMetrics() {
        return itemCollectionMetrics;
    }

    /**
     * <p>
     * A list of tables that were processed by <code>TransactWriteItems</code>
     * and, for each table, information about any item collections that were
     * affected by individual <code>UpdateItem</code>, <code>PutItem</code>, or
     * <code>DeleteItem</code> operations.
     * </p>
     *
     * @param itemCollectionMetrics <p>
     *            A list of tables that were processed by
     *            <code>TransactWriteItems</code> and, for each table,
     *            information about any item collections that were affected by
     *            individual <code>UpdateItem</code>, <code>PutItem</code>, or
     *            <code>DeleteItem</code> operations.
     *            </p>
     */
    public void setItemCollectionMetrics(
            java.util.Map<String, java.util.List<ItemCollectionMetrics>> itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
    }

    /**
     * <p>
     * A list of tables that were processed by <code>TransactWriteItems</code>
     * and, for each table, information about any item collections that were
     * affected by individual <code>UpdateItem</code>, <code>PutItem</code>, or
     * <code>DeleteItem</code> operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param itemCollectionMetrics <p>
     *            A list of tables that were processed by
     *            <code>TransactWriteItems</code> and, for each table,
     *            information about any item collections that were affected by
     *            individual <code>UpdateItem</code>, <code>PutItem</code>, or
     *            <code>DeleteItem</code> operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItemsResult withItemCollectionMetrics(
            java.util.Map<String, java.util.List<ItemCollectionMetrics>> itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
        return this;
    }

    /**
     * <p>
     * A list of tables that were processed by <code>TransactWriteItems</code>
     * and, for each table, information about any item collections that were
     * affected by individual <code>UpdateItem</code>, <code>PutItem</code>, or
     * <code>DeleteItem</code> operations.
     * </p>
     * <p>
     * The method adds a new key-value pair into ItemCollectionMetrics
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into ItemCollectionMetrics.
     * @param value The corresponding value of the entry to be added into
     *            ItemCollectionMetrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItemsResult addItemCollectionMetricsEntry(String key,
            java.util.List<ItemCollectionMetrics> value) {
        if (null == this.itemCollectionMetrics) {
            this.itemCollectionMetrics = new java.util.HashMap<String, java.util.List<ItemCollectionMetrics>>();
        }
        if (this.itemCollectionMetrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.itemCollectionMetrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ItemCollectionMetrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TransactWriteItemsResult clearItemCollectionMetricsEntries() {
        this.itemCollectionMetrics = null;
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
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: " + getConsumedCapacity() + ",");
        if (getItemCollectionMetrics() != null)
            sb.append("ItemCollectionMetrics: " + getItemCollectionMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getItemCollectionMetrics() == null) ? 0 : getItemCollectionMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactWriteItemsResult == false)
            return false;
        TransactWriteItemsResult other = (TransactWriteItemsResult) obj;

        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null
                && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        if (other.getItemCollectionMetrics() == null ^ this.getItemCollectionMetrics() == null)
            return false;
        if (other.getItemCollectionMetrics() != null
                && other.getItemCollectionMetrics().equals(this.getItemCollectionMetrics()) == false)
            return false;
        return true;
    }
}
