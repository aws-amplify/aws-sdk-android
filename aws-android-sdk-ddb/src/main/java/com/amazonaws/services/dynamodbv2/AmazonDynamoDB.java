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

package com.amazonaws.services.dynamodbv2;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.dynamodbv2.model.*;

/**
 * Interface for accessing Amazon DynamoDB <fullname>Amazon DynamoDB</fullname>
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
public interface AmazonDynamoDB {

    /**
     * Overrides the default endpoint for this client
     * ("https://dynamodb.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "dynamodb.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://dynamodb.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "dynamodb.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://dynamodb.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonDynamoDB#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

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
     * @return batchGetItemResult The response from the BatchGetItem service
     *         method, as returned by Amazon DynamoDB.
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
    BatchGetItemResult batchGetItem(BatchGetItemRequest batchGetItemRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return batchWriteItemResult The response from the BatchWriteItem service
     *         method, as returned by Amazon DynamoDB.
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
    BatchWriteItemResult batchWriteItem(BatchWriteItemRequest batchWriteItemRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createBackupResult The response from the CreateBackup service
     *         method, as returned by Amazon DynamoDB.
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
    CreateBackupResult createBackup(CreateBackupRequest createBackupRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createGlobalTableResult The response from the CreateGlobalTable
     *         service method, as returned by Amazon DynamoDB.
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
    CreateGlobalTableResult createGlobalTable(CreateGlobalTableRequest createGlobalTableRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createTableResult The response from the CreateTable service
     *         method, as returned by Amazon DynamoDB.
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
    CreateTableResult createTable(CreateTableRequest createTableRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return deleteBackupResult The response from the DeleteBackup service
     *         method, as returned by Amazon DynamoDB.
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
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return deleteItemResult The response from the DeleteItem service method,
     *         as returned by Amazon DynamoDB.
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
    DeleteItemResult deleteItem(DeleteItemRequest deleteItemRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return deleteTableResult The response from the DeleteTable service
     *         method, as returned by Amazon DynamoDB.
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
    DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeBackupResult The response from the DescribeBackup service
     *         method, as returned by Amazon DynamoDB.
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
    DescribeBackupResult describeBackup(DescribeBackupRequest describeBackupRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeContinuousBackupsResult The response from the
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
    DescribeContinuousBackupsResult describeContinuousBackups(
            DescribeContinuousBackupsRequest describeContinuousBackupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the specified global table.
     * </p>
     * 
     * @param describeGlobalTableRequest
     * @return describeGlobalTableResult The response from the
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
    DescribeGlobalTableResult describeGlobalTable(
            DescribeGlobalTableRequest describeGlobalTableRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes region specific settings for a global table.
     * </p>
     * 
     * @param describeGlobalTableSettingsRequest
     * @return describeGlobalTableSettingsResult The response from the
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
    DescribeGlobalTableSettingsResult describeGlobalTableSettings(
            DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeLimitsResult The response from the DescribeLimits service
     *         method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeLimitsResult describeLimits(DescribeLimitsRequest describeLimitsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeTableResult The response from the DescribeTable service
     *         method, as returned by Amazon DynamoDB.
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
    DescribeTableResult describeTable(DescribeTableRequest describeTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gives a description of the Time to Live (TTL) status on the specified
     * table.
     * </p>
     * 
     * @param describeTimeToLiveRequest
     * @return describeTimeToLiveResult The response from the DescribeTimeToLive
     *         service method, as returned by Amazon DynamoDB.
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
    DescribeTimeToLiveResult describeTimeToLive(DescribeTimeToLiveRequest describeTimeToLiveRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return getItemResult The response from the GetItem service method, as
     *         returned by Amazon DynamoDB.
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
    GetItemResult getItem(GetItemRequest getItemRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return listBackupsResult The response from the ListBackups service
     *         method, as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBackupsResult listBackups(ListBackupsRequest listBackupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all global tables that have a replica in the specified region.
     * </p>
     * 
     * @param listGlobalTablesRequest
     * @return listGlobalTablesResult The response from the ListGlobalTables
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
    ListGlobalTablesResult listGlobalTables(ListGlobalTablesRequest listGlobalTablesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return listTablesResult The response from the ListTables service method,
     *         as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTablesResult listTables(ListTablesRequest listTablesRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return listTagsOfResourceResult The response from the ListTagsOfResource
     *         service method, as returned by Amazon DynamoDB.
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
    ListTagsOfResourceResult listTagsOfResource(ListTagsOfResourceRequest listTagsOfResourceRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return putItemResult The response from the PutItem service method, as
     *         returned by Amazon DynamoDB.
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
    PutItemResult putItem(PutItemRequest putItemRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return queryResult The response from the Query service method, as
     *         returned by Amazon DynamoDB.
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
    QueryResult query(QueryRequest queryRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return restoreTableFromBackupResult The response from the
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
    RestoreTableFromBackupResult restoreTableFromBackup(
            RestoreTableFromBackupRequest restoreTableFromBackupRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return restoreTableToPointInTimeResult The response from the
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
    RestoreTableToPointInTimeResult restoreTableToPointInTime(
            RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return scanResult The response from the Scan service method, as returned
     *         by Amazon DynamoDB.
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
    ScanResult scan(ScanRequest scanRequest) throws AmazonClientException, AmazonServiceException;

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
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

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
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return updateContinuousBackupsResult The response from the
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
    UpdateContinuousBackupsResult updateContinuousBackups(
            UpdateContinuousBackupsRequest updateContinuousBackupsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updateGlobalTableResult The response from the UpdateGlobalTable
     *         service method, as returned by Amazon DynamoDB.
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
    UpdateGlobalTableResult updateGlobalTable(UpdateGlobalTableRequest updateGlobalTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates settings for a global table.
     * </p>
     * 
     * @param updateGlobalTableSettingsRequest
     * @return updateGlobalTableSettingsResult The response from the
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
    UpdateGlobalTableSettingsResult updateGlobalTableSettings(
            UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updateItemResult The response from the UpdateItem service method,
     *         as returned by Amazon DynamoDB.
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
    UpdateItemResult updateItem(UpdateItemRequest updateItemRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return updateTableResult The response from the UpdateTable service
     *         method, as returned by Amazon DynamoDB.
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
    UpdateTableResult updateTable(UpdateTableRequest updateTableRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return updateTimeToLiveResult The response from the UpdateTimeToLive
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
    UpdateTimeToLiveResult updateTimeToLive(UpdateTimeToLiveRequest updateTimeToLiveRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return putItemResult The response from the PutItem service method, as
     *         returned by Amazon DynamoDB.
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
    PutItemResult putItem(String tableName, java.util.Map<String, AttributeValue> item)
            throws AmazonClientException, AmazonServiceException;

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
     * @return putItemResult The response from the PutItem service method, as
     *         returned by Amazon DynamoDB.
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
    PutItemResult putItem(String tableName, java.util.Map<String, AttributeValue> item,
            String returnValues) throws AmazonClientException, AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table containing the item to update.
     *            </p>
     * @param key <p>
     *            The primary key of the item to be updated. Each element
     *            consists of an attribute name and a value for that attribute.
     *            </p>
     *            <p>
     *            For the primary key, you must provide all of the attributes.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide values for both the partition key and
     *            the sort key.
     *            </p>
     * @param attributeUpdates <p>
     *            This is a legacy parameter. Use <code>UpdateExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     *            >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return updateItemResult The response from the UpdateItem service method,
     *         as returned by Amazon DynamoDB.
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
    UpdateItemResult updateItem(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates)
            throws AmazonClientException, AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table containing the item to update.
     *            </p>
     * @param key <p>
     *            The primary key of the item to be updated. Each element
     *            consists of an attribute name and a value for that attribute.
     *            </p>
     *            <p>
     *            For the primary key, you must provide all of the attributes.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide values for both the partition key and
     *            the sort key.
     *            </p>
     * @param attributeUpdates <p>
     *            This is a legacy parameter. Use <code>UpdateExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributeUpdates.html"
     *            >AttributeUpdates</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @param returnValues <p>
     *            Use <code>ReturnValues</code> if you want to get the item
     *            attributes as they appear before or after they are updated.
     *            For <code>UpdateItem</code>, the valid values are:
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
     *            <code>ALL_OLD</code> - Returns all of the attributes of the
     *            item, as they appeared before the UpdateItem operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATED_OLD</code> - Returns only the updated
     *            attributes, as they appeared before the UpdateItem operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL_NEW</code> - Returns all of the attributes of the
     *            item, as they appear after the UpdateItem operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATED_NEW</code> - Returns only the updated
     *            attributes, as they appear after the UpdateItem operation.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            There is no additional cost associated with requesting a
     *            return value aside from the small network and processing
     *            overhead of receiving a larger response. No read capacity
     *            units are consumed.
     *            </p>
     *            <p>
     *            The values returned are strongly consistent.
     *            </p>
     * @return updateItemResult The response from the UpdateItem service method,
     *         as returned by Amazon DynamoDB.
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
    UpdateItemResult updateItem(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, String returnValues)
            throws AmazonClientException, AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table to describe.
     *            </p>
     * @return describeTableResult The response from the DescribeTable service
     *         method, as returned by Amazon DynamoDB.
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
    DescribeTableResult describeTable(String tableName) throws AmazonClientException,
            AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table containing the requested items; or, if
     *            you provide <code>IndexName</code>, the name of the table to
     *            which that index belongs.
     *            </p>
     * @param attributesToGet <p>
     *            This is a legacy parameter. Use
     *            <code>ProjectionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *            >AttributesToGet</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return scanResult The response from the Scan service method, as returned
     *         by Amazon DynamoDB.
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
    ScanResult scan(String tableName, java.util.List<String> attributesToGet)
            throws AmazonClientException, AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table containing the requested items; or, if
     *            you provide <code>IndexName</code>, the name of the table to
     *            which that index belongs.
     *            </p>
     * @param scanFilter <p>
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     *            >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     * @return scanResult The response from the Scan service method, as returned
     *         by Amazon DynamoDB.
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
    ScanResult scan(String tableName, java.util.Map<String, Condition> scanFilter)
            throws AmazonClientException, AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table containing the requested items; or, if
     *            you provide <code>IndexName</code>, the name of the table to
     *            which that index belongs.
     *            </p>
     * @param attributesToGet <p>
     *            This is a legacy parameter. Use
     *            <code>ProjectionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *            >AttributesToGet</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @param scanFilter <p>
     *            This is a legacy parameter. Use <code>FilterExpression</code>
     *            instead. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.ScanFilter.html"
     *            >ScanFilter</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     * @return scanResult The response from the Scan service method, as returned
     *         by Amazon DynamoDB.
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
    ScanResult scan(String tableName, java.util.List<String> attributesToGet,
            java.util.Map<String, Condition> scanFilter) throws AmazonClientException,
            AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table from which to delete the item.
     *            </p>
     * @param key <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects, representing the primary key of the item to delete.
     *            </p>
     *            <p>
     *            For the primary key, you must provide all of the attributes.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide values for both the partition key and
     *            the sort key.
     *            </p>
     * @return deleteItemResult The response from the DeleteItem service method,
     *         as returned by Amazon DynamoDB.
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
    DeleteItemResult deleteItem(String tableName, java.util.Map<String, AttributeValue> key)
            throws AmazonClientException, AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table from which to delete the item.
     *            </p>
     * @param key <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects, representing the primary key of the item to delete.
     *            </p>
     *            <p>
     *            For the primary key, you must provide all of the attributes.
     *            For example, with a simple primary key, you only need to
     *            provide a value for the partition key. For a composite primary
     *            key, you must provide values for both the partition key and
     *            the sort key.
     *            </p>
     * @param returnValues <p>
     *            Use <code>ReturnValues</code> if you want to get the item
     *            attributes as they appeared before they were deleted. For
     *            <code>DeleteItem</code>, the valid values are:
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
     *            <code>ALL_OLD</code> - The content of the old item is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The <code>ReturnValues</code> parameter is used by several
     *            DynamoDB operations; however, <code>DeleteItem</code> does not
     *            recognize any values other than <code>NONE</code> or
     *            <code>ALL_OLD</code>.
     *            </p>
     *            </note>
     * @return deleteItemResult The response from the DeleteItem service method,
     *         as returned by Amazon DynamoDB.
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
    DeleteItemResult deleteItem(String tableName, java.util.Map<String, AttributeValue> key,
            String returnValues) throws AmazonClientException, AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table to delete.
     *            </p>
     * @return deleteTableResult The response from the DeleteTable service
     *         method, as returned by Amazon DynamoDB.
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
    DeleteTableResult deleteTable(String tableName) throws AmazonClientException,
            AmazonServiceException;

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
     * @param attributeDefinitions <p>
     *            An array of attributes that describe the key schema for the
     *            table and indexes.
     *            </p>
     * @param tableName <p>
     *            The name of the table to create.
     *            </p>
     * @param keySchema <p>
     *            Specifies the attributes that make up the primary key for a
     *            table or an index. The attributes in <code>KeySchema</code>
     *            must also be defined in the <code>AttributeDefinitions</code>
     *            array. For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html"
     *            >Data Model</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     *            <p>
     *            Each <code>KeySchemaElement</code> in the array is composed
     *            of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AttributeName</code> - The name of this key attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeyType</code> - The role that the key attribute will
     *            assume:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HASH</code> - partition key
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RANGE</code> - sort key
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The partition key of an item is also known as its <i>hash
     *            attribute</i>. The term "hash attribute" derives from
     *            DynamoDB' usage of an internal hash function to evenly
     *            distribute data items across partitions, based on their
     *            partition key values.
     *            </p>
     *            <p>
     *            The sort key of an item is also known as its <i>range
     *            attribute</i>. The term "range attribute" derives from the way
     *            DynamoDB stores items with the same partition key physically
     *            close together, in sorted order by the sort key value.
     *            </p>
     *            </note>
     *            <p>
     *            For a simple primary key (partition key), you must provide
     *            exactly one element with a <code>KeyType</code> of
     *            <code>HASH</code>.
     *            </p>
     *            <p>
     *            For a composite primary key (partition key and sort key), you
     *            must provide exactly two elements, in this order: The first
     *            element must have a <code>KeyType</code> of <code>HASH</code>,
     *            and the second element must have a <code>KeyType</code> of
     *            <code>RANGE</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     *            >Specifying the Primary Key</a> in the <i>Amazon DynamoDB
     *            Developer Guide</i>.
     *            </p>
     * @param provisionedThroughput <p>
     *            Represents the provisioned throughput settings for a specified
     *            table or index. The settings can be modified using the
     *            <code>UpdateTable</code> operation.
     *            </p>
     *            <p>
     *            For current minimum and maximum provisioned throughput values,
     *            see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     *            >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     * @return createTableResult The response from the CreateTable service
     *         method, as returned by Amazon DynamoDB.
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
    CreateTableResult createTable(java.util.List<AttributeDefinition> attributeDefinitions,
            String tableName, java.util.List<KeySchemaElement> keySchema,
            ProvisionedThroughput provisionedThroughput) throws AmazonClientException,
            AmazonServiceException;

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
     * @return getItemResult The response from the GetItem service method, as
     *         returned by Amazon DynamoDB.
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
    GetItemResult getItem(String tableName, java.util.Map<String, AttributeValue> key)
            throws AmazonClientException, AmazonServiceException;

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
     * @return getItemResult The response from the GetItem service method, as
     *         returned by Amazon DynamoDB.
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
    GetItemResult getItem(String tableName, java.util.Map<String, AttributeValue> key,
            Boolean consistentRead) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of table names associated with the current account and
     * endpoint. The output from <code>ListTables</code> is paginated, with each
     * page returning a maximum of 100 table names.
     * </p>
     * 
     * @return listTablesResult The response from the ListTables service method,
     *         as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTablesResult listTables() throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of table names associated with the current account and
     * endpoint. The output from <code>ListTables</code> is paginated, with each
     * page returning a maximum of 100 table names.
     * </p>
     * 
     * @param exclusiveStartTableName <p>
     *            The first table name that this operation will evaluate. Use
     *            the value that was returned for
     *            <code>LastEvaluatedTableName</code> in a previous operation,
     *            so that you can obtain the next page of results.
     *            </p>
     * @return listTablesResult The response from the ListTables service method,
     *         as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTablesResult listTables(String exclusiveStartTableName) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns an array of table names associated with the current account and
     * endpoint. The output from <code>ListTables</code> is paginated, with each
     * page returning a maximum of 100 table names.
     * </p>
     * 
     * @param exclusiveStartTableName <p>
     *            The first table name that this operation will evaluate. Use
     *            the value that was returned for
     *            <code>LastEvaluatedTableName</code> in a previous operation,
     *            so that you can obtain the next page of results.
     *            </p>
     * @param limit <p>
     *            A maximum number of table names to return. If this parameter
     *            is not specified, the limit is 100.
     *            </p>
     * @return listTablesResult The response from the ListTables service method,
     *         as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTablesResult listTables(String exclusiveStartTableName, Integer limit)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of table names associated with the current account and
     * endpoint. The output from <code>ListTables</code> is paginated, with each
     * page returning a maximum of 100 table names.
     * </p>
     * 
     * @param limit <p>
     *            A maximum number of table names to return. If this parameter
     *            is not specified, the limit is 100.
     *            </p>
     * @return listTablesResult The response from the ListTables service method,
     *         as returned by Amazon DynamoDB.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             DynamoDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTablesResult listTables(Integer limit) throws AmazonClientException, AmazonServiceException;

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
     * @param tableName <p>
     *            The name of the table to be updated.
     *            </p>
     * @param provisionedThroughput <p>
     *            The new provisioned throughput settings for the specified
     *            table or index.
     *            </p>
     * @return updateTableResult The response from the UpdateTable service
     *         method, as returned by Amazon DynamoDB.
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
    UpdateTableResult updateTable(String tableName, ProvisionedThroughput provisionedThroughput)
            throws AmazonClientException, AmazonServiceException;

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
     * @param requestItems <p>
     *            A map of one or more table names and, for each table, a map
     *            that describes one or more items to retrieve from that table.
     *            Each table name can be used only once per
     *            <code>BatchGetItem</code> request.
     *            </p>
     *            <p>
     *            Each element in the map of items to retrieve consists of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConsistentRead</code> - If <code>true</code>, a strongly
     *            consistent read is used; if <code>false</code> (the default),
     *            an eventually consistent read is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ExpressionAttributeNames</code> - One or more
     *            substitution tokens for attribute names in the
     *            <code>ProjectionExpression</code> parameter. The following are
     *            some use cases for using <code>ExpressionAttributeNames</code>
     *            :
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
     *            </li>
     *            <li>
     *            <p>
     *            <code>Keys</code> - An array of primary key attribute values
     *            that define specific items in the table. For each primary key,
     *            you must provide <i>all</i> of the key attributes. For
     *            example, with a simple primary key, you only need to provide
     *            the partition key value. For a composite key, you must provide
     *            <i>both</i> the partition key value and the sort key value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ProjectionExpression</code> - A string that identifies
     *            one or more attributes to retrieve from the table. These
     *            attributes can include scalars, sets, or elements of a JSON
     *            document. The attributes in the expression must be separated
     *            by commas.
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
     *            </li>
     *            <li>
     *            <p>
     *            <code>AttributesToGet</code> - This is a legacy parameter. Use
     *            <code>ProjectionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *            >AttributesToGet</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @param returnConsumedCapacity
     * @return batchGetItemResult The response from the BatchGetItem service
     *         method, as returned by Amazon DynamoDB.
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
    BatchGetItemResult batchGetItem(java.util.Map<String, KeysAndAttributes> requestItems,
            String returnConsumedCapacity) throws AmazonClientException, AmazonServiceException;

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
     * @param requestItems <p>
     *            A map of one or more table names and, for each table, a map
     *            that describes one or more items to retrieve from that table.
     *            Each table name can be used only once per
     *            <code>BatchGetItem</code> request.
     *            </p>
     *            <p>
     *            Each element in the map of items to retrieve consists of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConsistentRead</code> - If <code>true</code>, a strongly
     *            consistent read is used; if <code>false</code> (the default),
     *            an eventually consistent read is used.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ExpressionAttributeNames</code> - One or more
     *            substitution tokens for attribute names in the
     *            <code>ProjectionExpression</code> parameter. The following are
     *            some use cases for using <code>ExpressionAttributeNames</code>
     *            :
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
     *            </li>
     *            <li>
     *            <p>
     *            <code>Keys</code> - An array of primary key attribute values
     *            that define specific items in the table. For each primary key,
     *            you must provide <i>all</i> of the key attributes. For
     *            example, with a simple primary key, you only need to provide
     *            the partition key value. For a composite key, you must provide
     *            <i>both</i> the partition key value and the sort key value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ProjectionExpression</code> - A string that identifies
     *            one or more attributes to retrieve from the table. These
     *            attributes can include scalars, sets, or elements of a JSON
     *            document. The attributes in the expression must be separated
     *            by commas.
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
     *            </li>
     *            <li>
     *            <p>
     *            <code>AttributesToGet</code> - This is a legacy parameter. Use
     *            <code>ProjectionExpression</code> instead. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.AttributesToGet.html"
     *            >AttributesToGet</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return batchGetItemResult The response from the BatchGetItem service
     *         method, as returned by Amazon DynamoDB.
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
    BatchGetItemResult batchGetItem(java.util.Map<String, KeysAndAttributes> requestItems)
            throws AmazonClientException, AmazonServiceException;

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
     * @return batchWriteItemResult The response from the BatchWriteItem service
     *         method, as returned by Amazon DynamoDB.
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
    BatchWriteItemResult batchWriteItem(
            java.util.Map<String, java.util.List<WriteRequest>> requestItems)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
