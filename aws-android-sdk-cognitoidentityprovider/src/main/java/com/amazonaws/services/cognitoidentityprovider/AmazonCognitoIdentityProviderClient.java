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

package com.amazonaws.services.cognitoidentityprovider;

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

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.services.cognitoidentityprovider.model.transform.*;

/**
 * Client for accessing Amazon Cognito Your User Pool. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Using the Amazon Cognito Your User Pools API, you can create a user pool to
 * manage directories and users. You can authenticate a user to obtain tokens
 * related to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon Cognito
 * Your User Pools.
 * </p>
 * <p>
 * For more information, see the Amazon Cognito Documentation.
 * </p>
 */
public class AmazonCognitoIdentityProviderClient extends AmazonWebServiceClient implements
        AmazonCognitoIdentityProvider {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Cognito Your User Pool
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider. A credentials provider chain will be used
     * that searches for credentials in this order:
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
    public AmazonCognitoIdentityProviderClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *            how this client connects to AmazonCognitoIdentityProvider (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonCognitoIdentityProviderClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account
     * credentials.
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
    public AmazonCognitoIdentityProviderClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials
     * and client configuration options.
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
     *            how this client connects to AmazonCognitoIdentityProvider (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonCognitoIdentityProviderClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials
     * provider.
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
    public AmazonCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials
     * provider and client configuration options.
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
     *            how this client connects to AmazonCognitoIdentityProvider (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonCognitoIdentityProvider (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonCognitoIdentityProvider (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AliasExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CodeDeliveryFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CodeMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EnableSoftwareTokenMFAExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ExpiredCodeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidEmailRoleAccessPolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidLambdaResponseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPasswordExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSmsRoleAccessPolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSmsRoleTrustRelationshipExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidUserPoolConfigurationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MFAMethodNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotAuthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PasswordResetRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PreconditionNotMetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SoftwareTokenMFANotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyFailedAttemptsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnexpectedLambdaExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedUserStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UserImportInProgressExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UserLambdaValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UserNotConfirmedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UserNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UsernameExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cognito-idp.us-east-1.amazonaws.com");
        this.endpointPrefix = "cognito-idp";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cognitoidentityprovider/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cognitoidentityprovider/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds additional user attributes to the user pool schema.
     * </p>
     * 
     * @param addCustomAttributesRequest <p>
     *            Represents the request to add custom attributes.
     *            </p>
     * @return addCustomAttributesResult The response from the
     *         AddCustomAttributes service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserImportInProgressException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AddCustomAttributesResult addCustomAttributes(
            AddCustomAttributesRequest addCustomAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addCustomAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCustomAttributesRequest> request = null;
        Response<AddCustomAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCustomAttributesRequestMarshaller()
                        .marshall(addCustomAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddCustomAttributesResult, JsonUnmarshallerContext> unmarshaller = new AddCustomAttributesResultJsonUnmarshaller();
            JsonResponseHandler<AddCustomAttributesResult> responseHandler = new JsonResponseHandler<AddCustomAttributesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation code.
     * Works on any user.
     * </p>
     * 
     * @param adminConfirmSignUpRequest <p>
     *            Represents the request to confirm user registration.
     *            </p>
     * @return adminConfirmSignUpResult The response from the AdminConfirmSignUp
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws TooManyFailedAttemptsException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AdminConfirmSignUpResult adminConfirmSignUp(
            AdminConfirmSignUpRequest adminConfirmSignUpRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminConfirmSignUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminConfirmSignUpRequest> request = null;
        Response<AdminConfirmSignUpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminConfirmSignUpRequestMarshaller()
                        .marshall(adminConfirmSignUpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminConfirmSignUpResult, JsonUnmarshallerContext> unmarshaller = new AdminConfirmSignUpResultJsonUnmarshaller();
            JsonResponseHandler<AdminConfirmSignUpResult> responseHandler = new JsonResponseHandler<AdminConfirmSignUpResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new user in the specified user pool and sends a welcome message
     * via email or phone (SMS). This message is based on a template that you
     * configured in your call to CreateUserPool or UpdateUserPool. This
     * template includes your custom sign-up instructions and placeholders for
     * user name and temporary password.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminCreateUserRequest <p>
     *            Represents the request to create a user in the specified user
     *            pool.
     *            </p>
     * @return adminCreateUserResult The response from the AdminCreateUser
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UserNotFoundException
     * @throws UsernameExistsException
     * @throws InvalidPasswordException
     * @throws CodeDeliveryFailureException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws PreconditionNotMetException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UnsupportedUserStateException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AdminCreateUserResult adminCreateUser(AdminCreateUserRequest adminCreateUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminCreateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminCreateUserRequest> request = null;
        Response<AdminCreateUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminCreateUserRequestMarshaller().marshall(adminCreateUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminCreateUserResult, JsonUnmarshallerContext> unmarshaller = new AdminCreateUserResultJsonUnmarshaller();
            JsonResponseHandler<AdminCreateUserResult> responseHandler = new JsonResponseHandler<AdminCreateUserResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Forgets the device, as an administrator.
     * </p>
     * 
     * @param adminForgetDeviceRequest <p>
     *            Sends the forgot device request, as an administrator.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void adminForgetDevice(AdminForgetDeviceRequest adminForgetDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminForgetDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminForgetDeviceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminForgetDeviceRequestMarshaller()
                        .marshall(adminForgetDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the device, as an administrator.
     * </p>
     * 
     * @param adminGetDeviceRequest <p>
     *            Represents the request to get the device, as an administrator.
     *            </p>
     * @return adminGetDeviceResult The response from the AdminGetDevice service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AdminGetDeviceResult adminGetDevice(AdminGetDeviceRequest adminGetDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminGetDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminGetDeviceRequest> request = null;
        Response<AdminGetDeviceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminGetDeviceRequestMarshaller().marshall(adminGetDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminGetDeviceResult, JsonUnmarshallerContext> unmarshaller = new AdminGetDeviceResultJsonUnmarshaller();
            JsonResponseHandler<AdminGetDeviceResult> responseHandler = new JsonResponseHandler<AdminGetDeviceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Initiates the authentication flow, as an administrator.
     * </p>
     * 
     * @param adminInitiateAuthRequest <p>
     *            Initiates the authorization request, as an administrator.
     *            </p>
     * @return adminInitiateAuthResult The response from the AdminInitiateAuth
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws UnexpectedLambdaException
     * @throws InvalidUserPoolConfigurationException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws MFAMethodNotFoundException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AdminInitiateAuthResult adminInitiateAuth(
            AdminInitiateAuthRequest adminInitiateAuthRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminInitiateAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminInitiateAuthRequest> request = null;
        Response<AdminInitiateAuthResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminInitiateAuthRequestMarshaller()
                        .marshall(adminInitiateAuthRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminInitiateAuthResult, JsonUnmarshallerContext> unmarshaller = new AdminInitiateAuthResultJsonUnmarshaller();
            JsonResponseHandler<AdminInitiateAuthResult> responseHandler = new JsonResponseHandler<AdminInitiateAuthResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists devices, as an administrator.
     * </p>
     * 
     * @param adminListDevicesRequest <p>
     *            Represents the request to list devices, as an administrator.
     *            </p>
     * @return adminListDevicesResult The response from the AdminListDevices
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AdminListDevicesResult adminListDevices(AdminListDevicesRequest adminListDevicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminListDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminListDevicesRequest> request = null;
        Response<AdminListDevicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminListDevicesRequestMarshaller().marshall(adminListDevicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminListDevicesResult, JsonUnmarshallerContext> unmarshaller = new AdminListDevicesResultJsonUnmarshaller();
            JsonResponseHandler<AdminListDevicesResult> responseHandler = new JsonResponseHandler<AdminListDevicesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Responds to an authentication challenge, as an administrator.
     * </p>
     * 
     * @param adminRespondToAuthChallengeRequest <p>
     *            The request to respond to the authentication challenge, as an
     *            administrator.
     *            </p>
     * @return adminRespondToAuthChallengeResult The response from the
     *         AdminRespondToAuthChallenge service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws UnexpectedLambdaException
     * @throws InvalidPasswordException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws InvalidUserPoolConfigurationException
     * @throws InternalErrorException
     * @throws MFAMethodNotFoundException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws AliasExistsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AdminRespondToAuthChallengeResult adminRespondToAuthChallenge(
            AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminRespondToAuthChallengeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminRespondToAuthChallengeRequest> request = null;
        Response<AdminRespondToAuthChallengeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminRespondToAuthChallengeRequestMarshaller()
                        .marshall(adminRespondToAuthChallengeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminRespondToAuthChallengeResult, JsonUnmarshallerContext> unmarshaller = new AdminRespondToAuthChallengeResultJsonUnmarshaller();
            JsonResponseHandler<AdminRespondToAuthChallengeResult> responseHandler = new JsonResponseHandler<AdminRespondToAuthChallengeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets all the user settings for a specified user name. Works on any user.
     * </p>
     * 
     * @param adminSetUserSettingsRequest <p>
     *            Represents the request to set user settings as an
     *            administrator.
     *            </p>
     * @return adminSetUserSettingsResult The response from the
     *         AdminSetUserSettings service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AdminSetUserSettingsResult adminSetUserSettings(
            AdminSetUserSettingsRequest adminSetUserSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminSetUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminSetUserSettingsRequest> request = null;
        Response<AdminSetUserSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminSetUserSettingsRequestMarshaller()
                        .marshall(adminSetUserSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminSetUserSettingsResult, JsonUnmarshallerContext> unmarshaller = new AdminSetUserSettingsResultJsonUnmarshaller();
            JsonResponseHandler<AdminSetUserSettingsResult> responseHandler = new JsonResponseHandler<AdminSetUserSettingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the device status as an administrator.
     * </p>
     * 
     * @param adminUpdateDeviceStatusRequest <p>
     *            The request to update the device status, as an administrator.
     *            </p>
     * @return adminUpdateDeviceStatusResult The response from the
     *         AdminUpdateDeviceStatus service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AdminUpdateDeviceStatusResult adminUpdateDeviceStatus(
            AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminUpdateDeviceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUpdateDeviceStatusRequest> request = null;
        Response<AdminUpdateDeviceStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUpdateDeviceStatusRequestMarshaller()
                        .marshall(adminUpdateDeviceStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminUpdateDeviceStatusResult, JsonUnmarshallerContext> unmarshaller = new AdminUpdateDeviceStatusResultJsonUnmarshaller();
            JsonResponseHandler<AdminUpdateDeviceStatusResult> responseHandler = new JsonResponseHandler<AdminUpdateDeviceStatusResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Signs out users from all devices, as an administrator.
     * </p>
     * 
     * @param adminUserGlobalSignOutRequest <p>
     *            The request to sign out of all devices, as an administrator.
     *            </p>
     * @return adminUserGlobalSignOutResult The response from the
     *         AdminUserGlobalSignOut service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AdminUserGlobalSignOutResult adminUserGlobalSignOut(
            AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(adminUserGlobalSignOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUserGlobalSignOutRequest> request = null;
        Response<AdminUserGlobalSignOutResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUserGlobalSignOutRequestMarshaller()
                        .marshall(adminUserGlobalSignOutRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminUserGlobalSignOutResult, JsonUnmarshallerContext> unmarshaller = new AdminUserGlobalSignOutResultJsonUnmarshaller();
            JsonResponseHandler<AdminUserGlobalSignOutResult> responseHandler = new JsonResponseHandler<AdminUserGlobalSignOutResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param associateSoftwareTokenRequest
     * @return associateSoftwareTokenResult The response from the
     *         AssociateSoftwareToken service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AssociateSoftwareTokenResult associateSoftwareToken(
            AssociateSoftwareTokenRequest associateSoftwareTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateSoftwareTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSoftwareTokenRequest> request = null;
        Response<AssociateSoftwareTokenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSoftwareTokenRequestMarshaller()
                        .marshall(associateSoftwareTokenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateSoftwareTokenResult, JsonUnmarshallerContext> unmarshaller = new AssociateSoftwareTokenResultJsonUnmarshaller();
            JsonResponseHandler<AssociateSoftwareTokenResult> responseHandler = new JsonResponseHandler<AssociateSoftwareTokenResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes the password for a specified user in a user pool.
     * </p>
     * 
     * @param changePasswordRequest <p>
     *            Represents the request to change a user password.
     *            </p>
     * @return changePasswordResult The response from the ChangePassword service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InvalidPasswordException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ChangePasswordResult changePassword(ChangePasswordRequest changePasswordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(changePasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangePasswordRequest> request = null;
        Response<ChangePasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangePasswordRequestMarshaller().marshall(changePasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ChangePasswordResult, JsonUnmarshallerContext> unmarshaller = new ChangePasswordResultJsonUnmarshaller();
            JsonResponseHandler<ChangePasswordResult> responseHandler = new JsonResponseHandler<ChangePasswordResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Confirms tracking of the device. This API call is the call that beings
     * device tracking.
     * </p>
     * 
     * @param confirmDeviceRequest <p>
     *            Confirms the device request.
     *            </p>
     * @return confirmDeviceResult The response from the ConfirmDevice service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InvalidPasswordException
     * @throws InvalidLambdaResponseException
     * @throws UsernameExistsException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ConfirmDeviceResult confirmDevice(ConfirmDeviceRequest confirmDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(confirmDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmDeviceRequest> request = null;
        Response<ConfirmDeviceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmDeviceRequestMarshaller().marshall(confirmDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ConfirmDeviceResult, JsonUnmarshallerContext> unmarshaller = new ConfirmDeviceResultJsonUnmarshaller();
            JsonResponseHandler<ConfirmDeviceResult> responseHandler = new JsonResponseHandler<ConfirmDeviceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Allows a user to enter a code provided when they reset their password to
     * update their password.
     * </p>
     * 
     * @param confirmForgotPasswordRequest <p>
     *            The request representing the confirmation for a password
     *            reset.
     *            </p>
     * @return confirmForgotPasswordResult The response from the
     *         ConfirmForgotPassword service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidParameterException
     * @throws InvalidPasswordException
     * @throws NotAuthorizedException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws TooManyFailedAttemptsException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ConfirmForgotPasswordResult confirmForgotPassword(
            ConfirmForgotPasswordRequest confirmForgotPasswordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(confirmForgotPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmForgotPasswordRequest> request = null;
        Response<ConfirmForgotPasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmForgotPasswordRequestMarshaller()
                        .marshall(confirmForgotPasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ConfirmForgotPasswordResult, JsonUnmarshallerContext> unmarshaller = new ConfirmForgotPasswordResultJsonUnmarshaller();
            JsonResponseHandler<ConfirmForgotPasswordResult> responseHandler = new JsonResponseHandler<ConfirmForgotPasswordResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Confirms registration of a user and handles the existing alias from a
     * previous user.
     * </p>
     * 
     * @param confirmSignUpRequest <p>
     *            Represents the request to confirm registration of a user.
     *            </p>
     * @return confirmSignUpResult The response from the ConfirmSignUp service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws TooManyFailedAttemptsException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws InvalidLambdaResponseException
     * @throws AliasExistsException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ConfirmSignUpResult confirmSignUp(ConfirmSignUpRequest confirmSignUpRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(confirmSignUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmSignUpRequest> request = null;
        Response<ConfirmSignUpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmSignUpRequestMarshaller().marshall(confirmSignUpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ConfirmSignUpResult, JsonUnmarshallerContext> unmarshaller = new ConfirmSignUpResultJsonUnmarshaller();
            JsonResponseHandler<ConfirmSignUpResult> responseHandler = new JsonResponseHandler<ConfirmSignUpResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates the user import job.
     * </p>
     * 
     * @param createUserImportJobRequest <p>
     *            Represents the request to create the user import job.
     *            </p>
     * @return createUserImportJobResult The response from the
     *         CreateUserImportJob service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws PreconditionNotMetException
     * @throws NotAuthorizedException
     * @throws LimitExceededException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateUserImportJobResult createUserImportJob(
            CreateUserImportJobRequest createUserImportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserImportJobRequest> request = null;
        Response<CreateUserImportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserImportJobRequestMarshaller()
                        .marshall(createUserImportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserImportJobResult, JsonUnmarshallerContext> unmarshaller = new CreateUserImportJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserImportJobResult> responseHandler = new JsonResponseHandler<CreateUserImportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates the user pool client.
     * </p>
     * 
     * @param createUserPoolClientRequest <p>
     *            Represents the request to create a user pool client.
     *            </p>
     * @return createUserPoolClientResult The response from the
     *         CreateUserPoolClient service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateUserPoolClientResult createUserPoolClient(
            CreateUserPoolClientRequest createUserPoolClientRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolClientRequest> request = null;
        Response<CreateUserPoolClientResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolClientRequestMarshaller()
                        .marshall(createUserPoolClientRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserPoolClientResult, JsonUnmarshallerContext> unmarshaller = new CreateUserPoolClientResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserPoolClientResult> responseHandler = new JsonResponseHandler<CreateUserPoolClientResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Allows a user to delete one's self.
     * </p>
     * 
     * @param deleteUserRequest <p>
     *            Represents the request to delete a user.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void deleteUser(DeleteUserRequest deleteUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller().marshall(deleteUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the attributes for a user.
     * </p>
     * 
     * @param deleteUserAttributesRequest <p>
     *            Represents the request to delete user attributes.
     *            </p>
     * @return deleteUserAttributesResult The response from the
     *         DeleteUserAttributes service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteUserAttributesResult deleteUserAttributes(
            DeleteUserAttributesRequest deleteUserAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserAttributesRequest> request = null;
        Response<DeleteUserAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserAttributesRequestMarshaller()
                        .marshall(deleteUserAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteUserAttributesResult, JsonUnmarshallerContext> unmarshaller = new DeleteUserAttributesResultJsonUnmarshaller();
            JsonResponseHandler<DeleteUserAttributesResult> responseHandler = new JsonResponseHandler<DeleteUserAttributesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified Amazon Cognito user pool.
     * </p>
     * 
     * @param deleteUserPoolRequest <p>
     *            Represents the request to delete a user pool.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UserImportInProgressException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void deleteUserPool(DeleteUserPoolRequest deleteUserPoolRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPoolRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPoolRequestMarshaller().marshall(deleteUserPoolRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Allows the developer to delete the user pool client.
     * </p>
     * 
     * @param deleteUserPoolClientRequest <p>
     *            Represents the request to delete a user pool client.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void deleteUserPoolClient(DeleteUserPoolClientRequest deleteUserPoolClientRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserPoolClientRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPoolClientRequestMarshaller()
                        .marshall(deleteUserPoolClientRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the user import job.
     * </p>
     * 
     * @param describeUserImportJobRequest <p>
     *            Represents the request to describe the user import job.
     *            </p>
     * @return describeUserImportJobResult The response from the
     *         DescribeUserImportJob service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeUserImportJobResult describeUserImportJob(
            DescribeUserImportJobRequest describeUserImportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserImportJobRequest> request = null;
        Response<DescribeUserImportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserImportJobRequestMarshaller()
                        .marshall(describeUserImportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserImportJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserImportJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserImportJobResult> responseHandler = new JsonResponseHandler<DescribeUserImportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Client method for returning the configuration information and metadata of
     * the specified user pool client.
     * </p>
     * 
     * @param describeUserPoolClientRequest <p>
     *            Represents the request to describe a user pool client.
     *            </p>
     * @return describeUserPoolClientResult The response from the
     *         DescribeUserPoolClient service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeUserPoolClientResult describeUserPoolClient(
            DescribeUserPoolClientRequest describeUserPoolClientRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolClientRequest> request = null;
        Response<DescribeUserPoolClientResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolClientRequestMarshaller()
                        .marshall(describeUserPoolClientRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserPoolClientResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserPoolClientResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserPoolClientResult> responseHandler = new JsonResponseHandler<DescribeUserPoolClientResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Forgets the specified device.
     * </p>
     * 
     * @param forgetDeviceRequest <p>
     *            Represents the request to forget the device.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InvalidUserPoolConfigurationException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void forgetDevice(ForgetDeviceRequest forgetDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(forgetDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgetDeviceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgetDeviceRequestMarshaller().marshall(forgetDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the password for the specified client ID or username.
     * </p>
     * 
     * @param forgotPasswordRequest <p>
     *            Represents the request to reset a user's password.
     *            </p>
     * @return forgotPasswordResult The response from the ForgotPassword service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ForgotPasswordResult forgotPassword(ForgotPasswordRequest forgotPasswordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(forgotPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgotPasswordRequest> request = null;
        Response<ForgotPasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgotPasswordRequestMarshaller().marshall(forgotPasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ForgotPasswordResult, JsonUnmarshallerContext> unmarshaller = new ForgotPasswordResultJsonUnmarshaller();
            JsonResponseHandler<ForgotPasswordResult> responseHandler = new JsonResponseHandler<ForgotPasswordResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the header information for the .csv file to be used as input for the
     * user import job.
     * </p>
     * 
     * @param getCSVHeaderRequest <p>
     *            Represents the request to get the header information for the
     *            .csv file for the user import job.
     *            </p>
     * @return getCSVHeaderResult The response from the GetCSVHeader service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetCSVHeaderResult getCSVHeader(GetCSVHeaderRequest getCSVHeaderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCSVHeaderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCSVHeaderRequest> request = null;
        Response<GetCSVHeaderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCSVHeaderRequestMarshaller().marshall(getCSVHeaderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCSVHeaderResult, JsonUnmarshallerContext> unmarshaller = new GetCSVHeaderResultJsonUnmarshaller();
            JsonResponseHandler<GetCSVHeaderResult> responseHandler = new JsonResponseHandler<GetCSVHeaderResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the device.
     * </p>
     * 
     * @param getDeviceRequest <p>
     *            Represents the request to get the device.
     *            </p>
     * @return getDeviceResult The response from the GetDevice service method,
     *         as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InvalidUserPoolConfigurationException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceRequest> request = null;
        Response<GetDeviceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceRequestMarshaller().marshall(getDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeviceResult, JsonUnmarshallerContext> unmarshaller = new GetDeviceResultJsonUnmarshaller();
            JsonResponseHandler<GetDeviceResult> responseHandler = new JsonResponseHandler<GetDeviceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the user attributes and metadata for a user.
     * </p>
     * 
     * @param getUserRequest <p>
     *            Represents the request to get information about the user.
     *            </p>
     * @return getUserResult The response from the GetUser service method, as
     *         returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetUserResult getUser(GetUserRequest getUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserRequest> request = null;
        Response<GetUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserRequestMarshaller().marshall(getUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUserResult, JsonUnmarshallerContext> unmarshaller = new GetUserResultJsonUnmarshaller();
            JsonResponseHandler<GetUserResult> responseHandler = new JsonResponseHandler<GetUserResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the user attribute verification code for the specified attribute
     * name.
     * </p>
     * 
     * @param getUserAttributeVerificationCodeRequest <p>
     *            Represents the request to get user attribute verification.
     *            </p>
     * @return getUserAttributeVerificationCodeResult The response from the
     *         GetUserAttributeVerificationCode service method, as returned by
     *         Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws LimitExceededException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(
            GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUserAttributeVerificationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserAttributeVerificationCodeRequest> request = null;
        Response<GetUserAttributeVerificationCodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserAttributeVerificationCodeRequestMarshaller()
                        .marshall(getUserAttributeVerificationCodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUserAttributeVerificationCodeResult, JsonUnmarshallerContext> unmarshaller = new GetUserAttributeVerificationCodeResultJsonUnmarshaller();
            JsonResponseHandler<GetUserAttributeVerificationCodeResult> responseHandler = new JsonResponseHandler<GetUserAttributeVerificationCodeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Signs out users from all devices.
     * </p>
     * 
     * @param globalSignOutRequest <p>
     *            Represents the request to sign out all devices.
     *            </p>
     * @return globalSignOutResult The response from the GlobalSignOut service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GlobalSignOutResult globalSignOut(GlobalSignOutRequest globalSignOutRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(globalSignOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GlobalSignOutRequest> request = null;
        Response<GlobalSignOutResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GlobalSignOutRequestMarshaller().marshall(globalSignOutRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GlobalSignOutResult, JsonUnmarshallerContext> unmarshaller = new GlobalSignOutResultJsonUnmarshaller();
            JsonResponseHandler<GlobalSignOutResult> responseHandler = new JsonResponseHandler<GlobalSignOutResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Initiates the authentication flow.
     * </p>
     * 
     * @param initiateAuthRequest <p>
     *            Initiates the authentication request.
     *            </p>
     * @return initiateAuthResult The response from the InitiateAuth service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws UnexpectedLambdaException
     * @throws InvalidUserPoolConfigurationException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public InitiateAuthResult initiateAuth(InitiateAuthRequest initiateAuthRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(initiateAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateAuthRequest> request = null;
        Response<InitiateAuthResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateAuthRequestMarshaller().marshall(initiateAuthRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<InitiateAuthResult, JsonUnmarshallerContext> unmarshaller = new InitiateAuthResultJsonUnmarshaller();
            JsonResponseHandler<InitiateAuthResult> responseHandler = new JsonResponseHandler<InitiateAuthResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the devices.
     * </p>
     * 
     * @param listDevicesRequest <p>
     *            Represents the request to list the devices.
     *            </p>
     * @return listDevicesResult The response from the ListDevices service
     *         method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicesRequest> request = null;
        Response<ListDevicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicesRequestMarshaller().marshall(listDevicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDevicesResult, JsonUnmarshallerContext> unmarshaller = new ListDevicesResultJsonUnmarshaller();
            JsonResponseHandler<ListDevicesResult> responseHandler = new JsonResponseHandler<ListDevicesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the user import jobs.
     * </p>
     * 
     * @param listUserImportJobsRequest <p>
     *            Represents the request to list the user import jobs.
     *            </p>
     * @return listUserImportJobsResult The response from the ListUserImportJobs
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListUserImportJobsResult listUserImportJobs(
            ListUserImportJobsRequest listUserImportJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listUserImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserImportJobsRequest> request = null;
        Response<ListUserImportJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserImportJobsRequestMarshaller()
                        .marshall(listUserImportJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUserImportJobsResult, JsonUnmarshallerContext> unmarshaller = new ListUserImportJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListUserImportJobsResult> responseHandler = new JsonResponseHandler<ListUserImportJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the clients that have been created for the specified user pool.
     * </p>
     * 
     * @param listUserPoolClientsRequest <p>
     *            Represents the request to list the user pool clients.
     *            </p>
     * @return listUserPoolClientsResult The response from the
     *         ListUserPoolClients service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListUserPoolClientsResult listUserPoolClients(
            ListUserPoolClientsRequest listUserPoolClientsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listUserPoolClientsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoolClientsRequest> request = null;
        Response<ListUserPoolClientsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoolClientsRequestMarshaller()
                        .marshall(listUserPoolClientsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUserPoolClientsResult, JsonUnmarshallerContext> unmarshaller = new ListUserPoolClientsResultJsonUnmarshaller();
            JsonResponseHandler<ListUserPoolClientsResult> responseHandler = new JsonResponseHandler<ListUserPoolClientsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the users in the Amazon Cognito user pool.
     * </p>
     * 
     * @param listUsersRequest <p>
     *            Represents the request to list users.
     *            </p>
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
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
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a specific
     * user in the user pool.
     * </p>
     * 
     * @param resendConfirmationCodeRequest <p>
     *            Represents the request to resend the confirmation code.
     *            </p>
     * @return resendConfirmationCodeResult The response from the
     *         ResendConfirmationCode service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws UserNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ResendConfirmationCodeResult resendConfirmationCode(
            ResendConfirmationCodeRequest resendConfirmationCodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resendConfirmationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendConfirmationCodeRequest> request = null;
        Response<ResendConfirmationCodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendConfirmationCodeRequestMarshaller()
                        .marshall(resendConfirmationCodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResendConfirmationCodeResult, JsonUnmarshallerContext> unmarshaller = new ResendConfirmationCodeResultJsonUnmarshaller();
            JsonResponseHandler<ResendConfirmationCodeResult> responseHandler = new JsonResponseHandler<ResendConfirmationCodeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Responds to the authentication challenge.
     * </p>
     * 
     * @param respondToAuthChallengeRequest <p>
     *            The request to respond to an authentication challenge.
     *            </p>
     * @return respondToAuthChallengeResult The response from the
     *         RespondToAuthChallenge service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidPasswordException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws InvalidUserPoolConfigurationException
     * @throws MFAMethodNotFoundException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws AliasExistsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public RespondToAuthChallengeResult respondToAuthChallenge(
            RespondToAuthChallengeRequest respondToAuthChallengeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(respondToAuthChallengeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RespondToAuthChallengeRequest> request = null;
        Response<RespondToAuthChallengeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RespondToAuthChallengeRequestMarshaller()
                        .marshall(respondToAuthChallengeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RespondToAuthChallengeResult, JsonUnmarshallerContext> unmarshaller = new RespondToAuthChallengeResultJsonUnmarshaller();
            JsonResponseHandler<RespondToAuthChallengeResult> responseHandler = new JsonResponseHandler<RespondToAuthChallengeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param setUserMFAPreferenceRequest
     * @return setUserMFAPreferenceResult The response from the
     *         SetUserMFAPreference service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public SetUserMFAPreferenceResult setUserMFAPreference(
            SetUserMFAPreferenceRequest setUserMFAPreferenceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setUserMFAPreferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetUserMFAPreferenceRequest> request = null;
        Response<SetUserMFAPreferenceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetUserMFAPreferenceRequestMarshaller()
                        .marshall(setUserMFAPreferenceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SetUserMFAPreferenceResult, JsonUnmarshallerContext> unmarshaller = new SetUserMFAPreferenceResultJsonUnmarshaller();
            JsonResponseHandler<SetUserMFAPreferenceResult> responseHandler = new JsonResponseHandler<SetUserMFAPreferenceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the user settings like multi-factor authentication (MFA). If MFA is
     * to be removed for a particular attribute pass the attribute with code
     * delivery as null. If null list is passed, all MFA options are removed.
     * </p>
     * 
     * @param setUserSettingsRequest <p>
     *            Represents the request to set user settings.
     *            </p>
     * @return setUserSettingsResult The response from the SetUserSettings
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public SetUserSettingsResult setUserSettings(SetUserSettingsRequest setUserSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetUserSettingsRequest> request = null;
        Response<SetUserSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetUserSettingsRequestMarshaller().marshall(setUserSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SetUserSettingsResult, JsonUnmarshallerContext> unmarshaller = new SetUserSettingsResultJsonUnmarshaller();
            JsonResponseHandler<SetUserSettingsResult> responseHandler = new JsonResponseHandler<SetUserSettingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Registers the user in the specified user pool and creates a user name,
     * password, and user attributes.
     * </p>
     * 
     * @param signUpRequest <p>
     *            Represents the request to register a user.
     *            </p>
     * @return signUpResult The response from the SignUp service method, as
     *         returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws NotAuthorizedException
     * @throws InvalidPasswordException
     * @throws InvalidLambdaResponseException
     * @throws UsernameExistsException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public SignUpResult signUp(SignUpRequest signUpRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(signUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignUpRequest> request = null;
        Response<SignUpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignUpRequestMarshaller().marshall(signUpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SignUpResult, JsonUnmarshallerContext> unmarshaller = new SignUpResultJsonUnmarshaller();
            JsonResponseHandler<SignUpResult> responseHandler = new JsonResponseHandler<SignUpResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts the user import.
     * </p>
     * 
     * @param startUserImportJobRequest <p>
     *            Represents the request to start the user import job.
     *            </p>
     * @return startUserImportJobResult The response from the StartUserImportJob
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws PreconditionNotMetException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public StartUserImportJobResult startUserImportJob(
            StartUserImportJobRequest startUserImportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartUserImportJobRequest> request = null;
        Response<StartUserImportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartUserImportJobRequestMarshaller()
                        .marshall(startUserImportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartUserImportJobResult, JsonUnmarshallerContext> unmarshaller = new StartUserImportJobResultJsonUnmarshaller();
            JsonResponseHandler<StartUserImportJobResult> responseHandler = new JsonResponseHandler<StartUserImportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops the user import job.
     * </p>
     * 
     * @param stopUserImportJobRequest <p>
     *            Represents the request to stop the user import job.
     *            </p>
     * @return stopUserImportJobResult The response from the StopUserImportJob
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws PreconditionNotMetException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public StopUserImportJobResult stopUserImportJob(
            StopUserImportJobRequest stopUserImportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopUserImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopUserImportJobRequest> request = null;
        Response<StopUserImportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopUserImportJobRequestMarshaller()
                        .marshall(stopUserImportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopUserImportJobResult, JsonUnmarshallerContext> unmarshaller = new StopUserImportJobResultJsonUnmarshaller();
            JsonResponseHandler<StopUserImportJobResult> responseHandler = new JsonResponseHandler<StopUserImportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the device status.
     * </p>
     * 
     * @param updateDeviceStatusRequest <p>
     *            Represents the request to update the device status.
     *            </p>
     * @return updateDeviceStatusResult The response from the UpdateDeviceStatus
     *         service method, as returned by Amazon Cognito Your User Pool.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidUserPoolConfigurationException
     * @throws TooManyRequestsException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateDeviceStatusResult updateDeviceStatus(
            UpdateDeviceStatusRequest updateDeviceStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDeviceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceStatusRequest> request = null;
        Response<UpdateDeviceStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceStatusRequestMarshaller()
                        .marshall(updateDeviceStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDeviceStatusResult, JsonUnmarshallerContext> unmarshaller = new UpdateDeviceStatusResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDeviceStatusResult> responseHandler = new JsonResponseHandler<UpdateDeviceStatusResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Allows a user to update a specific attribute (one at a time).
     * </p>
     * 
     * @param updateUserAttributesRequest <p>
     *            Represents the request to update user attributes.
     *            </p>
     * @return updateUserAttributesResult The response from the
     *         UpdateUserAttributes service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws NotAuthorizedException
     * @throws UnexpectedLambdaException
     * @throws UserLambdaValidationException
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws AliasExistsException
     * @throws InvalidSmsRoleAccessPolicyException
     * @throws InvalidSmsRoleTrustRelationshipException
     * @throws InvalidEmailRoleAccessPolicyException
     * @throws CodeDeliveryFailureException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateUserAttributesResult updateUserAttributes(
            UpdateUserAttributesRequest updateUserAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserAttributesRequest> request = null;
        Response<UpdateUserAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserAttributesRequestMarshaller()
                        .marshall(updateUserAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUserAttributesResult, JsonUnmarshallerContext> unmarshaller = new UpdateUserAttributesResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUserAttributesResult> responseHandler = new JsonResponseHandler<UpdateUserAttributesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Allows the developer to update the specified user pool client and
     * password policy.
     * </p>
     * 
     * @param updateUserPoolClientRequest <p>
     *            Represents the request to update the user pool client.
     *            </p>
     * @return updateUserPoolClientResult The response from the
     *         UpdateUserPoolClient service method, as returned by Amazon
     *         Cognito Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateUserPoolClientResult updateUserPoolClient(
            UpdateUserPoolClientRequest updateUserPoolClientRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolClientRequest> request = null;
        Response<UpdateUserPoolClientResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolClientRequestMarshaller()
                        .marshall(updateUserPoolClientRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUserPoolClientResult, JsonUnmarshallerContext> unmarshaller = new UpdateUserPoolClientResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUserPoolClientResult> responseHandler = new JsonResponseHandler<UpdateUserPoolClientResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param verifySoftwareTokenRequest
     * @return verifySoftwareTokenResult The response from the
     *         VerifySoftwareToken service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InvalidUserPoolConfigurationException
     * @throws EnableSoftwareTokenMFAException
     * @throws SoftwareTokenMFANotFoundException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public VerifySoftwareTokenResult verifySoftwareToken(
            VerifySoftwareTokenRequest verifySoftwareTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(verifySoftwareTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifySoftwareTokenRequest> request = null;
        Response<VerifySoftwareTokenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifySoftwareTokenRequestMarshaller()
                        .marshall(verifySoftwareTokenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<VerifySoftwareTokenResult, JsonUnmarshallerContext> unmarshaller = new VerifySoftwareTokenResultJsonUnmarshaller();
            JsonResponseHandler<VerifySoftwareTokenResult> responseHandler = new JsonResponseHandler<VerifySoftwareTokenResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Verifies the specified user attributes in the user pool.
     * </p>
     * 
     * @param verifyUserAttributeRequest <p>
     *            Represents the request to verify user attributes.
     *            </p>
     * @return verifyUserAttributeResult The response from the
     *         VerifyUserAttribute service method, as returned by Amazon Cognito
     *         Your User Pool.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws CodeMismatchException
     * @throws ExpiredCodeException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws PasswordResetRequiredException
     * @throws UserNotFoundException
     * @throws UserNotConfirmedException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Your User Pool indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public VerifyUserAttributeResult verifyUserAttribute(
            VerifyUserAttributeRequest verifyUserAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(verifyUserAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyUserAttributeRequest> request = null;
        Response<VerifyUserAttributeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyUserAttributeRequestMarshaller()
                        .marshall(verifyUserAttributeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<VerifyUserAttributeResult, JsonUnmarshallerContext> unmarshaller = new VerifyUserAttributeResultJsonUnmarshaller();
            JsonResponseHandler<VerifyUserAttributeResult> responseHandler = new JsonResponseHandler<VerifyUserAttributeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
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
