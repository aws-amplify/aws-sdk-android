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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Defines an action to write to the Amazon DynamoDB table that you created. The
 * standard action payload contains all attribute-value pairs that have the
 * information about the detector model instance and the event that triggered
 * the action. You can also customize the <a href=
 * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
 * >payload</a>. One column of the DynamoDB table receives all attribute-value
 * pairs in the payload that you specify.
 * </p>
 * <p>
 * The <code>tableName</code> and <code>hashKeyField</code> values must match
 * the table name and the partition key of the DynamoDB table.
 * </p>
 * <note>
 * <p>
 * If the DynamoDB table also has a sort key, you must specify
 * <code>rangeKeyField</code>. The <code>rangeKeyField</code> value must match
 * the sort key.
 * </p>
 * </note>
 * <p/>
 * <p>
 * The <code>hashKeyValue</code> and <code>rangeKeyValue</code> use substitution
 * templates. These templates provide data at runtime. The syntax is
 * <code>${sql-expression}</code>.
 * </p>
 * <p>
 * You can use expressions for parameters that are string data type. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html"
 * >Expressions</a> in the <i>AWS IoT Events Developer Guide</i>.
 * </p>
 * <note>
 * <p>
 * If the defined payload type is a string, <code>DynamoDBAction</code> writes
 * non-JSON data to the DynamoDB table as binary data. The DynamoDB console
 * displays the data as Base64-encoded text. The <code>payloadField</code> is
 * <code>&lt;payload-field&gt;_raw</code>.
 * </p>
 * </note>
 */
public class DynamoDBAction implements Serializable {
    /**
     * <p>
     * The data type for the hash key (also called the partition key). You can
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> - The hash key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NUMBER</code> - The hash key is a number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>hashKeyType</code>, the default value is
     * <code>STRING</code>.
     * </p>
     */
    private String hashKeyType;

    /**
     * <p>
     * The name of the hash key (also called the partition key).
     * </p>
     */
    private String hashKeyField;

    /**
     * <p>
     * The value of the hash key (also called the partition key).
     * </p>
     */
    private String hashKeyValue;

    /**
     * <p>
     * The data type for the range key (also called the sort key), You can
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> - The range key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NUMBER</code> - The range key is number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>rangeKeyField</code>, the default value is
     * <code>STRING</code>.
     * </p>
     */
    private String rangeKeyType;

    /**
     * <p>
     * The name of the range key (also called the sort key).
     * </p>
     */
    private String rangeKeyField;

    /**
     * <p>
     * The value of the range key (also called the sort key).
     * </p>
     */
    private String rangeKeyValue;

    /**
     * <p>
     * The type of operation to perform. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - Insert data as a new item into the DynamoDB table.
     * This item uses the specified hash key as a partition key. If you
     * specified a range key, the item uses the range key as a sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code> - Update an existing item of the DynamoDB table with
     * new data. This item's partition key must match the specified hash key. If
     * you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Delete an existing item of the DynamoDB table. This
     * item's partition key must match the specified hash key. If you specified
     * a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify this parameter, AWS IoT Events triggers the
     * <code>INSERT</code> operation.
     * </p>
     */
    private String operation;

    /**
     * <p>
     * The name of the DynamoDB column that receives the action payload.
     * </p>
     * <p>
     * If you don't specify this parameter, the name of the DynamoDB column is
     * <code>payload</code>.
     * </p>
     */
    private String payloadField;

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * Information needed to configure the payload.
     * </p>
     * <p>
     * By default, AWS IoT Events generates a standard payload in JSON for any
     * action. This action payload contains all attribute-value pairs that have
     * the information about the detector model instance and the event triggered
     * the action. To configure the action payload, you can use
     * <code>contentExpression</code>.
     * </p>
     */
    private Payload payload;

    /**
     * <p>
     * The data type for the hash key (also called the partition key). You can
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> - The hash key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NUMBER</code> - The hash key is a number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>hashKeyType</code>, the default value is
     * <code>STRING</code>.
     * </p>
     *
     * @return <p>
     *         The data type for the hash key (also called the partition key).
     *         You can specify the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>STRING</code> - The hash key is a string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NUMBER</code> - The hash key is a number.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify <code>hashKeyType</code>, the default value
     *         is <code>STRING</code>.
     *         </p>
     */
    public String getHashKeyType() {
        return hashKeyType;
    }

