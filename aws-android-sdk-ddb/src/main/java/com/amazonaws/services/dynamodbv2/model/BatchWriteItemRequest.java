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
 * The <code>BatchWriteItem</code> operation puts or deletes multiple items in
 * one or more tables. A single call to <code>BatchWriteItem</code> can write up
 * to 16 MB of data, which can comprise as many as 25 put or delete requests.
 * Individual items to be written can be as large as 400 KB.
 * </p>
 * <note>
 * <p>
 * <code>BatchWriteItem</code> cannot update items. To update items, use the
 * <code>UpdateItem</code> action.
 * </p>
 * </note>
 * <p>
 * The individual <code>PutItem</code> and <code>DeleteItem</code> operations
 * specified in <code>BatchWriteItem</code> are atomic; however
 * <code>BatchWriteItem</code> as a whole is not. If any requested operations
 * fail because the table's provisioned throughput is exceeded or an internal
 * processing failure occurs, the failed operations are returned in the
 * <code>UnprocessedItems</code> response parameter. You can investigate and
 * optionally resend the requests. Typically, you would call
 * <code>BatchWriteItem</code> in a loop. Each iteration would check for
 * unprocessed items and submit a new <code>BatchWriteItem</code> request with
 * those unprocessed items until all items have been processed.
 * </p>
 * <p>
 * Note that if <i>none</i> of the items can be processed due to insufficient
 * provisioned throughput on all of the tables in the request, then
 * <code>BatchWriteItem</code> will return a
 * <code>ProvisionedThroughputExceededException</code>.
 * </p>
 * <important>
 * <p>
 * If DynamoDB returns any unprocessed items, you should retry the batch
 * operation on those items. However, <i>we strongly recommend that you use an
 * exponential backoff algorithm</i>. If you retry the batch operation
 * immediately, the underlying read or write requests can still fail due to
 * throttling on the individual tables. If you delay the batch operation using
 * exponential backoff, the individual requests in the batch are much more
 * likely to succeed.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations"
 * >Batch Operations and Error Handling</a> in the <i>Amazon DynamoDB Developer
 * Guide</i>.
 * </p>
 * </important>
 * <p>
 * With <code>BatchWriteItem</code>, you can efficiently write or delete large
 * amounts of data, such as from Amazon Elastic MapReduce (EMR), or copy data
 * from another database into DynamoDB. In order to improve performance with
 * these large-scale operations, <code>BatchWriteItem</code> does not behave in
 * the same way as individual <code>PutItem</code> and <code>DeleteItem</code>
 * calls would. For example, you cannot specify conditions on individual put and
 * delete requests, and <code>BatchWriteItem</code> does not return deleted
 * items in the response.
 * </p>
 * <p>
 * If you use a programming language that supports concurrency, you can use
 * threads to write items in parallel. Your application must include the
 * necessary logic to manage the threads. With languages that don't support
 * threading, you must update or delete the specified items one at a time. In
 * both situations, <code>BatchWriteItem</code> performs the specified put and
 * delete operations in parallel, giving you the power of the thread pool
 * approach without having to introduce complexity into your application.
 * </p>
 * <p>
 * Parallel processing reduces latency, but each specified put and delete
 * request consumes the same number of write capacity units whether it is
 * processed in parallel or not. Delete operations on nonexistent items consume
 * one write capacity unit.
 * </p>
 * <p>
 * If one or more of the following is true, DynamoDB rejects the entire batch
 * write operation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * One or more tables specified in the <code>BatchWriteItem</code> request does
 * not exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * Primary key attributes specified on an item in the request do not match those
 * in the corresponding table's primary key schema.
 * </p>
 * </li>
 * <li>
 * <p>
 * You try to perform multiple operations on the same item in the same
 * <code>BatchWriteItem</code> request. For example, you cannot put and delete
 * the same item in the same <code>BatchWriteItem</code> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Your request contains at least two items with identical hash and range keys
 * (which essentially is two put operations).
 * </p>
 * </li>
 * <li>
 * <p>
 * There are more than 25 requests in the batch.
 * </p>
 * </li>
 * <li>
 * <p>
 * Any individual item in a batch exceeds 400 KB.
 * </p>
 * </li>
 * <li>
 * <p>
 * The total request size exceeds 16 MB.
 * </p>
 * </li>
 * </ul>
 */
