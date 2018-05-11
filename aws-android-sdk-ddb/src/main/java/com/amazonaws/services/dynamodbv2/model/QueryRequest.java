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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A <i>Query</i> operation uses the primary key of a table or a secondary index
 * to directly access items from that table or index.
 * </p>
 * <p>
 * Use the <i>KeyConditionExpression</i> parameter to provide a specific value
 * for the partition key. The <i>Query</i> operation will return all of the
 * items from the table or index with that partition key value. You can
 * optionally narrow the scope of the <i>Query</i> operation by specifying a
 * sort key value and a comparison operator in <i>KeyConditionExpression</i>.
 * You can use the <i>ScanIndexForward</i> parameter to get results in forward
 * or reverse order, by sort key.
 * </p>
 * <p>
 * Queries that do not return results consume the minimum number of read
 * capacity units for that type of read operation.
 * </p>
 * <p>
 * If the total number of items meeting the query criteria exceeds the result
 * set size limit of 1 MB, the query stops and results are returned to the user
 * with the <i>LastEvaluatedKey</i> element to continue the query in a
 * subsequent operation. Unlike a <i>Scan</i> operation, a <i>Query</i>
 * operation never returns both an empty result set and a
 * <i>LastEvaluatedKey</i> value. <i>LastEvaluatedKey</i> is only provided if
 * you have used the <i>Limit</i> parameter, or if the result set exceeds 1 MB
 * (prior to applying a filter).
 * </p>
 * <p>
 * You can query a table, a local secondary index, or a global secondary index.
 * For a query on a table or on a local secondary index, you can set the
 * <i>ConsistentRead</i> parameter to <code>true</code> and obtain a strongly
 * consistent result. Global secondary indexes support eventually consistent
 * reads only, so do not specify <i>ConsistentRead</i> when querying a global
 * secondary index.
 * </p>
 */
