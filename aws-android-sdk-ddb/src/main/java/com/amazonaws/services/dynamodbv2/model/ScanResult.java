/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the output of a <code>Scan</code> operation.
 * </p>
 */
public class ScanResult implements Serializable {
    /**
     * <p>
     * An array of item attributes that match the scan criteria. Each element in
     * this array consists of an attribute name and the value for that
     * attribute.
     * </p>
     */
    private java.util.List<java.util.Map<String, AttributeValue>> items;

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you set <code>ScanFilter</code> in the request, then
     * <code>Count</code> is the number of items returned after the filter was
     * applied, and <code>ScannedCount</code> is the number of matching items
     * before the filter was applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>Count</code> is
     * the same as <code>ScannedCount</code>.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The number of items evaluated, before any <code>ScanFilter</code> is
     * applied. A high <code>ScannedCount</code> value with few, or no,
     * <code>Count</code> results indicates an inefficient <code>Scan</code>
     * operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count"
     * >Count and ScannedCount</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then
     * <code>ScannedCount</code> is the same as <code>Count</code>.
     * </p>
     */
    private Integer scannedCount;

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the
     * previous result set. Use this value to start a new operation, excluding
     * this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is empty, then the "last page" of
     * results has been processed and there is no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is not empty, it does not necessarily
     * mean that there is more data in the result set. The only way to know when
     * you have reached the end of the result set is when
     * <code>LastEvaluatedKey</code> is empty.
     * </p>
     */
    private java.util.Map<String, AttributeValue> lastEvaluatedKey;

    /**
     * <p>
     * The capacity units consumed by the <code>Scan</code> operation. The data
     * returned includes the total provisioned throughput consumed, along with
     * statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the
     * <code>ReturnConsumedCapacity</code> parameter was specified. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     */
    private ConsumedCapacity consumedCapacity;

    /**
     * <p>
     * An array of item attributes that match the scan criteria. Each element in
     * this array consists of an attribute name and the value for that
     * attribute.
     * </p>
     *
     * @return <p>
     *         An array of item attributes that match the scan criteria. Each
     *         element in this array consists of an attribute name and the value
     *         for that attribute.
     *         </p>
     */
    public java.util.List<java.util.Map<String, AttributeValue>> getItems() {
        return items;
    }

    /**
     * <p>
     * An array of item attributes that match the scan criteria. Each element in
     * this array consists of an attribute name and the value for that
     * attribute.
     * </p>
     *
     * @param items <p>
     *            An array of item attributes that match the scan criteria. Each
     *            element in this array consists of an attribute name and the
     *            value for that attribute.
     *            </p>
     */
    public void setItems(java.util.Collection<java.util.Map<String, AttributeValue>> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<java.util.Map<String, AttributeValue>>(items);
    }

    /**
     * <p>
     * An array of item attributes that match the scan criteria. Each element in
     * this array consists of an attribute name and the value for that
     * attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            An array of item attributes that match the scan criteria. Each
     *            element in this array consists of an attribute name and the
     *            value for that attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanResult withItems(java.util.Map<String, AttributeValue>... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<java.util.Map<String, AttributeValue>>(
                    items.length);
        }
        for (java.util.Map<String, AttributeValue> value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of item attributes that match the scan criteria. Each element in
     * this array consists of an attribute name and the value for that
     * attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            An array of item attributes that match the scan criteria. Each
     *            element in this array consists of an attribute name and the
     *            value for that attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanResult withItems(java.util.Collection<java.util.Map<String, AttributeValue>> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you set <code>ScanFilter</code> in the request, then
     * <code>Count</code> is the number of items returned after the filter was
     * applied, and <code>ScannedCount</code> is the number of matching items
     * before the filter was applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>Count</code> is
     * the same as <code>ScannedCount</code>.
     * </p>
     *
     * @return <p>
     *         The number of items in the response.
     *         </p>
     *         <p>
     *         If you set <code>ScanFilter</code> in the request, then
     *         <code>Count</code> is the number of items returned after the
     *         filter was applied, and <code>ScannedCount</code> is the number
     *         of matching items before the filter was applied.
     *         </p>
     *         <p>
     *         If you did not use a filter in the request, then
     *         <code>Count</code> is the same as <code>ScannedCount</code>.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you set <code>ScanFilter</code> in the request, then
     * <code>Count</code> is the number of items returned after the filter was
     * applied, and <code>ScannedCount</code> is the number of matching items
     * before the filter was applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>Count</code> is
     * the same as <code>ScannedCount</code>.
     * </p>
     *
     * @param count <p>
     *            The number of items in the response.
     *            </p>
     *            <p>
     *            If you set <code>ScanFilter</code> in the request, then
     *            <code>Count</code> is the number of items returned after the
     *            filter was applied, and <code>ScannedCount</code> is the
     *            number of matching items before the filter was applied.
     *            </p>
     *            <p>
     *            If you did not use a filter in the request, then
     *            <code>Count</code> is the same as <code>ScannedCount</code>.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of items in the response.
     * </p>
     * <p>
     * If you set <code>ScanFilter</code> in the request, then
     * <code>Count</code> is the number of items returned after the filter was
     * applied, and <code>ScannedCount</code> is the number of matching items
     * before the filter was applied.
     * </p>
     * <p>
     * If you did not use a filter in the request, then <code>Count</code> is
     * the same as <code>ScannedCount</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of items in the response.
     *            </p>
     *            <p>
     *            If you set <code>ScanFilter</code> in the request, then
     *            <code>Count</code> is the number of items returned after the
     *            filter was applied, and <code>ScannedCount</code> is the
     *            number of matching items before the filter was applied.
     *            </p>
     *            <p>
     *            If you did not use a filter in the request, then
     *            <code>Count</code> is the same as <code>ScannedCount</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The number of items evaluated, before any <code>ScanFilter</code> is
     * applied. A high <code>ScannedCount</code> value with few, or no,
     * <code>Count</code> results indicates an inefficient <code>Scan</code>
     * operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count"
     * >Count and ScannedCount</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then
     * <code>ScannedCount</code> is the same as <code>Count</code>.
     * </p>
     *
     * @return <p>
     *         The number of items evaluated, before any <code>ScanFilter</code>
     *         is applied. A high <code>ScannedCount</code> value with few, or
     *         no, <code>Count</code> results indicates an inefficient
     *         <code>Scan</code> operation. For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count"
     *         >Count and ScannedCount</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     *         <p>
     *         If you did not use a filter in the request, then
     *         <code>ScannedCount</code> is the same as <code>Count</code>.
     *         </p>
     */
    public Integer getScannedCount() {
        return scannedCount;
    }

