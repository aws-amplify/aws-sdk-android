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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>GetItem</code> operation returns a set of attributes for the item
 * with the given primary key. If there is no matching item,
 * <code>GetItem</code> does not return any data and there will be no
 * <code>Item</code> element in the response.
 * </p>
 * <p>
 * <code>GetItem</code> provides an eventually consistent read by default. If
 * your application requires a strongly consistent read, set
 * <code>ConsistentRead</code> to <code>true</code>. Although a strongly
 * consistent read might take more time than an eventually consistent read, it
 * always returns the last updated value.
 * </p>
 */
public class GetItemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the table containing the requested item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the primary key of the item to retrieve.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide values for
     * both the partition key and the sort key.
     * </p>
     */
    private java.util.Map<String, AttributeValue> key;

    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> attributesToGet;

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     */
    private Boolean consistentRead;

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     */
    private String returnConsumedCapacity;

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the expression must be separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not
     * appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     */
    private String projectionExpression;

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in
     * an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being
     * misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot
     * be used directly in an expression. (For the complete list of reserved
     * words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To
     * work around this, you could specify the following for
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute
     * values</i>, which are placeholders for the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> expressionAttributeNames;

    /**
     * Default constructor for GetItemRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public GetItemRequest() {
    }

    /**
     * Constructs a new GetItemRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName <p>
     *            The name of the table containing the requested item.
     *            </p>
     * @param key <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects, representing the primary key of the item to retrieve.
     *            </p>
     *            <p>
     *            For the primary key, you must provide all of the attributes.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide values for both the partition key and
     *            the sort key.
     *            </p>
     */
    public GetItemRequest(String tableName, java.util.Map<String, AttributeValue> key) {
        setTableName(tableName);
        setKey(key);
    }

    /**
     * Constructs a new GetItemRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName <p>
     *            The name of the table containing the requested item.
     *            </p>
     * @param key <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects, representing the primary key of the item to retrieve.
     *            </p>
     *            <p>
     *            For the primary key, you must provide all of the attributes.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide values for both the partition key and
     *            the sort key.
     *            </p>
     * @param consistentRead <p>
     *            Determines the read consistency model: If set to
     *            <code>true</code>, then the operation uses strongly consistent
     *            reads; otherwise, the operation uses eventually consistent
     *            reads.
     *            </p>
     */
    public GetItemRequest(String tableName, java.util.Map<String, AttributeValue> key,
            Boolean consistentRead) {
        setTableName(tableName);
        setKey(key);
        setConsistentRead(consistentRead);
    }

    /**
     * <p>
     * The name of the table containing the requested item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table containing the requested item.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table containing the requested item.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested item.
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
     *            The name of the table containing the requested item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the primary key of the item to retrieve.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide values for
     * both the partition key and the sort key.
     * </p>
     *
     * @return <p>
     *         A map of attribute names to <code>AttributeValue</code> objects,
     *         representing the primary key of the item to retrieve.
     *         </p>
     *         <p>
     *         For the primary key, you must provide all of the attributes. For
     *         example, with a simple primary key, you only need to provide a
     *         value for the partition key. For a composite primary key, you
     *         must provide values for both the partition key and the sort key.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getKey() {
        return key;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the primary key of the item to retrieve.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide values for
     * both the partition key and the sort key.
     * </p>
     *
     * @param key <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects, representing the primary key of the item to retrieve.
     *            </p>
     *            <p>
     *            For the primary key, you must provide all of the attributes.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide values for both the partition key and
     *            the sort key.
     *            </p>
     */
    public void setKey(java.util.Map<String, AttributeValue> key) {
        this.key = key;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the primary key of the item to retrieve.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide values for
     * both the partition key and the sort key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects, representing the primary key of the item to retrieve.
     *            </p>
     *            <p>
     *            For the primary key, you must provide all of the attributes.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide values for both the partition key and
     *            the sort key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemRequest withKey(java.util.Map<String, AttributeValue> key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the primary key of the item to retrieve.
     * </p>
     * <p>
     * For the primary key, you must provide all of the attributes. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide values for
     * both the partition key and the sort key.
     * </p>
     * <p>
     * The method adds a new key-value pair into Key parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Key.
     * @param value The corresponding value of the entry to be added into Key.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemRequest addKeyEntry(String key, AttributeValue value) {
        if (null == this.key) {
            this.key = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.key.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.key.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Key.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetItemRequest clearKeyEntries() {
        this.key = null;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         This is a legacy parameter. Use <code>ProjectionExpression</code>
     *         instead. For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *         >AttributesToGet</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param attributesToGet <p>
     *            This is a legacy parameter. Use
     *            <code>ProjectionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *            >AttributesToGet</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesToGet <p>
     *            This is a legacy parameter. Use
     *            <code>ProjectionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *            >AttributesToGet</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) {
            this.attributesToGet = new java.util.ArrayList<String>(attributesToGet.length);
        }
        for (String value : attributesToGet) {
            this.attributesToGet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ProjectionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     * >AttributesToGet</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesToGet <p>
     *            This is a legacy parameter. Use
     *            <code>ProjectionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *            >AttributesToGet</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     *
     * @return <p>
     *         Determines the read consistency model: If set to
     *         <code>true</code>, then the operation uses strongly consistent
     *         reads; otherwise, the operation uses eventually consistent reads.
     *         </p>
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     *
     * @return <p>
     *         Determines the read consistency model: If set to
     *         <code>true</code>, then the operation uses strongly consistent
     *         reads; otherwise, the operation uses eventually consistent reads.
     *         </p>
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     *
     * @param consistentRead <p>
     *            Determines the read consistency model: If set to
     *            <code>true</code>, then the operation uses strongly consistent
     *            reads; otherwise, the operation uses eventually consistent
     *            reads.
     *            </p>
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consistentRead <p>
     *            Determines the read consistency model: If set to
     *            <code>true</code>, then the operation uses strongly consistent
     *            reads; otherwise, the operation uses eventually consistent
     *            reads.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @return <p>
     *         Determines the level of detail about provisioned throughput
     *         consumption that is returned in the response:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INDEXES</code> - The response includes the aggregate
     *         <code>ConsumedCapacity</code> for the operation, together with
     *         <code>ConsumedCapacity</code> for each table and secondary index
     *         that was accessed.
     *         </p>
     *         <p>
     *         Note that some operations, such as <code>GetItem</code> and
     *         <code>BatchGetItem</code>, do not access any indexes at all. In
     *         these cases, specifying <code>INDEXES</code> will only return
     *         <code>ConsumedCapacity</code> information for table(s).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOTAL</code> - The response includes only the aggregate
     *         <code>ConsumedCapacity</code> for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - No <code>ConsumedCapacity</code> details are
     *         included in the response.
     *         </p>
     *         </li>
     *         </ul>
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            Determines the level of detail about provisioned throughput
     *            consumption that is returned in the response:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INDEXES</code> - The response includes the aggregate
     *            <code>ConsumedCapacity</code> for the operation, together with
     *            <code>ConsumedCapacity</code> for each table and secondary
     *            index that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <code>GetItem</code> and
     *            <code>BatchGetItem</code>, do not access any indexes at all.
     *            In these cases, specifying <code>INDEXES</code> will only
     *            return <code>ConsumedCapacity</code> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code> - The response includes only the aggregate
     *            <code>ConsumedCapacity</code> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - No <code>ConsumedCapacity</code> details
     *            are included in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            Determines the level of detail about provisioned throughput
     *            consumption that is returned in the response:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INDEXES</code> - The response includes the aggregate
     *            <code>ConsumedCapacity</code> for the operation, together with
     *            <code>ConsumedCapacity</code> for each table and secondary
     *            index that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <code>GetItem</code> and
     *            <code>BatchGetItem</code>, do not access any indexes at all.
     *            In these cases, specifying <code>INDEXES</code> will only
     *            return <code>ConsumedCapacity</code> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code> - The response includes only the aggregate
     *            <code>ConsumedCapacity</code> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - No <code>ConsumedCapacity</code> details
     *            are included in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */
    public GetItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            Determines the level of detail about provisioned throughput
     *            consumption that is returned in the response:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INDEXES</code> - The response includes the aggregate
     *            <code>ConsumedCapacity</code> for the operation, together with
     *            <code>ConsumedCapacity</code> for each table and secondary
     *            index that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <code>GetItem</code> and
     *            <code>BatchGetItem</code>, do not access any indexes at all.
     *            In these cases, specifying <code>INDEXES</code> will only
     *            return <code>ConsumedCapacity</code> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code> - The response includes only the aggregate
     *            <code>ConsumedCapacity</code> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - No <code>ConsumedCapacity</code> details
     *            are included in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            Determines the level of detail about provisioned throughput
     *            consumption that is returned in the response:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INDEXES</code> - The response includes the aggregate
     *            <code>ConsumedCapacity</code> for the operation, together with
     *            <code>ConsumedCapacity</code> for each table and secondary
     *            index that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <code>GetItem</code> and
     *            <code>BatchGetItem</code>, do not access any indexes at all.
     *            In these cases, specifying <code>INDEXES</code> will only
     *            return <code>ConsumedCapacity</code> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code> - The response includes only the aggregate
     *            <code>ConsumedCapacity</code> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - No <code>ConsumedCapacity</code> details
     *            are included in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */
    public GetItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the expression must be separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not
     * appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A string that identifies one or more attributes to retrieve from
     *         the table. These attributes can include scalars, sets, or
     *         elements of a JSON document. The attributes in the expression
     *         must be separated by commas.
     *         </p>
     *         <p>
     *         If no attribute names are specified, then all attributes will be
     *         returned. If any of the requested attributes are not found, they
     *         will not appear in the result.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *         >Accessing Item Attributes</a> in the <i>Amazon DynamoDB
     *         Developer Guide</i>.
     *         </p>
     */
    public String getProjectionExpression() {
        return projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the expression must be separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not
     * appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @param projectionExpression <p>
     *            A string that identifies one or more attributes to retrieve
     *            from the table. These attributes can include scalars, sets, or
     *            elements of a JSON document. The attributes in the expression
     *            must be separated by commas.
     *            </p>
     *            <p>
     *            If no attribute names are specified, then all attributes will
     *            be returned. If any of the requested attributes are not found,
     *            they will not appear in the result.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *            >Accessing Item Attributes</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     */
    public void setProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the expression must be separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not
     * appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectionExpression <p>
     *            A string that identifies one or more attributes to retrieve
     *            from the table. These attributes can include scalars, sets, or
     *            elements of a JSON document. The attributes in the expression
     *            must be separated by commas.
     *            </p>
     *            <p>
     *            If no attribute names are specified, then all attributes will
     *            be returned. If any of the requested attributes are not found,
     *            they will not appear in the result.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *            >Accessing Item Attributes</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemRequest withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in
     * an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being
     * misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot
     * be used directly in an expression. (For the complete list of reserved
     * words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To
     * work around this, you could specify the following for
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute
     * values</i>, which are placeholders for the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         One or more substitution tokens for attribute names in an
     *         expression. The following are some use cases for using
     *         <code>ExpressionAttributeNames</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To access an attribute whose name conflicts with a DynamoDB
     *         reserved word.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To create a placeholder for repeating occurrences of an attribute
     *         name in an expression.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To prevent special characters in an attribute name from being
     *         misinterpreted in an expression.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use the <b>#</b> character in an expression to dereference an
     *         attribute name. For example, consider the following attribute
     *         name:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Percentile</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The name of this attribute conflicts with a reserved word, so it
     *         cannot be used directly in an expression. (For the complete list
     *         of reserved words, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *         >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>). To work around this, you could specify the following
     *         for <code>ExpressionAttributeNames</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>{"#P":"Percentile"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You could then use this substitution in an expression, as in this
     *         example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>#P = :val</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Tokens that begin with the <b>:</b> character are <i>expression
     *         attribute values</i>, which are placeholders for the actual value
     *         at runtime.
     *         </p>
     *         </note>
     *         <p>
     *         For more information on expression attribute names, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *         >Accessing Item Attributes</a> in the <i>Amazon DynamoDB
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in
     * an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being
     * misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot
     * be used directly in an expression. (For the complete list of reserved
     * words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To
     * work around this, you could specify the following for
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute
     * values</i>, which are placeholders for the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @param expressionAttributeNames <p>
     *            One or more substitution tokens for attribute names in an
     *            expression. The following are some use cases for using
     *            <code>ExpressionAttributeNames</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To access an attribute whose name conflicts with a DynamoDB
     *            reserved word.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To create a placeholder for repeating occurrences of an
     *            attribute name in an expression.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To prevent special characters in an attribute name from being
     *            misinterpreted in an expression.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use the <b>#</b> character in an expression to dereference an
     *            attribute name. For example, consider the following attribute
     *            name:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Percentile</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The name of this attribute conflicts with a reserved word, so
     *            it cannot be used directly in an expression. (For the complete
     *            list of reserved words, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *            >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>). To work around this, you could specify the
     *            following for <code>ExpressionAttributeNames</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>{"#P":"Percentile"}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You could then use this substitution in an expression, as in
     *            this example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>#P = :val</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Tokens that begin with the <b>:</b> character are
     *            <i>expression attribute values</i>, which are placeholders for
     *            the actual value at runtime.
     *            </p>
     *            </note>
     *            <p>
     *            For more information on expression attribute names, see <a
     *            href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *            >Accessing Item Attributes</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     */
    public void setExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in
     * an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being
     * misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot
     * be used directly in an expression. (For the complete list of reserved
     * words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To
     * work around this, you could specify the following for
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute
     * values</i>, which are placeholders for the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expressionAttributeNames <p>
     *            One or more substitution tokens for attribute names in an
     *            expression. The following are some use cases for using
     *            <code>ExpressionAttributeNames</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To access an attribute whose name conflicts with a DynamoDB
     *            reserved word.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To create a placeholder for repeating occurrences of an
     *            attribute name in an expression.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To prevent special characters in an attribute name from being
     *            misinterpreted in an expression.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use the <b>#</b> character in an expression to dereference an
     *            attribute name. For example, consider the following attribute
     *            name:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Percentile</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The name of this attribute conflicts with a reserved word, so
     *            it cannot be used directly in an expression. (For the complete
     *            list of reserved words, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *            >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>). To work around this, you could specify the
     *            following for <code>ExpressionAttributeNames</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>{"#P":"Percentile"}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You could then use this substitution in an expression, as in
     *            this example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>#P = :val</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Tokens that begin with the <b>:</b> character are
     *            <i>expression attribute values</i>, which are placeholders for
     *            the actual value at runtime.
     *            </p>
     *            </note>
     *            <p>
     *            For more information on expression attribute names, see <a
     *            href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *            >Accessing Item Attributes</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemRequest withExpressionAttributeNames(
            java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in
     * an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being
     * misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot
     * be used directly in an expression. (For the complete list of reserved
     * words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To
     * work around this, you could specify the following for
     * <code>ExpressionAttributeNames</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute
     * values</i>, which are placeholders for the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into ExpressionAttributeNames
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ExpressionAttributeNames.
     * @param value The corresponding value of the entry to be added into
     *            ExpressionAttributeNames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetItemRequest addExpressionAttributeNamesEntry(String key, String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String, String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetItemRequest clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: " + getConsistentRead() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getProjectionExpression() != null)
            sb.append("ProjectionExpression: " + getProjectionExpression() + ",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        hashCode = prime * hashCode
                + ((getConsistentRead() == null) ? 0 : getConsistentRead().hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetItemRequest == false)
            return false;
        GetItemRequest other = (GetItemRequest) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null
                && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getConsistentRead() == null ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null
                && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null
                && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        if (other.getProjectionExpression() == null ^ this.getProjectionExpression() == null)
            return false;
        if (other.getProjectionExpression() != null
                && other.getProjectionExpression().equals(this.getProjectionExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null
                ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null
                && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false)
            return false;
        return true;
    }
}
