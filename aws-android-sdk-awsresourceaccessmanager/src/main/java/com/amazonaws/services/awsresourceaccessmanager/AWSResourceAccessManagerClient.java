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

package com.amazonaws.services.awsresourceaccessmanager;

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

import com.amazonaws.services.awsresourceaccessmanager.model.*;
import com.amazonaws.services.awsresourceaccessmanager.model.transform.*;

/**
 * Client for accessing AWS Resource Access Manager. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Use AWS Resource Access Manager to share AWS resources between AWS accounts.
 * To share a resource, you create a resource share, associate the resource with
 * the resource share, and specify the principals that can access the resources
 * associated with the resource share. The following principals are supported:
 * AWS accounts, organizational units (OU) from AWS Organizations, and
 * organizations from AWS Organizations.
 * </p>
 * <p>
 * For more information, see the <a
 * href="https://docs.aws.amazon.com/ram/latest/userguide/">AWS Resource Access
 * Manager User Guide</a>.
 * </p>
 */
public class AWSResourceAccessManagerClient extends AmazonWebServiceClient implements
        AWSResourceAccessManager {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Resource Access Manager
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceAccessManager. A credentials provider chain will be used that
     * searches for credentials in this order:
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
    public AWSResourceAccessManagerClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceAccessManager. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *            how this client connects to AWSResourceAccessManager (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSResourceAccessManagerClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceAccessManager using the specified AWS account credentials.
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
     *         AWSResourceAccessManagerClient client = new AWSResourceAccessManagerClient(AWSMobileClient
     *                 .getInstance());
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
    public AWSResourceAccessManagerClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceAccessManager using the specified AWS account credentials and
     * client configuration options.
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
     *         AWSResourceAccessManagerClient client = new AWSResourceAccessManagerClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AWSResourceAccessManager (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSResourceAccessManagerClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceAccessManager using the specified AWS account credentials
     * provider.
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
     *         AWSResourceAccessManagerClient client = new AWSResourceAccessManagerClient(AWSMobileClient
     *                 .getInstance());
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
    public AWSResourceAccessManagerClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceAccessManager using the specified AWS account credentials
     * provider and client configuration options.
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
     *         AWSResourceAccessManagerClient client = new AWSResourceAccessManagerClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AWSResourceAccessManager (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSResourceAccessManagerClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceAccessManager using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSResourceAccessManager (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSResourceAccessManagerClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceAccessManager using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
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
     *         AWSResourceAccessManagerClient client = new AWSResourceAccessManagerClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AWSResourceAccessManager (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSResourceAccessManagerClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new IdempotentParameterMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidClientTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMaxResultsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidResourceTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidStateTransitionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MalformedArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MissingRequiredParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OperationNotPermittedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceArnNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new ResourceShareInvitationAlreadyAcceptedExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new ResourceShareInvitationAlreadyRejectedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceShareInvitationArnNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceShareInvitationExpiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceShareLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServerInternalExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagPolicyViolationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnknownResourceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("ram.us-east-1.amazonaws.com");
        this.endpointPrefix = "ram";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/awsresourceaccessmanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/awsresourceaccessmanager/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Accepts an invitation to a resource share from another AWS account.
     * </p>
     * 
     * @param acceptResourceShareInvitationRequest
     * @return acceptResourceShareInvitationResult The response from the
     *         AcceptResourceShareInvitation service method, as returned by AWS
     *         Resource Access Manager.
     * @throws MalformedArnException
     * @throws OperationNotPermittedException
     * @throws ResourceShareInvitationArnNotFoundException
     * @throws ResourceShareInvitationAlreadyAcceptedException
     * @throws ResourceShareInvitationAlreadyRejectedException
     * @throws ResourceShareInvitationExpiredException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws InvalidClientTokenException
     * @throws IdempotentParameterMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AcceptResourceShareInvitationResult acceptResourceShareInvitation(
            AcceptResourceShareInvitationRequest acceptResourceShareInvitationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(acceptResourceShareInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptResourceShareInvitationRequest> request = null;
        Response<AcceptResourceShareInvitationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptResourceShareInvitationRequestMarshaller()
                        .marshall(acceptResourceShareInvitationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AcceptResourceShareInvitationResult, JsonUnmarshallerContext> unmarshaller = new AcceptResourceShareInvitationResultJsonUnmarshaller();
            JsonResponseHandler<AcceptResourceShareInvitationResult> responseHandler = new JsonResponseHandler<AcceptResourceShareInvitationResult>(
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
     * Associates the specified resource share with the specified principals and
     * resources.
     * </p>
     * 
     * @param associateResourceShareRequest
     * @return associateResourceShareResult The response from the
     *         AssociateResourceShare service method, as returned by AWS
     *         Resource Access Manager.
     * @throws IdempotentParameterMismatchException
     * @throws UnknownResourceException
     * @throws InvalidStateTransitionException
     * @throws ResourceShareLimitExceededException
     * @throws MalformedArnException
     * @throws InvalidStateTransitionException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws UnknownResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AssociateResourceShareResult associateResourceShare(
            AssociateResourceShareRequest associateResourceShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResourceShareRequest> request = null;
        Response<AssociateResourceShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResourceShareRequestMarshaller()
                        .marshall(associateResourceShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateResourceShareResult, JsonUnmarshallerContext> unmarshaller = new AssociateResourceShareResultJsonUnmarshaller();
            JsonResponseHandler<AssociateResourceShareResult> responseHandler = new JsonResponseHandler<AssociateResourceShareResult>(
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
     * Associates a permission with a resource share.
     * </p>
     * 
     * @param associateResourceSharePermissionRequest
     * @return associateResourceSharePermissionResult The response from the
     *         AssociateResourceSharePermission service method, as returned by
     *         AWS Resource Access Manager.
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidParameterException
     * @throws InvalidClientTokenException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AssociateResourceSharePermissionResult associateResourceSharePermission(
            AssociateResourceSharePermissionRequest associateResourceSharePermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateResourceSharePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResourceSharePermissionRequest> request = null;
        Response<AssociateResourceSharePermissionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResourceSharePermissionRequestMarshaller()
                        .marshall(associateResourceSharePermissionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateResourceSharePermissionResult, JsonUnmarshallerContext> unmarshaller = new AssociateResourceSharePermissionResultJsonUnmarshaller();
            JsonResponseHandler<AssociateResourceSharePermissionResult> responseHandler = new JsonResponseHandler<AssociateResourceSharePermissionResult>(
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
     * Creates a resource share.
     * </p>
     * 
     * @param createResourceShareRequest
     * @return createResourceShareResult The response from the
     *         CreateResourceShare service method, as returned by AWS Resource
     *         Access Manager.
     * @throws IdempotentParameterMismatchException
     * @throws InvalidStateTransitionException
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ResourceShareLimitExceededException
     * @throws TagPolicyViolationException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateResourceShareResult createResourceShare(
            CreateResourceShareRequest createResourceShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceShareRequest> request = null;
        Response<CreateResourceShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceShareRequestMarshaller()
                        .marshall(createResourceShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateResourceShareResult, JsonUnmarshallerContext> unmarshaller = new CreateResourceShareResultJsonUnmarshaller();
            JsonResponseHandler<CreateResourceShareResult> responseHandler = new JsonResponseHandler<CreateResourceShareResult>(
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
     * Deletes the specified resource share.
     * </p>
     * 
     * @param deleteResourceShareRequest
     * @return deleteResourceShareResult The response from the
     *         DeleteResourceShare service method, as returned by AWS Resource
     *         Access Manager.
     * @throws OperationNotPermittedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidStateTransitionException
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteResourceShareResult deleteResourceShare(
            DeleteResourceShareRequest deleteResourceShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceShareRequest> request = null;
        Response<DeleteResourceShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceShareRequestMarshaller()
                        .marshall(deleteResourceShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteResourceShareResult, JsonUnmarshallerContext> unmarshaller = new DeleteResourceShareResultJsonUnmarshaller();
            JsonResponseHandler<DeleteResourceShareResult> responseHandler = new JsonResponseHandler<DeleteResourceShareResult>(
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
     * Disassociates the specified principals or resources from the specified
     * resource share.
     * </p>
     * 
     * @param disassociateResourceShareRequest
     * @return disassociateResourceShareResult The response from the
     *         DisassociateResourceShare service method, as returned by AWS
     *         Resource Access Manager.
     * @throws IdempotentParameterMismatchException
     * @throws ResourceShareLimitExceededException
     * @throws MalformedArnException
     * @throws InvalidStateTransitionException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws UnknownResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DisassociateResourceShareResult disassociateResourceShare(
            DisassociateResourceShareRequest disassociateResourceShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResourceShareRequest> request = null;
        Response<DisassociateResourceShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResourceShareRequestMarshaller()
                        .marshall(disassociateResourceShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateResourceShareResult, JsonUnmarshallerContext> unmarshaller = new DisassociateResourceShareResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateResourceShareResult> responseHandler = new JsonResponseHandler<DisassociateResourceShareResult>(
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
     * Disassociates an AWS RAM permission from a resource share.
     * </p>
     * 
     * @param disassociateResourceSharePermissionRequest
     * @return disassociateResourceSharePermissionResult The response from the
     *         DisassociateResourceSharePermission service method, as returned
     *         by AWS Resource Access Manager.
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidParameterException
     * @throws InvalidClientTokenException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DisassociateResourceSharePermissionResult disassociateResourceSharePermission(
            DisassociateResourceSharePermissionRequest disassociateResourceSharePermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateResourceSharePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResourceSharePermissionRequest> request = null;
        Response<DisassociateResourceSharePermissionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResourceSharePermissionRequestMarshaller()
                        .marshall(disassociateResourceSharePermissionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateResourceSharePermissionResult, JsonUnmarshallerContext> unmarshaller = new DisassociateResourceSharePermissionResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateResourceSharePermissionResult> responseHandler = new JsonResponseHandler<DisassociateResourceSharePermissionResult>(
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
     * Enables resource sharing within your AWS Organization.
     * </p>
     * <p>
     * The caller must be the master account for the AWS Organization.
     * </p>
     * 
     * @param enableSharingWithAwsOrganizationRequest
     * @return enableSharingWithAwsOrganizationResult The response from the
     *         EnableSharingWithAwsOrganization service method, as returned by
     *         AWS Resource Access Manager.
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public EnableSharingWithAwsOrganizationResult enableSharingWithAwsOrganization(
            EnableSharingWithAwsOrganizationRequest enableSharingWithAwsOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableSharingWithAwsOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSharingWithAwsOrganizationRequest> request = null;
        Response<EnableSharingWithAwsOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSharingWithAwsOrganizationRequestMarshaller()
                        .marshall(enableSharingWithAwsOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableSharingWithAwsOrganizationResult, JsonUnmarshallerContext> unmarshaller = new EnableSharingWithAwsOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<EnableSharingWithAwsOrganizationResult> responseHandler = new JsonResponseHandler<EnableSharingWithAwsOrganizationResult>(
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
     * Gets the contents of an AWS RAM permission in JSON format.
     * </p>
     * 
     * @param getPermissionRequest
     * @return getPermissionResult The response from the GetPermission service
     *         method, as returned by AWS Resource Access Manager.
     * @throws InvalidParameterException
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetPermissionResult getPermission(GetPermissionRequest getPermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPermissionRequest> request = null;
        Response<GetPermissionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPermissionRequestMarshaller().marshall(getPermissionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPermissionResult, JsonUnmarshallerContext> unmarshaller = new GetPermissionResultJsonUnmarshaller();
            JsonResponseHandler<GetPermissionResult> responseHandler = new JsonResponseHandler<GetPermissionResult>(
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
     * Gets the policies for the specified resources that you own and have
     * shared.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return getResourcePoliciesResult The response from the
     *         GetResourcePolicies service method, as returned by AWS Resource
     *         Access Manager.
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ResourceArnNotFoundException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetResourcePoliciesResult getResourcePolicies(
            GetResourcePoliciesRequest getResourcePoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourcePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePoliciesRequest> request = null;
        Response<GetResourcePoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePoliciesRequestMarshaller()
                        .marshall(getResourcePoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourcePoliciesResult, JsonUnmarshallerContext> unmarshaller = new GetResourcePoliciesResultJsonUnmarshaller();
            JsonResponseHandler<GetResourcePoliciesResult> responseHandler = new JsonResponseHandler<GetResourcePoliciesResult>(
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
     * Gets the resources or principals for the resource shares that you own.
     * </p>
     * 
     * @param getResourceShareAssociationsRequest
     * @return getResourceShareAssociationsResult The response from the
     *         GetResourceShareAssociations service method, as returned by AWS
     *         Resource Access Manager.
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetResourceShareAssociationsResult getResourceShareAssociations(
            GetResourceShareAssociationsRequest getResourceShareAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourceShareAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceShareAssociationsRequest> request = null;
        Response<GetResourceShareAssociationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceShareAssociationsRequestMarshaller()
                        .marshall(getResourceShareAssociationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourceShareAssociationsResult, JsonUnmarshallerContext> unmarshaller = new GetResourceShareAssociationsResultJsonUnmarshaller();
            JsonResponseHandler<GetResourceShareAssociationsResult> responseHandler = new JsonResponseHandler<GetResourceShareAssociationsResult>(
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
     * Gets the invitations for resource sharing that you've received.
     * </p>
     * 
     * @param getResourceShareInvitationsRequest
     * @return getResourceShareInvitationsResult The response from the
     *         GetResourceShareInvitations service method, as returned by AWS
     *         Resource Access Manager.
     * @throws ResourceShareInvitationArnNotFoundException
     * @throws InvalidMaxResultsException
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetResourceShareInvitationsResult getResourceShareInvitations(
            GetResourceShareInvitationsRequest getResourceShareInvitationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourceShareInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceShareInvitationsRequest> request = null;
        Response<GetResourceShareInvitationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceShareInvitationsRequestMarshaller()
                        .marshall(getResourceShareInvitationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourceShareInvitationsResult, JsonUnmarshallerContext> unmarshaller = new GetResourceShareInvitationsResultJsonUnmarshaller();
            JsonResponseHandler<GetResourceShareInvitationsResult> responseHandler = new JsonResponseHandler<GetResourceShareInvitationsResult>(
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
     * Gets the resource shares that you own or the resource shares that are
     * shared with you.
     * </p>
     * 
     * @param getResourceSharesRequest
     * @return getResourceSharesResult The response from the GetResourceShares
     *         service method, as returned by AWS Resource Access Manager.
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetResourceSharesResult getResourceShares(
            GetResourceSharesRequest getResourceSharesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourceSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceSharesRequest> request = null;
        Response<GetResourceSharesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceSharesRequestMarshaller()
                        .marshall(getResourceSharesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourceSharesResult, JsonUnmarshallerContext> unmarshaller = new GetResourceSharesResultJsonUnmarshaller();
            JsonResponseHandler<GetResourceSharesResult> responseHandler = new JsonResponseHandler<GetResourceSharesResult>(
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
     * Lists the resources in a resource share that is shared with you but that
     * the invitation is still pending for.
     * </p>
     * 
     * @param listPendingInvitationResourcesRequest
     * @return listPendingInvitationResourcesResult The response from the
     *         ListPendingInvitationResources service method, as returned by AWS
     *         Resource Access Manager.
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws ResourceShareInvitationArnNotFoundException
     * @throws MissingRequiredParameterException
     * @throws ResourceShareInvitationAlreadyRejectedException
     * @throws ResourceShareInvitationExpiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListPendingInvitationResourcesResult listPendingInvitationResources(
            ListPendingInvitationResourcesRequest listPendingInvitationResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPendingInvitationResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPendingInvitationResourcesRequest> request = null;
        Response<ListPendingInvitationResourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPendingInvitationResourcesRequestMarshaller()
                        .marshall(listPendingInvitationResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPendingInvitationResourcesResult, JsonUnmarshallerContext> unmarshaller = new ListPendingInvitationResourcesResultJsonUnmarshaller();
            JsonResponseHandler<ListPendingInvitationResourcesResult> responseHandler = new JsonResponseHandler<ListPendingInvitationResourcesResult>(
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
     * Lists the AWS RAM permissions.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return listPermissionsResult The response from the ListPermissions
     *         service method, as returned by AWS Resource Access Manager.
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListPermissionsResult listPermissions(ListPermissionsRequest listPermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionsRequest> request = null;
        Response<ListPermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionsRequestMarshaller().marshall(listPermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPermissionsResult, JsonUnmarshallerContext> unmarshaller = new ListPermissionsResultJsonUnmarshaller();
            JsonResponseHandler<ListPermissionsResult> responseHandler = new JsonResponseHandler<ListPermissionsResult>(
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
     * Lists the principals that you have shared resources with or that have
     * shared resources with you.
     * </p>
     * 
     * @param listPrincipalsRequest
     * @return listPrincipalsResult The response from the ListPrincipals service
     *         method, as returned by AWS Resource Access Manager.
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListPrincipalsResult listPrincipals(ListPrincipalsRequest listPrincipalsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPrincipalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalsRequest> request = null;
        Response<ListPrincipalsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalsRequestMarshaller().marshall(listPrincipalsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPrincipalsResult, JsonUnmarshallerContext> unmarshaller = new ListPrincipalsResultJsonUnmarshaller();
            JsonResponseHandler<ListPrincipalsResult> responseHandler = new JsonResponseHandler<ListPrincipalsResult>(
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
     * Lists the AWS RAM permissions that are associated with a resource share.
     * </p>
     * 
     * @param listResourceSharePermissionsRequest
     * @return listResourceSharePermissionsResult The response from the
     *         ListResourceSharePermissions service method, as returned by AWS
     *         Resource Access Manager.
     * @throws InvalidParameterException
     * @throws MalformedArnException
     * @throws UnknownResourceException
     * @throws InvalidNextTokenException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws OperationNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListResourceSharePermissionsResult listResourceSharePermissions(
            ListResourceSharePermissionsRequest listResourceSharePermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listResourceSharePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceSharePermissionsRequest> request = null;
        Response<ListResourceSharePermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceSharePermissionsRequestMarshaller()
                        .marshall(listResourceSharePermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListResourceSharePermissionsResult, JsonUnmarshallerContext> unmarshaller = new ListResourceSharePermissionsResultJsonUnmarshaller();
            JsonResponseHandler<ListResourceSharePermissionsResult> responseHandler = new JsonResponseHandler<ListResourceSharePermissionsResult>(
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
     * Lists the shareable resource types supported by AWS RAM.
     * </p>
     * 
     * @param listResourceTypesRequest
     * @return listResourceTypesResult The response from the ListResourceTypes
     *         service method, as returned by AWS Resource Access Manager.
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListResourceTypesResult listResourceTypes(
            ListResourceTypesRequest listResourceTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listResourceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceTypesRequest> request = null;
        Response<ListResourceTypesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceTypesRequestMarshaller()
                        .marshall(listResourceTypesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListResourceTypesResult, JsonUnmarshallerContext> unmarshaller = new ListResourceTypesResultJsonUnmarshaller();
            JsonResponseHandler<ListResourceTypesResult> responseHandler = new JsonResponseHandler<ListResourceTypesResult>(
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
     * Lists the resources that you added to a resource shares or the resources
     * that are shared with you.
     * </p>
     * 
     * @param listResourcesRequest
     * @return listResourcesResult The response from the ListResources service
     *         method, as returned by AWS Resource Access Manager.
     * @throws InvalidResourceTypeException
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidNextTokenException
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListResourcesResult listResources(ListResourcesRequest listResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesRequest> request = null;
        Response<ListResourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesRequestMarshaller().marshall(listResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListResourcesResult, JsonUnmarshallerContext> unmarshaller = new ListResourcesResultJsonUnmarshaller();
            JsonResponseHandler<ListResourcesResult> responseHandler = new JsonResponseHandler<ListResourcesResult>(
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
     * Resource shares that were created by attaching a policy to a resource are
     * visible only to the resource share owner, and the resource share cannot
     * be modified in AWS RAM.
     * </p>
     * <p>
     * Use this API action to promote the resource share. When you promote the
     * resource share, it becomes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Visible to all principals that it is shared with.
     * </p>
     * </li>
     * <li>
     * <p>
     * Modifiable in AWS RAM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param promoteResourceShareCreatedFromPolicyRequest
     * @return promoteResourceShareCreatedFromPolicyResult The response from the
     *         PromoteResourceShareCreatedFromPolicy service method, as returned
     *         by AWS Resource Access Manager.
     * @throws MalformedArnException
     * @throws OperationNotPermittedException
     * @throws InvalidParameterException
     * @throws MissingRequiredParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws UnknownResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PromoteResourceShareCreatedFromPolicyResult promoteResourceShareCreatedFromPolicy(
            PromoteResourceShareCreatedFromPolicyRequest promoteResourceShareCreatedFromPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(promoteResourceShareCreatedFromPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PromoteResourceShareCreatedFromPolicyRequest> request = null;
        Response<PromoteResourceShareCreatedFromPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PromoteResourceShareCreatedFromPolicyRequestMarshaller()
                        .marshall(promoteResourceShareCreatedFromPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PromoteResourceShareCreatedFromPolicyResult, JsonUnmarshallerContext> unmarshaller = new PromoteResourceShareCreatedFromPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PromoteResourceShareCreatedFromPolicyResult> responseHandler = new JsonResponseHandler<PromoteResourceShareCreatedFromPolicyResult>(
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
     * Rejects an invitation to a resource share from another AWS account.
     * </p>
     * 
     * @param rejectResourceShareInvitationRequest
     * @return rejectResourceShareInvitationResult The response from the
     *         RejectResourceShareInvitation service method, as returned by AWS
     *         Resource Access Manager.
     * @throws MalformedArnException
     * @throws OperationNotPermittedException
     * @throws ResourceShareInvitationArnNotFoundException
     * @throws ResourceShareInvitationAlreadyAcceptedException
     * @throws ResourceShareInvitationAlreadyRejectedException
     * @throws ResourceShareInvitationExpiredException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws InvalidClientTokenException
     * @throws IdempotentParameterMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public RejectResourceShareInvitationResult rejectResourceShareInvitation(
            RejectResourceShareInvitationRequest rejectResourceShareInvitationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rejectResourceShareInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectResourceShareInvitationRequest> request = null;
        Response<RejectResourceShareInvitationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectResourceShareInvitationRequestMarshaller()
                        .marshall(rejectResourceShareInvitationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RejectResourceShareInvitationResult, JsonUnmarshallerContext> unmarshaller = new RejectResourceShareInvitationResultJsonUnmarshaller();
            JsonResponseHandler<RejectResourceShareInvitationResult> responseHandler = new JsonResponseHandler<RejectResourceShareInvitationResult>(
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
     * Adds the specified tags to the specified resource share that you own.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Resource Access Manager.
     * @throws InvalidParameterException
     * @throws MalformedArnException
     * @throws TagLimitExceededException
     * @throws ResourceArnNotFoundException
     * @throws TagPolicyViolationException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Removes the specified tags from the specified resource share that you
     * own.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Resource Access Manager.
     * @throws InvalidParameterException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Updates the specified resource share that you own.
     * </p>
     * 
     * @param updateResourceShareRequest
     * @return updateResourceShareResult The response from the
     *         UpdateResourceShare service method, as returned by AWS Resource
     *         Access Manager.
     * @throws IdempotentParameterMismatchException
     * @throws MissingRequiredParameterException
     * @throws UnknownResourceException
     * @throws MalformedArnException
     * @throws InvalidClientTokenException
     * @throws InvalidParameterException
     * @throws OperationNotPermittedException
     * @throws ServerInternalException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Access Manager indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateResourceShareResult updateResourceShare(
            UpdateResourceShareRequest updateResourceShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceShareRequest> request = null;
        Response<UpdateResourceShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceShareRequestMarshaller()
                        .marshall(updateResourceShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateResourceShareResult, JsonUnmarshallerContext> unmarshaller = new UpdateResourceShareResultJsonUnmarshaller();
            JsonResponseHandler<UpdateResourceShareResult> responseHandler = new JsonResponseHandler<UpdateResourceShareResult>(
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
