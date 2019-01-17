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

package com.amazonaws.services.sqs;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.sqs.model.*;

/**
 * Interface for accessing Amazon SQS asynchronously.
 * <p>
 * Welcome to the <i>Amazon Simple Queue Service API Reference</i>. This section
 * describes who should read this guide, how the guide is organized, and other
 * resources related to the Amazon Simple Queue Service (Amazon SQS).
 * </p>
 * <p>
 * Amazon SQS offers reliable and scalable hosted queues for storing messages as
 * they travel between computers. By using Amazon SQS, you can move data between
 * distributed components of your applications that perform different tasks
 * without losing messages or requiring each component to be always available.
 * </p>
 * <p>
 * <b>Topics</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * </p></li>
 * <li>
 * <p>
 * </p></li>
 * <li>
 * <p>
 * <a>CommonParameters</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CommonErrors</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Helpful Links</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/MakingRequestsArticle.html"
 * >Making API Requests</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/sqs/">Amazon SQS product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html"
 * >Using Amazon SQS Message Attributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
 * >Using Amazon SQS Dead Letter Queues</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sqs_region">
 * Regions and Endpoints</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * We also provide SDKs that enable you to access Amazon SQS from your preferred
 * programming language. The SDKs contain functionality that automatically takes
 * care of tasks such as:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Cryptographically signing your service requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Retrying requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Handling error responses
 * </p>
 * </li>
 * </ul>
 * <p>
 * For a list of available SDKs, see <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 **/