    /**
     * <p>
     * The data type for the hash key (also called the partition key). You can
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> - The hash key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NUMBER</code> - The hash key is a number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>hashKeyType</code>, the default value is
     * <code>STRING</code>.
     * </p>
     *
     * @param hashKeyType <p>
     *            The data type for the hash key (also called the partition
     *            key). You can specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>STRING</code> - The hash key is a string.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NUMBER</code> - The hash key is a number.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify <code>hashKeyType</code>, the default
     *            value is <code>STRING</code>.
     *            </p>
     */
    public void setHashKeyType(String hashKeyType) {
        this.hashKeyType = hashKeyType;
    }

    /**
     * <p>
     * The data type for the hash key (also called the partition key). You can
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> - The hash key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NUMBER</code> - The hash key is a number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>hashKeyType</code>, the default value is
     * <code>STRING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hashKeyType <p>
     *            The data type for the hash key (also called the partition
     *            key). You can specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>STRING</code> - The hash key is a string.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NUMBER</code> - The hash key is a number.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify <code>hashKeyType</code>, the default
     *            value is <code>STRING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withHashKeyType(String hashKeyType) {
        this.hashKeyType = hashKeyType;
        return this;
    }

    /**
     * <p>
     * The name of the hash key (also called the partition key).
     * </p>
     *
     * @return <p>
     *         The name of the hash key (also called the partition key).
     *         </p>
     */
    public String getHashKeyField() {
        return hashKeyField;
    }

    /**
     * <p>
     * The name of the hash key (also called the partition key).
     * </p>
     *
     * @param hashKeyField <p>
     *            The name of the hash key (also called the partition key).
     *            </p>
     */
    public void setHashKeyField(String hashKeyField) {
        this.hashKeyField = hashKeyField;
    }

    /**
     * <p>
     * The name of the hash key (also called the partition key).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hashKeyField <p>
     *            The name of the hash key (also called the partition key).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withHashKeyField(String hashKeyField) {
        this.hashKeyField = hashKeyField;
        return this;
    }

    /**
     * <p>
     * The value of the hash key (also called the partition key).
     * </p>
     *
     * @return <p>
     *         The value of the hash key (also called the partition key).
     *         </p>
     */
    public String getHashKeyValue() {
        return hashKeyValue;
    }

