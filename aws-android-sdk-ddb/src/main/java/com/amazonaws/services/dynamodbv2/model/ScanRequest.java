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
 * The <code>Scan</code> operation returns one or more items and item attributes
 * by accessing every item in a table or a secondary index. To have DynamoDB
 * return fewer items, you can provide a <code>FilterExpression</code>
 * operation.
 * </p>
 * <p>
 * If the total number of scanned items exceeds the maximum data set size limit
 * of 1 MB, the scan stops and results are returned to the user as a
 * <code>LastEvaluatedKey</code> value to continue the scan in a subsequent
 * operation. The results also include the number of items exceeding the limit.
 * A scan can result in no table data meeting the filter criteria.
 * </p>
 * <p>
 * A single <code>Scan</code> operation will read up to the maximum number of
 * items set (if using the <code>Limit</code> parameter) or a maximum of 1 MB of
 * data and then apply any filtering to the results using
 * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is present in
 * the response, you will need to paginate the result set. For more information,
 * see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.Pagination"
 * >Paginating the Results</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * <code>Scan</code> operations proceed sequentially; however, for faster
 * performance on a large table or secondary index, applications can request a
 * parallel <code>Scan</code> operation by providing the <code>Segment</code>
 * and <code>TotalSegments</code> parameters. For more information, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.ParallelScan"
 * >Parallel Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * <code>Scan</code> uses eventually consistent reads when accessing the data in
 * a table; therefore, the result set might not include the changes to data in
 * the table immediately before the operation began. If you need a consistent
 * copy of the data, as of the time that the <code>Scan</code> begins, you can
 * set the <code>ConsistentRead</code> parameter to <code>true</code>.
 * </p>
 */
