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

package com.amazonaws.services.connect;

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

import com.amazonaws.services.connect.model.*;

/**
 * Interface for accessing Amazon Connect asynchronously.
 * <p>
 * Amazon Connect is a cloud-based contact center solution that makes it easy to
 * set up and manage a customer contact center and provide reliable customer
 * engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides rich metrics and real-time reporting that allow you
 * to optimize contact routing. You can also resolve customer issues more
 * efficiently by putting customers in touch with the right agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can
 * create and limits to the number of requests that you can make per second. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
 * >Amazon Connect Service Limits</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 **/
public class AmazonConnectAsyncClient extends AmazonConnectClient implements AmazonConnectAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect. A credentials provider chain will be used that searches for
     * credentials in this order:
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
    public AmazonConnectAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect. A credentials provider chain will be used that searches for
     * credentials in this order:
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
     *            how this client connects to Amazon Connect (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonConnectAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect using the specified AWS account credentials. Default client
     * settings will be used, and a fixed size thread pool will be created for
     * executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonConnectAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect using the specified AWS account credentials and executor service.
     * Default client settings will be used.
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
    public AmazonConnectAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect using the specified AWS account credentials, executor service,
     * and client configuration options.
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
    public AmazonConnectAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect using the specified AWS account credentials provider. Default
     * client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect using the specified AWS account credentials provider and executor
     * service. Default client settings will be used.
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
    public AmazonConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect using the specified AWS account credentials provider and client
     * configuration options.
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
    public AmazonConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect using the specified AWS account credentials provider, executor
     * service, and client configuration options.
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
    public AmazonConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future object containing the response from the CreateUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateUserResult> createUserAsync(final CreateUserRequest createUserRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateUserResult>() {
            public CreateUserResult call() throws Exception {
                return createUser(createUserRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future object containing the response from the CreateUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateUserResult> createUserAsync(final CreateUserRequest createUserRequest,
            final AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateUserResult>() {
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;
                try {
                    result = createUser(createUserRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createUserRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future object containing the response from the DeleteUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteUserAsync(final DeleteUserRequest deleteUserRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteUser(deleteUserRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future object containing the response from the DeleteUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteUserAsync(final DeleteUserRequest deleteUserRequest,
            final AsyncHandler<DeleteUserRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteUser(deleteUserRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteUserRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified user account. You can find the instance ID in the
     * console (it’s the final part of the ARN). The console does not display
     * the user IDs. Instead, list the users and note the IDs provided in the
     * output.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future object containing the response from the
     *         DescribeUser service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeUserResult> describeUserAsync(
            final DescribeUserRequest describeUserRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeUserResult>() {
            public DescribeUserResult call() throws Exception {
                return describeUser(describeUserRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified user account. You can find the instance ID in the
     * console (it’s the final part of the ARN). The console does not display
     * the user IDs. Instead, list the users and note the IDs provided in the
     * output.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future object containing the response from the
     *         DescribeUser service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeUserResult> describeUserAsync(
            final DescribeUserRequest describeUserRequest,
            final AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUserResult>() {
            public DescribeUserResult call() throws Exception {
                DescribeUserResult result = null;
                try {
                    result = describeUser(describeUserRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeUserRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(
            final DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUserHierarchyGroupResult>() {
            public DescribeUserHierarchyGroupResult call() throws Exception {
                return describeUserHierarchyGroup(describeUserHierarchyGroupRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(
            final DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest,
            final AsyncHandler<DescribeUserHierarchyGroupRequest, DescribeUserHierarchyGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUserHierarchyGroupResult>() {
            public DescribeUserHierarchyGroupResult call() throws Exception {
                DescribeUserHierarchyGroupResult result = null;
                try {
                    result = describeUserHierarchyGroup(describeUserHierarchyGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeUserHierarchyGroupRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            final DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUserHierarchyStructureResult>() {
            public DescribeUserHierarchyStructureResult call() throws Exception {
                return describeUserHierarchyStructure(describeUserHierarchyStructureRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            final DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest,
            final AsyncHandler<DescribeUserHierarchyStructureRequest, DescribeUserHierarchyStructureResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUserHierarchyStructureResult>() {
            public DescribeUserHierarchyStructureResult call() throws Exception {
                DescribeUserHierarchyStructureResult result = null;
                try {
                    result = describeUserHierarchyStructure(describeUserHierarchyStructureRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeUserHierarchyStructureRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return A Java Future object containing the response from the
     *         GetContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetContactAttributesResult> getContactAttributesAsync(
            final GetContactAttributesRequest getContactAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetContactAttributesResult>() {
            public GetContactAttributesResult call() throws Exception {
                return getContactAttributes(getContactAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return A Java Future object containing the response from the
     *         GetContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetContactAttributesResult> getContactAttributesAsync(
            final GetContactAttributesRequest getContactAttributesRequest,
            final AsyncHandler<GetContactAttributesRequest, GetContactAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetContactAttributesResult>() {
            public GetContactAttributesResult call() throws Exception {
                GetContactAttributesResult result = null;
                try {
                    result = getContactAttributes(getContactAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getContactAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-reports.html"
     * >Real-time Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return A Java Future object containing the response from the
     *         GetCurrentMetricData service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(
            final GetCurrentMetricDataRequest getCurrentMetricDataRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCurrentMetricDataResult>() {
            public GetCurrentMetricDataResult call() throws Exception {
                return getCurrentMetricData(getCurrentMetricDataRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-reports.html"
     * >Real-time Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return A Java Future object containing the response from the
     *         GetCurrentMetricData service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(
            final GetCurrentMetricDataRequest getCurrentMetricDataRequest,
            final AsyncHandler<GetCurrentMetricDataRequest, GetCurrentMetricDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCurrentMetricDataResult>() {
            public GetCurrentMetricDataResult call() throws Exception {
                GetCurrentMetricDataResult result = null;
                try {
                    result = getCurrentMetricData(getCurrentMetricDataRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getCurrentMetricDataRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return A Java Future object containing the response from the
     *         GetFederationToken service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserNotFoundException
     * @throws InternalServiceException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetFederationTokenResult> getFederationTokenAsync(
            final GetFederationTokenRequest getFederationTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFederationTokenResult>() {
            public GetFederationTokenResult call() throws Exception {
                return getFederationToken(getFederationTokenRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return A Java Future object containing the response from the
     *         GetFederationToken service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserNotFoundException
     * @throws InternalServiceException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetFederationTokenResult> getFederationTokenAsync(
            final GetFederationTokenRequest getFederationTokenRequest,
            final AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFederationTokenResult>() {
            public GetFederationTokenResult call() throws Exception {
                GetFederationTokenResult result = null;
                try {
                    result = getFederationToken(getFederationTokenRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getFederationTokenRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics.html"
     * >Historical Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return A Java Future object containing the response from the
     *         GetMetricData service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetMetricDataResult> getMetricDataAsync(
            final GetMetricDataRequest getMetricDataRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetMetricDataResult>() {
            public GetMetricDataResult call() throws Exception {
                return getMetricData(getMetricDataRequest);
            }
        });
    }

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics.html"
     * >Historical Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return A Java Future object containing the response from the
     *         GetMetricData service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetMetricDataResult> getMetricDataAsync(
            final GetMetricDataRequest getMetricDataRequest,
            final AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMetricDataResult>() {
            public GetMetricDataResult call() throws Exception {
                GetMetricDataResult result = null;
                try {
                    result = getMetricData(getMetricDataRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getMetricDataRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the contact flows for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return A Java Future object containing the response from the
     *         ListContactFlows service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListContactFlowsResult> listContactFlowsAsync(
            final ListContactFlowsRequest listContactFlowsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListContactFlowsResult>() {
            public ListContactFlowsResult call() throws Exception {
                return listContactFlows(listContactFlowsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides information about the contact flows for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return A Java Future object containing the response from the
     *         ListContactFlows service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListContactFlowsResult> listContactFlowsAsync(
            final ListContactFlowsRequest listContactFlowsRequest,
            final AsyncHandler<ListContactFlowsRequest, ListContactFlowsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListContactFlowsResult>() {
            public ListContactFlowsResult call() throws Exception {
                ListContactFlowsResult result = null;
                try {
                    result = listContactFlows(listContactFlowsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listContactFlowsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the hours of operation for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @return A Java Future object containing the response from the
     *         ListHoursOfOperations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(
            final ListHoursOfOperationsRequest listHoursOfOperationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHoursOfOperationsResult>() {
            public ListHoursOfOperationsResult call() throws Exception {
                return listHoursOfOperations(listHoursOfOperationsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides information about the hours of operation for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @return A Java Future object containing the response from the
     *         ListHoursOfOperations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(
            final ListHoursOfOperationsRequest listHoursOfOperationsRequest,
            final AsyncHandler<ListHoursOfOperationsRequest, ListHoursOfOperationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHoursOfOperationsResult>() {
            public ListHoursOfOperationsResult call() throws Exception {
                ListHoursOfOperationsResult result = null;
                try {
                    result = listHoursOfOperations(listHoursOfOperationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listHoursOfOperationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbers service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListPhoneNumbersResult> listPhoneNumbersAsync(
            final ListPhoneNumbersRequest listPhoneNumbersRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListPhoneNumbersResult>() {
            public ListPhoneNumbersResult call() throws Exception {
                return listPhoneNumbers(listPhoneNumbersRequest);
            }
        });
    }

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbers service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListPhoneNumbersResult> listPhoneNumbersAsync(
            final ListPhoneNumbersRequest listPhoneNumbersRequest,
            final AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPhoneNumbersResult>() {
            public ListPhoneNumbersResult call() throws Exception {
                ListPhoneNumbersResult result = null;
                try {
                    result = listPhoneNumbers(listPhoneNumbersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listPhoneNumbersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listQueuesRequest
     * @return A Java Future object containing the response from the ListQueues
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListQueuesResult> listQueuesAsync(final ListQueuesRequest listQueuesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListQueuesResult>() {
            public ListQueuesResult call() throws Exception {
                return listQueues(listQueuesRequest);
            }
        });
    }

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listQueuesRequest
     * @return A Java Future object containing the response from the ListQueues
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListQueuesResult> listQueuesAsync(final ListQueuesRequest listQueuesRequest,
            final AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListQueuesResult>() {
            public ListQueuesResult call() throws Exception {
                ListQueuesResult result = null;
                try {
                    result = listQueues(listQueuesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listQueuesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return A Java Future object containing the response from the
     *         ListRoutingProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListRoutingProfilesResult> listRoutingProfilesAsync(
            final ListRoutingProfilesRequest listRoutingProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRoutingProfilesResult>() {
            public ListRoutingProfilesResult call() throws Exception {
                return listRoutingProfiles(listRoutingProfilesRequest);
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return A Java Future object containing the response from the
     *         ListRoutingProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListRoutingProfilesResult> listRoutingProfilesAsync(
            final ListRoutingProfilesRequest listRoutingProfilesRequest,
            final AsyncHandler<ListRoutingProfilesRequest, ListRoutingProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRoutingProfilesResult>() {
            public ListRoutingProfilesResult call() throws Exception {
                ListRoutingProfilesResult result = null;
                try {
                    result = listRoutingProfiles(listRoutingProfilesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listRoutingProfilesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the security profiles for the
     * specified Amazon Connect instance.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListSecurityProfilesResult> listSecurityProfilesAsync(
            final ListSecurityProfilesRequest listSecurityProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSecurityProfilesResult>() {
            public ListSecurityProfilesResult call() throws Exception {
                return listSecurityProfiles(listSecurityProfilesRequest);
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the security profiles for the
     * specified Amazon Connect instance.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListSecurityProfilesResult> listSecurityProfilesAsync(
            final ListSecurityProfilesRequest listSecurityProfilesRequest,
            final AsyncHandler<ListSecurityProfilesRequest, ListSecurityProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSecurityProfilesResult>() {
            public ListSecurityProfilesResult call() throws Exception {
                ListSecurityProfilesResult result = null;
                try {
                    result = listSecurityProfiles(listSecurityProfilesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listSecurityProfilesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Provides summary information about the hierarchy groups for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return A Java Future object containing the response from the
     *         ListUserHierarchyGroups service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(
            final ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListUserHierarchyGroupsResult>() {
            public ListUserHierarchyGroupsResult call() throws Exception {
                return listUserHierarchyGroups(listUserHierarchyGroupsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return A Java Future object containing the response from the
     *         ListUserHierarchyGroups service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(
            final ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest,
            final AsyncHandler<ListUserHierarchyGroupsRequest, ListUserHierarchyGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListUserHierarchyGroupsResult>() {
            public ListUserHierarchyGroupsResult call() throws Exception {
                ListUserHierarchyGroupsResult result = null;
                try {
                    result = listUserHierarchyGroups(listUserHierarchyGroupsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listUserHierarchyGroupsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future object containing the response from the ListUsers
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListUsersResult> listUsersAsync(final ListUsersRequest listUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListUsersResult>() {
            public ListUsersResult call() throws Exception {
                return listUsers(listUsersRequest);
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future object containing the response from the ListUsers
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListUsersResult> listUsersAsync(final ListUsersRequest listUsersRequest,
            final AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListUsersResult>() {
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;
                try {
                    result = listUsers(listUsersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listUsersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Initiates a contact flow to place an outbound call to a customer.
     * </p>
     * <p>
     * There is a 60 second dialing timeout for this operation. If the call is
     * not connected after 60 seconds, it fails.
     * </p>
     * 
     * @param startOutboundVoiceContactRequest
     * @return A Java Future object containing the response from the
     *         StartOutboundVoiceContact service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws DestinationNotAllowedException
     * @throws OutboundContactNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            final StartOutboundVoiceContactRequest startOutboundVoiceContactRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartOutboundVoiceContactResult>() {
            public StartOutboundVoiceContactResult call() throws Exception {
                return startOutboundVoiceContact(startOutboundVoiceContactRequest);
            }
        });
    }

    /**
     * <p>
     * Initiates a contact flow to place an outbound call to a customer.
     * </p>
     * <p>
     * There is a 60 second dialing timeout for this operation. If the call is
     * not connected after 60 seconds, it fails.
     * </p>
     * 
     * @param startOutboundVoiceContactRequest
     * @return A Java Future object containing the response from the
     *         StartOutboundVoiceContact service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws DestinationNotAllowedException
     * @throws OutboundContactNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            final StartOutboundVoiceContactRequest startOutboundVoiceContactRequest,
            final AsyncHandler<StartOutboundVoiceContactRequest, StartOutboundVoiceContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartOutboundVoiceContactResult>() {
            public StartOutboundVoiceContactResult call() throws Exception {
                StartOutboundVoiceContactResult result = null;
                try {
                    result = startOutboundVoiceContact(startOutboundVoiceContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startOutboundVoiceContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Ends the specified contact.
     * </p>
     * 
     * @param stopContactRequest
     * @return A Java Future object containing the response from the StopContact
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ContactNotFoundException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopContactResult> stopContactAsync(final StopContactRequest stopContactRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopContactResult>() {
            public StopContactResult call() throws Exception {
                return stopContact(stopContactRequest);
            }
        });
    }

    /**
     * <p>
     * Ends the specified contact.
     * </p>
     * 
     * @param stopContactRequest
     * @return A Java Future object containing the response from the StopContact
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ContactNotFoundException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopContactResult> stopContactAsync(final StopContactRequest stopContactRequest,
            final AsyncHandler<StopContactRequest, StopContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopContactResult>() {
            public StopContactResult call() throws Exception {
                StopContactResult result = null;
                try {
                    result = stopContact(stopContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(stopContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * The supported resource type is users.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> tagResourceAsync(final TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                tagResource(tagResourceRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * The supported resource type is users.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> tagResourceAsync(final TagResourceRequest tagResourceRequest,
            final AsyncHandler<TagResourceRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    tagResource(tagResourceRequest);
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
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> untagResourceAsync(final UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                untagResource(untagResourceRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> untagResourceAsync(final UntagResourceRequest untagResourceRequest,
            final AsyncHandler<UntagResourceRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    untagResource(untagResourceRequest);
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
     * Creates or updates the contact attributes associated with the specified
     * contact.
     * </p>
     * <p>
     * You can add or update attributes for both ongoing and completed contacts.
     * For example, you can update the customer's name or the reason the
     * customer called while the call is active, or add notes about steps that
     * the agent took during the call that are displayed to the next agent that
     * takes the call. You can also update attributes for a contact using data
     * from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal
     * review or identifying abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are
     * then deleted.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for
     * contacts that occurred prior to the release of the API, September 12,
     * 2018. You can update attributes only for contacts that started after the
     * release of the API. If you attempt to update attributes for a contact
     * that occurred prior to the release of the API, a 400 error is returned.
     * This applies also to queued callbacks that were initiated prior to the
     * release of the API but are still active in your instance.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactAttributesResult> updateContactAttributesAsync(
            final UpdateContactAttributesRequest updateContactAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactAttributesResult>() {
            public UpdateContactAttributesResult call() throws Exception {
                return updateContactAttributes(updateContactAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Creates or updates the contact attributes associated with the specified
     * contact.
     * </p>
     * <p>
     * You can add or update attributes for both ongoing and completed contacts.
     * For example, you can update the customer's name or the reason the
     * customer called while the call is active, or add notes about steps that
     * the agent took during the call that are displayed to the next agent that
     * takes the call. You can also update attributes for a contact using data
     * from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal
     * review or identifying abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are
     * then deleted.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for
     * contacts that occurred prior to the release of the API, September 12,
     * 2018. You can update attributes only for contacts that started after the
     * release of the API. If you attempt to update attributes for a contact
     * that occurred prior to the release of the API, a 400 error is returned.
     * This applies also to queued callbacks that were initiated prior to the
     * release of the API but are still active in your instance.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactAttributesResult> updateContactAttributesAsync(
            final UpdateContactAttributesRequest updateContactAttributesRequest,
            final AsyncHandler<UpdateContactAttributesRequest, UpdateContactAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactAttributesResult>() {
            public UpdateContactAttributesResult call() throws Exception {
                UpdateContactAttributesResult result = null;
                try {
                    result = updateContactAttributes(updateContactAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchy service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserHierarchyAsync(
            final UpdateUserHierarchyRequest updateUserHierarchyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserHierarchy(updateUserHierarchyRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchy service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserHierarchyAsync(
            final UpdateUserHierarchyRequest updateUserHierarchyRequest,
            final AsyncHandler<UpdateUserHierarchyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateUserHierarchy(updateUserHierarchyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateUserHierarchyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * 
     * @param updateUserIdentityInfoRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserIdentityInfo service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserIdentityInfoAsync(
            final UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserIdentityInfo(updateUserIdentityInfoRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * 
     * @param updateUserIdentityInfoRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserIdentityInfo service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserIdentityInfoAsync(
            final UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest,
            final AsyncHandler<UpdateUserIdentityInfoRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateUserIdentityInfo(updateUserIdentityInfoRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateUserIdentityInfoRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserPhoneConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserPhoneConfigAsync(
            final UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserPhoneConfig(updateUserPhoneConfigRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserPhoneConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserPhoneConfigAsync(
            final UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest,
            final AsyncHandler<UpdateUserPhoneConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateUserPhoneConfig(updateUserPhoneConfigRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateUserPhoneConfigRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserRoutingProfileAsync(
            final UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserRoutingProfile(updateUserRoutingProfileRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserRoutingProfileAsync(
            final UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest,
            final AsyncHandler<UpdateUserRoutingProfileRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateUserRoutingProfile(updateUserRoutingProfileRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateUserRoutingProfileRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserSecurityProfilesAsync(
            final UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserSecurityProfiles(updateUserSecurityProfilesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateUserSecurityProfilesAsync(
            final UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest,
            final AsyncHandler<UpdateUserSecurityProfilesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateUserSecurityProfiles(updateUserSecurityProfilesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateUserSecurityProfilesRequest, result);
                return result;
            }
        });
    }

}
