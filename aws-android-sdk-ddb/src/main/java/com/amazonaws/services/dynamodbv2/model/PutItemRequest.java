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
 * Creates a new item, or replaces an old item with a new item. If an item that
 * has the same primary key as the new item already exists in the specified
 * table, the new item completely replaces the existing item. You can perform a
 * conditional put operation (add a new item if one with the specified primary
 * key doesn't exist), or replace an existing item if it has certain attribute
 * values. You can return the item's attribute values in the same operation,
 * using the <code>ReturnValues</code> parameter.
 * </p>
 * <important>
 * <p>
 * This topic provides general information about the <code>PutItem</code> API.
 * </p>
 * <p>
 * For information on how to call the <code>PutItem</code> API using the AWS SDK
 * in specific languages, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/goto/aws-cli/dynamodb-2012-08-10/PutItem">
 * PutItem in the AWS Command Line Interface </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/goto/DotNetSDKV3/dynamodb-2012-08-10/PutItem">
 * PutItem in the AWS SDK for .NET </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/goto/SdkForCpp/dynamodb-2012-08-10/PutItem">
 * PutItem in the AWS SDK for C++ </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/goto/SdkForGoV1/dynamodb-2012-08-10/PutItem">
 * PutItem in the AWS SDK for Go </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/goto/SdkForJava/dynamodb-2012-08-10/PutItem">
 * PutItem in the AWS SDK for Java </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/goto/AWSJavaScriptSDK/dynamodb-2012-08-10/PutItem"
 * > PutItem in the AWS SDK for JavaScript </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/goto/SdkForPHPV3/dynamodb-2012-08-10/PutItem">
 * PutItem in the AWS SDK for PHP V3 </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/goto/boto3/dynamodb-2012-08-10/PutItem">
 * PutItem in the AWS SDK for Python </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/goto/SdkForRubyV2/dynamodb-2012-08-10/PutItem">
 * PutItem in the AWS SDK for Ruby V2 </a>
 * </p>
 * </li>
 * </ul>
 * </important>
 * <p>
 * When you add an item, the primary key attribute(s) are the only required
 * attributes. Attribute values cannot be null. String and Binary type
 * attributes must have lengths greater than zero. Set type attributes cannot be
 * empty. Requests with empty values will be rejected with a
 * <code>ValidationException</code> exception.
 * </p>
 * <note>
 * <p>
 * To prevent a new item from replacing an existing item, use a conditional
 * expression that contains the <code>attribute_not_exists</code> function with
 * the name of the attribute being used as the partition key for the table.
 * Since every record must contain that attribute, the
 * <code>attribute_not_exists</code> function will only succeed if no matching
 * item exists.
 * </p>
 * </note>
 * <p>
 * For more information about <code>PutItem</code>, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"
 * >Working with Items</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 */
public class PutItemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the table to contain the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item.
     * </p>
     * <p>
     * You must provide all of the attributes for the primary key. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide both values
     * for both the partition key and the sort key.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each element in the <code>Item</code> map is an
     * <code>AttributeValue</code> object.
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     * >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, ExpectedAttributeValue> expected;

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as
     * they appeared before they were updated with the <code>PutItem</code>
     * request. For <code>PutItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This setting
     * is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an attribute
     * name-value pair, then the content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB
     * operations; however, <code>PutItem</code> does not recognize any values
     * other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     */
    private String returnValues;

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
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections, if any, that were modified during the operation are returned
     * in the response. If set to <code>NONE</code> (the default), no statistics
     * are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     */
    private String returnItemCollectionMetrics;

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     */
    private String conditionalOperator;

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional
     * <code>PutItem</code> operation to succeed.
     * </p>
     * <p>
     * An expression can contain any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Functions:
     * <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     * </p>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Comparison operators:
     * <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Logical operators: <code>AND | OR | NOT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on condition expressions, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private String conditionExpression;

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
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an
     * attribute value. For example, suppose that you wanted to check whether
     * the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <code>ExpressionAttributeValues</code> as
     * follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, AttributeValue> expressionAttributeValues;

    /**
     * Default constructor for PutItemRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public PutItemRequest() {
    }

    /**
     * Constructs a new PutItemRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName <p>
     *            The name of the table to contain the item.
     *            </p>
     * @param item <p>
     *            A map of attribute name/value pairs, one for each attribute.
     *            Only the primary key attributes are required; you can
     *            optionally provide other attribute name-value pairs for the
     *            item.
     *            </p>
     *            <p>
     *            You must provide all of the attributes for the primary key.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide both values for both the partition key
     *            and the sort key.
     *            </p>
     *            <p>
     *            If you specify any attributes that are part of an index key,
     *            then the data types for those attributes must match those of
     *            the schema in the table's attribute definition.
     *            </p>
     *            <p>
     *            For more information about primary keys, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *            >Primary Key</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            Each element in the <code>Item</code> map is an
     *            <code>AttributeValue</code> object.
     *            </p>
     */
    public PutItemRequest(String tableName, java.util.Map<String, AttributeValue> item) {
        setTableName(tableName);
        setItem(item);
    }

    /**
     * Constructs a new PutItemRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName <p>
     *            The name of the table to contain the item.
     *            </p>
     * @param item <p>
     *            A map of attribute name/value pairs, one for each attribute.
     *            Only the primary key attributes are required; you can
     *            optionally provide other attribute name-value pairs for the
     *            item.
     *            </p>
     *            <p>
     *            You must provide all of the attributes for the primary key.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide both values for both the partition key
     *            and the sort key.
     *            </p>
     *            <p>
     *            If you specify any attributes that are part of an index key,
     *            then the data types for those attributes must match those of
     *            the schema in the table's attribute definition.
     *            </p>
     *            <p>
     *            For more information about primary keys, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *            >Primary Key</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            Each element in the <code>Item</code> map is an
     *            <code>AttributeValue</code> object.
     *            </p>
     * @param returnValues <p>
     *            Use <code>ReturnValues</code> if you want to get the item
     *            attributes as they appeared before they were updated with the
     *            <code>PutItem</code> request. For <code>PutItem</code>, the
     *            valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code> - If <code>ReturnValues</code> is not
     *            specified, or if its value is <code>NONE</code>, then nothing
     *            is returned. (This setting is the default for
     *            <code>ReturnValues</code>.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an
     *            attribute name-value pair, then the content of the old item is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The <code>ReturnValues</code> parameter is used by several
     *            DynamoDB operations; however, <code>PutItem</code> does not
     *            recognize any values other than <code>NONE</code> or
     *            <code>ALL_OLD</code>.
     *            </p>
     *            </note>
     */
    public PutItemRequest(String tableName, java.util.Map<String, AttributeValue> item,
            String returnValues) {
        setTableName(tableName);
        setItem(item);
        setReturnValues(returnValues);
    }

    /**
     * Constructs a new PutItemRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName <p>
     *            The name of the table to contain the item.
     *            </p>
     * @param item <p>
     *            A map of attribute name/value pairs, one for each attribute.
     *            Only the primary key attributes are required; you can
     *            optionally provide other attribute name-value pairs for the
     *            item.
     *            </p>
     *            <p>
     *            You must provide all of the attributes for the primary key.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide both values for both the partition key
     *            and the sort key.
     *            </p>
     *            <p>
     *            If you specify any attributes that are part of an index key,
     *            then the data types for those attributes must match those of
     *            the schema in the table's attribute definition.
     *            </p>
     *            <p>
     *            For more information about primary keys, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *            >Primary Key</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            Each element in the <code>Item</code> map is an
     *            <code>AttributeValue</code> object.
     *            </p>
     * @param returnValues <p>
     *            Use <code>ReturnValues</code> if you want to get the item
     *            attributes as they appeared before they were updated with the
     *            <code>PutItem</code> request. For <code>PutItem</code>, the
     *            valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code> - If <code>ReturnValues</code> is not
     *            specified, or if its value is <code>NONE</code>, then nothing
     *            is returned. (This setting is the default for
     *            <code>ReturnValues</code>.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an
     *            attribute name-value pair, then the content of the old item is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The <code>ReturnValues</code> parameter is used by several
     *            DynamoDB operations; however, <code>PutItem</code> does not
     *            recognize any values other than <code>NONE</code> or
     *            <code>ALL_OLD</code>.
     *            </p>
     *            </note>
     */
    public PutItemRequest(String tableName, java.util.Map<String, AttributeValue> item,
            ReturnValue returnValues) {
        setTableName(tableName);
        setItem(item);
        setReturnValues(returnValues.toString());
    }

    /**
     * <p>
     * The name of the table to contain the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table to contain the item.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table to contain the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table to contain the item.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table to contain the item.
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
     *            The name of the table to contain the item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item.
     * </p>
     * <p>
     * You must provide all of the attributes for the primary key. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide both values
     * for both the partition key and the sort key.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each element in the <code>Item</code> map is an
     * <code>AttributeValue</code> object.
     * </p>
     *
     * @return <p>
     *         A map of attribute name/value pairs, one for each attribute. Only
     *         the primary key attributes are required; you can optionally
     *         provide other attribute name-value pairs for the item.
     *         </p>
     *         <p>
     *         You must provide all of the attributes for the primary key. For
     *         example, with a simple primary key, you only need to provide a
     *         value for the partition key. For a composite primary key, you
     *         must provide both values for both the partition key and the sort
     *         key.
     *         </p>
     *         <p>
     *         If you specify any attributes that are part of an index key, then
     *         the data types for those attributes must match those of the
     *         schema in the table's attribute definition.
     *         </p>
     *         <p>
     *         For more information about primary keys, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *         >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <p>
     *         Each element in the <code>Item</code> map is an
     *         <code>AttributeValue</code> object.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item.
     * </p>
     * <p>
     * You must provide all of the attributes for the primary key. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide both values
     * for both the partition key and the sort key.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each element in the <code>Item</code> map is an
     * <code>AttributeValue</code> object.
     * </p>
     *
     * @param item <p>
     *            A map of attribute name/value pairs, one for each attribute.
     *            Only the primary key attributes are required; you can
     *            optionally provide other attribute name-value pairs for the
     *            item.
     *            </p>
     *            <p>
     *            You must provide all of the attributes for the primary key.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide both values for both the partition key
     *            and the sort key.
     *            </p>
     *            <p>
     *            If you specify any attributes that are part of an index key,
     *            then the data types for those attributes must match those of
     *            the schema in the table's attribute definition.
     *            </p>
     *            <p>
     *            For more information about primary keys, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *            >Primary Key</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            Each element in the <code>Item</code> map is an
     *            <code>AttributeValue</code> object.
     *            </p>
     */
    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item.
     * </p>
     * <p>
     * You must provide all of the attributes for the primary key. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide both values
     * for both the partition key and the sort key.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each element in the <code>Item</code> map is an
     * <code>AttributeValue</code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item <p>
     *            A map of attribute name/value pairs, one for each attribute.
     *            Only the primary key attributes are required; you can
     *            optionally provide other attribute name-value pairs for the
     *            item.
     *            </p>
     *            <p>
     *            You must provide all of the attributes for the primary key.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide both values for both the partition key
     *            and the sort key.
     *            </p>
     *            <p>
     *            If you specify any attributes that are part of an index key,
     *            then the data types for those attributes must match those of
     *            the schema in the table's attribute definition.
     *            </p>
     *            <p>
     *            For more information about primary keys, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *            >Primary Key</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            Each element in the <code>Item</code> map is an
     *            <code>AttributeValue</code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemRequest withItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
        return this;
    }

    /**
     * <p>
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item.
     * </p>
     * <p>
     * You must provide all of the attributes for the primary key. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide both values
     * for both the partition key and the sort key.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each element in the <code>Item</code> map is an
     * <code>AttributeValue</code> object.
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
    public PutItemRequest addItemEntry(String key, AttributeValue value) {
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
    public PutItemRequest clearItemEntries() {
        this.item = null;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     * >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         This is a legacy parameter. Use <code>ConditionExpression</code>
     *         instead. For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     *         >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     */
    public java.util.Map<String, ExpectedAttributeValue> getExpected() {
        return expected;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     * >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param expected <p>
     *            This is a legacy parameter. Use
     *            <code>ConditionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     *            >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setExpected(java.util.Map<String, ExpectedAttributeValue> expected) {
        this.expected = expected;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     * >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expected <p>
     *            This is a legacy parameter. Use
     *            <code>ConditionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     *            >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemRequest withExpected(java.util.Map<String, ExpectedAttributeValue> expected) {
        this.expected = expected;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.Expected.html"
     * >Expected</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into Expected parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Expected.
     * @param value The corresponding value of the entry to be added into
     *            Expected.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemRequest addExpectedEntry(String key, ExpectedAttributeValue value) {
        if (null == this.expected) {
            this.expected = new java.util.HashMap<String, ExpectedAttributeValue>();
        }
        if (this.expected.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.expected.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Expected.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PutItemRequest clearExpectedEntries() {
        this.expected = null;
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as
     * they appeared before they were updated with the <code>PutItem</code>
     * request. For <code>PutItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This setting
     * is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an attribute
     * name-value pair, then the content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB
     * operations; however, <code>PutItem</code> does not recognize any values
     * other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @return <p>
     *         Use <code>ReturnValues</code> if you want to get the item
     *         attributes as they appeared before they were updated with the
     *         <code>PutItem</code> request. For <code>PutItem</code>, the valid
     *         values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - If <code>ReturnValues</code> is not
     *         specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This setting is the default for
     *         <code>ReturnValues</code>.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an
     *         attribute name-value pair, then the content of the old item is
     *         returned.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>ReturnValues</code> parameter is used by several
     *         DynamoDB operations; however, <code>PutItem</code> does not
     *         recognize any values other than <code>NONE</code> or
     *         <code>ALL_OLD</code>.
     *         </p>
     *         </note>
     * @see ReturnValue
     */
    public String getReturnValues() {
        return returnValues;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as
     * they appeared before they were updated with the <code>PutItem</code>
     * request. For <code>PutItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This setting
     * is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an attribute
     * name-value pair, then the content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB
     * operations; however, <code>PutItem</code> does not recognize any values
     * other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues <p>
     *            Use <code>ReturnValues</code> if you want to get the item
     *            attributes as they appeared before they were updated with the
     *            <code>PutItem</code> request. For <code>PutItem</code>, the
     *            valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code> - If <code>ReturnValues</code> is not
     *            specified, or if its value is <code>NONE</code>, then nothing
     *            is returned. (This setting is the default for
     *            <code>ReturnValues</code>.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an
     *            attribute name-value pair, then the content of the old item is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The <code>ReturnValues</code> parameter is used by several
     *            DynamoDB operations; however, <code>PutItem</code> does not
     *            recognize any values other than <code>NONE</code> or
     *            <code>ALL_OLD</code>.
     *            </p>
     *            </note>
     * @see ReturnValue
     */
    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as
     * they appeared before they were updated with the <code>PutItem</code>
     * request. For <code>PutItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This setting
     * is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an attribute
     * name-value pair, then the content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB
     * operations; however, <code>PutItem</code> does not recognize any values
     * other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues <p>
     *            Use <code>ReturnValues</code> if you want to get the item
     *            attributes as they appeared before they were updated with the
     *            <code>PutItem</code> request. For <code>PutItem</code>, the
     *            valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code> - If <code>ReturnValues</code> is not
     *            specified, or if its value is <code>NONE</code>, then nothing
     *            is returned. (This setting is the default for
     *            <code>ReturnValues</code>.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an
     *            attribute name-value pair, then the content of the old item is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The <code>ReturnValues</code> parameter is used by several
     *            DynamoDB operations; however, <code>PutItem</code> does not
     *            recognize any values other than <code>NONE</code> or
     *            <code>ALL_OLD</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnValue
     */
    public PutItemRequest withReturnValues(String returnValues) {
        this.returnValues = returnValues;
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as
     * they appeared before they were updated with the <code>PutItem</code>
     * request. For <code>PutItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This setting
     * is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an attribute
     * name-value pair, then the content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB
     * operations; however, <code>PutItem</code> does not recognize any values
     * other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues <p>
     *            Use <code>ReturnValues</code> if you want to get the item
     *            attributes as they appeared before they were updated with the
     *            <code>PutItem</code> request. For <code>PutItem</code>, the
     *            valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code> - If <code>ReturnValues</code> is not
     *            specified, or if its value is <code>NONE</code>, then nothing
     *            is returned. (This setting is the default for
     *            <code>ReturnValues</code>.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an
     *            attribute name-value pair, then the content of the old item is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The <code>ReturnValues</code> parameter is used by several
     *            DynamoDB operations; however, <code>PutItem</code> does not
     *            recognize any values other than <code>NONE</code> or
     *            <code>ALL_OLD</code>.
     *            </p>
     *            </note>
     * @see ReturnValue
     */
    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }

    /**
     * <p>
     * Use <code>ReturnValues</code> if you want to get the item attributes as
     * they appeared before they were updated with the <code>PutItem</code>
     * request. For <code>PutItem</code>, the valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - If <code>ReturnValues</code> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This setting
     * is the default for <code>ReturnValues</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an attribute
     * name-value pair, then the content of the old item is returned.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>ReturnValues</code> parameter is used by several DynamoDB
     * operations; however, <code>PutItem</code> does not recognize any values
     * other than <code>NONE</code> or <code>ALL_OLD</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues <p>
     *            Use <code>ReturnValues</code> if you want to get the item
     *            attributes as they appeared before they were updated with the
     *            <code>PutItem</code> request. For <code>PutItem</code>, the
     *            valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code> - If <code>ReturnValues</code> is not
     *            specified, or if its value is <code>NONE</code>, then nothing
     *            is returned. (This setting is the default for
     *            <code>ReturnValues</code>.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_OLD</code> - If <code>PutItem</code> overwrote an
     *            attribute name-value pair, then the content of the old item is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The <code>ReturnValues</code> parameter is used by several
     *            DynamoDB operations; however, <code>PutItem</code> does not
     *            recognize any values other than <code>NONE</code> or
     *            <code>ALL_OLD</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnValue
     */
    public PutItemRequest withReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
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
    public PutItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public PutItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections, if any, that were modified during the operation are returned
     * in the response. If set to <code>NONE</code> (the default), no statistics
     * are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @return <p>
     *         Determines whether item collection metrics are returned. If set
     *         to <code>SIZE</code>, the response includes statistics about item
     *         collections, if any, that were modified during the operation are
     *         returned in the response. If set to <code>NONE</code> (the
     *         default), no statistics are returned.
     *         </p>
     * @see ReturnItemCollectionMetrics
     */
    public String getReturnItemCollectionMetrics() {
        return returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections, if any, that were modified during the operation are returned
     * in the response. If set to <code>NONE</code> (the default), no statistics
     * are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics <p>
     *            Determines whether item collection metrics are returned. If
     *            set to <code>SIZE</code>, the response includes statistics
     *            about item collections, if any, that were modified during the
     *            operation are returned in the response. If set to
     *            <code>NONE</code> (the default), no statistics are returned.
     *            </p>
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections, if any, that were modified during the operation are returned
     * in the response. If set to <code>NONE</code> (the default), no statistics
     * are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics <p>
     *            Determines whether item collection metrics are returned. If
     *            set to <code>SIZE</code>, the response includes statistics
     *            about item collections, if any, that were modified during the
     *            operation are returned in the response. If set to
     *            <code>NONE</code> (the default), no statistics are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnItemCollectionMetrics
     */
    public PutItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections, if any, that were modified during the operation are returned
     * in the response. If set to <code>NONE</code> (the default), no statistics
     * are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics <p>
     *            Determines whether item collection metrics are returned. If
     *            set to <code>SIZE</code>, the response includes statistics
     *            about item collections, if any, that were modified during the
     *            operation are returned in the response. If set to
     *            <code>NONE</code> (the default), no statistics are returned.
     *            </p>
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(
            ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections, if any, that were modified during the operation are returned
     * in the response. If set to <code>NONE</code> (the default), no statistics
     * are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics <p>
     *            Determines whether item collection metrics are returned. If
     *            set to <code>SIZE</code>, the response includes statistics
     *            about item collections, if any, that were modified during the
     *            operation are returned in the response. If set to
     *            <code>NONE</code> (the default), no statistics are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnItemCollectionMetrics
     */
    public PutItemRequest withReturnItemCollectionMetrics(
            ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @return <p>
     *         This is a legacy parameter. Use <code>ConditionExpression</code>
     *         instead. For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *         >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     * @see ConditionalOperator
     */
    public String getConditionalOperator() {
        return conditionalOperator;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <p>
     *            This is a legacy parameter. Use
     *            <code>ConditionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *            >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @see ConditionalOperator
     */
    public void setConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <p>
     *            This is a legacy parameter. Use
     *            <code>ConditionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *            >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConditionalOperator
     */
    public PutItemRequest withConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <p>
     *            This is a legacy parameter. Use
     *            <code>ConditionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *            >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @see ConditionalOperator
     */
    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>ConditionExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <p>
     *            This is a legacy parameter. Use
     *            <code>ConditionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *            >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConditionalOperator
     */
    public PutItemRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional
     * <code>PutItem</code> operation to succeed.
     * </p>
     * <p>
     * An expression can contain any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Functions:
     * <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     * </p>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Comparison operators:
     * <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Logical operators: <code>AND | OR | NOT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on condition expressions, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A condition that must be satisfied in order for a conditional
     *         <code>PutItem</code> operation to succeed.
     *         </p>
     *         <p>
     *         An expression can contain any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Functions:
     *         <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     *         </p>
     *         <p>
     *         These function names are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Comparison operators:
     *         <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Logical operators: <code>AND | OR | NOT</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information on condition expressions, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *         >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional
     * <code>PutItem</code> operation to succeed.
     * </p>
     * <p>
     * An expression can contain any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Functions:
     * <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     * </p>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Comparison operators:
     * <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Logical operators: <code>AND | OR | NOT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on condition expressions, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param conditionExpression <p>
     *            A condition that must be satisfied in order for a conditional
     *            <code>PutItem</code> operation to succeed.
     *            </p>
     *            <p>
     *            An expression can contain any of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Functions:
     *            <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     *            </p>
     *            <p>
     *            These function names are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Comparison operators:
     *            <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Logical operators: <code>AND | OR | NOT</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information on condition expressions, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *            >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional
     * <code>PutItem</code> operation to succeed.
     * </p>
     * <p>
     * An expression can contain any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Functions:
     * <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     * </p>
     * <p>
     * These function names are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Comparison operators:
     * <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Logical operators: <code>AND | OR | NOT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on condition expressions, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditionExpression <p>
     *            A condition that must be satisfied in order for a conditional
     *            <code>PutItem</code> operation to succeed.
     *            </p>
     *            <p>
     *            An expression can contain any of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Functions:
     *            <code>attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size</code>
     *            </p>
     *            <p>
     *            These function names are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Comparison operators:
     *            <code>= | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Logical operators: <code>AND | OR | NOT</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information on condition expressions, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *            >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemRequest withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
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
    public PutItemRequest withExpressionAttributeNames(
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
    public PutItemRequest addExpressionAttributeNamesEntry(String key, String value) {
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
    public PutItemRequest clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an
     * attribute value. For example, suppose that you wanted to check whether
     * the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <code>ExpressionAttributeValues</code> as
     * follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         One or more values that can be substituted in an expression.
     *         </p>
     *         <p>
     *         Use the <b>:</b> (colon) character in an expression to
     *         dereference an attribute value. For example, suppose that you
     *         wanted to check whether the value of the <i>ProductStatus</i>
     *         attribute was one of the following:
     *         </p>
     *         <p>
     *         <code>Available | Backordered | Discontinued</code>
     *         </p>
     *         <p>
     *         You would first need to specify
     *         <code>ExpressionAttributeValues</code> as follows:
     *         </p>
     *         <p>
     *         <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     *         </p>
     *         <p>
     *         You could then use these values in an expression, such as this:
     *         </p>
     *         <p>
     *         <code>ProductStatus IN (:avail, :back, :disc)</code>
     *         </p>
     *         <p>
     *         For more information on expression attribute values, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *         >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getExpressionAttributeValues() {
        return expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an
     * attribute value. For example, suppose that you wanted to check whether
     * the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <code>ExpressionAttributeValues</code> as
     * follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param expressionAttributeValues <p>
     *            One or more values that can be substituted in an expression.
     *            </p>
     *            <p>
     *            Use the <b>:</b> (colon) character in an expression to
     *            dereference an attribute value. For example, suppose that you
     *            wanted to check whether the value of the <i>ProductStatus</i>
     *            attribute was one of the following:
     *            </p>
     *            <p>
     *            <code>Available | Backordered | Discontinued</code>
     *            </p>
     *            <p>
     *            You would first need to specify
     *            <code>ExpressionAttributeValues</code> as follows:
     *            </p>
     *            <p>
     *            <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     *            </p>
     *            <p>
     *            You could then use these values in an expression, such as
     *            this:
     *            </p>
     *            <p>
     *            <code>ProductStatus IN (:avail, :back, :disc)</code>
     *            </p>
     *            <p>
     *            For more information on expression attribute values, see <a
     *            href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *            >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an
     * attribute value. For example, suppose that you wanted to check whether
     * the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <code>ExpressionAttributeValues</code> as
     * follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expressionAttributeValues <p>
     *            One or more values that can be substituted in an expression.
     *            </p>
     *            <p>
     *            Use the <b>:</b> (colon) character in an expression to
     *            dereference an attribute value. For example, suppose that you
     *            wanted to check whether the value of the <i>ProductStatus</i>
     *            attribute was one of the following:
     *            </p>
     *            <p>
     *            <code>Available | Backordered | Discontinued</code>
     *            </p>
     *            <p>
     *            You would first need to specify
     *            <code>ExpressionAttributeValues</code> as follows:
     *            </p>
     *            <p>
     *            <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     *            </p>
     *            <p>
     *            You could then use these values in an expression, such as
     *            this:
     *            </p>
     *            <p>
     *            <code>ProductStatus IN (:avail, :back, :disc)</code>
     *            </p>
     *            <p>
     *            For more information on expression attribute values, see <a
     *            href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *            >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemRequest withExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
        return this;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an
     * attribute value. For example, suppose that you wanted to check whether
     * the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <code>ExpressionAttributeValues</code> as
     * follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into ExpressionAttributeValues
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ExpressionAttributeValues.
     * @param value The corresponding value of the entry to be added into
     *            ExpressionAttributeValues.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
        if (null == this.expressionAttributeValues) {
            this.expressionAttributeValues = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.expressionAttributeValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.expressionAttributeValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeValues.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PutItemRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
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
        if (getItem() != null)
            sb.append("Item: " + getItem() + ",");
        if (getExpected() != null)
            sb.append("Expected: " + getExpected() + ",");
        if (getReturnValues() != null)
            sb.append("ReturnValues: " + getReturnValues() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getReturnItemCollectionMetrics() != null)
            sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() + ",");
        if (getConditionalOperator() != null)
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (getConditionExpression() != null)
            sb.append("ConditionExpression: " + getConditionExpression() + ",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() + ",");
        if (getExpressionAttributeValues() != null)
            sb.append("ExpressionAttributeValues: " + getExpressionAttributeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode());
        hashCode = prime * hashCode
                + ((getReturnValues() == null) ? 0 : getReturnValues().hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnItemCollectionMetrics() == null) ? 0
                        : getReturnItemCollectionMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getConditionalOperator() == null) ? 0 : getConditionalOperator().hashCode());
        hashCode = prime * hashCode
                + ((getConditionExpression() == null) ? 0 : getConditionExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutItemRequest == false)
            return false;
        PutItemRequest other = (PutItemRequest) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getExpected() == null ^ this.getExpected() == null)
            return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false)
            return false;
        if (other.getReturnValues() == null ^ this.getReturnValues() == null)
            return false;
        if (other.getReturnValues() != null
                && other.getReturnValues().equals(this.getReturnValues()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null
                && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        if (other.getReturnItemCollectionMetrics() == null
                ^ this.getReturnItemCollectionMetrics() == null)
            return false;
        if (other.getReturnItemCollectionMetrics() != null
                && other.getReturnItemCollectionMetrics().equals(
                        this.getReturnItemCollectionMetrics()) == false)
            return false;
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null)
            return false;
        if (other.getConditionalOperator() != null
                && other.getConditionalOperator().equals(this.getConditionalOperator()) == false)
            return false;
        if (other.getConditionExpression() == null ^ this.getConditionExpression() == null)
            return false;
        if (other.getConditionExpression() != null
                && other.getConditionExpression().equals(this.getConditionExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null
                ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null
                && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false)
            return false;
        if (other.getExpressionAttributeValues() == null
                ^ this.getExpressionAttributeValues() == null)
            return false;
        if (other.getExpressionAttributeValues() != null
                && other.getExpressionAttributeValues().equals(this.getExpressionAttributeValues()) == false)
            return false;
        return true;
    }
}
