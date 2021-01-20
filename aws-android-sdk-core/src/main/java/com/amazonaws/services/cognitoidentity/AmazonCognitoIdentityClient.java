/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity;

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

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.services.cognitoidentity.model.transform.*;

/**
 * Client for accessing Amazon Cognito Identity. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Amazon Cognito Federated Identities</fullname>
 * <p>
 * Amazon Cognito Federated Identities is a web service that delivers scoped
 * temporary credentials to mobile devices and other untrusted environments. It
 * uniquely identifies a device and supplies the user with a consistent identity
 * over the lifetime of an application.
 * </p>
 * <p>
 * Using Amazon Cognito Federated Identities, you can enable authentication with
 * one or more third-party identity providers (Facebook, Google, or Login with
 * Amazon) or an Amazon Cognito user pool, and you can also choose to support
 * unauthenticated access from your app. Cognito delivers a unique identifier
 * for each user and acts as an OpenID token provider trusted by AWS Security
 * Token Service (STS) to access temporary, limited-privilege AWS credentials.
 * </p>
 * <p>
 * For a description of the authentication flow from the Amazon Cognito
 * Developer Guide see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
 * >Authentication Flow</a>.
 * </p>
 * <p>
 * For more information see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-identity.html"
 * >Amazon Cognito Federated Identities</a>.
 * </p>
 */
