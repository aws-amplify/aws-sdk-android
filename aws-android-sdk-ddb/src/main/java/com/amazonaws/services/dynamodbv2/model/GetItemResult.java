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
 * Represents the output of a <i>GetItem</i> operation.
 * </p>
 */
public class GetItemResult implements Serializable {
    /**
     * <p>
     * A map of attribute names to <i>AttributeValue</i> objects, as specified
     * by <i>AttributesToGet</i>.
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;

    /**
     * <p>
     * The capacity units consumed by an operation. The data returned includes
     * the total provisioned throughput consumed, along with statistics for the
     * table and any indexes involved in the operation. <i>ConsumedCapacity</i>
     * is only returned if the request asked for it. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     */
    private ConsumedCapacity consumedCapacity;

    /**
     * <p>
     * A map of attribute names to <i>AttributeValue</i> objects, as specified
     * by <i>AttributesToGet</i>.
     * </p>
     *
     * @return <p>
     *         A map of attribute names to <i>AttributeValue</i> objects, as
     *         specified by <i>AttributesToGet</i>.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * A map of attribute names to <i>AttributeValue</i> objects, as specified
     * by <i>AttributesToGet</i>.
     * </p>
     *
     * @param item <p>
     *            A map of attribute names to <i>AttributeValue</i> objects, as
     *            specified by <i>AttributesToGet</i>.
     *            </p>
     */
    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * A map of attribute names to <i>AttributeValue</i> objects, as specified
     * by <i>AttributesToGet</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item <p>
     *            A map of attribute names to <i>AttributeValue</i> objects, as
     *            specified by <i>AttributesToGet</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemResult withItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
        return this;
    }

    /**
     * <p>
     * A map of attribute names to <i>AttributeValue</i> objects, as specified
     * by <i>AttributesToGet</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into Item parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Item.
     * @param value The corresponding value of the entry to be added into Item.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemResult addItemEntry(String key, AttributeValue value) {
        if (null == this.item) {
            this.item = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.item.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.item.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Item.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetItemResult clearItemEntries() {
        this.item = null;
        return this;
    }

    /**
     * <p>
     * The capacity units consumed by an operation. The data returned includes
     * the total provisioned throughput consumed, along with statistics for the
     * table and any indexes involved in the operation. <i>ConsumedCapacity</i>
     * is only returned if the request asked for it. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The capacity units consumed by an operation. The data returned
     *         includes the total provisioned throughput consumed, along with
     *         statistics for the table and any indexes involved in the
     *         operation. <i>ConsumedCapacity</i> is only returned if the
     *         request asked for it. For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *         >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     */
    public ConsumedCapacity getConsumedCapacity() {
        return consumedCapacity;
    }

    /**
     * <p>
     * The capacity units consumed by an operation. The data returned includes
     * the total provisioned throughput consumed, along with statistics for the
     * table and any indexes involved in the operation. <i>ConsumedCapacity</i>
     * is only returned if the request asked for it. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @param consumedCapacity <p>
     *            The capacity units consumed by an operation. The data returned
     *            includes the total provisioned throughput consumed, along with
     *            statistics for the table and any indexes involved in the
     *            operation. <i>ConsumedCapacity</i> is only returned if the
     *            request asked for it. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *            >Provisioned Throughput</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     */
    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }

    /**
     * <p>
     * The capacity units consumed by an operation. The data returned includes
     * the total provisioned throughput consumed, along with statistics for the
     * table and any indexes involved in the operation. <i>ConsumedCapacity</i>
     * is only returned if the request asked for it. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consumedCapacity <p>
     *            The capacity units consumed by an operation. The data returned
     *            includes the total provisioned throughput consumed, along with
     *            statistics for the table and any indexes involved in the
     *            operation. <i>ConsumedCapacity</i> is only returned if the
     *            request asked for it. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *            >Provisioned Throughput</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
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
        if (getItem() != null)
            sb.append("Item: " + getItem() + ",");
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: " + getConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode
                + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetItemResult == false)
            return false;
        GetItemResult other = (GetItemResult) obj;

        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null
                && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        return true;
    }
}
