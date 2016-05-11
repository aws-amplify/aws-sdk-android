/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Client for accessing AmazonCognitoIdentityProvider.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * You can create a user pool in Amazon Cognito Identity to manage
 * directories and users. You can authenticate a user to obtain tokens
 * related to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon
 * Cognito Identity, which is a new capability that is available as a
 * beta.
 * </p>
 */
public class AmazonCognitoIdentityProviderClient extends AmazonWebServiceClient implements AmazonCognitoIdentityProvider {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonCognitoIdentityProvider exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonCognitoIdentityProviderClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCognitoIdentityProvider
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonCognitoIdentityProviderClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCognitoIdentityProviderClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCognitoIdentityProvider
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCognitoIdentityProviderClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCognitoIdentityProvider
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCognitoIdentityProviderClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentityProvider using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCognitoIdentityProvider
     *                       (ex: proxy settings, retry counts, etc.).
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
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCognitoIdentityProvider
     *                       (ex: proxy settings, retry counts, etc.).
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
        jsonErrorUnmarshallers.add(new TooManyFailedAttemptsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UsernameExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ExpiredCodeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidLambdaResponseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CodeMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AliasExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UserLambdaValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotAuthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnexpectedLambdaExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPasswordExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MFAMethodNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cognito-idp.us-east-1.amazonaws.com");
        
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
     * Allows a user to enter a code provided when they reset their password
     * to update their password.
     * </p>
     *
     * @param confirmForgotPasswordRequest Container for the necessary
     *           parameters to execute the ConfirmForgotPassword service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ConfirmForgotPassword service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyFailedAttemptsException
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws ResourceNotFoundException
     * @throws CodeMismatchException
     * @throws InvalidPasswordException
     * @throws TooManyRequestsException
     * @throws UnexpectedLambdaException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws ExpiredCodeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmForgotPasswordResult confirmForgotPassword(ConfirmForgotPasswordRequest confirmForgotPasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmForgotPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmForgotPasswordRequest> request = null;
        Response<ConfirmForgotPasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmForgotPasswordRequestMarshaller().marshall(confirmForgotPasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ConfirmForgotPasswordResult, JsonUnmarshallerContext> unmarshaller = new ConfirmForgotPasswordResultJsonUnmarshaller();
            JsonResponseHandler<ConfirmForgotPasswordResult> responseHandler = new JsonResponseHandler<ConfirmForgotPasswordResult>(unmarshaller);

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
     * @param listUsersRequest Container for the necessary parameters to
     *           execute the ListUsers service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ListUsers service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest) {
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
            JsonResponseHandler<ListUsersResult> responseHandler = new JsonResponseHandler<ListUsersResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the user settings like multi-factor authentication (MFA). If MFA
     * is to be removed for a particular attribute pass the attribute with
     * code delivery as null. If null list is passed, all MFA options are
     * removed.
     * </p>
     *
     * @param setUserSettingsRequest Container for the necessary parameters
     *           to execute the SetUserSettings service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the SetUserSettings service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetUserSettingsResult setUserSettings(SetUserSettingsRequest setUserSettingsRequest) {
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
            JsonResponseHandler<SetUserSettingsResult> responseHandler = new JsonResponseHandler<SetUserSettingsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables the specified user as an administrator. Works on any user.
     * </p>
     *
     * @param adminEnableUserRequest Container for the necessary parameters
     *           to execute the AdminEnableUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminEnableUser service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminEnableUserResult adminEnableUser(AdminEnableUserRequest adminEnableUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminEnableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminEnableUserRequest> request = null;
        Response<AdminEnableUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminEnableUserRequestMarshaller().marshall(adminEnableUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminEnableUserResult, JsonUnmarshallerContext> unmarshaller = new AdminEnableUserResultJsonUnmarshaller();
            JsonResponseHandler<AdminEnableUserResult> responseHandler = new JsonResponseHandler<AdminEnableUserResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an
     * administrator. Works on any user.
     * </p>
     *
     * @param adminGetUserRequest Container for the necessary parameters to
     *           execute the AdminGetUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminGetUser service method, as returned
     *         by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminGetUserResult adminGetUser(AdminGetUserRequest adminGetUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminGetUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminGetUserRequest> request = null;
        Response<AdminGetUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminGetUserRequestMarshaller().marshall(adminGetUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminGetUserResult, JsonUnmarshallerContext> unmarshaller = new AdminGetUserResultJsonUnmarshaller();
            JsonResponseHandler<AdminGetUserResult> responseHandler = new JsonResponseHandler<AdminGetUserResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a user as an administrator. Works on any user.
     * </p>
     *
     * @param adminDeleteUserRequest Container for the necessary parameters
     *           to execute the AdminDeleteUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void adminDeleteUser(AdminDeleteUserRequest adminDeleteUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminDeleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AdminDeleteUserRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new AdminDeleteUserRequestMarshaller().marshall(adminDeleteUserRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works
     * on any user.
     * </p>
     *
     * @param adminDeleteUserAttributesRequest Container for the necessary
     *           parameters to execute the AdminDeleteUserAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminDeleteUserAttributes service
     *         method, as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminDeleteUserAttributesResult adminDeleteUserAttributes(AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(adminDeleteUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDeleteUserAttributesRequest> request = null;
        Response<AdminDeleteUserAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDeleteUserAttributesRequestMarshaller().marshall(adminDeleteUserAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminDeleteUserAttributesResult, JsonUnmarshallerContext> unmarshaller = new AdminDeleteUserAttributesResultJsonUnmarshaller();
            JsonResponseHandler<AdminDeleteUserAttributesResult> responseHandler = new JsonResponseHandler<AdminDeleteUserAttributesResult>(unmarshaller);

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
     * @param deleteUserPoolRequest Container for the necessary parameters to
     *           execute the DeleteUserPool service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUserPool(DeleteUserPoolRequest deleteUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteUserPoolRequest> request;
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
    }
    
    /**
     * <p>
     * Allows the developer to delete the user pool client.
     * </p>
     *
     * @param deleteUserPoolClientRequest Container for the necessary
     *           parameters to execute the DeleteUserPoolClient service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUserPoolClient(DeleteUserPoolClientRequest deleteUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteUserPoolClientRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteUserPoolClientRequestMarshaller().marshall(deleteUserPoolClientRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes the attributes for a user.
     * </p>
     *
     * @param deleteUserAttributesRequest Container for the necessary
     *           parameters to execute the DeleteUserAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the DeleteUserAttributes service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteUserAttributesResult deleteUserAttributes(DeleteUserAttributesRequest deleteUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserAttributesRequest> request = null;
        Response<DeleteUserAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserAttributesRequestMarshaller().marshall(deleteUserAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteUserAttributesResult, JsonUnmarshallerContext> unmarshaller = new DeleteUserAttributesResultJsonUnmarshaller();
            JsonResponseHandler<DeleteUserAttributesResult> responseHandler = new JsonResponseHandler<DeleteUserAttributesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * First step of the Secure Remote Password protocol (SRP) auth flow to
     * authenticate a user. To learn about the second step, see Authenticate.
     * </p>
     *
     * @param getAuthenticationDetailsRequest Container for the necessary
     *           parameters to execute the GetAuthenticationDetails service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetAuthenticationDetails service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws UnexpectedLambdaException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAuthenticationDetailsResult getAuthenticationDetails(GetAuthenticationDetailsRequest getAuthenticationDetailsRequest) {
        ExecutionContext executionContext = createExecutionContext(getAuthenticationDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthenticationDetailsRequest> request = null;
        Response<GetAuthenticationDetailsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthenticationDetailsRequestMarshaller().marshall(getAuthenticationDetailsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAuthenticationDetailsResult, JsonUnmarshallerContext> unmarshaller = new GetAuthenticationDetailsResultJsonUnmarshaller();
            JsonResponseHandler<GetAuthenticationDetailsResult> responseHandler = new JsonResponseHandler<GetAuthenticationDetailsResult>(unmarshaller);

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
     * @param confirmSignUpRequest Container for the necessary parameters to
     *           execute the ConfirmSignUp service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ConfirmSignUp service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyFailedAttemptsException
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws ResourceNotFoundException
     * @throws CodeMismatchException
     * @throws AliasExistsException
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws LimitExceededException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws ExpiredCodeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmSignUpResult confirmSignUp(ConfirmSignUpRequest confirmSignUpRequest) {
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
            JsonResponseHandler<ConfirmSignUpResult> responseHandler = new JsonResponseHandler<ConfirmSignUpResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Grants the ability to supply a multi-factor authentication (MFA)
     * token for an MFA-enabled user to get the ID, access, and refresh
     * tokens.
     * </p>
     *
     * @param enhanceAuthRequest Container for the necessary parameters to
     *           execute the EnhanceAuth service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the EnhanceAuth service method, as returned
     *         by AmazonCognitoIdentityProvider.
     * 
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws ExpiredCodeException
     * @throws CodeMismatchException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnhanceAuthResult enhanceAuth(EnhanceAuthRequest enhanceAuthRequest) {
        ExecutionContext executionContext = createExecutionContext(enhanceAuthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnhanceAuthRequest> request = null;
        Response<EnhanceAuthResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnhanceAuthRequestMarshaller().marshall(enhanceAuthRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnhanceAuthResult, JsonUnmarshallerContext> unmarshaller = new EnhanceAuthResultJsonUnmarshaller();
            JsonResponseHandler<EnhanceAuthResult> responseHandler = new JsonResponseHandler<EnhanceAuthResult>(unmarshaller);

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
     * @param verifyUserAttributeRequest Container for the necessary
     *           parameters to execute the VerifyUserAttribute service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the VerifyUserAttribute service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws ExpiredCodeException
     * @throws CodeMismatchException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public VerifyUserAttributeResult verifyUserAttribute(VerifyUserAttributeRequest verifyUserAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyUserAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyUserAttributeRequest> request = null;
        Response<VerifyUserAttributeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyUserAttributeRequestMarshaller().marshall(verifyUserAttributeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<VerifyUserAttributeResult, JsonUnmarshallerContext> unmarshaller = new VerifyUserAttributeResultJsonUnmarshaller();
            JsonResponseHandler<VerifyUserAttributeResult> responseHandler = new JsonResponseHandler<VerifyUserAttributeResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the specified user pool with the specified attributes.
     * </p>
     *
     * @param updateUserPoolRequest Container for the necessary parameters to
     *           execute the UpdateUserPool service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the UpdateUserPool service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ConcurrentModificationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateUserPoolResult updateUserPool(UpdateUserPoolRequest updateUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolRequest> request = null;
        Response<UpdateUserPoolResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolRequestMarshaller().marshall(updateUserPoolRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUserPoolResult, JsonUnmarshallerContext> unmarshaller = new UpdateUserPoolResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUserPoolResult> responseHandler = new JsonResponseHandler<UpdateUserPoolResult>(unmarshaller);

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
     * @param createUserPoolClientRequest Container for the necessary
     *           parameters to execute the CreateUserPoolClient service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the CreateUserPoolClient service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateUserPoolClientResult createUserPoolClient(CreateUserPoolClientRequest createUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolClientRequest> request = null;
        Response<CreateUserPoolClientResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolClientRequestMarshaller().marshall(createUserPoolClientRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserPoolClientResult, JsonUnmarshallerContext> unmarshaller = new CreateUserPoolClientResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserPoolClientResult> responseHandler = new JsonResponseHandler<CreateUserPoolClientResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the specified user's attributes, including developer
     * attributes, as an administrator. Works on any user.
     * </p>
     *
     * @param adminUpdateUserAttributesRequest Container for the necessary
     *           parameters to execute the AdminUpdateUserAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminUpdateUserAttributes service
     *         method, as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws AliasExistsException
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminUpdateUserAttributesResult adminUpdateUserAttributes(AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(adminUpdateUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminUpdateUserAttributesRequest> request = null;
        Response<AdminUpdateUserAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminUpdateUserAttributesRequestMarshaller().marshall(adminUpdateUserAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminUpdateUserAttributesResult, JsonUnmarshallerContext> unmarshaller = new AdminUpdateUserAttributesResultJsonUnmarshaller();
            JsonResponseHandler<AdminUpdateUserAttributesResult> responseHandler = new JsonResponseHandler<AdminUpdateUserAttributesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the user pools associated with an AWS account.
     * </p>
     *
     * @param listUserPoolsRequest Container for the necessary parameters to
     *           execute the ListUserPools service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ListUserPools service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUserPoolsResult listUserPools(ListUserPoolsRequest listUserPoolsRequest) {
        ExecutionContext executionContext = createExecutionContext(listUserPoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoolsRequest> request = null;
        Response<ListUserPoolsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoolsRequestMarshaller().marshall(listUserPoolsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUserPoolsResult, JsonUnmarshallerContext> unmarshaller = new ListUserPoolsResultJsonUnmarshaller();
            JsonResponseHandler<ListUserPoolsResult> responseHandler = new JsonResponseHandler<ListUserPoolsResult>(unmarshaller);

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
     * @param getUserRequest Container for the necessary parameters to
     *           execute the GetUser service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetUser service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserResult getUser(GetUserRequest getUserRequest) {
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
            JsonResponseHandler<GetUserResult> responseHandler = new JsonResponseHandler<GetUserResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Client method for returning the configuration information and
     * metadata of the specified user pool client.
     * </p>
     *
     * @param describeUserPoolClientRequest Container for the necessary
     *           parameters to execute the DescribeUserPoolClient service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the DescribeUserPoolClient service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeUserPoolClientResult describeUserPoolClient(DescribeUserPoolClientRequest describeUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolClientRequest> request = null;
        Response<DescribeUserPoolClientResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolClientRequestMarshaller().marshall(describeUserPoolClientRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserPoolClientResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserPoolClientResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserPoolClientResult> responseHandler = new JsonResponseHandler<DescribeUserPoolClientResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the password for the specified client ID or username.
     * </p>
     *
     * @param forgotPasswordRequest Container for the necessary parameters to
     *           execute the ForgotPassword service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ForgotPassword service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws LimitExceededException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ForgotPasswordResult forgotPassword(ForgotPasswordRequest forgotPasswordRequest) {
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
            JsonResponseHandler<ForgotPasswordResult> responseHandler = new JsonResponseHandler<ForgotPasswordResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Refreshes the tokens for the specified client ID.
     * </p>
     *
     * @param refreshTokensRequest Container for the necessary parameters to
     *           execute the RefreshTokens service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the RefreshTokens service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RefreshTokensResult refreshTokens(RefreshTokensRequest refreshTokensRequest) {
        ExecutionContext executionContext = createExecutionContext(refreshTokensRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshTokensRequest> request = null;
        Response<RefreshTokensResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshTokensRequestMarshaller().marshall(refreshTokensRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RefreshTokensResult, JsonUnmarshallerContext> unmarshaller = new RefreshTokensResultJsonUnmarshaller();
            JsonResponseHandler<RefreshTokensResult> responseHandler = new JsonResponseHandler<RefreshTokensResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the configuration information and metadata of the specified
     * user pool.
     * </p>
     *
     * @param describeUserPoolRequest Container for the necessary parameters
     *           to execute the DescribeUserPool service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the DescribeUserPool service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeUserPoolResult describeUserPool(DescribeUserPoolRequest describeUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserPoolRequest> request = null;
        Response<DescribeUserPoolResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserPoolRequestMarshaller().marshall(describeUserPoolRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserPoolResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserPoolResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserPoolResult> responseHandler = new JsonResponseHandler<DescribeUserPoolResult>(unmarshaller);

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
     * @param updateUserPoolClientRequest Container for the necessary
     *           parameters to execute the UpdateUserPoolClient service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the UpdateUserPoolClient service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateUserPoolClientResult updateUserPoolClient(UpdateUserPoolClientRequest updateUserPoolClientRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserPoolClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPoolClientRequest> request = null;
        Response<UpdateUserPoolClientResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPoolClientRequestMarshaller().marshall(updateUserPoolClientRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUserPoolClientResult, JsonUnmarshallerContext> unmarshaller = new UpdateUserPoolClientResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUserPoolClientResult> responseHandler = new JsonResponseHandler<UpdateUserPoolClientResult>(unmarshaller);

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
     * @param updateUserAttributesRequest Container for the necessary
     *           parameters to execute the UpdateUserAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the UpdateUserAttributes service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws AliasExistsException
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws ExpiredCodeException
     * @throws CodeMismatchException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateUserAttributesResult updateUserAttributes(UpdateUserAttributesRequest updateUserAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserAttributesRequest> request = null;
        Response<UpdateUserAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserAttributesRequestMarshaller().marshall(updateUserAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUserAttributesResult, JsonUnmarshallerContext> unmarshaller = new UpdateUserAttributesResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUserAttributesResult> responseHandler = new JsonResponseHandler<UpdateUserAttributesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds additional user attributes to the user pool schema.
     * </p>
     *
     * @param addCustomAttributesRequest Container for the necessary
     *           parameters to execute the AddCustomAttributes service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AddCustomAttributes service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddCustomAttributesResult addCustomAttributes(AddCustomAttributesRequest addCustomAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(addCustomAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCustomAttributesRequest> request = null;
        Response<AddCustomAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCustomAttributesRequestMarshaller().marshall(addCustomAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddCustomAttributesResult, JsonUnmarshallerContext> unmarshaller = new AddCustomAttributesResultJsonUnmarshaller();
            JsonResponseHandler<AddCustomAttributesResult> responseHandler = new JsonResponseHandler<AddCustomAttributesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Cognito user pool and sets the password policy
     * for the pool.
     * </p>
     *
     * @param createUserPoolRequest Container for the necessary parameters to
     *           execute the CreateUserPool service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the CreateUserPool service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateUserPoolResult createUserPool(CreateUserPoolRequest createUserPoolRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserPoolRequest> request = null;
        Response<CreateUserPoolResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserPoolRequestMarshaller().marshall(createUserPoolRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserPoolResult, JsonUnmarshallerContext> unmarshaller = new CreateUserPoolResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserPoolResult> responseHandler = new JsonResponseHandler<CreateUserPoolResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * The second step in the authentication flow of Secure Remote Password
     * protocol (SRP) for authenticating a user to get ID, access and refresh
     * tokens. To learn more about the first step, see
     * GetAuthenticationDetails.
     * </p>
     *
     * @param authenticateRequest Container for the necessary parameters to
     *           execute the Authenticate service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the Authenticate service method, as returned
     *         by AmazonCognitoIdentityProvider.
     * 
     * @throws InvalidLambdaResponseException
     * @throws MFAMethodNotFoundException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AuthenticateResult authenticate(AuthenticateRequest authenticateRequest) {
        ExecutionContext executionContext = createExecutionContext(authenticateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthenticateRequest> request = null;
        Response<AuthenticateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthenticateRequestMarshaller().marshall(authenticateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AuthenticateResult, JsonUnmarshallerContext> unmarshaller = new AuthenticateResultJsonUnmarshaller();
            JsonResponseHandler<AuthenticateResult> responseHandler = new JsonResponseHandler<AuthenticateResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Resets the specified user's password in a user pool as an
     * administrator. Works on any user.
     * </p>
     *
     * @param adminResetUserPasswordRequest Container for the necessary
     *           parameters to execute the AdminResetUserPassword service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminResetUserPassword service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws LimitExceededException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminResetUserPasswordResult adminResetUserPassword(AdminResetUserPasswordRequest adminResetUserPasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(adminResetUserPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminResetUserPasswordRequest> request = null;
        Response<AdminResetUserPasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminResetUserPasswordRequestMarshaller().marshall(adminResetUserPasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminResetUserPasswordResult, JsonUnmarshallerContext> unmarshaller = new AdminResetUserPasswordResultJsonUnmarshaller();
            JsonResponseHandler<AdminResetUserPasswordResult> responseHandler = new JsonResponseHandler<AdminResetUserPasswordResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the JSON Web keys for the specified user pool.
     * </p>
     *
     * @param getJWKSRequest Container for the necessary parameters to
     *           execute the GetJWKS service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetJWKS service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetJWKSResult getJWKS(GetJWKSRequest getJWKSRequest) {
        ExecutionContext executionContext = createExecutionContext(getJWKSRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJWKSRequest> request = null;
        Response<GetJWKSResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJWKSRequestMarshaller().marshall(getJWKSRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJWKSResult, JsonUnmarshallerContext> unmarshaller = new GetJWKSResultJsonUnmarshaller();
            JsonResponseHandler<GetJWKSResult> responseHandler = new JsonResponseHandler<GetJWKSResult>(unmarshaller);

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
     * @param listUserPoolClientsRequest Container for the necessary
     *           parameters to execute the ListUserPoolClients service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ListUserPoolClients service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUserPoolClientsResult listUserPoolClients(ListUserPoolClientsRequest listUserPoolClientsRequest) {
        ExecutionContext executionContext = createExecutionContext(listUserPoolClientsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoolClientsRequest> request = null;
        Response<ListUserPoolClientsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoolClientsRequestMarshaller().marshall(listUserPoolClientsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUserPoolClientsResult, JsonUnmarshallerContext> unmarshaller = new ListUserPoolClientsResultJsonUnmarshaller();
            JsonResponseHandler<ListUserPoolClientsResult> responseHandler = new JsonResponseHandler<ListUserPoolClientsResult>(unmarshaller);

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
     * @param deleteUserRequest Container for the necessary parameters to
     *           execute the DeleteUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUser(DeleteUserRequest deleteUserRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteUserRequest> request;
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
    }
    
    /**
     * <p>
     * Registers the user in the specified user pool and creates a user
     * name, password, and user attributes.
     * </p>
     *
     * @param signUpRequest Container for the necessary parameters to execute
     *           the SignUp service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the SignUp service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws InvalidPasswordException
     * @throws UsernameExistsException
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SignUpResult signUp(SignUpRequest signUpRequest) {
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
            JsonResponseHandler<SignUpResult> responseHandler = new JsonResponseHandler<SignUpResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets all the user settings for a specified user name. Works on any
     * user.
     * </p>
     *
     * @param adminSetUserSettingsRequest Container for the necessary
     *           parameters to execute the AdminSetUserSettings service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminSetUserSettings service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminSetUserSettingsResult adminSetUserSettings(AdminSetUserSettingsRequest adminSetUserSettingsRequest) {
        ExecutionContext executionContext = createExecutionContext(adminSetUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminSetUserSettingsRequest> request = null;
        Response<AdminSetUserSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminSetUserSettingsRequestMarshaller().marshall(adminSetUserSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminSetUserSettingsResult, JsonUnmarshallerContext> unmarshaller = new AdminSetUserSettingsResultJsonUnmarshaller();
            JsonResponseHandler<AdminSetUserSettingsResult> responseHandler = new JsonResponseHandler<AdminSetUserSettingsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a
     * specific user in the user pool.
     * </p>
     *
     * @param resendConfirmationCodeRequest Container for the necessary
     *           parameters to execute the ResendConfirmationCode service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ResendConfirmationCode service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws LimitExceededException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResendConfirmationCodeResult resendConfirmationCode(ResendConfirmationCodeRequest resendConfirmationCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(resendConfirmationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendConfirmationCodeRequest> request = null;
        Response<ResendConfirmationCodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendConfirmationCodeRequestMarshaller().marshall(resendConfirmationCodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResendConfirmationCodeResult, JsonUnmarshallerContext> unmarshaller = new ResendConfirmationCodeResultJsonUnmarshaller();
            JsonResponseHandler<ResendConfirmationCodeResult> responseHandler = new JsonResponseHandler<ResendConfirmationCodeResult>(unmarshaller);

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
     * @param getUserAttributeVerificationCodeRequest Container for the
     *           necessary parameters to execute the GetUserAttributeVerificationCode
     *           service method on AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetUserAttributeVerificationCode service
     *         method, as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws InvalidLambdaResponseException
     * @throws TooManyRequestsException
     * @throws UserLambdaValidationException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(getUserAttributeVerificationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserAttributeVerificationCodeRequest> request = null;
        Response<GetUserAttributeVerificationCodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserAttributeVerificationCodeRequestMarshaller().marshall(getUserAttributeVerificationCodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUserAttributeVerificationCodeResult, JsonUnmarshallerContext> unmarshaller = new GetUserAttributeVerificationCodeResultJsonUnmarshaller();
            JsonResponseHandler<GetUserAttributeVerificationCodeResult> responseHandler = new JsonResponseHandler<GetUserAttributeVerificationCodeResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disables the specified user as an administrator. Works on any user.
     * </p>
     *
     * @param adminDisableUserRequest Container for the necessary parameters
     *           to execute the AdminDisableUser service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminDisableUser service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminDisableUserResult adminDisableUser(AdminDisableUserRequest adminDisableUserRequest) {
        ExecutionContext executionContext = createExecutionContext(adminDisableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminDisableUserRequest> request = null;
        Response<AdminDisableUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminDisableUserRequestMarshaller().marshall(adminDisableUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminDisableUserResult, JsonUnmarshallerContext> unmarshaller = new AdminDisableUserResultJsonUnmarshaller();
            JsonResponseHandler<AdminDisableUserResult> responseHandler = new JsonResponseHandler<AdminDisableUserResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the OpenId configuration information for the specified user
     * pool.
     * </p>
     *
     * @param getOpenIdConfigurationRequest Container for the necessary
     *           parameters to execute the GetOpenIdConfiguration service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the GetOpenIdConfiguration service method,
     *         as returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetOpenIdConfigurationResult getOpenIdConfiguration(GetOpenIdConfigurationRequest getOpenIdConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(getOpenIdConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenIdConfigurationRequest> request = null;
        Response<GetOpenIdConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenIdConfigurationRequestMarshaller().marshall(getOpenIdConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOpenIdConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetOpenIdConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetOpenIdConfigurationResult> responseHandler = new JsonResponseHandler<GetOpenIdConfigurationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation
     * code. Works on any user.
     * </p>
     *
     * @param adminConfirmSignUpRequest Container for the necessary
     *           parameters to execute the AdminConfirmSignUp service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the AdminConfirmSignUp service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyFailedAttemptsException
     * @throws InvalidLambdaResponseException
     * @throws UserLambdaValidationException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws UnexpectedLambdaException
     * @throws LimitExceededException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AdminConfirmSignUpResult adminConfirmSignUp(AdminConfirmSignUpRequest adminConfirmSignUpRequest) {
        ExecutionContext executionContext = createExecutionContext(adminConfirmSignUpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdminConfirmSignUpRequest> request = null;
        Response<AdminConfirmSignUpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdminConfirmSignUpRequestMarshaller().marshall(adminConfirmSignUpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AdminConfirmSignUpResult, JsonUnmarshallerContext> unmarshaller = new AdminConfirmSignUpResultJsonUnmarshaller();
            JsonResponseHandler<AdminConfirmSignUpResult> responseHandler = new JsonResponseHandler<AdminConfirmSignUpResult>(unmarshaller);

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
     * @param changePasswordRequest Container for the necessary parameters to
     *           execute the ChangePassword service method on
     *           AmazonCognitoIdentityProvider.
     * 
     * @return The response from the ChangePassword service method, as
     *         returned by AmazonCognitoIdentityProvider.
     * 
     * @throws InvalidPasswordException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ChangePasswordResult changePassword(ChangePasswordRequest changePasswordRequest) {
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
            JsonResponseHandler<ChangePasswordResult> responseHandler = new JsonResponseHandler<ChangePasswordResult>(unmarshaller);

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
     * @return The response from the GetUser service method, as returned by
     *         AmazonCognitoIdentityProvider.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserResult getUser() throws AmazonServiceException, AmazonClientException {
        return getUser(new GetUserRequest());
    }
    
    /**
     * <p>
     * Allows a user to delete one's self.
     * </p>
     * 
     * 
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityProvider indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUser() throws AmazonServiceException, AmazonClientException {
        deleteUser(new DeleteUserRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     *
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
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        