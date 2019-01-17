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

import org.w3c.dom.*;

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.services.sqs.model.transform.*;

/**
 * Client for accessing Amazon SQS. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
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
 */
public class AmazonSQSClient extends AmazonWebServiceClient implements AmazonSQS {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon SQS exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AmazonSQS. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonSQSClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSQS. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonSQS (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonSQSClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSQS using the
     * specified AWS account credentials.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonSQSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSQS using the
     * specified AWS account credentials and client configuration options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonSQS (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonSQSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSQS using the
     * specified AWS account credentials provider.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonSQSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSQS using the
     * specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonSQS (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonSQSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSQS using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonSQS (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonSQSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSQS using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonSQS (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonSQSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new BatchEntryIdsNotDistinctExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchRequestTooLongExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EmptyBatchRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAttributeNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidBatchEntryIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidIdFormatExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidMessageContentsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MessageNotInflightExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OverLimitExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PurgeQueueInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueueDeletedRecentlyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueueDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueueNameExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReceiptHandleIsInvalidExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyEntriesInBatchRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("sqs.us-east-1.amazonaws.com");
        this.endpointPrefix = "sqs";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/sqs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/sqs/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

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
     * @throws OverLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void addPermission(AddPermissionRequest addPermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddPermissionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new AddPermissionRequestMarshaller().marshall(addPermissionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    public void changeMessageVisibility(
            ChangeMessageVisibilityRequest changeMessageVisibilityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(changeMessageVisibilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangeMessageVisibilityRequest> request = null;
        Response<Void> response = null;
        try {
            request = new ChangeMessageVisibilityRequestMarshaller()
                    .marshall(changeMessageVisibilityRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return changeMessageVisibilityBatchResult The response from the
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
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(
            ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(changeMessageVisibilityBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangeMessageVisibilityBatchRequest> request = null;
        Response<ChangeMessageVisibilityBatchResult> response = null;
        try {
            request = new ChangeMessageVisibilityBatchRequestMarshaller()
                    .marshall(changeMessageVisibilityBatchRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ChangeMessageVisibilityBatchResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return createQueueResult The response from the CreateQueue service
     *         method, as returned by Amazon SQS.
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
    public CreateQueueResult createQueue(CreateQueueRequest createQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQueueRequest> request = null;
        Response<CreateQueueResult> response = null;
        try {
            request = new CreateQueueRequestMarshaller().marshall(createQueueRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateQueueResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    public void deleteMessage(DeleteMessageRequest deleteMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMessageRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteMessageRequestMarshaller().marshall(deleteMessageRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return deleteMessageBatchResult The response from the DeleteMessageBatch
     *         service method, as returned by Amazon SQS.
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
    public DeleteMessageBatchResult deleteMessageBatch(
            DeleteMessageBatchRequest deleteMessageBatchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMessageBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMessageBatchRequest> request = null;
        Response<DeleteMessageBatchResult> response = null;
        try {
            request = new DeleteMessageBatchRequestMarshaller().marshall(deleteMessageBatchRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteMessageBatchResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void deleteQueue(DeleteQueueRequest deleteQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueueRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteQueueRequestMarshaller().marshall(deleteQueueRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return getQueueAttributesResult The response from the GetQueueAttributes
     *         service method, as returned by Amazon SQS.
     * @throws InvalidAttributeNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public GetQueueAttributesResult getQueueAttributes(
            GetQueueAttributesRequest getQueueAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getQueueAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueAttributesRequest> request = null;
        Response<GetQueueAttributesResult> response = null;
        try {
            request = new GetQueueAttributesRequestMarshaller().marshall(getQueueAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetQueueAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return getQueueUrlResult The response from the GetQueueUrl service
     *         method, as returned by Amazon SQS.
     * @throws QueueDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public GetQueueUrlResult getQueueUrl(GetQueueUrlRequest getQueueUrlRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getQueueUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueUrlRequest> request = null;
        Response<GetQueueUrlResult> response = null;
        try {
            request = new GetQueueUrlRequestMarshaller().marshall(getQueueUrlRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetQueueUrlResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return listDeadLetterSourceQueuesResult The response from the
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
    public ListDeadLetterSourceQueuesResult listDeadLetterSourceQueues(
            ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDeadLetterSourceQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeadLetterSourceQueuesRequest> request = null;
        Response<ListDeadLetterSourceQueuesResult> response = null;
        try {
            request = new ListDeadLetterSourceQueuesRequestMarshaller()
                    .marshall(listDeadLetterSourceQueuesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListDeadLetterSourceQueuesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can be
     * returned is 1000. If you specify a value for the optional
     * <code>QueueNamePrefix</code> parameter, only queues with a name beginning
     * with the specified value are returned.
     * </p>
     * 
     * @param listQueuesRequest <p/>
     * @return listQueuesResult The response from the ListQueues service method,
     *         as returned by Amazon SQS.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueuesRequest> request = null;
        Response<ListQueuesResult> response = null;
        try {
            request = new ListQueuesRequestMarshaller().marshall(listQueuesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListQueuesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    public void purgeQueue(PurgeQueueRequest purgeQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(purgeQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurgeQueueRequest> request = null;
        Response<Void> response = null;
        try {
            request = new PurgeQueueRequestMarshaller().marshall(purgeQueueRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return receiveMessageResult The response from the ReceiveMessage service
     *         method, as returned by Amazon SQS.
     * @throws OverLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ReceiveMessageResult receiveMessage(ReceiveMessageRequest receiveMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(receiveMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReceiveMessageRequest> request = null;
        Response<ReceiveMessageResult> response = null;
        try {
            request = new ReceiveMessageRequestMarshaller().marshall(receiveMessageRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ReceiveMessageResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the specified
     * <code>Label</code> parameter. Only the owner of the queue can remove
     * permissions.
     * </p>
     * 
     * @param removePermissionRequest <p/>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void removePermission(RemovePermissionRequest removePermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemovePermissionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new RemovePermissionRequestMarshaller().marshall(removePermissionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return sendMessageResult The response from the SendMessage service
     *         method, as returned by Amazon SQS.
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
    public SendMessageResult sendMessage(SendMessageRequest sendMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessageRequest> request = null;
        Response<SendMessageResult> response = null;
        try {
            request = new SendMessageRequestMarshaller().marshall(sendMessageRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new SendMessageResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return sendMessageBatchResult The response from the SendMessageBatch
     *         service method, as returned by Amazon SQS.
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
    public SendMessageBatchResult sendMessageBatch(SendMessageBatchRequest sendMessageBatchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendMessageBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessageBatchRequest> request = null;
        Response<SendMessageBatchResult> response = null;
        try {
            request = new SendMessageBatchRequestMarshaller().marshall(sendMessageBatchRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new SendMessageBatchResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @throws InvalidAttributeNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void setQueueAttributes(SetQueueAttributesRequest setQueueAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setQueueAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetQueueAttributesRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SetQueueAttributesRequestMarshaller().marshall(setQueueAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param attributeNames <p>
     *            A list of attributes for which to retrieve information.
     *            </p>
     *            <note>
     *            <p>
     *            Going forward, new attributes might be added. If you are
     *            writing code that calls this action, we recommend that you
     *            structure your code so that it can handle new attributes
     *            gracefully.
     *            </p>
     *            </note>
     *            <p>
     *            The following attributes are supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>All</code> - Returns all values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessages</code> - Returns the
     *            approximate number of visible messages in a queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesDelayed</code> - Returns the
     *            approximate number of messages that are waiting to be added to
     *            the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ApproximateNumberOfMessagesNotVisible</code> - Returns
     *            the approximate number of messages that have not timed-out and
     *            are not deleted. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     *            >Resources Required to Process Messages</a> in the <i>Amazon
     *            SQS Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreatedTimestamp</code> - Returns the time when the
     *            queue was created in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> - Returns the default delay on the
     *            queue in seconds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LastModifiedTimestamp</code> - Returns the time when the
     *            queue was last changed in seconds (epoch time).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - Returns the limit of how
     *            many bytes a message can contain before Amazon SQS rejects it.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - Returns the number of
     *            seconds for which Amazon SQS retains a message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> - Returns the policy of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QueueArn</code> - Returns the Amazon resource name (ARN)
     *            of the queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> - Returns the
     *            number of seconds for which ReceiveMessage call will wait for
     *            a message to arrive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - Returns the parameters for dead
     *            letter queue functionality of the source queue. For more
     *            information about the redrive policy and dead letter queues,
     *            see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - Returns the visibility
     *            timeout for the queue. For more information about the
     *            visibility timeout, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *            >Visibility Timeout</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attributes apply only to <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *            >FIFO (first-in-first-out) queues</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FifoQueue</code> - Returns whether the queue is FIFO.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic"
     *            >FIFO Queue Logic</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> - Returns whether
     *            content-based deduplication is enabled for the queue. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return getQueueAttributesResult The response from the GetQueueAttributes
     *         service method, as returned by Amazon SQS.
     * @throws InvalidAttributeNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public GetQueueAttributesResult getQueueAttributes(String queueUrl,
            java.util.List<String> attributeNames)
            throws AmazonServiceException, AmazonClientException {
        GetQueueAttributesRequest getQueueAttributesRequest = new GetQueueAttributesRequest();
        getQueueAttributesRequest.setQueueUrl(queueUrl);
        getQueueAttributesRequest.setAttributeNames(attributeNames);
        return getQueueAttributes(getQueueAttributesRequest);
    }

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
     * @param queueName <p>
     *            The name of the new queue. The following limits apply to this
     *            name:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A queue name can have up to 80 characters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The following are accepted: alphanumeric chatacters, hyphens (
     *            <code>-</code>), and underscores (<code>_</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A FIFO queue name must end with the <code>.fifo</code> suffix.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Queue names are case-sensitive.
     *            </p>
     * @return createQueueResult The response from the CreateQueue service
     *         method, as returned by Amazon SQS.
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
    public CreateQueueResult createQueue(String queueName)
            throws AmazonServiceException, AmazonClientException {
        CreateQueueRequest createQueueRequest = new CreateQueueRequest();
        createQueueRequest.setQueueName(queueName);
        return createQueue(createQueueRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void deleteQueue(String queueUrl)
            throws AmazonServiceException, AmazonClientException {
        DeleteQueueRequest deleteQueueRequest = new DeleteQueueRequest();
        deleteQueueRequest.setQueueUrl(queueUrl);
        deleteQueue(deleteQueueRequest);
    }

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
     * @param queueName <p>
     *            The name of the queue whose URL must be fetched. Maximum 80
     *            characters; alphanumeric characters, hyphens (-), and
     *            underscores (_) are allowed.
     *            </p>
     *            <p>
     *            Queue names are case-sensitive.
     *            </p>
     * @return getQueueUrlResult The response from the GetQueueUrl service
     *         method, as returned by Amazon SQS.
     * @throws QueueDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public GetQueueUrlResult getQueueUrl(String queueName)
            throws AmazonServiceException, AmazonClientException {
        GetQueueUrlRequest getQueueUrlRequest = new GetQueueUrlRequest();
        getQueueUrlRequest.setQueueName(queueName);
        return getQueueUrl(getQueueUrlRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @return receiveMessageResult The response from the ReceiveMessage service
     *         method, as returned by Amazon SQS.
     * @throws OverLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ReceiveMessageResult receiveMessage(String queueUrl)
            throws AmazonServiceException, AmazonClientException {
        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest();
        receiveMessageRequest.setQueueUrl(queueUrl);
        return receiveMessage(receiveMessageRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param messageBody <p>
     *            The message to send. String maximum 256 KB in size. For a list
     *            of allowed characters, see the preceding note.
     *            </p>
     * @return sendMessageResult The response from the SendMessage service
     *         method, as returned by Amazon SQS.
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
    public SendMessageResult sendMessage(String queueUrl, String messageBody)
            throws AmazonServiceException, AmazonClientException {
        SendMessageRequest sendMessageRequest = new SendMessageRequest();
        sendMessageRequest.setQueueUrl(queueUrl);
        sendMessageRequest.setMessageBody(messageBody);
        return sendMessage(sendMessageRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param entries <p>
     *            A list of receipt handles for the messages to be deleted.
     *            </p>
     * @return deleteMessageBatchResult The response from the DeleteMessageBatch
     *         service method, as returned by Amazon SQS.
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
    public DeleteMessageBatchResult deleteMessageBatch(String queueUrl,
            java.util.List<DeleteMessageBatchRequestEntry> entries)
            throws AmazonServiceException, AmazonClientException {
        DeleteMessageBatchRequest deleteMessageBatchRequest = new DeleteMessageBatchRequest();
        deleteMessageBatchRequest.setQueueUrl(queueUrl);
        deleteMessageBatchRequest.setEntries(entries);
        return deleteMessageBatch(deleteMessageBatchRequest);
    }

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can be
     * returned is 1000. If you specify a value for the optional
     * <code>QueueNamePrefix</code> parameter, only queues with a name beginning
     * with the specified value are returned.
     * </p>
     * 
     * @return listQueuesResult The response from the ListQueues service method,
     *         as returned by Amazon SQS.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListQueuesResult listQueues()
            throws AmazonServiceException, AmazonClientException {
        ListQueuesRequest listQueuesRequest = new ListQueuesRequest();
        return listQueues(listQueuesRequest);
    }

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can be
     * returned is 1000. If you specify a value for the optional
     * <code>QueueNamePrefix</code> parameter, only queues with a name beginning
     * with the specified value are returned.
     * </p>
     * 
     * @param queueNamePrefix <p>
     *            A string to use for filtering the list results. Only those
     *            queues whose name begins with the specified string are
     *            returned.
     *            </p>
     *            <p>
     *            Queue names are case-sensitive.
     *            </p>
     * @return listQueuesResult The response from the ListQueues service method,
     *         as returned by Amazon SQS.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public ListQueuesResult listQueues(String queueNamePrefix)
            throws AmazonServiceException, AmazonClientException {
        ListQueuesRequest listQueuesRequest = new ListQueuesRequest();
        listQueuesRequest.setQueueNamePrefix(queueNamePrefix);
        return listQueues(listQueuesRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param receiptHandle <p>
     *            The receipt handle associated with the message to delete.
     *            </p>
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
    public void deleteMessage(String queueUrl, String receiptHandle)
            throws AmazonServiceException, AmazonClientException {
        DeleteMessageRequest deleteMessageRequest = new DeleteMessageRequest();
        deleteMessageRequest.setQueueUrl(queueUrl);
        deleteMessageRequest.setReceiptHandle(receiptHandle);
        deleteMessage(deleteMessageRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param entries <p>
     *            A list of <a>SendMessageBatchRequestEntry</a> items.
     *            </p>
     * @return sendMessageBatchResult The response from the SendMessageBatch
     *         service method, as returned by Amazon SQS.
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
    public SendMessageBatchResult sendMessageBatch(String queueUrl,
            java.util.List<SendMessageBatchRequestEntry> entries)
            throws AmazonServiceException, AmazonClientException {
        SendMessageBatchRequest sendMessageBatchRequest = new SendMessageBatchRequest();
        sendMessageBatchRequest.setQueueUrl(queueUrl);
        sendMessageBatchRequest.setEntries(entries);
        return sendMessageBatch(sendMessageBatchRequest);
    }

    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the specified
     * <code>Label</code> parameter. Only the owner of the queue can remove
     * permissions.
     * </p>
     * 
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param label <p>
     *            The identification of the permission to remove. This is the
     *            label added with the <a>AddPermission</a> action.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void removePermission(String queueUrl, String label)
            throws AmazonServiceException, AmazonClientException {
        RemovePermissionRequest removePermissionRequest = new RemovePermissionRequest();
        removePermissionRequest.setQueueUrl(queueUrl);
        removePermissionRequest.setLabel(label);
        removePermission(removePermissionRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param label <p>
     *            The unique identification of the permission you're setting
     *            (e.g., <code>AliceSendMessage</code>). Constraints: Maximum 80
     *            characters; alphanumeric characters, hyphens (-), and
     *            underscores (_) are allowed.
     *            </p>
     * @param aWSAccountIds <p>
     *            The AWS account number of the <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     *            >principal</a> who will be given permission. The principal
     *            must have an AWS account, but does not need to be signed up
     *            for Amazon SQS. For information about locating the AWS account
     *            identification, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html"
     *            >Your AWS Identifiers</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     * @param actions <p>
     *            The action the client wants to allow for the specified
     *            principal. The following are valid values:
     *            <code>* | SendMessage | ReceiveMessage | DeleteMessage | ChangeMessageVisibility | GetQueueAttributes | GetQueueUrl</code>
     *            . For more information about these actions, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes"
     *            >Understanding Permissions</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            <p>
     *            Specifying <code>SendMessage</code>,
     *            <code>DeleteMessage</code>, or
     *            <code>ChangeMessageVisibility</code> for the
     *            <code>ActionName.n</code> also grants permissions for the
     *            corresponding batch versions of those actions:
     *            <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>
     *            , and <code>ChangeMessageVisibilityBatch</code>.
     *            </p>
     * @throws OverLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void addPermission(String queueUrl, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actions)
            throws AmazonServiceException, AmazonClientException {
        AddPermissionRequest addPermissionRequest = new AddPermissionRequest();
        addPermissionRequest.setQueueUrl(queueUrl);
        addPermissionRequest.setLabel(label);
        addPermissionRequest.setAWSAccountIds(aWSAccountIds);
        addPermissionRequest.setActions(actions);
        addPermission(addPermissionRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param receiptHandle <p>
     *            The receipt handle associated with the message whose
     *            visibility timeout should be changed. This parameter is
     *            returned by the <a>ReceiveMessage</a> action.
     *            </p>
     * @param visibilityTimeout <p>
     *            The new value (in seconds - from 0 to 43200 - maximum 12
     *            hours) for the message's visibility timeout.
     *            </p>
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
    public void changeMessageVisibility(String queueUrl, String receiptHandle,
            Integer visibilityTimeout)
            throws AmazonServiceException, AmazonClientException {
        ChangeMessageVisibilityRequest changeMessageVisibilityRequest = new ChangeMessageVisibilityRequest();
        changeMessageVisibilityRequest.setQueueUrl(queueUrl);
        changeMessageVisibilityRequest.setReceiptHandle(receiptHandle);
        changeMessageVisibilityRequest.setVisibilityTimeout(visibilityTimeout);
        changeMessageVisibility(changeMessageVisibilityRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param entries <p>
     *            A list of receipt handles of the messages for which the
     *            visibility timeout must be changed.
     *            </p>
     * @return changeMessageVisibilityBatchResult The response from the
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
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(String queueUrl,
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries)
            throws AmazonServiceException, AmazonClientException {
        ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest = new ChangeMessageVisibilityBatchRequest();
        changeMessageVisibilityBatchRequest.setQueueUrl(queueUrl);
        changeMessageVisibilityBatchRequest.setEntries(entries);
        return changeMessageVisibilityBatch(changeMessageVisibilityBatchRequest);
    }

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
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue to take action on.
     *            </p>
     *            <p>
     *            Queue URLs are case-sensitive.
     *            </p>
     * @param attributes <p>
     *            A map of attributes to set.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that the
     *            <code>SetQueueAttributes</code> action uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DelaySeconds</code> - The number of seconds for which
     *            the delivery of all messages in the queue is delayed. An
     *            integer from 0 to 900 (15 minutes). The default is 0 (zero).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaximumMessageSize</code> - The limit of how many bytes
     *            a message can contain before Amazon SQS rejects it. An integer
     *            from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The
     *            default is 262,144 (256 KiB).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MessageRetentionPeriod</code> - The number of seconds
     *            for which Amazon SQS retains a message. An integer
     *            representing seconds, from 60 (1 minute) to 120,9600 (14
     *            days). The default is 345,600 (4 days).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> - The queue's policy. A valid AWS policy.
     *            For more information about policy structure, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html"
     *            >Overview of AWS IAM Policies</a> in the <i>Amazon IAM User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReceiveMessageWaitTimeSeconds</code> - The number of
     *            seconds for which a <a>ReceiveMessage</a> action will wait for
     *            a message to arrive. An integer from 0 to 20 (seconds). The
     *            default is 0.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> - The parameters for the dead
     *            letter queue functionality of the source queue. For more
     *            information about the redrive policy and dead letter queues,
     *            see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     *            >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The dead letter queue of a FIFO queue must also be a FIFO
     *            queue. Similarly, the dead letter queue of a standard queue
     *            must also be a standard queue.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>VisibilityTimeout</code> - The visibility timeout for
     *            the queue. An integer from 0 to 43200 (12 hours). The default
     *            is 30. For more information about the visibility timeout, see
     *            <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     *            >Visibility Timeout</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html"
     *            >FIFO (first-in-first-out) queues</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> - Enables content-based
     *            deduplication. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *            >Exactly-Once Processing</a> in the <i>Amazon SQS Developer
     *            Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Every message must have a unique
     *            <code>MessageDeduplicationId</code>,
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You may provide a <code>MessageDeduplicationId</code>
     *            explicitly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you aren't able to provide a
     *            <code>MessageDeduplicationId</code> and you enable
     *            <code>ContentBasedDeduplication</code> for your queue, Amazon
     *            SQS uses a SHA-256 hash to generate the
     *            <code>MessageDeduplicationId</code> using the body of the
     *            message (but not the attributes of the message).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't provide a <code>MessageDeduplicationId</code> and
     *            the queue doesn't have <code>ContentBasedDeduplication</code>
     *            set, the action fails with an error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the queue has <code>ContentBasedDeduplication</code> set,
     *            your <code>MessageDeduplicationId</code> overrides the
     *            generated one.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            When <code>ContentBasedDeduplication</code> is in effect,
     *            messages with identical content sent within the deduplication
     *            interval are treated as duplicates and only one copy of the
     *            message is delivered.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can also use <code>ContentBasedDeduplication</code> for
     *            messages with identical content to be treated as duplicates.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you send one message with
     *            <code>ContentBasedDeduplication</code> enabled and then
     *            another message with a <code>MessageDeduplicationId</code>
     *            that is the same as the one generated for the first
     *            <code>MessageDeduplicationId</code>, the two messages are
     *            treated as duplicates and only one copy of the message is
     *            delivered.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            Any other valid special request parameters that are specified
     *            (such as <code>ApproximateNumberOfMessages</code>,
     *            <code>ApproximateNumberOfMessagesDelayed</code>,
     *            <code>ApproximateNumberOfMessagesNotVisible</code>,
     *            <code>CreatedTimestamp</code>,
     *            <code>LastModifiedTimestamp</code>, and <code>QueueArn</code>)
     *            will be ignored.
     *            </p>
     * @throws InvalidAttributeNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SQS indicating either a problem with the data in the request,
     *             or a server side issue.
     */
    public void setQueueAttributes(String queueUrl, java.util.Map<String, String> attributes)
            throws AmazonServiceException, AmazonClientException {
        SetQueueAttributesRequest setQueueAttributesRequest = new SetQueueAttributesRequest();
        setQueueAttributesRequest.setQueueUrl(queueUrl);
        setQueueAttributesRequest.setAttributes(attributes);
        setQueueAttributes(setQueueAttributesRequest);
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
