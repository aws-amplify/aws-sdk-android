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
 * The <code>Query</code> operation finds items based on primary key values. You
 * can query any table or secondary index that has a composite primary key (a
 * partition key and a sort key).
 * </p>
 * <p>
 * Use the <code>KeyConditionExpression</code> parameter to provide a specific
 * value for the partition key. The <code>Query</code> operation will return all
 * of the items from the table or index with that partition key value. You can
 * optionally narrow the scope of the <code>Query</code> operation by specifying
 * a sort key value and a comparison operator in
 * <code>KeyConditionExpression</code>. To further refine the <code>Query</code>
 * results, you can optionally provide a <code>FilterExpression</code>. A
 * <code>FilterExpression</code> determines which items within the results
 * should be returned to you. All of the other results are discarded.
 * </p>
 * <p>
 * A <code>Query</code> operation always returns a result set. If no matching
 * items are found, the result set will be empty. Queries that do not return
 * results consume the minimum number of read capacity units for that type of
 * read operation.
 * </p>
 * <note>
 * <p>
 * DynamoDB calculates the number of read capacity units consumed based on item
 * size, not on the amount of data that is returned to an application. The
 * number of capacity units consumed will be the same whether you request all of
 * the attributes (the default behavior) or just some of them (using a
 * projection expression). The number will also be the same whether or not you
 * use a <code>FilterExpression</code>.
 * </p>
 * </note>
 * <p>
 * <code>Query</code> results are always sorted by the sort key value. If the
 * data type of the sort key is Number, the results are returned in numeric
 * order; otherwise, the results are returned in order of UTF-8 bytes. By
 * default, the sort order is ascending. To reverse the order, set the
 * <code>ScanIndexForward</code> parameter to false.
 * </p>
 * <p>
 * A single <code>Query</code> operation will read up to the maximum number of
 * items set (if using the <code>Limit</code> parameter) or a maximum of 1 MB of
 * data and then apply any filtering to the results using
 * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is present in
 * the response, you will need to paginate the result set. For more information,
 * see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Query.html#Query.Pagination"
 * >Paginating the Results</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * <code>FilterExpression</code> is applied after a <code>Query</code> finishes,
 * but before the results are returned. A <code>FilterExpression</code> cannot
 * contain partition key or sort key attributes. You need to specify those
 * attributes in the <code>KeyConditionExpression</code>.
 * </p>
 * <note>
 * <p>
 * A <code>Query</code> operation can return an empty result set and a
 * <code>LastEvaluatedKey</code> if all the items read for the page of results
 * are filtered out.
 * </p>
 * </note>
 * <p>
 * You can query a table, a local secondary index, or a global secondary index.
 * For a query on a table or on a local secondary index, you can set the
 * <code>ConsistentRead</code> parameter to <code>true</code> and obtain a
 * strongly consistent result. Global secondary indexes support eventually
 * consistent reads only, so do not specify <code>ConsistentRead</code> when
 * querying a global secondary index.
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
     * <code>IndexName</code> parameter, you must also provide
     * <code>TableName.</code>
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
     * <code>AttributesToGet</code>. This return value is equivalent to
     * specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the local secondary index, DynamoDB will fetch each of
     * these attributes from the parent table. This extra fetching incurs
     * additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request
     * attributes that are projected into the index. Global secondary index
     * queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <code>Select</code> and
     * <code>AttributesToGet</code> together in a single request, unless the
     * value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     * usage is equivalent to specifying <code>AttributesToGet</code> without
     * any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the
     * value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code>
     * will return an error.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES,
     * SPECIFIC_ATTRIBUTES, COUNT
     */
    private String select;

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
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     * continue the operation. For more information, see <a href=
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
     * If you query a global secondary index with <code>ConsistentRead</code>
     * set to <code>true</code>, you will receive a
     * <code>ValidationException</code>.
     * </p>
     */
    private Boolean consistentRead;

    /**
     * <p>
     * This is a legacy parameter. Use <code>KeyConditionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     * >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, Condition> keyConditions;

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     * >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, Condition> queryFilter;

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
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
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of UTF-8
     * bytes. For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns
     * the results in the order in which they are stored (by sort key value).
     * This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort
     * key value, and then returns the results to the client.
     * </p>
     */
    private Boolean scanIndexForward;

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <code>LastEvaluatedKey</code> in the
     * previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number
     * or Binary. No set data types are allowed.
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
     * A string that contains conditions that DynamoDB applies after the
     * <code>Query</code> operation, but before the data is returned to you.
     * Items that do not satisfy the <code>FilterExpression</code> criteria are
     * not returned.
     * </p>
     * <p>
     * A <code>FilterExpression</code> does not allow key attributes. You cannot
     * define a filter expression based on a partition key or a sort key.
     * </p>
     * <note>
     * <p>
     * A <code>FilterExpression</code> is applied after the items have already
     * been read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private String filterExpression;

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <code>Query</code> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value.
     * </p>
     * <p>
     * The condition can optionally perform one of several comparison tests on a
     * single sort key value. This allows <code>Query</code> to retrieve one
     * item with a given partition key value and sort key value, or several
     * items that have the same partition key value but different sort key
     * values.
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
     * combined using <code>AND</code> with the condition for the sort key.
     * Following is an example, using the <b>=</b> comparison operator for the
     * sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <code>=</code>
     * <code>:partitionkeyval</code> <code>AND</code> <code>sortKeyName</code>
     * <code>=</code> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true
     * if the sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> -
     * true if the sort key value is less than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> -
     * true if the sort key value is less than or equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> -
     * true if the sort key value is greater than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> -
     * true if the sort key value is greater than or equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code>
     * <code>AND</code> <code>:sortkeyval2</code> - true if the sort key value
     * is greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>begins_with (</code> <code>sortKeyName</code>,
     * <code>:sortkeyval</code> <code>)</code> - true if the sort key value
     * begins with a particular operand. (You cannot use this function with a
     * sort key that is of type Number.) Note that the function name
     * <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>ExpressionAttributeValues</code> parameter to replace
     * tokens such as <code>:partitionval</code> and <code>:sortval</code> with
     * actual values at runtime.
     * </p>
     * <p>
     * You can optionally use the <code>ExpressionAttributeNames</code>
     * parameter to replace the names of the partition key and sort key with
     * placeholder tokens. This option might be necessary if an attribute name
     * conflicts with a DynamoDB reserved word. For example, the following
     * <code>KeyConditionExpression</code> parameter causes an error because
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
     * represent the attribute name <i>Size</i>.
     * <code>KeyConditionExpression</code> then is as follows:
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
     * For more information on <code>ExpressionAttributeNames</code> and
     * <code>ExpressionAttributeValues</code>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     */
    private String keyConditionExpression;

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
     * <code>IndexName</code> parameter, you must also provide
     * <code>TableName.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of an index to query. This index can be any local
     *         secondary index or global secondary index on the table. Note that
     *         if you use the <code>IndexName</code> parameter, you must also
     *         provide <code>TableName.</code>
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <code>IndexName</code> parameter, you must also provide
     * <code>TableName.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of an index to query. This index can be any local
     *            secondary index or global secondary index on the table. Note
     *            that if you use the <code>IndexName</code> parameter, you must
     *            also provide <code>TableName.</code>
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <code>IndexName</code> parameter, you must also provide
     * <code>TableName.</code>
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
     *            that if you use the <code>IndexName</code> parameter, you must
     *            also provide <code>TableName.</code>
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
     * <code>AttributesToGet</code>. This return value is equivalent to
     * specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the local secondary index, DynamoDB will fetch each of
     * these attributes from the parent table. This extra fetching incurs
     * additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request
     * attributes that are projected into the index. Global secondary index
     * queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <code>Select</code> and
     * <code>AttributesToGet</code> together in a single request, unless the
     * value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     * usage is equivalent to specifying <code>AttributesToGet</code> without
     * any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the
     * value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code>
     * will return an error.
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
     *         listed in <code>AttributesToGet</code>. This return value is
     *         equivalent to specifying <code>AttributesToGet</code> without
     *         specifying any value for <code>Select</code>.
     *         </p>
     *         <p>
     *         If you query or scan a local secondary index and request only
     *         attributes that are projected into that index, the operation will
     *         read only the index and not the table. If any of the requested
     *         attributes are not projected into the local secondary index,
     *         DynamoDB will fetch each of these attributes from the parent
     *         table. This extra fetching incurs additional throughput cost and
     *         latency.
     *         </p>
     *         <p>
     *         If you query or scan a global secondary index, you can only
     *         request attributes that are projected into the index. Global
     *         secondary index queries cannot fetch attributes from the parent
     *         table.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If neither <code>Select</code> nor <code>AttributesToGet</code>
     *         are specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code>
     *         when accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code>
     *         when accessing an index. You cannot use both <code>Select</code>
     *         and <code>AttributesToGet</code> together in a single request,
     *         unless the value for <code>Select</code> is
     *         <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *         specifying <code>AttributesToGet</code> without any value for
     *         <code>Select</code>.)
     *         </p>
     *         <note>
     *         <p>
     *         If you use the <code>ProjectionExpression</code> parameter, then
     *         the value for <code>Select</code> can only be
     *         <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *         <code>Select</code> will return an error.
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
     * <code>AttributesToGet</code>. This return value is equivalent to
     * specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the local secondary index, DynamoDB will fetch each of
     * these attributes from the parent table. This extra fetching incurs
     * additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request
     * attributes that are projected into the index. Global secondary index
     * queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <code>Select</code> and
     * <code>AttributesToGet</code> together in a single request, unless the
     * value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     * usage is equivalent to specifying <code>AttributesToGet</code> without
     * any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the
     * value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code>
     * will return an error.
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
     *            listed in <code>AttributesToGet</code>. This return value is
     *            equivalent to specifying <code>AttributesToGet</code> without
     *            specifying any value for <code>Select</code>.
     *            </p>
     *            <p>
     *            If you query or scan a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query or scan a global secondary index, you can only
     *            request attributes that are projected into the index. Global
     *            secondary index queries cannot fetch attributes from the
     *            parent table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If neither <code>Select</code> nor
     *            <code>AttributesToGet</code> are specified, DynamoDB defaults
     *            to <code>ALL_ATTRIBUTES</code> when accessing a table, and
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index.
     *            You cannot use both <code>Select</code> and
     *            <code>AttributesToGet</code> together in a single request,
     *            unless the value for <code>Select</code> is
     *            <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *            specifying <code>AttributesToGet</code> without any value for
     *            <code>Select</code>.)
     *            </p>
     *            <note>
     *            <p>
     *            If you use the <code>ProjectionExpression</code> parameter,
     *            then the value for <code>Select</code> can only be
     *            <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *            <code>Select</code> will return an error.
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
     * <code>AttributesToGet</code>. This return value is equivalent to
     * specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the local secondary index, DynamoDB will fetch each of
     * these attributes from the parent table. This extra fetching incurs
     * additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request
     * attributes that are projected into the index. Global secondary index
     * queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <code>Select</code> and
     * <code>AttributesToGet</code> together in a single request, unless the
     * value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     * usage is equivalent to specifying <code>AttributesToGet</code> without
     * any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the
     * value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code>
     * will return an error.
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
     *            listed in <code>AttributesToGet</code>. This return value is
     *            equivalent to specifying <code>AttributesToGet</code> without
     *            specifying any value for <code>Select</code>.
     *            </p>
     *            <p>
     *            If you query or scan a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query or scan a global secondary index, you can only
     *            request attributes that are projected into the index. Global
     *            secondary index queries cannot fetch attributes from the
     *            parent table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If neither <code>Select</code> nor
     *            <code>AttributesToGet</code> are specified, DynamoDB defaults
     *            to <code>ALL_ATTRIBUTES</code> when accessing a table, and
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index.
     *            You cannot use both <code>Select</code> and
     *            <code>AttributesToGet</code> together in a single request,
     *            unless the value for <code>Select</code> is
     *            <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *            specifying <code>AttributesToGet</code> without any value for
     *            <code>Select</code>.)
     *            </p>
     *            <note>
     *            <p>
     *            If you use the <code>ProjectionExpression</code> parameter,
     *            then the value for <code>Select</code> can only be
     *            <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *            <code>Select</code> will return an error.
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
     * <code>AttributesToGet</code>. This return value is equivalent to
     * specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the local secondary index, DynamoDB will fetch each of
     * these attributes from the parent table. This extra fetching incurs
     * additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request
     * attributes that are projected into the index. Global secondary index
     * queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <code>Select</code> and
     * <code>AttributesToGet</code> together in a single request, unless the
     * value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     * usage is equivalent to specifying <code>AttributesToGet</code> without
     * any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the
     * value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code>
     * will return an error.
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
     *            listed in <code>AttributesToGet</code>. This return value is
     *            equivalent to specifying <code>AttributesToGet</code> without
     *            specifying any value for <code>Select</code>.
     *            </p>
     *            <p>
     *            If you query or scan a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query or scan a global secondary index, you can only
     *            request attributes that are projected into the index. Global
     *            secondary index queries cannot fetch attributes from the
     *            parent table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If neither <code>Select</code> nor
     *            <code>AttributesToGet</code> are specified, DynamoDB defaults
     *            to <code>ALL_ATTRIBUTES</code> when accessing a table, and
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index.
     *            You cannot use both <code>Select</code> and
     *            <code>AttributesToGet</code> together in a single request,
     *            unless the value for <code>Select</code> is
     *            <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *            specifying <code>AttributesToGet</code> without any value for
     *            <code>Select</code>.)
     *            </p>
     *            <note>
     *            <p>
     *            If you use the <code>ProjectionExpression</code> parameter,
     *            then the value for <code>Select</code> can only be
     *            <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *            <code>Select</code> will return an error.
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
     * <code>AttributesToGet</code>. This return value is equivalent to
     * specifying <code>AttributesToGet</code> without specifying any value for
     * <code>Select</code>.
     * </p>
     * <p>
     * If you query or scan a local secondary index and request only attributes
     * that are projected into that index, the operation will read only the
     * index and not the table. If any of the requested attributes are not
     * projected into the local secondary index, DynamoDB will fetch each of
     * these attributes from the parent table. This extra fetching incurs
     * additional throughput cost and latency.
     * </p>
     * <p>
     * If you query or scan a global secondary index, you can only request
     * attributes that are projected into the index. Global secondary index
     * queries cannot fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <code>Select</code> nor <code>AttributesToGet</code> are
     * specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     * accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     * accessing an index. You cannot use both <code>Select</code> and
     * <code>AttributesToGet</code> together in a single request, unless the
     * value for <code>Select</code> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     * usage is equivalent to specifying <code>AttributesToGet</code> without
     * any value for <code>Select</code>.)
     * </p>
     * <note>
     * <p>
     * If you use the <code>ProjectionExpression</code> parameter, then the
     * value for <code>Select</code> can only be
     * <code>SPECIFIC_ATTRIBUTES</code>. Any other value for <code>Select</code>
     * will return an error.
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
     *            listed in <code>AttributesToGet</code>. This return value is
     *            equivalent to specifying <code>AttributesToGet</code> without
     *            specifying any value for <code>Select</code>.
     *            </p>
     *            <p>
     *            If you query or scan a local secondary index and request only
     *            attributes that are projected into that index, the operation
     *            will read only the index and not the table. If any of the
     *            requested attributes are not projected into the local
     *            secondary index, DynamoDB will fetch each of these attributes
     *            from the parent table. This extra fetching incurs additional
     *            throughput cost and latency.
     *            </p>
     *            <p>
     *            If you query or scan a global secondary index, you can only
     *            request attributes that are projected into the index. Global
     *            secondary index queries cannot fetch attributes from the
     *            parent table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If neither <code>Select</code> nor
     *            <code>AttributesToGet</code> are specified, DynamoDB defaults
     *            to <code>ALL_ATTRIBUTES</code> when accessing a table, and
     *            <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index.
     *            You cannot use both <code>Select</code> and
     *            <code>AttributesToGet</code> together in a single request,
     *            unless the value for <code>Select</code> is
     *            <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to
     *            specifying <code>AttributesToGet</code> without any value for
     *            <code>Select</code>.)
     *            </p>
     *            <note>
     *            <p>
     *            If you use the <code>ProjectionExpression</code> parameter,
     *            then the value for <code>Select</code> can only be
     *            <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *            <code>Select</code> will return an error.
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
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     * continue the operation. For more information, see <a href=
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
     *         key in <code>LastEvaluatedKey</code> to apply in a subsequent
     *         operation, so that you can pick up where you left off. Also, if
     *         the processed data set size exceeds 1 MB before DynamoDB reaches
     *         this limit, it stops the operation and returns the matching
     *         values up to the limit, and a key in
     *         <code>LastEvaluatedKey</code> to apply in a subsequent operation
     *         to continue the operation. For more information, see <a href=
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
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     * continue the operation. For more information, see <a href=
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
     *            point, and a key in <code>LastEvaluatedKey</code> to apply in
     *            a subsequent operation, so that you can pick up where you left
     *            off. Also, if the processed data set size exceeds 1 MB before
     *            DynamoDB reaches this limit, it stops the operation and
     *            returns the matching values up to the limit, and a key in
     *            <code>LastEvaluatedKey</code> to apply in a subsequent
     *            operation to continue the operation. For more information, see
     *            <a href=
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
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation, so that
     * you can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     * continue the operation. For more information, see <a href=
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
     *            point, and a key in <code>LastEvaluatedKey</code> to apply in
     *            a subsequent operation, so that you can pick up where you left
     *            off. Also, if the processed data set size exceeds 1 MB before
     *            DynamoDB reaches this limit, it stops the operation and
     *            returns the matching values up to the limit, and a key in
     *            <code>LastEvaluatedKey</code> to apply in a subsequent
     *            operation to continue the operation. For more information, see
     *            <a href=
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
     * If you query a global secondary index with <code>ConsistentRead</code>
     * set to <code>true</code>, you will receive a
     * <code>ValidationException</code>.
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
     *         <code>ConsistentRead</code> set to <code>true</code>, you will
     *         receive a <code>ValidationException</code>.
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
     * If you query a global secondary index with <code>ConsistentRead</code>
     * set to <code>true</code>, you will receive a
     * <code>ValidationException</code>.
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
     *         <code>ConsistentRead</code> set to <code>true</code>, you will
     *         receive a <code>ValidationException</code>.
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
     * If you query a global secondary index with <code>ConsistentRead</code>
     * set to <code>true</code>, you will receive a
     * <code>ValidationException</code>.
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
     *            <code>ConsistentRead</code> set to <code>true</code>, you will
     *            receive a <code>ValidationException</code>.
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
     * If you query a global secondary index with <code>ConsistentRead</code>
     * set to <code>true</code>, you will receive a
     * <code>ValidationException</code>.
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
     *            <code>ConsistentRead</code> set to <code>true</code>, you will
     *            receive a <code>ValidationException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>KeyConditionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     * >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         This is a legacy parameter. Use
     *         <code>KeyConditionExpression</code> instead. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     *         >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     */
    public java.util.Map<String, Condition> getKeyConditions() {
        return keyConditions;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>KeyConditionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     * >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param keyConditions <p>
     *            This is a legacy parameter. Use
     *            <code>KeyConditionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     *            >KeyConditions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setKeyConditions(java.util.Map<String, Condition> keyConditions) {
        this.keyConditions = keyConditions;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>KeyConditionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     * >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyConditions <p>
     *            This is a legacy parameter. Use
     *            <code>KeyConditionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     *            >KeyConditions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withKeyConditions(java.util.Map<String, Condition> keyConditions) {
        this.keyConditions = keyConditions;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>KeyConditionExpression</code>
     * instead. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.KeyConditions.html"
     * >KeyConditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
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
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     * >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         This is a legacy parameter. Use <code>FilterExpression</code>
     *         instead. For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     *         >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     */
    public java.util.Map<String, Condition> getQueryFilter() {
        return queryFilter;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     * >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param queryFilter <p>
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     *            >QueryFilter</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setQueryFilter(java.util.Map<String, Condition> queryFilter) {
        this.queryFilter = queryFilter;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     * >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryFilter <p>
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     *            >QueryFilter</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryRequest withQueryFilter(java.util.Map<String, Condition> queryFilter) {
        this.queryFilter = queryFilter;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.QueryFilter.html"
     * >QueryFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
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
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @return <p>
     *         This is a legacy parameter. Use <code>FilterExpression</code>
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
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <p>
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
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
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
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
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *            >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConditionalOperator
     */
    public QueryRequest withConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     * >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AND, OR
     *
     * @param conditionalOperator <p>
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
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
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
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
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ConditionalOperator.html"
     *            >ConditionalOperator</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
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
     * numeric order. For type String, the results are stored in order of UTF-8
     * bytes. For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns
     * the results in the order in which they are stored (by sort key value).
     * This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort
     * key value, and then returns the results to the client.
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
     *         are stored in order of UTF-8 bytes. For type Binary, DynamoDB
     *         treats each byte of the binary data as unsigned.
     *         </p>
     *         <p>
     *         If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB
     *         returns the results in the order in which they are stored (by
     *         sort key value). This is the default behavior. If
     *         <code>ScanIndexForward</code> is <code>false</code>, DynamoDB
     *         reads the results in reverse order by sort key value, and then
     *         returns the results to the client.
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
     * numeric order. For type String, the results are stored in order of UTF-8
     * bytes. For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns
     * the results in the order in which they are stored (by sort key value).
     * This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort
     * key value, and then returns the results to the client.
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
     *         are stored in order of UTF-8 bytes. For type Binary, DynamoDB
     *         treats each byte of the binary data as unsigned.
     *         </p>
     *         <p>
     *         If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB
     *         returns the results in the order in which they are stored (by
     *         sort key value). This is the default behavior. If
     *         <code>ScanIndexForward</code> is <code>false</code>, DynamoDB
     *         reads the results in reverse order by sort key value, and then
     *         returns the results to the client.
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
     * numeric order. For type String, the results are stored in order of UTF-8
     * bytes. For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns
     * the results in the order in which they are stored (by sort key value).
     * This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort
     * key value, and then returns the results to the client.
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
     *            results are stored in order of UTF-8 bytes. For type Binary,
     *            DynamoDB treats each byte of the binary data as unsigned.
     *            </p>
     *            <p>
     *            If <code>ScanIndexForward</code> is <code>true</code>,
     *            DynamoDB returns the results in the order in which they are
     *            stored (by sort key value). This is the default behavior. If
     *            <code>ScanIndexForward</code> is <code>false</code>, DynamoDB
     *            reads the results in reverse order by sort key value, and then
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
     * numeric order. For type String, the results are stored in order of UTF-8
     * bytes. For type Binary, DynamoDB treats each byte of the binary data as
     * unsigned.
     * </p>
     * <p>
     * If <code>ScanIndexForward</code> is <code>true</code>, DynamoDB returns
     * the results in the order in which they are stored (by sort key value).
     * This is the default behavior. If <code>ScanIndexForward</code> is
     * <code>false</code>, DynamoDB reads the results in reverse order by sort
     * key value, and then returns the results to the client.
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
     *            results are stored in order of UTF-8 bytes. For type Binary,
     *            DynamoDB treats each byte of the binary data as unsigned.
     *            </p>
     *            <p>
     *            If <code>ScanIndexForward</code> is <code>true</code>,
     *            DynamoDB returns the results in the order in which they are
     *            stored (by sort key value). This is the default behavior. If
     *            <code>ScanIndexForward</code> is <code>false</code>, DynamoDB
     *            reads the results in reverse order by sort key value, and then
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
     * the value that was returned for <code>LastEvaluatedKey</code> in the
     * previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number
     * or Binary. No set data types are allowed.
     * </p>
     *
     * @return <p>
     *         The primary key of the first item that this operation will
     *         evaluate. Use the value that was returned for
     *         <code>LastEvaluatedKey</code> in the previous operation.
     *         </p>
     *         <p>
     *         The data type for <code>ExclusiveStartKey</code> must be String,
     *         Number or Binary. No set data types are allowed.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <code>LastEvaluatedKey</code> in the
     * previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number
     * or Binary. No set data types are allowed.
     * </p>
     *
     * @param exclusiveStartKey <p>
     *            The primary key of the first item that this operation will
     *            evaluate. Use the value that was returned for
     *            <code>LastEvaluatedKey</code> in the previous operation.
     *            </p>
     *            <p>
     *            The data type for <code>ExclusiveStartKey</code> must be
     *            String, Number or Binary. No set data types are allowed.
     *            </p>
     */
    public void setExclusiveStartKey(java.util.Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <code>LastEvaluatedKey</code> in the
     * previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number
     * or Binary. No set data types are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusiveStartKey <p>
     *            The primary key of the first item that this operation will
     *            evaluate. Use the value that was returned for
     *            <code>LastEvaluatedKey</code> in the previous operation.
     *            </p>
     *            <p>
     *            The data type for <code>ExclusiveStartKey</code> must be
     *            String, Number or Binary. No set data types are allowed.
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
     * the value that was returned for <code>LastEvaluatedKey</code> in the
     * previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number
     * or Binary. No set data types are allowed.
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
    public QueryRequest withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <code>Query</code> operation, but before the data is returned to you.
     * Items that do not satisfy the <code>FilterExpression</code> criteria are
     * not returned.
     * </p>
     * <p>
     * A <code>FilterExpression</code> does not allow key attributes. You cannot
     * define a filter expression based on a partition key or a sort key.
     * </p>
     * <note>
     * <p>
     * A <code>FilterExpression</code> is applied after the items have already
     * been read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A string that contains conditions that DynamoDB applies after the
     *         <code>Query</code> operation, but before the data is returned to
     *         you. Items that do not satisfy the <code>FilterExpression</code>
     *         criteria are not returned.
     *         </p>
     *         <p>
     *         A <code>FilterExpression</code> does not allow key attributes.
     *         You cannot define a filter expression based on a partition key or
     *         a sort key.
     *         </p>
     *         <note>
     *         <p>
     *         A <code>FilterExpression</code> is applied after the items have
     *         already been read; the process of filtering does not consume any
     *         additional read capacity units.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *         >Filter Expressions</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     */
    public String getFilterExpression() {
        return filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <code>Query</code> operation, but before the data is returned to you.
     * Items that do not satisfy the <code>FilterExpression</code> criteria are
     * not returned.
     * </p>
     * <p>
     * A <code>FilterExpression</code> does not allow key attributes. You cannot
     * define a filter expression based on a partition key or a sort key.
     * </p>
     * <note>
     * <p>
     * A <code>FilterExpression</code> is applied after the items have already
     * been read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param filterExpression <p>
     *            A string that contains conditions that DynamoDB applies after
     *            the <code>Query</code> operation, but before the data is
     *            returned to you. Items that do not satisfy the
     *            <code>FilterExpression</code> criteria are not returned.
     *            </p>
     *            <p>
     *            A <code>FilterExpression</code> does not allow key attributes.
     *            You cannot define a filter expression based on a partition key
     *            or a sort key.
     *            </p>
     *            <note>
     *            <p>
     *            A <code>FilterExpression</code> is applied after the items
     *            have already been read; the process of filtering does not
     *            consume any additional read capacity units.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *            >Filter Expressions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <code>Query</code> operation, but before the data is returned to you.
     * Items that do not satisfy the <code>FilterExpression</code> criteria are
     * not returned.
     * </p>
     * <p>
     * A <code>FilterExpression</code> does not allow key attributes. You cannot
     * define a filter expression based on a partition key or a sort key.
     * </p>
     * <note>
     * <p>
     * A <code>FilterExpression</code> is applied after the items have already
     * been read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterExpression <p>
     *            A string that contains conditions that DynamoDB applies after
     *            the <code>Query</code> operation, but before the data is
     *            returned to you. Items that do not satisfy the
     *            <code>FilterExpression</code> criteria are not returned.
     *            </p>
     *            <p>
     *            A <code>FilterExpression</code> does not allow key attributes.
     *            You cannot define a filter expression based on a partition key
     *            or a sort key.
     *            </p>
     *            <note>
     *            <p>
     *            A <code>FilterExpression</code> is applied after the items
     *            have already been read; the process of filtering does not
     *            consume any additional read capacity units.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *            >Filter Expressions</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
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
     * by the <code>Query</code> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value.
     * </p>
     * <p>
     * The condition can optionally perform one of several comparison tests on a
     * single sort key value. This allows <code>Query</code> to retrieve one
     * item with a given partition key value and sort key value, or several
     * items that have the same partition key value but different sort key
     * values.
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
     * combined using <code>AND</code> with the condition for the sort key.
     * Following is an example, using the <b>=</b> comparison operator for the
     * sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <code>=</code>
     * <code>:partitionkeyval</code> <code>AND</code> <code>sortKeyName</code>
     * <code>=</code> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true
     * if the sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> -
     * true if the sort key value is less than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> -
     * true if the sort key value is less than or equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> -
     * true if the sort key value is greater than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> -
     * true if the sort key value is greater than or equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code>
     * <code>AND</code> <code>:sortkeyval2</code> - true if the sort key value
     * is greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>begins_with (</code> <code>sortKeyName</code>,
     * <code>:sortkeyval</code> <code>)</code> - true if the sort key value
     * begins with a particular operand. (You cannot use this function with a
     * sort key that is of type Number.) Note that the function name
     * <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>ExpressionAttributeValues</code> parameter to replace
     * tokens such as <code>:partitionval</code> and <code>:sortval</code> with
     * actual values at runtime.
     * </p>
     * <p>
     * You can optionally use the <code>ExpressionAttributeNames</code>
     * parameter to replace the names of the partition key and sort key with
     * placeholder tokens. This option might be necessary if an attribute name
     * conflicts with a DynamoDB reserved word. For example, the following
     * <code>KeyConditionExpression</code> parameter causes an error because
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
     * represent the attribute name <i>Size</i>.
     * <code>KeyConditionExpression</code> then is as follows:
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
     * For more information on <code>ExpressionAttributeNames</code> and
     * <code>ExpressionAttributeValues</code>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The condition that specifies the key value(s) for items to be
     *         retrieved by the <code>Query</code> action.
     *         </p>
     *         <p>
     *         The condition must perform an equality test on a single partition
     *         key value.
     *         </p>
     *         <p>
     *         The condition can optionally perform one of several comparison
     *         tests on a single sort key value. This allows <code>Query</code>
     *         to retrieve one item with a given partition key value and sort
     *         key value, or several items that have the same partition key
     *         value but different sort key values.
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
     *         be combined using <code>AND</code> with the condition for the
     *         sort key. Following is an example, using the <b>=</b> comparison
     *         operator for the sort key:
     *         </p>
     *         <p>
     *         <code>partitionKeyName</code> <code>=</code>
     *         <code>:partitionkeyval</code> <code>AND</code>
     *         <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code>
     *         </p>
     *         <p>
     *         Valid comparisons for the sort key condition are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code>
     *         - true if the sort key value is equal to <code>:sortkeyval</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>&lt;</code>
     *         <code>:sortkeyval</code> - true if the sort key value is less
     *         than <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>&lt;=</code>
     *         <code>:sortkeyval</code> - true if the sort key value is less
     *         than or equal to <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>&gt;</code>
     *         <code>:sortkeyval</code> - true if the sort key value is greater
     *         than <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>&gt;= </code>
     *         <code>:sortkeyval</code> - true if the sort key value is greater
     *         than or equal to <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <code>BETWEEN</code>
     *         <code>:sortkeyval1</code> <code>AND</code>
     *         <code>:sortkeyval2</code> - true if the sort key value is greater
     *         than or equal to <code>:sortkeyval1</code>, and less than or
     *         equal to <code>:sortkeyval2</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>begins_with (</code> <code>sortKeyName</code>,
     *         <code>:sortkeyval</code> <code>)</code> - true if the sort key
     *         value begins with a particular operand. (You cannot use this
     *         function with a sort key that is of type Number.) Note that the
     *         function name <code>begins_with</code> is case-sensitive.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use the <code>ExpressionAttributeValues</code> parameter to
     *         replace tokens such as <code>:partitionval</code> and
     *         <code>:sortval</code> with actual values at runtime.
     *         </p>
     *         <p>
     *         You can optionally use the <code>ExpressionAttributeNames</code>
     *         parameter to replace the names of the partition key and sort key
     *         with placeholder tokens. This option might be necessary if an
     *         attribute name conflicts with a DynamoDB reserved word. For
     *         example, the following <code>KeyConditionExpression</code>
     *         parameter causes an error because <i>Size</i> is a reserved word:
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
     *         <code>KeyConditionExpression</code> then is as follows:
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
     *         For more information on <code>ExpressionAttributeNames</code> and
     *         <code>ExpressionAttributeValues</code>, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     *         >Using Placeholders for Attribute Names and Values</a> in the
     *         <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     */
    public String getKeyConditionExpression() {
        return keyConditionExpression;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <code>Query</code> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value.
     * </p>
     * <p>
     * The condition can optionally perform one of several comparison tests on a
     * single sort key value. This allows <code>Query</code> to retrieve one
     * item with a given partition key value and sort key value, or several
     * items that have the same partition key value but different sort key
     * values.
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
     * combined using <code>AND</code> with the condition for the sort key.
     * Following is an example, using the <b>=</b> comparison operator for the
     * sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <code>=</code>
     * <code>:partitionkeyval</code> <code>AND</code> <code>sortKeyName</code>
     * <code>=</code> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true
     * if the sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> -
     * true if the sort key value is less than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> -
     * true if the sort key value is less than or equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> -
     * true if the sort key value is greater than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> -
     * true if the sort key value is greater than or equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code>
     * <code>AND</code> <code>:sortkeyval2</code> - true if the sort key value
     * is greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>begins_with (</code> <code>sortKeyName</code>,
     * <code>:sortkeyval</code> <code>)</code> - true if the sort key value
     * begins with a particular operand. (You cannot use this function with a
     * sort key that is of type Number.) Note that the function name
     * <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>ExpressionAttributeValues</code> parameter to replace
     * tokens such as <code>:partitionval</code> and <code>:sortval</code> with
     * actual values at runtime.
     * </p>
     * <p>
     * You can optionally use the <code>ExpressionAttributeNames</code>
     * parameter to replace the names of the partition key and sort key with
     * placeholder tokens. This option might be necessary if an attribute name
     * conflicts with a DynamoDB reserved word. For example, the following
     * <code>KeyConditionExpression</code> parameter causes an error because
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
     * represent the attribute name <i>Size</i>.
     * <code>KeyConditionExpression</code> then is as follows:
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
     * For more information on <code>ExpressionAttributeNames</code> and
     * <code>ExpressionAttributeValues</code>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param keyConditionExpression <p>
     *            The condition that specifies the key value(s) for items to be
     *            retrieved by the <code>Query</code> action.
     *            </p>
     *            <p>
     *            The condition must perform an equality test on a single
     *            partition key value.
     *            </p>
     *            <p>
     *            The condition can optionally perform one of several comparison
     *            tests on a single sort key value. This allows
     *            <code>Query</code> to retrieve one item with a given partition
     *            key value and sort key value, or several items that have the
     *            same partition key value but different sort key values.
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
     *            must be combined using <code>AND</code> with the condition for
     *            the sort key. Following is an example, using the <b>=</b>
     *            comparison operator for the sort key:
     *            </p>
     *            <p>
     *            <code>partitionKeyName</code> <code>=</code>
     *            <code>:partitionkeyval</code> <code>AND</code>
     *            <code>sortKeyName</code> <code>=</code>
     *            <code>:sortkeyval</code>
     *            </p>
     *            <p>
     *            Valid comparisons for the sort key condition are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>=</code>
     *            <code>:sortkeyval</code> - true if the sort key value is equal
     *            to <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>&lt;</code>
     *            <code>:sortkeyval</code> - true if the sort key value is less
     *            than <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>&lt;=</code>
     *            <code>:sortkeyval</code> - true if the sort key value is less
     *            than or equal to <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>&gt;</code>
     *            <code>:sortkeyval</code> - true if the sort key value is
     *            greater than <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>&gt;= </code>
     *            <code>:sortkeyval</code> - true if the sort key value is
     *            greater than or equal to <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>BETWEEN</code>
     *            <code>:sortkeyval1</code> <code>AND</code>
     *            <code>:sortkeyval2</code> - true if the sort key value is
     *            greater than or equal to <code>:sortkeyval1</code>, and less
     *            than or equal to <code>:sortkeyval2</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>begins_with (</code> <code>sortKeyName</code>,
     *            <code>:sortkeyval</code> <code>)</code> - true if the sort key
     *            value begins with a particular operand. (You cannot use this
     *            function with a sort key that is of type Number.) Note that
     *            the function name <code>begins_with</code> is case-sensitive.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use the <code>ExpressionAttributeValues</code> parameter to
     *            replace tokens such as <code>:partitionval</code> and
     *            <code>:sortval</code> with actual values at runtime.
     *            </p>
     *            <p>
     *            You can optionally use the
     *            <code>ExpressionAttributeNames</code> parameter to replace the
     *            names of the partition key and sort key with placeholder
     *            tokens. This option might be necessary if an attribute name
     *            conflicts with a DynamoDB reserved word. For example, the
     *            following <code>KeyConditionExpression</code> parameter causes
     *            an error because <i>Size</i> is a reserved word:
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
     *            <code>KeyConditionExpression</code> then is as follows:
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
     *            For more information on <code>ExpressionAttributeNames</code>
     *            and <code>ExpressionAttributeValues</code>, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     *            >Using Placeholders for Attribute Names and Values</a> in the
     *            <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setKeyConditionExpression(String keyConditionExpression) {
        this.keyConditionExpression = keyConditionExpression;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <code>Query</code> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value.
     * </p>
     * <p>
     * The condition can optionally perform one of several comparison tests on a
     * single sort key value. This allows <code>Query</code> to retrieve one
     * item with a given partition key value and sort key value, or several
     * items that have the same partition key value but different sort key
     * values.
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
     * combined using <code>AND</code> with the condition for the sort key.
     * Following is an example, using the <b>=</b> comparison operator for the
     * sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <code>=</code>
     * <code>:partitionkeyval</code> <code>AND</code> <code>sortKeyName</code>
     * <code>=</code> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>=</code> <code>:sortkeyval</code> - true
     * if the sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;</code> <code>:sortkeyval</code> -
     * true if the sort key value is less than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&lt;=</code> <code>:sortkeyval</code> -
     * true if the sort key value is less than or equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;</code> <code>:sortkeyval</code> -
     * true if the sort key value is greater than <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>&gt;= </code> <code>:sortkeyval</code> -
     * true if the sort key value is greater than or equal to
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <code>BETWEEN</code> <code>:sortkeyval1</code>
     * <code>AND</code> <code>:sortkeyval2</code> - true if the sort key value
     * is greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>begins_with (</code> <code>sortKeyName</code>,
     * <code>:sortkeyval</code> <code>)</code> - true if the sort key value
     * begins with a particular operand. (You cannot use this function with a
     * sort key that is of type Number.) Note that the function name
     * <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>ExpressionAttributeValues</code> parameter to replace
     * tokens such as <code>:partitionval</code> and <code>:sortval</code> with
     * actual values at runtime.
     * </p>
     * <p>
     * You can optionally use the <code>ExpressionAttributeNames</code>
     * parameter to replace the names of the partition key and sort key with
     * placeholder tokens. This option might be necessary if an attribute name
     * conflicts with a DynamoDB reserved word. For example, the following
     * <code>KeyConditionExpression</code> parameter causes an error because
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
     * represent the attribute name <i>Size</i>.
     * <code>KeyConditionExpression</code> then is as follows:
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
     * For more information on <code>ExpressionAttributeNames</code> and
     * <code>ExpressionAttributeValues</code>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyConditionExpression <p>
     *            The condition that specifies the key value(s) for items to be
     *            retrieved by the <code>Query</code> action.
     *            </p>
     *            <p>
     *            The condition must perform an equality test on a single
     *            partition key value.
     *            </p>
     *            <p>
     *            The condition can optionally perform one of several comparison
     *            tests on a single sort key value. This allows
     *            <code>Query</code> to retrieve one item with a given partition
     *            key value and sort key value, or several items that have the
     *            same partition key value but different sort key values.
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
     *            must be combined using <code>AND</code> with the condition for
     *            the sort key. Following is an example, using the <b>=</b>
     *            comparison operator for the sort key:
     *            </p>
     *            <p>
     *            <code>partitionKeyName</code> <code>=</code>
     *            <code>:partitionkeyval</code> <code>AND</code>
     *            <code>sortKeyName</code> <code>=</code>
     *            <code>:sortkeyval</code>
     *            </p>
     *            <p>
     *            Valid comparisons for the sort key condition are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>=</code>
     *            <code>:sortkeyval</code> - true if the sort key value is equal
     *            to <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>&lt;</code>
     *            <code>:sortkeyval</code> - true if the sort key value is less
     *            than <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>&lt;=</code>
     *            <code>:sortkeyval</code> - true if the sort key value is less
     *            than or equal to <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>&gt;</code>
     *            <code>:sortkeyval</code> - true if the sort key value is
     *            greater than <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>&gt;= </code>
     *            <code>:sortkeyval</code> - true if the sort key value is
     *            greater than or equal to <code>:sortkeyval</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sortKeyName</code> <code>BETWEEN</code>
     *            <code>:sortkeyval1</code> <code>AND</code>
     *            <code>:sortkeyval2</code> - true if the sort key value is
     *            greater than or equal to <code>:sortkeyval1</code>, and less
     *            than or equal to <code>:sortkeyval2</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>begins_with (</code> <code>sortKeyName</code>,
     *            <code>:sortkeyval</code> <code>)</code> - true if the sort key
     *            value begins with a particular operand. (You cannot use this
     *            function with a sort key that is of type Number.) Note that
     *            the function name <code>begins_with</code> is case-sensitive.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use the <code>ExpressionAttributeValues</code> parameter to
     *            replace tokens such as <code>:partitionval</code> and
     *            <code>:sortval</code> with actual values at runtime.
     *            </p>
     *            <p>
     *            You can optionally use the
     *            <code>ExpressionAttributeNames</code> parameter to replace the
     *            names of the partition key and sort key with placeholder
     *            tokens. This option might be necessary if an attribute name
     *            conflicts with a DynamoDB reserved word. For example, the
     *            following <code>KeyConditionExpression</code> parameter causes
     *            an error because <i>Size</i> is a reserved word:
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
     *            <code>KeyConditionExpression</code> then is as follows:
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
     *            For more information on <code>ExpressionAttributeNames</code>
     *            and <code>ExpressionAttributeValues</code>, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     *            >Using Placeholders for Attribute Names and Values</a> in the
     *            <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
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
    public QueryRequest withExpressionAttributeNames(
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
