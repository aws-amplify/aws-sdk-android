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

package com.amazonaws.services.dynamodbv2;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.dynamodbv2.model.*;

/**
 * Interface for accessing Amazon DynamoDB asynchronously. <fullname>Amazon
 * DynamoDB</fullname>
 * <p>
 * Amazon DynamoDB is a fully managed NoSQL database service that provides fast
 * and predictable performance with seamless scalability. DynamoDB lets you
 * offload the administrative burdens of operating and scaling a distributed
 * database, so that you don't have to worry about hardware provisioning, setup
 * and configuration, replication, software patching, or cluster scaling.
 * </p>
 * <p>
 * With DynamoDB, you can create database tables that can store and retrieve any
 * amount of data, and serve any level of request traffic. You can scale up or
 * scale down your tables' throughput capacity without downtime or performance
 * degradation, and use the AWS Management Console to monitor resource
 * utilization and performance metrics.
 * </p>
 * <p>
 * DynamoDB automatically spreads the data and traffic for your tables over a
 * sufficient number of servers to handle your throughput and storage
 * requirements, while maintaining consistent and fast performance. All of your
 * data is stored on solid state disks (SSDs) and automatically replicated
 * across multiple Availability Zones in an AWS region, providing built-in high
 * availability and data durability.
 * </p>
 **/
