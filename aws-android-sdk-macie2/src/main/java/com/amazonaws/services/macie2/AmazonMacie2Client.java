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

package com.amazonaws.services.macie2;

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

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.services.macie2.model.transform.*;

/**
 * Client for accessing Amazon Macie 2. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon Macie
 * </p>
 */
public class AmazonMacie2Client extends AmazonWebServiceClient implements AmazonMacie2 {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Macie 2 exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonMacie2. A
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
    public AmazonMacie2Client() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMacie2. A
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
     *            how this client connects to AmazonMacie2 (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonMacie2Client(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMacie2 using
     * the specified AWS account credentials.
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
     *         AmazonMacie2Client client = new AmazonMacie2Client(AWSMobileClient.getInstance());
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
    public AmazonMacie2Client(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMacie2 using
     * the specified AWS account credentials and client configuration options.
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
     *         AmazonMacie2Client client = new AmazonMacie2Client(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonMacie2 (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonMacie2Client(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMacie2 using
     * the specified AWS account credentials provider.
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
     *         AmazonMacie2Client client = new AmazonMacie2Client(AWSMobileClient.getInstance());
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
    public AmazonMacie2Client(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMacie2 using
     * the specified AWS account credentials provider and client configuration
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
     *         AmazonMacie2Client client = new AmazonMacie2Client(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonMacie2 (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonMacie2Client(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMacie2 using
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
     *            how this client connects to AmazonMacie2 (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonMacie2Client(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMacie2 using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
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
     *         AmazonMacie2Client client = new AmazonMacie2Client(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonMacie2 (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonMacie2Client(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceQuotaExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("macie2.us-east-1.amazonaws.com");
        this.endpointPrefix = "macie2";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/macie2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/macie2/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Accepts an Amazon Macie membership invitation that was received from a
     * specific account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return acceptInvitationResult The response from the AcceptInvitation
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(acceptInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptInvitationRequest> request = null;
        Response<AcceptInvitationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptInvitationRequestMarshaller().marshall(acceptInvitationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AcceptInvitationResult, JsonUnmarshallerContext> unmarshaller = new AcceptInvitationResultJsonUnmarshaller();
            JsonResponseHandler<AcceptInvitationResult> responseHandler = new JsonResponseHandler<AcceptInvitationResult>(
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
     * Archives one or more findings.
     * </p>
     * 
     * @param archiveFindingsRequest
     * @return archiveFindingsResult The response from the ArchiveFindings
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ArchiveFindingsResult archiveFindings(ArchiveFindingsRequest archiveFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(archiveFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ArchiveFindingsRequest> request = null;
        Response<ArchiveFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ArchiveFindingsRequestMarshaller().marshall(archiveFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ArchiveFindingsResult, JsonUnmarshallerContext> unmarshaller = new ArchiveFindingsResultJsonUnmarshaller();
            JsonResponseHandler<ArchiveFindingsResult> responseHandler = new JsonResponseHandler<ArchiveFindingsResult>(
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
     * Retrieves information about one or more custom data identifiers.
     * </p>
     * 
     * @param batchGetCustomDataIdentifiersRequest
     * @return batchGetCustomDataIdentifiersResult The response from the
     *         BatchGetCustomDataIdentifiers service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetCustomDataIdentifiersResult batchGetCustomDataIdentifiers(
            BatchGetCustomDataIdentifiersRequest batchGetCustomDataIdentifiersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetCustomDataIdentifiersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetCustomDataIdentifiersRequest> request = null;
        Response<BatchGetCustomDataIdentifiersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetCustomDataIdentifiersRequestMarshaller()
                        .marshall(batchGetCustomDataIdentifiersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetCustomDataIdentifiersResult, JsonUnmarshallerContext> unmarshaller = new BatchGetCustomDataIdentifiersResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetCustomDataIdentifiersResult> responseHandler = new JsonResponseHandler<BatchGetCustomDataIdentifiersResult>(
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
     * Creates and defines the settings for a classification job.
     * </p>
     * 
     * @param createClassificationJobRequest
     * @return createClassificationJobResult The response from the
     *         CreateClassificationJob service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateClassificationJobResult createClassificationJob(
            CreateClassificationJobRequest createClassificationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClassificationJobRequest> request = null;
        Response<CreateClassificationJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClassificationJobRequestMarshaller()
                        .marshall(createClassificationJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateClassificationJobResult, JsonUnmarshallerContext> unmarshaller = new CreateClassificationJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateClassificationJobResult> responseHandler = new JsonResponseHandler<CreateClassificationJobResult>(
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
     * Creates and defines the criteria and other settings for a custom data
     * identifier.
     * </p>
     * 
     * @param createCustomDataIdentifierRequest
     * @return createCustomDataIdentifierResult The response from the
     *         CreateCustomDataIdentifier service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCustomDataIdentifierResult createCustomDataIdentifier(
            CreateCustomDataIdentifierRequest createCustomDataIdentifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCustomDataIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomDataIdentifierRequest> request = null;
        Response<CreateCustomDataIdentifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomDataIdentifierRequestMarshaller()
                        .marshall(createCustomDataIdentifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCustomDataIdentifierResult, JsonUnmarshallerContext> unmarshaller = new CreateCustomDataIdentifierResultJsonUnmarshaller();
            JsonResponseHandler<CreateCustomDataIdentifierResult> responseHandler = new JsonResponseHandler<CreateCustomDataIdentifierResult>(
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
     * Creates and defines the criteria and other settings for a findings
     * filter.
     * </p>
     * 
     * @param createFindingsFilterRequest
     * @return createFindingsFilterResult The response from the
     *         CreateFindingsFilter service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateFindingsFilterResult createFindingsFilter(
            CreateFindingsFilterRequest createFindingsFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createFindingsFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFindingsFilterRequest> request = null;
        Response<CreateFindingsFilterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFindingsFilterRequestMarshaller()
                        .marshall(createFindingsFilterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateFindingsFilterResult, JsonUnmarshallerContext> unmarshaller = new CreateFindingsFilterResultJsonUnmarshaller();
            JsonResponseHandler<CreateFindingsFilterResult> responseHandler = new JsonResponseHandler<CreateFindingsFilterResult>(
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
     * Sends an Amazon Macie membership invitation to one or more accounts.
     * </p>
     * 
     * @param createInvitationsRequest
     * @return createInvitationsResult The response from the CreateInvitations
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateInvitationsResult createInvitations(
            CreateInvitationsRequest createInvitationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInvitationsRequest> request = null;
        Response<CreateInvitationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInvitationsRequestMarshaller()
                        .marshall(createInvitationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInvitationsResult, JsonUnmarshallerContext> unmarshaller = new CreateInvitationsResultJsonUnmarshaller();
            JsonResponseHandler<CreateInvitationsResult> responseHandler = new JsonResponseHandler<CreateInvitationsResult>(
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
     * Associates an account with an Amazon Macie master account.
     * </p>
     * 
     * @param createMemberRequest
     * @return createMemberResult The response from the CreateMember service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateMemberResult createMember(CreateMemberRequest createMemberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMemberRequest> request = null;
        Response<CreateMemberResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMemberRequestMarshaller().marshall(createMemberRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMemberResult, JsonUnmarshallerContext> unmarshaller = new CreateMemberResultJsonUnmarshaller();
            JsonResponseHandler<CreateMemberResult> responseHandler = new JsonResponseHandler<CreateMemberResult>(
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
     * Creates sample findings.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return createSampleFindingsResult The response from the
     *         CreateSampleFindings service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSampleFindingsResult createSampleFindings(
            CreateSampleFindingsRequest createSampleFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSampleFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSampleFindingsRequest> request = null;
        Response<CreateSampleFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSampleFindingsRequestMarshaller()
                        .marshall(createSampleFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSampleFindingsResult, JsonUnmarshallerContext> unmarshaller = new CreateSampleFindingsResultJsonUnmarshaller();
            JsonResponseHandler<CreateSampleFindingsResult> responseHandler = new JsonResponseHandler<CreateSampleFindingsResult>(
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
     * Declines Amazon Macie membership invitations that were received from
     * specific accounts.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return declineInvitationsResult The response from the DeclineInvitations
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeclineInvitationsResult declineInvitations(
            DeclineInvitationsRequest declineInvitationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(declineInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeclineInvitationsRequest> request = null;
        Response<DeclineInvitationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeclineInvitationsRequestMarshaller()
                        .marshall(declineInvitationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeclineInvitationsResult, JsonUnmarshallerContext> unmarshaller = new DeclineInvitationsResultJsonUnmarshaller();
            JsonResponseHandler<DeclineInvitationsResult> responseHandler = new JsonResponseHandler<DeclineInvitationsResult>(
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
     * Deletes a custom data identifier.
     * </p>
     * 
     * @param deleteCustomDataIdentifierRequest
     * @return deleteCustomDataIdentifierResult The response from the
     *         DeleteCustomDataIdentifier service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteCustomDataIdentifierResult deleteCustomDataIdentifier(
            DeleteCustomDataIdentifierRequest deleteCustomDataIdentifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCustomDataIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomDataIdentifierRequest> request = null;
        Response<DeleteCustomDataIdentifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomDataIdentifierRequestMarshaller()
                        .marshall(deleteCustomDataIdentifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCustomDataIdentifierResult, JsonUnmarshallerContext> unmarshaller = new DeleteCustomDataIdentifierResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCustomDataIdentifierResult> responseHandler = new JsonResponseHandler<DeleteCustomDataIdentifierResult>(
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
     * Deletes a findings filter.
     * </p>
     * 
     * @param deleteFindingsFilterRequest
     * @return deleteFindingsFilterResult The response from the
     *         DeleteFindingsFilter service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteFindingsFilterResult deleteFindingsFilter(
            DeleteFindingsFilterRequest deleteFindingsFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFindingsFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFindingsFilterRequest> request = null;
        Response<DeleteFindingsFilterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFindingsFilterRequestMarshaller()
                        .marshall(deleteFindingsFilterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteFindingsFilterResult, JsonUnmarshallerContext> unmarshaller = new DeleteFindingsFilterResultJsonUnmarshaller();
            JsonResponseHandler<DeleteFindingsFilterResult> responseHandler = new JsonResponseHandler<DeleteFindingsFilterResult>(
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
     * Deletes Amazon Macie membership invitations that were received from
     * specific accounts.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return deleteInvitationsResult The response from the DeleteInvitations
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteInvitationsResult deleteInvitations(
            DeleteInvitationsRequest deleteInvitationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInvitationsRequest> request = null;
        Response<DeleteInvitationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInvitationsRequestMarshaller()
                        .marshall(deleteInvitationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInvitationsResult, JsonUnmarshallerContext> unmarshaller = new DeleteInvitationsResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInvitationsResult> responseHandler = new JsonResponseHandler<DeleteInvitationsResult>(
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
     * Deletes the association between an Amazon Macie master account and an
     * account.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return deleteMemberResult The response from the DeleteMember service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteMemberResult deleteMember(DeleteMemberRequest deleteMemberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMemberRequest> request = null;
        Response<DeleteMemberResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMemberRequestMarshaller().marshall(deleteMemberRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteMemberResult, JsonUnmarshallerContext> unmarshaller = new DeleteMemberResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMemberResult> responseHandler = new JsonResponseHandler<DeleteMemberResult>(
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
     * Retrieves (queries) statistical data and other information about one or
     * more S3 buckets that Amazon Macie monitors and analyzes.
     * </p>
     * 
     * @param describeBucketsRequest
     * @return describeBucketsResult The response from the DescribeBuckets
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeBucketsResult describeBuckets(DescribeBucketsRequest describeBucketsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeBucketsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBucketsRequest> request = null;
        Response<DescribeBucketsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBucketsRequestMarshaller().marshall(describeBucketsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeBucketsResult, JsonUnmarshallerContext> unmarshaller = new DescribeBucketsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeBucketsResult> responseHandler = new JsonResponseHandler<DescribeBucketsResult>(
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
     * Retrieves information about the status and settings for a classification
     * job.
     * </p>
     * 
     * @param describeClassificationJobRequest
     * @return describeClassificationJobResult The response from the
     *         DescribeClassificationJob service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClassificationJobResult describeClassificationJob(
            DescribeClassificationJobRequest describeClassificationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClassificationJobRequest> request = null;
        Response<DescribeClassificationJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClassificationJobRequestMarshaller()
                        .marshall(describeClassificationJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeClassificationJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeClassificationJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeClassificationJobResult> responseHandler = new JsonResponseHandler<DescribeClassificationJobResult>(
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
     * Retrieves information about the Amazon Macie configuration settings for
     * an AWS organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return describeOrganizationConfigurationResult The response from the
     *         DescribeOrganizationConfiguration service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeOrganizationConfigurationResult describeOrganizationConfiguration(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationConfigurationRequest> request = null;
        Response<DescribeOrganizationConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationConfigurationRequestMarshaller()
                        .marshall(describeOrganizationConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeOrganizationConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DescribeOrganizationConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeOrganizationConfigurationResult> responseHandler = new JsonResponseHandler<DescribeOrganizationConfigurationResult>(
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
     * Disables an Amazon Macie account and deletes Macie resources for the
     * account.
     * </p>
     * 
     * @param disableMacieRequest
     * @return disableMacieResult The response from the DisableMacie service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisableMacieResult disableMacie(DisableMacieRequest disableMacieRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableMacieRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableMacieRequest> request = null;
        Response<DisableMacieResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableMacieRequestMarshaller().marshall(disableMacieRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableMacieResult, JsonUnmarshallerContext> unmarshaller = new DisableMacieResultJsonUnmarshaller();
            JsonResponseHandler<DisableMacieResult> responseHandler = new JsonResponseHandler<DisableMacieResult>(
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
     * Disables an account as a delegated administrator of Amazon Macie for an
     * AWS organization.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return disableOrganizationAdminAccountResult The response from the
     *         DisableOrganizationAdminAccount service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableOrganizationAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableOrganizationAdminAccountRequest> request = null;
        Response<DisableOrganizationAdminAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableOrganizationAdminAccountRequestMarshaller()
                        .marshall(disableOrganizationAdminAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableOrganizationAdminAccountResult, JsonUnmarshallerContext> unmarshaller = new DisableOrganizationAdminAccountResultJsonUnmarshaller();
            JsonResponseHandler<DisableOrganizationAdminAccountResult> responseHandler = new JsonResponseHandler<DisableOrganizationAdminAccountResult>(
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
     * Disassociates a member account from its Amazon Macie master account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return disassociateFromMasterAccountResult The response from the
     *         DisassociateFromMasterAccount service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateFromMasterAccountResult disassociateFromMasterAccount(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateFromMasterAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFromMasterAccountRequest> request = null;
        Response<DisassociateFromMasterAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFromMasterAccountRequestMarshaller()
                        .marshall(disassociateFromMasterAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateFromMasterAccountResult, JsonUnmarshallerContext> unmarshaller = new DisassociateFromMasterAccountResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateFromMasterAccountResult> responseHandler = new JsonResponseHandler<DisassociateFromMasterAccountResult>(
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
     * Disassociates an Amazon Macie master account from a member account.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @return disassociateMemberResult The response from the DisassociateMember
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateMemberResult disassociateMember(
            DisassociateMemberRequest disassociateMemberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberRequest> request = null;
        Response<DisassociateMemberResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberRequestMarshaller()
                        .marshall(disassociateMemberRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateMemberResult, JsonUnmarshallerContext> unmarshaller = new DisassociateMemberResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateMemberResult> responseHandler = new JsonResponseHandler<DisassociateMemberResult>(
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
     * Enables Amazon Macie and specifies the configuration settings for a Macie
     * account.
     * </p>
     * 
     * @param enableMacieRequest
     * @return enableMacieResult The response from the EnableMacie service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EnableMacieResult enableMacie(EnableMacieRequest enableMacieRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableMacieRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableMacieRequest> request = null;
        Response<EnableMacieResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableMacieRequestMarshaller().marshall(enableMacieRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableMacieResult, JsonUnmarshallerContext> unmarshaller = new EnableMacieResultJsonUnmarshaller();
            JsonResponseHandler<EnableMacieResult> responseHandler = new JsonResponseHandler<EnableMacieResult>(
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
     * Enables an account as a delegated administrator of Amazon Macie for an
     * AWS organization.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return enableOrganizationAdminAccountResult The response from the
     *         EnableOrganizationAdminAccount service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableOrganizationAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableOrganizationAdminAccountRequest> request = null;
        Response<EnableOrganizationAdminAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableOrganizationAdminAccountRequestMarshaller()
                        .marshall(enableOrganizationAdminAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableOrganizationAdminAccountResult, JsonUnmarshallerContext> unmarshaller = new EnableOrganizationAdminAccountResultJsonUnmarshaller();
            JsonResponseHandler<EnableOrganizationAdminAccountResult> responseHandler = new JsonResponseHandler<EnableOrganizationAdminAccountResult>(
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
     * Retrieves (queries) aggregated statistical data for all the S3 buckets
     * that Amazon Macie monitors and analyzes.
     * </p>
     * 
     * @param getBucketStatisticsRequest
     * @return getBucketStatisticsResult The response from the
     *         GetBucketStatistics service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBucketStatisticsResult getBucketStatistics(
            GetBucketStatisticsRequest getBucketStatisticsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBucketStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketStatisticsRequest> request = null;
        Response<GetBucketStatisticsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBucketStatisticsRequestMarshaller()
                        .marshall(getBucketStatisticsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBucketStatisticsResult, JsonUnmarshallerContext> unmarshaller = new GetBucketStatisticsResultJsonUnmarshaller();
            JsonResponseHandler<GetBucketStatisticsResult> responseHandler = new JsonResponseHandler<GetBucketStatisticsResult>(
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
     * Retrieves the configuration settings for exporting data classification
     * results.
     * </p>
     * 
     * @param getClassificationExportConfigurationRequest
     * @return getClassificationExportConfigurationResult The response from the
     *         GetClassificationExportConfiguration service method, as returned
     *         by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetClassificationExportConfigurationResult getClassificationExportConfiguration(
            GetClassificationExportConfigurationRequest getClassificationExportConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getClassificationExportConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClassificationExportConfigurationRequest> request = null;
        Response<GetClassificationExportConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClassificationExportConfigurationRequestMarshaller()
                        .marshall(getClassificationExportConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetClassificationExportConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetClassificationExportConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetClassificationExportConfigurationResult> responseHandler = new JsonResponseHandler<GetClassificationExportConfigurationResult>(
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
     * Retrieves information about the criteria and other settings for a custom
     * data identifier.
     * </p>
     * 
     * @param getCustomDataIdentifierRequest
     * @return getCustomDataIdentifierResult The response from the
     *         GetCustomDataIdentifier service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCustomDataIdentifierResult getCustomDataIdentifier(
            GetCustomDataIdentifierRequest getCustomDataIdentifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCustomDataIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCustomDataIdentifierRequest> request = null;
        Response<GetCustomDataIdentifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCustomDataIdentifierRequestMarshaller()
                        .marshall(getCustomDataIdentifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCustomDataIdentifierResult, JsonUnmarshallerContext> unmarshaller = new GetCustomDataIdentifierResultJsonUnmarshaller();
            JsonResponseHandler<GetCustomDataIdentifierResult> responseHandler = new JsonResponseHandler<GetCustomDataIdentifierResult>(
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
     * Retrieves (queries) aggregated statistical data about findings.
     * </p>
     * 
     * @param getFindingStatisticsRequest
     * @return getFindingStatisticsResult The response from the
     *         GetFindingStatistics service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFindingStatisticsResult getFindingStatistics(
            GetFindingStatisticsRequest getFindingStatisticsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFindingStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingStatisticsRequest> request = null;
        Response<GetFindingStatisticsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingStatisticsRequestMarshaller()
                        .marshall(getFindingStatisticsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFindingStatisticsResult, JsonUnmarshallerContext> unmarshaller = new GetFindingStatisticsResultJsonUnmarshaller();
            JsonResponseHandler<GetFindingStatisticsResult> responseHandler = new JsonResponseHandler<GetFindingStatisticsResult>(
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
     * Retrieves information about one or more findings.
     * </p>
     * 
     * @param getFindingsRequest
     * @return getFindingsResult The response from the GetFindings service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingsRequest> request = null;
        Response<GetFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingsRequestMarshaller().marshall(getFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFindingsResult, JsonUnmarshallerContext> unmarshaller = new GetFindingsResultJsonUnmarshaller();
            JsonResponseHandler<GetFindingsResult> responseHandler = new JsonResponseHandler<GetFindingsResult>(
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
     * Retrieves information about the criteria and other settings for a
     * findings filter.
     * </p>
     * 
     * @param getFindingsFilterRequest
     * @return getFindingsFilterResult The response from the GetFindingsFilter
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFindingsFilterResult getFindingsFilter(
            GetFindingsFilterRequest getFindingsFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFindingsFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingsFilterRequest> request = null;
        Response<GetFindingsFilterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingsFilterRequestMarshaller()
                        .marshall(getFindingsFilterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFindingsFilterResult, JsonUnmarshallerContext> unmarshaller = new GetFindingsFilterResultJsonUnmarshaller();
            JsonResponseHandler<GetFindingsFilterResult> responseHandler = new JsonResponseHandler<GetFindingsFilterResult>(
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
     * Retrieves the count of Amazon Macie membership invitations that were
     * received by an account.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return getInvitationsCountResult The response from the
     *         GetInvitationsCount service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInvitationsCountResult getInvitationsCount(
            GetInvitationsCountRequest getInvitationsCountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInvitationsCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInvitationsCountRequest> request = null;
        Response<GetInvitationsCountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInvitationsCountRequestMarshaller()
                        .marshall(getInvitationsCountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInvitationsCountResult, JsonUnmarshallerContext> unmarshaller = new GetInvitationsCountResultJsonUnmarshaller();
            JsonResponseHandler<GetInvitationsCountResult> responseHandler = new JsonResponseHandler<GetInvitationsCountResult>(
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
     * Retrieves information about the current status and configuration settings
     * for an Amazon Macie account.
     * </p>
     * 
     * @param getMacieSessionRequest
     * @return getMacieSessionResult The response from the GetMacieSession
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMacieSessionResult getMacieSession(GetMacieSessionRequest getMacieSessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMacieSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMacieSessionRequest> request = null;
        Response<GetMacieSessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMacieSessionRequestMarshaller().marshall(getMacieSessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMacieSessionResult, JsonUnmarshallerContext> unmarshaller = new GetMacieSessionResultJsonUnmarshaller();
            JsonResponseHandler<GetMacieSessionResult> responseHandler = new JsonResponseHandler<GetMacieSessionResult>(
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
     * Retrieves information about the Amazon Macie master account for an
     * account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return getMasterAccountResult The response from the GetMasterAccount
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMasterAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMasterAccountRequest> request = null;
        Response<GetMasterAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMasterAccountRequestMarshaller().marshall(getMasterAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMasterAccountResult, JsonUnmarshallerContext> unmarshaller = new GetMasterAccountResultJsonUnmarshaller();
            JsonResponseHandler<GetMasterAccountResult> responseHandler = new JsonResponseHandler<GetMasterAccountResult>(
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
     * Retrieves information about a member account that's associated with an
     * Amazon Macie master account.
     * </p>
     * 
     * @param getMemberRequest
     * @return getMemberResult The response from the GetMember service method,
     *         as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMemberResult getMember(GetMemberRequest getMemberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMemberRequest> request = null;
        Response<GetMemberResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMemberRequestMarshaller().marshall(getMemberRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMemberResult, JsonUnmarshallerContext> unmarshaller = new GetMemberResultJsonUnmarshaller();
            JsonResponseHandler<GetMemberResult> responseHandler = new JsonResponseHandler<GetMemberResult>(
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
     * Retrieves (queries) quotas and aggregated usage data for one or more
     * accounts.
     * </p>
     * 
     * @param getUsageStatisticsRequest
     * @return getUsageStatisticsResult The response from the GetUsageStatistics
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUsageStatisticsResult getUsageStatistics(
            GetUsageStatisticsRequest getUsageStatisticsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUsageStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsageStatisticsRequest> request = null;
        Response<GetUsageStatisticsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsageStatisticsRequestMarshaller()
                        .marshall(getUsageStatisticsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUsageStatisticsResult, JsonUnmarshallerContext> unmarshaller = new GetUsageStatisticsResultJsonUnmarshaller();
            JsonResponseHandler<GetUsageStatisticsResult> responseHandler = new JsonResponseHandler<GetUsageStatisticsResult>(
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
     * Retrieves (queries) aggregated usage data for an account.
     * </p>
     * 
     * @param getUsageTotalsRequest
     * @return getUsageTotalsResult The response from the GetUsageTotals service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUsageTotalsResult getUsageTotals(GetUsageTotalsRequest getUsageTotalsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUsageTotalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsageTotalsRequest> request = null;
        Response<GetUsageTotalsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsageTotalsRequestMarshaller().marshall(getUsageTotalsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUsageTotalsResult, JsonUnmarshallerContext> unmarshaller = new GetUsageTotalsResultJsonUnmarshaller();
            JsonResponseHandler<GetUsageTotalsResult> responseHandler = new JsonResponseHandler<GetUsageTotalsResult>(
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
     * Retrieves information about the status and settings for one or more
     * classification jobs.
     * </p>
     * 
     * @param listClassificationJobsRequest
     * @return listClassificationJobsResult The response from the
     *         ListClassificationJobs service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListClassificationJobsResult listClassificationJobs(
            ListClassificationJobsRequest listClassificationJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listClassificationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClassificationJobsRequest> request = null;
        Response<ListClassificationJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClassificationJobsRequestMarshaller()
                        .marshall(listClassificationJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListClassificationJobsResult, JsonUnmarshallerContext> unmarshaller = new ListClassificationJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListClassificationJobsResult> responseHandler = new JsonResponseHandler<ListClassificationJobsResult>(
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
     * Retrieves a subset of information about all the custom data identifiers
     * for an account.
     * </p>
     * 
     * @param listCustomDataIdentifiersRequest
     * @return listCustomDataIdentifiersResult The response from the
     *         ListCustomDataIdentifiers service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListCustomDataIdentifiersResult listCustomDataIdentifiers(
            ListCustomDataIdentifiersRequest listCustomDataIdentifiersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCustomDataIdentifiersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomDataIdentifiersRequest> request = null;
        Response<ListCustomDataIdentifiersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomDataIdentifiersRequestMarshaller()
                        .marshall(listCustomDataIdentifiersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCustomDataIdentifiersResult, JsonUnmarshallerContext> unmarshaller = new ListCustomDataIdentifiersResultJsonUnmarshaller();
            JsonResponseHandler<ListCustomDataIdentifiersResult> responseHandler = new JsonResponseHandler<ListCustomDataIdentifiersResult>(
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
     * Retrieves a subset of information about one or more findings.
     * </p>
     * 
     * @param listFindingsRequest
     * @return listFindingsResult The response from the ListFindings service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingsRequest> request = null;
        Response<ListFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingsRequestMarshaller().marshall(listFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListFindingsResult, JsonUnmarshallerContext> unmarshaller = new ListFindingsResultJsonUnmarshaller();
            JsonResponseHandler<ListFindingsResult> responseHandler = new JsonResponseHandler<ListFindingsResult>(
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
     * Retrieves a subset of information about all the findings filters for an
     * account.
     * </p>
     * 
     * @param listFindingsFiltersRequest
     * @return listFindingsFiltersResult The response from the
     *         ListFindingsFilters service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListFindingsFiltersResult listFindingsFilters(
            ListFindingsFiltersRequest listFindingsFiltersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFindingsFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingsFiltersRequest> request = null;
        Response<ListFindingsFiltersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingsFiltersRequestMarshaller()
                        .marshall(listFindingsFiltersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListFindingsFiltersResult, JsonUnmarshallerContext> unmarshaller = new ListFindingsFiltersResultJsonUnmarshaller();
            JsonResponseHandler<ListFindingsFiltersResult> responseHandler = new JsonResponseHandler<ListFindingsFiltersResult>(
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
     * Retrieves information about all the Amazon Macie membership invitations
     * that were received by an account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return listInvitationsResult The response from the ListInvitations
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInvitationsRequest> request = null;
        Response<ListInvitationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInvitationsRequestMarshaller().marshall(listInvitationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInvitationsResult, JsonUnmarshallerContext> unmarshaller = new ListInvitationsResultJsonUnmarshaller();
            JsonResponseHandler<ListInvitationsResult> responseHandler = new JsonResponseHandler<ListInvitationsResult>(
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
     * Retrieves information about the accounts that are associated with an
     * Amazon Macie master account.
     * </p>
     * 
     * @param listMembersRequest
     * @return listMembersResult The response from the ListMembers service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListMembersResult listMembers(ListMembersRequest listMembersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMembersRequest> request = null;
        Response<ListMembersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMembersRequestMarshaller().marshall(listMembersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMembersResult, JsonUnmarshallerContext> unmarshaller = new ListMembersResultJsonUnmarshaller();
            JsonResponseHandler<ListMembersResult> responseHandler = new JsonResponseHandler<ListMembersResult>(
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
     * Retrieves information about the account that's designated as the
     * delegated administrator of Amazon Macie for an AWS organization.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return listOrganizationAdminAccountsResult The response from the
     *         ListOrganizationAdminAccounts service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listOrganizationAdminAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationAdminAccountsRequest> request = null;
        Response<ListOrganizationAdminAccountsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationAdminAccountsRequestMarshaller()
                        .marshall(listOrganizationAdminAccountsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListOrganizationAdminAccountsResult, JsonUnmarshallerContext> unmarshaller = new ListOrganizationAdminAccountsResultJsonUnmarshaller();
            JsonResponseHandler<ListOrganizationAdminAccountsResult> responseHandler = new JsonResponseHandler<ListOrganizationAdminAccountsResult>(
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
     * Retrieves the tags (keys and values) that are associated with a
     * classification job, custom data identifier, findings filter, or member
     * account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Macie
     *         2.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
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
     * Creates or updates the configuration settings for exporting data
     * classification results.
     * </p>
     * 
     * @param putClassificationExportConfigurationRequest
     * @return putClassificationExportConfigurationResult The response from the
     *         PutClassificationExportConfiguration service method, as returned
     *         by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutClassificationExportConfigurationResult putClassificationExportConfiguration(
            PutClassificationExportConfigurationRequest putClassificationExportConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putClassificationExportConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutClassificationExportConfigurationRequest> request = null;
        Response<PutClassificationExportConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutClassificationExportConfigurationRequestMarshaller()
                        .marshall(putClassificationExportConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutClassificationExportConfigurationResult, JsonUnmarshallerContext> unmarshaller = new PutClassificationExportConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<PutClassificationExportConfigurationResult> responseHandler = new JsonResponseHandler<PutClassificationExportConfigurationResult>(
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
     * Adds or updates one or more tags (keys and values) that are associated
     * with a classification job, custom data identifier, findings filter, or
     * member account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Macie 2.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
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
     * Tests a custom data identifier.
     * </p>
     * 
     * @param testCustomDataIdentifierRequest
     * @return testCustomDataIdentifierResult The response from the
     *         TestCustomDataIdentifier service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TestCustomDataIdentifierResult testCustomDataIdentifier(
            TestCustomDataIdentifierRequest testCustomDataIdentifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(testCustomDataIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestCustomDataIdentifierRequest> request = null;
        Response<TestCustomDataIdentifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestCustomDataIdentifierRequestMarshaller()
                        .marshall(testCustomDataIdentifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TestCustomDataIdentifierResult, JsonUnmarshallerContext> unmarshaller = new TestCustomDataIdentifierResultJsonUnmarshaller();
            JsonResponseHandler<TestCustomDataIdentifierResult> responseHandler = new JsonResponseHandler<TestCustomDataIdentifierResult>(
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
     * Reactivates (unarchives) one or more findings.
     * </p>
     * 
     * @param unarchiveFindingsRequest
     * @return unarchiveFindingsResult The response from the UnarchiveFindings
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UnarchiveFindingsResult unarchiveFindings(
            UnarchiveFindingsRequest unarchiveFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(unarchiveFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnarchiveFindingsRequest> request = null;
        Response<UnarchiveFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnarchiveFindingsRequestMarshaller()
                        .marshall(unarchiveFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UnarchiveFindingsResult, JsonUnmarshallerContext> unmarshaller = new UnarchiveFindingsResultJsonUnmarshaller();
            JsonResponseHandler<UnarchiveFindingsResult> responseHandler = new JsonResponseHandler<UnarchiveFindingsResult>(
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
     * Removes one or more tags (keys and values) from a classification job,
     * custom data identifier, findings filter, or member account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Macie 2.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
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
     * Cancels a classification job.
     * </p>
     * 
     * @param updateClassificationJobRequest
     * @return updateClassificationJobResult The response from the
     *         UpdateClassificationJob service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateClassificationJobResult updateClassificationJob(
            UpdateClassificationJobRequest updateClassificationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClassificationJobRequest> request = null;
        Response<UpdateClassificationJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClassificationJobRequestMarshaller()
                        .marshall(updateClassificationJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateClassificationJobResult, JsonUnmarshallerContext> unmarshaller = new UpdateClassificationJobResultJsonUnmarshaller();
            JsonResponseHandler<UpdateClassificationJobResult> responseHandler = new JsonResponseHandler<UpdateClassificationJobResult>(
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
     * Updates the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param updateFindingsFilterRequest
     * @return updateFindingsFilterResult The response from the
     *         UpdateFindingsFilter service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateFindingsFilterResult updateFindingsFilter(
            UpdateFindingsFilterRequest updateFindingsFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateFindingsFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFindingsFilterRequest> request = null;
        Response<UpdateFindingsFilterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFindingsFilterRequestMarshaller()
                        .marshall(updateFindingsFilterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateFindingsFilterResult, JsonUnmarshallerContext> unmarshaller = new UpdateFindingsFilterResultJsonUnmarshaller();
            JsonResponseHandler<UpdateFindingsFilterResult> responseHandler = new JsonResponseHandler<UpdateFindingsFilterResult>(
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
     * Suspends or re-enables an Amazon Macie account, or updates the
     * configuration settings for a Macie account.
     * </p>
     * 
     * @param updateMacieSessionRequest
     * @return updateMacieSessionResult The response from the UpdateMacieSession
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateMacieSessionResult updateMacieSession(
            UpdateMacieSessionRequest updateMacieSessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMacieSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMacieSessionRequest> request = null;
        Response<UpdateMacieSessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMacieSessionRequestMarshaller()
                        .marshall(updateMacieSessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMacieSessionResult, JsonUnmarshallerContext> unmarshaller = new UpdateMacieSessionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMacieSessionResult> responseHandler = new JsonResponseHandler<UpdateMacieSessionResult>(
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
     * Enables an Amazon Macie master account to suspend or re-enable a member
     * account.
     * </p>
     * 
     * @param updateMemberSessionRequest
     * @return updateMemberSessionResult The response from the
     *         UpdateMemberSession service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateMemberSessionResult updateMemberSession(
            UpdateMemberSessionRequest updateMemberSessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMemberSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMemberSessionRequest> request = null;
        Response<UpdateMemberSessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMemberSessionRequestMarshaller()
                        .marshall(updateMemberSessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMemberSessionResult, JsonUnmarshallerContext> unmarshaller = new UpdateMemberSessionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMemberSessionResult> responseHandler = new JsonResponseHandler<UpdateMemberSessionResult>(
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
     * Updates Amazon Macie configuration settings for an AWS organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return updateOrganizationConfigurationResult The response from the
     *         UpdateOrganizationConfiguration service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateOrganizationConfigurationResult updateOrganizationConfiguration(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOrganizationConfigurationRequest> request = null;
        Response<UpdateOrganizationConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOrganizationConfigurationRequestMarshaller()
                        .marshall(updateOrganizationConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateOrganizationConfigurationResult, JsonUnmarshallerContext> unmarshaller = new UpdateOrganizationConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateOrganizationConfigurationResult> responseHandler = new JsonResponseHandler<UpdateOrganizationConfigurationResult>(
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