public class BatchWriteItemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A map of one or more table names and, for each table, a list of
     * operations to be performed (<code>DeleteRequest</code> or
     * <code>PutRequest</code>). Each element in the map consists of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation
     * on the specified item. The item to be deleted is identified by a
     * <code>Key</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key</code> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute name
     * and an attribute value. For each primary key, you must provide <i>all</i>
     * of the key attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary
     * key, you must provide values for <i>both</i> the partition key and the
     * sort key.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the
     * specified item. The item to be put is identified by an <code>Item</code>
     * subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Item</code> - A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. Attribute
     * values must not be null; string and binary type attributes must have
     * lengths greater than zero; and set type attributes must not be empty.
     * Requests that contain empty values will be rejected with a
     * <code>ValidationException</code> exception.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.Map<String, java.util.List<WriteRequest>> requestItems;

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
     * Default constructor for BatchWriteItemRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public BatchWriteItemRequest() {
    }

    /**
     * Constructs a new BatchWriteItemRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param requestItems <p>
     *            A map of one or more table names and, for each table, a list
     *            of operations to be performed (<code>DeleteRequest</code> or
     *            <code>PutRequest</code>). Each element in the map consists of
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DeleteRequest</code> - Perform a <code>DeleteItem</code>
     *            operation on the specified item. The item to be deleted is
     *            identified by a <code>Key</code> subelement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key</code> - A map of primary key attribute values that
     *            uniquely identify the item. Each entry in this map consists of
     *            an attribute name and an attribute value. For each primary
     *            key, you must provide <i>all</i> of the key attributes. For
     *            example, with a simple primary key, you only need to provide a
     *            value for the partition key. For a composite primary key, you
     *            must provide values for <i>both</i> the partition key and the
     *            sort key.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PutRequest</code> - Perform a <code>PutItem</code>
     *            operation on the specified item. The item to be put is
     *            identified by an <code>Item</code> subelement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Item</code> - A map of attributes and their values. Each
     *            entry in this map consists of an attribute name and an
     *            attribute value. Attribute values must not be null; string and
     *            binary type attributes must have lengths greater than zero;
     *            and set type attributes must not be empty. Requests that
     *            contain empty values will be rejected with a
     *            <code>ValidationException</code> exception.
     *            </p>
     *            <p>
     *            If you specify any attributes that are part of an index key,
     *            then the data types for those attributes must match those of
     *            the schema in the table's attribute definition.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public BatchWriteItemRequest(java.util.Map<String, java.util.List<WriteRequest>> requestItems) {
        setRequestItems(requestItems);
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a list of
     * operations to be performed (<code>DeleteRequest</code> or
     * <code>PutRequest</code>). Each element in the map consists of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation
     * on the specified item. The item to be deleted is identified by a
     * <code>Key</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key</code> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute name
     * and an attribute value. For each primary key, you must provide <i>all</i>
     * of the key attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary
     * key, you must provide values for <i>both</i> the partition key and the
     * sort key.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the
     * specified item. The item to be put is identified by an <code>Item</code>
     * subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Item</code> - A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. Attribute
     * values must not be null; string and binary type attributes must have
     * lengths greater than zero; and set type attributes must not be empty.
     * Requests that contain empty values will be rejected with a
     * <code>ValidationException</code> exception.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A map of one or more table names and, for each table, a list of
     *         operations to be performed (<code>DeleteRequest</code> or
     *         <code>PutRequest</code>). Each element in the map consists of the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeleteRequest</code> - Perform a <code>DeleteItem</code>
     *         operation on the specified item. The item to be deleted is
     *         identified by a <code>Key</code> subelement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key</code> - A map of primary key attribute values that
     *         uniquely identify the item. Each entry in this map consists of an
     *         attribute name and an attribute value. For each primary key, you
     *         must provide <i>all</i> of the key attributes. For example, with
     *         a simple primary key, you only need to provide a value for the
     *         partition key. For a composite primary key, you must provide
     *         values for <i>both</i> the partition key and the sort key.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PutRequest</code> - Perform a <code>PutItem</code>
     *         operation on the specified item. The item to be put is identified
     *         by an <code>Item</code> subelement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Item</code> - A map of attributes and their values. Each
     *         entry in this map consists of an attribute name and an attribute
     *         value. Attribute values must not be null; string and binary type
     *         attributes must have lengths greater than zero; and set type
     *         attributes must not be empty. Requests that contain empty values
     *         will be rejected with a <code>ValidationException</code>
     *         exception.
     *         </p>
     *         <p>
     *         If you specify any attributes that are part of an index key, then
     *         the data types for those attributes must match those of the
     *         schema in the table's attribute definition.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, java.util.List<WriteRequest>> getRequestItems() {
        return requestItems;
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a list of
     * operations to be performed (<code>DeleteRequest</code> or
     * <code>PutRequest</code>). Each element in the map consists of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation
     * on the specified item. The item to be deleted is identified by a
     * <code>Key</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key</code> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute name
     * and an attribute value. For each primary key, you must provide <i>all</i>
     * of the key attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary
     * key, you must provide values for <i>both</i> the partition key and the
     * sort key.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the
     * specified item. The item to be put is identified by an <code>Item</code>
     * subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Item</code> - A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. Attribute
     * values must not be null; string and binary type attributes must have
     * lengths greater than zero; and set type attributes must not be empty.
     * Requests that contain empty values will be rejected with a
     * <code>ValidationException</code> exception.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param requestItems <p>
     *            A map of one or more table names and, for each table, a list
     *            of operations to be performed (<code>DeleteRequest</code> or
     *            <code>PutRequest</code>). Each element in the map consists of
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DeleteRequest</code> - Perform a <code>DeleteItem</code>
     *            operation on the specified item. The item to be deleted is
     *            identified by a <code>Key</code> subelement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key</code> - A map of primary key attribute values that
     *            uniquely identify the item. Each entry in this map consists of
     *            an attribute name and an attribute value. For each primary
     *            key, you must provide <i>all</i> of the key attributes. For
     *            example, with a simple primary key, you only need to provide a
     *            value for the partition key. For a composite primary key, you
     *            must provide values for <i>both</i> the partition key and the
     *            sort key.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PutRequest</code> - Perform a <code>PutItem</code>
     *            operation on the specified item. The item to be put is
     *            identified by an <code>Item</code> subelement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Item</code> - A map of attributes and their values. Each
     *            entry in this map consists of an attribute name and an
     *            attribute value. Attribute values must not be null; string and
     *            binary type attributes must have lengths greater than zero;
     *            and set type attributes must not be empty. Requests that
     *            contain empty values will be rejected with a
     *            <code>ValidationException</code> exception.
     *            </p>
     *            <p>
     *            If you specify any attributes that are part of an index key,
     *            then the data types for those attributes must match those of
     *            the schema in the table's attribute definition.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public void setRequestItems(java.util.Map<String, java.util.List<WriteRequest>> requestItems) {
        this.requestItems = requestItems;
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a list of
     * operations to be performed (<code>DeleteRequest</code> or
     * <code>PutRequest</code>). Each element in the map consists of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation
     * on the specified item. The item to be deleted is identified by a
     * <code>Key</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key</code> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute name
     * and an attribute value. For each primary key, you must provide <i>all</i>
     * of the key attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary
     * key, you must provide values for <i>both</i> the partition key and the
     * sort key.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the
     * specified item. The item to be put is identified by an <code>Item</code>
     * subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Item</code> - A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. Attribute
     * values must not be null; string and binary type attributes must have
     * lengths greater than zero; and set type attributes must not be empty.
     * Requests that contain empty values will be rejected with a
     * <code>ValidationException</code> exception.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestItems <p>
     *            A map of one or more table names and, for each table, a list
     *            of operations to be performed (<code>DeleteRequest</code> or
     *            <code>PutRequest</code>). Each element in the map consists of
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DeleteRequest</code> - Perform a <code>DeleteItem</code>
     *            operation on the specified item. The item to be deleted is
     *            identified by a <code>Key</code> subelement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key</code> - A map of primary key attribute values that
     *            uniquely identify the item. Each entry in this map consists of
     *            an attribute name and an attribute value. For each primary
     *            key, you must provide <i>all</i> of the key attributes. For
     *            example, with a simple primary key, you only need to provide a
     *            value for the partition key. For a composite primary key, you
     *            must provide values for <i>both</i> the partition key and the
     *            sort key.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PutRequest</code> - Perform a <code>PutItem</code>
     *            operation on the specified item. The item to be put is
     *            identified by an <code>Item</code> subelement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Item</code> - A map of attributes and their values. Each
     *            entry in this map consists of an attribute name and an
     *            attribute value. Attribute values must not be null; string and
     *            binary type attributes must have lengths greater than zero;
     *            and set type attributes must not be empty. Requests that
     *            contain empty values will be rejected with a
     *            <code>ValidationException</code> exception.
     *            </p>
     *            <p>
     *            If you specify any attributes that are part of an index key,
     *            then the data types for those attributes must match those of
     *            the schema in the table's attribute definition.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchWriteItemRequest withRequestItems(
            java.util.Map<String, java.util.List<WriteRequest>> requestItems) {
        this.requestItems = requestItems;
        return this;
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a list of
     * operations to be performed (<code>DeleteRequest</code> or
     * <code>PutRequest</code>). Each element in the map consists of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation
     * on the specified item. The item to be deleted is identified by a
     * <code>Key</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key</code> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute name
     * and an attribute value. For each primary key, you must provide <i>all</i>
     * of the key attributes. For example, with a simple primary key, you only
     * need to provide a value for the partition key. For a composite primary
     * key, you must provide values for <i>both</i> the partition key and the
     * sort key.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the
     * specified item. The item to be put is identified by an <code>Item</code>
     * subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Item</code> - A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. Attribute
     * values must not be null; string and binary type attributes must have
     * lengths greater than zero; and set type attributes must not be empty.
     * Requests that contain empty values will be rejected with a
     * <code>ValidationException</code> exception.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into RequestItems parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into RequestItems.
     * @param value The corresponding value of the entry to be added into
     *            RequestItems.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchWriteItemRequest addRequestItemsEntry(String key, java.util.List<WriteRequest> value) {
        if (null == this.requestItems) {
            this.requestItems = new java.util.HashMap<String, java.util.List<WriteRequest>>();
        }
        if (this.requestItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.requestItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestItems.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public BatchWriteItemRequest clearRequestItemsEntries() {
        this.requestItems = null;
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
    public BatchWriteItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public BatchWriteItemRequest withReturnConsumedCapacity(
            ReturnConsumedCapacity returnConsumedCapacity) {
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
    public BatchWriteItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
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
    public BatchWriteItemRequest withReturnItemCollectionMetrics(
            ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
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
        if (getRequestItems() != null)
            sb.append("RequestItems: " + getRequestItems() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getReturnItemCollectionMetrics() != null)
            sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRequestItems() == null) ? 0 : getRequestItems().hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnItemCollectionMetrics() == null) ? 0
                        : getReturnItemCollectionMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchWriteItemRequest == false)
            return false;
        BatchWriteItemRequest other = (BatchWriteItemRequest) obj;

        if (other.getRequestItems() == null ^ this.getRequestItems() == null)
            return false;
        if (other.getRequestItems() != null
                && other.getRequestItems().equals(this.getRequestItems()) == false)
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
        return true;
    }
}
