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

package com.amazonaws.services.awsmigrationhub;

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

import com.amazonaws.services.awsmigrationhub.model.*;
import com.amazonaws.services.awsmigrationhub.model.transform.*;

/**
 * Client for accessing AWS Migration Hub. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * The AWS Migration Hub API methods help to obtain server and application
 * migration status and integrate your resource-specific migration tool by
 * providing a programmatic interface to Migration Hub.
 * </p>
 * <p>
 * Remember that you must set your AWS Migration Hub home region before you call
 * any of these APIs, or a <code>HomeRegionNotSetException</code> error will be
 * returned. Also, you must make the API calls while in your home region.
 * </p>
 */
public class AWSMigrationHubClient extends AmazonWebServiceClient implements AWSMigrationHub {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Migration Hub exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSMigrationHub. A
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
    public AWSMigrationHubClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSMigrationHub. A
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
     *            how this client connects to AWSMigrationHub (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSMigrationHubClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSMigrationHub
     * using the specified AWS account credentials.
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
     *         AWSMigrationHubClient client = new AWSMigrationHubClient(AWSMobileClient.getInstance());
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
    public AWSMigrationHubClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSMigrationHub
     * using the specified AWS account credentials and client configuration
     * options.
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
     *         AWSMigrationHubClient client = new AWSMigrationHubClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSMigrationHub (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSMigrationHubClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSMigrationHub
     * using the specified AWS account credentials provider.
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
     *         AWSMigrationHubClient client = new AWSMigrationHubClient(AWSMobileClient.getInstance());
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
    public AWSMigrationHubClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSMigrationHub
     * using the specified AWS account credentials provider and client
     * configuration options.
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
     *         AWSMigrationHubClient client = new AWSMigrationHubClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSMigrationHub (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSMigrationHubClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSMigrationHub
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSMigrationHub (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSMigrationHubClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSMigrationHub
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
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
     *         AWSMigrationHubClient client = new AWSMigrationHubClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSMigrationHub (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSMigrationHubClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DryRunOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new HomeRegionNotSetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PolicyErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("mgh.us-east-1.amazonaws.com");
        this.endpointPrefix = "mgh";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/awsmigrationhub/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/awsmigrationhub/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Associates a created artifact of an AWS cloud resource, the target
     * receiving the migration, with the migration task performed by a migration
     * tool. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Migration tools can call the <code>AssociateCreatedArtifact</code>
     * operation to indicate which AWS artifact is associated with a migration
     * task.
     * </p>
     * </li>
     * <li>
     * <p>
     * The created artifact name must be provided in ARN (Amazon Resource Name)
     * format which will contain information about type and region; for example:
     * <code>arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples of the AWS resource behind the created artifact are, AMI's, EC2
     * instance, or DMS endpoint, etc.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateCreatedArtifactRequest
     * @return associateCreatedArtifactResult The response from the
     *         AssociateCreatedArtifact service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AssociateCreatedArtifactResult associateCreatedArtifact(
            AssociateCreatedArtifactRequest associateCreatedArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateCreatedArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateCreatedArtifactRequest> request = null;
        Response<AssociateCreatedArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateCreatedArtifactRequestMarshaller()
                        .marshall(associateCreatedArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateCreatedArtifactResult, JsonUnmarshallerContext> unmarshaller = new AssociateCreatedArtifactResultJsonUnmarshaller();
            JsonResponseHandler<AssociateCreatedArtifactResult> responseHandler = new JsonResponseHandler<AssociateCreatedArtifactResult>(
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
     * Associates a discovered resource ID from Application Discovery Service
     * with a migration task.
     * </p>
     * 
     * @param associateDiscoveredResourceRequest
     * @return associateDiscoveredResourceResult The response from the
     *         AssociateDiscoveredResource service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws PolicyErrorException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AssociateDiscoveredResourceResult associateDiscoveredResource(
            AssociateDiscoveredResourceRequest associateDiscoveredResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateDiscoveredResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDiscoveredResourceRequest> request = null;
        Response<AssociateDiscoveredResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDiscoveredResourceRequestMarshaller()
                        .marshall(associateDiscoveredResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateDiscoveredResourceResult, JsonUnmarshallerContext> unmarshaller = new AssociateDiscoveredResourceResultJsonUnmarshaller();
            JsonResponseHandler<AssociateDiscoveredResourceResult> responseHandler = new JsonResponseHandler<AssociateDiscoveredResourceResult>(
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
     * Creates a progress update stream which is an AWS resource used for access
     * control as well as a namespace for migration task names that is
     * implicitly linked to your AWS account. It must uniquely identify the
     * migration tool as it is used for all updates made by the tool; however,
     * it does not need to be unique for each AWS account because it is scoped
     * to the AWS account.
     * </p>
     * 
     * @param createProgressUpdateStreamRequest
     * @return createProgressUpdateStreamResult The response from the
     *         CreateProgressUpdateStream service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateProgressUpdateStreamResult createProgressUpdateStream(
            CreateProgressUpdateStreamRequest createProgressUpdateStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProgressUpdateStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProgressUpdateStreamRequest> request = null;
        Response<CreateProgressUpdateStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProgressUpdateStreamRequestMarshaller()
                        .marshall(createProgressUpdateStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProgressUpdateStreamResult, JsonUnmarshallerContext> unmarshaller = new CreateProgressUpdateStreamResultJsonUnmarshaller();
            JsonResponseHandler<CreateProgressUpdateStreamResult> responseHandler = new JsonResponseHandler<CreateProgressUpdateStreamResult>(
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
     * Deletes a progress update stream, including all of its tasks, which was
     * previously created as an AWS resource used for access control. This API
     * has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The only parameter needed for <code>DeleteProgressUpdateStream</code> is
     * the stream name (same as a <code>CreateProgressUpdateStream</code> call).
     * </p>
     * </li>
     * <li>
     * <p>
     * The call will return, and a background process will asynchronously delete
     * the stream and all of its resources (tasks, associated resources,
     * resource attributes, created artifacts).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the stream takes time to be deleted, it might still show up on a
     * <code>ListProgressUpdateStreams</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateProgressUpdateStream</code>, <code>ImportMigrationTask</code>, <code>NotifyMigrationTaskState</code>, and all Associate[*] APIs
     * related to the tasks belonging to the stream will throw
     * "InvalidInputException" if the stream of the same name is in the process
     * of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once the stream and all of its resources are deleted,
     * <code>CreateProgressUpdateStream</code> for a stream of the same name
     * will succeed, and that stream will be an entirely new logical resource
     * (without any resources associated with the old stream).
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteProgressUpdateStreamRequest
     * @return deleteProgressUpdateStreamResult The response from the
     *         DeleteProgressUpdateStream service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteProgressUpdateStreamResult deleteProgressUpdateStream(
            DeleteProgressUpdateStreamRequest deleteProgressUpdateStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProgressUpdateStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProgressUpdateStreamRequest> request = null;
        Response<DeleteProgressUpdateStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProgressUpdateStreamRequestMarshaller()
                        .marshall(deleteProgressUpdateStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProgressUpdateStreamResult, JsonUnmarshallerContext> unmarshaller = new DeleteProgressUpdateStreamResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProgressUpdateStreamResult> responseHandler = new JsonResponseHandler<DeleteProgressUpdateStreamResult>(
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
     * Gets the migration status of an application.
     * </p>
     * 
     * @param describeApplicationStateRequest
     * @return describeApplicationStateResult The response from the
     *         DescribeApplicationState service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws PolicyErrorException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeApplicationStateResult describeApplicationState(
            DescribeApplicationStateRequest describeApplicationStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeApplicationStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationStateRequest> request = null;
        Response<DescribeApplicationStateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationStateRequestMarshaller()
                        .marshall(describeApplicationStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeApplicationStateResult, JsonUnmarshallerContext> unmarshaller = new DescribeApplicationStateResultJsonUnmarshaller();
            JsonResponseHandler<DescribeApplicationStateResult> responseHandler = new JsonResponseHandler<DescribeApplicationStateResult>(
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
     * Retrieves a list of all attributes associated with a specific migration
     * task.
     * </p>
     * 
     * @param describeMigrationTaskRequest
     * @return describeMigrationTaskResult The response from the
     *         DescribeMigrationTask service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeMigrationTaskResult describeMigrationTask(
            DescribeMigrationTaskRequest describeMigrationTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMigrationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMigrationTaskRequest> request = null;
        Response<DescribeMigrationTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMigrationTaskRequestMarshaller()
                        .marshall(describeMigrationTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMigrationTaskResult, JsonUnmarshallerContext> unmarshaller = new DescribeMigrationTaskResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMigrationTaskResult> responseHandler = new JsonResponseHandler<DescribeMigrationTaskResult>(
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
     * Disassociates a created artifact of an AWS resource with a migration task
     * performed by a migration tool that was previously associated. This API
     * has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A migration user can call the <code>DisassociateCreatedArtifacts</code>
     * operation to disassociate a created AWS Artifact from a migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * The created artifact name must be provided in ARN (Amazon Resource Name)
     * format which will contain information about type and region; for example:
     * <code>arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples of the AWS resource behind the created artifact are, AMI's, EC2
     * instance, or RDS instance, etc.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateCreatedArtifactRequest
     * @return disassociateCreatedArtifactResult The response from the
     *         DisassociateCreatedArtifact service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisassociateCreatedArtifactResult disassociateCreatedArtifact(
            DisassociateCreatedArtifactRequest disassociateCreatedArtifactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateCreatedArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateCreatedArtifactRequest> request = null;
        Response<DisassociateCreatedArtifactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateCreatedArtifactRequestMarshaller()
                        .marshall(disassociateCreatedArtifactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateCreatedArtifactResult, JsonUnmarshallerContext> unmarshaller = new DisassociateCreatedArtifactResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateCreatedArtifactResult> responseHandler = new JsonResponseHandler<DisassociateCreatedArtifactResult>(
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
     * Disassociate an Application Discovery Service discovered resource from a
     * migration task.
     * </p>
     * 
     * @param disassociateDiscoveredResourceRequest
     * @return disassociateDiscoveredResourceResult The response from the
     *         DisassociateDiscoveredResource service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisassociateDiscoveredResourceResult disassociateDiscoveredResource(
            DisassociateDiscoveredResourceRequest disassociateDiscoveredResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateDiscoveredResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDiscoveredResourceRequest> request = null;
        Response<DisassociateDiscoveredResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDiscoveredResourceRequestMarshaller()
                        .marshall(disassociateDiscoveredResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateDiscoveredResourceResult, JsonUnmarshallerContext> unmarshaller = new DisassociateDiscoveredResourceResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateDiscoveredResourceResult> responseHandler = new JsonResponseHandler<DisassociateDiscoveredResourceResult>(
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
     * Registers a new migration task which represents a server, database, etc.,
     * being migrated to AWS by a migration tool.
     * </p>
     * <p>
     * This API is a prerequisite to calling the
     * <code>NotifyMigrationTaskState</code> API as the migration tool must
     * first register the migration task with Migration Hub.
     * </p>
     * 
     * @param importMigrationTaskRequest
     * @return importMigrationTaskResult The response from the
     *         ImportMigrationTask service method, as returned by AWS Migration
     *         Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ImportMigrationTaskResult importMigrationTask(
            ImportMigrationTaskRequest importMigrationTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importMigrationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportMigrationTaskRequest> request = null;
        Response<ImportMigrationTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportMigrationTaskRequestMarshaller()
                        .marshall(importMigrationTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportMigrationTaskResult, JsonUnmarshallerContext> unmarshaller = new ImportMigrationTaskResultJsonUnmarshaller();
            JsonResponseHandler<ImportMigrationTaskResult> responseHandler = new JsonResponseHandler<ImportMigrationTaskResult>(
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
     * Lists all the migration statuses for your applications. If you use the
     * optional <code>ApplicationIds</code> parameter, only the migration
     * statuses for those applications will be returned.
     * </p>
     * 
     * @param listApplicationStatesRequest
     * @return listApplicationStatesResult The response from the
     *         ListApplicationStates service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListApplicationStatesResult listApplicationStates(
            ListApplicationStatesRequest listApplicationStatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listApplicationStatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationStatesRequest> request = null;
        Response<ListApplicationStatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationStatesRequestMarshaller()
                        .marshall(listApplicationStatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListApplicationStatesResult, JsonUnmarshallerContext> unmarshaller = new ListApplicationStatesResultJsonUnmarshaller();
            JsonResponseHandler<ListApplicationStatesResult> responseHandler = new JsonResponseHandler<ListApplicationStatesResult>(
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
     * Lists the created artifacts attached to a given migration task in an
     * update stream. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Gets the list of the created artifacts while migration is taking place.
     * </p>
     * </li>
     * <li>
     * <p>
     * Shows the artifacts created by the migration tool that was associated by
     * the <code>AssociateCreatedArtifact</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists created artifacts in a paginated interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listCreatedArtifactsRequest
     * @return listCreatedArtifactsResult The response from the
     *         ListCreatedArtifacts service method, as returned by AWS Migration
     *         Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListCreatedArtifactsResult listCreatedArtifacts(
            ListCreatedArtifactsRequest listCreatedArtifactsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCreatedArtifactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCreatedArtifactsRequest> request = null;
        Response<ListCreatedArtifactsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCreatedArtifactsRequestMarshaller()
                        .marshall(listCreatedArtifactsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCreatedArtifactsResult, JsonUnmarshallerContext> unmarshaller = new ListCreatedArtifactsResultJsonUnmarshaller();
            JsonResponseHandler<ListCreatedArtifactsResult> responseHandler = new JsonResponseHandler<ListCreatedArtifactsResult>(
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
     * Lists discovered resources associated with the given
     * <code>MigrationTask</code>.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return listDiscoveredResourcesResult The response from the
     *         ListDiscoveredResources service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListDiscoveredResourcesResult listDiscoveredResources(
            ListDiscoveredResourcesRequest listDiscoveredResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDiscoveredResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDiscoveredResourcesRequest> request = null;
        Response<ListDiscoveredResourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDiscoveredResourcesRequestMarshaller()
                        .marshall(listDiscoveredResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDiscoveredResourcesResult, JsonUnmarshallerContext> unmarshaller = new ListDiscoveredResourcesResultJsonUnmarshaller();
            JsonResponseHandler<ListDiscoveredResourcesResult> responseHandler = new JsonResponseHandler<ListDiscoveredResourcesResult>(
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
     * Lists all, or filtered by resource name, migration tasks associated with
     * the user account making this call. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can show a summary list of the most recent migration tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can show a summary list of migration tasks associated with a given
     * discovered resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists migration tasks in a paginated interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listMigrationTasksRequest
     * @return listMigrationTasksResult The response from the ListMigrationTasks
     *         service method, as returned by AWS Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws PolicyErrorException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListMigrationTasksResult listMigrationTasks(
            ListMigrationTasksRequest listMigrationTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMigrationTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMigrationTasksRequest> request = null;
        Response<ListMigrationTasksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMigrationTasksRequestMarshaller()
                        .marshall(listMigrationTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMigrationTasksResult, JsonUnmarshallerContext> unmarshaller = new ListMigrationTasksResultJsonUnmarshaller();
            JsonResponseHandler<ListMigrationTasksResult> responseHandler = new JsonResponseHandler<ListMigrationTasksResult>(
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
     * Lists progress update streams associated with the user account making
     * this call.
     * </p>
     * 
     * @param listProgressUpdateStreamsRequest
     * @return listProgressUpdateStreamsResult The response from the
     *         ListProgressUpdateStreams service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws InvalidInputException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListProgressUpdateStreamsResult listProgressUpdateStreams(
            ListProgressUpdateStreamsRequest listProgressUpdateStreamsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProgressUpdateStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProgressUpdateStreamsRequest> request = null;
        Response<ListProgressUpdateStreamsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProgressUpdateStreamsRequestMarshaller()
                        .marshall(listProgressUpdateStreamsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProgressUpdateStreamsResult, JsonUnmarshallerContext> unmarshaller = new ListProgressUpdateStreamsResultJsonUnmarshaller();
            JsonResponseHandler<ListProgressUpdateStreamsResult> responseHandler = new JsonResponseHandler<ListProgressUpdateStreamsResult>(
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
     * Sets the migration state of an application. For a given application
     * identified by the value passed to <code>ApplicationId</code>, its status
     * is set or updated by passing one of three values to <code>Status</code>:
     * <code>NOT_STARTED | IN_PROGRESS | COMPLETED</code>.
     * </p>
     * 
     * @param notifyApplicationStateRequest
     * @return notifyApplicationStateResult The response from the
     *         NotifyApplicationState service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws PolicyErrorException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public NotifyApplicationStateResult notifyApplicationState(
            NotifyApplicationStateRequest notifyApplicationStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(notifyApplicationStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<NotifyApplicationStateRequest> request = null;
        Response<NotifyApplicationStateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new NotifyApplicationStateRequestMarshaller()
                        .marshall(notifyApplicationStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<NotifyApplicationStateResult, JsonUnmarshallerContext> unmarshaller = new NotifyApplicationStateResultJsonUnmarshaller();
            JsonResponseHandler<NotifyApplicationStateResult> responseHandler = new JsonResponseHandler<NotifyApplicationStateResult>(
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
     * Notifies Migration Hub of the current status, progress, or other detail
     * regarding a migration task. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Migration tools will call the <code>NotifyMigrationTaskState</code> API
     * to share the latest progress and status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MigrationTaskName</code> is used for addressing updates to the
     * correct target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProgressUpdateStream</code> is used for access control and to
     * provide a namespace for each migration tool.
     * </p>
     * </li>
     * </ul>
     * 
     * @param notifyMigrationTaskStateRequest
     * @return notifyMigrationTaskStateResult The response from the
     *         NotifyMigrationTaskState service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public NotifyMigrationTaskStateResult notifyMigrationTaskState(
            NotifyMigrationTaskStateRequest notifyMigrationTaskStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(notifyMigrationTaskStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<NotifyMigrationTaskStateRequest> request = null;
        Response<NotifyMigrationTaskStateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new NotifyMigrationTaskStateRequestMarshaller()
                        .marshall(notifyMigrationTaskStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<NotifyMigrationTaskStateResult, JsonUnmarshallerContext> unmarshaller = new NotifyMigrationTaskStateResultJsonUnmarshaller();
            JsonResponseHandler<NotifyMigrationTaskStateResult> responseHandler = new JsonResponseHandler<NotifyMigrationTaskStateResult>(
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
     * Provides identifying details of the resource being migrated so that it
     * can be associated in the Application Discovery Service repository. This
     * association occurs asynchronously after
     * <code>PutResourceAttributes</code> returns.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * Keep in mind that subsequent calls to PutResourceAttributes will override
     * previously stored attributes. For example, if it is first called with a
     * MAC address, but later, it is desired to <i>add</i> an IP address, it
     * will then be required to call it with <i>both</i> the IP and MAC
     * addresses to prevent overriding the MAC address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Note the instructions regarding the special use case of the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#migrationhub-PutResourceAttributes-request-ResourceAttributeList"
     * > <code>ResourceAttributeList</code> </a> parameter when specifying any
     * "VM" related value.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * Because this is an asynchronous call, it will always return 200, whether
     * an association occurs or not. To confirm if an association was found
     * based on the provided details, call <code>ListDiscoveredResources</code>.
     * </p>
     * </note>
     * 
     * @param putResourceAttributesRequest
     * @return putResourceAttributesResult The response from the
     *         PutResourceAttributes service method, as returned by AWS
     *         Migration Hub.
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableException
     * @throws DryRunOperationException
     * @throws UnauthorizedOperationException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws HomeRegionNotSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Migration Hub indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutResourceAttributesResult putResourceAttributes(
            PutResourceAttributesRequest putResourceAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putResourceAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourceAttributesRequest> request = null;
        Response<PutResourceAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourceAttributesRequestMarshaller()
                        .marshall(putResourceAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutResourceAttributesResult, JsonUnmarshallerContext> unmarshaller = new PutResourceAttributesResultJsonUnmarshaller();
            JsonResponseHandler<PutResourceAttributesResult> responseHandler = new JsonResponseHandler<PutResourceAttributesResult>(
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
