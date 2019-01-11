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

package com.amazonaws.services.kinesis;

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

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.services.kinesis.model.transform.*;

/**
 * Client for accessing Amazon Kinesis Streams. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Amazon Kinesis Data Streams Service API Reference</fullname>
 * <p>
 * Amazon Kinesis Data Streams is a managed service that scales elastically for
 * real-time processing of streaming big data.
 * </p>
 */
public class AmazonKinesisClient extends AmazonWebServiceClient implements AmazonKinesis {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Kinesis Streams
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonKinesis. A
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
    public AmazonKinesisClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonKinesis. A
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
     *            how this client connects to AmazonKinesis (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonKinesisClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonKinesis using
     * the specified AWS account credentials.
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
    public AmazonKinesisClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonKinesis using
     * the specified AWS account credentials and client configuration options.
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
     *            how this client connects to AmazonKinesis (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonKinesisClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonKinesis using
     * the specified AWS account credentials provider.
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
    public AmazonKinesisClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonKinesis using
     * the specified AWS account credentials provider and client configuration
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
     *            how this client connects to AmazonKinesis (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonKinesisClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonKinesis using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonKinesis (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonKinesisClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonKinesis using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonKinesis (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonKinesisClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ExpiredIteratorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ExpiredNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSAccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSDisabledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSInvalidStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSOptInRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ProvisionedThroughputExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("kinesis.us-east-1.amazonaws.com");
        this.endpointPrefix = "kinesis";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/kinesis/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/kinesis/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds or updates tags for the specified Kinesis data stream. Each stream
     * can have up to 10 tags.
     * </p>
     * <p>
     * If tags have already been assigned to the stream,
     * <code>AddTagsToStream</code> overwrites any existing tags that correspond
     * to the specified tag keys.
     * </p>
     * <p>
     * <a>AddTagsToStream</a> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param addTagsToStreamRequest <p>
     *            Represents the input for <code>AddTagsToStream</code>.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void addTagsToStream(AddTagsToStreamRequest addTagsToStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addTagsToStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToStreamRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToStreamRequestMarshaller().marshall(addTagsToStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Kinesis data stream. A stream captures and transports data
     * records that are continuously emitted from different data sources or
     * <i>producers</i>. Scale-out within a stream is explicitly supported by
     * means of shards, which are uniquely identified groups of data records in
     * a stream.
     * </p>
     * <p>
     * You specify and control the number of shards that a stream is composed
     * of. Each shard can support reads up to five transactions per second, up
     * to a maximum data read total of 2 MB per second. Each shard can support
     * writes up to 1,000 records per second, up to a maximum data write total
     * of 1 MB per second. If the amount of data input increases or decreases,
     * you can add or remove shards.
     * </p>
     * <p>
     * The stream name identifies the stream. The name is scoped to the AWS
     * account used by the application. It is also scoped by AWS Region. That
     * is, two streams in two different accounts can have the same name, and two
     * streams in the same account, but in two different Regions, can have the
     * same name.
     * </p>
     * <p>
     * <code>CreateStream</code> is an asynchronous operation. Upon receiving a
     * <code>CreateStream</code> request, Kinesis Data Streams immediately
     * returns and sets the stream status to <code>CREATING</code>. After the
     * stream is created, Kinesis Data Streams sets the stream status to
     * <code>ACTIVE</code>. You should perform read and write operations only on
     * an <code>ACTIVE</code> stream.
     * </p>
     * <p>
     * You receive a <code>LimitExceededException</code> when making a
     * <code>CreateStream</code> request when you try to do one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Have more than five streams in the <code>CREATING</code> state at any
     * point in time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create more shards than are authorized for your account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the default shard limit for an AWS account, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
     * >Amazon Kinesis Data Streams Limits</a> in the <i>Amazon Kinesis Data
     * Streams Developer Guide</i>. To increase this limit, <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >contact AWS Support</a>.
     * </p>
     * <p>
     * You can use <code>DescribeStream</code> to check the stream status, which
     * is returned in <code>StreamStatus</code>.
     * </p>
     * <p>
     * <a>CreateStream</a> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param createStreamRequest <p>
     *            Represents the input for <code>CreateStream</code>.
     *            </p>
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void createStream(CreateStreamRequest createStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamRequestMarshaller().marshall(createStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Decreases the Kinesis data stream's retention period, which is the length
     * of time data records are accessible after they are added to the stream.
     * The minimum value of a stream's retention period is 24 hours.
     * </p>
     * <p>
     * This operation may result in lost data. For example, if the stream's
     * retention period is 48 hours and is decreased to 24 hours, any data
     * already in the stream that is older than 24 hours is inaccessible.
     * </p>
     * 
     * @param decreaseStreamRetentionPeriodRequest <p>
     *            Represents the input for <a>DecreaseStreamRetentionPeriod</a>.
     *            </p>
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void decreaseStreamRetentionPeriod(
            DecreaseStreamRetentionPeriodRequest decreaseStreamRetentionPeriodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(decreaseStreamRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecreaseStreamRetentionPeriodRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecreaseStreamRetentionPeriodRequestMarshaller()
                        .marshall(decreaseStreamRetentionPeriodRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a Kinesis data stream and all its shards and data. You must shut
     * down any applications that are operating on the stream before you delete
     * the stream. If an application attempts to operate on a deleted stream, it
     * receives the exception <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the stream is in the <code>ACTIVE</code> state, you can delete it.
     * After a <code>DeleteStream</code> request, the specified stream is in the
     * <code>DELETING</code> state until Kinesis Data Streams completes the
     * deletion.
     * </p>
     * <p>
     * <b>Note:</b> Kinesis Data Streams might continue to accept data read and
     * write operations, such as <a>PutRecord</a>, <a>PutRecords</a>, and
     * <a>GetRecords</a>, on a stream in the <code>DELETING</code> state until
     * the stream deletion is complete.
     * </p>
     * <p>
     * When you delete a stream, any shards in that stream are also deleted, and
     * any tags are dissociated from the stream.
     * </p>
     * <p>
     * You can use the <a>DescribeStream</a> operation to check the state of the
     * stream, which is returned in <code>StreamStatus</code>.
     * </p>
     * <p>
     * <a>DeleteStream</a> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param deleteStreamRequest <p>
     *            Represents the input for <a>DeleteStream</a>.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deleteStream(DeleteStreamRequest deleteStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamRequestMarshaller().marshall(deleteStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the shard limits and usage for the account.
     * </p>
     * <p>
     * If you update your account limits, the old limits might be returned for a
     * few minutes.
     * </p>
     * <p>
     * This operation has a limit of one transaction per second per account.
     * </p>
     * 
     * @param describeLimitsRequest
     * @return describeLimitsResult The response from the DescribeLimits service
     *         method, as returned by Amazon Kinesis Streams.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeLimitsResult describeLimits(DescribeLimitsRequest describeLimitsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLimitsRequest> request = null;
        Response<DescribeLimitsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLimitsRequestMarshaller().marshall(describeLimitsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLimitsResult, JsonUnmarshallerContext> unmarshaller = new DescribeLimitsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLimitsResult> responseHandler = new JsonResponseHandler<DescribeLimitsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the specified Kinesis data stream.
     * </p>
     * <p>
     * The information returned includes the stream name, Amazon Resource Name
     * (ARN), creation time, enhanced metric configuration, and shard map. The
     * shard map is an array of shard objects. For each shard object, there is
     * the hash key and sequence number ranges that the shard spans, and the IDs
     * of any earlier shards that played in a role in creating the shard. Every
     * record ingested in the stream is identified by a sequence number, which
     * is assigned when the record is put into the stream.
     * </p>
     * <p>
     * You can limit the number of shards returned by each call. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-retrieve-shards.html"
     * >Retrieving Shards from a Stream</a> in the <i>Amazon Kinesis Data
     * Streams Developer Guide</i>.
     * </p>
     * <p>
     * There are no guarantees about the chronological order shards returned. To
     * process shards in chronological order, use the ID of the parent shard to
     * track the lineage to the oldest shard.
     * </p>
     * <p>
     * This operation has a limit of 10 transactions per second per account.
     * </p>
     * 
     * @param describeStreamRequest <p>
     *            Represents the input for <code>DescribeStream</code>.
     *            </p>
     * @return describeStreamResult The response from the DescribeStream service
     *         method, as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStreamResult describeStream(DescribeStreamRequest describeStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamRequest> request = null;
        Response<DescribeStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamRequestMarshaller().marshall(describeStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStreamResult, JsonUnmarshallerContext> unmarshaller = new DescribeStreamResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStreamResult> responseHandler = new JsonResponseHandler<DescribeStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides a summarized description of the specified Kinesis data stream
     * without the shard list.
     * </p>
     * <p>
     * The information returned includes the stream name, Amazon Resource Name
     * (ARN), status, record retention period, approximate creation time,
     * monitoring, encryption details, and open shard count.
     * </p>
     * 
     * @param describeStreamSummaryRequest
     * @return describeStreamSummaryResult The response from the
     *         DescribeStreamSummary service method, as returned by Amazon
     *         Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStreamSummaryResult describeStreamSummary(
            DescribeStreamSummaryRequest describeStreamSummaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStreamSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamSummaryRequest> request = null;
        Response<DescribeStreamSummaryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamSummaryRequestMarshaller()
                        .marshall(describeStreamSummaryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStreamSummaryResult, JsonUnmarshallerContext> unmarshaller = new DescribeStreamSummaryResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStreamSummaryResult> responseHandler = new JsonResponseHandler<DescribeStreamSummaryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables enhanced monitoring.
     * </p>
     * 
     * @param disableEnhancedMonitoringRequest <p>
     *            Represents the input for <a>DisableEnhancedMonitoring</a>.
     *            </p>
     * @return disableEnhancedMonitoringResult The response from the
     *         DisableEnhancedMonitoring service method, as returned by Amazon
     *         Kinesis Streams.
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisableEnhancedMonitoringResult disableEnhancedMonitoring(
            DisableEnhancedMonitoringRequest disableEnhancedMonitoringRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableEnhancedMonitoringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableEnhancedMonitoringRequest> request = null;
        Response<DisableEnhancedMonitoringResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableEnhancedMonitoringRequestMarshaller()
                        .marshall(disableEnhancedMonitoringRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableEnhancedMonitoringResult, JsonUnmarshallerContext> unmarshaller = new DisableEnhancedMonitoringResultJsonUnmarshaller();
            JsonResponseHandler<DisableEnhancedMonitoringResult> responseHandler = new JsonResponseHandler<DisableEnhancedMonitoringResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables enhanced Kinesis data stream monitoring for shard-level metrics.
     * </p>
     * 
     * @param enableEnhancedMonitoringRequest <p>
     *            Represents the input for <a>EnableEnhancedMonitoring</a>.
     *            </p>
     * @return enableEnhancedMonitoringResult The response from the
     *         EnableEnhancedMonitoring service method, as returned by Amazon
     *         Kinesis Streams.
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public EnableEnhancedMonitoringResult enableEnhancedMonitoring(
            EnableEnhancedMonitoringRequest enableEnhancedMonitoringRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableEnhancedMonitoringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableEnhancedMonitoringRequest> request = null;
        Response<EnableEnhancedMonitoringResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableEnhancedMonitoringRequestMarshaller()
                        .marshall(enableEnhancedMonitoringRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableEnhancedMonitoringResult, JsonUnmarshallerContext> unmarshaller = new EnableEnhancedMonitoringResultJsonUnmarshaller();
            JsonResponseHandler<EnableEnhancedMonitoringResult> responseHandler = new JsonResponseHandler<EnableEnhancedMonitoringResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets data records from a Kinesis data stream's shard.
     * </p>
     * <p>
     * Specify a shard iterator using the <code>ShardIterator</code> parameter.
     * The shard iterator specifies the position in the shard from which you
     * want to start reading data records sequentially. If there are no records
     * available in the portion of the shard that the iterator points to,
     * <a>GetRecords</a> returns an empty list. It might take multiple calls to
     * get to a portion of the shard that contains records.
     * </p>
     * <p>
     * You can scale by provisioning multiple shards per stream while
     * considering service limits (for more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
     * >Amazon Kinesis Data Streams Limits</a> in the <i>Amazon Kinesis Data
     * Streams Developer Guide</i>). Your application should have one thread per
     * shard, each reading continuously from its stream. To read from a stream
     * continually, call <a>GetRecords</a> in a loop. Use
     * <a>GetShardIterator</a> to get the shard iterator to specify in the first
     * <a>GetRecords</a> call. <a>GetRecords</a> returns a new shard iterator in
     * <code>NextShardIterator</code>. Specify the shard iterator returned in
     * <code>NextShardIterator</code> in subsequent calls to <a>GetRecords</a>.
     * If the shard has been closed, the shard iterator can't return more data
     * and <a>GetRecords</a> returns <code>null</code> in
     * <code>NextShardIterator</code>. You can terminate the loop when the shard
     * is closed, or when the shard iterator reaches the record with the
     * sequence number or other attribute that marks it as the last record to
     * process.
     * </p>
     * <p>
     * Each data record can be up to 1 MB in size, and each shard can read up to
     * 2 MB per second. You can ensure that your calls don't exceed the maximum
     * supported size or throughput by using the <code>Limit</code> parameter to
     * specify the maximum number of records that <a>GetRecords</a> can return.
     * Consider your average record size when determining this limit.
     * </p>
     * <p>
     * The size of the data returned by <a>GetRecords</a> varies depending on
     * the utilization of the shard. The maximum size of data that
     * <a>GetRecords</a> can return is 10 MB. If a call returns this amount of
     * data, subsequent calls made within the next five seconds throw
     * <code>ProvisionedThroughputExceededException</code>. If there is
     * insufficient provisioned throughput on the stream, subsequent calls made
     * within the next one second throw
     * <code>ProvisionedThroughputExceededException</code>. <a>GetRecords</a>
     * won't return any data when it throws an exception. For this reason, we
     * recommend that you wait one second between calls to <a>GetRecords</a>;
     * however, it's possible that the application will get exceptions for
     * longer than 1 second.
     * </p>
     * <p>
     * To detect whether the application is falling behind in processing, you
     * can use the <code>MillisBehindLatest</code> response attribute. You can
     * also monitor the stream using CloudWatch metrics and other mechanisms
     * (see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring.html"
     * >Monitoring</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>).
     * </p>
     * <p>
     * Each Amazon Kinesis record includes a value,
     * <code>ApproximateArrivalTimestamp</code>, that is set when a stream
     * successfully receives and stores a record. This is commonly referred to
     * as a server-side time stamp, whereas a client-side time stamp is set when
     * a data producer creates or sends the record to a stream (a data producer
     * is any data source putting data records into a stream, for example with
     * <a>PutRecords</a>). The time stamp has millisecond precision. There are
     * no guarantees about the time stamp accuracy, or that the time stamp is
     * always increasing. For example, records in a shard or across a stream
     * might have time stamps that are out of order.
     * </p>
     * 
     * @param getRecordsRequest <p>
     *            Represents the input for <a>GetRecords</a>.
     *            </p>
     * @return getRecordsResult The response from the GetRecords service method,
     *         as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ProvisionedThroughputExceededException
     * @throws ExpiredIteratorException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSAccessDeniedException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetRecordsResult getRecords(GetRecordsRequest getRecordsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecordsRequest> request = null;
        Response<GetRecordsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecordsRequestMarshaller().marshall(getRecordsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRecordsResult, JsonUnmarshallerContext> unmarshaller = new GetRecordsResultJsonUnmarshaller();
            JsonResponseHandler<GetRecordsResult> responseHandler = new JsonResponseHandler<GetRecordsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an Amazon Kinesis shard iterator. A shard iterator expires five
     * minutes after it is returned to the requester.
     * </p>
     * <p>
     * A shard iterator specifies the shard position from which to start reading
     * data records sequentially. The position is specified using the sequence
     * number of a data record in a shard. A sequence number is the identifier
     * associated with every record ingested in the stream, and is assigned when
     * a record is put into the stream. Each stream has one or more shards.
     * </p>
     * <p>
     * You must specify the shard iterator type. For example, you can set the
     * <code>ShardIteratorType</code> parameter to read exactly from the
     * position denoted by a specific sequence number by using the
     * <code>AT_SEQUENCE_NUMBER</code> shard iterator type. Alternatively, the
     * parameter can read right after the sequence number by using the
     * <code>AFTER_SEQUENCE_NUMBER</code> shard iterator type, using sequence
     * numbers returned by earlier calls to <a>PutRecord</a>, <a>PutRecords</a>,
     * <a>GetRecords</a>, or <a>DescribeStream</a>. In the request, you can
     * specify the shard iterator type <code>AT_TIMESTAMP</code> to read records
     * from an arbitrary point in time, <code>TRIM_HORIZON</code> to cause
     * <code>ShardIterator</code> to point to the last untrimmed record in the
     * shard in the system (the oldest data record in the shard), or
     * <code>LATEST</code> so that you always read the most recent data in the
     * shard.
     * </p>
     * <p>
     * When you read repeatedly from a stream, use a <a>GetShardIterator</a>
     * request to get the first shard iterator for use in your first
     * <a>GetRecords</a> request and for subsequent reads use the shard iterator
     * returned by the <a>GetRecords</a> request in
     * <code>NextShardIterator</code>. A new shard iterator is returned by every
     * <a>GetRecords</a> request in <code>NextShardIterator</code>, which you
     * use in the <code>ShardIterator</code> parameter of the next
     * <a>GetRecords</a> request.
     * </p>
     * <p>
     * If a <a>GetShardIterator</a> request is made too often, you receive a
     * <code>ProvisionedThroughputExceededException</code>. For more information
     * about throughput limits, see <a>GetRecords</a>, and <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
     * >Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * <p>
     * If the shard is closed, <a>GetShardIterator</a> returns a valid iterator
     * for the last sequence number of the shard. A shard can be closed as a
     * result of using <a>SplitShard</a> or <a>MergeShards</a>.
     * </p>
     * <p>
     * <a>GetShardIterator</a> has a limit of five transactions per second per
     * account per open shard.
     * </p>
     * 
     * @param getShardIteratorRequest <p>
     *            Represents the input for <code>GetShardIterator</code>.
     *            </p>
     * @return getShardIteratorResult The response from the GetShardIterator
     *         service method, as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetShardIteratorResult getShardIterator(GetShardIteratorRequest getShardIteratorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getShardIteratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetShardIteratorRequest> request = null;
        Response<GetShardIteratorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetShardIteratorRequestMarshaller().marshall(getShardIteratorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetShardIteratorResult, JsonUnmarshallerContext> unmarshaller = new GetShardIteratorResultJsonUnmarshaller();
            JsonResponseHandler<GetShardIteratorResult> responseHandler = new JsonResponseHandler<GetShardIteratorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Increases the Kinesis data stream's retention period, which is the length
     * of time data records are accessible after they are added to the stream.
     * The maximum value of a stream's retention period is 168 hours (7 days).
     * </p>
     * <p>
     * If you choose a longer stream retention period, this operation increases
     * the time period during which records that have not yet expired are
     * accessible. However, it does not make previous, expired data (older than
     * the stream's previous retention period) accessible after the operation
     * has been called. For example, if a stream's retention period is set to 24
     * hours and is increased to 168 hours, any data that is older than 24 hours
     * remains inaccessible to consumer applications.
     * </p>
     * 
     * @param increaseStreamRetentionPeriodRequest <p>
     *            Represents the input for <a>IncreaseStreamRetentionPeriod</a>.
     *            </p>
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void increaseStreamRetentionPeriod(
            IncreaseStreamRetentionPeriodRequest increaseStreamRetentionPeriodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(increaseStreamRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IncreaseStreamRetentionPeriodRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IncreaseStreamRetentionPeriodRequestMarshaller()
                        .marshall(increaseStreamRetentionPeriodRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the shards in a stream and provides information about each shard.
     * </p>
     * <important>
     * <p>
     * This API is a new operation that is used by the Amazon Kinesis Client
     * Library (KCL). If you have a fine-grained IAM policy that only allows
     * specific operations, you must update your policy to allow calls to this
     * API. For more information, see <a href=
     * "https://docs.aws.amazon.com/streams/latest/dev/controlling-access.html"
     * >Controlling Access to Amazon Kinesis Data Streams Resources Using
     * IAM</a>.
     * </p>
     * </important>
     * 
     * @param listShardsRequest
     * @return listShardsResult The response from the ListShards service method,
     *         as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws ExpiredNextTokenException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListShardsResult listShards(ListShardsRequest listShardsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listShardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListShardsRequest> request = null;
        Response<ListShardsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListShardsRequestMarshaller().marshall(listShardsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListShardsResult, JsonUnmarshallerContext> unmarshaller = new ListShardsResultJsonUnmarshaller();
            JsonResponseHandler<ListShardsResult> responseHandler = new JsonResponseHandler<ListShardsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists your Kinesis data streams.
     * </p>
     * <p>
     * The number of streams may be too large to return from a single call to
     * <code>ListStreams</code>. You can limit the number of returned streams
     * using the <code>Limit</code> parameter. If you do not specify a value for
     * the <code>Limit</code> parameter, Kinesis Data Streams uses the default
     * limit, which is currently 10.
     * </p>
     * <p>
     * You can detect if there are more streams available to list by using the
     * <code>HasMoreStreams</code> flag from the returned output. If there are
     * more streams available, you can request more streams by using the name of
     * the last stream returned by the <code>ListStreams</code> request in the
     * <code>ExclusiveStartStreamName</code> parameter in a subsequent request
     * to <code>ListStreams</code>. The group of stream names returned by the
     * subsequent request is then added to the list. You can continue this
     * process until all the stream names have been collected in the list.
     * </p>
     * <p>
     * <a>ListStreams</a> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param listStreamsRequest <p>
     *            Represents the input for <code>ListStreams</code>.
     *            </p>
     * @return listStreamsResult The response from the ListStreams service
     *         method, as returned by Amazon Kinesis Streams.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamsRequest> request = null;
        Response<ListStreamsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamsRequestMarshaller().marshall(listStreamsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListStreamsResult, JsonUnmarshallerContext> unmarshaller = new ListStreamsResultJsonUnmarshaller();
            JsonResponseHandler<ListStreamsResult> responseHandler = new JsonResponseHandler<ListStreamsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the tags for the specified Kinesis data stream. This operation has
     * a limit of five transactions per second per account.
     * </p>
     * 
     * @param listTagsForStreamRequest <p>
     *            Represents the input for <code>ListTagsForStream</code>.
     *            </p>
     * @return listTagsForStreamResult The response from the ListTagsForStream
     *         service method, as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTagsForStreamResult listTagsForStream(
            ListTagsForStreamRequest listTagsForStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForStreamRequest> request = null;
        Response<ListTagsForStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForStreamRequestMarshaller()
                        .marshall(listTagsForStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForStreamResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForStreamResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForStreamResult> responseHandler = new JsonResponseHandler<ListTagsForStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Merges two adjacent shards in a Kinesis data stream and combines them
     * into a single shard to reduce the stream's capacity to ingest and
     * transport data. Two shards are considered adjacent if the union of the
     * hash key ranges for the two shards form a contiguous set with no gaps.
     * For example, if you have two shards, one with a hash key range of
     * 276...381 and the other with a hash key range of 382...454, then you
     * could merge these two shards into a single shard that would have a hash
     * key range of 276...454. After the merge, the single child shard receives
     * data for all hash key values covered by the two parent shards.
     * </p>
     * <p>
     * <code>MergeShards</code> is called when there is a need to reduce the
     * overall capacity of a stream because of excess capacity that is not being
     * used. You must specify the shard to be merged and the adjacent shard for
     * a stream. For more information about merging shards, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-merge.html"
     * >Merge Two Shards</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * <p>
     * If the stream is in the <code>ACTIVE</code> state, you can call
     * <code>MergeShards</code>. If a stream is in the <code>CREATING</code>,
     * <code>UPDATING</code>, or <code>DELETING</code> state,
     * <code>MergeShards</code> returns a <code>ResourceInUseException</code>.
     * If the specified stream does not exist, <code>MergeShards</code> returns
     * a <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * You can use <a>DescribeStream</a> to check the state of the stream, which
     * is returned in <code>StreamStatus</code>.
     * </p>
     * <p>
     * <code>MergeShards</code> is an asynchronous operation. Upon receiving a
     * <code>MergeShards</code> request, Amazon Kinesis Data Streams immediately
     * returns a response and sets the <code>StreamStatus</code> to
     * <code>UPDATING</code>. After the operation is completed, Kinesis Data
     * Streams sets the <code>StreamStatus</code> to <code>ACTIVE</code>. Read
     * and write operations continue to work while the stream is in the
     * <code>UPDATING</code> state.
     * </p>
     * <p>
     * You use <a>DescribeStream</a> to determine the shard IDs that are
     * specified in the <code>MergeShards</code> request.
     * </p>
     * <p>
     * If you try to operate on too many streams in parallel using
     * <a>CreateStream</a>, <a>DeleteStream</a>, <code>MergeShards</code>, or
     * <a>SplitShard</a>, you receive a <code>LimitExceededException</code>.
     * </p>
     * <p>
     * <code>MergeShards</code> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param mergeShardsRequest <p>
     *            Represents the input for <code>MergeShards</code>.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void mergeShards(MergeShardsRequest mergeShardsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(mergeShardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeShardsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeShardsRequestMarshaller().marshall(mergeShardsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Writes a single data record into an Amazon Kinesis data stream. Call
     * <code>PutRecord</code> to send data into the stream for real-time
     * ingestion and subsequent processing, one record at a time. Each shard can
     * support writes up to 1,000 records per second, up to a maximum data write
     * total of 1 MB per second.
     * </p>
     * <p>
     * You must specify the name of the stream that captures, stores, and
     * transports the data; a partition key; and the data blob itself.
     * </p>
     * <p>
     * The data blob can be any type of data; for example, a segment from a log
     * file, geographic/location data, website clickstream data, and so on.
     * </p>
     * <p>
     * The partition key is used by Kinesis Data Streams to distribute data
     * across shards. Kinesis Data Streams segregates the data records that
     * belong to a stream into multiple shards, using the partition key
     * associated with each data record to determine the shard to which a given
     * data record belongs.
     * </p>
     * <p>
     * Partition keys are Unicode strings, with a maximum length limit of 256
     * characters for each key. An MD5 hash function is used to map partition
     * keys to 128-bit integer values and to map associated data records to
     * shards using the hash key ranges of the shards. You can override hashing
     * the partition key to determine the shard by explicitly specifying a hash
     * value using the <code>ExplicitHashKey</code> parameter. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams
     * Developer Guide</i>.
     * </p>
     * <p>
     * <code>PutRecord</code> returns the shard ID of where the data record was
     * placed and the sequence number that was assigned to the data record.
     * </p>
     * <p>
     * Sequence numbers increase over time and are specific to a shard within a
     * stream, not across all shards within a stream. To guarantee strictly
     * increasing ordering, write serially to a shard and use the
     * <code>SequenceNumberForOrdering</code> parameter. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>PutRecord</code> request cannot be processed because of
     * insufficient provisioned throughput on the shard involved in the request,
     * <code>PutRecord</code> throws
     * <code>ProvisionedThroughputExceededException</code>.
     * </p>
     * <p>
     * By default, data records are accessible for 24 hours from the time that
     * they are added to a stream. You can use
     * <a>IncreaseStreamRetentionPeriod</a> or
     * <a>DecreaseStreamRetentionPeriod</a> to modify this retention period.
     * </p>
     * 
     * @param putRecordRequest <p>
     *            Represents the input for <code>PutRecord</code>.
     *            </p>
     * @return putRecordResult The response from the PutRecord service method,
     *         as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ProvisionedThroughputExceededException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSAccessDeniedException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutRecordResult putRecord(PutRecordRequest putRecordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordRequest> request = null;
        Response<PutRecordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordRequestMarshaller().marshall(putRecordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutRecordResult, JsonUnmarshallerContext> unmarshaller = new PutRecordResultJsonUnmarshaller();
            JsonResponseHandler<PutRecordResult> responseHandler = new JsonResponseHandler<PutRecordResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Writes multiple data records into a Kinesis data stream in a single call
     * (also referred to as a <code>PutRecords</code> request). Use this
     * operation to send data into the stream for data ingestion and processing.
     * </p>
     * <p>
     * Each <code>PutRecords</code> request can support up to 500 records. Each
     * record in the request can be as large as 1 MB, up to a limit of 5 MB for
     * the entire request, including partition keys. Each shard can support
     * writes up to 1,000 records per second, up to a maximum data write total
     * of 1 MB per second.
     * </p>
     * <p>
     * You must specify the name of the stream that captures, stores, and
     * transports the data; and an array of request <code>Records</code>, with
     * each record in the array requiring a partition key and data blob. The
     * record size limit applies to the total size of the partition key and data
     * blob.
     * </p>
     * <p>
     * The data blob can be any type of data; for example, a segment from a log
     * file, geographic/location data, website clickstream data, and so on.
     * </p>
     * <p>
     * The partition key is used by Kinesis Data Streams as input to a hash
     * function that maps the partition key and associated data to a specific
     * shard. An MD5 hash function is used to map partition keys to 128-bit
     * integer values and to map associated data records to shards. As a result
     * of this hashing mechanism, all data records with the same partition key
     * map to the same shard within the stream. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams
     * Developer Guide</i>.
     * </p>
     * <p>
     * Each record in the <code>Records</code> array may include an optional
     * parameter, <code>ExplicitHashKey</code>, which overrides the partition
     * key to shard mapping. This parameter allows a data producer to determine
     * explicitly the shard where the record is stored. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-putrecords"
     * >Adding Multiple Records with PutRecords</a> in the <i>Amazon Kinesis
     * Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * The <code>PutRecords</code> response includes an array of response
     * <code>Records</code>. Each record in the response array directly
     * correlates with a record in the request array using natural ordering,
     * from the top to the bottom of the request and response. The response
     * <code>Records</code> array always includes the same number of records as
     * the request array.
     * </p>
     * <p>
     * The response <code>Records</code> array includes both successfully and
     * unsuccessfully processed records. Kinesis Data Streams attempts to
     * process all records in each <code>PutRecords</code> request. A single
     * record failure does not stop the processing of subsequent records.
     * </p>
     * <p>
     * A successfully processed record includes <code>ShardId</code> and
     * <code>SequenceNumber</code> values. The <code>ShardId</code> parameter
     * identifies the shard in the stream where the record is stored. The
     * <code>SequenceNumber</code> parameter is an identifier assigned to the
     * put record, unique to all records in the stream.
     * </p>
     * <p>
     * An unsuccessfully processed record includes <code>ErrorCode</code> and
     * <code>ErrorMessage</code> values. <code>ErrorCode</code> reflects the
     * type of error and can be one of the following values:
     * <code>ProvisionedThroughputExceededException</code> or
     * <code>InternalFailure</code>. <code>ErrorMessage</code> provides more
     * detailed information about the
     * <code>ProvisionedThroughputExceededException</code> exception including
     * the account ID, stream name, and shard ID of the record that was
     * throttled. For more information about partially successful responses, see
     * <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-add-data-to-stream.html#kinesis-using-sdk-java-putrecords"
     * >Adding Multiple Records with PutRecords</a> in the <i>Amazon Kinesis
     * Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * By default, data records are accessible for 24 hours from the time that
     * they are added to a stream. You can use
     * <a>IncreaseStreamRetentionPeriod</a> or
     * <a>DecreaseStreamRetentionPeriod</a> to modify this retention period.
     * </p>
     * 
     * @param putRecordsRequest <p>
     *            A <code>PutRecords</code> request.
     *            </p>
     * @return putRecordsResult The response from the PutRecords service method,
     *         as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ProvisionedThroughputExceededException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSAccessDeniedException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutRecordsResult putRecords(PutRecordsRequest putRecordsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordsRequest> request = null;
        Response<PutRecordsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordsRequestMarshaller().marshall(putRecordsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutRecordsResult, JsonUnmarshallerContext> unmarshaller = new PutRecordsResultJsonUnmarshaller();
            JsonResponseHandler<PutRecordsResult> responseHandler = new JsonResponseHandler<PutRecordsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes tags from the specified Kinesis data stream. Removed tags are
     * deleted and cannot be recovered after this operation successfully
     * completes.
     * </p>
     * <p>
     * If you specify a tag that does not exist, it is ignored.
     * </p>
     * <p>
     * <a>RemoveTagsFromStream</a> has a limit of five transactions per second
     * per account.
     * </p>
     * 
     * @param removeTagsFromStreamRequest <p>
     *            Represents the input for <code>RemoveTagsFromStream</code>.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void removeTagsFromStream(RemoveTagsFromStreamRequest removeTagsFromStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromStreamRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromStreamRequestMarshaller()
                        .marshall(removeTagsFromStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Splits a shard into two new shards in the Kinesis data stream, to
     * increase the stream's capacity to ingest and transport data.
     * <code>SplitShard</code> is called when there is a need to increase the
     * overall capacity of a stream because of an expected increase in the
     * volume of data records being ingested.
     * </p>
     * <p>
     * You can also use <code>SplitShard</code> when a shard appears to be
     * approaching its maximum utilization; for example, the producers sending
     * data into the specific shard are suddenly sending more than previously
     * anticipated. You can also call <code>SplitShard</code> to increase stream
     * capacity, so that more Kinesis Data Streams applications can
     * simultaneously read data from the stream for real-time processing.
     * </p>
     * <p>
     * You must specify the shard to be split and the new hash key, which is the
     * position in the shard where the shard gets split in two. In many cases,
     * the new hash key might be the average of the beginning and ending hash
     * key, but it can be any hash key value in the range being mapped into the
     * shard. For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-split.html"
     * >Split a Shard</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can use <a>DescribeStream</a> to determine the shard ID and hash key
     * values for the <code>ShardToSplit</code> and
     * <code>NewStartingHashKey</code> parameters that are specified in the
     * <code>SplitShard</code> request.
     * </p>
     * <p>
     * <code>SplitShard</code> is an asynchronous operation. Upon receiving a
     * <code>SplitShard</code> request, Kinesis Data Streams immediately returns
     * a response and sets the stream status to <code>UPDATING</code>. After the
     * operation is completed, Kinesis Data Streams sets the stream status to
     * <code>ACTIVE</code>. Read and write operations continue to work while the
     * stream is in the <code>UPDATING</code> state.
     * </p>
     * <p>
     * You can use <code>DescribeStream</code> to check the status of the
     * stream, which is returned in <code>StreamStatus</code>. If the stream is
     * in the <code>ACTIVE</code> state, you can call <code>SplitShard</code>.
     * If a stream is in <code>CREATING</code> or <code>UPDATING</code> or
     * <code>DELETING</code> states, <code>DescribeStream</code> returns a
     * <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * If the specified stream does not exist, <code>DescribeStream</code>
     * returns a <code>ResourceNotFoundException</code>. If you try to create
     * more shards than are authorized for your account, you receive a
     * <code>LimitExceededException</code>.
     * </p>
     * <p>
     * For the default shard limit for an AWS account, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
     * >Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>. To increase this limit, <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >contact AWS Support</a>.
     * </p>
     * <p>
     * If you try to operate on too many streams simultaneously using
     * <a>CreateStream</a>, <a>DeleteStream</a>, <a>MergeShards</a>, and/or
     * <a>SplitShard</a>, you receive a <code>LimitExceededException</code>.
     * </p>
     * <p>
     * <code>SplitShard</code> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param splitShardRequest <p>
     *            Represents the input for <code>SplitShard</code>.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void splitShard(SplitShardRequest splitShardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(splitShardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SplitShardRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SplitShardRequestMarshaller().marshall(splitShardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables or updates server-side encryption using an AWS KMS key for a
     * specified stream.
     * </p>
     * <p>
     * Starting encryption is an asynchronous operation. Upon receiving the
     * request, Kinesis Data Streams returns immediately and sets the status of
     * the stream to <code>UPDATING</code>. After the update is complete,
     * Kinesis Data Streams sets the status of the stream back to
     * <code>ACTIVE</code>. Updating or applying encryption normally takes a few
     * seconds to complete, but it can take minutes. You can continue to read
     * and write data to your stream while its status is <code>UPDATING</code>.
     * Once the status of the stream is <code>ACTIVE</code>, encryption begins
     * for records written to the stream.
     * </p>
     * <p>
     * API Limits: You can successfully apply a new AWS KMS key for server-side
     * encryption 25 times in a rolling 24-hour period.
     * </p>
     * <p>
     * Note: It can take up to five seconds after the stream is in an
     * <code>ACTIVE</code> status before all records written to the stream are
     * encrypted. After you enable encryption, you can verify that encryption is
     * applied by inspecting the API response from <code>PutRecord</code> or
     * <code>PutRecords</code>.
     * </p>
     * 
     * @param startStreamEncryptionRequest
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSAccessDeniedException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void startStreamEncryption(StartStreamEncryptionRequest startStreamEncryptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startStreamEncryptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStreamEncryptionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStreamEncryptionRequestMarshaller()
                        .marshall(startStreamEncryptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables server-side encryption for a specified stream.
     * </p>
     * <p>
     * Stopping encryption is an asynchronous operation. Upon receiving the
     * request, Kinesis Data Streams returns immediately and sets the status of
     * the stream to <code>UPDATING</code>. After the update is complete,
     * Kinesis Data Streams sets the status of the stream back to
     * <code>ACTIVE</code>. Stopping encryption normally takes a few seconds to
     * complete, but it can take minutes. You can continue to read and write
     * data to your stream while its status is <code>UPDATING</code>. Once the
     * status of the stream is <code>ACTIVE</code>, records written to the
     * stream are no longer encrypted by Kinesis Data Streams.
     * </p>
     * <p>
     * API Limits: You can successfully disable server-side encryption 25 times
     * in a rolling 24-hour period.
     * </p>
     * <p>
     * Note: It can take up to five seconds after the stream is in an
     * <code>ACTIVE</code> status before all records written to the stream are
     * no longer subject to encryption. After you disabled encryption, you can
     * verify that encryption is not applied by inspecting the API response from
     * <code>PutRecord</code> or <code>PutRecords</code>.
     * </p>
     * 
     * @param stopStreamEncryptionRequest
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void stopStreamEncryption(StopStreamEncryptionRequest stopStreamEncryptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopStreamEncryptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStreamEncryptionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStreamEncryptionRequestMarshaller()
                        .marshall(stopStreamEncryptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the shard count of the specified stream to the specified number
     * of shards.
     * </p>
     * <p>
     * Updating the shard count is an asynchronous operation. Upon receiving the
     * request, Kinesis Data Streams returns immediately and sets the status of
     * the stream to <code>UPDATING</code>. After the update is complete,
     * Kinesis Data Streams sets the status of the stream back to
     * <code>ACTIVE</code>. Depending on the size of the stream, the scaling
     * action could take a few minutes to complete. You can continue to read and
     * write data to your stream while its status is <code>UPDATING</code>.
     * </p>
     * <p>
     * To update the shard count, Kinesis Data Streams performs splits or merges
     * on individual shards. This can cause short-lived shards to be created, in
     * addition to the final shards. We recommend that you double or halve the
     * shard count, as this results in the fewest number of splits or merges.
     * </p>
     * <p>
     * This operation has the following limits. You cannot do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Scale more than twice per rolling 24-hour period per stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale up to more than double your current shard count for a stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale down below half your current shard count for a stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale up to more than 500 shards in a stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale a stream with more than 500 shards down unless the result is less
     * than 500 shards
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale up to more than the shard limit for your account
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the default limits for an AWS account, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
     * >Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>. To request an increase in the call rate limit, the shard limit
     * for this API, or your overall shard limit, use the <a href=
     * "https://console.aws.amazon.com/support/v1#/case/create?issueType=service-limit-increase&amp;limitType=service-code-kinesis"
     * >limits form</a>.
     * </p>
     * 
     * @param updateShardCountRequest
     * @return updateShardCountResult The response from the UpdateShardCount
     *         service method, as returned by Amazon Kinesis Streams.
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateShardCountResult updateShardCount(UpdateShardCountRequest updateShardCountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateShardCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateShardCountRequest> request = null;
        Response<UpdateShardCountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateShardCountRequestMarshaller().marshall(updateShardCountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateShardCountResult, JsonUnmarshallerContext> unmarshaller = new UpdateShardCountResultJsonUnmarshaller();
            JsonResponseHandler<UpdateShardCountResult> responseHandler = new JsonResponseHandler<UpdateShardCountResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Kinesis data stream. A stream captures and transports data
     * records that are continuously emitted from different data sources or
     * <i>producers</i>. Scale-out within a stream is explicitly supported by
     * means of shards, which are uniquely identified groups of data records in
     * a stream.
     * </p>
     * <p>
     * You specify and control the number of shards that a stream is composed
     * of. Each shard can support reads up to five transactions per second, up
     * to a maximum data read total of 2 MB per second. Each shard can support
     * writes up to 1,000 records per second, up to a maximum data write total
     * of 1 MB per second. If the amount of data input increases or decreases,
     * you can add or remove shards.
     * </p>
     * <p>
     * The stream name identifies the stream. The name is scoped to the AWS
     * account used by the application. It is also scoped by AWS Region. That
     * is, two streams in two different accounts can have the same name, and two
     * streams in the same account, but in two different Regions, can have the
     * same name.
     * </p>
     * <p>
     * <code>CreateStream</code> is an asynchronous operation. Upon receiving a
     * <code>CreateStream</code> request, Kinesis Data Streams immediately
     * returns and sets the stream status to <code>CREATING</code>. After the
     * stream is created, Kinesis Data Streams sets the stream status to
     * <code>ACTIVE</code>. You should perform read and write operations only on
     * an <code>ACTIVE</code> stream.
     * </p>
     * <p>
     * You receive a <code>LimitExceededException</code> when making a
     * <code>CreateStream</code> request when you try to do one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Have more than five streams in the <code>CREATING</code> state at any
     * point in time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create more shards than are authorized for your account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the default shard limit for an AWS account, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
     * >Amazon Kinesis Data Streams Limits</a> in the <i>Amazon Kinesis Data
     * Streams Developer Guide</i>. To increase this limit, <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >contact AWS Support</a>.
     * </p>
     * <p>
     * You can use <code>DescribeStream</code> to check the stream status, which
     * is returned in <code>StreamStatus</code>.
     * </p>
     * <p>
     * <a>CreateStream</a> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param streamName <p>
     *            A name to identify the stream. The stream name is scoped to
     *            the AWS account used by the application that creates the
     *            stream. It is also scoped by AWS Region. That is, two streams
     *            in two different AWS accounts can have the same name. Two
     *            streams in the same AWS account but in two different Regions
     *            can also have the same name.
     *            </p>
     * @param shardCount <p>
     *            The number of shards that the stream will use. The throughput
     *            of the stream is a function of the number of shards; more
     *            shards are required for greater provisioned throughput.
     *            </p>
     *            <p>
     *            DefaultShardLimit;
     *            </p>
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void createStream(String streamName, Integer shardCount)
            throws AmazonServiceException, AmazonClientException {
        CreateStreamRequest createStreamRequest = new CreateStreamRequest();
        createStreamRequest.setStreamName(streamName);
        createStreamRequest.setShardCount(shardCount);
        createStream(createStreamRequest);
    }

    /**
     * <p>
     * Deletes a Kinesis data stream and all its shards and data. You must shut
     * down any applications that are operating on the stream before you delete
     * the stream. If an application attempts to operate on a deleted stream, it
     * receives the exception <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the stream is in the <code>ACTIVE</code> state, you can delete it.
     * After a <code>DeleteStream</code> request, the specified stream is in the
     * <code>DELETING</code> state until Kinesis Data Streams completes the
     * deletion.
     * </p>
     * <p>
     * <b>Note:</b> Kinesis Data Streams might continue to accept data read and
     * write operations, such as <a>PutRecord</a>, <a>PutRecords</a>, and
     * <a>GetRecords</a>, on a stream in the <code>DELETING</code> state until
     * the stream deletion is complete.
     * </p>
     * <p>
     * When you delete a stream, any shards in that stream are also deleted, and
     * any tags are dissociated from the stream.
     * </p>
     * <p>
     * You can use the <a>DescribeStream</a> operation to check the state of the
     * stream, which is returned in <code>StreamStatus</code>.
     * </p>
     * <p>
     * <a>DeleteStream</a> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the stream to delete.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deleteStream(String streamName)
            throws AmazonServiceException, AmazonClientException {
        DeleteStreamRequest deleteStreamRequest = new DeleteStreamRequest();
        deleteStreamRequest.setStreamName(streamName);
        deleteStream(deleteStreamRequest);
    }

    /**
     * <p>
     * Describes the specified Kinesis data stream.
     * </p>
     * <p>
     * The information returned includes the stream name, Amazon Resource Name
     * (ARN), creation time, enhanced metric configuration, and shard map. The
     * shard map is an array of shard objects. For each shard object, there is
     * the hash key and sequence number ranges that the shard spans, and the IDs
     * of any earlier shards that played in a role in creating the shard. Every
     * record ingested in the stream is identified by a sequence number, which
     * is assigned when the record is put into the stream.
     * </p>
     * <p>
     * You can limit the number of shards returned by each call. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-retrieve-shards.html"
     * >Retrieving Shards from a Stream</a> in the <i>Amazon Kinesis Data
     * Streams Developer Guide</i>.
     * </p>
     * <p>
     * There are no guarantees about the chronological order shards returned. To
     * process shards in chronological order, use the ID of the parent shard to
     * track the lineage to the oldest shard.
     * </p>
     * <p>
     * This operation has a limit of 10 transactions per second per account.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the stream to describe.
     *            </p>
     * @return describeStreamResult The response from the DescribeStream service
     *         method, as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStreamResult describeStream(String streamName)
            throws AmazonServiceException, AmazonClientException {
        DescribeStreamRequest describeStreamRequest = new DescribeStreamRequest();
        describeStreamRequest.setStreamName(streamName);
        return describeStream(describeStreamRequest);
    }

    /**
     * <p>
     * Describes the specified Kinesis data stream.
     * </p>
     * <p>
     * The information returned includes the stream name, Amazon Resource Name
     * (ARN), creation time, enhanced metric configuration, and shard map. The
     * shard map is an array of shard objects. For each shard object, there is
     * the hash key and sequence number ranges that the shard spans, and the IDs
     * of any earlier shards that played in a role in creating the shard. Every
     * record ingested in the stream is identified by a sequence number, which
     * is assigned when the record is put into the stream.
     * </p>
     * <p>
     * You can limit the number of shards returned by each call. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-retrieve-shards.html"
     * >Retrieving Shards from a Stream</a> in the <i>Amazon Kinesis Data
     * Streams Developer Guide</i>.
     * </p>
     * <p>
     * There are no guarantees about the chronological order shards returned. To
     * process shards in chronological order, use the ID of the parent shard to
     * track the lineage to the oldest shard.
     * </p>
     * <p>
     * This operation has a limit of 10 transactions per second per account.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the stream to describe.
     *            </p>
     * @param exclusiveStartShardId <p>
     *            The shard ID of the shard to start with.
     *            </p>
     * @return describeStreamResult The response from the DescribeStream service
     *         method, as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStreamResult describeStream(String streamName, String exclusiveStartShardId)
            throws AmazonServiceException, AmazonClientException {
        DescribeStreamRequest describeStreamRequest = new DescribeStreamRequest();
        describeStreamRequest.setStreamName(streamName);
        describeStreamRequest.setExclusiveStartShardId(exclusiveStartShardId);
        return describeStream(describeStreamRequest);
    }

    /**
     * <p>
     * Describes the specified Kinesis data stream.
     * </p>
     * <p>
     * The information returned includes the stream name, Amazon Resource Name
     * (ARN), creation time, enhanced metric configuration, and shard map. The
     * shard map is an array of shard objects. For each shard object, there is
     * the hash key and sequence number ranges that the shard spans, and the IDs
     * of any earlier shards that played in a role in creating the shard. Every
     * record ingested in the stream is identified by a sequence number, which
     * is assigned when the record is put into the stream.
     * </p>
     * <p>
     * You can limit the number of shards returned by each call. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-retrieve-shards.html"
     * >Retrieving Shards from a Stream</a> in the <i>Amazon Kinesis Data
     * Streams Developer Guide</i>.
     * </p>
     * <p>
     * There are no guarantees about the chronological order shards returned. To
     * process shards in chronological order, use the ID of the parent shard to
     * track the lineage to the oldest shard.
     * </p>
     * <p>
     * This operation has a limit of 10 transactions per second per account.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the stream to describe.
     *            </p>
     * @param limit <p>
     *            The maximum number of shards to return in a single call. The
     *            default value is 100. If you specify a value greater than 100,
     *            at most 100 shards are returned.
     *            </p>
     * @param exclusiveStartShardId <p>
     *            The shard ID of the shard to start with.
     *            </p>
     * @return describeStreamResult The response from the DescribeStream service
     *         method, as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStreamResult describeStream(String streamName, Integer limit,
            String exclusiveStartShardId)
            throws AmazonServiceException, AmazonClientException {
        DescribeStreamRequest describeStreamRequest = new DescribeStreamRequest();
        describeStreamRequest.setStreamName(streamName);
        describeStreamRequest.setLimit(limit);
        describeStreamRequest.setExclusiveStartShardId(exclusiveStartShardId);
        return describeStream(describeStreamRequest);
    }

    /**
     * <p>
     * Lists your Kinesis data streams.
     * </p>
     * <p>
     * The number of streams may be too large to return from a single call to
     * <code>ListStreams</code>. You can limit the number of returned streams
     * using the <code>Limit</code> parameter. If you do not specify a value for
     * the <code>Limit</code> parameter, Kinesis Data Streams uses the default
     * limit, which is currently 10.
     * </p>
     * <p>
     * You can detect if there are more streams available to list by using the
     * <code>HasMoreStreams</code> flag from the returned output. If there are
     * more streams available, you can request more streams by using the name of
     * the last stream returned by the <code>ListStreams</code> request in the
     * <code>ExclusiveStartStreamName</code> parameter in a subsequent request
     * to <code>ListStreams</code>. The group of stream names returned by the
     * subsequent request is then added to the list. You can continue this
     * process until all the stream names have been collected in the list.
     * </p>
     * <p>
     * <a>ListStreams</a> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @return listStreamsResult The response from the ListStreams service
     *         method, as returned by Amazon Kinesis Streams.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStreamsResult listStreams()
            throws AmazonServiceException, AmazonClientException {
        ListStreamsRequest listStreamsRequest = new ListStreamsRequest();
        return listStreams(listStreamsRequest);
    }

    /**
     * <p>
     * Lists your Kinesis data streams.
     * </p>
     * <p>
     * The number of streams may be too large to return from a single call to
     * <code>ListStreams</code>. You can limit the number of returned streams
     * using the <code>Limit</code> parameter. If you do not specify a value for
     * the <code>Limit</code> parameter, Kinesis Data Streams uses the default
     * limit, which is currently 10.
     * </p>
     * <p>
     * You can detect if there are more streams available to list by using the
     * <code>HasMoreStreams</code> flag from the returned output. If there are
     * more streams available, you can request more streams by using the name of
     * the last stream returned by the <code>ListStreams</code> request in the
     * <code>ExclusiveStartStreamName</code> parameter in a subsequent request
     * to <code>ListStreams</code>. The group of stream names returned by the
     * subsequent request is then added to the list. You can continue this
     * process until all the stream names have been collected in the list.
     * </p>
     * <p>
     * <a>ListStreams</a> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param exclusiveStartStreamName <p>
     *            The name of the stream to start the list with.
     *            </p>
     * @return listStreamsResult The response from the ListStreams service
     *         method, as returned by Amazon Kinesis Streams.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStreamsResult listStreams(String exclusiveStartStreamName)
            throws AmazonServiceException, AmazonClientException {
        ListStreamsRequest listStreamsRequest = new ListStreamsRequest();
        listStreamsRequest.setExclusiveStartStreamName(exclusiveStartStreamName);
        return listStreams(listStreamsRequest);
    }

    /**
     * <p>
     * Lists your Kinesis data streams.
     * </p>
     * <p>
     * The number of streams may be too large to return from a single call to
     * <code>ListStreams</code>. You can limit the number of returned streams
     * using the <code>Limit</code> parameter. If you do not specify a value for
     * the <code>Limit</code> parameter, Kinesis Data Streams uses the default
     * limit, which is currently 10.
     * </p>
     * <p>
     * You can detect if there are more streams available to list by using the
     * <code>HasMoreStreams</code> flag from the returned output. If there are
     * more streams available, you can request more streams by using the name of
     * the last stream returned by the <code>ListStreams</code> request in the
     * <code>ExclusiveStartStreamName</code> parameter in a subsequent request
     * to <code>ListStreams</code>. The group of stream names returned by the
     * subsequent request is then added to the list. You can continue this
     * process until all the stream names have been collected in the list.
     * </p>
     * <p>
     * <a>ListStreams</a> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param limit <p>
     *            The maximum number of streams to list.
     *            </p>
     * @param exclusiveStartStreamName <p>
     *            The name of the stream to start the list with.
     *            </p>
     * @return listStreamsResult The response from the ListStreams service
     *         method, as returned by Amazon Kinesis Streams.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListStreamsResult listStreams(Integer limit, String exclusiveStartStreamName)
            throws AmazonServiceException, AmazonClientException {
        ListStreamsRequest listStreamsRequest = new ListStreamsRequest();
        listStreamsRequest.setLimit(limit);
        listStreamsRequest.setExclusiveStartStreamName(exclusiveStartStreamName);
        return listStreams(listStreamsRequest);
    }

    /**
     * <p>
     * Merges two adjacent shards in a Kinesis data stream and combines them
     * into a single shard to reduce the stream's capacity to ingest and
     * transport data. Two shards are considered adjacent if the union of the
     * hash key ranges for the two shards form a contiguous set with no gaps.
     * For example, if you have two shards, one with a hash key range of
     * 276...381 and the other with a hash key range of 382...454, then you
     * could merge these two shards into a single shard that would have a hash
     * key range of 276...454. After the merge, the single child shard receives
     * data for all hash key values covered by the two parent shards.
     * </p>
     * <p>
     * <code>MergeShards</code> is called when there is a need to reduce the
     * overall capacity of a stream because of excess capacity that is not being
     * used. You must specify the shard to be merged and the adjacent shard for
     * a stream. For more information about merging shards, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-merge.html"
     * >Merge Two Shards</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * <p>
     * If the stream is in the <code>ACTIVE</code> state, you can call
     * <code>MergeShards</code>. If a stream is in the <code>CREATING</code>,
     * <code>UPDATING</code>, or <code>DELETING</code> state,
     * <code>MergeShards</code> returns a <code>ResourceInUseException</code>.
     * If the specified stream does not exist, <code>MergeShards</code> returns
     * a <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * You can use <a>DescribeStream</a> to check the state of the stream, which
     * is returned in <code>StreamStatus</code>.
     * </p>
     * <p>
     * <code>MergeShards</code> is an asynchronous operation. Upon receiving a
     * <code>MergeShards</code> request, Amazon Kinesis Data Streams immediately
     * returns a response and sets the <code>StreamStatus</code> to
     * <code>UPDATING</code>. After the operation is completed, Kinesis Data
     * Streams sets the <code>StreamStatus</code> to <code>ACTIVE</code>. Read
     * and write operations continue to work while the stream is in the
     * <code>UPDATING</code> state.
     * </p>
     * <p>
     * You use <a>DescribeStream</a> to determine the shard IDs that are
     * specified in the <code>MergeShards</code> request.
     * </p>
     * <p>
     * If you try to operate on too many streams in parallel using
     * <a>CreateStream</a>, <a>DeleteStream</a>, <code>MergeShards</code>, or
     * <a>SplitShard</a>, you receive a <code>LimitExceededException</code>.
     * </p>
     * <p>
     * <code>MergeShards</code> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the stream for the merge.
     *            </p>
     * @param shardToMerge <p>
     *            The shard ID of the shard to combine with the adjacent shard
     *            for the merge.
     *            </p>
     * @param adjacentShardToMerge <p>
     *            The shard ID of the adjacent shard for the merge.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void mergeShards(String streamName, String shardToMerge, String adjacentShardToMerge)
            throws AmazonServiceException, AmazonClientException {
        MergeShardsRequest mergeShardsRequest = new MergeShardsRequest();
        mergeShardsRequest.setStreamName(streamName);
        mergeShardsRequest.setShardToMerge(shardToMerge);
        mergeShardsRequest.setAdjacentShardToMerge(adjacentShardToMerge);
        mergeShards(mergeShardsRequest);
    }

    /**
     * <p>
     * Splits a shard into two new shards in the Kinesis data stream, to
     * increase the stream's capacity to ingest and transport data.
     * <code>SplitShard</code> is called when there is a need to increase the
     * overall capacity of a stream because of an expected increase in the
     * volume of data records being ingested.
     * </p>
     * <p>
     * You can also use <code>SplitShard</code> when a shard appears to be
     * approaching its maximum utilization; for example, the producers sending
     * data into the specific shard are suddenly sending more than previously
     * anticipated. You can also call <code>SplitShard</code> to increase stream
     * capacity, so that more Kinesis Data Streams applications can
     * simultaneously read data from the stream for real-time processing.
     * </p>
     * <p>
     * You must specify the shard to be split and the new hash key, which is the
     * position in the shard where the shard gets split in two. In many cases,
     * the new hash key might be the average of the beginning and ending hash
     * key, but it can be any hash key value in the range being mapped into the
     * shard. For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-split.html"
     * >Split a Shard</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can use <a>DescribeStream</a> to determine the shard ID and hash key
     * values for the <code>ShardToSplit</code> and
     * <code>NewStartingHashKey</code> parameters that are specified in the
     * <code>SplitShard</code> request.
     * </p>
     * <p>
     * <code>SplitShard</code> is an asynchronous operation. Upon receiving a
     * <code>SplitShard</code> request, Kinesis Data Streams immediately returns
     * a response and sets the stream status to <code>UPDATING</code>. After the
     * operation is completed, Kinesis Data Streams sets the stream status to
     * <code>ACTIVE</code>. Read and write operations continue to work while the
     * stream is in the <code>UPDATING</code> state.
     * </p>
     * <p>
     * You can use <code>DescribeStream</code> to check the status of the
     * stream, which is returned in <code>StreamStatus</code>. If the stream is
     * in the <code>ACTIVE</code> state, you can call <code>SplitShard</code>.
     * If a stream is in <code>CREATING</code> or <code>UPDATING</code> or
     * <code>DELETING</code> states, <code>DescribeStream</code> returns a
     * <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * If the specified stream does not exist, <code>DescribeStream</code>
     * returns a <code>ResourceNotFoundException</code>. If you try to create
     * more shards than are authorized for your account, you receive a
     * <code>LimitExceededException</code>.
     * </p>
     * <p>
     * For the default shard limit for an AWS account, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
     * >Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>. To increase this limit, <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"
     * >contact AWS Support</a>.
     * </p>
     * <p>
     * If you try to operate on too many streams simultaneously using
     * <a>CreateStream</a>, <a>DeleteStream</a>, <a>MergeShards</a>, and/or
     * <a>SplitShard</a>, you receive a <code>LimitExceededException</code>.
     * </p>
     * <p>
     * <code>SplitShard</code> has a limit of five transactions per second per
     * account.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the stream for the shard split.
     *            </p>
     * @param shardToSplit <p>
     *            The shard ID of the shard to split.
     *            </p>
     * @param newStartingHashKey <p>
     *            A hash key value for the starting hash key of one of the child
     *            shards created by the split. The hash key range for a given
     *            shard constitutes a set of ordered contiguous positive
     *            integers. The value for <code>NewStartingHashKey</code> must
     *            be in the range of hash keys being mapped into the shard. The
     *            <code>NewStartingHashKey</code> hash key value and all higher
     *            hash key values in hash key range are distributed to one of
     *            the child shards. All the lower hash key values in the range
     *            are distributed to the other child shard.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidArgumentException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void splitShard(String streamName, String shardToSplit, String newStartingHashKey)
            throws AmazonServiceException, AmazonClientException {
        SplitShardRequest splitShardRequest = new SplitShardRequest();
        splitShardRequest.setStreamName(streamName);
        splitShardRequest.setShardToSplit(shardToSplit);
        splitShardRequest.setNewStartingHashKey(newStartingHashKey);
        splitShard(splitShardRequest);
    }

    /**
     * <p>
     * Writes a single data record into an Amazon Kinesis data stream. Call
     * <code>PutRecord</code> to send data into the stream for real-time
     * ingestion and subsequent processing, one record at a time. Each shard can
     * support writes up to 1,000 records per second, up to a maximum data write
     * total of 1 MB per second.
     * </p>
     * <p>
     * You must specify the name of the stream that captures, stores, and
     * transports the data; a partition key; and the data blob itself.
     * </p>
     * <p>
     * The data blob can be any type of data; for example, a segment from a log
     * file, geographic/location data, website clickstream data, and so on.
     * </p>
     * <p>
     * The partition key is used by Kinesis Data Streams to distribute data
     * across shards. Kinesis Data Streams segregates the data records that
     * belong to a stream into multiple shards, using the partition key
     * associated with each data record to determine the shard to which a given
     * data record belongs.
     * </p>
     * <p>
     * Partition keys are Unicode strings, with a maximum length limit of 256
     * characters for each key. An MD5 hash function is used to map partition
     * keys to 128-bit integer values and to map associated data records to
     * shards using the hash key ranges of the shards. You can override hashing
     * the partition key to determine the shard by explicitly specifying a hash
     * value using the <code>ExplicitHashKey</code> parameter. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams
     * Developer Guide</i>.
     * </p>
     * <p>
     * <code>PutRecord</code> returns the shard ID of where the data record was
     * placed and the sequence number that was assigned to the data record.
     * </p>
     * <p>
     * Sequence numbers increase over time and are specific to a shard within a
     * stream, not across all shards within a stream. To guarantee strictly
     * increasing ordering, write serially to a shard and use the
     * <code>SequenceNumberForOrdering</code> parameter. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>PutRecord</code> request cannot be processed because of
     * insufficient provisioned throughput on the shard involved in the request,
     * <code>PutRecord</code> throws
     * <code>ProvisionedThroughputExceededException</code>.
     * </p>
     * <p>
     * By default, data records are accessible for 24 hours from the time that
     * they are added to a stream. You can use
     * <a>IncreaseStreamRetentionPeriod</a> or
     * <a>DecreaseStreamRetentionPeriod</a> to modify this retention period.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the stream to put the data record into.
     *            </p>
     * @param data <p>
     *            The data blob to put into the record, which is base64-encoded
     *            when the blob is serialized. When the data blob (the payload
     *            before base64-encoding) is added to the partition key size,
     *            the total size must not exceed the maximum record size (1 MB).
     *            </p>
     * @param partitionKey <p>
     *            Determines which shard in the stream the data record is
     *            assigned to. Partition keys are Unicode strings with a maximum
     *            length limit of 256 characters for each key. Amazon Kinesis
     *            Data Streams uses the partition key as input to a hash
     *            function that maps the partition key and associated data to a
     *            specific shard. Specifically, an MD5 hash function is used to
     *            map partition keys to 128-bit integer values and to map
     *            associated data records to shards. As a result of this hashing
     *            mechanism, all data records with the same partition key map to
     *            the same shard within the stream.
     *            </p>
     * @return putRecordResult The response from the PutRecord service method,
     *         as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ProvisionedThroughputExceededException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSAccessDeniedException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutRecordResult putRecord(String streamName, java.nio.ByteBuffer data,
            String partitionKey)
            throws AmazonServiceException, AmazonClientException {
        PutRecordRequest putRecordRequest = new PutRecordRequest();
        putRecordRequest.setStreamName(streamName);
        putRecordRequest.setData(data);
        putRecordRequest.setPartitionKey(partitionKey);
        return putRecord(putRecordRequest);
    }

    /**
     * <p>
     * Writes a single data record into an Amazon Kinesis data stream. Call
     * <code>PutRecord</code> to send data into the stream for real-time
     * ingestion and subsequent processing, one record at a time. Each shard can
     * support writes up to 1,000 records per second, up to a maximum data write
     * total of 1 MB per second.
     * </p>
     * <p>
     * You must specify the name of the stream that captures, stores, and
     * transports the data; a partition key; and the data blob itself.
     * </p>
     * <p>
     * The data blob can be any type of data; for example, a segment from a log
     * file, geographic/location data, website clickstream data, and so on.
     * </p>
     * <p>
     * The partition key is used by Kinesis Data Streams to distribute data
     * across shards. Kinesis Data Streams segregates the data records that
     * belong to a stream into multiple shards, using the partition key
     * associated with each data record to determine the shard to which a given
     * data record belongs.
     * </p>
     * <p>
     * Partition keys are Unicode strings, with a maximum length limit of 256
     * characters for each key. An MD5 hash function is used to map partition
     * keys to 128-bit integer values and to map associated data records to
     * shards using the hash key ranges of the shards. You can override hashing
     * the partition key to determine the shard by explicitly specifying a hash
     * value using the <code>ExplicitHashKey</code> parameter. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams
     * Developer Guide</i>.
     * </p>
     * <p>
     * <code>PutRecord</code> returns the shard ID of where the data record was
     * placed and the sequence number that was assigned to the data record.
     * </p>
     * <p>
     * Sequence numbers increase over time and are specific to a shard within a
     * stream, not across all shards within a stream. To guarantee strictly
     * increasing ordering, write serially to a shard and use the
     * <code>SequenceNumberForOrdering</code> parameter. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>PutRecord</code> request cannot be processed because of
     * insufficient provisioned throughput on the shard involved in the request,
     * <code>PutRecord</code> throws
     * <code>ProvisionedThroughputExceededException</code>.
     * </p>
     * <p>
     * By default, data records are accessible for 24 hours from the time that
     * they are added to a stream. You can use
     * <a>IncreaseStreamRetentionPeriod</a> or
     * <a>DecreaseStreamRetentionPeriod</a> to modify this retention period.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the stream to put the data record into.
     *            </p>
     * @param data <p>
     *            The data blob to put into the record, which is base64-encoded
     *            when the blob is serialized. When the data blob (the payload
     *            before base64-encoding) is added to the partition key size,
     *            the total size must not exceed the maximum record size (1 MB).
     *            </p>
     * @param partitionKey <p>
     *            Determines which shard in the stream the data record is
     *            assigned to. Partition keys are Unicode strings with a maximum
     *            length limit of 256 characters for each key. Amazon Kinesis
     *            Data Streams uses the partition key as input to a hash
     *            function that maps the partition key and associated data to a
     *            specific shard. Specifically, an MD5 hash function is used to
     *            map partition keys to 128-bit integer values and to map
     *            associated data records to shards. As a result of this hashing
     *            mechanism, all data records with the same partition key map to
     *            the same shard within the stream.
     *            </p>
     * @param sequenceNumberForOrdering <p>
     *            Guarantees strictly increasing sequence numbers, for puts from
     *            the same client and to the same partition key. Usage: set the
     *            <code>SequenceNumberForOrdering</code> of record <i>n</i> to
     *            the sequence number of record <i>n-1</i> (as returned in the
     *            result when putting record <i>n-1</i>). If this parameter is
     *            not set, records are coarsely ordered based on arrival time.
     *            </p>
     * @return putRecordResult The response from the PutRecord service method,
     *         as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ProvisionedThroughputExceededException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSAccessDeniedException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutRecordResult putRecord(String streamName, java.nio.ByteBuffer data,
            String partitionKey, String sequenceNumberForOrdering)
            throws AmazonServiceException, AmazonClientException {
        PutRecordRequest putRecordRequest = new PutRecordRequest();
        putRecordRequest.setStreamName(streamName);
        putRecordRequest.setData(data);
        putRecordRequest.setPartitionKey(partitionKey);
        putRecordRequest.setSequenceNumberForOrdering(sequenceNumberForOrdering);
        return putRecord(putRecordRequest);
    }

    /**
     * <p>
     * Gets an Amazon Kinesis shard iterator. A shard iterator expires five
     * minutes after it is returned to the requester.
     * </p>
     * <p>
     * A shard iterator specifies the shard position from which to start reading
     * data records sequentially. The position is specified using the sequence
     * number of a data record in a shard. A sequence number is the identifier
     * associated with every record ingested in the stream, and is assigned when
     * a record is put into the stream. Each stream has one or more shards.
     * </p>
     * <p>
     * You must specify the shard iterator type. For example, you can set the
     * <code>ShardIteratorType</code> parameter to read exactly from the
     * position denoted by a specific sequence number by using the
     * <code>AT_SEQUENCE_NUMBER</code> shard iterator type. Alternatively, the
     * parameter can read right after the sequence number by using the
     * <code>AFTER_SEQUENCE_NUMBER</code> shard iterator type, using sequence
     * numbers returned by earlier calls to <a>PutRecord</a>, <a>PutRecords</a>,
     * <a>GetRecords</a>, or <a>DescribeStream</a>. In the request, you can
     * specify the shard iterator type <code>AT_TIMESTAMP</code> to read records
     * from an arbitrary point in time, <code>TRIM_HORIZON</code> to cause
     * <code>ShardIterator</code> to point to the last untrimmed record in the
     * shard in the system (the oldest data record in the shard), or
     * <code>LATEST</code> so that you always read the most recent data in the
     * shard.
     * </p>
     * <p>
     * When you read repeatedly from a stream, use a <a>GetShardIterator</a>
     * request to get the first shard iterator for use in your first
     * <a>GetRecords</a> request and for subsequent reads use the shard iterator
     * returned by the <a>GetRecords</a> request in
     * <code>NextShardIterator</code>. A new shard iterator is returned by every
     * <a>GetRecords</a> request in <code>NextShardIterator</code>, which you
     * use in the <code>ShardIterator</code> parameter of the next
     * <a>GetRecords</a> request.
     * </p>
     * <p>
     * If a <a>GetShardIterator</a> request is made too often, you receive a
     * <code>ProvisionedThroughputExceededException</code>. For more information
     * about throughput limits, see <a>GetRecords</a>, and <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
     * >Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * <p>
     * If the shard is closed, <a>GetShardIterator</a> returns a valid iterator
     * for the last sequence number of the shard. A shard can be closed as a
     * result of using <a>SplitShard</a> or <a>MergeShards</a>.
     * </p>
     * <p>
     * <a>GetShardIterator</a> has a limit of five transactions per second per
     * account per open shard.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the Amazon Kinesis data stream.
     *            </p>
     * @param shardId <p>
     *            The shard ID of the Kinesis Data Streams shard to get the
     *            iterator for.
     *            </p>
     * @param shardIteratorType <p>
     *            Determines how the shard iterator is used to start reading
     *            data records from the shard.
     *            </p>
     *            <p>
     *            The following are the valid Amazon Kinesis shard iterator
     *            types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *            by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *            denoted by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AT_TIMESTAMP - Start reading from the position denoted by a
     *            specific time stamp, provided in the value
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TRIM_HORIZON - Start reading at the last untrimmed record in
     *            the shard in the system, which is the oldest data record in
     *            the shard.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LATEST - Start reading just after the most recent record in
     *            the shard, so that you always read the most recent data in the
     *            shard.
     *            </p>
     *            </li>
     *            </ul>
     * @return getShardIteratorResult The response from the GetShardIterator
     *         service method, as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetShardIteratorResult getShardIterator(String streamName, String shardId,
            String shardIteratorType)
            throws AmazonServiceException, AmazonClientException {
        GetShardIteratorRequest getShardIteratorRequest = new GetShardIteratorRequest();
        getShardIteratorRequest.setStreamName(streamName);
        getShardIteratorRequest.setShardId(shardId);
        getShardIteratorRequest.setShardIteratorType(shardIteratorType);
        return getShardIterator(getShardIteratorRequest);
    }

    /**
     * <p>
     * Gets an Amazon Kinesis shard iterator. A shard iterator expires five
     * minutes after it is returned to the requester.
     * </p>
     * <p>
     * A shard iterator specifies the shard position from which to start reading
     * data records sequentially. The position is specified using the sequence
     * number of a data record in a shard. A sequence number is the identifier
     * associated with every record ingested in the stream, and is assigned when
     * a record is put into the stream. Each stream has one or more shards.
     * </p>
     * <p>
     * You must specify the shard iterator type. For example, you can set the
     * <code>ShardIteratorType</code> parameter to read exactly from the
     * position denoted by a specific sequence number by using the
     * <code>AT_SEQUENCE_NUMBER</code> shard iterator type. Alternatively, the
     * parameter can read right after the sequence number by using the
     * <code>AFTER_SEQUENCE_NUMBER</code> shard iterator type, using sequence
     * numbers returned by earlier calls to <a>PutRecord</a>, <a>PutRecords</a>,
     * <a>GetRecords</a>, or <a>DescribeStream</a>. In the request, you can
     * specify the shard iterator type <code>AT_TIMESTAMP</code> to read records
     * from an arbitrary point in time, <code>TRIM_HORIZON</code> to cause
     * <code>ShardIterator</code> to point to the last untrimmed record in the
     * shard in the system (the oldest data record in the shard), or
     * <code>LATEST</code> so that you always read the most recent data in the
     * shard.
     * </p>
     * <p>
     * When you read repeatedly from a stream, use a <a>GetShardIterator</a>
     * request to get the first shard iterator for use in your first
     * <a>GetRecords</a> request and for subsequent reads use the shard iterator
     * returned by the <a>GetRecords</a> request in
     * <code>NextShardIterator</code>. A new shard iterator is returned by every
     * <a>GetRecords</a> request in <code>NextShardIterator</code>, which you
     * use in the <code>ShardIterator</code> parameter of the next
     * <a>GetRecords</a> request.
     * </p>
     * <p>
     * If a <a>GetShardIterator</a> request is made too often, you receive a
     * <code>ProvisionedThroughputExceededException</code>. For more information
     * about throughput limits, see <a>GetRecords</a>, and <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html"
     * >Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * <p>
     * If the shard is closed, <a>GetShardIterator</a> returns a valid iterator
     * for the last sequence number of the shard. A shard can be closed as a
     * result of using <a>SplitShard</a> or <a>MergeShards</a>.
     * </p>
     * <p>
     * <a>GetShardIterator</a> has a limit of five transactions per second per
     * account per open shard.
     * </p>
     * 
     * @param streamName <p>
     *            The name of the Amazon Kinesis data stream.
     *            </p>
     * @param shardId <p>
     *            The shard ID of the Kinesis Data Streams shard to get the
     *            iterator for.
     *            </p>
     * @param shardIteratorType <p>
     *            Determines how the shard iterator is used to start reading
     *            data records from the shard.
     *            </p>
     *            <p>
     *            The following are the valid Amazon Kinesis shard iterator
     *            types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AT_SEQUENCE_NUMBER - Start reading from the position denoted
     *            by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *            denoted by a specific sequence number, provided in the value
     *            <code>StartingSequenceNumber</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AT_TIMESTAMP - Start reading from the position denoted by a
     *            specific time stamp, provided in the value
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TRIM_HORIZON - Start reading at the last untrimmed record in
     *            the shard in the system, which is the oldest data record in
     *            the shard.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LATEST - Start reading just after the most recent record in
     *            the shard, so that you always read the most recent data in the
     *            shard.
     *            </p>
     *            </li>
     *            </ul>
     * @param startingSequenceNumber <p>
     *            The sequence number of the data record in the shard from which
     *            to start reading. Used with shard iterator type
     *            AT_SEQUENCE_NUMBER and AFTER_SEQUENCE_NUMBER.
     *            </p>
     * @return getShardIteratorResult The response from the GetShardIterator
     *         service method, as returned by Amazon Kinesis Streams.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Streams indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetShardIteratorResult getShardIterator(String streamName, String shardId,
            String shardIteratorType, String startingSequenceNumber)
            throws AmazonServiceException, AmazonClientException {
        GetShardIteratorRequest getShardIteratorRequest = new GetShardIteratorRequest();
        getShardIteratorRequest.setStreamName(streamName);
        getShardIteratorRequest.setShardId(shardId);
        getShardIteratorRequest.setShardIteratorType(shardIteratorType);
        getShardIteratorRequest.setStartingSequenceNumber(startingSequenceNumber);
        return getShardIterator(getShardIteratorRequest);
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
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
