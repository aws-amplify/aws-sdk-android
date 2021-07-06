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

package com.amazonaws.services.sns;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.sns.model.*;

/**
 * Interface for accessing Amazon Simple Notification Service asynchronously.
 * <fullname>Amazon Simple Notification Service</fullname>
 * <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables
 * you to build distributed web-enabled applications. Applications can use
 * Amazon SNS to easily push real-time notification messages to interested
 * subscribers over multiple delivery protocols. For more information about this
 * product see the <a href="http://aws.amazon.com/sns/">Amazon SNS product
 * page</a>. For detailed information about Amazon SNS features and their
 * associated API calls, see the <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/">Amazon SNS Developer
 * Guide</a>.
 * </p>
 * <p>
 * For information on the permissions you need to use this API, see <a href=
 * "https://docs.aws.amazon.com/sns/latest/dg/sns-authentication-and-access-control.html"
 * >Identity and access management in Amazon SNS</a> in the <i>Amazon SNS
 * Developer Guide.</i>
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred
 * programming language. The SDKs contain functionality that automatically takes
 * care of tasks such as: cryptographically signing your service requests,
 * retrying requests, and handling error responses. For a list of available
 * SDKs, go to <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 **/
public class AmazonSNSAsyncClient extends AmazonSNSClient implements AmazonSNSAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Notification Service. A credentials provider chain will be used
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
    public AmazonSNSAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Notification Service. A credentials provider chain will be used
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
     *            how this client connects to Amazon Simple Notification Service
     *            (ex: proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonSNSAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Notification Service using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will
     * be created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Notification Service using the specified AWS account credentials
     * and executor service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Notification Service using the specified AWS account credentials,
     * executor service, and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Notification Service using the specified AWS account credentials
     * provider. Default client settings will be used, and a fixed size thread
     * pool will be created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Notification Service using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Notification Service using the specified AWS account credentials
     * provider and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     */
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Notification Service using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }

    /**
     * <p>
     * Adds a statement to a topic's access control policy, granting access for
     * the specified accounts to the specified actions.
     * </p>
     * 
     * @param addPermissionRequest
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> addPermissionAsync(final AddPermissionRequest addPermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                addPermission(addPermissionRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Adds a statement to a topic's access control policy, granting access for
     * the specified accounts to the specified actions.
     * </p>
     * 
     * @param addPermissionRequest
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> addPermissionAsync(final AddPermissionRequest addPermissionRequest,
            final AsyncHandler<AddPermissionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    addPermission(addPermissionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(addPermissionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Accepts a phone number and indicates whether the phone holder has opted
     * out of receiving SMS messages from your account. You cannot send SMS
     * messages to a number that is opted out.
     * </p>
     * <p>
     * To resume sending messages, you can opt in the number by using the
     * <code>OptInPhoneNumber</code> action.
     * </p>
     * 
     * @param checkIfPhoneNumberIsOptedOutRequest <p>
     *            The input for the <code>CheckIfPhoneNumberIsOptedOut</code>
     *            action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CheckIfPhoneNumberIsOptedOut service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(
            final CheckIfPhoneNumberIsOptedOutRequest checkIfPhoneNumberIsOptedOutRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CheckIfPhoneNumberIsOptedOutResult>() {
            public CheckIfPhoneNumberIsOptedOutResult call() throws Exception {
                return checkIfPhoneNumberIsOptedOut(checkIfPhoneNumberIsOptedOutRequest);
            }
        });
    }

    /**
     * <p>
     * Accepts a phone number and indicates whether the phone holder has opted
     * out of receiving SMS messages from your account. You cannot send SMS
     * messages to a number that is opted out.
     * </p>
     * <p>
     * To resume sending messages, you can opt in the number by using the
     * <code>OptInPhoneNumber</code> action.
     * </p>
     * 
     * @param checkIfPhoneNumberIsOptedOutRequest <p>
     *            The input for the <code>CheckIfPhoneNumberIsOptedOut</code>
     *            action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CheckIfPhoneNumberIsOptedOut service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CheckIfPhoneNumberIsOptedOutResult> checkIfPhoneNumberIsOptedOutAsync(
            final CheckIfPhoneNumberIsOptedOutRequest checkIfPhoneNumberIsOptedOutRequest,
            final AsyncHandler<CheckIfPhoneNumberIsOptedOutRequest, CheckIfPhoneNumberIsOptedOutResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CheckIfPhoneNumberIsOptedOutResult>() {
            public CheckIfPhoneNumberIsOptedOutResult call() throws Exception {
                CheckIfPhoneNumberIsOptedOutResult result = null;
                try {
                    result = checkIfPhoneNumberIsOptedOut(checkIfPhoneNumberIsOptedOutRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(checkIfPhoneNumberIsOptedOutRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the
     * token sent to the endpoint by an earlier <code>Subscribe</code> action.
     * If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only
     * when the <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param confirmSubscriptionRequest <p>
     *            Input for ConfirmSubscription action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ConfirmSubscription service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     * @throws NotFoundException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws FilterPolicyLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            final ConfirmSubscriptionRequest confirmSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmSubscriptionResult>() {
            public ConfirmSubscriptionResult call() throws Exception {
                return confirmSubscription(confirmSubscriptionRequest);
            }
        });
    }

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the
     * token sent to the endpoint by an earlier <code>Subscribe</code> action.
     * If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only
     * when the <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param confirmSubscriptionRequest <p>
     *            Input for ConfirmSubscription action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ConfirmSubscription service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     * @throws NotFoundException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws FilterPolicyLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            final ConfirmSubscriptionRequest confirmSubscriptionRequest,
            final AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmSubscriptionResult>() {
            public ConfirmSubscriptionResult call() throws Exception {
                ConfirmSubscriptionResult result = null;
                try {
                    result = confirmSubscription(confirmSubscriptionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(confirmSubscriptionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging),
     * to which devices and mobile apps may register. You must specify
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code>
     * attributes when using the <code>CreatePlatformApplication</code> action.
     * </p>
     * <p>
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code> are
     * received from the notification service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>ADM</code>, <code>PlatformPrincipal</code> is
     * <code>client id</code> and <code>PlatformCredential</code> is
     * <code>client secret</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>Baidu</code>, <code>PlatformPrincipal</code> is
     * <code>API key</code> and <code>PlatformCredential</code> is
     * <code>secret key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>APNS</code> and <code>APNS_SANDBOX</code>,
     * <code>PlatformPrincipal</code> is <code>SSL certificate</code> and
     * <code>PlatformCredential</code> is <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>GCM</code> (Firebase Cloud Messaging), there is no
     * <code>PlatformPrincipal</code> and the <code>PlatformCredential</code> is
     * <code>API key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>MPNS</code>, <code>PlatformPrincipal</code> is
     * <code>TLS certificate</code> and <code>PlatformCredential</code> is
     * <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>WNS</code>, <code>PlatformPrincipal</code> is
     * <code>Package Security Identifier</code> and
     * <code>PlatformCredential</code> is <code>secret key</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use the returned <code>PlatformApplicationArn</code> as an
     * attribute for the <code>CreatePlatformEndpoint</code> action.
     * </p>
     * 
     * @param createPlatformApplicationRequest <p>
     *            Input for CreatePlatformApplication action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreatePlatformApplication service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(
            final CreatePlatformApplicationRequest createPlatformApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePlatformApplicationResult>() {
            public CreatePlatformApplicationResult call() throws Exception {
                return createPlatformApplication(createPlatformApplicationRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging),
     * to which devices and mobile apps may register. You must specify
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code>
     * attributes when using the <code>CreatePlatformApplication</code> action.
     * </p>
     * <p>
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code> are
     * received from the notification service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>ADM</code>, <code>PlatformPrincipal</code> is
     * <code>client id</code> and <code>PlatformCredential</code> is
     * <code>client secret</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>Baidu</code>, <code>PlatformPrincipal</code> is
     * <code>API key</code> and <code>PlatformCredential</code> is
     * <code>secret key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>APNS</code> and <code>APNS_SANDBOX</code>,
     * <code>PlatformPrincipal</code> is <code>SSL certificate</code> and
     * <code>PlatformCredential</code> is <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>GCM</code> (Firebase Cloud Messaging), there is no
     * <code>PlatformPrincipal</code> and the <code>PlatformCredential</code> is
     * <code>API key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>MPNS</code>, <code>PlatformPrincipal</code> is
     * <code>TLS certificate</code> and <code>PlatformCredential</code> is
     * <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>WNS</code>, <code>PlatformPrincipal</code> is
     * <code>Package Security Identifier</code> and
     * <code>PlatformCredential</code> is <code>secret key</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use the returned <code>PlatformApplicationArn</code> as an
     * attribute for the <code>CreatePlatformEndpoint</code> action.
     * </p>
     * 
     * @param createPlatformApplicationRequest <p>
     *            Input for CreatePlatformApplication action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreatePlatformApplication service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(
            final CreatePlatformApplicationRequest createPlatformApplicationRequest,
            final AsyncHandler<CreatePlatformApplicationRequest, CreatePlatformApplicationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePlatformApplicationResult>() {
            public CreatePlatformApplicationResult call() throws Exception {
                CreatePlatformApplicationResult result = null;
                try {
                    result = createPlatformApplication(createPlatformApplicationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createPlatformApplicationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates an endpoint for a device and mobile app on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. <code>CreatePlatformEndpoint</code> requires the
     * <code>PlatformApplicationArn</code> that is returned from
     * <code>CreatePlatformApplication</code>. You can use the returned
     * <code>EndpointArn</code> to send a message to a mobile app or by the
     * <code>Subscribe</code> action for subscription to a topic. The
     * <code>CreatePlatformEndpoint</code> action is idempotent, so if the
     * requester already owns an endpoint with the same device token and
     * attributes, that endpoint's ARN is returned without creating a new
     * endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When using <code>CreatePlatformEndpoint</code> with Baidu, two attributes
     * must be provided: ChannelId and UserId. The token field must also contain
     * the ChannelId. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html"
     * >Creating an Amazon SNS Endpoint for Baidu</a>.
     * </p>
     * 
     * @param createPlatformEndpointRequest <p>
     *            Input for CreatePlatformEndpoint action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreatePlatformEndpoint service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(
            final CreatePlatformEndpointRequest createPlatformEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePlatformEndpointResult>() {
            public CreatePlatformEndpointResult call() throws Exception {
                return createPlatformEndpoint(createPlatformEndpointRequest);
            }
        });
    }

    /**
     * <p>
     * Creates an endpoint for a device and mobile app on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. <code>CreatePlatformEndpoint</code> requires the
     * <code>PlatformApplicationArn</code> that is returned from
     * <code>CreatePlatformApplication</code>. You can use the returned
     * <code>EndpointArn</code> to send a message to a mobile app or by the
     * <code>Subscribe</code> action for subscription to a topic. The
     * <code>CreatePlatformEndpoint</code> action is idempotent, so if the
     * requester already owns an endpoint with the same device token and
     * attributes, that endpoint's ARN is returned without creating a new
     * endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When using <code>CreatePlatformEndpoint</code> with Baidu, two attributes
     * must be provided: ChannelId and UserId. The token field must also contain
     * the ChannelId. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html"
     * >Creating an Amazon SNS Endpoint for Baidu</a>.
     * </p>
     * 
     * @param createPlatformEndpointRequest <p>
     *            Input for CreatePlatformEndpoint action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreatePlatformEndpoint service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(
            final CreatePlatformEndpointRequest createPlatformEndpointRequest,
            final AsyncHandler<CreatePlatformEndpointRequest, CreatePlatformEndpointResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePlatformEndpointResult>() {
            public CreatePlatformEndpointResult call() throws Exception {
                CreatePlatformEndpointResult result = null;
                try {
                    result = createPlatformEndpoint(createPlatformEndpointRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createPlatformEndpointRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds a destination phone number to an account in the SMS sandbox and
     * sends a one-time password (OTP) to that phone number.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param createSMSSandboxPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         CreateSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws OptedOutException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateSMSSandboxPhoneNumberResult> createSMSSandboxPhoneNumberAsync(
            final CreateSMSSandboxPhoneNumberRequest createSMSSandboxPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSMSSandboxPhoneNumberResult>() {
            public CreateSMSSandboxPhoneNumberResult call() throws Exception {
                return createSMSSandboxPhoneNumber(createSMSSandboxPhoneNumberRequest);
            }
        });
    }

    /**
     * <p>
     * Adds a destination phone number to an account in the SMS sandbox and
     * sends a one-time password (OTP) to that phone number.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param createSMSSandboxPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         CreateSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws OptedOutException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateSMSSandboxPhoneNumberResult> createSMSSandboxPhoneNumberAsync(
            final CreateSMSSandboxPhoneNumberRequest createSMSSandboxPhoneNumberRequest,
            final AsyncHandler<CreateSMSSandboxPhoneNumberRequest, CreateSMSSandboxPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSMSSandboxPhoneNumberResult>() {
            public CreateSMSSandboxPhoneNumberResult call() throws Exception {
                CreateSMSSandboxPhoneNumberResult result = null;
                try {
                    result = createSMSSandboxPhoneNumber(createSMSSandboxPhoneNumberRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createSMSSandboxPhoneNumberRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a topic to which notifications can be published. Users can create
     * at most 100,000 standard topics (at most 1,000 FIFO topics). For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-create-topic.html"
     * >Creating an Amazon SNS topic</a> in the <i>Amazon SNS Developer
     * Guide</i>. This action is idempotent, so if the requester already owns a
     * topic with the specified name, that topic's ARN is returned without
     * creating a new topic.
     * </p>
     * 
     * @param createTopicRequest <p>
     *            Input for CreateTopic action.
     *            </p>
     * @return A Java Future object containing the response from the CreateTopic
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws TopicLimitExceededException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateTopicResult> createTopicAsync(final CreateTopicRequest createTopicRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTopicResult>() {
            public CreateTopicResult call() throws Exception {
                return createTopic(createTopicRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a topic to which notifications can be published. Users can create
     * at most 100,000 standard topics (at most 1,000 FIFO topics). For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-create-topic.html"
     * >Creating an Amazon SNS topic</a> in the <i>Amazon SNS Developer
     * Guide</i>. This action is idempotent, so if the requester already owns a
     * topic with the specified name, that topic's ARN is returned without
     * creating a new topic.
     * </p>
     * 
     * @param createTopicRequest <p>
     *            Input for CreateTopic action.
     *            </p>
     * @return A Java Future object containing the response from the CreateTopic
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws TopicLimitExceededException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateTopicResult> createTopicAsync(final CreateTopicRequest createTopicRequest,
            final AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTopicResult>() {
            public CreateTopicResult call() throws Exception {
                CreateTopicResult result = null;
                try {
                    result = createTopic(createTopicRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createTopicRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This
     * action is idempotent. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When you delete an endpoint that is also subscribed to a topic, then you
     * must also unsubscribe the endpoint from the topic.
     * </p>
     * 
     * @param deleteEndpointRequest <p>
     *            Input for DeleteEndpoint action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteEndpoint service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> deleteEndpointAsync(final DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteEndpoint(deleteEndpointRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This
     * action is idempotent. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When you delete an endpoint that is also subscribed to a topic, then you
     * must also unsubscribe the endpoint from the topic.
     * </p>
     * 
     * @param deleteEndpointRequest <p>
     *            Input for DeleteEndpoint action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteEndpoint service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> deleteEndpointAsync(final DeleteEndpointRequest deleteEndpointRequest,
            final AsyncHandler<DeleteEndpointRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteEndpoint(deleteEndpointRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteEndpointRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param deletePlatformApplicationRequest <p>
     *            Input for DeletePlatformApplication action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeletePlatformApplication service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> deletePlatformApplicationAsync(
            final DeletePlatformApplicationRequest deletePlatformApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deletePlatformApplication(deletePlatformApplicationRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param deletePlatformApplicationRequest <p>
     *            Input for DeletePlatformApplication action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeletePlatformApplication service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> deletePlatformApplicationAsync(
            final DeletePlatformApplicationRequest deletePlatformApplicationRequest,
            final AsyncHandler<DeletePlatformApplicationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deletePlatformApplication(deletePlatformApplicationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deletePlatformApplicationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes an account's verified or pending phone number from the SMS
     * sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param deleteSMSSandboxPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         DeleteSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteSMSSandboxPhoneNumberResult> deleteSMSSandboxPhoneNumberAsync(
            final DeleteSMSSandboxPhoneNumberRequest deleteSMSSandboxPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteSMSSandboxPhoneNumberResult>() {
            public DeleteSMSSandboxPhoneNumberResult call() throws Exception {
                return deleteSMSSandboxPhoneNumber(deleteSMSSandboxPhoneNumberRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes an account's verified or pending phone number from the SMS
     * sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param deleteSMSSandboxPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         DeleteSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteSMSSandboxPhoneNumberResult> deleteSMSSandboxPhoneNumberAsync(
            final DeleteSMSSandboxPhoneNumberRequest deleteSMSSandboxPhoneNumberRequest,
            final AsyncHandler<DeleteSMSSandboxPhoneNumberRequest, DeleteSMSSandboxPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteSMSSandboxPhoneNumberResult>() {
            public DeleteSMSSandboxPhoneNumberResult call() throws Exception {
                DeleteSMSSandboxPhoneNumberResult result = null;
                try {
                    result = deleteSMSSandboxPhoneNumber(deleteSMSSandboxPhoneNumberRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteSMSSandboxPhoneNumberRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent
     * some messages previously sent to the topic from being delivered to
     * subscribers. This action is idempotent, so deleting a topic that does not
     * exist does not result in an error.
     * </p>
     * 
     * @param deleteTopicRequest
     * @return A Java Future object containing the response from the DeleteTopic
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> deleteTopicAsync(final DeleteTopicRequest deleteTopicRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteTopic(deleteTopicRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent
     * some messages previously sent to the topic from being delivered to
     * subscribers. This action is idempotent, so deleting a topic that does not
     * exist does not result in an error.
     * </p>
     * 
     * @param deleteTopicRequest
     * @return A Java Future object containing the response from the DeleteTopic
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> deleteTopicAsync(final DeleteTopicRequest deleteTopicRequest,
            final AsyncHandler<DeleteTopicRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteTopic(deleteTopicRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteTopicRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the endpoint attributes for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getEndpointAttributesRequest <p>
     *            Input for GetEndpointAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetEndpointAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetEndpointAttributesResult> getEndpointAttributesAsync(
            final GetEndpointAttributesRequest getEndpointAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEndpointAttributesResult>() {
            public GetEndpointAttributesResult call() throws Exception {
                return getEndpointAttributes(getEndpointAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the endpoint attributes for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getEndpointAttributesRequest <p>
     *            Input for GetEndpointAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetEndpointAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetEndpointAttributesResult> getEndpointAttributesAsync(
            final GetEndpointAttributesRequest getEndpointAttributesRequest,
            final AsyncHandler<GetEndpointAttributesRequest, GetEndpointAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEndpointAttributesResult>() {
            public GetEndpointAttributesResult call() throws Exception {
                GetEndpointAttributesResult result = null;
                try {
                    result = getEndpointAttributes(getEndpointAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getEndpointAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the attributes of the platform application object for the
     * supported push notification services, such as APNS and GCM (Firebase
     * Cloud Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getPlatformApplicationAttributesRequest <p>
     *            Input for GetPlatformApplicationAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetPlatformApplicationAttributes service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            final GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPlatformApplicationAttributesResult>() {
            public GetPlatformApplicationAttributesResult call() throws Exception {
                return getPlatformApplicationAttributes(getPlatformApplicationAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the attributes of the platform application object for the
     * supported push notification services, such as APNS and GCM (Firebase
     * Cloud Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getPlatformApplicationAttributesRequest <p>
     *            Input for GetPlatformApplicationAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetPlatformApplicationAttributes service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            final GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest,
            final AsyncHandler<GetPlatformApplicationAttributesRequest, GetPlatformApplicationAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPlatformApplicationAttributesResult>() {
            public GetPlatformApplicationAttributesResult call() throws Exception {
                GetPlatformApplicationAttributesResult result = null;
                try {
                    result = getPlatformApplicationAttributes(getPlatformApplicationAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getPlatformApplicationAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the settings for sending SMS messages from your account.
     * </p>
     * <p>
     * These settings are set with the <code>SetSMSAttributes</code> action.
     * </p>
     * 
     * @param getSMSAttributesRequest <p>
     *            The input for the <code>GetSMSAttributes</code> request.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetSMSAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetSMSAttributesResult> getSMSAttributesAsync(
            final GetSMSAttributesRequest getSMSAttributesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetSMSAttributesResult>() {
            public GetSMSAttributesResult call() throws Exception {
                return getSMSAttributes(getSMSAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the settings for sending SMS messages from your account.
     * </p>
     * <p>
     * These settings are set with the <code>SetSMSAttributes</code> action.
     * </p>
     * 
     * @param getSMSAttributesRequest <p>
     *            The input for the <code>GetSMSAttributes</code> request.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetSMSAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetSMSAttributesResult> getSMSAttributesAsync(
            final GetSMSAttributesRequest getSMSAttributesRequest,
            final AsyncHandler<GetSMSAttributesRequest, GetSMSAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSMSAttributesResult>() {
            public GetSMSAttributesResult call() throws Exception {
                GetSMSAttributesResult result = null;
                try {
                    result = getSMSAttributes(getSMSAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getSMSAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the SMS sandbox status for the calling account in the target
     * Region.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param getSMSSandboxAccountStatusRequest
     * @return A Java Future object containing the response from the
     *         GetSMSSandboxAccountStatus service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetSMSSandboxAccountStatusResult> getSMSSandboxAccountStatusAsync(
            final GetSMSSandboxAccountStatusRequest getSMSSandboxAccountStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSMSSandboxAccountStatusResult>() {
            public GetSMSSandboxAccountStatusResult call() throws Exception {
                return getSMSSandboxAccountStatus(getSMSSandboxAccountStatusRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the SMS sandbox status for the calling account in the target
     * Region.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param getSMSSandboxAccountStatusRequest
     * @return A Java Future object containing the response from the
     *         GetSMSSandboxAccountStatus service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetSMSSandboxAccountStatusResult> getSMSSandboxAccountStatusAsync(
            final GetSMSSandboxAccountStatusRequest getSMSSandboxAccountStatusRequest,
            final AsyncHandler<GetSMSSandboxAccountStatusRequest, GetSMSSandboxAccountStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSMSSandboxAccountStatusResult>() {
            public GetSMSSandboxAccountStatusResult call() throws Exception {
                GetSMSSandboxAccountStatusResult result = null;
                try {
                    result = getSMSSandboxAccountStatus(getSMSSandboxAccountStatusRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getSMSSandboxAccountStatusRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns all of the properties of a subscription.
     * </p>
     * 
     * @param getSubscriptionAttributesRequest <p>
     *            Input for GetSubscriptionAttributes.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            final GetSubscriptionAttributesRequest getSubscriptionAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSubscriptionAttributesResult>() {
            public GetSubscriptionAttributesResult call() throws Exception {
                return getSubscriptionAttributes(getSubscriptionAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns all of the properties of a subscription.
     * </p>
     * 
     * @param getSubscriptionAttributesRequest <p>
     *            Input for GetSubscriptionAttributes.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            final GetSubscriptionAttributesRequest getSubscriptionAttributesRequest,
            final AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSubscriptionAttributesResult>() {
            public GetSubscriptionAttributesResult call() throws Exception {
                GetSubscriptionAttributesResult result = null;
                try {
                    result = getSubscriptionAttributes(getSubscriptionAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getSubscriptionAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns all of the properties of a topic. Topic properties returned might
     * differ based on the authorization of the user.
     * </p>
     * 
     * @param getTopicAttributesRequest <p>
     *            Input for GetTopicAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetTopicAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetTopicAttributesResult> getTopicAttributesAsync(
            final GetTopicAttributesRequest getTopicAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTopicAttributesResult>() {
            public GetTopicAttributesResult call() throws Exception {
                return getTopicAttributes(getTopicAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns all of the properties of a topic. Topic properties returned might
     * differ based on the authorization of the user.
     * </p>
     * 
     * @param getTopicAttributesRequest <p>
     *            Input for GetTopicAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetTopicAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetTopicAttributesResult> getTopicAttributesAsync(
            final GetTopicAttributesRequest getTopicAttributesRequest,
            final AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTopicAttributesResult>() {
            public GetTopicAttributesResult call() throws Exception {
                GetTopicAttributesResult result = null;
                try {
                    result = getTopicAttributes(getTopicAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getTopicAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the endpoints and endpoint attributes for devices in a supported
     * push notification service, such as GCM (Firebase Cloud Messaging) and
     * APNS. The results for <code>ListEndpointsByPlatformApplication</code> are
     * paginated and return a limited list of endpoints, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListEndpointsByPlatformApplication</code> again using the NextToken
     * string received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listEndpointsByPlatformApplicationRequest <p>
     *            Input for ListEndpointsByPlatformApplication action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListEndpointsByPlatformApplication service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            final ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEndpointsByPlatformApplicationResult>() {
            public ListEndpointsByPlatformApplicationResult call() throws Exception {
                return listEndpointsByPlatformApplication(listEndpointsByPlatformApplicationRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the endpoints and endpoint attributes for devices in a supported
     * push notification service, such as GCM (Firebase Cloud Messaging) and
     * APNS. The results for <code>ListEndpointsByPlatformApplication</code> are
     * paginated and return a limited list of endpoints, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListEndpointsByPlatformApplication</code> again using the NextToken
     * string received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listEndpointsByPlatformApplicationRequest <p>
     *            Input for ListEndpointsByPlatformApplication action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListEndpointsByPlatformApplication service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            final ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest,
            final AsyncHandler<ListEndpointsByPlatformApplicationRequest, ListEndpointsByPlatformApplicationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEndpointsByPlatformApplicationResult>() {
            public ListEndpointsByPlatformApplicationResult call() throws Exception {
                ListEndpointsByPlatformApplicationResult result = null;
                try {
                    result = listEndpointsByPlatformApplication(listEndpointsByPlatformApplicationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listEndpointsByPlatformApplicationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the calling account's dedicated origination numbers and their
     * metadata. For more information about origination numbers, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/channels-sms-originating-identities-origination-numbers.html"
     * >Origination numbers</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listOriginationNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListOriginationNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws ThrottledException
     * @throws InvalidParameterException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListOriginationNumbersResult> listOriginationNumbersAsync(
            final ListOriginationNumbersRequest listOriginationNumbersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListOriginationNumbersResult>() {
            public ListOriginationNumbersResult call() throws Exception {
                return listOriginationNumbers(listOriginationNumbersRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the calling account's dedicated origination numbers and their
     * metadata. For more information about origination numbers, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/channels-sms-originating-identities-origination-numbers.html"
     * >Origination numbers</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listOriginationNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListOriginationNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws ThrottledException
     * @throws InvalidParameterException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListOriginationNumbersResult> listOriginationNumbersAsync(
            final ListOriginationNumbersRequest listOriginationNumbersRequest,
            final AsyncHandler<ListOriginationNumbersRequest, ListOriginationNumbersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListOriginationNumbersResult>() {
            public ListOriginationNumbersResult call() throws Exception {
                ListOriginationNumbersResult result = null;
                try {
                    result = listOriginationNumbers(listOriginationNumbersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listOriginationNumbersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list of phone numbers that are opted out, meaning you cannot
     * send SMS messages to them.
     * </p>
     * <p>
     * The results for <code>ListPhoneNumbersOptedOut</code> are paginated, and
     * each page returns up to 100 phone numbers. If additional phone numbers
     * are available after the first page of results, then a
     * <code>NextToken</code> string will be returned. To receive the next page,
     * you call <code>ListPhoneNumbersOptedOut</code> again using the
     * <code>NextToken</code> string received from the previous call. When there
     * are no more records to return, <code>NextToken</code> will be null.
     * </p>
     * 
     * @param listPhoneNumbersOptedOutRequest <p>
     *            The input for the <code>ListPhoneNumbersOptedOut</code>
     *            action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbersOptedOut service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(
            final ListPhoneNumbersOptedOutRequest listPhoneNumbersOptedOutRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPhoneNumbersOptedOutResult>() {
            public ListPhoneNumbersOptedOutResult call() throws Exception {
                return listPhoneNumbersOptedOut(listPhoneNumbersOptedOutRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list of phone numbers that are opted out, meaning you cannot
     * send SMS messages to them.
     * </p>
     * <p>
     * The results for <code>ListPhoneNumbersOptedOut</code> are paginated, and
     * each page returns up to 100 phone numbers. If additional phone numbers
     * are available after the first page of results, then a
     * <code>NextToken</code> string will be returned. To receive the next page,
     * you call <code>ListPhoneNumbersOptedOut</code> again using the
     * <code>NextToken</code> string received from the previous call. When there
     * are no more records to return, <code>NextToken</code> will be null.
     * </p>
     * 
     * @param listPhoneNumbersOptedOutRequest <p>
     *            The input for the <code>ListPhoneNumbersOptedOut</code>
     *            action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbersOptedOut service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListPhoneNumbersOptedOutResult> listPhoneNumbersOptedOutAsync(
            final ListPhoneNumbersOptedOutRequest listPhoneNumbersOptedOutRequest,
            final AsyncHandler<ListPhoneNumbersOptedOutRequest, ListPhoneNumbersOptedOutResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPhoneNumbersOptedOutResult>() {
            public ListPhoneNumbersOptedOutResult call() throws Exception {
                ListPhoneNumbersOptedOutResult result = null;
                try {
                    result = listPhoneNumbersOptedOut(listPhoneNumbersOptedOutRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listPhoneNumbersOptedOutRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the platform application objects for the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * The results for <code>ListPlatformApplications</code> are paginated and
     * return a limited list of applications, up to 100. If additional records
     * are available after the first page results, then a NextToken string will
     * be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string received
     * from the previous call. When there are no more records to return,
     * <code>NextToken</code> will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 15 transactions per second (TPS).
     * </p>
     * 
     * @param listPlatformApplicationsRequest <p>
     *            Input for ListPlatformApplications action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListPlatformApplications service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            final ListPlatformApplicationsRequest listPlatformApplicationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPlatformApplicationsResult>() {
            public ListPlatformApplicationsResult call() throws Exception {
                return listPlatformApplications(listPlatformApplicationsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the platform application objects for the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * The results for <code>ListPlatformApplications</code> are paginated and
     * return a limited list of applications, up to 100. If additional records
     * are available after the first page results, then a NextToken string will
     * be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string received
     * from the previous call. When there are no more records to return,
     * <code>NextToken</code> will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 15 transactions per second (TPS).
     * </p>
     * 
     * @param listPlatformApplicationsRequest <p>
     *            Input for ListPlatformApplications action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListPlatformApplications service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            final ListPlatformApplicationsRequest listPlatformApplicationsRequest,
            final AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPlatformApplicationsResult>() {
            public ListPlatformApplicationsResult call() throws Exception {
                ListPlatformApplicationsResult result = null;
                try {
                    result = listPlatformApplications(listPlatformApplicationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listPlatformApplicationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the calling account's current verified and pending destination
     * phone numbers in the SMS sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listSMSSandboxPhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListSMSSandboxPhoneNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListSMSSandboxPhoneNumbersResult> listSMSSandboxPhoneNumbersAsync(
            final ListSMSSandboxPhoneNumbersRequest listSMSSandboxPhoneNumbersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSMSSandboxPhoneNumbersResult>() {
            public ListSMSSandboxPhoneNumbersResult call() throws Exception {
                return listSMSSandboxPhoneNumbers(listSMSSandboxPhoneNumbersRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the calling account's current verified and pending destination
     * phone numbers in the SMS sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listSMSSandboxPhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListSMSSandboxPhoneNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListSMSSandboxPhoneNumbersResult> listSMSSandboxPhoneNumbersAsync(
            final ListSMSSandboxPhoneNumbersRequest listSMSSandboxPhoneNumbersRequest,
            final AsyncHandler<ListSMSSandboxPhoneNumbersRequest, ListSMSSandboxPhoneNumbersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSMSSandboxPhoneNumbersResult>() {
            public ListSMSSandboxPhoneNumbersResult call() throws Exception {
                ListSMSSandboxPhoneNumbersResult result = null;
                try {
                    result = listSMSSandboxPhoneNumbers(listSMSSandboxPhoneNumbersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listSMSSandboxPhoneNumbersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a
     * limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new <code>ListSubscriptions</code>
     * call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsRequest <p>
     *            Input for ListSubscriptions action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListSubscriptions service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsResult> listSubscriptionsAsync(
            final ListSubscriptionsRequest listSubscriptionsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsResult>() {
            public ListSubscriptionsResult call() throws Exception {
                return listSubscriptions(listSubscriptionsRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a
     * limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new <code>ListSubscriptions</code>
     * call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsRequest <p>
     *            Input for ListSubscriptions action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListSubscriptions service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsResult> listSubscriptionsAsync(
            final ListSubscriptionsRequest listSubscriptionsRequest,
            final AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsResult>() {
            public ListSubscriptionsResult call() throws Exception {
                ListSubscriptionsResult result = null;
                try {
                    result = listSubscriptions(listSubscriptionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listSubscriptionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call
     * returns a limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsByTopicRequest <p>
     *            Input for ListSubscriptionsByTopic action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListSubscriptionsByTopic service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            final ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsByTopicResult>() {
            public ListSubscriptionsByTopicResult call() throws Exception {
                return listSubscriptionsByTopic(listSubscriptionsByTopicRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call
     * returns a limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsByTopicRequest <p>
     *            Input for ListSubscriptionsByTopic action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListSubscriptionsByTopic service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            final ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest,
            final AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsByTopicResult>() {
            public ListSubscriptionsByTopicResult call() throws Exception {
                ListSubscriptionsByTopicResult result = null;
                try {
                    result = listSubscriptionsByTopic(listSubscriptionsByTopicRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listSubscriptionsByTopicRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * List all tags added to the specified Amazon SNS topic. For an overview,
     * see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon Simple Notification Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(
            final ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
                return listTagsForResource(listTagsForResourceRequest);
            }
        });
    }

    /**
     * <p>
     * List all tags added to the specified Amazon SNS topic. For an overview,
     * see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon Simple Notification Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(
            final ListTagsForResourceRequest listTagsForResourceRequest,
            final AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;
                try {
                    result = listTagsForResource(listTagsForResourceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTagsForResourceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited
     * list of topics, up to 100. If there are more topics, a
     * <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listTopicsRequest
     * @return A Java Future object containing the response from the ListTopics
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListTopicsResult> listTopicsAsync(final ListTopicsRequest listTopicsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTopicsResult>() {
            public ListTopicsResult call() throws Exception {
                return listTopics(listTopicsRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited
     * list of topics, up to 100. If there are more topics, a
     * <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listTopicsRequest
     * @return A Java Future object containing the response from the ListTopics
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListTopicsResult> listTopicsAsync(final ListTopicsRequest listTopicsRequest,
            final AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTopicsResult>() {
            public ListTopicsResult call() throws Exception {
                ListTopicsResult result = null;
                try {
                    result = listTopics(listTopicsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTopicsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Use this request to opt in a phone number that is opted out, which
     * enables you to resume sending SMS messages to the number.
     * </p>
     * <p>
     * You can opt in a phone number only once every 30 days.
     * </p>
     * 
     * @param optInPhoneNumberRequest <p>
     *            Input for the OptInPhoneNumber action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         OptInPhoneNumber service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<OptInPhoneNumberResult> optInPhoneNumberAsync(
            final OptInPhoneNumberRequest optInPhoneNumberRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<OptInPhoneNumberResult>() {
            public OptInPhoneNumberResult call() throws Exception {
                return optInPhoneNumber(optInPhoneNumberRequest);
            }
        });
    }

    /**
     * <p>
     * Use this request to opt in a phone number that is opted out, which
     * enables you to resume sending SMS messages to the number.
     * </p>
     * <p>
     * You can opt in a phone number only once every 30 days.
     * </p>
     * 
     * @param optInPhoneNumberRequest <p>
     *            Input for the OptInPhoneNumber action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         OptInPhoneNumber service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<OptInPhoneNumberResult> optInPhoneNumberAsync(
            final OptInPhoneNumberRequest optInPhoneNumberRequest,
            final AsyncHandler<OptInPhoneNumberRequest, OptInPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<OptInPhoneNumberResult>() {
            public OptInPhoneNumberResult call() throws Exception {
                OptInPhoneNumberResult result = null;
                try {
                    result = optInPhoneNumber(optInPhoneNumberRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(optInPhoneNumberRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Sends a message to an Amazon SNS topic, a text message (SMS message)
     * directly to a phone number, or a message to a mobile platform endpoint
     * (when you specify the <code>TargetArn</code>).
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each
     * endpoint that is subscribed to the topic. The format of the message
     * depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message has been saved and
     * Amazon SNS will attempt to deliver it shortly.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a mobile
     * endpoint, such as an app on a Kindle device or mobile phone, you must
     * specify the EndpointArn for the TargetArn parameter. The EndpointArn is
     * returned when making a call with the <code>CreatePlatformEndpoint</code>
     * action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html"
     * >Send Custom Platform-Specific Payloads in Messages to Mobile
     * Devices</a>.
     * </p>
     * <important>
     * <p>
     * You can publish messages only to topics and endpoints in the same Region.
     * </p>
     * </important>
     * 
     * @param publishRequest <p>
     *            Input for Publish action.
     *            </p>
     * @return A Java Future object containing the response from the Publish
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InvalidParameterValueException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws EndpointDisabledException
     * @throws PlatformApplicationDisabledException
     * @throws AuthorizationErrorException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws KMSAccessDeniedException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<PublishResult> publishAsync(final PublishRequest publishRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PublishResult>() {
            public PublishResult call() throws Exception {
                return publish(publishRequest);
            }
        });
    }

    /**
     * <p>
     * Sends a message to an Amazon SNS topic, a text message (SMS message)
     * directly to a phone number, or a message to a mobile platform endpoint
     * (when you specify the <code>TargetArn</code>).
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each
     * endpoint that is subscribed to the topic. The format of the message
     * depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message has been saved and
     * Amazon SNS will attempt to deliver it shortly.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a mobile
     * endpoint, such as an app on a Kindle device or mobile phone, you must
     * specify the EndpointArn for the TargetArn parameter. The EndpointArn is
     * returned when making a call with the <code>CreatePlatformEndpoint</code>
     * action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html"
     * >Send Custom Platform-Specific Payloads in Messages to Mobile
     * Devices</a>.
     * </p>
     * <important>
     * <p>
     * You can publish messages only to topics and endpoints in the same Region.
     * </p>
     * </important>
     * 
     * @param publishRequest <p>
     *            Input for Publish action.
     *            </p>
     * @return A Java Future object containing the response from the Publish
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InvalidParameterValueException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws EndpointDisabledException
     * @throws PlatformApplicationDisabledException
     * @throws AuthorizationErrorException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws KMSAccessDeniedException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<PublishResult> publishAsync(final PublishRequest publishRequest,
            final AsyncHandler<PublishRequest, PublishResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PublishResult>() {
            public PublishResult call() throws Exception {
                PublishResult result = null;
                try {
                    result = publish(publishRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(publishRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes a statement from a topic's access control policy.
     * </p>
     * 
     * @param removePermissionRequest <p>
     *            Input for RemovePermission action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> removePermissionAsync(final RemovePermissionRequest removePermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                removePermission(removePermissionRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Removes a statement from a topic's access control policy.
     * </p>
     * 
     * @param removePermissionRequest <p>
     *            Input for RemovePermission action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> removePermissionAsync(
            final RemovePermissionRequest removePermissionRequest,
            final AsyncHandler<RemovePermissionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    removePermission(removePermissionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(removePermissionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Sets the attributes for an endpoint for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param setEndpointAttributesRequest <p>
     *            Input for SetEndpointAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetEndpointAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> setEndpointAttributesAsync(
            final SetEndpointAttributesRequest setEndpointAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setEndpointAttributes(setEndpointAttributesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Sets the attributes for an endpoint for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param setEndpointAttributesRequest <p>
     *            Input for SetEndpointAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetEndpointAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> setEndpointAttributesAsync(
            final SetEndpointAttributesRequest setEndpointAttributesRequest,
            final AsyncHandler<SetEndpointAttributesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    setEndpointAttributes(setEndpointAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setEndpointAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Sets the attributes of the platform application object for the supported
     * push notification services, such as APNS and GCM (Firebase Cloud
     * Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>. For information on configuring
     * attributes for message delivery status, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html"
     * >Using Amazon SNS Application Attributes for Message Delivery Status</a>.
     * </p>
     * 
     * @param setPlatformApplicationAttributesRequest <p>
     *            Input for SetPlatformApplicationAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetPlatformApplicationAttributes service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> setPlatformApplicationAttributesAsync(
            final SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setPlatformApplicationAttributes(setPlatformApplicationAttributesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Sets the attributes of the platform application object for the supported
     * push notification services, such as APNS and GCM (Firebase Cloud
     * Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>. For information on configuring
     * attributes for message delivery status, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html"
     * >Using Amazon SNS Application Attributes for Message Delivery Status</a>.
     * </p>
     * 
     * @param setPlatformApplicationAttributesRequest <p>
     *            Input for SetPlatformApplicationAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetPlatformApplicationAttributes service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> setPlatformApplicationAttributesAsync(
            final SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest,
            final AsyncHandler<SetPlatformApplicationAttributesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    setPlatformApplicationAttributes(setPlatformApplicationAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setPlatformApplicationAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Use this request to set the default settings for sending SMS messages and
     * receiving daily SMS usage reports.
     * </p>
     * <p>
     * You can override some of these settings for a single message when you use
     * the <code>Publish</code> action with the
     * <code>MessageAttributes.entry.N</code> parameter. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html"
     * >Publishing to a mobile phone</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this operation, you must grant the Amazon SNS service principal (
     * <code>sns.amazonaws.com</code>) permission to perform the
     * <code>s3:ListBucket</code> action.
     * </p>
     * </note>
     * 
     * @param setSMSAttributesRequest <p>
     *            The input for the SetSMSAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetSMSAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<SetSMSAttributesResult> setSMSAttributesAsync(
            final SetSMSAttributesRequest setSMSAttributesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<SetSMSAttributesResult>() {
            public SetSMSAttributesResult call() throws Exception {
                return setSMSAttributes(setSMSAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Use this request to set the default settings for sending SMS messages and
     * receiving daily SMS usage reports.
     * </p>
     * <p>
     * You can override some of these settings for a single message when you use
     * the <code>Publish</code> action with the
     * <code>MessageAttributes.entry.N</code> parameter. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html"
     * >Publishing to a mobile phone</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this operation, you must grant the Amazon SNS service principal (
     * <code>sns.amazonaws.com</code>) permission to perform the
     * <code>s3:ListBucket</code> action.
     * </p>
     * </note>
     * 
     * @param setSMSAttributesRequest <p>
     *            The input for the SetSMSAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetSMSAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<SetSMSAttributesResult> setSMSAttributesAsync(
            final SetSMSAttributesRequest setSMSAttributesRequest,
            final AsyncHandler<SetSMSAttributesRequest, SetSMSAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetSMSAttributesResult>() {
            public SetSMSAttributesResult call() throws Exception {
                SetSMSAttributesResult result = null;
                try {
                    result = setSMSAttributes(setSMSAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setSMSAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Allows a subscription owner to set an attribute of the subscription to a
     * new value.
     * </p>
     * 
     * @param setSubscriptionAttributesRequest <p>
     *            Input for SetSubscriptionAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws FilterPolicyLimitExceededException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> setSubscriptionAttributesAsync(
            final SetSubscriptionAttributesRequest setSubscriptionAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setSubscriptionAttributes(setSubscriptionAttributesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Allows a subscription owner to set an attribute of the subscription to a
     * new value.
     * </p>
     * 
     * @param setSubscriptionAttributesRequest <p>
     *            Input for SetSubscriptionAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws FilterPolicyLimitExceededException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> setSubscriptionAttributesAsync(
            final SetSubscriptionAttributesRequest setSubscriptionAttributesRequest,
            final AsyncHandler<SetSubscriptionAttributesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    setSubscriptionAttributes(setSubscriptionAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setSubscriptionAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Allows a topic owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param setTopicAttributesRequest <p>
     *            Input for SetTopicAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetTopicAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> setTopicAttributesAsync(
            final SetTopicAttributesRequest setTopicAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setTopicAttributes(setTopicAttributesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Allows a topic owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param setTopicAttributesRequest <p>
     *            Input for SetTopicAttributes action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetTopicAttributes service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> setTopicAttributesAsync(
            final SetTopicAttributesRequest setTopicAttributesRequest,
            final AsyncHandler<SetTopicAttributesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    setTopicAttributes(setTopicAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setTopicAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Subscribes an endpoint to an Amazon SNS topic. If the endpoint type is
     * HTTP/S or email, or if the endpoint and the topic are not in the same
     * account, the endpoint owner must run the <code>ConfirmSubscription</code>
     * action to confirm the subscription.
     * </p>
     * <p>
     * You call the <code>ConfirmSubscription</code> action with the token from
     * the subscription response. Confirmation tokens are valid for three days.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param subscribeRequest <p>
     *            Input for Subscribe action.
     *            </p>
     * @return A Java Future object containing the response from the Subscribe
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws SubscriptionLimitExceededException
     * @throws FilterPolicyLimitExceededException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<SubscribeResult> subscribeAsync(final SubscribeRequest subscribeRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SubscribeResult>() {
            public SubscribeResult call() throws Exception {
                return subscribe(subscribeRequest);
            }
        });
    }

    /**
     * <p>
     * Subscribes an endpoint to an Amazon SNS topic. If the endpoint type is
     * HTTP/S or email, or if the endpoint and the topic are not in the same
     * account, the endpoint owner must run the <code>ConfirmSubscription</code>
     * action to confirm the subscription.
     * </p>
     * <p>
     * You call the <code>ConfirmSubscription</code> action with the token from
     * the subscription response. Confirmation tokens are valid for three days.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param subscribeRequest <p>
     *            Input for Subscribe action.
     *            </p>
     * @return A Java Future object containing the response from the Subscribe
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws SubscriptionLimitExceededException
     * @throws FilterPolicyLimitExceededException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<SubscribeResult> subscribeAsync(final SubscribeRequest subscribeRequest,
            final AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SubscribeResult>() {
            public SubscribeResult call() throws Exception {
                SubscribeResult result = null;
                try {
                    result = subscribe(subscribeRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(subscribeRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Add tags to the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * When you use topic tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a topic isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SNS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tagging actions are limited to 10 TPS per account, per Region. If your
     * application requires a higher throughput, file a <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=technical"
     * >technical support request</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<TagResourceResult> tagResourceAsync(final TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TagResourceResult>() {
            public TagResourceResult call() throws Exception {
                return tagResource(tagResourceRequest);
            }
        });
    }

    /**
     * <p>
     * Add tags to the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * When you use topic tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a topic isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SNS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tagging actions are limited to 10 TPS per account, per Region. If your
     * application requires a higher throughput, file a <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=technical"
     * >technical support request</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<TagResourceResult> tagResourceAsync(final TagResourceRequest tagResourceRequest,
            final AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TagResourceResult>() {
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;
                try {
                    result = tagResource(tagResourceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(tagResourceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a subscription. If the subscription requires authentication for
     * deletion, only the owner of the subscription or the topic's owner can
     * unsubscribe, and an Amazon Web Services signature is required. If the
     * <code>Unsubscribe</code> call does not require authentication and the
     * requester is not the subscription owner, a final cancellation message is
     * delivered to the endpoint, so that the endpoint owner can easily
     * resubscribe to the topic if the <code>Unsubscribe</code> request was
     * unintended.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param unsubscribeRequest <p>
     *            Input for Unsubscribe action.
     *            </p>
     * @return A Java Future object containing the response from the Unsubscribe
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> unsubscribeAsync(final UnsubscribeRequest unsubscribeRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                unsubscribe(unsubscribeRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a subscription. If the subscription requires authentication for
     * deletion, only the owner of the subscription or the topic's owner can
     * unsubscribe, and an Amazon Web Services signature is required. If the
     * <code>Unsubscribe</code> call does not require authentication and the
     * requester is not the subscription owner, a final cancellation message is
     * delivered to the endpoint, so that the endpoint owner can easily
     * resubscribe to the topic if the <code>Unsubscribe</code> request was
     * unintended.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param unsubscribeRequest <p>
     *            Input for Unsubscribe action.
     *            </p>
     * @return A Java Future object containing the response from the Unsubscribe
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<Void> unsubscribeAsync(final UnsubscribeRequest unsubscribeRequest,
            final AsyncHandler<UnsubscribeRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    unsubscribe(unsubscribeRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(unsubscribeRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Remove tags from the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UntagResourceResult> untagResourceAsync(
            final UntagResourceRequest untagResourceRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UntagResourceResult>() {
            public UntagResourceResult call() throws Exception {
                return untagResource(untagResourceRequest);
            }
        });
    }

    /**
     * <p>
     * Remove tags from the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UntagResourceResult> untagResourceAsync(
            final UntagResourceRequest untagResourceRequest,
            final AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UntagResourceResult>() {
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;
                try {
                    result = untagResource(untagResourceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(untagResourceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Verifies a destination phone number with a one-time password (OTP) for
     * the calling account.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param verifySMSSandboxPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         VerifySMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws VerificationException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<VerifySMSSandboxPhoneNumberResult> verifySMSSandboxPhoneNumberAsync(
            final VerifySMSSandboxPhoneNumberRequest verifySMSSandboxPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifySMSSandboxPhoneNumberResult>() {
            public VerifySMSSandboxPhoneNumberResult call() throws Exception {
                return verifySMSSandboxPhoneNumber(verifySMSSandboxPhoneNumberRequest);
            }
        });
    }

    /**
     * <p>
     * Verifies a destination phone number with a one-time password (OTP) for
     * the calling account.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param verifySMSSandboxPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         VerifySMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws VerificationException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<VerifySMSSandboxPhoneNumberResult> verifySMSSandboxPhoneNumberAsync(
            final VerifySMSSandboxPhoneNumberRequest verifySMSSandboxPhoneNumberRequest,
            final AsyncHandler<VerifySMSSandboxPhoneNumberRequest, VerifySMSSandboxPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifySMSSandboxPhoneNumberResult>() {
            public VerifySMSSandboxPhoneNumberResult call() throws Exception {
                VerifySMSSandboxPhoneNumberResult result = null;
                try {
                    result = verifySMSSandboxPhoneNumber(verifySMSSandboxPhoneNumberRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(verifySMSSandboxPhoneNumberRequest, result);
                return result;
            }
        });
    }

}