    /**
     * <p>
     * The number of items evaluated, before any <code>ScanFilter</code> is
     * applied. A high <code>ScannedCount</code> value with few, or no,
     * <code>Count</code> results indicates an inefficient <code>Scan</code>
     * operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count"
     * >Count and ScannedCount</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then
     * <code>ScannedCount</code> is the same as <code>Count</code>.
     * </p>
     *
     * @param scannedCount <p>
     *            The number of items evaluated, before any
     *            <code>ScanFilter</code> is applied. A high
     *            <code>ScannedCount</code> value with few, or no,
     *            <code>Count</code> results indicates an inefficient
     *            <code>Scan</code> operation. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count"
     *            >Count and ScannedCount</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            If you did not use a filter in the request, then
     *            <code>ScannedCount</code> is the same as <code>Count</code>.
     *            </p>
     */
    public void setScannedCount(Integer scannedCount) {
        this.scannedCount = scannedCount;
    }

    /**
     * <p>
     * The number of items evaluated, before any <code>ScanFilter</code> is
     * applied. A high <code>ScannedCount</code> value with few, or no,
     * <code>Count</code> results indicates an inefficient <code>Scan</code>
     * operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count"
     * >Count and ScannedCount</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * If you did not use a filter in the request, then
     * <code>ScannedCount</code> is the same as <code>Count</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scannedCount <p>
     *            The number of items evaluated, before any
     *            <code>ScanFilter</code> is applied. A high
     *            <code>ScannedCount</code> value with few, or no,
     *            <code>Count</code> results indicates an inefficient
     *            <code>Scan</code> operation. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count"
     *            >Count and ScannedCount</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            If you did not use a filter in the request, then
     *            <code>ScannedCount</code> is the same as <code>Count</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanResult withScannedCount(Integer scannedCount) {
        this.scannedCount = scannedCount;
        return this;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the
     * previous result set. Use this value to start a new operation, excluding
     * this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is empty, then the "last page" of
     * results has been processed and there is no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is not empty, it does not necessarily
     * mean that there is more data in the result set. The only way to know when
     * you have reached the end of the result set is when
     * <code>LastEvaluatedKey</code> is empty.
     * </p>
     *
     * @return <p>
     *         The primary key of the item where the operation stopped,
     *         inclusive of the previous result set. Use this value to start a
     *         new operation, excluding this value in the new request.
     *         </p>
     *         <p>
     *         If <code>LastEvaluatedKey</code> is empty, then the "last page"
     *         of results has been processed and there is no more data to be
     *         retrieved.
     *         </p>
     *         <p>
     *         If <code>LastEvaluatedKey</code> is not empty, it does not
     *         necessarily mean that there is more data in the result set. The
     *         only way to know when you have reached the end of the result set
     *         is when <code>LastEvaluatedKey</code> is empty.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getLastEvaluatedKey() {
        return lastEvaluatedKey;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the
     * previous result set. Use this value to start a new operation, excluding
     * this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is empty, then the "last page" of
     * results has been processed and there is no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is not empty, it does not necessarily
     * mean that there is more data in the result set. The only way to know when
     * you have reached the end of the result set is when
     * <code>LastEvaluatedKey</code> is empty.
     * </p>
     *
     * @param lastEvaluatedKey <p>
     *            The primary key of the item where the operation stopped,
     *            inclusive of the previous result set. Use this value to start
     *            a new operation, excluding this value in the new request.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedKey</code> is empty, then the
     *            "last page" of results has been processed and there is no more
     *            data to be retrieved.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedKey</code> is not empty, it does not
     *            necessarily mean that there is more data in the result set.
     *            The only way to know when you have reached the end of the
     *            result set is when <code>LastEvaluatedKey</code> is empty.
     *            </p>
     */
    public void setLastEvaluatedKey(java.util.Map<String, AttributeValue> lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the
     * previous result set. Use this value to start a new operation, excluding
     * this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is empty, then the "last page" of
     * results has been processed and there is no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is not empty, it does not necessarily
     * mean that there is more data in the result set. The only way to know when
     * you have reached the end of the result set is when
     * <code>LastEvaluatedKey</code> is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastEvaluatedKey <p>
     *            The primary key of the item where the operation stopped,
     *            inclusive of the previous result set. Use this value to start
     *            a new operation, excluding this value in the new request.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedKey</code> is empty, then the
     *            "last page" of results has been processed and there is no more
     *            data to be retrieved.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedKey</code> is not empty, it does not
     *            necessarily mean that there is more data in the result set.
     *            The only way to know when you have reached the end of the
     *            result set is when <code>LastEvaluatedKey</code> is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanResult withLastEvaluatedKey(java.util.Map<String, AttributeValue> lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
        return this;
    }

    /**
     * <p>
     * The primary key of the item where the operation stopped, inclusive of the
     * previous result set. Use this value to start a new operation, excluding
     * this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is empty, then the "last page" of
     * results has been processed and there is no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedKey</code> is not empty, it does not necessarily
     * mean that there is more data in the result set. The only way to know when
     * you have reached the end of the result set is when
     * <code>LastEvaluatedKey</code> is empty.
     * </p>
     * <p>
     * The method adds a new key-value pair into LastEvaluatedKey parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into LastEvaluatedKey.
     * @param value The corresponding value of the entry to be added into
     *            LastEvaluatedKey.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanResult addLastEvaluatedKeyEntry(String key, AttributeValue value) {
        if (null == this.lastEvaluatedKey) {
            this.lastEvaluatedKey = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.lastEvaluatedKey.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.lastEvaluatedKey.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LastEvaluatedKey.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ScanResult clearLastEvaluatedKeyEntries() {
        this.lastEvaluatedKey = null;
        return this;
    }

    /**
     * <p>
     * The capacity units consumed by the <code>Scan</code> operation. The data
     * returned includes the total provisioned throughput consumed, along with
     * statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the
     * <code>ReturnConsumedCapacity</code> parameter was specified. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The capacity units consumed by the <code>Scan</code> operation.
     *         The data returned includes the total provisioned throughput
     *         consumed, along with statistics for the table and any indexes
     *         involved in the operation. <code>ConsumedCapacity</code> is only
     *         returned if the <code>ReturnConsumedCapacity</code> parameter was
     *         specified. For more information, see <a href=
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
     * The capacity units consumed by the <code>Scan</code> operation. The data
     * returned includes the total provisioned throughput consumed, along with
     * statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the
     * <code>ReturnConsumedCapacity</code> parameter was specified. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @param consumedCapacity <p>
     *            The capacity units consumed by the <code>Scan</code>
     *            operation. The data returned includes the total provisioned
     *            throughput consumed, along with statistics for the table and
     *            any indexes involved in the operation.
     *            <code>ConsumedCapacity</code> is only returned if the
     *            <code>ReturnConsumedCapacity</code> parameter was specified.
     *            For more information, see <a href=
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
     * The capacity units consumed by the <code>Scan</code> operation. The data
     * returned includes the total provisioned throughput consumed, along with
     * statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the
     * <code>ReturnConsumedCapacity</code> parameter was specified. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consumedCapacity <p>
     *            The capacity units consumed by the <code>Scan</code>
     *            operation. The data returned includes the total provisioned
     *            throughput consumed, along with statistics for the table and
     *            any indexes involved in the operation.
     *            <code>ConsumedCapacity</code> is only returned if the
     *            <code>ReturnConsumedCapacity</code> parameter was specified.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *            >Provisioned Throughput</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
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
        if (getItems() != null)
            sb.append("Items: " + getItems() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getScannedCount() != null)
            sb.append("ScannedCount: " + getScannedCount() + ",");
        if (getLastEvaluatedKey() != null)
            sb.append("LastEvaluatedKey: " + getLastEvaluatedKey() + ",");
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: " + getConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode
                + ((getScannedCount() == null) ? 0 : getScannedCount().hashCode());
        hashCode = prime * hashCode
                + ((getLastEvaluatedKey() == null) ? 0 : getLastEvaluatedKey().hashCode());
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

        if (obj instanceof ScanResult == false)
            return false;
        ScanResult other = (ScanResult) obj;

        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getScannedCount() == null ^ this.getScannedCount() == null)
            return false;
        if (other.getScannedCount() != null
                && other.getScannedCount().equals(this.getScannedCount()) == false)
            return false;
        if (other.getLastEvaluatedKey() == null ^ this.getLastEvaluatedKey() == null)
            return false;
        if (other.getLastEvaluatedKey() != null
                && other.getLastEvaluatedKey().equals(this.getLastEvaluatedKey()) == false)
            return false;
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null
                && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        return true;
    }
}
