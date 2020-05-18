/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.qldb;

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

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.services.qldb.model.transform.*;

/**
 * Client for accessing Amazon QLDB. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * The control plane for Amazon QLDB
 * </p>
 */
public class AmazonQLDBClient extends AmazonWebServiceClient implements AmazonQLDB {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon QLDB exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonQLDB. A
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
    public AmazonQLDBClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQLDB. A
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
     *            how this client connects to AmazonQLDB (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonQLDBClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQLDB using the
     * specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonQLDBClient client = new AmazonQLDBClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonQLDBClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQLDB using the
     * specified AWS account credentials and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonQLDBClient client = new AmazonQLDBClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonQLDB (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonQLDBClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQLDB using the
     * specified AWS account credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonQLDBClient client = new AmazonQLDBClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonQLDBClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQLDB using the
     * specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonQLDBClient client = new AmazonQLDBClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonQLDB (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonQLDBClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQLDB using the
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
     *            how this client connects to AmazonQLDB (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonQLDBClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQLDB using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonQLDBClient client = new AmazonQLDBClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonQLDB (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonQLDBClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourcePreconditionNotMetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("qldb.us-east-1.amazonaws.com");
        this.endpointPrefix = "qldb";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/qldb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/qldb/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Ends a given Amazon QLDB journal stream. Before a stream can be canceled,
     * its current status must be <code>ACTIVE</code>.
     * </p>
     * <p>
     * You can't restart a stream after you cancel it. Canceled QLDB stream
     * resources are subject to a 7-day retention period, so they are
     * automatically deleted after this limit expires.
     * </p>
     * 
     * @param cancelJournalKinesisStreamRequest
     * @return cancelJournalKinesisStreamResult The response from the
     *         CancelJournalKinesisStream service method, as returned by Amazon
     *         QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CancelJournalKinesisStreamResult cancelJournalKinesisStream(
            CancelJournalKinesisStreamRequest cancelJournalKinesisStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelJournalKinesisStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJournalKinesisStreamRequest> request = null;
        Response<CancelJournalKinesisStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJournalKinesisStreamRequestMarshaller()
                        .marshall(cancelJournalKinesisStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelJournalKinesisStreamResult, JsonUnmarshallerContext> unmarshaller = new CancelJournalKinesisStreamResultJsonUnmarshaller();
            JsonResponseHandler<CancelJournalKinesisStreamResult> responseHandler = new JsonResponseHandler<CancelJournalKinesisStreamResult>(
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
     * Creates a new ledger in your AWS account.
     * </p>
     * 
     * @param createLedgerRequest
     * @return createLedgerResult The response from the CreateLedger service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateLedgerResult createLedger(CreateLedgerRequest createLedgerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLedgerRequest> request = null;
        Response<CreateLedgerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLedgerRequestMarshaller().marshall(createLedgerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateLedgerResult, JsonUnmarshallerContext> unmarshaller = new CreateLedgerResultJsonUnmarshaller();
            JsonResponseHandler<CreateLedgerResult> responseHandler = new JsonResponseHandler<CreateLedgerResult>(
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
     * Deletes a ledger and all of its contents. This action is irreversible.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you
     * can delete the ledger using the QLDB API or the AWS Command Line
     * Interface (AWS CLI). You can disable it by calling the
     * <code>UpdateLedger</code> operation to set the flag to <code>false</code>
     * . The QLDB console disables deletion protection for you when you use it
     * to delete a ledger.
     * </p>
     * 
     * @param deleteLedgerRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteLedger(DeleteLedgerRequest deleteLedgerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLedgerRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLedgerRequestMarshaller().marshall(deleteLedgerRequest);
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
     * Returns detailed information about a given Amazon QLDB journal stream.
     * The output includes the Amazon Resource Name (ARN), stream name, current
     * status, creation time, and the parameters of your original stream
     * creation request.
     * </p>
     * 
     * @param describeJournalKinesisStreamRequest
     * @return describeJournalKinesisStreamResult The response from the
     *         DescribeJournalKinesisStream service method, as returned by
     *         Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeJournalKinesisStreamResult describeJournalKinesisStream(
            DescribeJournalKinesisStreamRequest describeJournalKinesisStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeJournalKinesisStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJournalKinesisStreamRequest> request = null;
        Response<DescribeJournalKinesisStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJournalKinesisStreamRequestMarshaller()
                        .marshall(describeJournalKinesisStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeJournalKinesisStreamResult, JsonUnmarshallerContext> unmarshaller = new DescribeJournalKinesisStreamResultJsonUnmarshaller();
            JsonResponseHandler<DescribeJournalKinesisStreamResult> responseHandler = new JsonResponseHandler<DescribeJournalKinesisStreamResult>(
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
     * Returns information about a journal export job, including the ledger
     * name, export ID, when it was created, current status, and its start and
     * end time export parameters.
     * </p>
     * <p>
     * This action does not return any expired export jobs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/export-journal.request.html#export-journal.request.expiration"
     * >Export Job Expiration</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * If the export job with the given <code>ExportId</code> doesn't exist,
     * then throws <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * 
     * @param describeJournalS3ExportRequest
     * @return describeJournalS3ExportResult The response from the
     *         DescribeJournalS3Export service method, as returned by Amazon
     *         QLDB.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeJournalS3ExportResult describeJournalS3Export(
            DescribeJournalS3ExportRequest describeJournalS3ExportRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeJournalS3ExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJournalS3ExportRequest> request = null;
        Response<DescribeJournalS3ExportResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJournalS3ExportRequestMarshaller()
                        .marshall(describeJournalS3ExportRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeJournalS3ExportResult, JsonUnmarshallerContext> unmarshaller = new DescribeJournalS3ExportResultJsonUnmarshaller();
            JsonResponseHandler<DescribeJournalS3ExportResult> responseHandler = new JsonResponseHandler<DescribeJournalS3ExportResult>(
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
     * Returns information about a ledger, including its state and when it was
     * created.
     * </p>
     * 
     * @param describeLedgerRequest
     * @return describeLedgerResult The response from the DescribeLedger service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLedgerResult describeLedger(DescribeLedgerRequest describeLedgerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLedgerRequest> request = null;
        Response<DescribeLedgerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLedgerRequestMarshaller().marshall(describeLedgerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLedgerResult, JsonUnmarshallerContext> unmarshaller = new DescribeLedgerResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLedgerResult> responseHandler = new JsonResponseHandler<DescribeLedgerResult>(
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
     * Exports journal contents within a date and time range from a ledger into
     * a specified Amazon Simple Storage Service (Amazon S3) bucket. The data is
     * written as files in Amazon Ion format.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> is in
     * <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * You can initiate up to two concurrent journal export requests for each
     * ledger. Beyond this limit, journal export requests throw
     * <code>LimitExceededException</code>.
     * </p>
     * 
     * @param exportJournalToS3Request
     * @return exportJournalToS3Result The response from the ExportJournalToS3
     *         service method, as returned by Amazon QLDB.
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ExportJournalToS3Result exportJournalToS3(
            ExportJournalToS3Request exportJournalToS3Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(exportJournalToS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportJournalToS3Request> request = null;
        Response<ExportJournalToS3Result> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportJournalToS3RequestMarshaller()
                        .marshall(exportJournalToS3Request);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ExportJournalToS3Result, JsonUnmarshallerContext> unmarshaller = new ExportJournalToS3ResultJsonUnmarshaller();
            JsonResponseHandler<ExportJournalToS3Result> responseHandler = new JsonResponseHandler<ExportJournalToS3Result>(
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
     * Returns a journal block object at a specified address in a ledger. Also
     * returns a proof of the specified block for verification if
     * <code>DigestTipAddress</code> is provided.
     * </p>
     * <p>
     * If the specified ledger doesn't exist or is in <code>DELETING</code>
     * status, then throws <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the specified ledger is in <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * If no block exists with the specified address, then throws
     * <code>InvalidParameterException</code>.
     * </p>
     * 
     * @param getBlockRequest
     * @return getBlockResult The response from the GetBlock service method, as
     *         returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBlockResult getBlock(GetBlockRequest getBlockRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBlockRequest> request = null;
        Response<GetBlockResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBlockRequestMarshaller().marshall(getBlockRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBlockResult, JsonUnmarshallerContext> unmarshaller = new GetBlockResultJsonUnmarshaller();
            JsonResponseHandler<GetBlockResult> responseHandler = new JsonResponseHandler<GetBlockResult>(
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
     * Returns the digest of a ledger at the latest committed block in the
     * journal. The response includes a 256-bit hash value and a block address.
     * </p>
     * 
     * @param getDigestRequest
     * @return getDigestResult The response from the GetDigest service method,
     *         as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDigestResult getDigest(GetDigestRequest getDigestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDigestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDigestRequest> request = null;
        Response<GetDigestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDigestRequestMarshaller().marshall(getDigestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDigestResult, JsonUnmarshallerContext> unmarshaller = new GetDigestResultJsonUnmarshaller();
            JsonResponseHandler<GetDigestResult> responseHandler = new JsonResponseHandler<GetDigestResult>(
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
     * Returns a revision data object for a specified document ID and block
     * address. Also returns a proof of the specified revision for verification
     * if <code>DigestTipAddress</code> is provided.
     * </p>
     * 
     * @param getRevisionRequest
     * @return getRevisionResult The response from the GetRevision service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRevisionResult getRevision(GetRevisionRequest getRevisionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRevisionRequest> request = null;
        Response<GetRevisionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRevisionRequestMarshaller().marshall(getRevisionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRevisionResult, JsonUnmarshallerContext> unmarshaller = new GetRevisionResultJsonUnmarshaller();
            JsonResponseHandler<GetRevisionResult> responseHandler = new JsonResponseHandler<GetRevisionResult>(
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
     * Returns an array of all Amazon QLDB journal stream descriptors for a
     * given ledger. The output of each stream descriptor includes the same
     * details that are returned by <code>DescribeJournalKinesisStream</code>.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items. It is
     * paginated so that you can retrieve all the items by calling
     * <code>ListJournalKinesisStreamsForLedger</code> multiple times.
     * </p>
     * 
     * @param listJournalKinesisStreamsForLedgerRequest
     * @return listJournalKinesisStreamsForLedgerResult The response from the
     *         ListJournalKinesisStreamsForLedger service method, as returned by
     *         Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListJournalKinesisStreamsForLedgerResult listJournalKinesisStreamsForLedger(
            ListJournalKinesisStreamsForLedgerRequest listJournalKinesisStreamsForLedgerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listJournalKinesisStreamsForLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJournalKinesisStreamsForLedgerRequest> request = null;
        Response<ListJournalKinesisStreamsForLedgerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJournalKinesisStreamsForLedgerRequestMarshaller()
                        .marshall(listJournalKinesisStreamsForLedgerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListJournalKinesisStreamsForLedgerResult, JsonUnmarshallerContext> unmarshaller = new ListJournalKinesisStreamsForLedgerResultJsonUnmarshaller();
            JsonResponseHandler<ListJournalKinesisStreamsForLedgerResult> responseHandler = new JsonResponseHandler<ListJournalKinesisStreamsForLedgerResult>(
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
     * Returns an array of journal export job descriptions for all ledgers that
     * are associated with the current AWS account and Region.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is
     * paginated so that you can retrieve all the items by calling
     * <code>ListJournalS3Exports</code> multiple times.
     * </p>
     * <p>
     * This action does not return any expired export jobs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/export-journal.request.html#export-journal.request.expiration"
     * >Export Job Expiration</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * 
     * @param listJournalS3ExportsRequest
     * @return listJournalS3ExportsResult The response from the
     *         ListJournalS3Exports service method, as returned by Amazon QLDB.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListJournalS3ExportsResult listJournalS3Exports(
            ListJournalS3ExportsRequest listJournalS3ExportsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listJournalS3ExportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJournalS3ExportsRequest> request = null;
        Response<ListJournalS3ExportsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJournalS3ExportsRequestMarshaller()
                        .marshall(listJournalS3ExportsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListJournalS3ExportsResult, JsonUnmarshallerContext> unmarshaller = new ListJournalS3ExportsResultJsonUnmarshaller();
            JsonResponseHandler<ListJournalS3ExportsResult> responseHandler = new JsonResponseHandler<ListJournalS3ExportsResult>(
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
     * Returns an array of journal export job descriptions for a specified
     * ledger.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is
     * paginated so that you can retrieve all the items by calling
     * <code>ListJournalS3ExportsForLedger</code> multiple times.
     * </p>
     * <p>
     * This action does not return any expired export jobs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/export-journal.request.html#export-journal.request.expiration"
     * >Export Job Expiration</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * 
     * @param listJournalS3ExportsForLedgerRequest
     * @return listJournalS3ExportsForLedgerResult The response from the
     *         ListJournalS3ExportsForLedger service method, as returned by
     *         Amazon QLDB.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListJournalS3ExportsForLedgerResult listJournalS3ExportsForLedger(
            ListJournalS3ExportsForLedgerRequest listJournalS3ExportsForLedgerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listJournalS3ExportsForLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJournalS3ExportsForLedgerRequest> request = null;
        Response<ListJournalS3ExportsForLedgerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJournalS3ExportsForLedgerRequestMarshaller()
                        .marshall(listJournalS3ExportsForLedgerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListJournalS3ExportsForLedgerResult, JsonUnmarshallerContext> unmarshaller = new ListJournalS3ExportsForLedgerResultJsonUnmarshaller();
            JsonResponseHandler<ListJournalS3ExportsForLedgerResult> responseHandler = new JsonResponseHandler<ListJournalS3ExportsForLedgerResult>(
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
     * Returns an array of ledger summaries that are associated with the current
     * AWS account and Region.
     * </p>
     * <p>
     * This action returns a maximum of 100 items and is paginated so that you
     * can retrieve all the items by calling <code>ListLedgers</code> multiple
     * times.
     * </p>
     * 
     * @param listLedgersRequest
     * @return listLedgersResult The response from the ListLedgers service
     *         method, as returned by Amazon QLDB.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListLedgersResult listLedgers(ListLedgersRequest listLedgersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listLedgersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLedgersRequest> request = null;
        Response<ListLedgersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLedgersRequestMarshaller().marshall(listLedgersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListLedgersResult, JsonUnmarshallerContext> unmarshaller = new ListLedgersResultJsonUnmarshaller();
            JsonResponseHandler<ListLedgersResult> responseHandler = new JsonResponseHandler<ListLedgersResult>(
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
     * Returns all tags for a specified Amazon QLDB resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(listTagsForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForResourceResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForResourceResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForResourceResult> responseHandler = new JsonResponseHandler<ListTagsForResourceResult>(
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
     * Creates a stream for a given Amazon QLDB ledger that delivers the journal
     * data to a specified Amazon Kinesis Data Streams resource. The stream
     * captures every document revision that is committed to your journal and
     * sends it to the Kinesis data stream.
     * </p>
     * 
     * @param streamJournalToKinesisRequest
     * @return streamJournalToKinesisResult The response from the
     *         StreamJournalToKinesis service method, as returned by Amazon
     *         QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StreamJournalToKinesisResult streamJournalToKinesis(
            StreamJournalToKinesisRequest streamJournalToKinesisRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(streamJournalToKinesisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StreamJournalToKinesisRequest> request = null;
        Response<StreamJournalToKinesisResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StreamJournalToKinesisRequestMarshaller()
                        .marshall(streamJournalToKinesisRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StreamJournalToKinesisResult, JsonUnmarshallerContext> unmarshaller = new StreamJournalToKinesisResultJsonUnmarshaller();
            JsonResponseHandler<StreamJournalToKinesisResult> responseHandler = new JsonResponseHandler<StreamJournalToKinesisResult>(
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
     * Adds one or more tags to a specified Amazon QLDB resource.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags
     * for a resource, your request fails and returns an error.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TagResourceResult, JsonUnmarshallerContext> unmarshaller = new TagResourceResultJsonUnmarshaller();
            JsonResponseHandler<TagResourceResult> responseHandler = new JsonResponseHandler<TagResourceResult>(
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
     * Removes one or more tags from a specified Amazon QLDB resource. You can
     * specify up to 50 tag keys to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UntagResourceResult, JsonUnmarshallerContext> unmarshaller = new UntagResourceResultJsonUnmarshaller();
            JsonResponseHandler<UntagResourceResult> responseHandler = new JsonResponseHandler<UntagResourceResult>(
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
     * Updates properties on a ledger.
     * </p>
     * 
     * @param updateLedgerRequest
     * @return updateLedgerResult The response from the UpdateLedger service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateLedgerResult updateLedger(UpdateLedgerRequest updateLedgerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateLedgerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLedgerRequest> request = null;
        Response<UpdateLedgerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLedgerRequestMarshaller().marshall(updateLedgerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateLedgerResult, JsonUnmarshallerContext> unmarshaller = new UpdateLedgerResultJsonUnmarshaller();
            JsonResponseHandler<UpdateLedgerResult> responseHandler = new JsonResponseHandler<UpdateLedgerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