public class ScanRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the table containing the requested items; or, if you provide
     * <code>IndexName</code>, the name of the table to which that index
     * belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * The name of a secondary index to scan. This index can be any local
     * secondary index or global secondary index. Note that if you use the
     * <code>IndexName</code> parameter, you must also provide
     * <code>TableName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

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
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     * >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, Condition> scanFilter;

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
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <code>LastEvaluatedKey</code> in the
     * previous operation.
     * </p>
     * <p>
     * The data type for <code>ExclusiveStartKey</code> must be String, Number
     * or Binary. No set data types are allowed.
     * </p>
     * <p>
     * In a parallel scan, a <code>Scan</code> request that includes
     * <code>ExclusiveStartKey</code> must specify the same segment whose
     * previous <code>Scan</code> returned the corresponding value of
     * <code>LastEvaluatedKey</code>.
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
     * For a parallel <code>Scan</code> request, <code>TotalSegments</code>
     * represents the total number of segments into which the <code>Scan</code>
     * operation will be divided. The value of <code>TotalSegments</code>
     * corresponds to the number of application workers that will perform the
     * parallel scan. For example, if you want to use four application threads
     * to scan a table or an index, specify a <code>TotalSegments</code> value
     * of 4.
     * </p>
     * <p>
     * The value for <code>TotalSegments</code> must be greater than or equal to
     * 1, and less than or equal to 1000000. If you specify a
     * <code>TotalSegments</code> value of 1, the <code>Scan</code> operation
     * will be sequential rather than parallel.
     * </p>
     * <p>
     * If you specify <code>TotalSegments</code>, you must also specify
     * <code>Segment</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000000<br/>
     */
    private Integer totalSegments;

    /**
     * <p>
     * For a parallel <code>Scan</code> request, <code>Segment</code> identifies
     * an individual segment to be scanned by an application worker.
     * </p>
     * <p>
     * Segment IDs are zero-based, so the first segment is always 0. For
     * example, if you want to use four application threads to scan a table or
     * an index, then the first thread specifies a <code>Segment</code> value of
     * 0, the second thread specifies 1, and so on.
     * </p>
     * <p>
     * The value of <code>LastEvaluatedKey</code> returned from a parallel
     * <code>Scan</code> request must be used as <code>ExclusiveStartKey</code>
     * with the same segment ID in a subsequent <code>Scan</code> operation.
     * </p>
     * <p>
     * The value for <code>Segment</code> must be greater than or equal to 0,
     * and less than the value provided for <code>TotalSegments</code>.
     * </p>
     * <p>
     * If you provide <code>Segment</code>, you must also provide
     * <code>TotalSegments</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999999<br/>
     */
    private Integer segment;

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * specified table or index. These attributes can include scalars, sets, or
     * elements of a JSON document. The attributes in the expression must be
     * separated by commas.
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
     * <code>Scan</code> operation, but before the data is returned to you.
     * Items that do not satisfy the <code>FilterExpression</code> criteria are
     * not returned.
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
     * <p>
     * A Boolean value that determines the read consistency model during the
     * scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>false</code>, then the data
     * returned from <code>Scan</code> might not contain the results from other
     * recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>true</code>, then all of the
     * write operations that completed before the <code>Scan</code> began are
     * guaranteed to be contained in the <code>Scan</code> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <code>ConsistentRead</code> is <code>false</code>
     * .
     * </p>
     * <p>
     * The <code>ConsistentRead</code> parameter is not supported on global
     * secondary indexes. If you scan a global secondary index with
     * <code>ConsistentRead</code> set to true, you will receive a
     * <code>ValidationException</code>.
     * </p>
     */
    private Boolean consistentRead;

    /**
     * Default constructor for ScanRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     */
    public ScanRequest() {
    }

    /**
     * Constructs a new ScanRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName <p>
     *            The name of the table containing the requested items; or, if
     *            you provide <code>IndexName</code>, the name of the table to
     *            which that index belongs.
     *            </p>
     */
    public ScanRequest(String tableName) {
        setTableName(tableName);
    }

    /**
     * <p>
     * The name of the table containing the requested items; or, if you provide
     * <code>IndexName</code>, the name of the table to which that index
     * belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table containing the requested items; or, if you
     *         provide <code>IndexName</code>, the name of the table to which
     *         that index belongs.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items; or, if you provide
     * <code>IndexName</code>, the name of the table to which that index
     * belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table containing the requested items; or, if
     *            you provide <code>IndexName</code>, the name of the table to
     *            which that index belongs.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items; or, if you provide
     * <code>IndexName</code>, the name of the table to which that index
     * belongs.
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
     *            The name of the table containing the requested items; or, if
     *            you provide <code>IndexName</code>, the name of the table to
     *            which that index belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The name of a secondary index to scan. This index can be any local
     * secondary index or global secondary index. Note that if you use the
     * <code>IndexName</code> parameter, you must also provide
     * <code>TableName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of a secondary index to scan. This index can be any
     *         local secondary index or global secondary index. Note that if you
     *         use the <code>IndexName</code> parameter, you must also provide
     *         <code>TableName</code>.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of a secondary index to scan. This index can be any local
     * secondary index or global secondary index. Note that if you use the
     * <code>IndexName</code> parameter, you must also provide
     * <code>TableName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of a secondary index to scan. This index can be any
     *            local secondary index or global secondary index. Note that if
     *            you use the <code>IndexName</code> parameter, you must also
     *            provide <code>TableName</code>.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of a secondary index to scan. This index can be any local
     * secondary index or global secondary index. Note that if you use the
     * <code>IndexName</code> parameter, you must also provide
     * <code>TableName</code>.
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
     *            The name of a secondary index to scan. This index can be any
     *            local secondary index or global secondary index. Note that if
     *            you use the <code>IndexName</code> parameter, you must also
     *            provide <code>TableName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRequest withIndexName(String indexName) {
        this.indexName = indexName;
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
    public ScanRequest withAttributesToGet(String... attributesToGet) {
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
    public ScanRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
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
    public ScanRequest withLimit(Integer limit) {
        this.limit = limit;
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
    public ScanRequest withSelect(String select) {
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
    public ScanRequest withSelect(Select select) {
        this.select = select.toString();
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     * >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         This is a legacy parameter. Use <code>FilterExpression</code>
     *         instead. For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     *         >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     */
    public java.util.Map<String, Condition> getScanFilter() {
        return scanFilter;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     * >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param scanFilter <p>
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     *            >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setScanFilter(java.util.Map<String, Condition> scanFilter) {
        this.scanFilter = scanFilter;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     * >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scanFilter <p>
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     *            >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRequest withScanFilter(java.util.Map<String, Condition> scanFilter) {
        this.scanFilter = scanFilter;
        return this;
    }

    /**
     * <p>
     * This is a legacy parameter. Use <code>FilterExpression</code> instead.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     * >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into ScanFilter parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ScanFilter.
     * @param value The corresponding value of the entry to be added into
     *            ScanFilter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRequest addScanFilterEntry(String key, Condition value) {
        if (null == this.scanFilter) {
            this.scanFilter = new java.util.HashMap<String, Condition>();
        }
        if (this.scanFilter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.scanFilter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ScanFilter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ScanRequest clearScanFilterEntries() {
        this.scanFilter = null;
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
    public ScanRequest withConditionalOperator(String conditionalOperator) {
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
    public ScanRequest withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
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
     * In a parallel scan, a <code>Scan</code> request that includes
     * <code>ExclusiveStartKey</code> must specify the same segment whose
     * previous <code>Scan</code> returned the corresponding value of
     * <code>LastEvaluatedKey</code>.
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
     *         <p>
     *         In a parallel scan, a <code>Scan</code> request that includes
     *         <code>ExclusiveStartKey</code> must specify the same segment
     *         whose previous <code>Scan</code> returned the corresponding value
     *         of <code>LastEvaluatedKey</code>.
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
     * <p>
     * In a parallel scan, a <code>Scan</code> request that includes
     * <code>ExclusiveStartKey</code> must specify the same segment whose
     * previous <code>Scan</code> returned the corresponding value of
     * <code>LastEvaluatedKey</code>.
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
     *            <p>
     *            In a parallel scan, a <code>Scan</code> request that includes
     *            <code>ExclusiveStartKey</code> must specify the same segment
     *            whose previous <code>Scan</code> returned the corresponding
     *            value of <code>LastEvaluatedKey</code>.
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
     * In a parallel scan, a <code>Scan</code> request that includes
     * <code>ExclusiveStartKey</code> must specify the same segment whose
     * previous <code>Scan</code> returned the corresponding value of
     * <code>LastEvaluatedKey</code>.
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
     *            <p>
     *            In a parallel scan, a <code>Scan</code> request that includes
     *            <code>ExclusiveStartKey</code> must specify the same segment
     *            whose previous <code>Scan</code> returned the corresponding
     *            value of <code>LastEvaluatedKey</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRequest withExclusiveStartKey(java.util.Map<String, AttributeValue> exclusiveStartKey) {
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
     * In a parallel scan, a <code>Scan</code> request that includes
     * <code>ExclusiveStartKey</code> must specify the same segment whose
     * previous <code>Scan</code> returned the corresponding value of
     * <code>LastEvaluatedKey</code>.
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
    public ScanRequest addExclusiveStartKeyEntry(String key, AttributeValue value) {
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
    public ScanRequest clearExclusiveStartKeyEntries() {
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
    public ScanRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public ScanRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * <p>
     * For a parallel <code>Scan</code> request, <code>TotalSegments</code>
     * represents the total number of segments into which the <code>Scan</code>
     * operation will be divided. The value of <code>TotalSegments</code>
     * corresponds to the number of application workers that will perform the
     * parallel scan. For example, if you want to use four application threads
     * to scan a table or an index, specify a <code>TotalSegments</code> value
     * of 4.
     * </p>
     * <p>
     * The value for <code>TotalSegments</code> must be greater than or equal to
     * 1, and less than or equal to 1000000. If you specify a
     * <code>TotalSegments</code> value of 1, the <code>Scan</code> operation
     * will be sequential rather than parallel.
     * </p>
     * <p>
     * If you specify <code>TotalSegments</code>, you must also specify
     * <code>Segment</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000000<br/>
     *
     * @return <p>
     *         For a parallel <code>Scan</code> request,
     *         <code>TotalSegments</code> represents the total number of
     *         segments into which the <code>Scan</code> operation will be
     *         divided. The value of <code>TotalSegments</code> corresponds to
     *         the number of application workers that will perform the parallel
     *         scan. For example, if you want to use four application threads to
     *         scan a table or an index, specify a <code>TotalSegments</code>
     *         value of 4.
     *         </p>
     *         <p>
     *         The value for <code>TotalSegments</code> must be greater than or
     *         equal to 1, and less than or equal to 1000000. If you specify a
     *         <code>TotalSegments</code> value of 1, the <code>Scan</code>
     *         operation will be sequential rather than parallel.
     *         </p>
     *         <p>
     *         If you specify <code>TotalSegments</code>, you must also specify
     *         <code>Segment</code>.
     *         </p>
     */
    public Integer getTotalSegments() {
        return totalSegments;
    }

    /**
     * <p>
     * For a parallel <code>Scan</code> request, <code>TotalSegments</code>
     * represents the total number of segments into which the <code>Scan</code>
     * operation will be divided. The value of <code>TotalSegments</code>
     * corresponds to the number of application workers that will perform the
     * parallel scan. For example, if you want to use four application threads
     * to scan a table or an index, specify a <code>TotalSegments</code> value
     * of 4.
     * </p>
     * <p>
     * The value for <code>TotalSegments</code> must be greater than or equal to
     * 1, and less than or equal to 1000000. If you specify a
     * <code>TotalSegments</code> value of 1, the <code>Scan</code> operation
     * will be sequential rather than parallel.
     * </p>
     * <p>
     * If you specify <code>TotalSegments</code>, you must also specify
     * <code>Segment</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000000<br/>
     *
     * @param totalSegments <p>
     *            For a parallel <code>Scan</code> request,
     *            <code>TotalSegments</code> represents the total number of
     *            segments into which the <code>Scan</code> operation will be
     *            divided. The value of <code>TotalSegments</code> corresponds
     *            to the number of application workers that will perform the
     *            parallel scan. For example, if you want to use four
     *            application threads to scan a table or an index, specify a
     *            <code>TotalSegments</code> value of 4.
     *            </p>
     *            <p>
     *            The value for <code>TotalSegments</code> must be greater than
     *            or equal to 1, and less than or equal to 1000000. If you
     *            specify a <code>TotalSegments</code> value of 1, the
     *            <code>Scan</code> operation will be sequential rather than
     *            parallel.
     *            </p>
     *            <p>
     *            If you specify <code>TotalSegments</code>, you must also
     *            specify <code>Segment</code>.
     *            </p>
     */
    public void setTotalSegments(Integer totalSegments) {
        this.totalSegments = totalSegments;
    }

    /**
     * <p>
     * For a parallel <code>Scan</code> request, <code>TotalSegments</code>
     * represents the total number of segments into which the <code>Scan</code>
     * operation will be divided. The value of <code>TotalSegments</code>
     * corresponds to the number of application workers that will perform the
     * parallel scan. For example, if you want to use four application threads
     * to scan a table or an index, specify a <code>TotalSegments</code> value
     * of 4.
     * </p>
     * <p>
     * The value for <code>TotalSegments</code> must be greater than or equal to
     * 1, and less than or equal to 1000000. If you specify a
     * <code>TotalSegments</code> value of 1, the <code>Scan</code> operation
     * will be sequential rather than parallel.
     * </p>
     * <p>
     * If you specify <code>TotalSegments</code>, you must also specify
     * <code>Segment</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000000<br/>
     *
     * @param totalSegments <p>
     *            For a parallel <code>Scan</code> request,
     *            <code>TotalSegments</code> represents the total number of
     *            segments into which the <code>Scan</code> operation will be
     *            divided. The value of <code>TotalSegments</code> corresponds
     *            to the number of application workers that will perform the
     *            parallel scan. For example, if you want to use four
     *            application threads to scan a table or an index, specify a
     *            <code>TotalSegments</code> value of 4.
     *            </p>
     *            <p>
     *            The value for <code>TotalSegments</code> must be greater than
     *            or equal to 1, and less than or equal to 1000000. If you
     *            specify a <code>TotalSegments</code> value of 1, the
     *            <code>Scan</code> operation will be sequential rather than
     *            parallel.
     *            </p>
     *            <p>
     *            If you specify <code>TotalSegments</code>, you must also
     *            specify <code>Segment</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRequest withTotalSegments(Integer totalSegments) {
        this.totalSegments = totalSegments;
        return this;
    }

    /**
     * <p>
     * For a parallel <code>Scan</code> request, <code>Segment</code> identifies
     * an individual segment to be scanned by an application worker.
     * </p>
     * <p>
     * Segment IDs are zero-based, so the first segment is always 0. For
     * example, if you want to use four application threads to scan a table or
     * an index, then the first thread specifies a <code>Segment</code> value of
     * 0, the second thread specifies 1, and so on.
     * </p>
     * <p>
     * The value of <code>LastEvaluatedKey</code> returned from a parallel
     * <code>Scan</code> request must be used as <code>ExclusiveStartKey</code>
     * with the same segment ID in a subsequent <code>Scan</code> operation.
     * </p>
     * <p>
     * The value for <code>Segment</code> must be greater than or equal to 0,
     * and less than the value provided for <code>TotalSegments</code>.
     * </p>
     * <p>
     * If you provide <code>Segment</code>, you must also provide
     * <code>TotalSegments</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999999<br/>
     *
     * @return <p>
     *         For a parallel <code>Scan</code> request, <code>Segment</code>
     *         identifies an individual segment to be scanned by an application
     *         worker.
     *         </p>
     *         <p>
     *         Segment IDs are zero-based, so the first segment is always 0. For
     *         example, if you want to use four application threads to scan a
     *         table or an index, then the first thread specifies a
     *         <code>Segment</code> value of 0, the second thread specifies 1,
     *         and so on.
     *         </p>
     *         <p>
     *         The value of <code>LastEvaluatedKey</code> returned from a
     *         parallel <code>Scan</code> request must be used as
     *         <code>ExclusiveStartKey</code> with the same segment ID in a
     *         subsequent <code>Scan</code> operation.
     *         </p>
     *         <p>
     *         The value for <code>Segment</code> must be greater than or equal
     *         to 0, and less than the value provided for
     *         <code>TotalSegments</code>.
     *         </p>
     *         <p>
     *         If you provide <code>Segment</code>, you must also provide
     *         <code>TotalSegments</code>.
     *         </p>
     */
    public Integer getSegment() {
        return segment;
    }

    /**
     * <p>
     * For a parallel <code>Scan</code> request, <code>Segment</code> identifies
     * an individual segment to be scanned by an application worker.
     * </p>
     * <p>
     * Segment IDs are zero-based, so the first segment is always 0. For
     * example, if you want to use four application threads to scan a table or
     * an index, then the first thread specifies a <code>Segment</code> value of
     * 0, the second thread specifies 1, and so on.
     * </p>
     * <p>
     * The value of <code>LastEvaluatedKey</code> returned from a parallel
     * <code>Scan</code> request must be used as <code>ExclusiveStartKey</code>
     * with the same segment ID in a subsequent <code>Scan</code> operation.
     * </p>
     * <p>
     * The value for <code>Segment</code> must be greater than or equal to 0,
     * and less than the value provided for <code>TotalSegments</code>.
     * </p>
     * <p>
     * If you provide <code>Segment</code>, you must also provide
     * <code>TotalSegments</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999999<br/>
     *
     * @param segment <p>
     *            For a parallel <code>Scan</code> request, <code>Segment</code>
     *            identifies an individual segment to be scanned by an
     *            application worker.
     *            </p>
     *            <p>
     *            Segment IDs are zero-based, so the first segment is always 0.
     *            For example, if you want to use four application threads to
     *            scan a table or an index, then the first thread specifies a
     *            <code>Segment</code> value of 0, the second thread specifies
     *            1, and so on.
     *            </p>
     *            <p>
     *            The value of <code>LastEvaluatedKey</code> returned from a
     *            parallel <code>Scan</code> request must be used as
     *            <code>ExclusiveStartKey</code> with the same segment ID in a
     *            subsequent <code>Scan</code> operation.
     *            </p>
     *            <p>
     *            The value for <code>Segment</code> must be greater than or
     *            equal to 0, and less than the value provided for
     *            <code>TotalSegments</code>.
     *            </p>
     *            <p>
     *            If you provide <code>Segment</code>, you must also provide
     *            <code>TotalSegments</code>.
     *            </p>
     */
    public void setSegment(Integer segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * For a parallel <code>Scan</code> request, <code>Segment</code> identifies
     * an individual segment to be scanned by an application worker.
     * </p>
     * <p>
     * Segment IDs are zero-based, so the first segment is always 0. For
     * example, if you want to use four application threads to scan a table or
     * an index, then the first thread specifies a <code>Segment</code> value of
     * 0, the second thread specifies 1, and so on.
     * </p>
     * <p>
     * The value of <code>LastEvaluatedKey</code> returned from a parallel
     * <code>Scan</code> request must be used as <code>ExclusiveStartKey</code>
     * with the same segment ID in a subsequent <code>Scan</code> operation.
     * </p>
     * <p>
     * The value for <code>Segment</code> must be greater than or equal to 0,
     * and less than the value provided for <code>TotalSegments</code>.
     * </p>
     * <p>
     * If you provide <code>Segment</code>, you must also provide
     * <code>TotalSegments</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999999<br/>
     *
     * @param segment <p>
     *            For a parallel <code>Scan</code> request, <code>Segment</code>
     *            identifies an individual segment to be scanned by an
     *            application worker.
     *            </p>
     *            <p>
     *            Segment IDs are zero-based, so the first segment is always 0.
     *            For example, if you want to use four application threads to
     *            scan a table or an index, then the first thread specifies a
     *            <code>Segment</code> value of 0, the second thread specifies
     *            1, and so on.
     *            </p>
     *            <p>
     *            The value of <code>LastEvaluatedKey</code> returned from a
     *            parallel <code>Scan</code> request must be used as
     *            <code>ExclusiveStartKey</code> with the same segment ID in a
     *            subsequent <code>Scan</code> operation.
     *            </p>
     *            <p>
     *            The value for <code>Segment</code> must be greater than or
     *            equal to 0, and less than the value provided for
     *            <code>TotalSegments</code>.
     *            </p>
     *            <p>
     *            If you provide <code>Segment</code>, you must also provide
     *            <code>TotalSegments</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRequest withSegment(Integer segment) {
        this.segment = segment;
        return this;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * specified table or index. These attributes can include scalars, sets, or
     * elements of a JSON document. The attributes in the expression must be
     * separated by commas.
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
     *         the specified table or index. These attributes can include
     *         scalars, sets, or elements of a JSON document. The attributes in
     *         the expression must be separated by commas.
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
     * specified table or index. These attributes can include scalars, sets, or
     * elements of a JSON document. The attributes in the expression must be
     * separated by commas.
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
     *            from the specified table or index. These attributes can
     *            include scalars, sets, or elements of a JSON document. The
     *            attributes in the expression must be separated by commas.
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
     * specified table or index. These attributes can include scalars, sets, or
     * elements of a JSON document. The attributes in the expression must be
     * separated by commas.
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
     *            from the specified table or index. These attributes can
     *            include scalars, sets, or elements of a JSON document. The
     *            attributes in the expression must be separated by commas.
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
    public ScanRequest withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <code>Scan</code> operation, but before the data is returned to you.
     * Items that do not satisfy the <code>FilterExpression</code> criteria are
     * not returned.
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
     *         <code>Scan</code> operation, but before the data is returned to
     *         you. Items that do not satisfy the <code>FilterExpression</code>
     *         criteria are not returned.
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
     * <code>Scan</code> operation, but before the data is returned to you.
     * Items that do not satisfy the <code>FilterExpression</code> criteria are
     * not returned.
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
     *            the <code>Scan</code> operation, but before the data is
     *            returned to you. Items that do not satisfy the
     *            <code>FilterExpression</code> criteria are not returned.
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
     * <code>Scan</code> operation, but before the data is returned to you.
     * Items that do not satisfy the <code>FilterExpression</code> criteria are
     * not returned.
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
     *            the <code>Scan</code> operation, but before the data is
     *            returned to you. Items that do not satisfy the
     *            <code>FilterExpression</code> criteria are not returned.
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
    public ScanRequest withFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
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
    public ScanRequest withExpressionAttributeNames(
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
    public ScanRequest addExpressionAttributeNamesEntry(String key, String value) {
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
    public ScanRequest clearExpressionAttributeNamesEntries() {
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
    public ScanRequest withExpressionAttributeValues(
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
    public ScanRequest addExpressionAttributeValuesEntry(String key, AttributeValue value) {
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
    public ScanRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    /**
     * <p>
     * A Boolean value that determines the read consistency model during the
     * scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>false</code>, then the data
     * returned from <code>Scan</code> might not contain the results from other
     * recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>true</code>, then all of the
     * write operations that completed before the <code>Scan</code> began are
     * guaranteed to be contained in the <code>Scan</code> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <code>ConsistentRead</code> is <code>false</code>
     * .
     * </p>
     * <p>
     * The <code>ConsistentRead</code> parameter is not supported on global
     * secondary indexes. If you scan a global secondary index with
     * <code>ConsistentRead</code> set to true, you will receive a
     * <code>ValidationException</code>.
     * </p>
     *
     * @return <p>
     *         A Boolean value that determines the read consistency model during
     *         the scan:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>ConsistentRead</code> is <code>false</code>, then the
     *         data returned from <code>Scan</code> might not contain the
     *         results from other recently completed write operations (PutItem,
     *         UpdateItem or DeleteItem).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>ConsistentRead</code> is <code>true</code>, then all of
     *         the write operations that completed before the <code>Scan</code>
     *         began are guaranteed to be contained in the <code>Scan</code>
     *         response.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default setting for <code>ConsistentRead</code> is
     *         <code>false</code>.
     *         </p>
     *         <p>
     *         The <code>ConsistentRead</code> parameter is not supported on
     *         global secondary indexes. If you scan a global secondary index
     *         with <code>ConsistentRead</code> set to true, you will receive a
     *         <code>ValidationException</code>.
     *         </p>
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }

    /**
     * <p>
     * A Boolean value that determines the read consistency model during the
     * scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>false</code>, then the data
     * returned from <code>Scan</code> might not contain the results from other
     * recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>true</code>, then all of the
     * write operations that completed before the <code>Scan</code> began are
     * guaranteed to be contained in the <code>Scan</code> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <code>ConsistentRead</code> is <code>false</code>
     * .
     * </p>
     * <p>
     * The <code>ConsistentRead</code> parameter is not supported on global
     * secondary indexes. If you scan a global secondary index with
     * <code>ConsistentRead</code> set to true, you will receive a
     * <code>ValidationException</code>.
     * </p>
     *
     * @return <p>
     *         A Boolean value that determines the read consistency model during
     *         the scan:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>ConsistentRead</code> is <code>false</code>, then the
     *         data returned from <code>Scan</code> might not contain the
     *         results from other recently completed write operations (PutItem,
     *         UpdateItem or DeleteItem).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>ConsistentRead</code> is <code>true</code>, then all of
     *         the write operations that completed before the <code>Scan</code>
     *         began are guaranteed to be contained in the <code>Scan</code>
     *         response.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default setting for <code>ConsistentRead</code> is
     *         <code>false</code>.
     *         </p>
     *         <p>
     *         The <code>ConsistentRead</code> parameter is not supported on
     *         global secondary indexes. If you scan a global secondary index
     *         with <code>ConsistentRead</code> set to true, you will receive a
     *         <code>ValidationException</code>.
     *         </p>
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }

    /**
     * <p>
     * A Boolean value that determines the read consistency model during the
     * scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>false</code>, then the data
     * returned from <code>Scan</code> might not contain the results from other
     * recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>true</code>, then all of the
     * write operations that completed before the <code>Scan</code> began are
     * guaranteed to be contained in the <code>Scan</code> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <code>ConsistentRead</code> is <code>false</code>
     * .
     * </p>
     * <p>
     * The <code>ConsistentRead</code> parameter is not supported on global
     * secondary indexes. If you scan a global secondary index with
     * <code>ConsistentRead</code> set to true, you will receive a
     * <code>ValidationException</code>.
     * </p>
     *
     * @param consistentRead <p>
     *            A Boolean value that determines the read consistency model
     *            during the scan:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>ConsistentRead</code> is <code>false</code>, then the
     *            data returned from <code>Scan</code> might not contain the
     *            results from other recently completed write operations
     *            (PutItem, UpdateItem or DeleteItem).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>ConsistentRead</code> is <code>true</code>, then all
     *            of the write operations that completed before the
     *            <code>Scan</code> began are guaranteed to be contained in the
     *            <code>Scan</code> response.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default setting for <code>ConsistentRead</code> is
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            The <code>ConsistentRead</code> parameter is not supported on
     *            global secondary indexes. If you scan a global secondary index
     *            with <code>ConsistentRead</code> set to true, you will receive
     *            a <code>ValidationException</code>.
     *            </p>
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * <p>
     * A Boolean value that determines the read consistency model during the
     * scan:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>false</code>, then the data
     * returned from <code>Scan</code> might not contain the results from other
     * recently completed write operations (PutItem, UpdateItem or DeleteItem).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>ConsistentRead</code> is <code>true</code>, then all of the
     * write operations that completed before the <code>Scan</code> began are
     * guaranteed to be contained in the <code>Scan</code> response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting for <code>ConsistentRead</code> is <code>false</code>
     * .
     * </p>
     * <p>
     * The <code>ConsistentRead</code> parameter is not supported on global
     * secondary indexes. If you scan a global secondary index with
     * <code>ConsistentRead</code> set to true, you will receive a
     * <code>ValidationException</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consistentRead <p>
     *            A Boolean value that determines the read consistency model
     *            during the scan:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>ConsistentRead</code> is <code>false</code>, then the
     *            data returned from <code>Scan</code> might not contain the
     *            results from other recently completed write operations
     *            (PutItem, UpdateItem or DeleteItem).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>ConsistentRead</code> is <code>true</code>, then all
     *            of the write operations that completed before the
     *            <code>Scan</code> began are guaranteed to be contained in the
     *            <code>Scan</code> response.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default setting for <code>ConsistentRead</code> is
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            The <code>ConsistentRead</code> parameter is not supported on
     *            global secondary indexes. If you scan a global secondary index
     *            with <code>ConsistentRead</code> set to true, you will receive
     *            a <code>ValidationException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
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
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getSelect() != null)
            sb.append("Select: " + getSelect() + ",");
        if (getScanFilter() != null)
            sb.append("ScanFilter: " + getScanFilter() + ",");
        if (getConditionalOperator() != null)
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (getExclusiveStartKey() != null)
            sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getTotalSegments() != null)
            sb.append("TotalSegments: " + getTotalSegments() + ",");
        if (getSegment() != null)
            sb.append("Segment: " + getSegment() + ",");
        if (getProjectionExpression() != null)
            sb.append("ProjectionExpression: " + getProjectionExpression() + ",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: " + getFilterExpression() + ",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() + ",");
        if (getExpressionAttributeValues() != null)
            sb.append("ExpressionAttributeValues: " + getExpressionAttributeValues() + ",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: " + getConsistentRead());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getSelect() == null) ? 0 : getSelect().hashCode());
        hashCode = prime * hashCode + ((getScanFilter() == null) ? 0 : getScanFilter().hashCode());
        hashCode = prime * hashCode
                + ((getConditionalOperator() == null) ? 0 : getConditionalOperator().hashCode());
        hashCode = prime * hashCode
                + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTotalSegments() == null) ? 0 : getTotalSegments().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode
                + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode());
        hashCode = prime * hashCode
                + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getConsistentRead() == null) ? 0 : getConsistentRead().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanRequest == false)
            return false;
        ScanRequest other = (ScanRequest) obj;

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
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null
                && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getSelect() == null ^ this.getSelect() == null)
            return false;
        if (other.getSelect() != null && other.getSelect().equals(this.getSelect()) == false)
            return false;
        if (other.getScanFilter() == null ^ this.getScanFilter() == null)
            return false;
        if (other.getScanFilter() != null
                && other.getScanFilter().equals(this.getScanFilter()) == false)
            return false;
        if (other.getConditionalOperator() == null ^ this.getConditionalOperator() == null)
            return false;
        if (other.getConditionalOperator() != null
                && other.getConditionalOperator().equals(this.getConditionalOperator()) == false)
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
        if (other.getTotalSegments() == null ^ this.getTotalSegments() == null)
            return false;
        if (other.getTotalSegments() != null
                && other.getTotalSegments().equals(this.getTotalSegments()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
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
        if (other.getConsistentRead() == null ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null
                && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        return true;
    }
}
