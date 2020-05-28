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

package com.amazonaws.services.workmail;

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

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.services.workmail.model.transform.*;

/**
 * Client for accessing Amazon WorkMail. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon WorkMail is a secure, managed business email and calendaring service
 * with support for existing desktop and mobile email clients. You can access
 * your email, contacts, and calendars using Microsoft Outlook, your browser, or
 * other native iOS and Android email applications. You can integrate WorkMail
 * with your existing corporate directory and control both the keys that encrypt
 * your data and the location in which your data is stored.
 * </p>
 * <p>
 * The WorkMail API is designed for the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Listing and describing organizations
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing users
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing groups
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing resources
 * </p>
 * </li>
 * </ul>
 * <p>
 * All WorkMail API operations are Amazon-authenticated and certificate-signed.
 * They not only require the use of the AWS SDK, but also allow for the
 * exclusive use of AWS Identity and Access Management users and roles to help
 * facilitate access, trust, and permission policies. By creating a role and
 * allowing an IAM user to access the WorkMail site, the IAM user gains full
 * administrative visibility into the entire WorkMail organization (or as set in
 * the IAM policy). This includes, but is not limited to, the ability to create,
 * update, and delete users, groups, and resources. This allows developers to
 * perform the scenarios listed above, as well as give users the ability to
 * grant access on a selective basis using the IAM model.
 * </p>
 */