public class AmazonCognitoIdentityClient extends AmazonWebServiceClient implements
        AmazonCognitoIdentity {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Cognito Identity
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentity. A credentials provider chain will be used that
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
    public AmazonCognitoIdentityClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentity. A credentials provider chain will be used that
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
     *            how this client connects to AmazonCognitoIdentity (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonCognitoIdentityClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials.
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
     *         AmazonCognitoIdentityClient client = new AmazonCognitoIdentityClient(AWSMobileClient
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
    public AmazonCognitoIdentityClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials and
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
     *         AmazonCognitoIdentityClient client = new AmazonCognitoIdentityClient(AWSMobileClient
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
     *            how this client connects to AmazonCognitoIdentity (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonCognitoIdentityClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials
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
     *         AmazonCognitoIdentityClient client = new AmazonCognitoIdentityClient(AWSMobileClient
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
    public AmazonCognitoIdentityClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials
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
     *         AmazonCognitoIdentityClient client = new AmazonCognitoIdentityClient(AWSMobileClient
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
     *            how this client connects to AmazonCognitoIdentity (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonCognitoIdentityClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonCognitoIdentity (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonCognitoIdentityClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoIdentity using the specified AWS account credentials
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
     *         AmazonCognitoIdentityClient client = new AmazonCognitoIdentityClient(AWSMobileClient
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
     *            how this client connects to AmazonCognitoIdentity (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonCognitoIdentityClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeveloperUserAlreadyRegisteredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ExternalServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidIdentityPoolConfigurationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotAuthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cognito-identity.us-east-1.amazonaws.com");
        this.endpointPrefix = "cognito-identity";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cognitoidentity/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cognitoidentity/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a new identity pool. The identity pool is a store of user
     * identity information that is specific to your AWS account. The keys for
     * <code>SupportedLoginProviders</code> are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Facebook: <code>graph.facebook.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Google: <code>accounts.google.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon: <code>www.amazon.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Twitter: <code>api.twitter.com</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Digits: <code>www.digits.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param createIdentityPoolRequest <p>
     *            Input to the CreateIdentityPool action.
     *            </p>
     * @return createIdentityPoolResult The response from the CreateIdentityPool
     *         service method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateIdentityPoolResult createIdentityPool(
            CreateIdentityPoolRequest createIdentityPoolRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIdentityPoolRequest> request = null;
        Response<CreateIdentityPoolResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIdentityPoolRequestMarshaller()
                        .marshall(createIdentityPoolRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateIdentityPoolResult, JsonUnmarshallerContext> unmarshaller = new CreateIdentityPoolResultJsonUnmarshaller();
            JsonResponseHandler<CreateIdentityPoolResult> responseHandler = new JsonResponseHandler<CreateIdentityPoolResult>(
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
     * Deletes identities from an identity pool. You can specify a list of 1-60
     * identities that you want to delete.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param deleteIdentitiesRequest <p>
     *            Input to the <code>DeleteIdentities</code> action.
     *            </p>
     * @return deleteIdentitiesResult The response from the DeleteIdentities
     *         service method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteIdentitiesResult deleteIdentities(DeleteIdentitiesRequest deleteIdentitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentitiesRequest> request = null;
        Response<DeleteIdentitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentitiesRequestMarshaller().marshall(deleteIdentitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteIdentitiesResult, JsonUnmarshallerContext> unmarshaller = new DeleteIdentitiesResultJsonUnmarshaller();
            JsonResponseHandler<DeleteIdentitiesResult> responseHandler = new JsonResponseHandler<DeleteIdentitiesResult>(
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
     * Deletes an identity pool. Once a pool is deleted, users will not be able
     * to authenticate with the pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param deleteIdentityPoolRequest <p>
     *            Input to the DeleteIdentityPool action.
     *            </p>
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deleteIdentityPool(DeleteIdentityPoolRequest deleteIdentityPoolRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityPoolRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityPoolRequestMarshaller()
                        .marshall(deleteIdentityPoolRequest);
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
     * Returns metadata related to the given identity, including when the
     * identity was created and any associated linked logins.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param describeIdentityRequest <p>
     *            Input to the <code>DescribeIdentity</code> action.
     *            </p>
     * @return describeIdentityResult The response from the DescribeIdentity
     *         service method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeIdentityResult describeIdentity(DescribeIdentityRequest describeIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityRequest> request = null;
        Response<DescribeIdentityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityRequestMarshaller().marshall(describeIdentityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeIdentityResult, JsonUnmarshallerContext> unmarshaller = new DescribeIdentityResultJsonUnmarshaller();
            JsonResponseHandler<DescribeIdentityResult> responseHandler = new JsonResponseHandler<DescribeIdentityResult>(
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
     * Gets details about a particular identity pool, including the pool name,
     * ID description, creation date, and current number of users.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param describeIdentityPoolRequest <p>
     *            Input to the DescribeIdentityPool action.
     *            </p>
     * @return describeIdentityPoolResult The response from the
     *         DescribeIdentityPool service method, as returned by Amazon
     *         Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeIdentityPoolResult describeIdentityPool(
            DescribeIdentityPoolRequest describeIdentityPoolRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityPoolRequest> request = null;
        Response<DescribeIdentityPoolResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityPoolRequestMarshaller()
                        .marshall(describeIdentityPoolRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeIdentityPoolResult, JsonUnmarshallerContext> unmarshaller = new DescribeIdentityPoolResultJsonUnmarshaller();
            JsonResponseHandler<DescribeIdentityPoolResult> responseHandler = new JsonResponseHandler<DescribeIdentityPoolResult>(
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
     * Returns credentials for the provided identity ID. Any provided logins
     * will be validated against supported login providers. If the token is for
     * cognito-identity.amazonaws.com, it will be passed through to AWS Security
     * Token Service with the appropriate role for the token.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getCredentialsForIdentityRequest <p>
     *            Input to the <code>GetCredentialsForIdentity</code> action.
     *            </p>
     * @return getCredentialsForIdentityResult The response from the
     *         GetCredentialsForIdentity service method, as returned by Amazon
     *         Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InvalidIdentityPoolConfigurationException
     * @throws InternalErrorException
     * @throws ExternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetCredentialsForIdentityResult getCredentialsForIdentity(
            GetCredentialsForIdentityRequest getCredentialsForIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCredentialsForIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCredentialsForIdentityRequest> request = null;
        Response<GetCredentialsForIdentityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCredentialsForIdentityRequestMarshaller()
                        .marshall(getCredentialsForIdentityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCredentialsForIdentityResult, JsonUnmarshallerContext> unmarshaller = new GetCredentialsForIdentityResultJsonUnmarshaller();
            JsonResponseHandler<GetCredentialsForIdentityResult> responseHandler = new JsonResponseHandler<GetCredentialsForIdentityResult>(
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
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will
     * create an implicit linked account.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getIdRequest <p>
     *            Input to the GetId action.
     *            </p>
     * @return getIdResult The response from the GetId service method, as
     *         returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws LimitExceededException
     * @throws ExternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetIdResult getId(GetIdRequest getIdRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdRequest> request = null;
        Response<GetIdResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdRequestMarshaller().marshall(getIdRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetIdResult, JsonUnmarshallerContext> unmarshaller = new GetIdResultJsonUnmarshaller();
            JsonResponseHandler<GetIdResult> responseHandler = new JsonResponseHandler<GetIdResult>(
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
     * Gets the roles for an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param getIdentityPoolRolesRequest <p>
     *            Input to the <code>GetIdentityPoolRoles</code> action.
     *            </p>
     * @return getIdentityPoolRolesResult The response from the
     *         GetIdentityPoolRoles service method, as returned by Amazon
     *         Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetIdentityPoolRolesResult getIdentityPoolRoles(
            GetIdentityPoolRolesRequest getIdentityPoolRolesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getIdentityPoolRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityPoolRolesRequest> request = null;
        Response<GetIdentityPoolRolesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityPoolRolesRequestMarshaller()
                        .marshall(getIdentityPoolRolesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetIdentityPoolRolesResult, JsonUnmarshallerContext> unmarshaller = new GetIdentityPoolRolesResultJsonUnmarshaller();
            JsonResponseHandler<GetIdentityPoolRolesResult> responseHandler = new JsonResponseHandler<GetIdentityPoolRolesResult>(
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
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is
     * returned by <a>GetId</a>. You can optionally add additional logins for
     * the identity. Supplying multiple logins creates an implicit link.
     * </p>
     * <p>
     * The OpenID token is valid for 10 minutes.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenRequest <p>
     *            Input to the GetOpenIdToken action.
     *            </p>
     * @return getOpenIdTokenResult The response from the GetOpenIdToken service
     *         method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws ExternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetOpenIdTokenResult getOpenIdToken(GetOpenIdTokenRequest getOpenIdTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOpenIdTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenIdTokenRequest> request = null;
        Response<GetOpenIdTokenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenIdTokenRequestMarshaller().marshall(getOpenIdTokenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOpenIdTokenResult, JsonUnmarshallerContext> unmarshaller = new GetOpenIdTokenResultJsonUnmarshaller();
            JsonResponseHandler<GetOpenIdTokenResult> responseHandler = new JsonResponseHandler<GetOpenIdTokenResult>(
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
     * Registers (or retrieves) a Cognito <code>IdentityId</code> and an OpenID
     * Connect token for a user authenticated by your backend authentication
     * process. Supplying multiple logins will create an implicit linked
     * account. You can only specify one developer provider as part of the
     * <code>Logins</code> map, which is linked to the identity pool. The
     * developer provider is the "domain" by which Cognito will refer to your
     * users.
     * </p>
     * <p>
     * You can use <code>GetOpenIdTokenForDeveloperIdentity</code> to create a
     * new identity and to link new logins (that is, user credentials issued by
     * a public provider or developer provider) to an existing identity. When
     * you want to create a new identity, the <code>IdentityId</code> should be
     * null. When you want to associate a new login with an existing
     * authenticated/unauthenticated identity, you can do so by providing the
     * existing <code>IdentityId</code>. This API will create the identity in
     * the specified <code>IdentityPoolId</code>.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param getOpenIdTokenForDeveloperIdentityRequest <p>
     *            Input to the <code>GetOpenIdTokenForDeveloperIdentity</code>
     *            action.
     *            </p>
     * @return getOpenIdTokenForDeveloperIdentityResult The response from the
     *         GetOpenIdTokenForDeveloperIdentity service method, as returned by
     *         Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws DeveloperUserAlreadyRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentity(
            GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOpenIdTokenForDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenIdTokenForDeveloperIdentityRequest> request = null;
        Response<GetOpenIdTokenForDeveloperIdentityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenIdTokenForDeveloperIdentityRequestMarshaller()
                        .marshall(getOpenIdTokenForDeveloperIdentityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOpenIdTokenForDeveloperIdentityResult, JsonUnmarshallerContext> unmarshaller = new GetOpenIdTokenForDeveloperIdentityResultJsonUnmarshaller();
            JsonResponseHandler<GetOpenIdTokenForDeveloperIdentityResult> responseHandler = new JsonResponseHandler<GetOpenIdTokenForDeveloperIdentityResult>(
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
     * Use <code>GetPrincipalTagAttributeMap</code> to list all mappings between
     * <code>PrincipalTags</code> and user attributes.
     * </p>
     * 
     * @param getPrincipalTagAttributeMapRequest
     * @return getPrincipalTagAttributeMapResult The response from the
     *         GetPrincipalTagAttributeMap service method, as returned by Amazon
     *         Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetPrincipalTagAttributeMapResult getPrincipalTagAttributeMap(
            GetPrincipalTagAttributeMapRequest getPrincipalTagAttributeMapRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPrincipalTagAttributeMapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPrincipalTagAttributeMapRequest> request = null;
        Response<GetPrincipalTagAttributeMapResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPrincipalTagAttributeMapRequestMarshaller()
                        .marshall(getPrincipalTagAttributeMapRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPrincipalTagAttributeMapResult, JsonUnmarshallerContext> unmarshaller = new GetPrincipalTagAttributeMapResultJsonUnmarshaller();
            JsonResponseHandler<GetPrincipalTagAttributeMapResult> responseHandler = new JsonResponseHandler<GetPrincipalTagAttributeMapResult>(
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
     * Lists the identities in an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param listIdentitiesRequest <p>
     *            Input to the ListIdentities action.
     *            </p>
     * @return listIdentitiesResult The response from the ListIdentities service
     *         method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListIdentitiesResult listIdentities(ListIdentitiesRequest listIdentitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentitiesRequest> request = null;
        Response<ListIdentitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentitiesRequestMarshaller().marshall(listIdentitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListIdentitiesResult, JsonUnmarshallerContext> unmarshaller = new ListIdentitiesResultJsonUnmarshaller();
            JsonResponseHandler<ListIdentitiesResult> responseHandler = new JsonResponseHandler<ListIdentitiesResult>(
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
     * Lists all of the Cognito identity pools registered for your account.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param listIdentityPoolsRequest <p>
     *            Input to the ListIdentityPools action.
     *            </p>
     * @return listIdentityPoolsResult The response from the ListIdentityPools
     *         service method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListIdentityPoolsResult listIdentityPools(
            ListIdentityPoolsRequest listIdentityPoolsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listIdentityPoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityPoolsRequest> request = null;
        Response<ListIdentityPoolsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityPoolsRequestMarshaller()
                        .marshall(listIdentityPoolsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListIdentityPoolsResult, JsonUnmarshallerContext> unmarshaller = new ListIdentityPoolsResultJsonUnmarshaller();
            JsonResponseHandler<ListIdentityPoolsResult> responseHandler = new JsonResponseHandler<ListIdentityPoolsResult>(
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
     * Lists the tags that are assigned to an Amazon Cognito identity pool.
     * </p>
     * <p>
     * A tag is a label that you can apply to identity pools to categorize and
     * manage them in different ways, such as by purpose, owner, environment, or
     * other criteria.
     * </p>
     * <p>
     * You can use this action up to 10 times per second, per account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Cognito
     *         Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Retrieves the <code>IdentityID</code> associated with a
     * <code>DeveloperUserIdentifier</code> or the list of
     * <code>DeveloperUserIdentifier</code> values associated with an
     * <code>IdentityId</code> for an existing identity. Either
     * <code>IdentityID</code> or <code>DeveloperUserIdentifier</code> must not
     * be null. If you supply only one of these values, the other value will be
     * searched in the database and returned as a part of the response. If you
     * supply both, <code>DeveloperUserIdentifier</code> will be matched against
     * <code>IdentityID</code>. If the values are verified against the database,
     * the response returns both values and is the same as the request.
     * Otherwise a <code>ResourceConflictException</code> is thrown.
     * </p>
     * <p>
     * <code>LookupDeveloperIdentity</code> is intended for low-throughput
     * control plane operations: for example, to enable customer service to
     * locate an identity ID by username. If you are using it for higher-volume
     * operations such as user authentication, your requests are likely to be
     * throttled. <a>GetOpenIdTokenForDeveloperIdentity</a> is a better option
     * for higher-volume operations for user authentication.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param lookupDeveloperIdentityRequest <p>
     *            Input to the <code>LookupDeveloperIdentityInput</code> action.
     *            </p>
     * @return lookupDeveloperIdentityResult The response from the
     *         LookupDeveloperIdentity service method, as returned by Amazon
     *         Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public LookupDeveloperIdentityResult lookupDeveloperIdentity(
            LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(lookupDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LookupDeveloperIdentityRequest> request = null;
        Response<LookupDeveloperIdentityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LookupDeveloperIdentityRequestMarshaller()
                        .marshall(lookupDeveloperIdentityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<LookupDeveloperIdentityResult, JsonUnmarshallerContext> unmarshaller = new LookupDeveloperIdentityResultJsonUnmarshaller();
            JsonResponseHandler<LookupDeveloperIdentityResult> responseHandler = new JsonResponseHandler<LookupDeveloperIdentityResult>(
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
     * Merges two users having different <code>IdentityId</code>s, existing in
     * the same identity pool, and identified by the same developer provider.
     * You can use this action to request that discrete users be merged and
     * identified as a single user in the Cognito environment. Cognito
     * associates the given source user (<code>SourceUserIdentifier</code>) with
     * the <code>IdentityId</code> of the <code>DestinationUserIdentifier</code>
     * . Only developer-authenticated users can be merged. If the users to be
     * merged are associated with the same public provider, but as two different
     * users, an exception will be thrown.
     * </p>
     * <p>
     * The number of linked logins is limited to 20. So, the number of linked
     * logins for the source user, <code>SourceUserIdentifier</code>, and the
     * destination user, <code>DestinationUserIdentifier</code>, together should
     * not be larger than 20. Otherwise, an exception will be thrown.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param mergeDeveloperIdentitiesRequest <p>
     *            Input to the <code>MergeDeveloperIdentities</code> action.
     *            </p>
     * @return mergeDeveloperIdentitiesResult The response from the
     *         MergeDeveloperIdentities service method, as returned by Amazon
     *         Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public MergeDeveloperIdentitiesResult mergeDeveloperIdentities(
            MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(mergeDeveloperIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeDeveloperIdentitiesRequest> request = null;
        Response<MergeDeveloperIdentitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeDeveloperIdentitiesRequestMarshaller()
                        .marshall(mergeDeveloperIdentitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<MergeDeveloperIdentitiesResult, JsonUnmarshallerContext> unmarshaller = new MergeDeveloperIdentitiesResultJsonUnmarshaller();
            JsonResponseHandler<MergeDeveloperIdentitiesResult> responseHandler = new JsonResponseHandler<MergeDeveloperIdentitiesResult>(
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
     * Sets the roles for an identity pool. These roles are used when making
     * calls to <a>GetCredentialsForIdentity</a> action.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param setIdentityPoolRolesRequest <p>
     *            Input to the <code>SetIdentityPoolRoles</code> action.
     *            </p>
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void setIdentityPoolRoles(SetIdentityPoolRolesRequest setIdentityPoolRolesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setIdentityPoolRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityPoolRolesRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityPoolRolesRequestMarshaller()
                        .marshall(setIdentityPoolRolesRequest);
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
     * You can use this operation to use default (username and clientID)
     * attribute or custom attribute mappings.
     * </p>
     * 
     * @param setPrincipalTagAttributeMapRequest
     * @return setPrincipalTagAttributeMapResult The response from the
     *         SetPrincipalTagAttributeMap service method, as returned by Amazon
     *         Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SetPrincipalTagAttributeMapResult setPrincipalTagAttributeMap(
            SetPrincipalTagAttributeMapRequest setPrincipalTagAttributeMapRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setPrincipalTagAttributeMapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetPrincipalTagAttributeMapRequest> request = null;
        Response<SetPrincipalTagAttributeMapResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetPrincipalTagAttributeMapRequestMarshaller()
                        .marshall(setPrincipalTagAttributeMapRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SetPrincipalTagAttributeMapResult, JsonUnmarshallerContext> unmarshaller = new SetPrincipalTagAttributeMapResultJsonUnmarshaller();
            JsonResponseHandler<SetPrincipalTagAttributeMapResult> responseHandler = new JsonResponseHandler<SetPrincipalTagAttributeMapResult>(
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
     * Assigns a set of tags to the specified Amazon Cognito identity pool. A
     * tag is a label that you can use to categorize and manage identity pools
     * in different ways, such as by purpose, owner, environment, or other
     * criteria.
     * </p>
     * <p>
     * Each tag consists of a key and value, both of which you define. A key is
     * a general category for more specific values. For example, if you have two
     * versions of an identity pool, one for testing and another for production,
     * you might assign an <code>Environment</code> tag key to both identity
     * pools. The value of this key might be <code>Test</code> for one identity
     * pool and <code>Production</code> for the other.
     * </p>
     * <p>
     * Tags are useful for cost tracking and access control. You can activate
     * your tags so that they appear on the Billing and Cost Management console,
     * where you can track the costs associated with your identity pools. In an
     * IAM policy, you can constrain permissions for identity pools based on
     * specific tags or tag values.
     * </p>
     * <p>
     * You can use this action up to 5 times per second, per account. An
     * identity pool can have as many as 50 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Unlinks a <code>DeveloperUserIdentifier</code> from an existing identity.
     * Unlinked developer users will be considered new identities next time they
     * are seen. If, for a given Cognito identity, you remove all federated
     * identities as well as the developer user identifier, the Cognito identity
     * becomes inaccessible.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param unlinkDeveloperIdentityRequest <p>
     *            Input to the <code>UnlinkDeveloperIdentity</code> action.
     *            </p>
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void unlinkDeveloperIdentity(
            UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(unlinkDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnlinkDeveloperIdentityRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnlinkDeveloperIdentityRequestMarshaller()
                        .marshall(unlinkDeveloperIdentityRequest);
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
     * Unlinks a federated identity from an existing account. Unlinked logins
     * will be considered new identities next time they are seen. Removing the
     * last linked login will make this identity inaccessible.
     * </p>
     * <p>
     * This is a public API. You do not need any credentials to call this API.
     * </p>
     * 
     * @param unlinkIdentityRequest <p>
     *            Input to the UnlinkIdentity action.
     *            </p>
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws ExternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void unlinkIdentity(UnlinkIdentityRequest unlinkIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(unlinkIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnlinkIdentityRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnlinkIdentityRequestMarshaller().marshall(unlinkIdentityRequest);
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
     * Removes the specified tags from the specified Amazon Cognito identity
     * pool. You can use this action up to 5 times per second, per account
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Updates an identity pool.
     * </p>
     * <p>
     * You must use AWS Developer credentials to call this API.
     * </p>
     * 
     * @param updateIdentityPoolRequest <p>
     *            An object representing an Amazon Cognito identity pool.
     *            </p>
     * @return updateIdentityPoolResult The response from the UpdateIdentityPool
     *         service method, as returned by Amazon Cognito Identity.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     * @throws InternalErrorException
     * @throws ConcurrentModificationException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Identity indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateIdentityPoolResult updateIdentityPool(
            UpdateIdentityPoolRequest updateIdentityPoolRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdentityPoolRequest> request = null;
        Response<UpdateIdentityPoolResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdentityPoolRequestMarshaller()
                        .marshall(updateIdentityPoolRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateIdentityPoolResult, JsonUnmarshallerContext> unmarshaller = new UpdateIdentityPoolResultJsonUnmarshaller();
            JsonResponseHandler<UpdateIdentityPoolResult> responseHandler = new JsonResponseHandler<UpdateIdentityPoolResult>(
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