    /**
     * <p>
     * The value of the hash key (also called the partition key).
     * </p>
     *
     * @param hashKeyValue <p>
     *            The value of the hash key (also called the partition key).
     *            </p>
     */
    public void setHashKeyValue(String hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

    /**
     * <p>
     * The value of the hash key (also called the partition key).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hashKeyValue <p>
     *            The value of the hash key (also called the partition key).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withHashKeyValue(String hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
        return this;
    }

    /**
     * <p>
     * The data type for the range key (also called the sort key), You can
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> - The range key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NUMBER</code> - The range key is number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>rangeKeyField</code>, the default value is
     * <code>STRING</code>.
     * </p>
     *
     * @return <p>
     *         The data type for the range key (also called the sort key), You
     *         can specify the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>STRING</code> - The range key is a string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NUMBER</code> - The range key is number.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify <code>rangeKeyField</code>, the default
     *         value is <code>STRING</code>.
     *         </p>
     */
    public String getRangeKeyType() {
        return rangeKeyType;
    }

    /**
     * <p>
     * The data type for the range key (also called the sort key), You can
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> - The range key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NUMBER</code> - The range key is number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>rangeKeyField</code>, the default value is
     * <code>STRING</code>.
     * </p>
     *
     * @param rangeKeyType <p>
     *            The data type for the range key (also called the sort key),
     *            You can specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>STRING</code> - The range key is a string.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NUMBER</code> - The range key is number.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify <code>rangeKeyField</code>, the default
     *            value is <code>STRING</code>.
     *            </p>
     */
    public void setRangeKeyType(String rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
    }

    /**
     * <p>
     * The data type for the range key (also called the sort key), You can
     * specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> - The range key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NUMBER</code> - The range key is number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>rangeKeyField</code>, the default value is
     * <code>STRING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rangeKeyType <p>
     *            The data type for the range key (also called the sort key),
     *            You can specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>STRING</code> - The range key is a string.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NUMBER</code> - The range key is number.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify <code>rangeKeyField</code>, the default
     *            value is <code>STRING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withRangeKeyType(String rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
        return this;
    }

    /**
     * <p>
     * The name of the range key (also called the sort key).
     * </p>
     *
     * @return <p>
     *         The name of the range key (also called the sort key).
     *         </p>
     */
    public String getRangeKeyField() {
        return rangeKeyField;
    }

    /**
     * <p>
     * The name of the range key (also called the sort key).
     * </p>
     *
     * @param rangeKeyField <p>
     *            The name of the range key (also called the sort key).
     *            </p>
     */
    public void setRangeKeyField(String rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
    }

    /**
     * <p>
     * The name of the range key (also called the sort key).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rangeKeyField <p>
     *            The name of the range key (also called the sort key).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withRangeKeyField(String rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
        return this;
    }

    /**
     * <p>
     * The value of the range key (also called the sort key).
     * </p>
     *
     * @return <p>
     *         The value of the range key (also called the sort key).
     *         </p>
     */
    public String getRangeKeyValue() {
        return rangeKeyValue;
    }

    /**
     * <p>
     * The value of the range key (also called the sort key).
     * </p>
     *
     * @param rangeKeyValue <p>
     *            The value of the range key (also called the sort key).
     *            </p>
     */
    public void setRangeKeyValue(String rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
    }

    /**
     * <p>
     * The value of the range key (also called the sort key).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rangeKeyValue <p>
     *            The value of the range key (also called the sort key).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withRangeKeyValue(String rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
        return this;
    }

    /**
     * <p>
     * The type of operation to perform. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - Insert data as a new item into the DynamoDB table.
     * This item uses the specified hash key as a partition key. If you
     * specified a range key, the item uses the range key as a sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code> - Update an existing item of the DynamoDB table with
     * new data. This item's partition key must match the specified hash key. If
     * you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Delete an existing item of the DynamoDB table. This
     * item's partition key must match the specified hash key. If you specified
     * a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify this parameter, AWS IoT Events triggers the
     * <code>INSERT</code> operation.
     * </p>
     *
     * @return <p>
     *         The type of operation to perform. You can specify the following
     *         values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INSERT</code> - Insert data as a new item into the DynamoDB
     *         table. This item uses the specified hash key as a partition key.
     *         If you specified a range key, the item uses the range key as a
     *         sort key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE</code> - Update an existing item of the DynamoDB
     *         table with new data. This item's partition key must match the
     *         specified hash key. If you specified a range key, the range key
     *         must match the item's sort key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE</code> - Delete an existing item of the DynamoDB
     *         table. This item's partition key must match the specified hash
     *         key. If you specified a range key, the range key must match the
     *         item's sort key.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify this parameter, AWS IoT Events triggers the
     *         <code>INSERT</code> operation.
     *         </p>
     */
    public String getOperation() {
        return operation;
    }

    /**
     * <p>
     * The type of operation to perform. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - Insert data as a new item into the DynamoDB table.
     * This item uses the specified hash key as a partition key. If you
     * specified a range key, the item uses the range key as a sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code> - Update an existing item of the DynamoDB table with
     * new data. This item's partition key must match the specified hash key. If
     * you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Delete an existing item of the DynamoDB table. This
     * item's partition key must match the specified hash key. If you specified
     * a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify this parameter, AWS IoT Events triggers the
     * <code>INSERT</code> operation.
     * </p>
     *
     * @param operation <p>
     *            The type of operation to perform. You can specify the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INSERT</code> - Insert data as a new item into the
     *            DynamoDB table. This item uses the specified hash key as a
     *            partition key. If you specified a range key, the item uses the
     *            range key as a sort key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATE</code> - Update an existing item of the DynamoDB
     *            table with new data. This item's partition key must match the
     *            specified hash key. If you specified a range key, the range
     *            key must match the item's sort key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETE</code> - Delete an existing item of the DynamoDB
     *            table. This item's partition key must match the specified hash
     *            key. If you specified a range key, the range key must match
     *            the item's sort key.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify this parameter, AWS IoT Events triggers
     *            the <code>INSERT</code> operation.
     *            </p>
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The type of operation to perform. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - Insert data as a new item into the DynamoDB table.
     * This item uses the specified hash key as a partition key. If you
     * specified a range key, the item uses the range key as a sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code> - Update an existing item of the DynamoDB table with
     * new data. This item's partition key must match the specified hash key. If
     * you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code> - Delete an existing item of the DynamoDB table. This
     * item's partition key must match the specified hash key. If you specified
     * a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify this parameter, AWS IoT Events triggers the
     * <code>INSERT</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operation <p>
     *            The type of operation to perform. You can specify the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INSERT</code> - Insert data as a new item into the
     *            DynamoDB table. This item uses the specified hash key as a
     *            partition key. If you specified a range key, the item uses the
     *            range key as a sort key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATE</code> - Update an existing item of the DynamoDB
     *            table with new data. This item's partition key must match the
     *            specified hash key. If you specified a range key, the range
     *            key must match the item's sort key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETE</code> - Delete an existing item of the DynamoDB
     *            table. This item's partition key must match the specified hash
     *            key. If you specified a range key, the range key must match
     *            the item's sort key.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify this parameter, AWS IoT Events triggers
     *            the <code>INSERT</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * <p>
     * The name of the DynamoDB column that receives the action payload.
     * </p>
     * <p>
     * If you don't specify this parameter, the name of the DynamoDB column is
     * <code>payload</code>.
     * </p>
     *
     * @return <p>
     *         The name of the DynamoDB column that receives the action payload.
     *         </p>
     *         <p>
     *         If you don't specify this parameter, the name of the DynamoDB
     *         column is <code>payload</code>.
     *         </p>
     */
    public String getPayloadField() {
        return payloadField;
    }

    /**
     * <p>
     * The name of the DynamoDB column that receives the action payload.
     * </p>
     * <p>
     * If you don't specify this parameter, the name of the DynamoDB column is
     * <code>payload</code>.
     * </p>
     *
     * @param payloadField <p>
     *            The name of the DynamoDB column that receives the action
     *            payload.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the name of the DynamoDB
     *            column is <code>payload</code>.
     *            </p>
     */
    public void setPayloadField(String payloadField) {
        this.payloadField = payloadField;
    }

    /**
     * <p>
     * The name of the DynamoDB column that receives the action payload.
     * </p>
     * <p>
     * If you don't specify this parameter, the name of the DynamoDB column is
     * <code>payload</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payloadField <p>
     *            The name of the DynamoDB column that receives the action
     *            payload.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, the name of the DynamoDB
     *            column is <code>payload</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withPayloadField(String payloadField) {
        this.payloadField = payloadField;
        return this;
    }

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     *
     * @return <p>
     *         The name of the DynamoDB table.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     *
     * @param tableName <p>
     *            The name of the DynamoDB table.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableName <p>
     *            The name of the DynamoDB table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * Information needed to configure the payload.
     * </p>
     * <p>
     * By default, AWS IoT Events generates a standard payload in JSON for any
     * action. This action payload contains all attribute-value pairs that have
     * the information about the detector model instance and the event triggered
     * the action. To configure the action payload, you can use
     * <code>contentExpression</code>.
     * </p>
     *
     * @return <p>
     *         Information needed to configure the payload.
     *         </p>
     *         <p>
     *         By default, AWS IoT Events generates a standard payload in JSON
     *         for any action. This action payload contains all attribute-value
     *         pairs that have the information about the detector model instance
     *         and the event triggered the action. To configure the action
     *         payload, you can use <code>contentExpression</code>.
     *         </p>
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * <p>
     * Information needed to configure the payload.
     * </p>
     * <p>
     * By default, AWS IoT Events generates a standard payload in JSON for any
     * action. This action payload contains all attribute-value pairs that have
     * the information about the detector model instance and the event triggered
     * the action. To configure the action payload, you can use
     * <code>contentExpression</code>.
     * </p>
     *
     * @param payload <p>
     *            Information needed to configure the payload.
     *            </p>
     *            <p>
     *            By default, AWS IoT Events generates a standard payload in
     *            JSON for any action. This action payload contains all
     *            attribute-value pairs that have the information about the
     *            detector model instance and the event triggered the action. To
     *            configure the action payload, you can use
     *            <code>contentExpression</code>.
     *            </p>
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * Information needed to configure the payload.
     * </p>
     * <p>
     * By default, AWS IoT Events generates a standard payload in JSON for any
     * action. This action payload contains all attribute-value pairs that have
     * the information about the detector model instance and the event triggered
     * the action. To configure the action payload, you can use
     * <code>contentExpression</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            Information needed to configure the payload.
     *            </p>
     *            <p>
     *            By default, AWS IoT Events generates a standard payload in
     *            JSON for any action. This action payload contains all
     *            attribute-value pairs that have the information about the
     *            detector model instance and the event triggered the action. To
     *            configure the action payload, you can use
     *            <code>contentExpression</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withPayload(Payload payload) {
        this.payload = payload;
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
        if (getHashKeyType() != null)
            sb.append("hashKeyType: " + getHashKeyType() + ",");
        if (getHashKeyField() != null)
            sb.append("hashKeyField: " + getHashKeyField() + ",");
        if (getHashKeyValue() != null)
            sb.append("hashKeyValue: " + getHashKeyValue() + ",");
        if (getRangeKeyType() != null)
            sb.append("rangeKeyType: " + getRangeKeyType() + ",");
        if (getRangeKeyField() != null)
            sb.append("rangeKeyField: " + getRangeKeyField() + ",");
        if (getRangeKeyValue() != null)
            sb.append("rangeKeyValue: " + getRangeKeyValue() + ",");
        if (getOperation() != null)
            sb.append("operation: " + getOperation() + ",");
        if (getPayloadField() != null)
            sb.append("payloadField: " + getPayloadField() + ",");
        if (getTableName() != null)
            sb.append("tableName: " + getTableName() + ",");
        if (getPayload() != null)
            sb.append("payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHashKeyType() == null) ? 0 : getHashKeyType().hashCode());
        hashCode = prime * hashCode
                + ((getHashKeyField() == null) ? 0 : getHashKeyField().hashCode());
        hashCode = prime * hashCode
                + ((getHashKeyValue() == null) ? 0 : getHashKeyValue().hashCode());
        hashCode = prime * hashCode
                + ((getRangeKeyType() == null) ? 0 : getRangeKeyType().hashCode());
        hashCode = prime * hashCode
                + ((getRangeKeyField() == null) ? 0 : getRangeKeyField().hashCode());
        hashCode = prime * hashCode
                + ((getRangeKeyValue() == null) ? 0 : getRangeKeyValue().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode
                + ((getPayloadField() == null) ? 0 : getPayloadField().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamoDBAction == false)
            return false;
        DynamoDBAction other = (DynamoDBAction) obj;

        if (other.getHashKeyType() == null ^ this.getHashKeyType() == null)
            return false;
        if (other.getHashKeyType() != null
                && other.getHashKeyType().equals(this.getHashKeyType()) == false)
            return false;
        if (other.getHashKeyField() == null ^ this.getHashKeyField() == null)
            return false;
        if (other.getHashKeyField() != null
                && other.getHashKeyField().equals(this.getHashKeyField()) == false)
            return false;
        if (other.getHashKeyValue() == null ^ this.getHashKeyValue() == null)
            return false;
        if (other.getHashKeyValue() != null
                && other.getHashKeyValue().equals(this.getHashKeyValue()) == false)
            return false;
        if (other.getRangeKeyType() == null ^ this.getRangeKeyType() == null)
            return false;
        if (other.getRangeKeyType() != null
                && other.getRangeKeyType().equals(this.getRangeKeyType()) == false)
            return false;
        if (other.getRangeKeyField() == null ^ this.getRangeKeyField() == null)
            return false;
        if (other.getRangeKeyField() != null
                && other.getRangeKeyField().equals(this.getRangeKeyField()) == false)
            return false;
        if (other.getRangeKeyValue() == null ^ this.getRangeKeyValue() == null)
            return false;
        if (other.getRangeKeyValue() != null
                && other.getRangeKeyValue().equals(this.getRangeKeyValue()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null
                && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getPayloadField() == null ^ this.getPayloadField() == null)
            return false;
        if (other.getPayloadField() != null
                && other.getPayloadField().equals(this.getPayloadField()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