public interface AmazonSQSAsync extends AmazonSQS {
    /**
     * <p>
     * Adds a permission to a queue for a specific <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     * >principal</a>. This allows for sharing access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the
     * queue. Only you (as owner of the queue) can grant or deny permissions to
     * the queue. For more information about these permissions, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"
     * >Shared Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <code>AddPermission</code> writes an Amazon SQS-generated policy. If you
     * want to write your own policy, use <a>SetQueueAttributes</a> to upload
     * your policy. For more information about writing your own policy, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AccessPolicyLanguage.html"
     * >Using The Access Policy Language</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param addPermissionRequest <p/>
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by Amazon SQS.
     * @throws OverLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> addPermissionAsync(AddPermissionRequest addPermissionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a permission to a queue for a specific <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     * >principal</a>. This allows for sharing access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the
     * queue. Only you (as owner of the queue) can grant or deny permissions to
     * the queue. For more information about these permissions, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"
     * >Shared Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <code>AddPermission</code> writes an Amazon SQS-generated policy. If you
     * want to write your own policy, use <a>SetQueueAttributes</a> to upload
     * your policy. For more information about writing your own policy, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AccessPolicyLanguage.html"
     * >Using The Access Policy Language</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param addPermissionRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by Amazon SQS.
     * @throws OverLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> addPermissionAsync(AddPermissionRequest addPermissionRequest,
            AsyncHandler<AddPermissionRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Changes the visibility timeout of a specified message in a queue to a new
     * value. The maximum allowed timeout value you can set the value to is 12
     * hours. This means you can't extend the timeout of a message in an
     * existing queue to more than a total visibility timeout of 12 hours. (For
     * more information visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.)
     * </p>
     * <p>
     * For example, let's say you have a message and its default message
     * visibility timeout is 5 minutes. After 3 minutes, you call
     * <code>ChangeMessageVisiblity</code> with a timeout of 10 minutes. At that
     * time, the timeout for the message would be extended by 10 minutes beyond
     * the time of the ChangeMessageVisibility call. This results in a total
     * visibility timeout of 13 minutes. You can continue to call
     * ChangeMessageVisibility to extend the visibility timeout to a maximum of
     * 12 hours. If you try to extend beyond 12 hours, the request will be
     * rejected.
     * </p>
     * <note>
     * <p>
     * There is a 120,000 limit for the number of inflight messages per queue.
     * Messages are inflight after they have been received from the queue by a
     * consuming component, but have not yet been deleted from the queue. If you
     * reach the 120,000 limit, you will receive an OverLimit error message from
     * Amazon SQS. To help avoid reaching the limit, you should delete the
     * messages from the queue after they have been processed. You can also
     * increase the number of queues you use to process the messages.
     * </p>
     * </note> <important>
     * <p>
     * If you attempt to set the <code>VisibilityTimeout</code> to an amount
     * more than the maximum time left, Amazon SQS returns an error. It will not
     * automatically recalculate and increase the timeout to the maximum time
     * remaining.
     * </p>
     * </important> <important>
     * <p>
     * Unlike with a queue, when you change the visibility timeout for a
     * specific message, that timeout value is applied immediately but is not
     * saved in memory for that message. If you don't delete a message after it
     * is received, the visibility timeout for the message the next time it is
     * received reverts to the original timeout value, not the value you set
     * with the <code>ChangeMessageVisibility</code> action.
     * </p>
     * </important>
     * 
     * @param changeMessageVisibilityRequest
     * @return A Java Future object containing the response from the
     *         ChangeMessageVisibility service method, as returned by Amazon
     *         SQS.
     * @throws MessageNotInflightException
     * @throws ReceiptHandleIsInvalidException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> changeMessageVisibilityAsync(
            ChangeMessageVisibilityRequest changeMessageVisibilityRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the visibility timeout of a specified message in a queue to a new
     * value. The maximum allowed timeout value you can set the value to is 12
     * hours. This means you can't extend the timeout of a message in an
     * existing queue to more than a total visibility timeout of 12 hours. (For
     * more information visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.)
     * </p>
     * <p>
     * For example, let's say you have a message and its default message
     * visibility timeout is 5 minutes. After 3 minutes, you call
     * <code>ChangeMessageVisiblity</code> with a timeout of 10 minutes. At that
     * time, the timeout for the message would be extended by 10 minutes beyond
     * the time of the ChangeMessageVisibility call. This results in a total
     * visibility timeout of 13 minutes. You can continue to call
     * ChangeMessageVisibility to extend the visibility timeout to a maximum of
     * 12 hours. If you try to extend beyond 12 hours, the request will be
     * rejected.
     * </p>
     * <note>
     * <p>
     * There is a 120,000 limit for the number of inflight messages per queue.
     * Messages are inflight after they have been received from the queue by a
     * consuming component, but have not yet been deleted from the queue. If you
     * reach the 120,000 limit, you will receive an OverLimit error message from
     * Amazon SQS. To help avoid reaching the limit, you should delete the
     * messages from the queue after they have been processed. You can also
     * increase the number of queues you use to process the messages.
     * </p>
     * </note> <important>
     * <p>
     * If you attempt to set the <code>VisibilityTimeout</code> to an amount
     * more than the maximum time left, Amazon SQS returns an error. It will not
     * automatically recalculate and increase the timeout to the maximum time
     * remaining.
     * </p>
     * </important> <important>
     * <p>
     * Unlike with a queue, when you change the visibility timeout for a
     * specific message, that timeout value is applied immediately but is not
     * saved in memory for that message. If you don't delete a message after it
     * is received, the visibility timeout for the message the next time it is
     * received reverts to the original timeout value, not the value you set
     * with the <code>ChangeMessageVisibility</code> action.
     * </p>
     * </important>
     * 
     * @param changeMessageVisibilityRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ChangeMessageVisibility service method, as returned by Amazon
     *         SQS.
     * @throws MessageNotInflightException
     * @throws ReceiptHandleIsInvalidException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> changeMessageVisibilityAsync(
            ChangeMessageVisibilityRequest changeMessageVisibilityRequest,
            AsyncHandler<ChangeMessageVisibilityRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the visibility timeout of multiple messages. This is a batch
     * version of <a>ChangeMessageVisibility</a>. The result of the action on
     * each message is reported individually in the response. You can send up to
     * 10 <a>ChangeMessageVisibility</a> requests with each
     * <code>ChangeMessageVisibilityBatch</code> action.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and
     * unsuccessful actions, you should check for batch errors even when the
     * call returns an HTTP status code of 200.
     * </p>
     * </important> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param changeMessageVisibilityBatchRequest <p/>
     * @return A Java Future object containing the response from the
     *         ChangeMessageVisibilityBatch service method, as returned by
     *         Amazon SQS.
     * @throws TooManyEntriesInBatchRequestException
     * @throws EmptyBatchRequestException
     * @throws BatchEntryIdsNotDistinctException
     * @throws InvalidBatchEntryIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(
            ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the visibility timeout of multiple messages. This is a batch
     * version of <a>ChangeMessageVisibility</a>. The result of the action on
     * each message is reported individually in the response. You can send up to
     * 10 <a>ChangeMessageVisibility</a> requests with each
     * <code>ChangeMessageVisibilityBatch</code> action.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and
     * unsuccessful actions, you should check for batch errors even when the
     * call returns an HTTP status code of 200.
     * </p>
     * </important> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param changeMessageVisibilityBatchRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ChangeMessageVisibilityBatch service method, as returned by
     *         Amazon SQS.
     * @throws TooManyEntriesInBatchRequestException
     * @throws EmptyBatchRequestException
     * @throws BatchEntryIdsNotDistinctException
     * @throws InvalidBatchEntryIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(
            ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest,
            AsyncHandler<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new standard or FIFO queue or returns the URL of an existing
     * queue. You can pass one or more attributes in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS
     * creates a standard queue.
     * </p>
     * <note>
     * <p>
     * You can't change the queue type after you create it and you can't convert
     * an existing standard queue into a FIFO queue. You must either create a
     * new FIFO queue for your application or delete your existing standard
     * queue and recreate it as a FIFO queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-moving.html"
     * > Moving From a Standard Queue to a FIFO Queue</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If you don't provide a value for an attribute, the queue is created with
     * the default value for the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you delete a queue, you must wait at least 60 seconds before creating
     * a queue with the same name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To successfully create a new queue, you must provide a queue name that
     * adheres to the <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html"
     * >limits related to queues</a> and is unique within the scope of your
     * queues.
     * </p>
     * <p>
     * To get the queue URL, use the <a>GetQueueUrl</a> action.
     * <a>GetQueueUrl</a> requires only the <code>QueueName</code> parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you provide the name of an existing queue along with the exact names
     * and values of all the queue's attributes, <code>CreateQueue</code>
     * returns the queue URL for the existing queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue name, attribute names, or attribute values don't match an
     * existing queue, <code>CreateQueue</code> returns an error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Some API actions take lists of parameters. Specify these lists using the
     * <code>param.n</code> notation. Values of <code>n</code> are integers
     * starting from 1. The following is an example of a parameter list with two
     * elements:
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param createQueueRequest <p/>
     * @return A Java Future object containing the response from the CreateQueue
     *         service method, as returned by Amazon SQS.
     * @throws QueueDeletedRecentlyException
     * @throws QueueNameExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new standard or FIFO queue or returns the URL of an existing
     * queue. You can pass one or more attributes in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS
     * creates a standard queue.
     * </p>
     * <note>
     * <p>
     * You can't change the queue type after you create it and you can't convert
     * an existing standard queue into a FIFO queue. You must either create a
     * new FIFO queue for your application or delete your existing standard
     * queue and recreate it as a FIFO queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-moving.html"
     * > Moving From a Standard Queue to a FIFO Queue</a> in the <i>Amazon SQS
     * Developer Guide</i>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If you don't provide a value for an attribute, the queue is created with
     * the default value for the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you delete a queue, you must wait at least 60 seconds before creating
     * a queue with the same name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To successfully create a new queue, you must provide a queue name that
     * adheres to the <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html"
     * >limits related to queues</a> and is unique within the scope of your
     * queues.
     * </p>
     * <p>
     * To get the queue URL, use the <a>GetQueueUrl</a> action.
     * <a>GetQueueUrl</a> requires only the <code>QueueName</code> parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you provide the name of an existing queue along with the exact names
     * and values of all the queue's attributes, <code>CreateQueue</code>
     * returns the queue URL for the existing queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue name, attribute names, or attribute values don't match an
     * existing queue, <code>CreateQueue</code> returns an error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Some API actions take lists of parameters. Specify these lists using the
     * <code>param.n</code> notation. Values of <code>n</code> are integers
     * starting from 1. The following is an example of a parameter list with two
     * elements:
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param createQueueRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the CreateQueue
     *         service method, as returned by Amazon SQS.
     * @throws QueueDeletedRecentlyException
     * @throws QueueNameExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest,
            AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified message from the specified queue. You specify the
     * message by using the message's <code>receipt handle</code> and not the
     * <code>message ID</code> you received when you sent the message. Even if
     * the message is locked by another reader due to the visibility timeout
     * setting, it is still deleted from the queue. If you leave a message in
     * the queue for longer than the queue's configured retention period, Amazon
     * SQS automatically deletes it.
     * </p>
     * <note>
     * <p>
     * The receipt handle is associated with a specific instance of receiving
     * the message. If you receive a message more than once, the receipt handle
     * you get each time you receive the message is different. When you request
     * <code>DeleteMessage</code>, if you don't provide the most recently
     * received receipt handle for the message, the request will still succeed,
     * but the message might not be deleted.
     * </p>
     * </note> <important>
     * <p>
     * It is possible you will receive a message even after you have deleted it.
     * This might happen on rare occasions if one of the servers storing a copy
     * of the message is unavailable when you request to delete the message. The
     * copy remains on the server and might be returned to you again on a
     * subsequent receive request. You should create your system to be
     * idempotent so that receiving a particular message more than once is not a
     * problem.
     * </p>
     * </important>
     * 
     * @param deleteMessageRequest <p/>
     * @return A Java Future object containing the response from the
     *         DeleteMessage service method, as returned by Amazon SQS.
     * @throws InvalidIdFormatException
     * @throws ReceiptHandleIsInvalidException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> deleteMessageAsync(DeleteMessageRequest deleteMessageRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified message from the specified queue. You specify the
     * message by using the message's <code>receipt handle</code> and not the
     * <code>message ID</code> you received when you sent the message. Even if
     * the message is locked by another reader due to the visibility timeout
     * setting, it is still deleted from the queue. If you leave a message in
     * the queue for longer than the queue's configured retention period, Amazon
     * SQS automatically deletes it.
     * </p>
     * <note>
     * <p>
     * The receipt handle is associated with a specific instance of receiving
     * the message. If you receive a message more than once, the receipt handle
     * you get each time you receive the message is different. When you request
     * <code>DeleteMessage</code>, if you don't provide the most recently
     * received receipt handle for the message, the request will still succeed,
     * but the message might not be deleted.
     * </p>
     * </note> <important>
     * <p>
     * It is possible you will receive a message even after you have deleted it.
     * This might happen on rare occasions if one of the servers storing a copy
     * of the message is unavailable when you request to delete the message. The
     * copy remains on the server and might be returned to you again on a
     * subsequent receive request. You should create your system to be
     * idempotent so that receiving a particular message more than once is not a
     * problem.
     * </p>
     * </important>
     * 
     * @param deleteMessageRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteMessage service method, as returned by Amazon SQS.
     * @throws InvalidIdFormatException
     * @throws ReceiptHandleIsInvalidException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> deleteMessageAsync(DeleteMessageRequest deleteMessageRequest,
            AsyncHandler<DeleteMessageRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes up to ten messages from the specified queue. This is a batch
     * version of <a>DeleteMessage</a>. The result of the delete action on each
     * message is reported individually in the response.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and
     * unsuccessful actions, you should check for batch errors even when the
     * call returns an HTTP status code of 200.
     * </p>
     * </important> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param deleteMessageBatchRequest <p/>
     * @return A Java Future object containing the response from the
     *         DeleteMessageBatch service method, as returned by Amazon SQS.
     * @throws TooManyEntriesInBatchRequestException
     * @throws EmptyBatchRequestException
     * @throws BatchEntryIdsNotDistinctException
     * @throws InvalidBatchEntryIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<DeleteMessageBatchResult> deleteMessageBatchAsync(
            DeleteMessageBatchRequest deleteMessageBatchRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes up to ten messages from the specified queue. This is a batch
     * version of <a>DeleteMessage</a>. The result of the delete action on each
     * message is reported individually in the response.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and
     * unsuccessful actions, you should check for batch errors even when the
     * call returns an HTTP status code of 200.
     * </p>
     * </important> <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param deleteMessageBatchRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteMessageBatch service method, as returned by Amazon SQS.
     * @throws TooManyEntriesInBatchRequestException
     * @throws EmptyBatchRequestException
     * @throws BatchEntryIdsNotDistinctException
     * @throws InvalidBatchEntryIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<DeleteMessageBatchResult> deleteMessageBatchAsync(
            DeleteMessageBatchRequest deleteMessageBatchRequest,
            AsyncHandler<DeleteMessageBatchRequest, DeleteMessageBatchResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the queue specified by the <b>queue URL</b>, regardless of
     * whether the queue is empty. If the specified queue doesn't exist, Amazon
     * SQS returns a successful response.
     * </p>
     * <important>
     * <p>
     * Use <code>DeleteQueue</code> with care; once you delete your queue, any
     * messages in the queue are no longer available.
     * </p>
     * </important>
     * <p>
     * When you delete a queue, the deletion process takes up to 60 seconds.
     * Requests you send involving that queue during the 60 seconds might
     * succeed. For example, a <a>SendMessage</a> request might succeed, but
     * after the 60 seconds, the queue and that message you sent no longer
     * exist. Also, when you delete a queue, you must wait at least 60 seconds
     * before creating a queue with the same name.
     * </p>
     * <p>
     * We reserve the right to delete queues that have had no activity for more
     * than 30 days. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSConcepts.html"
     * >How Amazon SQS Queues Work</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param deleteQueueRequest <p/>
     * @return A Java Future object containing the response from the DeleteQueue
     *         service method, as returned by Amazon SQS.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the queue specified by the <b>queue URL</b>, regardless of
     * whether the queue is empty. If the specified queue doesn't exist, Amazon
     * SQS returns a successful response.
     * </p>
     * <important>
     * <p>
     * Use <code>DeleteQueue</code> with care; once you delete your queue, any
     * messages in the queue are no longer available.
     * </p>
     * </important>
     * <p>
     * When you delete a queue, the deletion process takes up to 60 seconds.
     * Requests you send involving that queue during the 60 seconds might
     * succeed. For example, a <a>SendMessage</a> request might succeed, but
     * after the 60 seconds, the queue and that message you sent no longer
     * exist. Also, when you delete a queue, you must wait at least 60 seconds
     * before creating a queue with the same name.
     * </p>
     * <p>
     * We reserve the right to delete queues that have had no activity for more
     * than 30 days. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSConcepts.html"
     * >How Amazon SQS Queues Work</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param deleteQueueRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the DeleteQueue
     *         service method, as returned by Amazon SQS.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest,
            AsyncHandler<DeleteQueueRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Gets attributes for the specified queue.
     * </p>
     * <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param getQueueAttributesRequest <p/>
     * @return A Java Future object containing the response from the
     *         GetQueueAttributes service method, as returned by Amazon SQS.
     * @throws InvalidAttributeNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<GetQueueAttributesResult> getQueueAttributesAsync(
            GetQueueAttributesRequest getQueueAttributesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Gets attributes for the specified queue.
     * </p>
     * <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param getQueueAttributesRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetQueueAttributes service method, as returned by Amazon SQS.
     * @throws InvalidAttributeNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<GetQueueAttributesResult> getQueueAttributesAsync(
            GetQueueAttributesRequest getQueueAttributesRequest,
            AsyncHandler<GetQueueAttributesRequest, GetQueueAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the URL of an existing queue. This action provides a simple way
     * to retrieve the URL of an Amazon SQS queue.
     * </p>
     * <p>
     * To access a queue that belongs to another AWS account, use the
     * <code>QueueOwnerAWSAccountId</code> parameter to specify the account ID
     * of the queue's owner. The queue's owner must grant you permission to
     * access the queue. For more information about shared queue access, see
     * <a>AddPermission</a> or see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"
     * >Shared Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param getQueueUrlRequest <p/>
     * @return A Java Future object containing the response from the GetQueueUrl
     *         service method, as returned by Amazon SQS.
     * @throws QueueDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<GetQueueUrlResult> getQueueUrlAsync(GetQueueUrlRequest getQueueUrlRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the URL of an existing queue. This action provides a simple way
     * to retrieve the URL of an Amazon SQS queue.
     * </p>
     * <p>
     * To access a queue that belongs to another AWS account, use the
     * <code>QueueOwnerAWSAccountId</code> parameter to specify the account ID
     * of the queue's owner. The queue's owner must grant you permission to
     * access the queue. For more information about shared queue access, see
     * <a>AddPermission</a> or see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"
     * >Shared Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param getQueueUrlRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the GetQueueUrl
     *         service method, as returned by Amazon SQS.
     * @throws QueueDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<GetQueueUrlResult> getQueueUrlAsync(GetQueueUrlRequest getQueueUrlRequest,
            AsyncHandler<GetQueueUrlRequest, GetQueueUrlResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your queues that have the RedrivePolicy queue attribute
     * configured with a dead letter queue.
     * </p>
     * <p>
     * For more information about using dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * 
     * @param listDeadLetterSourceQueuesRequest <p/>
     * @return A Java Future object containing the response from the
     *         ListDeadLetterSourceQueues service method, as returned by Amazon
     *         SQS.
     * @throws QueueDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(
            ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your queues that have the RedrivePolicy queue attribute
     * configured with a dead letter queue.
     * </p>
     * <p>
     * For more information about using dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * 
     * @param listDeadLetterSourceQueuesRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListDeadLetterSourceQueues service method, as returned by Amazon
     *         SQS.
     * @throws QueueDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(
            ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest,
            AsyncHandler<ListDeadLetterSourceQueuesRequest, ListDeadLetterSourceQueuesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can be
     * returned is 1000. If you specify a value for the optional
     * <code>QueueNamePrefix</code> parameter, only queues with a name beginning
     * with the specified value are returned.
     * </p>
     * 
     * @param listQueuesRequest <p/>
     * @return A Java Future object containing the response from the ListQueues
     *         service method, as returned by Amazon SQS.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can be
     * returned is 1000. If you specify a value for the optional
     * <code>QueueNamePrefix</code> parameter, only queues with a name beginning
     * with the specified value are returned.
     * </p>
     * 
     * @param listQueuesRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListQueues
     *         service method, as returned by Amazon SQS.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest,
            AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the messages in a queue specified by the <b>queue URL</b>.
     * </p>
     * <important>
     * <p>
     * When you use the <code>PurgeQueue</code> API, the deleted messages in the
     * queue can't be retrieved.
     * </p>
     * </important>
     * <p>
     * When you purge a queue, the message deletion process takes up to 60
     * seconds. All messages sent to the queue before calling
     * <code>PurgeQueue</code> will be deleted; messages sent to the queue while
     * it is being purged might be deleted. While the queue is being purged,
     * messages sent to the queue before <code>PurgeQueue</code> was called
     * might be received, but will be deleted within the next minute.
     * </p>
     * 
     * @param purgeQueueRequest <p/>
     * @return A Java Future object containing the response from the PurgeQueue
     *         service method, as returned by Amazon SQS.
     * @throws QueueDoesNotExistException
     * @throws PurgeQueueInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> purgeQueueAsync(PurgeQueueRequest purgeQueueRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the messages in a queue specified by the <b>queue URL</b>.
     * </p>
     * <important>
     * <p>
     * When you use the <code>PurgeQueue</code> API, the deleted messages in the
     * queue can't be retrieved.
     * </p>
     * </important>
     * <p>
     * When you purge a queue, the message deletion process takes up to 60
     * seconds. All messages sent to the queue before calling
     * <code>PurgeQueue</code> will be deleted; messages sent to the queue while
     * it is being purged might be deleted. While the queue is being purged,
     * messages sent to the queue before <code>PurgeQueue</code> was called
     * might be received, but will be deleted within the next minute.
     * </p>
     * 
     * @param purgeQueueRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the PurgeQueue
     *         service method, as returned by Amazon SQS.
     * @throws QueueDoesNotExistException
     * @throws PurgeQueueInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> purgeQueueAsync(PurgeQueueRequest purgeQueueRequest,
            AsyncHandler<PurgeQueueRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves one or more messages, with a maximum limit of 10 messages, from
     * the specified queue. Long poll support is enabled by using the
     * <code>WaitTimeSeconds</code> parameter. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html"
     * >Amazon SQS Long Poll</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * Short poll is the default behavior where a weighted random set of
     * machines is sampled on a <code>ReceiveMessage</code> call. This means
     * only the messages on the sampled machines are returned. If the number of
     * messages in the queue is small (less than 1000), it is likely you will
     * get fewer messages than you requested per <code>ReceiveMessage</code>
     * call. If the number of messages in the queue is extremely small, you
     * might not receive any messages in a particular
     * <code>ReceiveMessage</code> response; in which case you should repeat the
     * request.
     * </p>
     * <p>
     * For each message returned, the response includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Message body
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message body. For information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message ID you received when you sent the message to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Receipt handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The receipt handle is the identifier you must provide when deleting the
     * message. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can provide the <code>VisibilityTimeout</code> parameter in your
     * request, which will be applied to the messages that Amazon SQS returns in
     * the response. If you don't include the parameter, the overall visibility
     * timeout for the queue is used for the returned messages. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * A message that is not deleted or a message whose visibility is not
     * extended before the visibility timeout expires counts as a failed
     * receive. Depending on the configuration of the queue, the message might
     * be sent to the dead letter queue.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code
     * that calls this action, we recommend that you structure your code so that
     * it can handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param receiveMessageRequest <p/>
     * @return A Java Future object containing the response from the
     *         ReceiveMessage service method, as returned by Amazon SQS.
     * @throws OverLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<ReceiveMessageResult> receiveMessageAsync(ReceiveMessageRequest receiveMessageRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves one or more messages, with a maximum limit of 10 messages, from
     * the specified queue. Long poll support is enabled by using the
     * <code>WaitTimeSeconds</code> parameter. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html"
     * >Amazon SQS Long Poll</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * Short poll is the default behavior where a weighted random set of
     * machines is sampled on a <code>ReceiveMessage</code> call. This means
     * only the messages on the sampled machines are returned. If the number of
     * messages in the queue is small (less than 1000), it is likely you will
     * get fewer messages than you requested per <code>ReceiveMessage</code>
     * call. If the number of messages in the queue is extremely small, you
     * might not receive any messages in a particular
     * <code>ReceiveMessage</code> response; in which case you should repeat the
     * request.
     * </p>
     * <p>
     * For each message returned, the response includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Message body
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message body. For information about MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message ID you received when you sent the message to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Receipt handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The receipt handle is the identifier you must provide when deleting the
     * message. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can provide the <code>VisibilityTimeout</code> parameter in your
     * request, which will be applied to the messages that Amazon SQS returns in
     * the response. If you don't include the parameter, the overall visibility
     * timeout for the queue is used for the returned messages. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * A message that is not deleted or a message whose visibility is not
     * extended before the visibility timeout expires counts as a failed
     * receive. Depending on the configuration of the queue, the message might
     * be sent to the dead letter queue.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code
     * that calls this action, we recommend that you structure your code so that
     * it can handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param receiveMessageRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ReceiveMessage service method, as returned by Amazon SQS.
     * @throws OverLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<ReceiveMessageResult> receiveMessageAsync(ReceiveMessageRequest receiveMessageRequest,
            AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the specified
     * <code>Label</code> parameter. Only the owner of the queue can remove
     * permissions.
     * </p>
     * 
     * @param removePermissionRequest <p/>
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by Amazon SQS.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> removePermissionAsync(RemovePermissionRequest removePermissionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the specified
     * <code>Label</code> parameter. Only the owner of the queue can remove
     * permissions.
     * </p>
     * 
     * @param removePermissionRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by Amazon SQS.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            AsyncHandler<RemovePermissionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delivers a message to the specified queue.
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) that are allowed in
     * your message, according to the W3C XML specification:
     * </p>
     * <p>
     * <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | [
     * <code>#x20</code> to <code>#xD7FF</code>] | [<code>#xE000</code> to
     * <code>#xFFFD</code>] | [<code>#x10000</code> to <code>#x10FFFF</code>]
     * </p>
     * <p>
     * For more information, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>. If you send any
     * characters that aren't included in this list, your request will be
     * rejected.
     * </p>
     * </important>
     * 
     * @param sendMessageRequest <p/>
     * @return A Java Future object containing the response from the SendMessage
     *         service method, as returned by Amazon SQS.
     * @throws InvalidMessageContentsException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<SendMessageResult> sendMessageAsync(SendMessageRequest sendMessageRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delivers a message to the specified queue.
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) that are allowed in
     * your message, according to the W3C XML specification:
     * </p>
     * <p>
     * <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | [
     * <code>#x20</code> to <code>#xD7FF</code>] | [<code>#xE000</code> to
     * <code>#xFFFD</code>] | [<code>#x10000</code> to <code>#x10FFFF</code>]
     * </p>
     * <p>
     * For more information, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>. If you send any
     * characters that aren't included in this list, your request will be
     * rejected.
     * </p>
     * </important>
     * 
     * @param sendMessageRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the SendMessage
     *         service method, as returned by Amazon SQS.
     * @throws InvalidMessageContentsException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<SendMessageResult> sendMessageAsync(SendMessageRequest sendMessageRequest,
            AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delivers up to ten messages to the specified queue. This is a batch
     * version of <code> <a>SendMessage</a> </code>. For a FIFO queue, multiple
     * messages within a single batch are enqueued in the order they are sent.
     * </p>
     * <p>
     * The result of sending each message is reported individually in the
     * response. Because the batch request can result in a combination of
     * successful and unsuccessful actions, you should check for batch errors
     * even when the call returns an HTTP status code of 200.
     * </p>
     * <p>
     * The maximum allowed individual message size and the maximum total payload
     * size (the sum of the individual lengths of all of the batched messages)
     * are both 256 KB (262,144 bytes).
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) that are allowed in
     * your message, according to the W3C XML specification:
     * </p>
     * <p>
     * <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | [
     * <code>#x20</code> to <code>#xD7FF</code>] | [<code>#xE000</code> to
     * <code>#xFFFD</code>] | [<code>#x10000</code> to <code>#x10FFFF</code>]
     * </p>
     * <p>
     * For more information, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>. If you send any
     * characters that aren't included in this list, your request will be
     * rejected.
     * </p>
     * </important>
     * <p>
     * If you don't specify the <code>DelaySeconds</code> parameter for an
     * entry, Amazon SQS uses the default for the queue.
     * </p>
     * <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param sendMessageBatchRequest <p/>
     * @return A Java Future object containing the response from the
     *         SendMessageBatch service method, as returned by Amazon SQS.
     * @throws TooManyEntriesInBatchRequestException
     * @throws EmptyBatchRequestException
     * @throws BatchEntryIdsNotDistinctException
     * @throws BatchRequestTooLongException
     * @throws InvalidBatchEntryIdException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<SendMessageBatchResult> sendMessageBatchAsync(
            SendMessageBatchRequest sendMessageBatchRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Delivers up to ten messages to the specified queue. This is a batch
     * version of <code> <a>SendMessage</a> </code>. For a FIFO queue, multiple
     * messages within a single batch are enqueued in the order they are sent.
     * </p>
     * <p>
     * The result of sending each message is reported individually in the
     * response. Because the batch request can result in a combination of
     * successful and unsuccessful actions, you should check for batch errors
     * even when the call returns an HTTP status code of 200.
     * </p>
     * <p>
     * The maximum allowed individual message size and the maximum total payload
     * size (the sum of the individual lengths of all of the batched messages)
     * are both 256 KB (262,144 bytes).
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) that are allowed in
     * your message, according to the W3C XML specification:
     * </p>
     * <p>
     * <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | [
     * <code>#x20</code> to <code>#xD7FF</code>] | [<code>#xE000</code> to
     * <code>#xFFFD</code>] | [<code>#x10000</code> to <code>#x10FFFF</code>]
     * </p>
     * <p>
     * For more information, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>. If you send any
     * characters that aren't included in this list, your request will be
     * rejected.
     * </p>
     * </important>
     * <p>
     * If you don't specify the <code>DelaySeconds</code> parameter for an
     * entry, Amazon SQS uses the default for the queue.
     * </p>
     * <note>
     * <p>
     * Some API actions take lists of parameters. These lists are specified
     * using the <code>param.n</code> notation. Values of <code>n</code> are
     * integers starting from 1. For example, a parameter list with two elements
     * looks like this:
     * </p>
     * </note>
     * <p>
     * <code>&amp;amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;amp;Attribute.2=that</code>
     * </p>
     * 
     * @param sendMessageBatchRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SendMessageBatch service method, as returned by Amazon SQS.
     * @throws TooManyEntriesInBatchRequestException
     * @throws EmptyBatchRequestException
     * @throws BatchEntryIdsNotDistinctException
     * @throws BatchRequestTooLongException
     * @throws InvalidBatchEntryIdException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<SendMessageBatchResult> sendMessageBatchAsync(
            SendMessageBatchRequest sendMessageBatchRequest,
            AsyncHandler<SendMessageBatchRequest, SendMessageBatchResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the value of one or more queue attributes. When you change a queue's
     * attributes, the change can take up to 60 seconds for most of the
     * attributes to propagate throughout the SQS system. Changes made to the
     * <code>MessageRetentionPeriod</code> attribute can take up to 15 minutes.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. When you write code that
     * calls this action, we recommend structuring your code so that it can
     * handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param setQueueAttributesRequest <p/>
     * @return A Java Future object containing the response from the
     *         SetQueueAttributes service method, as returned by Amazon SQS.
     * @throws InvalidAttributeNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> setQueueAttributesAsync(SetQueueAttributesRequest setQueueAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the value of one or more queue attributes. When you change a queue's
     * attributes, the change can take up to 60 seconds for most of the
     * attributes to propagate throughout the SQS system. Changes made to the
     * <code>MessageRetentionPeriod</code> attribute can take up to 15 minutes.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. When you write code that
     * calls this action, we recommend structuring your code so that it can
     * handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param setQueueAttributesRequest <p/>
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         SetQueueAttributes service method, as returned by Amazon SQS.
     * @throws InvalidAttributeNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    Future<Void> setQueueAttributesAsync(SetQueueAttributesRequest setQueueAttributesRequest,
            AsyncHandler<SetQueueAttributesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