public class AmazonWorkMailClient extends AmazonWebServiceClient implements AmazonWorkMail {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon WorkMail exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonWorkMail. A
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
    public AmazonWorkMailClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkMail. A
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
     *            how this client connects to AmazonWorkMail (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonWorkMailClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkMail using
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
     *         AmazonWorkMailClient client = new AmazonWorkMailClient(AWSMobileClient.getInstance());
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
    public AmazonWorkMailClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkMail using
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
     *         AmazonWorkMailClient client = new AmazonWorkMailClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonWorkMail (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonWorkMailClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkMail using
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
     *         AmazonWorkMailClient client = new AmazonWorkMailClient(AWSMobileClient.getInstance());
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
    public AmazonWorkMailClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkMail using
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
     *         AmazonWorkMailClient client = new AmazonWorkMailClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonWorkMail (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonWorkMailClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkMail using
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
     *            how this client connects to AmazonWorkMail (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonWorkMailClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkMail using
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
     *         AmazonWorkMailClient client = new AmazonWorkMailClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonWorkMail (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonWorkMailClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new DirectoryServiceAuthenticationFailedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DirectoryUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EmailAddressInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EntityAlreadyRegisteredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EntityNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EntityStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidConfigurationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPasswordExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MailDomainNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MailDomainStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NameAvailabilityExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OrganizationNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OrganizationStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ReservedNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("workmail.us-east-1.amazonaws.com");
        this.endpointPrefix = "workmail";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/workmail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/workmail/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds a member (user or group) to the resource's set of delegates.
     * </p>
     * 
     * @param associateDelegateToResourceRequest
     * @return associateDelegateToResourceResult The response from the
     *         AssociateDelegateToResource service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateDelegateToResourceResult associateDelegateToResource(
            AssociateDelegateToResourceRequest associateDelegateToResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateDelegateToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDelegateToResourceRequest> request = null;
        Response<AssociateDelegateToResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDelegateToResourceRequestMarshaller()
                        .marshall(associateDelegateToResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateDelegateToResourceResult, JsonUnmarshallerContext> unmarshaller = new AssociateDelegateToResourceResultJsonUnmarshaller();
            JsonResponseHandler<AssociateDelegateToResourceResult> responseHandler = new JsonResponseHandler<AssociateDelegateToResourceResult>(
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
     * Adds a member (user or group) to the group's set.
     * </p>
     * 
     * @param associateMemberToGroupRequest
     * @return associateMemberToGroupResult The response from the
     *         AssociateMemberToGroup service method, as returned by Amazon
     *         WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateMemberToGroupResult associateMemberToGroup(
            AssociateMemberToGroupRequest associateMemberToGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateMemberToGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateMemberToGroupRequest> request = null;
        Response<AssociateMemberToGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateMemberToGroupRequestMarshaller()
                        .marshall(associateMemberToGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateMemberToGroupResult, JsonUnmarshallerContext> unmarshaller = new AssociateMemberToGroupResultJsonUnmarshaller();
            JsonResponseHandler<AssociateMemberToGroupResult> responseHandler = new JsonResponseHandler<AssociateMemberToGroupResult>(
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
     * Adds an alias to the set of a given member (user or group) of Amazon
     * WorkMail.
     * </p>
     * 
     * @param createAliasRequest
     * @return createAliasResult The response from the CreateAlias service
     *         method, as returned by Amazon WorkMail.
     * @throws EmailAddressInUseException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws MailDomainNotFoundException
     * @throws MailDomainStateException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateAliasResult createAlias(CreateAliasRequest createAliasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller().marshall(createAliasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAliasResult, JsonUnmarshallerContext> unmarshaller = new CreateAliasResultJsonUnmarshaller();
            JsonResponseHandler<CreateAliasResult> responseHandler = new JsonResponseHandler<CreateAliasResult>(
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
     * Creates a group that can be used in Amazon WorkMail by calling the
     * <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createGroupRequest
     * @return createGroupResult The response from the CreateGroup service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws InvalidParameterException
     * @throws NameAvailabilityException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws ReservedNameException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestMarshaller().marshall(createGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateGroupResult> responseHandler = new JsonResponseHandler<CreateGroupResult>(
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
     * Creates a new Amazon WorkMail resource.
     * </p>
     * 
     * @param createResourceRequest
     * @return createResourceResult The response from the CreateResource service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws InvalidParameterException
     * @throws NameAvailabilityException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws ReservedNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateResourceResult createResource(CreateResourceRequest createResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceRequest> request = null;
        Response<CreateResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceRequestMarshaller().marshall(createResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateResourceResult, JsonUnmarshallerContext> unmarshaller = new CreateResourceResultJsonUnmarshaller();
            JsonResponseHandler<CreateResourceResult> responseHandler = new JsonResponseHandler<CreateResourceResult>(
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
     * Creates a user who can be used in Amazon WorkMail by calling the
     * <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws InvalidParameterException
     * @throws InvalidPasswordException
     * @throws NameAvailabilityException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws ReservedNameException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateUserResult createUser(CreateUserRequest createUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestMarshaller().marshall(createUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserResult, JsonUnmarshallerContext> unmarshaller = new CreateUserResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserResult> responseHandler = new JsonResponseHandler<CreateUserResult>(
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
     * Deletes an access control rule for the specified WorkMail organization.
     * </p>
     * 
     * @param deleteAccessControlRuleRequest
     * @return deleteAccessControlRuleResult The response from the
     *         DeleteAccessControlRule service method, as returned by Amazon
     *         WorkMail.
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteAccessControlRuleResult deleteAccessControlRule(
            DeleteAccessControlRuleRequest deleteAccessControlRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAccessControlRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessControlRuleRequest> request = null;
        Response<DeleteAccessControlRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessControlRuleRequestMarshaller()
                        .marshall(deleteAccessControlRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAccessControlRuleResult, JsonUnmarshallerContext> unmarshaller = new DeleteAccessControlRuleResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAccessControlRuleResult> responseHandler = new JsonResponseHandler<DeleteAccessControlRuleResult>(
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
     * Remove one or more specified aliases from a set of aliases for a given
     * user.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return deleteAliasResult The response from the DeleteAlias service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteAliasResult deleteAlias(DeleteAliasRequest deleteAliasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        Response<DeleteAliasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestMarshaller().marshall(deleteAliasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAliasResult, JsonUnmarshallerContext> unmarshaller = new DeleteAliasResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAliasResult> responseHandler = new JsonResponseHandler<DeleteAliasResult>(
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
     * Deletes a group from Amazon WorkMail.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return deleteGroupResult The response from the DeleteGroup service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestMarshaller().marshall(deleteGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGroupResult> responseHandler = new JsonResponseHandler<DeleteGroupResult>(
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
     * Deletes permissions granted to a member (user or group).
     * </p>
     * 
     * @param deleteMailboxPermissionsRequest
     * @return deleteMailboxPermissionsResult The response from the
     *         DeleteMailboxPermissions service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteMailboxPermissionsResult deleteMailboxPermissions(
            DeleteMailboxPermissionsRequest deleteMailboxPermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMailboxPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMailboxPermissionsRequest> request = null;
        Response<DeleteMailboxPermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMailboxPermissionsRequestMarshaller()
                        .marshall(deleteMailboxPermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteMailboxPermissionsResult, JsonUnmarshallerContext> unmarshaller = new DeleteMailboxPermissionsResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMailboxPermissionsResult> responseHandler = new JsonResponseHandler<DeleteMailboxPermissionsResult>(
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
     * Deletes the specified resource.
     * </p>
     * 
     * @param deleteResourceRequest
     * @return deleteResourceResult The response from the DeleteResource service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteResourceResult deleteResource(DeleteResourceRequest deleteResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceRequest> request = null;
        Response<DeleteResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceRequestMarshaller().marshall(deleteResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteResourceResult, JsonUnmarshallerContext> unmarshaller = new DeleteResourceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteResourceResult> responseHandler = new JsonResponseHandler<DeleteResourceResult>(
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
     * Deletes the specified retention policy from the specified organization.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @return deleteRetentionPolicyResult The response from the
     *         DeleteRetentionPolicy service method, as returned by Amazon
     *         WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRetentionPolicyResult deleteRetentionPolicy(
            DeleteRetentionPolicyRequest deleteRetentionPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRetentionPolicyRequest> request = null;
        Response<DeleteRetentionPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRetentionPolicyRequestMarshaller()
                        .marshall(deleteRetentionPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRetentionPolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteRetentionPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRetentionPolicyResult> responseHandler = new JsonResponseHandler<DeleteRetentionPolicyResult>(
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
     * Deletes a user from Amazon WorkMail and all subsequent systems. Before
     * you can delete a user, the user state must be <code>DISABLED</code>. Use
     * the <a>DescribeUser</a> action to confirm the user state.
     * </p>
     * <p>
     * Deleting a user is permanent and cannot be undone. WorkMail archives user
     * mailboxes for 30 days before they are permanently removed.
     * </p>
     * 
     * @param deleteUserRequest
     * @return deleteUserResult The response from the DeleteUser service method,
     *         as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller().marshall(deleteUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteUserResult, JsonUnmarshallerContext> unmarshaller = new DeleteUserResultJsonUnmarshaller();
            JsonResponseHandler<DeleteUserResult> responseHandler = new JsonResponseHandler<DeleteUserResult>(
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
     * Mark a user, group, or resource as no longer used in Amazon WorkMail.
     * This action disassociates the mailbox and schedules it for clean-up.
     * WorkMail keeps mailboxes for 30 days before they are permanently removed.
     * The functionality in the console is <i>Disable</i>.
     * </p>
     * 
     * @param deregisterFromWorkMailRequest
     * @return deregisterFromWorkMailResult The response from the
     *         DeregisterFromWorkMail service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeregisterFromWorkMailResult deregisterFromWorkMail(
            DeregisterFromWorkMailRequest deregisterFromWorkMailRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterFromWorkMailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterFromWorkMailRequest> request = null;
        Response<DeregisterFromWorkMailResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterFromWorkMailRequestMarshaller()
                        .marshall(deregisterFromWorkMailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeregisterFromWorkMailResult, JsonUnmarshallerContext> unmarshaller = new DeregisterFromWorkMailResultJsonUnmarshaller();
            JsonResponseHandler<DeregisterFromWorkMailResult> responseHandler = new JsonResponseHandler<DeregisterFromWorkMailResult>(
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
     * Returns the data available for the group.
     * </p>
     * 
     * @param describeGroupRequest
     * @return describeGroupResult The response from the DescribeGroup service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeGroupResult describeGroup(DescribeGroupRequest describeGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGroupRequest> request = null;
        Response<DescribeGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGroupRequestMarshaller().marshall(describeGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeGroupResult, JsonUnmarshallerContext> unmarshaller = new DescribeGroupResultJsonUnmarshaller();
            JsonResponseHandler<DescribeGroupResult> responseHandler = new JsonResponseHandler<DescribeGroupResult>(
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
     * Provides more information regarding a given organization based on its
     * identifier.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @return describeOrganizationResult The response from the
     *         DescribeOrganization service method, as returned by Amazon
     *         WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeOrganizationResult describeOrganization(
            DescribeOrganizationRequest describeOrganizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationRequest> request = null;
        Response<DescribeOrganizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationRequestMarshaller()
                        .marshall(describeOrganizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeOrganizationResult, JsonUnmarshallerContext> unmarshaller = new DescribeOrganizationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeOrganizationResult> responseHandler = new JsonResponseHandler<DescribeOrganizationResult>(
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
     * Returns the data available for the resource.
     * </p>
     * 
     * @param describeResourceRequest
     * @return describeResourceResult The response from the DescribeResource
     *         service method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeResourceResult describeResource(DescribeResourceRequest describeResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceRequest> request = null;
        Response<DescribeResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceRequestMarshaller().marshall(describeResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeResourceResult, JsonUnmarshallerContext> unmarshaller = new DescribeResourceResultJsonUnmarshaller();
            JsonResponseHandler<DescribeResourceResult> responseHandler = new JsonResponseHandler<DescribeResourceResult>(
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
     * Provides information regarding the user.
     * </p>
     * 
     * @param describeUserRequest
     * @return describeUserResult The response from the DescribeUser service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeUserResult describeUser(DescribeUserRequest describeUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserRequest> request = null;
        Response<DescribeUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserRequestMarshaller().marshall(describeUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserResult> responseHandler = new JsonResponseHandler<DescribeUserResult>(
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
     * Removes a member from the resource's set of delegates.
     * </p>
     * 
     * @param disassociateDelegateFromResourceRequest
     * @return disassociateDelegateFromResourceResult The response from the
     *         DisassociateDelegateFromResource service method, as returned by
     *         Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateDelegateFromResourceResult disassociateDelegateFromResource(
            DisassociateDelegateFromResourceRequest disassociateDelegateFromResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateDelegateFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDelegateFromResourceRequest> request = null;
        Response<DisassociateDelegateFromResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDelegateFromResourceRequestMarshaller()
                        .marshall(disassociateDelegateFromResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateDelegateFromResourceResult, JsonUnmarshallerContext> unmarshaller = new DisassociateDelegateFromResourceResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateDelegateFromResourceResult> responseHandler = new JsonResponseHandler<DisassociateDelegateFromResourceResult>(
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
     * Removes a member from a group.
     * </p>
     * 
     * @param disassociateMemberFromGroupRequest
     * @return disassociateMemberFromGroupResult The response from the
     *         DisassociateMemberFromGroup service method, as returned by Amazon
     *         WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateMemberFromGroupResult disassociateMemberFromGroup(
            DisassociateMemberFromGroupRequest disassociateMemberFromGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateMemberFromGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberFromGroupRequest> request = null;
        Response<DisassociateMemberFromGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberFromGroupRequestMarshaller()
                        .marshall(disassociateMemberFromGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateMemberFromGroupResult, JsonUnmarshallerContext> unmarshaller = new DisassociateMemberFromGroupResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateMemberFromGroupResult> responseHandler = new JsonResponseHandler<DisassociateMemberFromGroupResult>(
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
     * Gets the effects of an organization's access control rules as they apply
     * to a specified IPv4 address, access protocol action, or user ID.
     * </p>
     * 
     * @param getAccessControlEffectRequest
     * @return getAccessControlEffectResult The response from the
     *         GetAccessControlEffect service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAccessControlEffectResult getAccessControlEffect(
            GetAccessControlEffectRequest getAccessControlEffectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAccessControlEffectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessControlEffectRequest> request = null;
        Response<GetAccessControlEffectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessControlEffectRequestMarshaller()
                        .marshall(getAccessControlEffectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAccessControlEffectResult, JsonUnmarshallerContext> unmarshaller = new GetAccessControlEffectResultJsonUnmarshaller();
            JsonResponseHandler<GetAccessControlEffectResult> responseHandler = new JsonResponseHandler<GetAccessControlEffectResult>(
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
     * Gets the default retention policy details for the specified organization.
     * </p>
     * 
     * @param getDefaultRetentionPolicyRequest
     * @return getDefaultRetentionPolicyResult The response from the
     *         GetDefaultRetentionPolicy service method, as returned by Amazon
     *         WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDefaultRetentionPolicyResult getDefaultRetentionPolicy(
            GetDefaultRetentionPolicyRequest getDefaultRetentionPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDefaultRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDefaultRetentionPolicyRequest> request = null;
        Response<GetDefaultRetentionPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDefaultRetentionPolicyRequestMarshaller()
                        .marshall(getDefaultRetentionPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDefaultRetentionPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetDefaultRetentionPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetDefaultRetentionPolicyResult> responseHandler = new JsonResponseHandler<GetDefaultRetentionPolicyResult>(
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
     * Requests a user's mailbox details for a specified organization and user.
     * </p>
     * 
     * @param getMailboxDetailsRequest
     * @return getMailboxDetailsResult The response from the GetMailboxDetails
     *         service method, as returned by Amazon WorkMail.
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMailboxDetailsResult getMailboxDetails(
            GetMailboxDetailsRequest getMailboxDetailsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMailboxDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMailboxDetailsRequest> request = null;
        Response<GetMailboxDetailsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMailboxDetailsRequestMarshaller()
                        .marshall(getMailboxDetailsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMailboxDetailsResult, JsonUnmarshallerContext> unmarshaller = new GetMailboxDetailsResultJsonUnmarshaller();
            JsonResponseHandler<GetMailboxDetailsResult> responseHandler = new JsonResponseHandler<GetMailboxDetailsResult>(
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
     * Lists the access control rules for the specified organization.
     * </p>
     * 
     * @param listAccessControlRulesRequest
     * @return listAccessControlRulesResult The response from the
     *         ListAccessControlRules service method, as returned by Amazon
     *         WorkMail.
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAccessControlRulesResult listAccessControlRules(
            ListAccessControlRulesRequest listAccessControlRulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAccessControlRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessControlRulesRequest> request = null;
        Response<ListAccessControlRulesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessControlRulesRequestMarshaller()
                        .marshall(listAccessControlRulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAccessControlRulesResult, JsonUnmarshallerContext> unmarshaller = new ListAccessControlRulesResultJsonUnmarshaller();
            JsonResponseHandler<ListAccessControlRulesResult> responseHandler = new JsonResponseHandler<ListAccessControlRulesResult>(
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
     * Creates a paginated call to list the aliases associated with a given
     * entity.
     * </p>
     * 
     * @param listAliasesRequest
     * @return listAliasesResult The response from the ListAliases service
     *         method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestMarshaller().marshall(listAliasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAliasesResult, JsonUnmarshallerContext> unmarshaller = new ListAliasesResultJsonUnmarshaller();
            JsonResponseHandler<ListAliasesResult> responseHandler = new JsonResponseHandler<ListAliasesResult>(
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
     * Returns an overview of the members of a group. Users and groups can be
     * members of a group.
     * </p>
     * 
     * @param listGroupMembersRequest
     * @return listGroupMembersResult The response from the ListGroupMembers
     *         service method, as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListGroupMembersResult listGroupMembers(ListGroupMembersRequest listGroupMembersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGroupMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupMembersRequest> request = null;
        Response<ListGroupMembersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupMembersRequestMarshaller().marshall(listGroupMembersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGroupMembersResult, JsonUnmarshallerContext> unmarshaller = new ListGroupMembersResultJsonUnmarshaller();
            JsonResponseHandler<ListGroupMembersResult> responseHandler = new JsonResponseHandler<ListGroupMembersResult>(
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
     * Returns summaries of the organization's groups.
     * </p>
     * 
     * @param listGroupsRequest
     * @return listGroupsResult The response from the ListGroups service method,
     *         as returned by Amazon WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestMarshaller().marshall(listGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListGroupsResult> responseHandler = new JsonResponseHandler<ListGroupsResult>(
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
     * Lists the mailbox permissions associated with a user, group, or resource
     * mailbox.
     * </p>
     * 
     * @param listMailboxPermissionsRequest
     * @return listMailboxPermissionsResult The response from the
     *         ListMailboxPermissions service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListMailboxPermissionsResult listMailboxPermissions(
            ListMailboxPermissionsRequest listMailboxPermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMailboxPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMailboxPermissionsRequest> request = null;
        Response<ListMailboxPermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMailboxPermissionsRequestMarshaller()
                        .marshall(listMailboxPermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMailboxPermissionsResult, JsonUnmarshallerContext> unmarshaller = new ListMailboxPermissionsResultJsonUnmarshaller();
            JsonResponseHandler<ListMailboxPermissionsResult> responseHandler = new JsonResponseHandler<ListMailboxPermissionsResult>(
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
     * Returns summaries of the customer's organizations.
     * </p>
     * 
     * @param listOrganizationsRequest
     * @return listOrganizationsResult The response from the ListOrganizations
     *         service method, as returned by Amazon WorkMail.
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListOrganizationsResult listOrganizations(
            ListOrganizationsRequest listOrganizationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listOrganizationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationsRequest> request = null;
        Response<ListOrganizationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationsRequestMarshaller()
                        .marshall(listOrganizationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListOrganizationsResult, JsonUnmarshallerContext> unmarshaller = new ListOrganizationsResultJsonUnmarshaller();
            JsonResponseHandler<ListOrganizationsResult> responseHandler = new JsonResponseHandler<ListOrganizationsResult>(
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
     * Lists the delegates associated with a resource. Users and groups can be
     * resource delegates and answer requests on behalf of the resource.
     * </p>
     * 
     * @param listResourceDelegatesRequest
     * @return listResourceDelegatesResult The response from the
     *         ListResourceDelegates service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListResourceDelegatesResult listResourceDelegates(
            ListResourceDelegatesRequest listResourceDelegatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listResourceDelegatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceDelegatesRequest> request = null;
        Response<ListResourceDelegatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceDelegatesRequestMarshaller()
                        .marshall(listResourceDelegatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListResourceDelegatesResult, JsonUnmarshallerContext> unmarshaller = new ListResourceDelegatesResultJsonUnmarshaller();
            JsonResponseHandler<ListResourceDelegatesResult> responseHandler = new JsonResponseHandler<ListResourceDelegatesResult>(
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
     * Returns summaries of the organization's resources.
     * </p>
     * 
     * @param listResourcesRequest
     * @return listResourcesResult The response from the ListResources service
     *         method, as returned by Amazon WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Lists the tags applied to an Amazon WorkMail organization resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         WorkMail.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
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
     * Returns summaries of the organization's users.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestMarshaller().marshall(listUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUsersResult, JsonUnmarshallerContext> unmarshaller = new ListUsersResultJsonUnmarshaller();
            JsonResponseHandler<ListUsersResult> responseHandler = new JsonResponseHandler<ListUsersResult>(
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
     * Adds a new access control rule for the specified organization. The rule
     * allows or denies access to the organization for the specified IPv4
     * addresses, access protocol actions, and user IDs. Adding a new rule with
     * the same name as an existing rule replaces the older rule.
     * </p>
     * 
     * @param putAccessControlRuleRequest
     * @return putAccessControlRuleResult The response from the
     *         PutAccessControlRule service method, as returned by Amazon
     *         WorkMail.
     * @throws LimitExceededException
     * @throws InvalidParameterException
     * @throws EntityNotFoundException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutAccessControlRuleResult putAccessControlRule(
            PutAccessControlRuleRequest putAccessControlRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putAccessControlRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccessControlRuleRequest> request = null;
        Response<PutAccessControlRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccessControlRuleRequestMarshaller()
                        .marshall(putAccessControlRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutAccessControlRuleResult, JsonUnmarshallerContext> unmarshaller = new PutAccessControlRuleResultJsonUnmarshaller();
            JsonResponseHandler<PutAccessControlRuleResult> responseHandler = new JsonResponseHandler<PutAccessControlRuleResult>(
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
     * Sets permissions for a user, group, or resource. This replaces any
     * pre-existing permissions.
     * </p>
     * 
     * @param putMailboxPermissionsRequest
     * @return putMailboxPermissionsResult The response from the
     *         PutMailboxPermissions service method, as returned by Amazon
     *         WorkMail.
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutMailboxPermissionsResult putMailboxPermissions(
            PutMailboxPermissionsRequest putMailboxPermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putMailboxPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMailboxPermissionsRequest> request = null;
        Response<PutMailboxPermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMailboxPermissionsRequestMarshaller()
                        .marshall(putMailboxPermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutMailboxPermissionsResult, JsonUnmarshallerContext> unmarshaller = new PutMailboxPermissionsResultJsonUnmarshaller();
            JsonResponseHandler<PutMailboxPermissionsResult> responseHandler = new JsonResponseHandler<PutMailboxPermissionsResult>(
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
     * Puts a retention policy to the specified organization.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @return putRetentionPolicyResult The response from the PutRetentionPolicy
     *         service method, as returned by Amazon WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutRetentionPolicyResult putRetentionPolicy(
            PutRetentionPolicyRequest putRetentionPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRetentionPolicyRequest> request = null;
        Response<PutRetentionPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRetentionPolicyRequestMarshaller()
                        .marshall(putRetentionPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutRetentionPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutRetentionPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutRetentionPolicyResult> responseHandler = new JsonResponseHandler<PutRetentionPolicyResult>(
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
     * Registers an existing and disabled user, group, or resource for Amazon
     * WorkMail use by associating a mailbox and calendaring capabilities. It
     * performs no change if the user, group, or resource is enabled and fails
     * if the user, group, or resource is deleted. This operation results in the
     * accumulation of costs. For more information, see <a
     * href="https://aws.amazon.com/workmail/pricing">Pricing</a>. The
     * equivalent console functionality for this operation is <i>Enable</i>.
     * </p>
     * <p>
     * Users can either be created by calling the <a>CreateUser</a> API
     * operation or they can be synchronized from your directory. For more
     * information, see <a>DeregisterFromWorkMail</a>.
     * </p>
     * 
     * @param registerToWorkMailRequest
     * @return registerToWorkMailResult The response from the RegisterToWorkMail
     *         service method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EmailAddressInUseException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws EntityAlreadyRegisteredException
     * @throws InvalidParameterException
     * @throws MailDomainNotFoundException
     * @throws MailDomainStateException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RegisterToWorkMailResult registerToWorkMail(
            RegisterToWorkMailRequest registerToWorkMailRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerToWorkMailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterToWorkMailRequest> request = null;
        Response<RegisterToWorkMailResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterToWorkMailRequestMarshaller()
                        .marshall(registerToWorkMailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterToWorkMailResult, JsonUnmarshallerContext> unmarshaller = new RegisterToWorkMailResultJsonUnmarshaller();
            JsonResponseHandler<RegisterToWorkMailResult> responseHandler = new JsonResponseHandler<RegisterToWorkMailResult>(
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
     * Allows the administrator to reset the password for a user.
     * </p>
     * 
     * @param resetPasswordRequest
     * @return resetPasswordResult The response from the ResetPassword service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws InvalidPasswordException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ResetPasswordResult resetPassword(ResetPasswordRequest resetPasswordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resetPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetPasswordRequest> request = null;
        Response<ResetPasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetPasswordRequestMarshaller().marshall(resetPasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResetPasswordResult, JsonUnmarshallerContext> unmarshaller = new ResetPasswordResultJsonUnmarshaller();
            JsonResponseHandler<ResetPasswordResult> responseHandler = new JsonResponseHandler<ResetPasswordResult>(
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
     * Applies the specified tags to the specified Amazon WorkMail organization
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon WorkMail.
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
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
     * Untags the specified tags from the specified Amazon WorkMail organization
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon WorkMail.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
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
     * Updates a user's current mailbox quota for a specified organization and
     * user.
     * </p>
     * 
     * @param updateMailboxQuotaRequest
     * @return updateMailboxQuotaResult The response from the UpdateMailboxQuota
     *         service method, as returned by Amazon WorkMail.
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateMailboxQuotaResult updateMailboxQuota(
            UpdateMailboxQuotaRequest updateMailboxQuotaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMailboxQuotaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMailboxQuotaRequest> request = null;
        Response<UpdateMailboxQuotaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMailboxQuotaRequestMarshaller()
                        .marshall(updateMailboxQuotaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMailboxQuotaResult, JsonUnmarshallerContext> unmarshaller = new UpdateMailboxQuotaResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMailboxQuotaResult> responseHandler = new JsonResponseHandler<UpdateMailboxQuotaResult>(
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
     * Updates the primary email for a user, group, or resource. The current
     * email is moved into the list of aliases (or swapped between an existing
     * alias and the current primary email), and the email provided in the input
     * is promoted as the primary.
     * </p>
     * 
     * @param updatePrimaryEmailAddressRequest
     * @return updatePrimaryEmailAddressResult The response from the
     *         UpdatePrimaryEmailAddress service method, as returned by Amazon
     *         WorkMail.
     * @throws DirectoryServiceAuthenticationFailedException
     * @throws DirectoryUnavailableException
     * @throws EmailAddressInUseException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidParameterException
     * @throws MailDomainNotFoundException
     * @throws MailDomainStateException
     * @throws InvalidParameterException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdatePrimaryEmailAddressResult updatePrimaryEmailAddress(
            UpdatePrimaryEmailAddressRequest updatePrimaryEmailAddressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePrimaryEmailAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePrimaryEmailAddressRequest> request = null;
        Response<UpdatePrimaryEmailAddressResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePrimaryEmailAddressRequestMarshaller()
                        .marshall(updatePrimaryEmailAddressRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePrimaryEmailAddressResult, JsonUnmarshallerContext> unmarshaller = new UpdatePrimaryEmailAddressResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePrimaryEmailAddressResult> responseHandler = new JsonResponseHandler<UpdatePrimaryEmailAddressResult>(
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
     * Updates data for the resource. To have the latest information, it must be
     * preceded by a <a>DescribeResource</a> call. The dataset in the request
     * should be the one expected when performing another
     * <code>DescribeResource</code> call.
     * </p>
     * 
     * @param updateResourceRequest
     * @return updateResourceResult The response from the UpdateResource service
     *         method, as returned by Amazon WorkMail.
     * @throws DirectoryUnavailableException
     * @throws EntityNotFoundException
     * @throws EntityStateException
     * @throws InvalidConfigurationException
     * @throws EmailAddressInUseException
     * @throws MailDomainNotFoundException
     * @throws MailDomainStateException
     * @throws NameAvailabilityException
     * @throws OrganizationNotFoundException
     * @throws OrganizationStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkMail indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateResourceResult updateResource(UpdateResourceRequest updateResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceRequest> request = null;
        Response<UpdateResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceRequestMarshaller().marshall(updateResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateResourceResult, JsonUnmarshallerContext> unmarshaller = new UpdateResourceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateResourceResult> responseHandler = new JsonResponseHandler<UpdateResourceResult>(
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