public class QueryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <i>IndexName</i> parameter, you must also provide <i>TableName.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES,
     * SPECIFIC_ATTRIBUTES, COUNT
     */
    private String select;

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     */
    private java.util.List<String> attributesToGet;

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you
     * can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     * >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
     * </p>
     */
    private Boolean consistentRead;

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>KeyConditionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * provide the partition key name and value as an <code>EQ</code> condition.
     * You can optionally provide a second condition, referring to the sort key.
     * </p>
     * <note>
     * <p>
     * If you don't provide a sort key condition, all of the items that match
     * the partition key will be retrieved. If a <i>FilterExpression</i> or
     * <i>QueryFilter</i> is present, it will be applied after the items are
     * retrieved.
     * </p>
     * </note>
     * <p>
     * For a query on an index, you can have conditions only on the index key
     * attributes. You must provide the index partition key name and value as an
     * <code>EQ</code> condition. You can optionally provide a second condition,
     * referring to the index sort key.
     * </p>
     * <p>
     * Each <i>KeyConditions</i> element consists of an attribute name to
     * compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when
     * it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes, for
     * example, equals, greater than, less than, and so on.
     * </p>
     * <p>
     * For <i>KeyConditions</i>, only the following comparison operators are
     * supported:
     * </p>
     * <p>
     * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of these comparison operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one specified
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>
     * .
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String or Binary (not a Number or a set type). The target attribute
     * of the comparison must be of type String or Binary (not a Number or a set
     * type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less
     * than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements
     * of the same type, either String, Number, or Binary (not a set type). A
     * target attribute matches if the target value is greater than, or equal
     * to, the first element and less than, or equal to, the second element. If
     * an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     * >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, Condition> keyConditions;

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the query results after the items are read and
     * returns only the desired values.
     * </p>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * <note>
     * <p>
     * A <i>QueryFilter</i> is applied after the items have already been read;
     * the process of filtering does not consume any additional read capacity
     * units.
     * </p>
     * </note>
     * <p>
     * If you provide more than one condition in the <i>QueryFilter</i> map,
     * then by default all of the conditions must evaluate to true. In other
     * words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If you
     * do this, then at least one of the conditions must evaluate to true,
     * rather than all of them.)
     * </p>
     * <p>
     * Note that <i>QueryFilter</i> does not allow key attributes. You cannot
     * define a filter condition on a partition key or a sort key.
     * </p>
     * <p>
     * Each <i>QueryFilter</i> element consists of an attribute name to compare,
     * along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * operator specified in <i>ComparisonOperator</i>.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     * >JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For
     * example, equals, greater than, less than, etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see the <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     * >Condition</a> data type.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, Condition> queryFilter;

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     */
    private String conditionalOperator;

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     */
    private Boolean scanIndexForward;

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <i>LastEvaluatedKey</i> in the previous
     * operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * </p>
     */
    private java.util.Map<String, AttributeValue> exclusiveStartKey;

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>INDEXES</i> - The response includes the aggregate
     * <i>ConsumedCapacity</i> for the operation, together with
     * <i>ConsumedCapacity</i> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <i>GetItem</i> and
     * <i>BatchGetItem</i>, do not access any indexes at all. In these cases,
     * specifying <i>INDEXES</i> will only return <i>ConsumedCapacity</i>
     * information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TOTAL</i> - The response includes only the aggregate
     * <i>ConsumedCapacity</i> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NONE</i> - No <i>ConsumedCapacity</i> details are included in the
     * response.
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
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i>
     * parameter.
     * </p>
     * </note>
     */
    private String projectionExpression;

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <i>Query</i> operation, but before the data is returned to you. Items
     * that do not satisfy the <i>FilterExpression</i> criteria are not
     * returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been
     * read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     * <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     */
    private String filterExpression;

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <i>Query</i> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value. The condition can also perform one of several comparison tests on
     * a single sort key value. <i>Query</i> can use
     * <i>KeyConditionExpression</i> to retrieve one item with a given partition
     * key value and sort key value, or several items that have the same
     * partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the
     * following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be
     * combined using <i>AND</i> with the condition for the sort key. Following
     * is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * <i>AND</i> <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true if the
     * sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&lt;</i> <code>:sortkeyval</code> - true if
     * the sort key value is less than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&lt;=</i> <code>:sortkeyval</code> - true if
     * the sort key value is less than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&gt;</i> <code>:sortkeyval</code> - true if
     * the sort key value is greater than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&gt;= </i> <code>:sortkeyval</code> - true if
     * the sort key value is greater than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     * <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value is
     * greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>begins_with (</i> <code>sortKeyName</code>, <code>:sortkeyval</code>
     * <i>)</i> - true if the sort key value begins with a particular operand.
     * (You cannot use this function with a sort key that is of type Number.)
     * Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <i>ExpressionAttributeValues</i> parameter to replace tokens such
     * as <code>:partitionval</code> and <code>:sortval</code> with actual
     * values at runtime.
     * </p>
     * <p>
     * You can optionally use the <i>ExpressionAttributeNames</i> parameter to
     * replace the names of the partition key and sort key with placeholder
     * tokens. This option might be necessary if an attribute name conflicts
     * with a DynamoDB reserved word. For example, the following
     * <i>KeyConditionExpression</i> parameter causes an error because
     * <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Size = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to
     * represent the attribute name <i>Size</i>. <i>KeyConditionExpression</i>
     * then is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#S = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <i>ExpressionAttributeNames</i> and
     * <i>ExpressionAttributeValues</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>KeyConditionExpression</i> replaces the legacy <i>KeyConditions</i>
     * parameter.
     * </p>
     * </note>
     */
    private String keyConditionExpression;

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using <i>ExpressionAttributeNames</i>:
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
     * <i>ExpressionAttributeNames</i>:
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
     * You would first need to specify <i>ExpressionAttributeValues</i> as
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
     * Default constructor for QueryRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public QueryRequest() {
    }

    /**
     * Constructs a new QueryRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName <p>
     *            The name of the table containing the requested items.
     *            </p>
     */
    public QueryRequest(String tableName) {
        setTableName(tableName);
    }

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table containing the requested items.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table containing the requested items.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items.
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
     *            The name of the table containing the requested items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <i>IndexName</i> parameter, you must also provide <i>TableName.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of an index to query. This index can be any local
     *         secondary index or global secondary index on the table. Note that
     *         if you use the <i>IndexName</i> parameter, you must also provide
     *         <i>TableName.</i>
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <i>IndexName</i> parameter, you must also provide <i>TableName.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of an index to query. This index can be any local
     *            secondary index or global secondary index on the table. Note
     *            that if you use the <i>IndexName</i> parameter, you must also
     *            provide <i>TableName.</i>
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <i>IndexName</i> parameter, you must also provide <i>TableName.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of an index to query. This index can be any local
     *            secondary index or global secondary index on the table. Note
     *            that if you use the <i>IndexName</i> parameter, you must also
     *            provide <i>TableName.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES,
     * SPECIFIC_ATTRIBUTES, COUNT
     *
     * @return <p>
     *         The attributes to be returned in the result. You can retrieve all
     *         item attributes, specific item attributes, the count of matching
     *         items, or in the case of an index, some or all of the attributes
     *         projected into the index.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes
     *         from the specified table or index. If you query a local secondary
     *         index, then for each matching item in the index DynamoDB will
     *         fetch the entire item from the parent table. If the index is
     *         configured to project all item attributes, then all of the data
     *         can be obtained from the local secondary index, and no fetching
     *         is required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when
     *         querying an index. Retrieves all attributes that have been
     *         projected into the index. If the index is configured to project
     *         all attributes, this return value is equivalent to specifying
     *         <code>ALL_ATTRIBUTES</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COUNT</code> - Returns the number of matching items, rather
     *         than the matching items themselves.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *         listed in <i>AttributesToGet</i>. This return value is equivalent
     *         to specifying <i>AttributesToGet</i> without specifying any value
     *         for <i>Select</i>.
     *         </p>
     *         <p>
     *         If you query a local secondary index and request only attributes
     *         that are projected into that index, the operation will read only
     *         the index and not the table. If any of the requested attributes
     *         are not projected into the local secondary index, DynamoDB will
     *         fetch each of these attributes from the parent table. This extra
     *         fetching incurs additional throughput cost and latency.
     *         </p>
     *         <p>
     *         If you query a global secondary index, you can only request
     *         attributes that are projected into the index. Global secondary
     *         index queries cannot fetch attributes from the parent table.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *         specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     *         accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *         accessing an index. You cannot use both <i>Select</i> and
     *         <i>AttributesToGet</i> together in a single request, unless the
     *         value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>.
     *         (This usage is equivalent to specifying <i>AttributesToGet</i>
     *         without any value for <i>Select</i>.)
     *         </p>
     *         <note>
     *         <p>
     *         If you use the <i>ProjectionExpression</i> parameter, then the
     *         value for <i>Select</i> can only be
     *         <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *         <i>Select</i> will return an error.
     *         </p>
     *         </note>
     * @see Select
     */
    public String getSelect() {
        return select;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES,
     * SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select <p>
     *            The attributes to be returned in the result. You can retrieve
     *            all item attributes, specific item attributes, the count of
     *            matching items, or in the case of an index, some or all of the
     *            attributes projected into the index.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALL_ATTRIBUTES</code> - Returns all of the item
     *            attributes from the specified table or index. If you query a
     *            local secondary index, then for each matching item in the
     *            index DynamoDB will fetch the entire item from the parent
     *            table. If the index is configured to project all item
     *            attributes, then all of the data can be obtained from the
     *            local secondary index, and no fetching is required.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when
     *            querying an index. Retrieves all attributes that have been
     *            projected into the index. If the index is configured to
     *            project all attributes, this return value is equivalent to
     *            specifying <code>ALL_ATTRIBUTES</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COUNT</code> - Returns the number of matching items,
     *            rather than the matching items themselves.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *            listed in <i>AttributesToGet</i>. This return value is
     *            equivalent to specifying <i>AttributesToGet</i> without
     *            specifying any value for <i>Select</i>.
     *            </p>
     *            <p>
     *            If you query a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query a global secondary index, you can only request
     *            attributes that are projected into the index. Global secondary
     *            index queries cannot fetch attributes from the parent table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *            specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code>
     *            when accessing a table, and
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index.
     *            You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     *            together in a single request, unless the value for
     *            <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage
     *            is equivalent to specifying <i>AttributesToGet</i> without any
     *            value for <i>Select</i>.)
     *            </p>
     *            <note>
     *            <p>
     *            If you use the <i>ProjectionExpression</i> parameter, then the
     *            value for <i>Select</i> can only be
     *            <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *            <i>Select</i> will return an error.
     *            </p>
     *            </note>
     * @see Select
     */
    public void setSelect(String select) {
        this.select = select;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES,
     * SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select <p>
     *            The attributes to be returned in the result. You can retrieve
     *            all item attributes, specific item attributes, the count of
     *            matching items, or in the case of an index, some or all of the
     *            attributes projected into the index.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALL_ATTRIBUTES</code> - Returns all of the item
     *            attributes from the specified table or index. If you query a
     *            local secondary index, then for each matching item in the
     *            index DynamoDB will fetch the entire item from the parent
     *            table. If the index is configured to project all item
     *            attributes, then all of the data can be obtained from the
     *            local secondary index, and no fetching is required.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when
     *            querying an index. Retrieves all attributes that have been
     *            projected into the index. If the index is configured to
     *            project all attributes, this return value is equivalent to
     *            specifying <code>ALL_ATTRIBUTES</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COUNT</code> - Returns the number of matching items,
     *            rather than the matching items themselves.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *            listed in <i>AttributesToGet</i>. This return value is
     *            equivalent to specifying <i>AttributesToGet</i> without
     *            specifying any value for <i>Select</i>.
     *            </p>
     *            <p>
     *            If you query a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query a global secondary index, you can only request
     *            attributes that are projected into the index. Global secondary
     *            index queries cannot fetch attributes from the parent table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *            specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code>
     *            when accessing a table, and
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index.
     *            You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     *            together in a single request, unless the value for
     *            <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage
     *            is equivalent to specifying <i>AttributesToGet</i> without any
     *            value for <i>Select</i>.)
     *            </p>
     *            <note>
     *            <p>
     *            If you use the <i>ProjectionExpression</i> parameter, then the
     *            value for <i>Select</i> can only be
     *            <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *            <i>Select</i> will return an error.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Select
     */
    public QueryRequest withSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES,
     * SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select <p>
     *            The attributes to be returned in the result. You can retrieve
     *            all item attributes, specific item attributes, the count of
     *            matching items, or in the case of an index, some or all of the
     *            attributes projected into the index.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALL_ATTRIBUTES</code> - Returns all of the item
     *            attributes from the specified table or index. If you query a
     *            local secondary index, then for each matching item in the
     *            index DynamoDB will fetch the entire item from the parent
     *            table. If the index is configured to project all item
     *            attributes, then all of the data can be obtained from the
     *            local secondary index, and no fetching is required.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when
     *            querying an index. Retrieves all attributes that have been
     *            projected into the index. If the index is configured to
     *            project all attributes, this return value is equivalent to
     *            specifying <code>ALL_ATTRIBUTES</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COUNT</code> - Returns the number of matching items,
     *            rather than the matching items themselves.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *            listed in <i>AttributesToGet</i>. This return value is
     *            equivalent to specifying <i>AttributesToGet</i> without
     *            specifying any value for <i>Select</i>.
     *            </p>
     *            <p>
     *            If you query a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query a global secondary index, you can only request
     *            attributes that are projected into the index. Global secondary
     *            index queries cannot fetch attributes from the parent table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *            specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code>
     *            when accessing a table, and
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index.
     *            You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     *            together in a single request, unless the value for
     *            <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage
     *            is equivalent to specifying <i>AttributesToGet</i> without any
     *            value for <i>Select</i>.)
     *            </p>
     *            <note>
     *            <p>
     *            If you use the <i>ProjectionExpression</i> parameter, then the
     *            value for <i>Select</i> can only be
     *            <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *            <i>Select</i> will return an error.
     *            </p>
     *            </note>
     * @see Select
     */
    public void setSelect(Select select) {
        this.select = select.toString();
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES,
     * SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select <p>
     *            The attributes to be returned in the result. You can retrieve
     *            all item attributes, specific item attributes, the count of
     *            matching items, or in the case of an index, some or all of the
     *            attributes projected into the index.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALL_ATTRIBUTES</code> - Returns all of the item
     *            attributes from the specified table or index. If you query a
     *            local secondary index, then for each matching item in the
     *            index DynamoDB will fetch the entire item from the parent
     *            table. If the index is configured to project all item
     *            attributes, then all of the data can be obtained from the
     *            local secondary index, and no fetching is required.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when
     *            querying an index. Retrieves all attributes that have been
     *            projected into the index. If the index is configured to
     *            project all attributes, this return value is equivalent to
     *            specifying <code>ALL_ATTRIBUTES</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COUNT</code> - Returns the number of matching items,
     *            rather than the matching items themselves.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *            listed in <i>AttributesToGet</i>. This return value is
     *            equivalent to specifying <i>AttributesToGet</i> without
     *            specifying any value for <i>Select</i>.
     *            </p>
     *            <p>
     *            If you query a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query a global secondary index, you can only request
     *            attributes that are projected into the index. Global secondary
     *            index queries cannot fetch attributes from the parent table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *            specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code>
     *            when accessing a table, and
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index.
     *            You cannot use both <i>Select</i> and <i>AttributesToGet</i>
     *            together in a single request, unless the value for
     *            <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage
     *            is equivalent to specifying <i>AttributesToGet</i> without any
     *            value for <i>Select</i>.)
     *            </p>
     *            <note>
     *            <p>
     *            If you use the <i>ProjectionExpression</i> parameter, then the
     *            value for <i>Select</i> can only be
     *            <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *            <i>Select</i> will return an error.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Select
     */
    public QueryRequest withSelect(Select select) {
        this.select = select.toString();
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     *
     * @return <important>
     *         <p>
     *         This is a legacy parameter, for backward compatibility. New
     *         applications should use <i>ProjectionExpression</i> instead. Do
     *         not combine legacy parameters and expression parameters in a
     *         single API call; otherwise, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     *         </p>
     *         <p>
     *         This parameter allows you to retrieve attributes of type List or
     *         Map; however, it cannot retrieve individual elements within a
     *         List or a Map.
     *         </p>
     *         </important>
     *         <p>
     *         The names of one or more attributes to retrieve. If no attribute
     *         names are provided, then all attributes will be returned. If any
     *         of the requested attributes are not found, they will not appear
     *         in the result.
     *         </p>
     *         <p>
     *         Note that <i>AttributesToGet</i> has no effect on provisioned
     *         throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application.
     *         </p>
     *         <p>
     *         You cannot use both <i>AttributesToGet</i> and <i>Select</i>
     *         together in a <i>Query</i> request, <i>unless</i> the value for
     *         <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value
     *         for <i>Select</i>.)
     *         </p>
     *         <p>
     *         If you query a local secondary index and request only attributes
     *         that are projected into that index, the operation will read only
     *         the index and not the table. If any of the requested attributes
     *         are not projected into the local secondary index, DynamoDB will
     *         fetch each of these attributes from the parent table. This extra
     *         fetching incurs additional throughput cost and latency.
     *         </p>
     *         <p>
     *         If you query a global secondary index, you can only request
     *         attributes that are projected into the index. Global secondary
     *         index queries cannot fetch attributes from the parent table.
     *         </p>
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     *
     * @param attributesToGet <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>ProjectionExpression</i> instead.
     *            Do not combine legacy parameters and expression parameters in
     *            a single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            <p>
     *            This parameter allows you to retrieve attributes of type List
     *            or Map; however, it cannot retrieve individual elements within
     *            a List or a Map.
     *            </p>
     *            </important>
     *            <p>
     *            The names of one or more attributes to retrieve. If no
     *            attribute names are provided, then all attributes will be
     *            returned. If any of the requested attributes are not found,
     *            they will not appear in the result.
     *            </p>
     *            <p>
     *            Note that <i>AttributesToGet</i> has no effect on provisioned
     *            throughput consumption. DynamoDB determines capacity units
     *            consumed based on item size, not on the amount of data that is
     *            returned to an application.
     *            </p>
     *            <p>
     *            You cannot use both <i>AttributesToGet</i> and <i>Select</i>
     *            together in a <i>Query</i> request, <i>unless</i> the value
     *            for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     *            usage is equivalent to specifying <i>AttributesToGet</i>
     *            without any value for <i>Select</i>.)
     *            </p>
     *            <p>
     *            If you query a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query a global secondary index, you can only request
     *            attributes that are projected into the index. Global secondary
     *            index queries cannot fetch attributes from the parent table.
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
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesToGet <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>ProjectionExpression</i> instead.
     *            Do not combine legacy parameters and expression parameters in
     *            a single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            <p>
     *            This parameter allows you to retrieve attributes of type List
     *            or Map; however, it cannot retrieve individual elements within
     *            a List or a Map.
     *            </p>
     *            </important>
     *            <p>
     *            The names of one or more attributes to retrieve. If no
     *            attribute names are provided, then all attributes will be
     *            returned. If any of the requested attributes are not found,
     *            they will not appear in the result.
     *            </p>
     *            <p>
     *            Note that <i>AttributesToGet</i> has no effect on provisioned
     *            throughput consumption. DynamoDB determines capacity units
     *            consumed based on item size, not on the amount of data that is
     *            returned to an application.
     *            </p>
     *            <p>
     *            You cannot use both <i>AttributesToGet</i> and <i>Select</i>
     *            together in a <i>Query</i> request, <i>unless</i> the value
     *            for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     *            usage is equivalent to specifying <i>AttributesToGet</i>
     *            without any value for <i>Select</i>.)
     *            </p>
     *            <p>
     *            If you query a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query a global secondary index, you can only request
     *            attributes that are projected into the index. Global secondary
     *            index queries cannot fetch attributes from the parent table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) {
            this.attributesToGet = new java.util.ArrayList<String>(attributesToGet.length);
        }
        for (String value : attributesToGet) {
            this.attributesToGet.add(value);
        }
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesToGet <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>ProjectionExpression</i> instead.
     *            Do not combine legacy parameters and expression parameters in
     *            a single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            <p>
     *            This parameter allows you to retrieve attributes of type List
     *            or Map; however, it cannot retrieve individual elements within
     *            a List or a Map.
     *            </p>
     *            </important>
     *            <p>
     *            The names of one or more attributes to retrieve. If no
     *            attribute names are provided, then all attributes will be
     *            returned. If any of the requested attributes are not found,
     *            they will not appear in the result.
     *            </p>
     *            <p>
     *            Note that <i>AttributesToGet</i> has no effect on provisioned
     *            throughput consumption. DynamoDB determines capacity units
     *            consumed based on item size, not on the amount of data that is
     *            returned to an application.
     *            </p>
     *            <p>
     *            You cannot use both <i>AttributesToGet</i> and <i>Select</i>
     *            together in a <i>Query</i> request, <i>unless</i> the value
     *            for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     *            usage is equivalent to specifying <i>AttributesToGet</i>
     *            without any value for <i>Select</i>.)
     *            </p>
     *            <p>
     *            If you query a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query a global secondary index, you can only request
     *            attributes that are projected into the index. Global secondary
     *            index queries cannot fetch attributes from the parent table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you
     * can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     * >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of items to evaluate (not necessarily the
     *         number of matching items). If DynamoDB processes the number of
     *         items up to the limit while processing the results, it stops the
     *         operation and returns the matching values up to that point, and a
     *         key in <i>LastEvaluatedKey</i> to apply in a subsequent
     *         operation, so that you can pick up where you left off. Also, if
     *         the processed data set size exceeds 1 MB before DynamoDB reaches
     *         this limit, it stops the operation and returns the matching
     *         values up to the limit, and a key in <i>LastEvaluatedKey</i> to
     *         apply in a subsequent operation to continue the operation. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     *         >Query and Scan</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you
     * can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     * >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            The maximum number of items to evaluate (not necessarily the
     *            number of matching items). If DynamoDB processes the number of
     *            items up to the limit while processing the results, it stops
     *            the operation and returns the matching values up to that
     *            point, and a key in <i>LastEvaluatedKey</i> to apply in a
     *            subsequent operation, so that you can pick up where you left
     *            off. Also, if the processed data set size exceeds 1 MB before
     *            DynamoDB reaches this limit, it stops the operation and
     *            returns the matching values up to the limit, and a key in
     *            <i>LastEvaluatedKey</i> to apply in a subsequent operation to
     *            continue the operation. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     *            >Query and Scan</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you
     * can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     * >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            The maximum number of items to evaluate (not necessarily the
     *            number of matching items). If DynamoDB processes the number of
     *            items up to the limit while processing the results, it stops
     *            the operation and returns the matching values up to that
     *            point, and a key in <i>LastEvaluatedKey</i> to apply in a
     *            subsequent operation, so that you can pick up where you left
     *            off. Also, if the processed data set size exceeds 1 MB before
     *            DynamoDB reaches this limit, it stops the operation and
     *            returns the matching values up to the limit, and a key in
     *            <i>LastEvaluatedKey</i> to apply in a subsequent operation to
     *            continue the operation. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     *            >Query and Scan</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
     * </p>
     *
     * @return <p>
     *         Determines the read consistency model: If set to
     *         <code>true</code>, then the operation uses strongly consistent
     *         reads; otherwise, the operation uses eventually consistent reads.
     *         </p>
     *         <p>
     *         Strongly consistent reads are not supported on global secondary
     *         indexes. If you query a global secondary index with
     *         <i>ConsistentRead</i> set to <code>true</code>, you will receive
     *         a <i>ValidationException</i>.
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
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
     * </p>
     *
     * @return <p>
     *         Determines the read consistency model: If set to
     *         <code>true</code>, then the operation uses strongly consistent
     *         reads; otherwise, the operation uses eventually consistent reads.
     *         </p>
     *         <p>
     *         Strongly consistent reads are not supported on global secondary
     *         indexes. If you query a global secondary index with
     *         <i>ConsistentRead</i> set to <code>true</code>, you will receive
     *         a <i>ValidationException</i>.
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
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
     * </p>
     *
     * @param consistentRead <p>
     *            Determines the read consistency model: If set to
     *            <code>true</code>, then the operation uses strongly consistent
     *            reads; otherwise, the operation uses eventually consistent
     *            reads.
     *            </p>
     *            <p>
     *            Strongly consistent reads are not supported on global
     *            secondary indexes. If you query a global secondary index with
     *            <i>ConsistentRead</i> set to <code>true</code>, you will
     *            receive a <i>ValidationException</i>.
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
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
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
     *            <p>
     *            Strongly consistent reads are not supported on global
     *            secondary indexes. If you query a global secondary index with
     *            <i>ConsistentRead</i> set to <code>true</code>, you will
     *            receive a <i>ValidationException</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>KeyConditionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * provide the partition key name and value as an <code>EQ</code> condition.
     * You can optionally provide a second condition, referring to the sort key.
     * </p>
     * <note>
     * <p>
     * If you don't provide a sort key condition, all of the items that match
     * the partition key will be retrieved. If a <i>FilterExpression</i> or
     * <i>QueryFilter</i> is present, it will be applied after the items are
     * retrieved.
     * </p>
     * </note>
     * <p>
     * For a query on an index, you can have conditions only on the index key
     * attributes. You must provide the index partition key name and value as an
     * <code>EQ</code> condition. You can optionally provide a second condition,
     * referring to the index sort key.
     * </p>
     * <p>
     * Each <i>KeyConditions</i> element consists of an attribute name to
     * compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when
     * it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes, for
     * example, equals, greater than, less than, and so on.
     * </p>
     * <p>
     * For <i>KeyConditions</i>, only the following comparison operators are
     * supported:
     * </p>
     * <p>
     * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of these comparison operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one specified
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>
     * .
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String or Binary (not a Number or a set type). The target attribute
     * of the comparison must be of type String or Binary (not a Number or a set
     * type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less
     * than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements
     * of the same type, either String, Number, or Binary (not a set type). A
     * target attribute matches if the target value is greater than, or equal
     * to, the first element and less than, or equal to, the second element. If
     * an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     * >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @return <important>
     *         <p>
     *         This is a legacy parameter, for backward compatibility. New
     *         applications should use <i>KeyConditionExpression</i> instead. Do
     *         not combine legacy parameters and expression parameters in a
     *         single API call; otherwise, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         The selection criteria for the query. For a query on a table, you
     *         can have conditions only on the table primary key attributes. You
     *         must provide the partition key name and value as an
     *         <code>EQ</code> condition. You can optionally provide a second
     *         condition, referring to the sort key.
     *         </p>
     *         <note>
     *         <p>
     *         If you don't provide a sort key condition, all of the items that
     *         match the partition key will be retrieved. If a
     *         <i>FilterExpression</i> or <i>QueryFilter</i> is present, it will
     *         be applied after the items are retrieved.
     *         </p>
     *         </note>
     *         <p>
     *         For a query on an index, you can have conditions only on the
     *         index key attributes. You must provide the index partition key
     *         name and value as an <code>EQ</code> condition. You can
     *         optionally provide a second condition, referring to the index
     *         sort key.
     *         </p>
     *         <p>
     *         Each <i>KeyConditions</i> element consists of an attribute name
     *         to compare, along with the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AttributeValueList</i> - One or more values to evaluate
     *         against the supplied attribute. The number of values in the list
     *         depends on the <i>ComparisonOperator</i> being used.
     *         </p>
     *         <p>
     *         For type Number, value comparisons are numeric.
     *         </p>
     *         <p>
     *         String value comparisons for greater than, equals, or less than
     *         are based on ASCII character code values. For example,
     *         <code>a</code> is greater than <code>A</code>, and <code>a</code>
     *         is greater than <code>B</code>. For a list of code values, see <a
     *         href
     *         ="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *         >http
     *         ://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         </p>
     *         <p>
     *         For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ComparisonOperator</i> - A comparator for evaluating
     *         attributes, for example, equals, greater than, less than, and so
     *         on.
     *         </p>
     *         <p>
     *         For <i>KeyConditions</i>, only the following comparison operators
     *         are supported:
     *         </p>
     *         <p>
     *         <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     *         </p>
     *         <p>
     *         The following are descriptions of these comparison operators.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EQ</code> : Equal.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element
     *         of a different type than the one specified in the request, the
     *         value does not match. For example, <code>{"S":"6"}</code> does
     *         not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *         does not equal <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>LE</code> : Less than or equal.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary
     *         (not a set type). If an item contains an <i>AttributeValue</i>
     *         element of a different type than the one provided in the request,
     *         the value does not match. For example, <code>{"S":"6"}</code>
     *         does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>LT</code> : Less than.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element
     *         of a different type than the one provided in the request, the
     *         value does not match. For example, <code>{"S":"6"}</code> does
     *         not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *         does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>GE</code> : Greater than or equal.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary
     *         (not a set type). If an item contains an <i>AttributeValue</i>
     *         element of a different type than the one provided in the request,
     *         the value does not match. For example, <code>{"S":"6"}</code>
     *         does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>GT</code> : Greater than.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary
     *         (not a set type). If an item contains an <i>AttributeValue</i>
     *         element of a different type than the one provided in the request,
     *         the value does not match. For example, <code>{"S":"6"}</code>
     *         does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>BEGINS_WITH</code> : Checks for a prefix.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set type). The target attribute of the comparison must be of type
     *         String or Binary (not a Number or a set type).
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>BETWEEN</code> : Greater than or equal to the first value,
     *         and less than or equal to the second value.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not
     *         a set type). A target attribute matches if the target value is
     *         greater than, or equal to, the first element and less than, or
     *         equal to, the second element. If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         provided in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>
     *         . Also, <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For usage examples of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     *         >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.Map<String, Condition> getKeyConditions() {
        return keyConditions;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>KeyConditionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * provide the partition key name and value as an <code>EQ</code> condition.
     * You can optionally provide a second condition, referring to the sort key.
     * </p>
     * <note>
     * <p>
     * If you don't provide a sort key condition, all of the items that match
     * the partition key will be retrieved. If a <i>FilterExpression</i> or
     * <i>QueryFilter</i> is present, it will be applied after the items are
     * retrieved.
     * </p>
     * </note>
     * <p>
     * For a query on an index, you can have conditions only on the index key
     * attributes. You must provide the index partition key name and value as an
     * <code>EQ</code> condition. You can optionally provide a second condition,
     * referring to the index sort key.
     * </p>
     * <p>
     * Each <i>KeyConditions</i> element consists of an attribute name to
     * compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when
     * it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes, for
     * example, equals, greater than, less than, and so on.
     * </p>
     * <p>
     * For <i>KeyConditions</i>, only the following comparison operators are
     * supported:
     * </p>
     * <p>
     * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of these comparison operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one specified
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>
     * .
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String or Binary (not a Number or a set type). The target attribute
     * of the comparison must be of type String or Binary (not a Number or a set
     * type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less
     * than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements
     * of the same type, either String, Number, or Binary (not a set type). A
     * target attribute matches if the target value is greater than, or equal
     * to, the first element and less than, or equal to, the second element. If
     * an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     * >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     *
     * @param keyConditions <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>KeyConditionExpression</i> instead.
     *            Do not combine legacy parameters and expression parameters in
     *            a single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            </important>
     *            <p>
     *            The selection criteria for the query. For a query on a table,
     *            you can have conditions only on the table primary key
     *            attributes. You must provide the partition key name and value
     *            as an <code>EQ</code> condition. You can optionally provide a
     *            second condition, referring to the sort key.
     *            </p>
     *            <note>
     *            <p>
     *            If you don't provide a sort key condition, all of the items
     *            that match the partition key will be retrieved. If a
     *            <i>FilterExpression</i> or <i>QueryFilter</i> is present, it
     *            will be applied after the items are retrieved.
     *            </p>
     *            </note>
     *            <p>
     *            For a query on an index, you can have conditions only on the
     *            index key attributes. You must provide the index partition key
     *            name and value as an <code>EQ</code> condition. You can
     *            optionally provide a second condition, referring to the index
     *            sort key.
     *            </p>
     *            <p>
     *            Each <i>KeyConditions</i> element consists of an attribute
     *            name to compare, along with the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>AttributeValueList</i> - One or more values to evaluate
     *            against the supplied attribute. The number of values in the
     *            list depends on the <i>ComparisonOperator</i> being used.
     *            </p>
     *            <p>
     *            For type Number, value comparisons are numeric.
     *            </p>
     *            <p>
     *            String value comparisons for greater than, equals, or less
     *            than are based on ASCII character code values. For example,
     *            <code>a</code> is greater than <code>A</code>, and
     *            <code>a</code> is greater than <code>B</code>. For a list of
     *            code values, see <a href=
     *            "http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *            >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters
     *            </a>.
     *            </p>
     *            <p>
     *            For Binary, DynamoDB treats each byte of the binary data as
     *            unsigned when it compares binary values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>ComparisonOperator</i> - A comparator for evaluating
     *            attributes, for example, equals, greater than, less than, and
     *            so on.
     *            </p>
     *            <p>
     *            For <i>KeyConditions</i>, only the following comparison
     *            operators are supported:
     *            </p>
     *            <p>
     *            <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     *            </p>
     *            <p>
     *            The following are descriptions of these comparison operators.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code> : Equal.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> of type String, Number, or Binary (not a
     *            set type). If an item contains an <i>AttributeValue</i>
     *            element of a different type than the one specified in the
     *            request, the value does not match. For example,
     *            <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *            Also, <code>{"N":"6"}</code> does not equal
     *            <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>LE</code> : Less than or equal.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> element of type String, Number, or
     *            Binary (not a set type). If an item contains an
     *            <i>AttributeValue</i> element of a different type than the one
     *            provided in the request, the value does not match. For
     *            example, <code>{"S":"6"}</code> does not equal
     *            <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *            compare to <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>LT</code> : Less than.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> of type String, Number, or Binary (not a
     *            set type). If an item contains an <i>AttributeValue</i>
     *            element of a different type than the one provided in the
     *            request, the value does not match. For example,
     *            <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *            Also, <code>{"N":"6"}</code> does not compare to
     *            <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>GE</code> : Greater than or equal.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> element of type String, Number, or
     *            Binary (not a set type). If an item contains an
     *            <i>AttributeValue</i> element of a different type than the one
     *            provided in the request, the value does not match. For
     *            example, <code>{"S":"6"}</code> does not equal
     *            <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *            compare to <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>GT</code> : Greater than.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> element of type String, Number, or
     *            Binary (not a set type). If an item contains an
     *            <i>AttributeValue</i> element of a different type than the one
     *            provided in the request, the value does not match. For
     *            example, <code>{"S":"6"}</code> does not equal
     *            <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *            compare to <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>BEGINS_WITH</code> : Checks for a prefix.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> of type String or Binary (not a Number
     *            or a set type). The target attribute of the comparison must be
     *            of type String or Binary (not a Number or a set type).
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code> : Greater than or equal to the first
     *            value, and less than or equal to the second value.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> must contain two
     *            <i>AttributeValue</i> elements of the same type, either
     *            String, Number, or Binary (not a set type). A target attribute
     *            matches if the target value is greater than, or equal to, the
     *            first element and less than, or equal to, the second element.
     *            If an item contains an <i>AttributeValue</i> element of a
     *            different type than the one provided in the request, the value
     *            does not match. For example, <code>{"S":"6"}</code> does not
     *            compare to <code>{"N":"6"}</code>. Also,
     *            <code>{"N":"6"}</code> does not compare to
     *            <code>{"NS":["6", "2", "1"]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            For usage examples of <i>AttributeValueList</i> and
     *            <i>ComparisonOperator</i>, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     *            >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     */
    public void setKeyConditions(java.util.Map<String, Condition> keyConditions) {
        this.keyConditions = keyConditions;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>KeyConditionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * provide the partition key name and value as an <code>EQ</code> condition.
     * You can optionally provide a second condition, referring to the sort key.
     * </p>
     * <note>
     * <p>
     * If you don't provide a sort key condition, all of the items that match
     * the partition key will be retrieved. If a <i>FilterExpression</i> or
     * <i>QueryFilter</i> is present, it will be applied after the items are
     * retrieved.
     * </p>
     * </note>
     * <p>
     * For a query on an index, you can have conditions only on the index key
     * attributes. You must provide the index partition key name and value as an
     * <code>EQ</code> condition. You can optionally provide a second condition,
     * referring to the index sort key.
     * </p>
     * <p>
     * Each <i>KeyConditions</i> element consists of an attribute name to
     * compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when
     * it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes, for
     * example, equals, greater than, less than, and so on.
     * </p>
     * <p>
     * For <i>KeyConditions</i>, only the following comparison operators are
     * supported:
     * </p>
     * <p>
     * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of these comparison operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one specified
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>
     * .
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String or Binary (not a Number or a set type). The target attribute
     * of the comparison must be of type String or Binary (not a Number or a set
     * type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less
     * than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements
     * of the same type, either String, Number, or Binary (not a set type). A
     * target attribute matches if the target value is greater than, or equal
     * to, the first element and less than, or equal to, the second element. If
     * an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     * >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyConditions <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>KeyConditionExpression</i> instead.
     *            Do not combine legacy parameters and expression parameters in
     *            a single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            </important>
     *            <p>
     *            The selection criteria for the query. For a query on a table,
     *            you can have conditions only on the table primary key
     *            attributes. You must provide the partition key name and value
     *            as an <code>EQ</code> condition. You can optionally provide a
     *            second condition, referring to the sort key.
     *            </p>
     *            <note>
     *            <p>
     *            If you don't provide a sort key condition, all of the items
     *            that match the partition key will be retrieved. If a
     *            <i>FilterExpression</i> or <i>QueryFilter</i> is present, it
     *            will be applied after the items are retrieved.
     *            </p>
     *            </note>
     *            <p>
     *            For a query on an index, you can have conditions only on the
     *            index key attributes. You must provide the index partition key
     *            name and value as an <code>EQ</code> condition. You can
     *            optionally provide a second condition, referring to the index
     *            sort key.
     *            </p>
     *            <p>
     *            Each <i>KeyConditions</i> element consists of an attribute
     *            name to compare, along with the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>AttributeValueList</i> - One or more values to evaluate
     *            against the supplied attribute. The number of values in the
     *            list depends on the <i>ComparisonOperator</i> being used.
     *            </p>
     *            <p>
     *            For type Number, value comparisons are numeric.
     *            </p>
     *            <p>
     *            String value comparisons for greater than, equals, or less
     *            than are based on ASCII character code values. For example,
     *            <code>a</code> is greater than <code>A</code>, and
     *            <code>a</code> is greater than <code>B</code>. For a list of
     *            code values, see <a href=
     *            "http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *            >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters
     *            </a>.
     *            </p>
     *            <p>
     *            For Binary, DynamoDB treats each byte of the binary data as
     *            unsigned when it compares binary values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>ComparisonOperator</i> - A comparator for evaluating
     *            attributes, for example, equals, greater than, less than, and
     *            so on.
     *            </p>
     *            <p>
     *            For <i>KeyConditions</i>, only the following comparison
     *            operators are supported:
     *            </p>
     *            <p>
     *            <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     *            </p>
     *            <p>
     *            The following are descriptions of these comparison operators.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code> : Equal.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> of type String, Number, or Binary (not a
     *            set type). If an item contains an <i>AttributeValue</i>
     *            element of a different type than the one specified in the
     *            request, the value does not match. For example,
     *            <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *            Also, <code>{"N":"6"}</code> does not equal
     *            <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>LE</code> : Less than or equal.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> element of type String, Number, or
     *            Binary (not a set type). If an item contains an
     *            <i>AttributeValue</i> element of a different type than the one
     *            provided in the request, the value does not match. For
     *            example, <code>{"S":"6"}</code> does not equal
     *            <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *            compare to <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>LT</code> : Less than.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> of type String, Number, or Binary (not a
     *            set type). If an item contains an <i>AttributeValue</i>
     *            element of a different type than the one provided in the
     *            request, the value does not match. For example,
     *            <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *            Also, <code>{"N":"6"}</code> does not compare to
     *            <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>GE</code> : Greater than or equal.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> element of type String, Number, or
     *            Binary (not a set type). If an item contains an
     *            <i>AttributeValue</i> element of a different type than the one
     *            provided in the request, the value does not match. For
     *            example, <code>{"S":"6"}</code> does not equal
     *            <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *            compare to <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>GT</code> : Greater than.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> element of type String, Number, or
     *            Binary (not a set type). If an item contains an
     *            <i>AttributeValue</i> element of a different type than the one
     *            provided in the request, the value does not match. For
     *            example, <code>{"S":"6"}</code> does not equal
     *            <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *            compare to <code>{"NS":["6", "2", "1"]}</code>.
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>BEGINS_WITH</code> : Checks for a prefix.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> can contain only one
     *            <i>AttributeValue</i> of type String or Binary (not a Number
     *            or a set type). The target attribute of the comparison must be
     *            of type String or Binary (not a Number or a set type).
     *            </p>
     *            <p/></li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code> : Greater than or equal to the first
     *            value, and less than or equal to the second value.
     *            </p>
     *            <p>
     *            <i>AttributeValueList</i> must contain two
     *            <i>AttributeValue</i> elements of the same type, either
     *            String, Number, or Binary (not a set type). A target attribute
     *            matches if the target value is greater than, or equal to, the
     *            first element and less than, or equal to, the second element.
     *            If an item contains an <i>AttributeValue</i> element of a
     *            different type than the one provided in the request, the value
     *            does not match. For example, <code>{"S":"6"}</code> does not
     *            compare to <code>{"N":"6"}</code>. Also,
     *            <code>{"N":"6"}</code> does not compare to
     *            <code>{"NS":["6", "2", "1"]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            For usage examples of <i>AttributeValueList</i> and
     *            <i>ComparisonOperator</i>, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     *            >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withKeyConditions(java.util.Map<String, Condition> keyConditions) {
        this.keyConditions = keyConditions;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>KeyConditionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * provide the partition key name and value as an <code>EQ</code> condition.
     * You can optionally provide a second condition, referring to the sort key.
     * </p>
     * <note>
     * <p>
     * If you don't provide a sort key condition, all of the items that match
     * the partition key will be retrieved. If a <i>FilterExpression</i> or
     * <i>QueryFilter</i> is present, it will be applied after the items are
     * retrieved.
     * </p>
     * </note>
     * <p>
     * For a query on an index, you can have conditions only on the index key
     * attributes. You must provide the index partition key name and value as an
     * <code>EQ</code> condition. You can optionally provide a second condition,
     * referring to the index sort key.
     * </p>
     * <p>
     * Each <i>KeyConditions</i> element consists of an attribute name to
     * compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when
     * it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes, for
     * example, equals, greater than, less than, and so on.
     * </p>
     * <p>
     * For <i>KeyConditions</i>, only the following comparison operators are
     * supported:
     * </p>
     * <p>
     * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of these comparison operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one specified
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>
     * .
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String or Binary (not a Number or a set type). The target attribute
     * of the comparison must be of type String or Binary (not a Number or a set
     * type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less
     * than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements
     * of the same type, either String, Number, or Binary (not a set type). A
     * target attribute matches if the target value is greater than, or equal
     * to, the first element and less than, or equal to, the second element. If
     * an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     * >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into KeyConditions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into KeyConditions.
     * @param value The corresponding value of the entry to be added into
     *            KeyConditions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest addKeyConditionsEntry(String key, Condition value) {
        if (null == this.keyConditions) {
            this.keyConditions = new java.util.HashMap<String, Condition>();
        }
        if (this.keyConditions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.keyConditions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KeyConditions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public QueryRequest clearKeyConditionsEntries() {
        this.keyConditions = null;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the query results after the items are read and
     * returns only the desired values.
     * </p>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * <note>
     * <p>
     * A <i>QueryFilter</i> is applied after the items have already been read;
     * the process of filtering does not consume any additional read capacity
     * units.
     * </p>
     * </note>
     * <p>
     * If you provide more than one condition in the <i>QueryFilter</i> map,
     * then by default all of the conditions must evaluate to true. In other
     * words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If you
     * do this, then at least one of the conditions must evaluate to true,
     * rather than all of them.)
     * </p>
     * <p>
     * Note that <i>QueryFilter</i> does not allow key attributes. You cannot
     * define a filter condition on a partition key or a sort key.
     * </p>
     * <p>
     * Each <i>QueryFilter</i> element consists of an attribute name to compare,
     * along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * operator specified in <i>ComparisonOperator</i>.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     * >JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For
     * example, equals, greater than, less than, etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see the <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     * >Condition</a> data type.
     * </p>
     * </li>
     * </ul>
     *
     * @return <important>
     *         <p>
     *         This is a legacy parameter, for backward compatibility. New
     *         applications should use <i>FilterExpression</i> instead. Do not
     *         combine legacy parameters and expression parameters in a single
     *         API call; otherwise, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         A condition that evaluates the query results after the items are
     *         read and returns only the desired values.
     *         </p>
     *         <p>
     *         This parameter does not support attributes of type List or Map.
     *         </p>
     *         <note>
     *         <p>
     *         A <i>QueryFilter</i> is applied after the items have already been
     *         read; the process of filtering does not consume any additional
     *         read capacity units.
     *         </p>
     *         </note>
     *         <p>
     *         If you provide more than one condition in the <i>QueryFilter</i>
     *         map, then by default all of the conditions must evaluate to true.
     *         In other words, the conditions are ANDed together. (You can use
     *         the <i>ConditionalOperator</i> parameter to OR the conditions
     *         instead. If you do this, then at least one of the conditions must
     *         evaluate to true, rather than all of them.)
     *         </p>
     *         <p>
     *         Note that <i>QueryFilter</i> does not allow key attributes. You
     *         cannot define a filter condition on a partition key or a sort
     *         key.
     *         </p>
     *         <p>
     *         Each <i>QueryFilter</i> element consists of an attribute name to
     *         compare, along with the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AttributeValueList</i> - One or more values to evaluate
     *         against the supplied attribute. The number of values in the list
     *         depends on the operator specified in <i>ComparisonOperator</i>.
     *         </p>
     *         <p>
     *         For type Number, value comparisons are numeric.
     *         </p>
     *         <p>
     *         String value comparisons for greater than, equals, or less than
     *         are based on ASCII character code values. For example,
     *         <code>a</code> is greater than <code>A</code>, and <code>a</code>
     *         is greater than <code>B</code>. For a list of code values, see <a
     *         href
     *         ="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *         >http
     *         ://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         </p>
     *         <p>
     *         For type Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values.
     *         </p>
     *         <p>
     *         For information on specifying data types in JSON, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     *         >JSON Data Format</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ComparisonOperator</i> - A comparator for evaluating
     *         attributes. For example, equals, greater than, less than, etc.
     *         </p>
     *         <p>
     *         The following comparison operators are available:
     *         </p>
     *         <p>
     *         <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *         </p>
     *         <p>
     *         For complete descriptions of all comparison operators, see the <a
     *         href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     *         >Condition</a> data type.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, Condition> getQueryFilter() {
        return queryFilter;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the query results after the items are read and
     * returns only the desired values.
     * </p>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * <note>
     * <p>
     * A <i>QueryFilter</i> is applied after the items have already been read;
     * the process of filtering does not consume any additional read capacity
     * units.
     * </p>
     * </note>
     * <p>
     * If you provide more than one condition in the <i>QueryFilter</i> map,
     * then by default all of the conditions must evaluate to true. In other
     * words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If you
     * do this, then at least one of the conditions must evaluate to true,
     * rather than all of them.)
     * </p>
     * <p>
     * Note that <i>QueryFilter</i> does not allow key attributes. You cannot
     * define a filter condition on a partition key or a sort key.
     * </p>
     * <p>
     * Each <i>QueryFilter</i> element consists of an attribute name to compare,
     * along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * operator specified in <i>ComparisonOperator</i>.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     * >JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For
     * example, equals, greater than, less than, etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see the <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     * >Condition</a> data type.
     * </p>
     * </li>
     * </ul>
     *
     * @param queryFilter <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>FilterExpression</i> instead. Do
     *            not combine legacy parameters and expression parameters in a
     *            single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            </important>
     *            <p>
     *            A condition that evaluates the query results after the items
     *            are read and returns only the desired values.
     *            </p>
     *            <p>
     *            This parameter does not support attributes of type List or
     *            Map.
     *            </p>
     *            <note>
     *            <p>
     *            A <i>QueryFilter</i> is applied after the items have already
     *            been read; the process of filtering does not consume any
     *            additional read capacity units.
     *            </p>
     *            </note>
     *            <p>
     *            If you provide more than one condition in the
     *            <i>QueryFilter</i> map, then by default all of the conditions
     *            must evaluate to true. In other words, the conditions are
     *            ANDed together. (You can use the <i>ConditionalOperator</i>
     *            parameter to OR the conditions instead. If you do this, then
     *            at least one of the conditions must evaluate to true, rather
     *            than all of them.)
     *            </p>
     *            <p>
     *            Note that <i>QueryFilter</i> does not allow key attributes.
     *            You cannot define a filter condition on a partition key or a
     *            sort key.
     *            </p>
     *            <p>
     *            Each <i>QueryFilter</i> element consists of an attribute name
     *            to compare, along with the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>AttributeValueList</i> - One or more values to evaluate
     *            against the supplied attribute. The number of values in the
     *            list depends on the operator specified in
     *            <i>ComparisonOperator</i>.
     *            </p>
     *            <p>
     *            For type Number, value comparisons are numeric.
     *            </p>
     *            <p>
     *            String value comparisons for greater than, equals, or less
     *            than are based on ASCII character code values. For example,
     *            <code>a</code> is greater than <code>A</code>, and
     *            <code>a</code> is greater than <code>B</code>. For a list of
     *            code values, see <a href=
     *            "http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *            >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters
     *            </a>.
     *            </p>
     *            <p>
     *            For type Binary, DynamoDB treats each byte of the binary data
     *            as unsigned when it compares binary values.
     *            </p>
     *            <p>
     *            For information on specifying data types in JSON, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     *            >JSON Data Format</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>ComparisonOperator</i> - A comparator for evaluating
     *            attributes. For example, equals, greater than, less than, etc.
     *            </p>
     *            <p>
     *            The following comparison operators are available:
     *            </p>
     *            <p>
     *            <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *            </p>
     *            <p>
     *            For complete descriptions of all comparison operators, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     *            >Condition</a> data type.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setQueryFilter(java.util.Map<String, Condition> queryFilter) {
        this.queryFilter = queryFilter;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the query results after the items are read and
     * returns only the desired values.
     * </p>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * <note>
     * <p>
     * A <i>QueryFilter</i> is applied after the items have already been read;
     * the process of filtering does not consume any additional read capacity
     * units.
     * </p>
     * </note>
     * <p>
     * If you provide more than one condition in the <i>QueryFilter</i> map,
     * then by default all of the conditions must evaluate to true. In other
     * words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If you
     * do this, then at least one of the conditions must evaluate to true,
     * rather than all of them.)
     * </p>
     * <p>
     * Note that <i>QueryFilter</i> does not allow key attributes. You cannot
     * define a filter condition on a partition key or a sort key.
     * </p>
     * <p>
     * Each <i>QueryFilter</i> element consists of an attribute name to compare,
     * along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * operator specified in <i>ComparisonOperator</i>.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     * >JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For
     * example, equals, greater than, less than, etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see the <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     * >Condition</a> data type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryFilter <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>FilterExpression</i> instead. Do
     *            not combine legacy parameters and expression parameters in a
     *            single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            </important>
     *            <p>
     *            A condition that evaluates the query results after the items
     *            are read and returns only the desired values.
     *            </p>
     *            <p>
     *            This parameter does not support attributes of type List or
     *            Map.
     *            </p>
     *            <note>
     *            <p>
     *            A <i>QueryFilter</i> is applied after the items have already
     *            been read; the process of filtering does not consume any
     *            additional read capacity units.
     *            </p>
     *            </note>
     *            <p>
     *            If you provide more than one condition in the
     *            <i>QueryFilter</i> map, then by default all of the conditions
     *            must evaluate to true. In other words, the conditions are
     *            ANDed together. (You can use the <i>ConditionalOperator</i>
     *            parameter to OR the conditions instead. If you do this, then
     *            at least one of the conditions must evaluate to true, rather
     *            than all of them.)
     *            </p>
     *            <p>
     *            Note that <i>QueryFilter</i> does not allow key attributes.
     *            You cannot define a filter condition on a partition key or a
     *            sort key.
     *            </p>
     *            <p>
     *            Each <i>QueryFilter</i> element consists of an attribute name
     *            to compare, along with the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>AttributeValueList</i> - One or more values to evaluate
     *            against the supplied attribute. The number of values in the
     *            list depends on the operator specified in
     *            <i>ComparisonOperator</i>.
     *            </p>
     *            <p>
     *            For type Number, value comparisons are numeric.
     *            </p>
     *            <p>
     *            String value comparisons for greater than, equals, or less
     *            than are based on ASCII character code values. For example,
     *            <code>a</code> is greater than <code>A</code>, and
     *            <code>a</code> is greater than <code>B</code>. For a list of
     *            code values, see <a href=
     *            "http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *            >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters
     *            </a>.
     *            </p>
     *            <p>
     *            For type Binary, DynamoDB treats each byte of the binary data
     *            as unsigned when it compares binary values.
     *            </p>
     *            <p>
     *            For information on specifying data types in JSON, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     *            >JSON Data Format</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>ComparisonOperator</i> - A comparator for evaluating
     *            attributes. For example, equals, greater than, less than, etc.
     *            </p>
     *            <p>
     *            The following comparison operators are available:
     *            </p>
     *            <p>
     *            <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *            </p>
     *            <p>
     *            For complete descriptions of all comparison operators, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     *            >Condition</a> data type.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withQueryFilter(java.util.Map<String, Condition> queryFilter) {
        this.queryFilter = queryFilter;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the query results after the items are read and
     * returns only the desired values.
     * </p>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * <note>
     * <p>
     * A <i>QueryFilter</i> is applied after the items have already been read;
     * the process of filtering does not consume any additional read capacity
     * units.
     * </p>
     * </note>
     * <p>
     * If you provide more than one condition in the <i>QueryFilter</i> map,
     * then by default all of the conditions must evaluate to true. In other
     * words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If you
     * do this, then at least one of the conditions must evaluate to true,
     * rather than all of them.)
     * </p>
     * <p>
     * Note that <i>QueryFilter</i> does not allow key attributes. You cannot
     * define a filter condition on a partition key or a sort key.
     * </p>
     * <p>
     * Each <i>QueryFilter</i> element consists of an attribute name to compare,
     * along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * operator specified in <i>ComparisonOperator</i>.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     * >JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For
     * example, equals, greater than, less than, etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see the <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     * >Condition</a> data type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into QueryFilter parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into QueryFilter.
     * @param value The corresponding value of the entry to be added into
     *            QueryFilter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest addQueryFilterEntry(String key, Condition value) {
        if (null == this.queryFilter) {
            this.queryFilter = new java.util.HashMap<String, Condition>();
        }
        if (this.queryFilter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.queryFilter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QueryFilter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public QueryRequest clearQueryFilterEntries() {
        this.queryFilter = null;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @return <important>
     *         <p>
     *         This is a legacy parameter, for backward compatibility. New
     *         applications should use <i>FilterExpression</i> instead. Do not
     *         combine legacy parameters and expression parameters in a single
     *         API call; otherwise, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         A logical operator to apply to the conditions in a
     *         <i>QueryFilter</i> map:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AND</code> - If all of the conditions evaluate to true,
     *         then the entire map evaluates to true.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OR</code> - If at least one of the conditions evaluate to
     *         true, then the entire map evaluates to true.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *         the default.
     *         </p>
     *         <p>
     *         The operation will succeed only if the entire map evaluates to
     *         true.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter does not support attributes of type List or Map.
     *         </p>
     *         </note>
     * @see ConditionalOperator
     */
    public String getConditionalOperator() {
        return conditionalOperator;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>FilterExpression</i> instead. Do
     *            not combine legacy parameters and expression parameters in a
     *            single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            </important>
     *            <p>
     *            A logical operator to apply to the conditions in a
     *            <i>QueryFilter</i> map:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AND</code> - If all of the conditions evaluate to true,
     *            then the entire map evaluates to true.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OR</code> - If at least one of the conditions evaluate
     *            to true, then the entire map evaluates to true.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you omit <i>ConditionalOperator</i>, then <code>AND</code>
     *            is the default.
     *            </p>
     *            <p>
     *            The operation will succeed only if the entire map evaluates to
     *            true.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter does not support attributes of type List or
     *            Map.
     *            </p>
     *            </note>
     * @see ConditionalOperator
     */
    public void setConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>FilterExpression</i> instead. Do
     *            not combine legacy parameters and expression parameters in a
     *            single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            </important>
     *            <p>
     *            A logical operator to apply to the conditions in a
     *            <i>QueryFilter</i> map:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AND</code> - If all of the conditions evaluate to true,
     *            then the entire map evaluates to true.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OR</code> - If at least one of the conditions evaluate
     *            to true, then the entire map evaluates to true.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you omit <i>ConditionalOperator</i>, then <code>AND</code>
     *            is the default.
     *            </p>
     *            <p>
     *            The operation will succeed only if the entire map evaluates to
     *            true.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter does not support attributes of type List or
     *            Map.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConditionalOperator
     */
    public QueryRequest withConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>FilterExpression</i> instead. Do
     *            not combine legacy parameters and expression parameters in a
     *            single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            </important>
     *            <p>
     *            A logical operator to apply to the conditions in a
     *            <i>QueryFilter</i> map:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AND</code> - If all of the conditions evaluate to true,
     *            then the entire map evaluates to true.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OR</code> - If at least one of the conditions evaluate
     *            to true, then the entire map evaluates to true.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you omit <i>ConditionalOperator</i>, then <code>AND</code>
     *            is the default.
     *            </p>
     *            <p>
     *            The operation will succeed only if the entire map evaluates to
     *            true.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter does not support attributes of type List or
     *            Map.
     *            </p>
     *            </note>
     * @see ConditionalOperator
     */
    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <important>
     *            <p>
     *            This is a legacy parameter, for backward compatibility. New
     *            applications should use <i>FilterExpression</i> instead. Do
     *            not combine legacy parameters and expression parameters in a
     *            single API call; otherwise, DynamoDB will return a
     *            <i>ValidationException</i> exception.
     *            </p>
     *            </important>
     *            <p>
     *            A logical operator to apply to the conditions in a
     *            <i>QueryFilter</i> map:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AND</code> - If all of the conditions evaluate to true,
     *            then the entire map evaluates to true.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OR</code> - If at least one of the conditions evaluate
     *            to true, then the entire map evaluates to true.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you omit <i>ConditionalOperator</i>, then <code>AND</code>
     *            is the default.
     *            </p>
     *            <p>
     *            The operation will succeed only if the entire map evaluates to
     *            true.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter does not support attributes of type List or
     *            Map.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConditionalOperator
     */
    public QueryRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     *
     * @return <p>
     *         Specifies the order for index traversal: If <code>true</code>
     *         (default), the traversal is performed in ascending order; if
     *         <code>false</code>, the traversal is performed in descending
     *         order.
     *         </p>
     *         <p>
     *         Items with the same partition key value are stored in sorted
     *         order by sort key. If the sort key data type is Number, the
     *         results are stored in numeric order. For type String, the results
     *         are stored in order of ASCII character code values. For type
     *         Binary, DynamoDB treats each byte of the binary data as unsigned.
     *         </p>
     *         <p>
     *         If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns
     *         the results in the order in which they are stored (by sort key
     *         value). This is the default behavior. If <i>ScanIndexForward</i>
     *         is <code>false</code>, DynamoDB reads the results in reverse
     *         order by sort key value, and then returns the results to the
     *         client.
     *         </p>
     */
    public Boolean isScanIndexForward() {
        return scanIndexForward;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     *
     * @return <p>
     *         Specifies the order for index traversal: If <code>true</code>
     *         (default), the traversal is performed in ascending order; if
     *         <code>false</code>, the traversal is performed in descending
     *         order.
     *         </p>
     *         <p>
     *         Items with the same partition key value are stored in sorted
     *         order by sort key. If the sort key data type is Number, the
     *         results are stored in numeric order. For type String, the results
     *         are stored in order of ASCII character code values. For type
     *         Binary, DynamoDB treats each byte of the binary data as unsigned.
     *         </p>
     *         <p>
     *         If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns
     *         the results in the order in which they are stored (by sort key
     *         value). This is the default behavior. If <i>ScanIndexForward</i>
     *         is <code>false</code>, DynamoDB reads the results in reverse
     *         order by sort key value, and then returns the results to the
     *         client.
     *         </p>
     */
    public Boolean getScanIndexForward() {
        return scanIndexForward;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     *
     * @param scanIndexForward <p>
     *            Specifies the order for index traversal: If <code>true</code>
     *            (default), the traversal is performed in ascending order; if
     *            <code>false</code>, the traversal is performed in descending
     *            order.
     *            </p>
     *            <p>
     *            Items with the same partition key value are stored in sorted
     *            order by sort key. If the sort key data type is Number, the
     *            results are stored in numeric order. For type String, the
     *            results are stored in order of ASCII character code values.
     *            For type Binary, DynamoDB treats each byte of the binary data
     *            as unsigned.
     *            </p>
     *            <p>
     *            If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB
     *            returns the results in the order in which they are stored (by
     *            sort key value). This is the default behavior. If
     *            <i>ScanIndexForward</i> is <code>false</code>, DynamoDB reads
     *            the results in reverse order by sort key value, and then
     *            returns the results to the client.
     *            </p>
     */
    public void setScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scanIndexForward <p>
     *            Specifies the order for index traversal: If <code>true</code>
     *            (default), the traversal is performed in ascending order; if
     *            <code>false</code>, the traversal is performed in descending
     *            order.
     *            </p>
     *            <p>
     *            Items with the same partition key value are stored in sorted
     *            order by sort key. If the sort key data type is Number, the
     *            results are stored in numeric order. For type String, the
     *            results are stored in order of ASCII character code values.
     *            For type Binary, DynamoDB treats each byte of the binary data
     *            as unsigned.
     *            </p>
     *            <p>
     *            If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB
     *            returns the results in the order in which they are stored (by
     *            sort key value). This is the default behavior. If
     *            <i>ScanIndexForward</i> is <code>false</code>, DynamoDB reads
     *            the results in reverse order by sort key value, and then
     *            returns the results to the client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
        return this;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <i>LastEvaluatedKey</i> in the previous
     * operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * </p>
     *
     * @return <p>
     *         The primary key of the first item that this operation will
     *         evaluate. Use the value that was returned for
     *         <i>LastEvaluatedKey</i> in the previous operation.
     *         </p>
     *         <p>
     *         The data type for <i>ExclusiveStartKey</i> must be String, Number
     *         or Binary. No set data types are allowed.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <i>LastEvaluatedKey</i> in the previous
     * operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * </p>
     *
     * @param exclusiveStartKey <p>
     *            The primary key of the first item that this operation will
     *            evaluate. Use the value that was returned for
     *            <i>LastEvaluatedKey</i> in the previous operation.
     *            </p>
     *            <p>
     *            The data type for <i>ExclusiveStartKey</i> must be String,
     *            Number or Binary. No set data types are allowed.
     *            </p>
     */
    public void setExclusiveStartKey(java.util.Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <i>LastEvaluatedKey</i> in the previous
     * operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusiveStartKey <p>
     *            The primary key of the first item that this operation will
     *            evaluate. Use the value that was returned for
     *            <i>LastEvaluatedKey</i> in the previous operation.
     *            </p>
     *            <p>
     *            The data type for <i>ExclusiveStartKey</i> must be String,
     *            Number or Binary. No set data types are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withExclusiveStartKey(
            java.util.Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
        return this;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <i>LastEvaluatedKey</i> in the previous
     * operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * </p>
     * <p>
     * The method adds a new key-value pair into ExclusiveStartKey parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ExclusiveStartKey.
     * @param value The corresponding value of the entry to be added into
     *            ExclusiveStartKey.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest addExclusiveStartKeyEntry(String key, AttributeValue value) {
        if (null == this.exclusiveStartKey) {
            this.exclusiveStartKey = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.exclusiveStartKey.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.exclusiveStartKey.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExclusiveStartKey.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public QueryRequest clearExclusiveStartKeyEntries() {
        this.exclusiveStartKey = null;
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
     * <i>INDEXES</i> - The response includes the aggregate
     * <i>ConsumedCapacity</i> for the operation, together with
     * <i>ConsumedCapacity</i> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <i>GetItem</i> and
     * <i>BatchGetItem</i>, do not access any indexes at all. In these cases,
     * specifying <i>INDEXES</i> will only return <i>ConsumedCapacity</i>
     * information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TOTAL</i> - The response includes only the aggregate
     * <i>ConsumedCapacity</i> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NONE</i> - No <i>ConsumedCapacity</i> details are included in the
     * response.
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
     *         <i>INDEXES</i> - The response includes the aggregate
     *         <i>ConsumedCapacity</i> for the operation, together with
     *         <i>ConsumedCapacity</i> for each table and secondary index that
     *         was accessed.
     *         </p>
     *         <p>
     *         Note that some operations, such as <i>GetItem</i> and
     *         <i>BatchGetItem</i>, do not access any indexes at all. In these
     *         cases, specifying <i>INDEXES</i> will only return
     *         <i>ConsumedCapacity</i> information for table(s).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TOTAL</i> - The response includes only the aggregate
     *         <i>ConsumedCapacity</i> for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>NONE</i> - No <i>ConsumedCapacity</i> details are included in
     *         the response.
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
     * <i>INDEXES</i> - The response includes the aggregate
     * <i>ConsumedCapacity</i> for the operation, together with
     * <i>ConsumedCapacity</i> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <i>GetItem</i> and
     * <i>BatchGetItem</i>, do not access any indexes at all. In these cases,
     * specifying <i>INDEXES</i> will only return <i>ConsumedCapacity</i>
     * information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TOTAL</i> - The response includes only the aggregate
     * <i>ConsumedCapacity</i> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NONE</i> - No <i>ConsumedCapacity</i> details are included in the
     * response.
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
     *            <i>INDEXES</i> - The response includes the aggregate
     *            <i>ConsumedCapacity</i> for the operation, together with
     *            <i>ConsumedCapacity</i> for each table and secondary index
     *            that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <i>GetItem</i> and
     *            <i>BatchGetItem</i>, do not access any indexes at all. In
     *            these cases, specifying <i>INDEXES</i> will only return
     *            <i>ConsumedCapacity</i> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TOTAL</i> - The response includes only the aggregate
     *            <i>ConsumedCapacity</i> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>NONE</i> - No <i>ConsumedCapacity</i> details are included
     *            in the response.
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
     * <i>INDEXES</i> - The response includes the aggregate
     * <i>ConsumedCapacity</i> for the operation, together with
     * <i>ConsumedCapacity</i> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <i>GetItem</i> and
     * <i>BatchGetItem</i>, do not access any indexes at all. In these cases,
     * specifying <i>INDEXES</i> will only return <i>ConsumedCapacity</i>
     * information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TOTAL</i> - The response includes only the aggregate
     * <i>ConsumedCapacity</i> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NONE</i> - No <i>ConsumedCapacity</i> details are included in the
     * response.
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
     *            <i>INDEXES</i> - The response includes the aggregate
     *            <i>ConsumedCapacity</i> for the operation, together with
     *            <i>ConsumedCapacity</i> for each table and secondary index
     *            that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <i>GetItem</i> and
     *            <i>BatchGetItem</i>, do not access any indexes at all. In
     *            these cases, specifying <i>INDEXES</i> will only return
     *            <i>ConsumedCapacity</i> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TOTAL</i> - The response includes only the aggregate
     *            <i>ConsumedCapacity</i> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>NONE</i> - No <i>ConsumedCapacity</i> details are included
     *            in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */
    public QueryRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
     * <i>INDEXES</i> - The response includes the aggregate
     * <i>ConsumedCapacity</i> for the operation, together with
     * <i>ConsumedCapacity</i> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <i>GetItem</i> and
     * <i>BatchGetItem</i>, do not access any indexes at all. In these cases,
     * specifying <i>INDEXES</i> will only return <i>ConsumedCapacity</i>
     * information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TOTAL</i> - The response includes only the aggregate
     * <i>ConsumedCapacity</i> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NONE</i> - No <i>ConsumedCapacity</i> details are included in the
     * response.
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
     *            <i>INDEXES</i> - The response includes the aggregate
     *            <i>ConsumedCapacity</i> for the operation, together with
     *            <i>ConsumedCapacity</i> for each table and secondary index
     *            that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <i>GetItem</i> and
     *            <i>BatchGetItem</i>, do not access any indexes at all. In
     *            these cases, specifying <i>INDEXES</i> will only return
     *            <i>ConsumedCapacity</i> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TOTAL</i> - The response includes only the aggregate
     *            <i>ConsumedCapacity</i> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>NONE</i> - No <i>ConsumedCapacity</i> details are included
     *            in the response.
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
     * <i>INDEXES</i> - The response includes the aggregate
     * <i>ConsumedCapacity</i> for the operation, together with
     * <i>ConsumedCapacity</i> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <i>GetItem</i> and
     * <i>BatchGetItem</i>, do not access any indexes at all. In these cases,
     * specifying <i>INDEXES</i> will only return <i>ConsumedCapacity</i>
     * information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TOTAL</i> - The response includes only the aggregate
     * <i>ConsumedCapacity</i> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NONE</i> - No <i>ConsumedCapacity</i> details are included in the
     * response.
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
     *            <i>INDEXES</i> - The response includes the aggregate
     *            <i>ConsumedCapacity</i> for the operation, together with
     *            <i>ConsumedCapacity</i> for each table and secondary index
     *            that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <i>GetItem</i> and
     *            <i>BatchGetItem</i>, do not access any indexes at all. In
     *            these cases, specifying <i>INDEXES</i> will only return
     *            <i>ConsumedCapacity</i> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>TOTAL</i> - The response includes only the aggregate
     *            <i>ConsumedCapacity</i> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>NONE</i> - No <i>ConsumedCapacity</i> details are included
     *            in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */
    public QueryRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
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
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i>
     * parameter.
     * </p>
     * </note>
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
     *         <note>
     *         <p>
     *         <i>ProjectionExpression</i> replaces the legacy
     *         <i>AttributesToGet</i> parameter.
     *         </p>
     *         </note>
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
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i>
     * parameter.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            <i>ProjectionExpression</i> replaces the legacy
     *            <i>AttributesToGet</i> parameter.
     *            </p>
     *            </note>
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
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i>
     * parameter.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            <i>ProjectionExpression</i> replaces the legacy
     *            <i>AttributesToGet</i> parameter.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <i>Query</i> operation, but before the data is returned to you. Items
     * that do not satisfy the <i>FilterExpression</i> criteria are not
     * returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been
     * read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     * <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     *
     * @return <p>
     *         A string that contains conditions that DynamoDB applies after the
     *         <i>Query</i> operation, but before the data is returned to you.
     *         Items that do not satisfy the <i>FilterExpression</i> criteria
     *         are not returned.
     *         </p>
     *         <note>
     *         <p>
     *         A <i>FilterExpression</i> is applied after the items have already
     *         been read; the process of filtering does not consume any
     *         additional read capacity units.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *         >Filter Expressions</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i>
     *         and <i>ConditionalOperator</i> parameters.
     *         </p>
     *         </note>
     */
    public String getFilterExpression() {
        return filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <i>Query</i> operation, but before the data is returned to you. Items
     * that do not satisfy the <i>FilterExpression</i> criteria are not
     * returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been
     * read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     * <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     *
     * @param filterExpression <p>
     *            A string that contains conditions that DynamoDB applies after
     *            the <i>Query</i> operation, but before the data is returned to
     *            you. Items that do not satisfy the <i>FilterExpression</i>
     *            criteria are not returned.
     *            </p>
     *            <note>
     *            <p>
     *            A <i>FilterExpression</i> is applied after the items have
     *            already been read; the process of filtering does not consume
     *            any additional read capacity units.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *            >Filter Expressions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i>
     *            and <i>ConditionalOperator</i> parameters.
     *            </p>
     *            </note>
     */
    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <i>Query</i> operation, but before the data is returned to you. Items
     * that do not satisfy the <i>FilterExpression</i> criteria are not
     * returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been
     * read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     * <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterExpression <p>
     *            A string that contains conditions that DynamoDB applies after
     *            the <i>Query</i> operation, but before the data is returned to
     *            you. Items that do not satisfy the <i>FilterExpression</i>
     *            criteria are not returned.
     *            </p>
     *            <note>
     *            <p>
     *            A <i>FilterExpression</i> is applied after the items have
     *            already been read; the process of filtering does not consume
     *            any additional read capacity units.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *            >Filter Expressions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i>
     *            and <i>ConditionalOperator</i> parameters.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <i>Query</i> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value. The condition can also perform one of several comparison tests on
     * a single sort key value. <i>Query</i> can use
     * <i>KeyConditionExpression</i> to retrieve one item with a given partition
     * key value and sort key value, or several items that have the same
     * partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the
     * following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be
     * combined using <i>AND</i> with the condition for the sort key. Following
     * is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * <i>AND</i> <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true if the
     * sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&lt;</i> <code>:sortkeyval</code> - true if
     * the sort key value is less than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&lt;=</i> <code>:sortkeyval</code> - true if
     * the sort key value is less than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&gt;</i> <code>:sortkeyval</code> - true if
     * the sort key value is greater than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&gt;= </i> <code>:sortkeyval</code> - true if
     * the sort key value is greater than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     * <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value is
     * greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>begins_with (</i> <code>sortKeyName</code>, <code>:sortkeyval</code>
     * <i>)</i> - true if the sort key value begins with a particular operand.
     * (You cannot use this function with a sort key that is of type Number.)
     * Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <i>ExpressionAttributeValues</i> parameter to replace tokens such
     * as <code>:partitionval</code> and <code>:sortval</code> with actual
     * values at runtime.
     * </p>
     * <p>
     * You can optionally use the <i>ExpressionAttributeNames</i> parameter to
     * replace the names of the partition key and sort key with placeholder
     * tokens. This option might be necessary if an attribute name conflicts
     * with a DynamoDB reserved word. For example, the following
     * <i>KeyConditionExpression</i> parameter causes an error because
     * <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Size = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to
     * represent the attribute name <i>Size</i>. <i>KeyConditionExpression</i>
     * then is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#S = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <i>ExpressionAttributeNames</i> and
     * <i>ExpressionAttributeValues</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>KeyConditionExpression</i> replaces the legacy <i>KeyConditions</i>
     * parameter.
     * </p>
     * </note>
     *
     * @return <p>
     *         The condition that specifies the key value(s) for items to be
     *         retrieved by the <i>Query</i> action.
     *         </p>
     *         <p>
     *         The condition must perform an equality test on a single partition
     *         key value. The condition can also perform one of several
     *         comparison tests on a single sort key value. <i>Query</i> can use
     *         <i>KeyConditionExpression</i> to retrieve one item with a given
     *         partition key value and sort key value, or several items that
     *         have the same partition key value but different sort key values.
     *         </p>
     *         <p>
     *         The partition key equality test is required, and must be
     *         specified in the following format:
     *         </p>
     *         <p>
     *         <code>partitionKeyName</code> <i>=</i>
     *         <code>:partitionkeyval</code>
     *         </p>
     *         <p>
     *         If you also want to provide a condition for the sort key, it must
     *         be combined using <i>AND</i> with the condition for the sort key.
     *         Following is an example, using the <b>=</b> comparison operator
     *         for the sort key:
     *         </p>
     *         <p>
     *         <code>partitionKeyName</code> <i>=</i>
     *         <code>:partitionkeyval</code> <i>AND</i> <code>sortKeyName</code>
     *         <i>=</i> <code>:sortkeyval</code>
     *         </p>
     *         <p>
     *         Valid comparisons for the sort key condition are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true
     *         if the sort key value is equal to <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i>&lt;</i> <code>:sortkeyval</code> -
     *         true if the sort key value is less than <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i>&lt;=</i> <code>:sortkeyval</code> -
     *         true if the sort key value is less than or equal to
     *         <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i>&gt;</i> <code>:sortkeyval</code> -
     *         true if the sort key value is greater than
     *         <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i>&gt;= </i> <code>:sortkeyval</code> -
     *         true if the sort key value is greater than or equal to
     *         <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     *         <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value
     *         is greater than or equal to <code>:sortkeyval1</code>, and less
     *         than or equal to <code>:sortkeyval2</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>begins_with (</i> <code>sortKeyName</code>,
     *         <code>:sortkeyval</code> <i>)</i> - true if the sort key value
     *         begins with a particular operand. (You cannot use this function
     *         with a sort key that is of type Number.) Note that the function
     *         name <code>begins_with</code> is case-sensitive.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use the <i>ExpressionAttributeValues</i> parameter to replace
     *         tokens such as <code>:partitionval</code> and
     *         <code>:sortval</code> with actual values at runtime.
     *         </p>
     *         <p>
     *         You can optionally use the <i>ExpressionAttributeNames</i>
     *         parameter to replace the names of the partition key and sort key
     *         with placeholder tokens. This option might be necessary if an
     *         attribute name conflicts with a DynamoDB reserved word. For
     *         example, the following <i>KeyConditionExpression</i> parameter
     *         causes an error because <i>Size</i> is a reserved word:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Size = :myval</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To work around this, define a placeholder (such a <code>#S</code>
     *         ) to represent the attribute name <i>Size</i>.
     *         <i>KeyConditionExpression</i> then is as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>#S = :myval</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a list of reserved words, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *         >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     *         <p>
     *         For more information on <i>ExpressionAttributeNames</i> and
     *         <i>ExpressionAttributeValues</i>, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     *         >Using Placeholders for Attribute Names and Values</a> in the
     *         <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <i>KeyConditionExpression</i> replaces the legacy
     *         <i>KeyConditions</i> parameter.
     *         </p>
     *         </note>
     */
    public String getKeyConditionExpression() {
        return keyConditionExpression;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <i>Query</i> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value. The condition can also perform one of several comparison tests on
     * a single sort key value. <i>Query</i> can use
     * <i>KeyConditionExpression</i> to retrieve one item with a given partition
     * key value and sort key value, or several items that have the same
     * partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the
     * following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be
     * combined using <i>AND</i> with the condition for the sort key. Following
     * is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * <i>AND</i> <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true if the
     * sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&lt;</i> <code>:sortkeyval</code> - true if
     * the sort key value is less than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&lt;=</i> <code>:sortkeyval</code> - true if
     * the sort key value is less than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&gt;</i> <code>:sortkeyval</code> - true if
     * the sort key value is greater than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&gt;= </i> <code>:sortkeyval</code> - true if
     * the sort key value is greater than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     * <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value is
     * greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>begins_with (</i> <code>sortKeyName</code>, <code>:sortkeyval</code>
     * <i>)</i> - true if the sort key value begins with a particular operand.
     * (You cannot use this function with a sort key that is of type Number.)
     * Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <i>ExpressionAttributeValues</i> parameter to replace tokens such
     * as <code>:partitionval</code> and <code>:sortval</code> with actual
     * values at runtime.
     * </p>
     * <p>
     * You can optionally use the <i>ExpressionAttributeNames</i> parameter to
     * replace the names of the partition key and sort key with placeholder
     * tokens. This option might be necessary if an attribute name conflicts
     * with a DynamoDB reserved word. For example, the following
     * <i>KeyConditionExpression</i> parameter causes an error because
     * <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Size = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to
     * represent the attribute name <i>Size</i>. <i>KeyConditionExpression</i>
     * then is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#S = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <i>ExpressionAttributeNames</i> and
     * <i>ExpressionAttributeValues</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>KeyConditionExpression</i> replaces the legacy <i>KeyConditions</i>
     * parameter.
     * </p>
     * </note>
     *
     * @param keyConditionExpression <p>
     *            The condition that specifies the key value(s) for items to be
     *            retrieved by the <i>Query</i> action.
     *            </p>
     *            <p>
     *            The condition must perform an equality test on a single
     *            partition key value. The condition can also perform one of
     *            several comparison tests on a single sort key value.
     *            <i>Query</i> can use <i>KeyConditionExpression</i> to retrieve
     *            one item with a given partition key value and sort key value,
     *            or several items that have the same partition key value but
     *            different sort key values.
     *            </p>
     *            <p>
     *            The partition key equality test is required, and must be
     *            specified in the following format:
     *            </p>
     *            <p>
     *            <code>partitionKeyName</code> <i>=</i>
     *            <code>:partitionkeyval</code>
     *            </p>
     *            <p>
     *            If you also want to provide a condition for the sort key, it
     *            must be combined using <i>AND</i> with the condition for the
     *            sort key. Following is an example, using the <b>=</b>
     *            comparison operator for the sort key:
     *            </p>
     *            <p>
     *            <code>partitionKeyName</code> <i>=</i>
     *            <code>:partitionkeyval</code> <i>AND</i>
     *            <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     *            </p>
     *            <p>
     *            Valid comparisons for the sort key condition are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> -
     *            true if the sort key value is equal to
     *            <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>&lt;</i> <code>:sortkeyval</code>
     *            - true if the sort key value is less than
     *            <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>&lt;=</i> <code>:sortkeyval</code>
     *            - true if the sort key value is less than or equal to
     *            <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>&gt;</i> <code>:sortkeyval</code>
     *            - true if the sort key value is greater than
     *            <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>&gt;= </i>
     *            <code>:sortkeyval</code> - true if the sort key value is
     *            greater than or equal to <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>BETWEEN</i>
     *            <code>:sortkeyval1</code> <i>AND</i> <code>:sortkeyval2</code>
     *            - true if the sort key value is greater than or equal to
     *            <code>:sortkeyval1</code>, and less than or equal to
     *            <code>:sortkeyval2</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>begins_with (</i> <code>sortKeyName</code>,
     *            <code>:sortkeyval</code> <i>)</i> - true if the sort key value
     *            begins with a particular operand. (You cannot use this
     *            function with a sort key that is of type Number.) Note that
     *            the function name <code>begins_with</code> is case-sensitive.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use the <i>ExpressionAttributeValues</i> parameter to replace
     *            tokens such as <code>:partitionval</code> and
     *            <code>:sortval</code> with actual values at runtime.
     *            </p>
     *            <p>
     *            You can optionally use the <i>ExpressionAttributeNames</i>
     *            parameter to replace the names of the partition key and sort
     *            key with placeholder tokens. This option might be necessary if
     *            an attribute name conflicts with a DynamoDB reserved word. For
     *            example, the following <i>KeyConditionExpression</i> parameter
     *            causes an error because <i>Size</i> is a reserved word:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Size = :myval</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To work around this, define a placeholder (such a
     *            <code>#S</code>) to represent the attribute name <i>Size</i>.
     *            <i>KeyConditionExpression</i> then is as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>#S = :myval</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a list of reserved words, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *            >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            For more information on <i>ExpressionAttributeNames</i> and
     *            <i>ExpressionAttributeValues</i>, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     *            >Using Placeholders for Attribute Names and Values</a> in the
     *            <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            <i>KeyConditionExpression</i> replaces the legacy
     *            <i>KeyConditions</i> parameter.
     *            </p>
     *            </note>
     */
    public void setKeyConditionExpression(String keyConditionExpression) {
        this.keyConditionExpression = keyConditionExpression;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <i>Query</i> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value. The condition can also perform one of several comparison tests on
     * a single sort key value. <i>Query</i> can use
     * <i>KeyConditionExpression</i> to retrieve one item with a given partition
     * key value and sort key value, or several items that have the same
     * partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the
     * following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be
     * combined using <i>AND</i> with the condition for the sort key. Following
     * is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * <i>AND</i> <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true if the
     * sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&lt;</i> <code>:sortkeyval</code> - true if
     * the sort key value is less than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&lt;=</i> <code>:sortkeyval</code> - true if
     * the sort key value is less than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&gt;</i> <code>:sortkeyval</code> - true if
     * the sort key value is greater than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>&gt;= </i> <code>:sortkeyval</code> - true if
     * the sort key value is greater than or equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     * <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value is
     * greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>begins_with (</i> <code>sortKeyName</code>, <code>:sortkeyval</code>
     * <i>)</i> - true if the sort key value begins with a particular operand.
     * (You cannot use this function with a sort key that is of type Number.)
     * Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <i>ExpressionAttributeValues</i> parameter to replace tokens such
     * as <code>:partitionval</code> and <code>:sortval</code> with actual
     * values at runtime.
     * </p>
     * <p>
     * You can optionally use the <i>ExpressionAttributeNames</i> parameter to
     * replace the names of the partition key and sort key with placeholder
     * tokens. This option might be necessary if an attribute name conflicts
     * with a DynamoDB reserved word. For example, the following
     * <i>KeyConditionExpression</i> parameter causes an error because
     * <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Size = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to
     * represent the attribute name <i>Size</i>. <i>KeyConditionExpression</i>
     * then is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#S = :myval</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <i>ExpressionAttributeNames</i> and
     * <i>ExpressionAttributeValues</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>KeyConditionExpression</i> replaces the legacy <i>KeyConditions</i>
     * parameter.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyConditionExpression <p>
     *            The condition that specifies the key value(s) for items to be
     *            retrieved by the <i>Query</i> action.
     *            </p>
     *            <p>
     *            The condition must perform an equality test on a single
     *            partition key value. The condition can also perform one of
     *            several comparison tests on a single sort key value.
     *            <i>Query</i> can use <i>KeyConditionExpression</i> to retrieve
     *            one item with a given partition key value and sort key value,
     *            or several items that have the same partition key value but
     *            different sort key values.
     *            </p>
     *            <p>
     *            The partition key equality test is required, and must be
     *            specified in the following format:
     *            </p>
     *            <p>
     *            <code>partitionKeyName</code> <i>=</i>
     *            <code>:partitionkeyval</code>
     *            </p>
     *            <p>
     *            If you also want to provide a condition for the sort key, it
     *            must be combined using <i>AND</i> with the condition for the
     *            sort key. Following is an example, using the <b>=</b>
     *            comparison operator for the sort key:
     *            </p>
     *            <p>
     *            <code>partitionKeyName</code> <i>=</i>
     *            <code>:partitionkeyval</code> <i>AND</i>
     *            <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     *            </p>
     *            <p>
     *            Valid comparisons for the sort key condition are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> -
     *            true if the sort key value is equal to
     *            <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>&lt;</i> <code>:sortkeyval</code>
     *            - true if the sort key value is less than
     *            <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>&lt;=</i> <code>:sortkeyval</code>
     *            - true if the sort key value is less than or equal to
     *            <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>&gt;</i> <code>:sortkeyval</code>
     *            - true if the sort key value is greater than
     *            <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>&gt;= </i>
     *            <code>:sortkeyval</code> - true if the sort key value is
     *            greater than or equal to <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <i>BETWEEN</i>
     *            <code>:sortkeyval1</code> <i>AND</i> <code>:sortkeyval2</code>
     *            - true if the sort key value is greater than or equal to
     *            <code>:sortkeyval1</code>, and less than or equal to
     *            <code>:sortkeyval2</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>begins_with (</i> <code>sortKeyName</code>,
     *            <code>:sortkeyval</code> <i>)</i> - true if the sort key value
     *            begins with a particular operand. (You cannot use this
     *            function with a sort key that is of type Number.) Note that
     *            the function name <code>begins_with</code> is case-sensitive.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use the <i>ExpressionAttributeValues</i> parameter to replace
     *            tokens such as <code>:partitionval</code> and
     *            <code>:sortval</code> with actual values at runtime.
     *            </p>
     *            <p>
     *            You can optionally use the <i>ExpressionAttributeNames</i>
     *            parameter to replace the names of the partition key and sort
     *            key with placeholder tokens. This option might be necessary if
     *            an attribute name conflicts with a DynamoDB reserved word. For
     *            example, the following <i>KeyConditionExpression</i> parameter
     *            causes an error because <i>Size</i> is a reserved word:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Size = :myval</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To work around this, define a placeholder (such a
     *            <code>#S</code>) to represent the attribute name <i>Size</i>.
     *            <i>KeyConditionExpression</i> then is as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>#S = :myval</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a list of reserved words, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *            >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            For more information on <i>ExpressionAttributeNames</i> and
     *            <i>ExpressionAttributeValues</i>, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     *            >Using Placeholders for Attribute Names and Values</a> in the
     *            <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            <i>KeyConditionExpression</i> replaces the legacy
     *            <i>KeyConditions</i> parameter.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withKeyConditionExpression(String keyConditionExpression) {
        this.keyConditionExpression = keyConditionExpression;
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using <i>ExpressionAttributeNames</i>:
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
     * <i>ExpressionAttributeNames</i>:
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
     *         <i>ExpressionAttributeNames</i>:
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
     *         for <i>ExpressionAttributeNames</i>:
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
     * following are some use cases for using <i>ExpressionAttributeNames</i>:
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
     * <i>ExpressionAttributeNames</i>:
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
     *            <i>ExpressionAttributeNames</i>:
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
     *            following for <i>ExpressionAttributeNames</i>:
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
     * following are some use cases for using <i>ExpressionAttributeNames</i>:
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
     * <i>ExpressionAttributeNames</i>:
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
     *            <i>ExpressionAttributeNames</i>:
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
     *            following for <i>ExpressionAttributeNames</i>:
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
    public QueryRequest withExpressionAttributeNames(
            java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using <i>ExpressionAttributeNames</i>:
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
     * <i>ExpressionAttributeNames</i>:
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
    public QueryRequest addExpressionAttributeNamesEntry(String key, String value) {
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
    public QueryRequest clearExpressionAttributeNamesEntries() {
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
     * You would first need to specify <i>ExpressionAttributeValues</i> as
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
     *         You would first need to specify <i>ExpressionAttributeValues</i>
     *         as follows:
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
     * You would first need to specify <i>ExpressionAttributeValues</i> as
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
     *            <i>ExpressionAttributeValues</i> as follows:
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
     * You would first need to specify <i>ExpressionAttributeValues</i> as
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
     *            <i>ExpressionAttributeValues</i> as follows:
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
    public QueryRequest withExpressionAttributeValues(
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
     * You would first need to specify <i>ExpressionAttributeValues</i> as
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
    public QueryRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
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
    public QueryRequest clearExpressionAttributeValuesEntries() {
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
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getSelect() != null)
            sb.append("Select: " + getSelect() + ",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: " + getConsistentRead() + ",");
        if (getKeyConditions() != null)
            sb.append("KeyConditions: " + getKeyConditions() + ",");
        if (getQueryFilter() != null)
            sb.append("QueryFilter: " + getQueryFilter() + ",");
        if (getConditionalOperator() != null)
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (getScanIndexForward() != null)
            sb.append("ScanIndexForward: " + getScanIndexForward() + ",");
        if (getExclusiveStartKey() != null)
            sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getProjectionExpression() != null)
            sb.append("ProjectionExpression: " + getProjectionExpression() + ",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: " + getFilterExpression() + ",");
        if (getKeyConditionExpression() != null)
            sb.append("KeyConditionExpression: " + getKeyConditionExpression() + ",");
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
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getSelect() == null) ? 0 : getSelect().hashCode());
        hashCode = prime * hashCode
                + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getConsistentRead() == null) ? 0 : getConsistentRead().hashCode());
        hashCode = prime * hashCode
                + ((getKeyConditions() == null) ? 0 : getKeyConditions().hashCode());
        hashCode = prime * hashCode
                + ((getQueryFilter() == null) ? 0 : getQueryFilter().hashCode());
        hashCode = prime * hashCode
                + ((getConditionalOperator() == null) ? 0 : getConditionalOperator().hashCode());
        hashCode = prime * hashCode
                + ((getScanIndexForward() == null) ? 0 : getScanIndexForward().hashCode());
        hashCode = prime * hashCode
                + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode());
        hashCode = prime * hashCode
                + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getKeyConditionExpression() == null) ? 0 : getKeyConditionExpression()
                        .hashCode());
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

        if (obj instanceof QueryRequest == false)
            return false;
        QueryRequest other = (QueryRequest) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getSelect() == null ^ this.getSelect() == null)
            return false;
        if (other.getSelect() != null && other.getSelect().equals(this.getSelect()) == false)
            return false;
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null
                && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getConsistentRead() == null ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null
                && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        if (other.getKeyConditions() == null ^ this.getKeyConditions() == null)
            return false;
        if (other.getKeyConditions() != null
                && other.getKeyConditions().equals(this.getKeyConditions()) == false)
            return false;
        if (other.getQueryFilter() == null ^ this.getQueryFilter() == null)
            return false;
        if (other.getQueryFilter() != null
                && other.getQueryFilter().equals(this.getQueryFilter()) == false)
            return false;
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null)
            return false;
        if (other.getConditionalOperator() != null
                && other.getConditionalOperator().equals(this.getConditionalOperator()) == false)
            return false;
        if (other.getScanIndexForward() == null ^ this.getScanIndexForward() == null)
            return false;
        if (other.getScanIndexForward() != null
                && other.getScanIndexForward().equals(this.getScanIndexForward()) == false)
            return false;
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null)
            return false;
        if (other.getExclusiveStartKey() != null
                && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false)
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
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null
                && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        if (other.getKeyConditionExpression() == null ^ this.getKeyConditionExpression() == null)
            return false;
        if (other.getKeyConditionExpression() != null
                && other.getKeyConditionExpression().equals(this.getKeyConditionExpression()) == false)
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
