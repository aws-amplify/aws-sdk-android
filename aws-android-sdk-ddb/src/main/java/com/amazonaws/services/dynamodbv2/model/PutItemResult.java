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
 * Represents the output of a <i>PutItem</i> operation.
 * </p>
 */
public class PutItemResult implements Serializable {
    /**
     * <p>
     * The attribute values as they appeared before the <i>PutItem</i>
     * operation, but only if <i>ReturnValues</i> is specified as
     * <code>ALL_OLD</code> in the request. Each element consists of an
     * attribute name and an attribute value.
     * </p>
     */
    private java.util.Map<String, AttributeValue> attributes;

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
     * Information about item collections, if any, that were affected by the
     * operation. <i>ItemCollectionMetrics</i> is only returned if the request
     * asked for it. If the table does not have any local secondary indexes,
     * this information is not returned in the response.
     * </p>
     * <p>
     * Each <i>ItemCollectionMetrics</i> element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ItemCollectionKey</i> - The partition key value of the item
     * collection. This is the same as the partition key value of the item
     * itself.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SizeEstimateRange</i> - An estimate of item collection size, in
     * gigabytes. This value is a two-element array containing a lower bound and
     * an upper bound for the estimate. The estimate includes the size of all
     * the items in the table, plus the size of all attributes projected into
     * all of the local secondary indexes on that table. Use this estimate to
     * measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on
     * the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     */
    private ItemCollectionMetrics itemCollectionMetrics;

    /**
     * <p>
     * The attribute values as they appeared before the <i>PutItem</i>
     * operation, but only if <i>ReturnValues</i> is specified as
     * <code>ALL_OLD</code> in the request. Each element consists of an
     * attribute name and an attribute value.
     * </p>
     *
     * @return <p>
     *         The attribute values as they appeared before the <i>PutItem</i>
     *         operation, but only if <i>ReturnValues</i> is specified as
     *         <code>ALL_OLD</code> in the request. Each element consists of an
     *         attribute name and an attribute value.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attribute values as they appeared before the <i>PutItem</i>
     * operation, but only if <i>ReturnValues</i> is specified as
     * <code>ALL_OLD</code> in the request. Each element consists of an
     * attribute name and an attribute value.
     * </p>
     *
     * @param attributes <p>
     *            The attribute values as they appeared before the
     *            <i>PutItem</i> operation, but only if <i>ReturnValues</i> is
     *            specified as <code>ALL_OLD</code> in the request. Each element
     *            consists of an attribute name and an attribute value.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, AttributeValue> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attribute values as they appeared before the <i>PutItem</i>
     * operation, but only if <i>ReturnValues</i> is specified as
     * <code>ALL_OLD</code> in the request. Each element consists of an
     * attribute name and an attribute value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attribute values as they appeared before the
     *            <i>PutItem</i> operation, but only if <i>ReturnValues</i> is
     *            specified as <code>ALL_OLD</code> in the request. Each element
     *            consists of an attribute name and an attribute value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemResult withAttributes(java.util.Map<String, AttributeValue> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * The attribute values as they appeared before the <i>PutItem</i>
     * operation, but only if <i>ReturnValues</i> is specified as
     * <code>ALL_OLD</code> in the request. Each element consists of an
     * attribute name and an attribute value.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemResult addAttributesEntry(String key, AttributeValue value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PutItemResult clearAttributesEntries() {
        this.attributes = null;
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
    public PutItemResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
        return this;
    }

    /**
     * <p>
     * Information about item collections, if any, that were affected by the
     * operation. <i>ItemCollectionMetrics</i> is only returned if the request
     * asked for it. If the table does not have any local secondary indexes,
     * this information is not returned in the response.
     * </p>
     * <p>
     * Each <i>ItemCollectionMetrics</i> element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ItemCollectionKey</i> - The partition key value of the item
     * collection. This is the same as the partition key value of the item
     * itself.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SizeEstimateRange</i> - An estimate of item collection size, in
     * gigabytes. This value is a two-element array containing a lower bound and
     * an upper bound for the estimate. The estimate includes the size of all
     * the items in the table, plus the size of all attributes projected into
     * all of the local secondary indexes on that table. Use this estimate to
     * measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on
     * the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Information about item collections, if any, that were affected by
     *         the operation. <i>ItemCollectionMetrics</i> is only returned if
     *         the request asked for it. If the table does not have any local
     *         secondary indexes, this information is not returned in the
     *         response.
     *         </p>
     *         <p>
     *         Each <i>ItemCollectionMetrics</i> element consists of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>ItemCollectionKey</i> - The partition key value of the item
     *         collection. This is the same as the partition key value of the
     *         item itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SizeEstimateRange</i> - An estimate of item collection size,
     *         in gigabytes. This value is a two-element array containing a
     *         lower bound and an upper bound for the estimate. The estimate
     *         includes the size of all the items in the table, plus the size of
     *         all attributes projected into all of the local secondary indexes
     *         on that table. Use this estimate to measure whether a local
     *         secondary index is approaching its size limit.
     *         </p>
     *         <p>
     *         The estimate is subject to change over time; therefore, do not
     *         rely on the precision or accuracy of the estimate.
     *         </p>
     *         </li>
     *         </ul>
     */
    public ItemCollectionMetrics getItemCollectionMetrics() {
        return itemCollectionMetrics;
    }