public interface AmazonDynamoDBAsync extends AmazonDynamoDB {
    /**
     * <p>
     * The <code>BatchGetItem</code> operation returns the attributes of one or
     * more items from one or more tables. You identify requested items by
     * primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 16 MB of data, which can contain as
     * many as 100 items. <code>BatchGetItem</code> will return a partial result
     * if the response size limit is exceeded, the table's provisioned
     * throughput is exceeded, or an internal processing failure occurs. If a
     * partial result is returned, the operation returns a value for
     * <code>UnprocessedKeys</code>. You can use this value to retry the
     * operation starting with the next item to get.
     * </p>
     * <important>
     * <p>
     * If you request more than 100 items <code>BatchGetItem</code> will return
     * a <code>ValidationException</code> with the message
     * "Too many items requested for the BatchGetItem call".
     * </p>
     * </important>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual item
     * is 300 KB in size, the system returns 52 items (so as not to exceed the
     * 16 MB limit). It also returns an appropriate <code>UnprocessedKeys</code>
     * value so you can get the next page of results. If desired, your
     * application can include its own logic to assemble the pages of results
     * into one data set.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient
     * provisioned throughput on all of the tables in the request, then
     * <code>BatchGetItem</code> will return a
     * <code>ProvisionedThroughputExceededException</code>. If <i>at least
     * one</i> of the items is successfully processed, then
     * <code>BatchGetItem</code> completes successfully, while returning the
     * keys of the unread items in <code>UnprocessedKeys</code>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch
     * operation on those items. However, <i>we strongly recommend that you use
     * an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to
     * throttling on the individual tables. If you delay the batch operation
     * using exponential backoff, the individual requests in the batch are much
     * more likely to succeed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations"
     * >Batch Operations and Error Handling</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * By default, <code>BatchGetItem</code> performs eventually consistent
     * reads on every table in the request. If you want strongly consistent
     * reads instead, you can set <code>ConsistentRead</code> to
     * <code>true</code> for any or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <code>BatchGetItem</code>
     * retrieves items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not
     * return items in any particular order. To help parse the response by item,
     * include the primary key values for the items in your request in the
     * <code>ProjectionExpression</code> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result.
     * Requests for nonexistent items consume the minimum read capacity units
     * according to the type of read. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"
     * >Capacity Units Calculations</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * 
     * @param batchGetItemRequest <p>
     *            Represents the input of a <code>BatchGetItem</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the
     *         BatchGetItem service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchGetItemResult> batchGetItemAsync(BatchGetItemRequest batchGetItemRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>BatchGetItem</code> operation returns the attributes of one or
     * more items from one or more tables. You identify requested items by
     * primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 16 MB of data, which can contain as
     * many as 100 items. <code>BatchGetItem</code> will return a partial result
     * if the response size limit is exceeded, the table's provisioned
     * throughput is exceeded, or an internal processing failure occurs. If a
     * partial result is returned, the operation returns a value for
     * <code>UnprocessedKeys</code>. You can use this value to retry the
     * operation starting with the next item to get.
     * </p>
     * <important>
     * <p>
     * If you request more than 100 items <code>BatchGetItem</code> will return
     * a <code>ValidationException</code> with the message
     * "Too many items requested for the BatchGetItem call".
     * </p>
     * </important>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual item
     * is 300 KB in size, the system returns 52 items (so as not to exceed the
     * 16 MB limit). It also returns an appropriate <code>UnprocessedKeys</code>
     * value so you can get the next page of results. If desired, your
     * application can include its own logic to assemble the pages of results
     * into one data set.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient
     * provisioned throughput on all of the tables in the request, then
     * <code>BatchGetItem</code> will return a
     * <code>ProvisionedThroughputExceededException</code>. If <i>at least
     * one</i> of the items is successfully processed, then
     * <code>BatchGetItem</code> completes successfully, while returning the
     * keys of the unread items in <code>UnprocessedKeys</code>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch
     * operation on those items. However, <i>we strongly recommend that you use
     * an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to
     * throttling on the individual tables. If you delay the batch operation
     * using exponential backoff, the individual requests in the batch are much
     * more likely to succeed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations"
     * >Batch Operations and Error Handling</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * By default, <code>BatchGetItem</code> performs eventually consistent
     * reads on every table in the request. If you want strongly consistent
     * reads instead, you can set <code>ConsistentRead</code> to
     * <code>true</code> for any or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <code>BatchGetItem</code>
     * retrieves items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not
     * return items in any particular order. To help parse the response by item,
     * include the primary key values for the items in your request in the
     * <code>ProjectionExpression</code> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result.
     * Requests for nonexistent items consume the minimum read capacity units
     * according to the type of read. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"
     * >Capacity Units Calculations</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * 
     * @param batchGetItemRequest <p>
     *            Represents the input of a <code>BatchGetItem</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         BatchGetItem service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchGetItemResult> batchGetItemAsync(BatchGetItemRequest batchGetItemRequest,
            AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>BatchWriteItem</code> operation puts or deletes multiple items
     * in one or more tables. A single call to <code>BatchWriteItem</code> can
     * write up to 16 MB of data, which can comprise as many as 25 put or delete
     * requests. Individual items to be written can be as large as 400 KB.
     * </p>
     * <note>
     * <p>
     * <code>BatchWriteItem</code> cannot update items. To update items, use the
     * <code>UpdateItem</code> action.
     * </p>
     * </note>
     * <p>
     * The individual <code>PutItem</code> and <code>DeleteItem</code>
     * operations specified in <code>BatchWriteItem</code> are atomic; however
     * <code>BatchWriteItem</code> as a whole is not. If any requested
     * operations fail because the table's provisioned throughput is exceeded or
     * an internal processing failure occurs, the failed operations are returned
     * in the <code>UnprocessedItems</code> response parameter. You can
     * investigate and optionally resend the requests. Typically, you would call
     * <code>BatchWriteItem</code> in a loop. Each iteration would check for
     * unprocessed items and submit a new <code>BatchWriteItem</code> request
     * with those unprocessed items until all items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to
     * insufficient provisioned throughput on all of the tables in the request,
     * then <code>BatchWriteItem</code> will return a
     * <code>ProvisionedThroughputExceededException</code>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch
     * operation on those items. However, <i>we strongly recommend that you use
     * an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to
     * throttling on the individual tables. If you delay the batch operation
     * using exponential backoff, the individual requests in the batch are much
     * more likely to succeed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations"
     * >Batch Operations and Error Handling</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * With <code>BatchWriteItem</code>, you can efficiently write or delete
     * large amounts of data, such as from Amazon Elastic MapReduce (EMR), or
     * copy data from another database into DynamoDB. In order to improve
     * performance with these large-scale operations,
     * <code>BatchWriteItem</code> does not behave in the same way as individual
     * <code>PutItem</code> and <code>DeleteItem</code> calls would. For
     * example, you cannot specify conditions on individual put and delete
     * requests, and <code>BatchWriteItem</code> does not return deleted items
     * in the response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, you can use
     * threads to write items in parallel. Your application must include the
     * necessary logic to manage the threads. With languages that don't support
     * threading, you must update or delete the specified items one at a time.
     * In both situations, <code>BatchWriteItem</code> performs the specified
     * put and delete operations in parallel, giving you the power of the thread
     * pool approach without having to introduce complexity into your
     * application.
     * </p>
     * <p>
     * Parallel processing reduces latency, but each specified put and delete
     * request consumes the same number of write capacity units whether it is
     * processed in parallel or not. Delete operations on nonexistent items
     * consume one write capacity unit.
     * </p>
     * <p>
     * If one or more of the following is true, DynamoDB rejects the entire
     * batch write operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One or more tables specified in the <code>BatchWriteItem</code> request
     * does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * Primary key attributes specified on an item in the request do not match
     * those in the corresponding table's primary key schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * You try to perform multiple operations on the same item in the same
     * <code>BatchWriteItem</code> request. For example, you cannot put and
     * delete the same item in the same <code>BatchWriteItem</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your request contains at least two items with identical hash and range
     * keys (which essentially is two put operations).
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
     * 
     * @param batchWriteItemRequest <p>
     *            Represents the input of a <code>BatchWriteItem</code>
     *            operation.
     *            </p>
     * @return A Java Future object containing the response from the
     *         BatchWriteItem service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ItemCollectionSizeLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchWriteItemResult> batchWriteItemAsync(BatchWriteItemRequest batchWriteItemRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>BatchWriteItem</code> operation puts or deletes multiple items
     * in one or more tables. A single call to <code>BatchWriteItem</code> can
     * write up to 16 MB of data, which can comprise as many as 25 put or delete
     * requests. Individual items to be written can be as large as 400 KB.
     * </p>
     * <note>
     * <p>
     * <code>BatchWriteItem</code> cannot update items. To update items, use the
     * <code>UpdateItem</code> action.
     * </p>
     * </note>
     * <p>
     * The individual <code>PutItem</code> and <code>DeleteItem</code>
     * operations specified in <code>BatchWriteItem</code> are atomic; however
     * <code>BatchWriteItem</code> as a whole is not. If any requested
     * operations fail because the table's provisioned throughput is exceeded or
     * an internal processing failure occurs, the failed operations are returned
     * in the <code>UnprocessedItems</code> response parameter. You can
     * investigate and optionally resend the requests. Typically, you would call
     * <code>BatchWriteItem</code> in a loop. Each iteration would check for
     * unprocessed items and submit a new <code>BatchWriteItem</code> request
     * with those unprocessed items until all items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to
     * insufficient provisioned throughput on all of the tables in the request,
     * then <code>BatchWriteItem</code> will return a
     * <code>ProvisionedThroughputExceededException</code>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch
     * operation on those items. However, <i>we strongly recommend that you use
     * an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to
     * throttling on the individual tables. If you delay the batch operation
     * using exponential backoff, the individual requests in the batch are much
     * more likely to succeed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations"
     * >Batch Operations and Error Handling</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * With <code>BatchWriteItem</code>, you can efficiently write or delete
     * large amounts of data, such as from Amazon Elastic MapReduce (EMR), or
     * copy data from another database into DynamoDB. In order to improve
     * performance with these large-scale operations,
     * <code>BatchWriteItem</code> does not behave in the same way as individual
     * <code>PutItem</code> and <code>DeleteItem</code> calls would. For
     * example, you cannot specify conditions on individual put and delete
     * requests, and <code>BatchWriteItem</code> does not return deleted items
     * in the response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, you can use
     * threads to write items in parallel. Your application must include the
     * necessary logic to manage the threads. With languages that don't support
     * threading, you must update or delete the specified items one at a time.
     * In both situations, <code>BatchWriteItem</code> performs the specified
     * put and delete operations in parallel, giving you the power of the thread
     * pool approach without having to introduce complexity into your
     * application.
     * </p>
     * <p>
     * Parallel processing reduces latency, but each specified put and delete
     * request consumes the same number of write capacity units whether it is
     * processed in parallel or not. Delete operations on nonexistent items
     * consume one write capacity unit.
     * </p>
     * <p>
     * If one or more of the following is true, DynamoDB rejects the entire
     * batch write operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One or more tables specified in the <code>BatchWriteItem</code> request
     * does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * Primary key attributes specified on an item in the request do not match
     * those in the corresponding table's primary key schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * You try to perform multiple operations on the same item in the same
     * <code>BatchWriteItem</code> request. For example, you cannot put and
     * delete the same item in the same <code>BatchWriteItem</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your request contains at least two items with identical hash and range
     * keys (which essentially is two put operations).
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
     * 
     * @param batchWriteItemRequest <p>
     *            Represents the input of a <code>BatchWriteItem</code>
     *            operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         BatchWriteItem service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ItemCollectionSizeLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchWriteItemResult> batchWriteItemAsync(BatchWriteItemRequest batchWriteItemRequest,
            AsyncHandler<BatchWriteItemRequest, BatchWriteItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a backup for an existing table.
     * </p>
     * <p>
     * Each time you create an On-Demand Backup, the entire table data is backed
     * up. There is no limit to the number of on-demand backups that can be
     * taken.
     * </p>
     * <p>
     * When you create an On-Demand Backup, a time marker of the request is
     * cataloged, and the backup is created asynchronously, by applying all
     * changes until the time of the request to the last full table snapshot.
     * Backup requests are processed instantaneously and become available for
     * restore within minutes.
     * </p>
     * <p>
     * You can call <code>CreateBackup</code> at a maximum rate of 50 times per
     * second.
     * </p>
     * <p>
     * All backups in DynamoDB work without consuming any provisioned throughput
     * on the table.
     * </p>
     * <p>
     * If you submit a backup request on 2018-12-14 at 14:25:00, the backup is
     * guaranteed to contain all data committed to the table up to 14:24:00, and
     * data committed after 14:26:00 will not be. The backup may or may not
     * contain data modifications made between 14:24:00 and 14:26:00. On-Demand
     * Backup does not support causal consistency.
     * </p>
     * <p>
     * Along with data, the following are also included on the backups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Global secondary indexes (GSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Local secondary indexes (LSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Streams
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned read and write capacity
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBackupRequest
     * @return A Java Future object containing the response from the
     *         CreateBackup service method, as returned by Amazon DynamoDB.
     * @throws TableNotFoundException
     * @throws TableInUseException
     * @throws ContinuousBackupsUnavailableException
     * @throws BackupInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a backup for an existing table.
     * </p>
     * <p>
     * Each time you create an On-Demand Backup, the entire table data is backed
     * up. There is no limit to the number of on-demand backups that can be
     * taken.
     * </p>
     * <p>
     * When you create an On-Demand Backup, a time marker of the request is
     * cataloged, and the backup is created asynchronously, by applying all
     * changes until the time of the request to the last full table snapshot.
     * Backup requests are processed instantaneously and become available for
     * restore within minutes.
     * </p>
     * <p>
     * You can call <code>CreateBackup</code> at a maximum rate of 50 times per
     * second.
     * </p>
     * <p>
     * All backups in DynamoDB work without consuming any provisioned throughput
     * on the table.
     * </p>
     * <p>
     * If you submit a backup request on 2018-12-14 at 14:25:00, the backup is
     * guaranteed to contain all data committed to the table up to 14:24:00, and
     * data committed after 14:26:00 will not be. The backup may or may not
     * contain data modifications made between 14:24:00 and 14:26:00. On-Demand
     * Backup does not support causal consistency.
     * </p>
     * <p>
     * Along with data, the following are also included on the backups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Global secondary indexes (GSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Local secondary indexes (LSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Streams
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned read and write capacity
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBackupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateBackup service method, as returned by Amazon DynamoDB.
     * @throws TableNotFoundException
     * @throws TableInUseException
     * @throws ContinuousBackupsUnavailableException
     * @throws BackupInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest,
            AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a global table from an existing table. A global table creates a
     * replication relationship between two or more DynamoDB tables with the
     * same table name in the provided regions.
     * </p>
     * <p>
     * If you want to add a new replica table to a global table, each of the
     * following conditions must be true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The table must have the same primary key as all of the other replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The table must have the same name as all of the other replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The table must have DynamoDB Streams enabled, with the stream containing
     * both the new and the old images of the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the replica tables in the global table can contain any data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If global secondary indexes are specified, then the following conditions
     * must also be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The global secondary indexes must have the same name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same hash key and sort key (if
     * present).
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Write capacity settings should be set consistently across your replica
     * tables and secondary indexes. DynamoDB strongly recommends enabling auto
     * scaling to manage the write capacity settings for all of your global
     * tables replicas and indexes.
     * </p>
     * <p>
     * If you prefer to manage write capacity settings manually, you should
     * provision equal replicated write capacity units to your replica tables.
     * You should also provision equal replicated write capacity units to
     * matching secondary indexes across your global table.
     * </p>
     * </important>
     * 
     * @param createGlobalTableRequest
     * @return A Java Future object containing the response from the
     *         CreateGlobalTable service method, as returned by Amazon DynamoDB.
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws GlobalTableAlreadyExistsException
     * @throws TableNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateGlobalTableResult> createGlobalTableAsync(
            CreateGlobalTableRequest createGlobalTableRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a global table from an existing table. A global table creates a
     * replication relationship between two or more DynamoDB tables with the
     * same table name in the provided regions.
     * </p>
     * <p>
     * If you want to add a new replica table to a global table, each of the
     * following conditions must be true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The table must have the same primary key as all of the other replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The table must have the same name as all of the other replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The table must have DynamoDB Streams enabled, with the stream containing
     * both the new and the old images of the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the replica tables in the global table can contain any data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If global secondary indexes are specified, then the following conditions
     * must also be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The global secondary indexes must have the same name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same hash key and sort key (if
     * present).
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Write capacity settings should be set consistently across your replica
     * tables and secondary indexes. DynamoDB strongly recommends enabling auto
     * scaling to manage the write capacity settings for all of your global
     * tables replicas and indexes.
     * </p>
     * <p>
     * If you prefer to manage write capacity settings manually, you should
     * provision equal replicated write capacity units to your replica tables.
     * You should also provision equal replicated write capacity units to
     * matching secondary indexes across your global table.
     * </p>
     * </important>
     * 
     * @param createGlobalTableRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateGlobalTable service method, as returned by Amazon DynamoDB.
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws GlobalTableAlreadyExistsException
     * @throws TableNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateGlobalTableResult> createGlobalTableAsync(
            CreateGlobalTableRequest createGlobalTableRequest,
            AsyncHandler<CreateGlobalTableRequest, CreateGlobalTableResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>CreateTable</code> operation adds a new table to your account.
     * In an AWS account, table names must be unique within each region. That
     * is, you can have two tables with same name if you create the tables in
     * different regions.
     * </p>
     * <p>
     * <code>CreateTable</code> is an asynchronous operation. Upon receiving a
     * <code>CreateTable</code> request, DynamoDB immediately returns a response
     * with a <code>TableStatus</code> of <code>CREATING</code>. After the table
     * is created, DynamoDB sets the <code>TableStatus</code> to
     * <code>ACTIVE</code>. You can perform read and write operations only on an
     * <code>ACTIVE</code> table.
     * </p>
     * <p>
     * You can optionally define secondary indexes on the new table, as part of
     * the <code>CreateTable</code> operation. If you want to create multiple
     * tables with secondary indexes on them, you must create the tables
     * sequentially. Only one table with secondary indexes can be in the
     * <code>CREATING</code> state at any given time.
     * </p>
     * <p>
     * You can use the <code>DescribeTable</code> action to check the table
     * status.
     * </p>
     * 
     * @param createTableRequest <p>
     *            Represents the input of a <code>CreateTable</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the CreateTable
     *         service method, as returned by Amazon DynamoDB.
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>CreateTable</code> operation adds a new table to your account.
     * In an AWS account, table names must be unique within each region. That
     * is, you can have two tables with same name if you create the tables in
     * different regions.
     * </p>
     * <p>
     * <code>CreateTable</code> is an asynchronous operation. Upon receiving a
     * <code>CreateTable</code> request, DynamoDB immediately returns a response
     * with a <code>TableStatus</code> of <code>CREATING</code>. After the table
     * is created, DynamoDB sets the <code>TableStatus</code> to
     * <code>ACTIVE</code>. You can perform read and write operations only on an
     * <code>ACTIVE</code> table.
     * </p>
     * <p>
     * You can optionally define secondary indexes on the new table, as part of
     * the <code>CreateTable</code> operation. If you want to create multiple
     * tables with secondary indexes on them, you must create the tables
     * sequentially. Only one table with secondary indexes can be in the
     * <code>CREATING</code> state at any given time.
     * </p>
     * <p>
     * You can use the <code>DescribeTable</code> action to check the table
     * status.
     * </p>
     * 
     * @param createTableRequest <p>
     *            Represents the input of a <code>CreateTable</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the CreateTable
     *         service method, as returned by Amazon DynamoDB.
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest,
            AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DeleteBackup</code> at a maximum rate of 10 times per
     * second.
     * </p>
     * 
     * @param deleteBackupRequest
     * @return A Java Future object containing the response from the
     *         DeleteBackup service method, as returned by Amazon DynamoDB.
     * @throws BackupNotFoundException
     * @throws BackupInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DeleteBackup</code> at a maximum rate of 10 times per
     * second.
     * </p>
     * 
     * @param deleteBackupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteBackup service method, as returned by Amazon DynamoDB.
     * @throws BackupNotFoundException
     * @throws BackupInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest,
            AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a single item in a table by primary key. You can perform a
     * conditional delete operation that deletes the item if it exists, or if it
     * has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's attribute
     * values in the same operation, using the <code>ReturnValues</code>
     * parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <code>DeleteItem</code> is an
     * idempotent operation; running it multiple times on the same item or
     * attribute does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for deleting items only if specific
     * conditions are met. If those conditions are met, DynamoDB performs the
     * delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param deleteItemRequest <p>
     *            Represents the input of a <code>DeleteItem</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the DeleteItem
     *         service method, as returned by Amazon DynamoDB.
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ItemCollectionSizeLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteItemResult> deleteItemAsync(DeleteItemRequest deleteItemRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a single item in a table by primary key. You can perform a
     * conditional delete operation that deletes the item if it exists, or if it
     * has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's attribute
     * values in the same operation, using the <code>ReturnValues</code>
     * parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <code>DeleteItem</code> is an
     * idempotent operation; running it multiple times on the same item or
     * attribute does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for deleting items only if specific
     * conditions are met. If those conditions are met, DynamoDB performs the
     * delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param deleteItemRequest <p>
     *            Represents the input of a <code>DeleteItem</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the DeleteItem
     *         service method, as returned by Amazon DynamoDB.
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ItemCollectionSizeLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteItemResult> deleteItemAsync(DeleteItemRequest deleteItemRequest,
            AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>DeleteTable</code> operation deletes a table and all of its
     * items. After a <code>DeleteTable</code> request, the specified table is
     * in the <code>DELETING</code> state until DynamoDB completes the deletion.
     * If the table is in the <code>ACTIVE</code> state, you can delete it. If a
     * table is in <code>CREATING</code> or <code>UPDATING</code> states, then
     * DynamoDB returns a <code>ResourceInUseException</code>. If the specified
     * table does not exist, DynamoDB returns a
     * <code>ResourceNotFoundException</code>. If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <note>
     * <p>
     * DynamoDB might continue to accept data read and write operations, such as
     * <code>GetItem</code> and <code>PutItem</code>, on a table in the
     * <code>DELETING</code> state until the table deletion is complete.
     * </p>
     * </note>
     * <p>
     * When you delete a table, any indexes on that table are also deleted.
     * </p>
     * <p>
     * If you have DynamoDB Streams enabled on the table, then the corresponding
     * stream on that table goes into the <code>DISABLED</code> state, and the
     * stream is automatically deleted after 24 hours.
     * </p>
     * <p>
     * Use the <code>DescribeTable</code> action to check the status of the
     * table.
     * </p>
     * 
     * @param deleteTableRequest <p>
     *            Represents the input of a <code>DeleteTable</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the DeleteTable
     *         service method, as returned by Amazon DynamoDB.
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>DeleteTable</code> operation deletes a table and all of its
     * items. After a <code>DeleteTable</code> request, the specified table is
     * in the <code>DELETING</code> state until DynamoDB completes the deletion.
     * If the table is in the <code>ACTIVE</code> state, you can delete it. If a
     * table is in <code>CREATING</code> or <code>UPDATING</code> states, then
     * DynamoDB returns a <code>ResourceInUseException</code>. If the specified
     * table does not exist, DynamoDB returns a
     * <code>ResourceNotFoundException</code>. If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <note>
     * <p>
     * DynamoDB might continue to accept data read and write operations, such as
     * <code>GetItem</code> and <code>PutItem</code>, on a table in the
     * <code>DELETING</code> state until the table deletion is complete.
     * </p>
     * </note>
     * <p>
     * When you delete a table, any indexes on that table are also deleted.
     * </p>
     * <p>
     * If you have DynamoDB Streams enabled on the table, then the corresponding
     * stream on that table goes into the <code>DISABLED</code> state, and the
     * stream is automatically deleted after 24 hours.
     * </p>
     * <p>
     * Use the <code>DescribeTable</code> action to check the status of the
     * table.
     * </p>
     * 
     * @param deleteTableRequest <p>
     *            Represents the input of a <code>DeleteTable</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the DeleteTable
     *         service method, as returned by Amazon DynamoDB.
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest,
            AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DescribeBackup</code> at a maximum rate of 10 times
     * per second.
     * </p>
     * 
     * @param describeBackupRequest
     * @return A Java Future object containing the response from the
     *         DescribeBackup service method, as returned by Amazon DynamoDB.
     * @throws BackupNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeBackupResult> describeBackupAsync(DescribeBackupRequest describeBackupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DescribeBackup</code> at a maximum rate of 10 times
     * per second.
     * </p>
     * 
     * @param describeBackupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeBackup service method, as returned by Amazon DynamoDB.
     * @throws BackupNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeBackupResult> describeBackupAsync(DescribeBackupRequest describeBackupRequest,
            AsyncHandler<DescribeBackupRequest, DescribeBackupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Checks the status of continuous backups and point in time recovery on the
     * specified table. Continuous backups are <code>ENABLED</code> on all
     * tables at table creation. If point in time recovery is enabled,
     * <code>PointInTimeRecoveryStatus</code> will be set to ENABLED.
     * </p>
     * <p>
     * Once continuous backups and point in time recovery are enabled, you can
     * restore to any point in time within
     * <code>EarliestRestorableDateTime</code> and
     * <code>LatestRestorableDateTime</code>.
     * </p>
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time. You can restore your table to any point in time during the
     * last 35 days.
     * </p>
     * <p>
     * You can call <code>DescribeContinuousBackups</code> at a maximum rate of
     * 10 times per second.
     * </p>
     * 
     * @param describeContinuousBackupsRequest
     * @return A Java Future object containing the response from the
     *         DescribeContinuousBackups service method, as returned by Amazon
     *         DynamoDB.
     * @throws TableNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContinuousBackupsResult> describeContinuousBackupsAsync(
            DescribeContinuousBackupsRequest describeContinuousBackupsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Checks the status of continuous backups and point in time recovery on the
     * specified table. Continuous backups are <code>ENABLED</code> on all
     * tables at table creation. If point in time recovery is enabled,
     * <code>PointInTimeRecoveryStatus</code> will be set to ENABLED.
     * </p>
     * <p>
     * Once continuous backups and point in time recovery are enabled, you can
     * restore to any point in time within
     * <code>EarliestRestorableDateTime</code> and
     * <code>LatestRestorableDateTime</code>.
     * </p>
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time. You can restore your table to any point in time during the
     * last 35 days.
     * </p>
     * <p>
     * You can call <code>DescribeContinuousBackups</code> at a maximum rate of
     * 10 times per second.
     * </p>
     * 
     * @param describeContinuousBackupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeContinuousBackups service method, as returned by Amazon
     *         DynamoDB.
     * @throws TableNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeContinuousBackupsResult> describeContinuousBackupsAsync(
            DescribeContinuousBackupsRequest describeContinuousBackupsRequest,
            AsyncHandler<DescribeContinuousBackupsRequest, DescribeContinuousBackupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * @param describeEndpointsRequest
     * @return A Java Future object containing the response from the
     *         DescribeEndpoints service method, as returned by Amazon DynamoDB.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEndpointsResult> describeEndpointsAsync(
            DescribeEndpointsRequest describeEndpointsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * @param describeEndpointsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeEndpoints service method, as returned by Amazon DynamoDB.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEndpointsResult> describeEndpointsAsync(
            DescribeEndpointsRequest describeEndpointsRequest,
            AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the specified global table.
     * </p>
     * 
     * @param describeGlobalTableRequest
     * @return A Java Future object containing the response from the
     *         DescribeGlobalTable service method, as returned by Amazon
     *         DynamoDB.
     * @throws InternalServerErrorException
     * @throws GlobalTableNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeGlobalTableResult> describeGlobalTableAsync(
            DescribeGlobalTableRequest describeGlobalTableRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns information about the specified global table.
     * </p>
     * 
     * @param describeGlobalTableRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeGlobalTable service method, as returned by Amazon
     *         DynamoDB.
     * @throws InternalServerErrorException
     * @throws GlobalTableNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeGlobalTableResult> describeGlobalTableAsync(
            DescribeGlobalTableRequest describeGlobalTableRequest,
            AsyncHandler<DescribeGlobalTableRequest, DescribeGlobalTableResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes region specific settings for a global table.
     * </p>
     * 
     * @param describeGlobalTableSettingsRequest
     * @return A Java Future object containing the response from the
     *         DescribeGlobalTableSettings service method, as returned by Amazon
     *         DynamoDB.
     * @throws GlobalTableNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeGlobalTableSettingsResult> describeGlobalTableSettingsAsync(
            DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes region specific settings for a global table.
     * </p>
     * 
     * @param describeGlobalTableSettingsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeGlobalTableSettings service method, as returned by Amazon
     *         DynamoDB.
     * @throws GlobalTableNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeGlobalTableSettingsResult> describeGlobalTableSettingsAsync(
            DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest,
            AsyncHandler<DescribeGlobalTableSettingsRequest, DescribeGlobalTableSettingsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current provisioned-capacity limits for your AWS account in a
     * region, both for the region as a whole and for any one DynamoDB table
     * that you create there.
     * </p>
     * <p>
     * When you establish an AWS account, the account has initial limits on the
     * maximum read capacity units and write capacity units that you can
     * provision across all of your DynamoDB tables in a given region. Also,
     * there are per-table limits that apply when you create a table there. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> page in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Although you can increase these limits by filing a case at <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support
     * Center</a>, obtaining the increase is not instantaneous. The
     * <code>DescribeLimits</code> action lets you write code to compare the
     * capacity you are currently using to those limits imposed by your account
     * so that you have enough time to apply for an increase before you hit a
     * limit.
     * </p>
     * <p>
     * For example, you could use one of the AWS SDKs to do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <code>DescribeLimits</code> for a particular region to obtain your
     * current account limits on provisioned capacity there.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a variable to hold the aggregate read capacity units provisioned
     * for all your tables in that region, and one to hold the aggregate write
     * capacity units. Zero them both.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>ListTables</code> to obtain a list of all your DynamoDB
     * tables.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each table name listed by <code>ListTables</code>, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Call <code>DescribeTable</code> with the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the data returned by <code>DescribeTable</code> to add the read
     * capacity units and write capacity units provisioned for the table itself
     * to your variables.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the table has one or more global secondary indexes (GSIs), loop over
     * these GSIs and add their provisioned capacity values to your variables as
     * well.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Report the account limits for that region returned by
     * <code>DescribeLimits</code>, along with the total current provisioned
     * capacity levels you have calculated.
     * </p>
     * </li>
     * </ol>
     * <p>
     * This will let you see whether you are getting close to your account-level
     * limits.
     * </p>
     * <p>
     * The per-table limits apply only when you are creating a new table. They
     * restrict the sum of the provisioned capacity of the new table itself and
     * all its global secondary indexes.
     * </p>
     * <p>
     * For existing tables and their GSIs, DynamoDB will not let you increase
     * provisioned capacity extremely rapidly, but the only upper limit that
     * applies is that the aggregate provisioned capacity over all your tables
     * and GSIs cannot exceed either of the per-account limits.
     * </p>
     * <note>
     * <p>
     * <code>DescribeLimits</code> should only be called periodically. You can
     * expect throttling errors if you call it more than once in a minute.
     * </p>
     * </note>
     * <p>
     * The <code>DescribeLimits</code> Request element has no content.
     * </p>
     * 
     * @param describeLimitsRequest <p>
     *            Represents the input of a <code>DescribeLimits</code>
     *            operation. Has no content.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeLimits service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest describeLimitsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current provisioned-capacity limits for your AWS account in a
     * region, both for the region as a whole and for any one DynamoDB table
     * that you create there.
     * </p>
     * <p>
     * When you establish an AWS account, the account has initial limits on the
     * maximum read capacity units and write capacity units that you can
     * provision across all of your DynamoDB tables in a given region. Also,
     * there are per-table limits that apply when you create a table there. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> page in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Although you can increase these limits by filing a case at <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support
     * Center</a>, obtaining the increase is not instantaneous. The
     * <code>DescribeLimits</code> action lets you write code to compare the
     * capacity you are currently using to those limits imposed by your account
     * so that you have enough time to apply for an increase before you hit a
     * limit.
     * </p>
     * <p>
     * For example, you could use one of the AWS SDKs to do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <code>DescribeLimits</code> for a particular region to obtain your
     * current account limits on provisioned capacity there.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a variable to hold the aggregate read capacity units provisioned
     * for all your tables in that region, and one to hold the aggregate write
     * capacity units. Zero them both.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>ListTables</code> to obtain a list of all your DynamoDB
     * tables.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each table name listed by <code>ListTables</code>, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Call <code>DescribeTable</code> with the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the data returned by <code>DescribeTable</code> to add the read
     * capacity units and write capacity units provisioned for the table itself
     * to your variables.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the table has one or more global secondary indexes (GSIs), loop over
     * these GSIs and add their provisioned capacity values to your variables as
     * well.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Report the account limits for that region returned by
     * <code>DescribeLimits</code>, along with the total current provisioned
     * capacity levels you have calculated.
     * </p>
     * </li>
     * </ol>
     * <p>
     * This will let you see whether you are getting close to your account-level
     * limits.
     * </p>
     * <p>
     * The per-table limits apply only when you are creating a new table. They
     * restrict the sum of the provisioned capacity of the new table itself and
     * all its global secondary indexes.
     * </p>
     * <p>
     * For existing tables and their GSIs, DynamoDB will not let you increase
     * provisioned capacity extremely rapidly, but the only upper limit that
     * applies is that the aggregate provisioned capacity over all your tables
     * and GSIs cannot exceed either of the per-account limits.
     * </p>
     * <note>
     * <p>
     * <code>DescribeLimits</code> should only be called periodically. You can
     * expect throttling errors if you call it more than once in a minute.
     * </p>
     * </note>
     * <p>
     * The <code>DescribeLimits</code> Request element has no content.
     * </p>
     * 
     * @param describeLimitsRequest <p>
     *            Represents the input of a <code>DescribeLimits</code>
     *            operation. Has no content.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeLimits service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest describeLimitsRequest,
            AsyncHandler<DescribeLimitsRequest, DescribeLimitsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the table, including the current status of the
     * table, when it was created, the primary key schema, and any indexes on
     * the table.
     * </p>
     * <note>
     * <p>
     * If you issue a <code>DescribeTable</code> request immediately after a
     * <code>CreateTable</code> request, DynamoDB might return a
     * <code>ResourceNotFoundException</code>. This is because
     * <code>DescribeTable</code> uses an eventually consistent query, and the
     * metadata for your table might not be available at that moment. Wait for a
     * few seconds, and then try the <code>DescribeTable</code> request again.
     * </p>
     * </note>
     * 
     * @param describeTableRequest <p>
     *            Represents the input of a <code>DescribeTable</code>
     *            operation.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeTable service method, as returned by Amazon DynamoDB.
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTableResult> describeTableAsync(DescribeTableRequest describeTableRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the table, including the current status of the
     * table, when it was created, the primary key schema, and any indexes on
     * the table.
     * </p>
     * <note>
     * <p>
     * If you issue a <code>DescribeTable</code> request immediately after a
     * <code>CreateTable</code> request, DynamoDB might return a
     * <code>ResourceNotFoundException</code>. This is because
     * <code>DescribeTable</code> uses an eventually consistent query, and the
     * metadata for your table might not be available at that moment. Wait for a
     * few seconds, and then try the <code>DescribeTable</code> request again.
     * </p>
     * </note>
     * 
     * @param describeTableRequest <p>
     *            Represents the input of a <code>DescribeTable</code>
     *            operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeTable service method, as returned by Amazon DynamoDB.
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTableResult> describeTableAsync(DescribeTableRequest describeTableRequest,
            AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gives a description of the Time to Live (TTL) status on the specified
     * table.
     * </p>
     * 
     * @param describeTimeToLiveRequest
     * @return A Java Future object containing the response from the
     *         DescribeTimeToLive service method, as returned by Amazon
     *         DynamoDB.
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(
            DescribeTimeToLiveRequest describeTimeToLiveRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Gives a description of the Time to Live (TTL) status on the specified
     * table.
     * </p>
     * 
     * @param describeTimeToLiveRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeTimeToLive service method, as returned by Amazon
     *         DynamoDB.
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(
            DescribeTimeToLiveRequest describeTimeToLiveRequest,
            AsyncHandler<DescribeTimeToLiveRequest, DescribeTimeToLiveResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>GetItem</code> operation returns a set of attributes for the
     * item with the given primary key. If there is no matching item,
     * <code>GetItem</code> does not return any data and there will be no
     * <code>Item</code> element in the response.
     * </p>
     * <p>
     * <code>GetItem</code> provides an eventually consistent read by default.
     * If your application requires a strongly consistent read, set
     * <code>ConsistentRead</code> to <code>true</code>. Although a strongly
     * consistent read might take more time than an eventually consistent read,
     * it always returns the last updated value.
     * </p>
     * 
     * @param getItemRequest <p>
     *            Represents the input of a <code>GetItem</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the GetItem
     *         service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetItemResult> getItemAsync(GetItemRequest getItemRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>GetItem</code> operation returns a set of attributes for the
     * item with the given primary key. If there is no matching item,
     * <code>GetItem</code> does not return any data and there will be no
     * <code>Item</code> element in the response.
     * </p>
     * <p>
     * <code>GetItem</code> provides an eventually consistent read by default.
     * If your application requires a strongly consistent read, set
     * <code>ConsistentRead</code> to <code>true</code>. Although a strongly
     * consistent read might take more time than an eventually consistent read,
     * it always returns the last updated value.
     * </p>
     * 
     * @param getItemRequest <p>
     *            Represents the input of a <code>GetItem</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the GetItem
     *         service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetItemResult> getItemAsync(GetItemRequest getItemRequest,
            AsyncHandler<GetItemRequest, GetItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List backups associated with an AWS account. To list backups for a given
     * table, specify <code>TableName</code>. <code>ListBackups</code> returns a
     * paginated list of results with at most 1MB worth of items in a page. You
     * can also specify a limit for the maximum number of entries to be returned
     * in a page.
     * </p>
     * <p>
     * In the request, start time is inclusive but end time is exclusive. Note
     * that these limits are for the time at which the original backup was
     * requested.
     * </p>
     * <p>
     * You can call <code>ListBackups</code> a maximum of 5 times per second.
     * </p>
     * 
     * @param listBackupsRequest
     * @return A Java Future object containing the response from the ListBackups
     *         service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListBackupsResult> listBackupsAsync(ListBackupsRequest listBackupsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List backups associated with an AWS account. To list backups for a given
     * table, specify <code>TableName</code>. <code>ListBackups</code> returns a
     * paginated list of results with at most 1MB worth of items in a page. You
     * can also specify a limit for the maximum number of entries to be returned
     * in a page.
     * </p>
     * <p>
     * In the request, start time is inclusive but end time is exclusive. Note
     * that these limits are for the time at which the original backup was
     * requested.
     * </p>
     * <p>
     * You can call <code>ListBackups</code> a maximum of 5 times per second.
     * </p>
     * 
     * @param listBackupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListBackups
     *         service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListBackupsResult> listBackupsAsync(ListBackupsRequest listBackupsRequest,
            AsyncHandler<ListBackupsRequest, ListBackupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all global tables that have a replica in the specified region.
     * </p>
     * 
     * @param listGlobalTablesRequest
     * @return A Java Future object containing the response from the
     *         ListGlobalTables service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListGlobalTablesResult> listGlobalTablesAsync(
            ListGlobalTablesRequest listGlobalTablesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists all global tables that have a replica in the specified region.
     * </p>
     * 
     * @param listGlobalTablesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListGlobalTables service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListGlobalTablesResult> listGlobalTablesAsync(
            ListGlobalTablesRequest listGlobalTablesRequest,
            AsyncHandler<ListGlobalTablesRequest, ListGlobalTablesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns an array of table names associated with the current account and
     * endpoint. The output from <code>ListTables</code> is paginated, with each
     * page returning a maximum of 100 table names.
     * </p>
     * 
     * @param listTablesRequest <p>
     *            Represents the input of a <code>ListTables</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the ListTables
     *         service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns an array of table names associated with the current account and
     * endpoint. The output from <code>ListTables</code> is paginated, with each
     * page returning a maximum of 100 table names.
     * </p>
     * 
     * @param listTablesRequest <p>
     *            Represents the input of a <code>ListTables</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListTables
     *         service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest,
            AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List all tags on an Amazon DynamoDB resource. You can call
     * ListTagsOfResource up to 10 times per second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html"
     * >Tagging for DynamoDB</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param listTagsOfResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsOfResource service method, as returned by Amazon
     *         DynamoDB.
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsOfResourceResult> listTagsOfResourceAsync(
            ListTagsOfResourceRequest listTagsOfResourceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * List all tags on an Amazon DynamoDB resource. You can call
     * ListTagsOfResource up to 10 times per second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html"
     * >Tagging for DynamoDB</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param listTagsOfResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTagsOfResource service method, as returned by Amazon
     *         DynamoDB.
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsOfResourceResult> listTagsOfResourceAsync(
            ListTagsOfResourceRequest listTagsOfResourceRequest,
            AsyncHandler<ListTagsOfResourceRequest, ListTagsOfResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new item, or replaces an old item with a new item. If an item
     * that has the same primary key as the new item already exists in the
     * specified table, the new item completely replaces the existing item. You
     * can perform a conditional put operation (add a new item if one with the
     * specified primary key doesn't exist), or replace an existing item if it
     * has certain attribute values. You can return the item's attribute values
     * in the same operation, using the <code>ReturnValues</code> parameter.
     * </p>
     * <important>
     * <p>
     * This topic provides general information about the <code>PutItem</code>
     * API.
     * </p>
     * <p>
     * For information on how to call the <code>PutItem</code> API using the AWS
     * SDK in specific languages, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/goto/aws-cli/dynamodb-2012-08-10/PutItem">
     * PutItem in the AWS Command Line Interface </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/goto/DotNetSDKV3/dynamodb-2012-08-10/PutItem"
     * > PutItem in the AWS SDK for .NET </a>
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
     * "http://docs.aws.amazon.com/goto/SdkForPHPV3/dynamodb-2012-08-10/PutItem"
     * > PutItem in the AWS SDK for PHP V3 </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/goto/boto3/dynamodb-2012-08-10/PutItem">
     * PutItem in the AWS SDK for Python </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/goto/SdkForRubyV2/dynamodb-2012-08-10/PutItem"
     * > PutItem in the AWS SDK for Ruby V2 </a>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * When you add an item, the primary key attribute(s) are the only required
     * attributes. Attribute values cannot be null. String and Binary type
     * attributes must have lengths greater than zero. Set type attributes
     * cannot be empty. Requests with empty values will be rejected with a
     * <code>ValidationException</code> exception.
     * </p>
     * <note>
     * <p>
     * To prevent a new item from replacing an existing item, use a conditional
     * expression that contains the <code>attribute_not_exists</code> function
     * with the name of the attribute being used as the partition key for the
     * table. Since every record must contain that attribute, the
     * <code>attribute_not_exists</code> function will only succeed if no
     * matching item exists.
     * </p>
     * </note>
     * <p>
     * For more information about <code>PutItem</code>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"
     * >Working with Items</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param putItemRequest <p>
     *            Represents the input of a <code>PutItem</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the PutItem
     *         service method, as returned by Amazon DynamoDB.
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ItemCollectionSizeLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<PutItemResult> putItemAsync(PutItemRequest putItemRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new item, or replaces an old item with a new item. If an item
     * that has the same primary key as the new item already exists in the
     * specified table, the new item completely replaces the existing item. You
     * can perform a conditional put operation (add a new item if one with the
     * specified primary key doesn't exist), or replace an existing item if it
     * has certain attribute values. You can return the item's attribute values
     * in the same operation, using the <code>ReturnValues</code> parameter.
     * </p>
     * <important>
     * <p>
     * This topic provides general information about the <code>PutItem</code>
     * API.
     * </p>
     * <p>
     * For information on how to call the <code>PutItem</code> API using the AWS
     * SDK in specific languages, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/goto/aws-cli/dynamodb-2012-08-10/PutItem">
     * PutItem in the AWS Command Line Interface </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/goto/DotNetSDKV3/dynamodb-2012-08-10/PutItem"
     * > PutItem in the AWS SDK for .NET </a>
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
     * "http://docs.aws.amazon.com/goto/SdkForPHPV3/dynamodb-2012-08-10/PutItem"
     * > PutItem in the AWS SDK for PHP V3 </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/goto/boto3/dynamodb-2012-08-10/PutItem">
     * PutItem in the AWS SDK for Python </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/goto/SdkForRubyV2/dynamodb-2012-08-10/PutItem"
     * > PutItem in the AWS SDK for Ruby V2 </a>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * When you add an item, the primary key attribute(s) are the only required
     * attributes. Attribute values cannot be null. String and Binary type
     * attributes must have lengths greater than zero. Set type attributes
     * cannot be empty. Requests with empty values will be rejected with a
     * <code>ValidationException</code> exception.
     * </p>
     * <note>
     * <p>
     * To prevent a new item from replacing an existing item, use a conditional
     * expression that contains the <code>attribute_not_exists</code> function
     * with the name of the attribute being used as the partition key for the
     * table. Since every record must contain that attribute, the
     * <code>attribute_not_exists</code> function will only succeed if no
     * matching item exists.
     * </p>
     * </note>
     * <p>
     * For more information about <code>PutItem</code>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"
     * >Working with Items</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param putItemRequest <p>
     *            Represents the input of a <code>PutItem</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the PutItem
     *         service method, as returned by Amazon DynamoDB.
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ItemCollectionSizeLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<PutItemResult> putItemAsync(PutItemRequest putItemRequest,
            AsyncHandler<PutItemRequest, PutItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>Query</code> operation finds items based on primary key values.
     * You can query any table or secondary index that has a composite primary
     * key (a partition key and a sort key).
     * </p>
     * <p>
     * Use the <code>KeyConditionExpression</code> parameter to provide a
     * specific value for the partition key. The <code>Query</code> operation
     * will return all of the items from the table or index with that partition
     * key value. You can optionally narrow the scope of the <code>Query</code>
     * operation by specifying a sort key value and a comparison operator in
     * <code>KeyConditionExpression</code>. To further refine the
     * <code>Query</code> results, you can optionally provide a
     * <code>FilterExpression</code>. A <code>FilterExpression</code> determines
     * which items within the results should be returned to you. All of the
     * other results are discarded.
     * </p>
     * <p>
     * A <code>Query</code> operation always returns a result set. If no
     * matching items are found, the result set will be empty. Queries that do
     * not return results consume the minimum number of read capacity units for
     * that type of read operation.
     * </p>
     * <note>
     * <p>
     * DynamoDB calculates the number of read capacity units consumed based on
     * item size, not on the amount of data that is returned to an application.
     * The number of capacity units consumed will be the same whether you
     * request all of the attributes (the default behavior) or just some of them
     * (using a projection expression). The number will also be the same whether
     * or not you use a <code>FilterExpression</code>.
     * </p>
     * </note>
     * <p>
     * <code>Query</code> results are always sorted by the sort key value. If
     * the data type of the sort key is Number, the results are returned in
     * numeric order; otherwise, the results are returned in order of UTF-8
     * bytes. By default, the sort order is ascending. To reverse the order, set
     * the <code>ScanIndexForward</code> parameter to false.
     * </p>
     * <p>
     * A single <code>Query</code> operation will read up to the maximum number
     * of items set (if using the <code>Limit</code> parameter) or a maximum of
     * 1 MB of data and then apply any filtering to the results using
     * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is
     * present in the response, you will need to paginate the result set. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Query.html#Query.Pagination"
     * >Paginating the Results</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * <code>FilterExpression</code> is applied after a <code>Query</code>
     * finishes, but before the results are returned. A
     * <code>FilterExpression</code> cannot contain partition key or sort key
     * attributes. You need to specify those attributes in the
     * <code>KeyConditionExpression</code>.
     * </p>
     * <note>
     * <p>
     * A <code>Query</code> operation can return an empty result set and a
     * <code>LastEvaluatedKey</code> if all the items read for the page of
     * results are filtered out.
     * </p>
     * </note>
     * <p>
     * You can query a table, a local secondary index, or a global secondary
     * index. For a query on a table or on a local secondary index, you can set
     * the <code>ConsistentRead</code> parameter to <code>true</code> and obtain
     * a strongly consistent result. Global secondary indexes support eventually
     * consistent reads only, so do not specify <code>ConsistentRead</code> when
     * querying a global secondary index.
     * </p>
     * 
     * @param queryRequest <p>
     *            Represents the input of a <code>Query</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the Query
     *         service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<QueryResult> queryAsync(QueryRequest queryRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * The <code>Query</code> operation finds items based on primary key values.
     * You can query any table or secondary index that has a composite primary
     * key (a partition key and a sort key).
     * </p>
     * <p>
     * Use the <code>KeyConditionExpression</code> parameter to provide a
     * specific value for the partition key. The <code>Query</code> operation
     * will return all of the items from the table or index with that partition
     * key value. You can optionally narrow the scope of the <code>Query</code>
     * operation by specifying a sort key value and a comparison operator in
     * <code>KeyConditionExpression</code>. To further refine the
     * <code>Query</code> results, you can optionally provide a
     * <code>FilterExpression</code>. A <code>FilterExpression</code> determines
     * which items within the results should be returned to you. All of the
     * other results are discarded.
     * </p>
     * <p>
     * A <code>Query</code> operation always returns a result set. If no
     * matching items are found, the result set will be empty. Queries that do
     * not return results consume the minimum number of read capacity units for
     * that type of read operation.
     * </p>
     * <note>
     * <p>
     * DynamoDB calculates the number of read capacity units consumed based on
     * item size, not on the amount of data that is returned to an application.
     * The number of capacity units consumed will be the same whether you
     * request all of the attributes (the default behavior) or just some of them
     * (using a projection expression). The number will also be the same whether
     * or not you use a <code>FilterExpression</code>.
     * </p>
     * </note>
     * <p>
     * <code>Query</code> results are always sorted by the sort key value. If
     * the data type of the sort key is Number, the results are returned in
     * numeric order; otherwise, the results are returned in order of UTF-8
     * bytes. By default, the sort order is ascending. To reverse the order, set
     * the <code>ScanIndexForward</code> parameter to false.
     * </p>
     * <p>
     * A single <code>Query</code> operation will read up to the maximum number
     * of items set (if using the <code>Limit</code> parameter) or a maximum of
     * 1 MB of data and then apply any filtering to the results using
     * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is
     * present in the response, you will need to paginate the result set. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Query.html#Query.Pagination"
     * >Paginating the Results</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * <code>FilterExpression</code> is applied after a <code>Query</code>
     * finishes, but before the results are returned. A
     * <code>FilterExpression</code> cannot contain partition key or sort key
     * attributes. You need to specify those attributes in the
     * <code>KeyConditionExpression</code>.
     * </p>
     * <note>
     * <p>
     * A <code>Query</code> operation can return an empty result set and a
     * <code>LastEvaluatedKey</code> if all the items read for the page of
     * results are filtered out.
     * </p>
     * </note>
     * <p>
     * You can query a table, a local secondary index, or a global secondary
     * index. For a query on a table or on a local secondary index, you can set
     * the <code>ConsistentRead</code> parameter to <code>true</code> and obtain
     * a strongly consistent result. Global secondary indexes support eventually
     * consistent reads only, so do not specify <code>ConsistentRead</code> when
     * querying a global secondary index.
     * </p>
     * 
     * @param queryRequest <p>
     *            Represents the input of a <code>Query</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the Query
     *         service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<QueryResult> queryAsync(QueryRequest queryRequest,
            AsyncHandler<QueryRequest, QueryResult> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a new table from an existing backup. Any number of users can
     * execute up to 4 concurrent restores (any type of restore) in a given
     * account.
     * </p>
     * <p>
     * You can call <code>RestoreTableFromBackup</code> at a maximum rate of 10
     * times per second.
     * </p>
     * <p>
     * You must manually set up the following on the restored table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto scaling policies
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM policies
     * </p>
     * </li>
     * <li>
     * <p>
     * Cloudwatch metrics and alarms
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Time to Live (TTL) settings
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTableFromBackupRequest
     * @return A Java Future object containing the response from the
     *         RestoreTableFromBackup service method, as returned by Amazon
     *         DynamoDB.
     * @throws TableAlreadyExistsException
     * @throws TableInUseException
     * @throws BackupNotFoundException
     * @throws BackupInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<RestoreTableFromBackupResult> restoreTableFromBackupAsync(
            RestoreTableFromBackupRequest restoreTableFromBackupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new table from an existing backup. Any number of users can
     * execute up to 4 concurrent restores (any type of restore) in a given
     * account.
     * </p>
     * <p>
     * You can call <code>RestoreTableFromBackup</code> at a maximum rate of 10
     * times per second.
     * </p>
     * <p>
     * You must manually set up the following on the restored table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto scaling policies
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM policies
     * </p>
     * </li>
     * <li>
     * <p>
     * Cloudwatch metrics and alarms
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Time to Live (TTL) settings
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTableFromBackupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RestoreTableFromBackup service method, as returned by Amazon
     *         DynamoDB.
     * @throws TableAlreadyExistsException
     * @throws TableInUseException
     * @throws BackupNotFoundException
     * @throws BackupInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<RestoreTableFromBackupResult> restoreTableFromBackupAsync(
            RestoreTableFromBackupRequest restoreTableFromBackupRequest,
            AsyncHandler<RestoreTableFromBackupRequest, RestoreTableFromBackupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Restores the specified table to the specified point in time within
     * <code>EarliestRestorableDateTime</code> and
     * <code>LatestRestorableDateTime</code>. You can restore your table to any
     * point in time during the last 35 days. Any number of users can execute up
     * to 4 concurrent restores (any type of restore) in a given account.
     * </p>
     * <p>
     * When you restore using point in time recovery, DynamoDB restores your
     * table data to the state based on the selected date and time
     * (day:hour:minute:second) to a new table.
     * </p>
     * <p>
     * Along with data, the following are also included on the new restored
     * table using point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Global secondary indexes (GSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Local secondary indexes (LSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned read and write capacity
     * </p>
     * </li>
     * <li>
     * <p>
     * Encryption settings
     * </p>
     * <important>
     * <p>
     * All these settings come from the current settings of the source table at
     * the time of restore.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You must manually set up the following on the restored table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto scaling policies
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM policies
     * </p>
     * </li>
     * <li>
     * <p>
     * Cloudwatch metrics and alarms
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Time to Live (TTL) settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Point in time recovery settings
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTableToPointInTimeRequest
     * @return A Java Future object containing the response from the
     *         RestoreTableToPointInTime service method, as returned by Amazon
     *         DynamoDB.
     * @throws TableAlreadyExistsException
     * @throws TableNotFoundException
     * @throws TableInUseException
     * @throws LimitExceededException
     * @throws InvalidRestoreTimeException
     * @throws PointInTimeRecoveryUnavailableException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<RestoreTableToPointInTimeResult> restoreTableToPointInTimeAsync(
            RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Restores the specified table to the specified point in time within
     * <code>EarliestRestorableDateTime</code> and
     * <code>LatestRestorableDateTime</code>. You can restore your table to any
     * point in time during the last 35 days. Any number of users can execute up
     * to 4 concurrent restores (any type of restore) in a given account.
     * </p>
     * <p>
     * When you restore using point in time recovery, DynamoDB restores your
     * table data to the state based on the selected date and time
     * (day:hour:minute:second) to a new table.
     * </p>
     * <p>
     * Along with data, the following are also included on the new restored
     * table using point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Global secondary indexes (GSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Local secondary indexes (LSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned read and write capacity
     * </p>
     * </li>
     * <li>
     * <p>
     * Encryption settings
     * </p>
     * <important>
     * <p>
     * All these settings come from the current settings of the source table at
     * the time of restore.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You must manually set up the following on the restored table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto scaling policies
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM policies
     * </p>
     * </li>
     * <li>
     * <p>
     * Cloudwatch metrics and alarms
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Time to Live (TTL) settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Point in time recovery settings
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTableToPointInTimeRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RestoreTableToPointInTime service method, as returned by Amazon
     *         DynamoDB.
     * @throws TableAlreadyExistsException
     * @throws TableNotFoundException
     * @throws TableInUseException
     * @throws LimitExceededException
     * @throws InvalidRestoreTimeException
     * @throws PointInTimeRecoveryUnavailableException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<RestoreTableToPointInTimeResult> restoreTableToPointInTimeAsync(
            RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest,
            AsyncHandler<RestoreTableToPointInTimeRequest, RestoreTableToPointInTimeResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>Scan</code> operation returns one or more items and item
     * attributes by accessing every item in a table or a secondary index. To
     * have DynamoDB return fewer items, you can provide a
     * <code>FilterExpression</code> operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set size
     * limit of 1 MB, the scan stops and results are returned to the user as a
     * <code>LastEvaluatedKey</code> value to continue the scan in a subsequent
     * operation. The results also include the number of items exceeding the
     * limit. A scan can result in no table data meeting the filter criteria.
     * </p>
     * <p>
     * A single <code>Scan</code> operation will read up to the maximum number
     * of items set (if using the <code>Limit</code> parameter) or a maximum of
     * 1 MB of data and then apply any filtering to the results using
     * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is
     * present in the response, you will need to paginate the result set. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.Pagination"
     * >Paginating the Results</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * <code>Scan</code> operations proceed sequentially; however, for faster
     * performance on a large table or secondary index, applications can request
     * a parallel <code>Scan</code> operation by providing the
     * <code>Segment</code> and <code>TotalSegments</code> parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.ParallelScan"
     * >Parallel Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <code>Scan</code> uses eventually consistent reads when accessing the
     * data in a table; therefore, the result set might not include the changes
     * to data in the table immediately before the operation began. If you need
     * a consistent copy of the data, as of the time that the <code>Scan</code>
     * begins, you can set the <code>ConsistentRead</code> parameter to
     * <code>true</code>.
     * </p>
     * 
     * @param scanRequest <p>
     *            Represents the input of a <code>Scan</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the Scan
     *         service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ScanResult> scanAsync(ScanRequest scanRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * The <code>Scan</code> operation returns one or more items and item
     * attributes by accessing every item in a table or a secondary index. To
     * have DynamoDB return fewer items, you can provide a
     * <code>FilterExpression</code> operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set size
     * limit of 1 MB, the scan stops and results are returned to the user as a
     * <code>LastEvaluatedKey</code> value to continue the scan in a subsequent
     * operation. The results also include the number of items exceeding the
     * limit. A scan can result in no table data meeting the filter criteria.
     * </p>
     * <p>
     * A single <code>Scan</code> operation will read up to the maximum number
     * of items set (if using the <code>Limit</code> parameter) or a maximum of
     * 1 MB of data and then apply any filtering to the results using
     * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is
     * present in the response, you will need to paginate the result set. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.Pagination"
     * >Paginating the Results</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <p>
     * <code>Scan</code> operations proceed sequentially; however, for faster
     * performance on a large table or secondary index, applications can request
     * a parallel <code>Scan</code> operation by providing the
     * <code>Segment</code> and <code>TotalSegments</code> parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.ParallelScan"
     * >Parallel Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <code>Scan</code> uses eventually consistent reads when accessing the
     * data in a table; therefore, the result set might not include the changes
     * to data in the table immediately before the operation began. If you need
     * a consistent copy of the data, as of the time that the <code>Scan</code>
     * begins, you can set the <code>ConsistentRead</code> parameter to
     * <code>true</code>.
     * </p>
     * 
     * @param scanRequest <p>
     *            Represents the input of a <code>Scan</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the Scan
     *         service method, as returned by Amazon DynamoDB.
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ScanResult> scanAsync(ScanRequest scanRequest,
            AsyncHandler<ScanRequest, ScanResult> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Associate a set of tags with an Amazon DynamoDB resource. You can then
     * activate these user-defined tags so that they appear on the Billing and
     * Cost Management console for cost allocation tracking. You can call
     * TagResource up to 5 times per second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html"
     * >Tagging for DynamoDB</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon DynamoDB.
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> tagResourceAsync(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associate a set of tags with an Amazon DynamoDB resource. You can then
     * activate these user-defined tags so that they appear on the Billing and
     * Cost Management console for cost allocation tracking. You can call
     * TagResource up to 5 times per second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html"
     * >Tagging for DynamoDB</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon DynamoDB.
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> tagResourceAsync(TagResourceRequest tagResourceRequest,
            AsyncHandler<TagResourceRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Removes the association of tags from an Amazon DynamoDB resource. You can
     * call UntagResource up to 5 times per second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html"
     * >Tagging for DynamoDB</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon DynamoDB.
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> untagResourceAsync(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the association of tags from an Amazon DynamoDB resource. You can
     * call UntagResource up to 5 times per second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html"
     * >Tagging for DynamoDB</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon DynamoDB.
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            AsyncHandler<UntagResourceRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * <code>UpdateContinuousBackups</code> enables or disables point in time
     * recovery for the specified table. A successful
     * <code>UpdateContinuousBackups</code> call returns the current
     * <code>ContinuousBackupsDescription</code>. Continuous backups are
     * <code>ENABLED</code> on all tables at table creation. If point in time
     * recovery is enabled, <code>PointInTimeRecoveryStatus</code> will be set
     * to ENABLED.
     * </p>
     * <p>
     * Once continuous backups and point in time recovery are enabled, you can
     * restore to any point in time within
     * <code>EarliestRestorableDateTime</code> and
     * <code>LatestRestorableDateTime</code>.
     * </p>
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time. You can restore your table to any point in time during the
     * last 35 days..
     * </p>
     * 
     * @param updateContinuousBackupsRequest
     * @return A Java Future object containing the response from the
     *         UpdateContinuousBackups service method, as returned by Amazon
     *         DynamoDB.
     * @throws TableNotFoundException
     * @throws ContinuousBackupsUnavailableException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContinuousBackupsResult> updateContinuousBackupsAsync(
            UpdateContinuousBackupsRequest updateContinuousBackupsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <code>UpdateContinuousBackups</code> enables or disables point in time
     * recovery for the specified table. A successful
     * <code>UpdateContinuousBackups</code> call returns the current
     * <code>ContinuousBackupsDescription</code>. Continuous backups are
     * <code>ENABLED</code> on all tables at table creation. If point in time
     * recovery is enabled, <code>PointInTimeRecoveryStatus</code> will be set
     * to ENABLED.
     * </p>
     * <p>
     * Once continuous backups and point in time recovery are enabled, you can
     * restore to any point in time within
     * <code>EarliestRestorableDateTime</code> and
     * <code>LatestRestorableDateTime</code>.
     * </p>
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time. You can restore your table to any point in time during the
     * last 35 days..
     * </p>
     * 
     * @param updateContinuousBackupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContinuousBackups service method, as returned by Amazon
     *         DynamoDB.
     * @throws TableNotFoundException
     * @throws ContinuousBackupsUnavailableException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContinuousBackupsResult> updateContinuousBackupsAsync(
            UpdateContinuousBackupsRequest updateContinuousBackupsRequest,
            AsyncHandler<UpdateContinuousBackupsRequest, UpdateContinuousBackupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or removes replicas in the specified global table. The global table
     * must already exist to be able to use this operation. Any replica to be
     * added must be empty, must have the same name as the global table, must
     * have the same key schema, and must have DynamoDB Streams enabled and must
     * have same provisioned and maximum write capacity units.
     * </p>
     * <note>
     * <p>
     * Although you can use <code>UpdateGlobalTable</code> to add replicas and
     * remove replicas in a single request, for simplicity we recommend that you
     * issue separate requests for adding or removing replicas.
     * </p>
     * </note>
     * <p>
     * If global secondary indexes are specified, then the following conditions
     * must also be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The global secondary indexes must have the same name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same hash key and sort key (if
     * present).
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same provisioned and maximum
     * write capacity units.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateGlobalTableRequest
     * @return A Java Future object containing the response from the
     *         UpdateGlobalTable service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws GlobalTableNotFoundException
     * @throws ReplicaAlreadyExistsException
     * @throws ReplicaNotFoundException
     * @throws TableNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateGlobalTableResult> updateGlobalTableAsync(
            UpdateGlobalTableRequest updateGlobalTableRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Adds or removes replicas in the specified global table. The global table
     * must already exist to be able to use this operation. Any replica to be
     * added must be empty, must have the same name as the global table, must
     * have the same key schema, and must have DynamoDB Streams enabled and must
     * have same provisioned and maximum write capacity units.
     * </p>
     * <note>
     * <p>
     * Although you can use <code>UpdateGlobalTable</code> to add replicas and
     * remove replicas in a single request, for simplicity we recommend that you
     * issue separate requests for adding or removing replicas.
     * </p>
     * </note>
     * <p>
     * If global secondary indexes are specified, then the following conditions
     * must also be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The global secondary indexes must have the same name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same hash key and sort key (if
     * present).
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same provisioned and maximum
     * write capacity units.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateGlobalTableRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateGlobalTable service method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws GlobalTableNotFoundException
     * @throws ReplicaAlreadyExistsException
     * @throws ReplicaNotFoundException
     * @throws TableNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateGlobalTableResult> updateGlobalTableAsync(
            UpdateGlobalTableRequest updateGlobalTableRequest,
            AsyncHandler<UpdateGlobalTableRequest, UpdateGlobalTableResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates settings for a global table.
     * </p>
     * 
     * @param updateGlobalTableSettingsRequest
     * @return A Java Future object containing the response from the
     *         UpdateGlobalTableSettings service method, as returned by Amazon
     *         DynamoDB.
     * @throws GlobalTableNotFoundException
     * @throws ReplicaNotFoundException
     * @throws IndexNotFoundException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateGlobalTableSettingsResult> updateGlobalTableSettingsAsync(
            UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates settings for a global table.
     * </p>
     * 
     * @param updateGlobalTableSettingsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateGlobalTableSettings service method, as returned by Amazon
     *         DynamoDB.
     * @throws GlobalTableNotFoundException
     * @throws ReplicaNotFoundException
     * @throws IndexNotFoundException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateGlobalTableSettingsResult> updateGlobalTableSettingsAsync(
            UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest,
            AsyncHandler<UpdateGlobalTableSettingsRequest, UpdateGlobalTableSettingsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Edits an existing item's attributes, or adds a new item to the table if
     * it does not already exist. You can put, delete, or add attribute values.
     * You can also perform a conditional update on an existing item (insert a
     * new attribute name-value pair if it doesn't exist, or replace an existing
     * name-value pair if it has certain expected attribute values).
     * </p>
     * <p>
     * You can also return the item's attribute values in the same
     * <code>UpdateItem</code> operation using the <code>ReturnValues</code>
     * parameter.
     * </p>
     * 
     * @param updateItemRequest <p>
     *            Represents the input of an <code>UpdateItem</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the UpdateItem
     *         service method, as returned by Amazon DynamoDB.
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ItemCollectionSizeLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateItemResult> updateItemAsync(UpdateItemRequest updateItemRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Edits an existing item's attributes, or adds a new item to the table if
     * it does not already exist. You can put, delete, or add attribute values.
     * You can also perform a conditional update on an existing item (insert a
     * new attribute name-value pair if it doesn't exist, or replace an existing
     * name-value pair if it has certain expected attribute values).
     * </p>
     * <p>
     * You can also return the item's attribute values in the same
     * <code>UpdateItem</code> operation using the <code>ReturnValues</code>
     * parameter.
     * </p>
     * 
     * @param updateItemRequest <p>
     *            Represents the input of an <code>UpdateItem</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the UpdateItem
     *         service method, as returned by Amazon DynamoDB.
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ItemCollectionSizeLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateItemResult> updateItemAsync(UpdateItemRequest updateItemRequest,
            AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the provisioned throughput settings, global secondary indexes,
     * or DynamoDB Streams settings for a given table.
     * </p>
     * <p>
     * You can only perform one of the following operations at once:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Modify the provisioned throughput settings of the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable or disable Streams on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove a global secondary index from the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a new global secondary index on the table. Once the index begins
     * backfilling, you can use <code>UpdateTable</code> to perform other
     * operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>UpdateTable</code> is an asynchronous operation; while it is
     * executing, the table status changes from <code>ACTIVE</code> to
     * <code>UPDATING</code>. While it is <code>UPDATING</code>, you cannot
     * issue another <code>UpdateTable</code> request. When the table returns to
     * the <code>ACTIVE</code> state, the <code>UpdateTable</code> operation is
     * complete.
     * </p>
     * 
     * @param updateTableRequest <p>
     *            Represents the input of an <code>UpdateTable</code> operation.
     *            </p>
     * @return A Java Future object containing the response from the UpdateTable
     *         service method, as returned by Amazon DynamoDB.
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the provisioned throughput settings, global secondary indexes,
     * or DynamoDB Streams settings for a given table.
     * </p>
     * <p>
     * You can only perform one of the following operations at once:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Modify the provisioned throughput settings of the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable or disable Streams on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove a global secondary index from the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a new global secondary index on the table. Once the index begins
     * backfilling, you can use <code>UpdateTable</code> to perform other
     * operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>UpdateTable</code> is an asynchronous operation; while it is
     * executing, the table status changes from <code>ACTIVE</code> to
     * <code>UPDATING</code>. While it is <code>UPDATING</code>, you cannot
     * issue another <code>UpdateTable</code> request. When the table returns to
     * the <code>ACTIVE</code> state, the <code>UpdateTable</code> operation is
     * complete.
     * </p>
     * 
     * @param updateTableRequest <p>
     *            Represents the input of an <code>UpdateTable</code> operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the UpdateTable
     *         service method, as returned by Amazon DynamoDB.
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest,
            AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The UpdateTimeToLive method will enable or disable TTL for the specified
     * table. A successful <code>UpdateTimeToLive</code> call returns the
     * current <code>TimeToLiveSpecification</code>; it may take up to one hour
     * for the change to fully process. Any additional
     * <code>UpdateTimeToLive</code> calls for the same table during this one
     * hour duration result in a <code>ValidationException</code>.
     * </p>
     * <p>
     * TTL compares the current time in epoch time format to the time stored in
     * the TTL attribute of an item. If the epoch time value stored in the
     * attribute is less than the current time, the item is marked as expired
     * and subsequently deleted.
     * </p>
     * <note>
     * <p>
     * The epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1st, 1970 UTC.
     * </p>
     * </note>
     * <p>
     * DynamoDB deletes expired items on a best-effort basis to ensure
     * availability of throughput for other data operations.
     * </p>
     * <important>
     * <p>
     * DynamoDB typically deletes expired items within two days of expiration.
     * The exact duration within which an item gets deleted after expiration is
     * specific to the nature of the workload. Items that have expired and not
     * been deleted will still show up in reads, queries, and scans.
     * </p>
     * </important>
     * <p>
     * As items are deleted, they are removed from any Local Secondary Index and
     * Global Secondary Index immediately in the same eventually consistent way
     * as a standard delete operation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/TTL.html"
     * >Time To Live</a> in the Amazon DynamoDB Developer Guide.
     * </p>
     * 
     * @param updateTimeToLiveRequest <p>
     *            Represents the input of an <code>UpdateTimeToLive</code>
     *            operation.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateTimeToLive service method, as returned by Amazon DynamoDB.
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(
            UpdateTimeToLiveRequest updateTimeToLiveRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * The UpdateTimeToLive method will enable or disable TTL for the specified
     * table. A successful <code>UpdateTimeToLive</code> call returns the
     * current <code>TimeToLiveSpecification</code>; it may take up to one hour
     * for the change to fully process. Any additional
     * <code>UpdateTimeToLive</code> calls for the same table during this one
     * hour duration result in a <code>ValidationException</code>.
     * </p>
     * <p>
     * TTL compares the current time in epoch time format to the time stored in
     * the TTL attribute of an item. If the epoch time value stored in the
     * attribute is less than the current time, the item is marked as expired
     * and subsequently deleted.
     * </p>
     * <note>
     * <p>
     * The epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1st, 1970 UTC.
     * </p>
     * </note>
     * <p>
     * DynamoDB deletes expired items on a best-effort basis to ensure
     * availability of throughput for other data operations.
     * </p>
     * <important>
     * <p>
     * DynamoDB typically deletes expired items within two days of expiration.
     * The exact duration within which an item gets deleted after expiration is
     * specific to the nature of the workload. Items that have expired and not
     * been deleted will still show up in reads, queries, and scans.
     * </p>
     * </important>
     * <p>
     * As items are deleted, they are removed from any Local Secondary Index and
     * Global Secondary Index immediately in the same eventually consistent way
     * as a standard delete operation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/TTL.html"
     * >Time To Live</a> in the Amazon DynamoDB Developer Guide.
     * </p>
     * 
     * @param updateTimeToLiveRequest <p>
     *            Represents the input of an <code>UpdateTimeToLive</code>
     *            operation.
     *            </p>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateTimeToLive service method, as returned by Amazon DynamoDB.
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(
            UpdateTimeToLiveRequest updateTimeToLiveRequest,
            AsyncHandler<UpdateTimeToLiveRequest, UpdateTimeToLiveResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