    /**
     * <p>
     * Information about item collections, if any, that were affected by the
     * operation. <i>ItemCollectionMetrics</i> is only returned if the request
     * asked for it. If the table does not have any local secondary indexes,
     * this information is not returned in the response.
     * </p>
     * <p>
     * Each <i>ItemCollectionMetrics</i> element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ItemCollectionKey</i> - The partition key value of the item
     * collection. This is the same as the partition key value of the item
     * itself.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SizeEstimateRange</i> - An estimate of item collection size, in
     * gigabytes. This value is a two-element array containing a lower bound and
     * an upper bound for the estimate. The estimate includes the size of all
     * the items in the table, plus the size of all attributes projected into
     * all of the local secondary indexes on that table. Use this estimate to
     * measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on
     * the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     *
     * @param itemCollectionMetrics <p>
     *            Information about item collections, if any, that were affected
     *            by the operation. <i>ItemCollectionMetrics</i> is only
     *            returned if the request asked for it. If the table does not
     *            have any local secondary indexes, this information is not
     *            returned in the response.
     *            </p>
     *            <p>
     *            Each <i>ItemCollectionMetrics</i> element consists of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>ItemCollectionKey</i> - The partition key value of the item
     *            collection. This is the same as the partition key value of the
     *            item itself.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SizeEstimateRange</i> - An estimate of item collection
     *            size, in gigabytes. This value is a two-element array
     *            containing a lower bound and an upper bound for the estimate.
     *            The estimate includes the size of all the items in the table,
     *            plus the size of all attributes projected into all of the
     *            local secondary indexes on that table. Use this estimate to
     *            measure whether a local secondary index is approaching its
     *            size limit.
     *            </p>
     *            <p>
     *            The estimate is subject to change over time; therefore, do not
     *            rely on the precision or accuracy of the estimate.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setItemCollectionMetrics(ItemCollectionMetrics itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
    }

    /**
     * <p>
     * Information about item collections, if any, that were affected by the
     * operation. <i>ItemCollectionMetrics</i> is only returned if the request
     * asked for it. If the table does not have any local secondary indexes,
     * this information is not returned in the response.
     * </p>
     * <p>
     * Each <i>ItemCollectionMetrics</i> element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ItemCollectionKey</i> - The partition key value of the item
     * collection. This is the same as the partition key value of the item
     * itself.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SizeEstimateRange</i> - An estimate of item collection size, in
     * gigabytes. This value is a two-element array containing a lower bound and
     * an upper bound for the estimate. The estimate includes the size of all
     * the items in the table, plus the size of all attributes projected into
     * all of the local secondary indexes on that table. Use this estimate to
     * measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on
     * the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param itemCollectionMetrics <p>
     *            Information about item collections, if any, that were affected
     *            by the operation. <i>ItemCollectionMetrics</i> is only
     *            returned if the request asked for it. If the table does not
     *            have any local secondary indexes, this information is not
     *            returned in the response.
     *            </p>
     *            <p>
     *            Each <i>ItemCollectionMetrics</i> element consists of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>ItemCollectionKey</i> - The partition key value of the item
     *            collection. This is the same as the partition key value of the
     *            item itself.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>SizeEstimateRange</i> - An estimate of item collection
     *            size, in gigabytes. This value is a two-element array
     *            containing a lower bound and an upper bound for the estimate.
     *            The estimate includes the size of all the items in the table,
     *            plus the size of all attributes projected into all of the
     *            local secondary indexes on that table. Use this estimate to
     *            measure whether a local secondary index is approaching its
     *            size limit.
     *            </p>
     *            <p>
     *            The estimate is subject to change over time; therefore, do not
     *            rely on the precision or accuracy of the estimate.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemResult withItemCollectionMetrics(ItemCollectionMetrics itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
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

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
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

        if (obj instanceof PutItemResult == false)
            return false;
        PutItemResult other = (PutItemResult) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
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
