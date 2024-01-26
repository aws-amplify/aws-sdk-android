/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Connect is a cloud-based contact center solution that you use to set
 * up and manage a customer contact center and provide reliable customer
 * engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides metrics and real-time reporting that enable you to
 * optimize contact routing. You can also resolve customer issues more
 * efficiently by getting customers in touch with the appropriate agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can
 * create. There are also limits to the number of requests that you can make per
 * second. For more information, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
 * >Amazon Connect Service Quotas</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 * <p>
 * You can connect programmatically to an Amazon Web Services service by using
 * an endpoint. For a list of Amazon Connect endpoints, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html"
 * >Amazon Connect Endpoints</a>.
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
     * Activates an evaluation form in the specified Amazon Connect instance.
     * After the evaluation form is activated, it is available to start new
     * evaluations based on the form.
     * </p>
     * 
     * @param activateEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         ActivateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ActivateEvaluationFormResult> activateEvaluationFormAsync(
            final ActivateEvaluationFormRequest activateEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivateEvaluationFormResult>() {
            public ActivateEvaluationFormResult call() throws Exception {
                return activateEvaluationForm(activateEvaluationFormRequest);
            }
        });
    }

    /**
     * <p>
     * Activates an evaluation form in the specified Amazon Connect instance.
     * After the evaluation form is activated, it is available to start new
     * evaluations based on the form.
     * </p>
     * 
     * @param activateEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         ActivateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ActivateEvaluationFormResult> activateEvaluationFormAsync(
            final ActivateEvaluationFormRequest activateEvaluationFormRequest,
            final AsyncHandler<ActivateEvaluationFormRequest, ActivateEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivateEvaluationFormResult>() {
            public ActivateEvaluationFormResult call() throws Exception {
                ActivateEvaluationFormResult result = null;
                try {
                    result = activateEvaluationForm(activateEvaluationFormRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(activateEvaluationFormRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates the specified dataset for a Amazon Connect instance with the
     * target account. You can associate only one dataset in a single call.
     * </p>
     * 
     * @param associateAnalyticsDataSetRequest
     * @return A Java Future object containing the response from the
     *         AssociateAnalyticsDataSet service method, as returned by Amazon
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
    public Future<AssociateAnalyticsDataSetResult> associateAnalyticsDataSetAsync(
            final AssociateAnalyticsDataSetRequest associateAnalyticsDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateAnalyticsDataSetResult>() {
            public AssociateAnalyticsDataSetResult call() throws Exception {
                return associateAnalyticsDataSet(associateAnalyticsDataSetRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates the specified dataset for a Amazon Connect instance with the
     * target account. You can associate only one dataset in a single call.
     * </p>
     * 
     * @param associateAnalyticsDataSetRequest
     * @return A Java Future object containing the response from the
     *         AssociateAnalyticsDataSet service method, as returned by Amazon
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
    public Future<AssociateAnalyticsDataSetResult> associateAnalyticsDataSetAsync(
            final AssociateAnalyticsDataSetRequest associateAnalyticsDataSetRequest,
            final AsyncHandler<AssociateAnalyticsDataSetRequest, AssociateAnalyticsDataSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateAnalyticsDataSetResult>() {
            public AssociateAnalyticsDataSetResult call() throws Exception {
                AssociateAnalyticsDataSetResult result = null;
                try {
                    result = associateAnalyticsDataSet(associateAnalyticsDataSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateAnalyticsDataSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
     * @return A Java Future object containing the response from the
     *         AssociateApprovedOrigin service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associateApprovedOriginAsync(
            final AssociateApprovedOriginRequest associateApprovedOriginRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                associateApprovedOrigin(associateApprovedOriginRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
     * @return A Java Future object containing the response from the
     *         AssociateApprovedOrigin service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associateApprovedOriginAsync(
            final AssociateApprovedOriginRequest associateApprovedOriginRequest,
            final AsyncHandler<AssociateApprovedOriginRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    associateApprovedOrigin(associateApprovedOriginRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateApprovedOriginRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param associateBotRequest
     * @return A Java Future object containing the response from the
     *         AssociateBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associateBotAsync(final AssociateBotRequest associateBotRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                associateBot(associateBotRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param associateBotRequest
     * @return A Java Future object containing the response from the
     *         AssociateBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associateBotAsync(final AssociateBotRequest associateBotRequest,
            final AsyncHandler<AssociateBotRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    associateBot(associateBotRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateBotRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Associates an existing vocabulary as the default. Contact Lens for Amazon
     * Connect uses the vocabulary in post-call and real-time analysis sessions
     * for the given language.
     * </p>
     * 
     * @param associateDefaultVocabularyRequest
     * @return A Java Future object containing the response from the
     *         AssociateDefaultVocabulary service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateDefaultVocabularyResult> associateDefaultVocabularyAsync(
            final AssociateDefaultVocabularyRequest associateDefaultVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateDefaultVocabularyResult>() {
            public AssociateDefaultVocabularyResult call() throws Exception {
                return associateDefaultVocabulary(associateDefaultVocabularyRequest);
            }
        });
    }

    /**
     * <p>
     * Associates an existing vocabulary as the default. Contact Lens for Amazon
     * Connect uses the vocabulary in post-call and real-time analysis sessions
     * for the given language.
     * </p>
     * 
     * @param associateDefaultVocabularyRequest
     * @return A Java Future object containing the response from the
     *         AssociateDefaultVocabulary service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateDefaultVocabularyResult> associateDefaultVocabularyAsync(
            final AssociateDefaultVocabularyRequest associateDefaultVocabularyRequest,
            final AsyncHandler<AssociateDefaultVocabularyRequest, AssociateDefaultVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateDefaultVocabularyResult>() {
            public AssociateDefaultVocabularyResult call() throws Exception {
                AssociateDefaultVocabularyResult result = null;
                try {
                    result = associateDefaultVocabulary(associateDefaultVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateDefaultVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Associates a connect resource to a flow.
     * </p>
     * 
     * @param associateFlowRequest
     * @return A Java Future object containing the response from the
     *         AssociateFlow service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateFlowResult> associateFlowAsync(
            final AssociateFlowRequest associateFlowRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<AssociateFlowResult>() {
            public AssociateFlowResult call() throws Exception {
                return associateFlow(associateFlowRequest);
            }
        });
    }

    /**
     * <p>
     * Associates a connect resource to a flow.
     * </p>
     * 
     * @param associateFlowRequest
     * @return A Java Future object containing the response from the
     *         AssociateFlow service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateFlowResult> associateFlowAsync(
            final AssociateFlowRequest associateFlowRequest,
            final AsyncHandler<AssociateFlowRequest, AssociateFlowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateFlowResult>() {
            public AssociateFlowResult call() throws Exception {
                AssociateFlowResult result = null;
                try {
                    result = associateFlow(associateFlowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateFlowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a storage resource type for the first time. You can only
     * associate one type of storage configuration in a single call. This means,
     * for example, that you can't define an instance with multiple S3 buckets
     * for storing chat transcripts.
     * </p>
     * <p>
     * This API does not create a resource that doesn't exist. It only
     * associates it to the instance. Ensure that the resource being specified
     * in the storage configuration, like an S3 bucket, exists when being used
     * for association.
     * </p>
     * 
     * @param associateInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         AssociateInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(
            final AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateInstanceStorageConfigResult>() {
            public AssociateInstanceStorageConfigResult call() throws Exception {
                return associateInstanceStorageConfig(associateInstanceStorageConfigRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a storage resource type for the first time. You can only
     * associate one type of storage configuration in a single call. This means,
     * for example, that you can't define an instance with multiple S3 buckets
     * for storing chat transcripts.
     * </p>
     * <p>
     * This API does not create a resource that doesn't exist. It only
     * associates it to the instance. Ensure that the resource being specified
     * in the storage configuration, like an S3 bucket, exists when being used
     * for association.
     * </p>
     * 
     * @param associateInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         AssociateInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(
            final AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest,
            final AsyncHandler<AssociateInstanceStorageConfigRequest, AssociateInstanceStorageConfigResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateInstanceStorageConfigResult>() {
            public AssociateInstanceStorageConfigResult call() throws Exception {
                AssociateInstanceStorageConfigResult result = null;
                try {
                    result = associateInstanceStorageConfig(associateInstanceStorageConfigRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateInstanceStorageConfigRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Lambda function.
     * </p>
     * 
     * @param associateLambdaFunctionRequest
     * @return A Java Future object containing the response from the
     *         AssociateLambdaFunction service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associateLambdaFunctionAsync(
            final AssociateLambdaFunctionRequest associateLambdaFunctionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                associateLambdaFunction(associateLambdaFunctionRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Lambda function.
     * </p>
     * 
     * @param associateLambdaFunctionRequest
     * @return A Java Future object containing the response from the
     *         AssociateLambdaFunction service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associateLambdaFunctionAsync(
            final AssociateLambdaFunctionRequest associateLambdaFunctionRequest,
            final AsyncHandler<AssociateLambdaFunctionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    associateLambdaFunction(associateLambdaFunctionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateLambdaFunctionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Amazon Lex V1 bot. This API only supports the association of Amazon Lex
     * V1 bots.
     * </p>
     * 
     * @param associateLexBotRequest
     * @return A Java Future object containing the response from the
     *         AssociateLexBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associateLexBotAsync(final AssociateLexBotRequest associateLexBotRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                associateLexBot(associateLexBotRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified
     * Amazon Lex V1 bot. This API only supports the association of Amazon Lex
     * V1 bots.
     * </p>
     * 
     * @param associateLexBotRequest
     * @return A Java Future object containing the response from the
     *         AssociateLexBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associateLexBotAsync(final AssociateLexBotRequest associateLexBotRequest,
            final AsyncHandler<AssociateLexBotRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    associateLexBot(associateLexBotRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateLexBotRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Associates a flow with a phone number claimed to your Amazon Connect
     * instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling this API using an instance in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a
     * full phone number ARN or UUID value for the <code>PhoneNumberId</code>
     * URI request parameter. However, if the number is claimed to a traffic
     * distribution group and you are calling this API using an instance in the
     * alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID
     * is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param associatePhoneNumberContactFlowRequest
     * @return A Java Future object containing the response from the
     *         AssociatePhoneNumberContactFlow service method, as returned by
     *         Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associatePhoneNumberContactFlowAsync(
            final AssociatePhoneNumberContactFlowRequest associatePhoneNumberContactFlowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                associatePhoneNumberContactFlow(associatePhoneNumberContactFlowRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Associates a flow with a phone number claimed to your Amazon Connect
     * instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling this API using an instance in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a
     * full phone number ARN or UUID value for the <code>PhoneNumberId</code>
     * URI request parameter. However, if the number is claimed to a traffic
     * distribution group and you are calling this API using an instance in the
     * alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID
     * is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param associatePhoneNumberContactFlowRequest
     * @return A Java Future object containing the response from the
     *         AssociatePhoneNumberContactFlow service method, as returned by
     *         Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> associatePhoneNumberContactFlowAsync(
            final AssociatePhoneNumberContactFlowRequest associatePhoneNumberContactFlowRequest,
            final AsyncHandler<AssociatePhoneNumberContactFlowRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    associatePhoneNumberContactFlow(associatePhoneNumberContactFlowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associatePhoneNumberContactFlowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a set of quick connects with a queue.
     * </p>
     * 
     * @param associateQueueQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         AssociateQueueQuickConnects service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<Void> associateQueueQuickConnectsAsync(
            final AssociateQueueQuickConnectsRequest associateQueueQuickConnectsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                associateQueueQuickConnects(associateQueueQuickConnectsRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a set of quick connects with a queue.
     * </p>
     * 
     * @param associateQueueQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         AssociateQueueQuickConnects service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<Void> associateQueueQuickConnectsAsync(
            final AssociateQueueQuickConnectsRequest associateQueueQuickConnectsRequest,
            final AsyncHandler<AssociateQueueQuickConnectsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    associateQueueQuickConnects(associateQueueQuickConnectsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateQueueQuickConnectsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         AssociateRoutingProfileQueues service method, as returned by
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
    public Future<Void> associateRoutingProfileQueuesAsync(
            final AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                associateRoutingProfileQueues(associateRoutingProfileQueuesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         AssociateRoutingProfileQueues service method, as returned by
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
    public Future<Void> associateRoutingProfileQueuesAsync(
            final AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest,
            final AsyncHandler<AssociateRoutingProfileQueuesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    associateRoutingProfileQueues(associateRoutingProfileQueuesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateRoutingProfileQueuesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a security key to the instance.
     * </p>
     * 
     * @param associateSecurityKeyRequest
     * @return A Java Future object containing the response from the
     *         AssociateSecurityKey service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(
            final AssociateSecurityKeyRequest associateSecurityKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateSecurityKeyResult>() {
            public AssociateSecurityKeyResult call() throws Exception {
                return associateSecurityKey(associateSecurityKeyRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a security key to the instance.
     * </p>
     * 
     * @param associateSecurityKeyRequest
     * @return A Java Future object containing the response from the
     *         AssociateSecurityKey service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(
            final AssociateSecurityKeyRequest associateSecurityKeyRequest,
            final AsyncHandler<AssociateSecurityKeyRequest, AssociateSecurityKeyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateSecurityKeyResult>() {
            public AssociateSecurityKeyResult call() throws Exception {
                AssociateSecurityKeyResult result = null;
                try {
                    result = associateSecurityKey(associateSecurityKeyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateSecurityKeyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Associates an agent with a traffic distribution group.
     * </p>
     * 
     * @param associateTrafficDistributionGroupUserRequest
     * @return A Java Future object containing the response from the
     *         AssociateTrafficDistributionGroupUser service method, as returned
     *         by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateTrafficDistributionGroupUserResult> associateTrafficDistributionGroupUserAsync(
            final AssociateTrafficDistributionGroupUserRequest associateTrafficDistributionGroupUserRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateTrafficDistributionGroupUserResult>() {
            public AssociateTrafficDistributionGroupUserResult call() throws Exception {
                return associateTrafficDistributionGroupUser(associateTrafficDistributionGroupUserRequest);
            }
        });
    }

    /**
     * <p>
     * Associates an agent with a traffic distribution group.
     * </p>
     * 
     * @param associateTrafficDistributionGroupUserRequest
     * @return A Java Future object containing the response from the
     *         AssociateTrafficDistributionGroupUser service method, as returned
     *         by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AssociateTrafficDistributionGroupUserResult> associateTrafficDistributionGroupUserAsync(
            final AssociateTrafficDistributionGroupUserRequest associateTrafficDistributionGroupUserRequest,
            final AsyncHandler<AssociateTrafficDistributionGroupUserRequest, AssociateTrafficDistributionGroupUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateTrafficDistributionGroupUserResult>() {
            public AssociateTrafficDistributionGroupUserResult call() throws Exception {
                AssociateTrafficDistributionGroupUserResult result = null;
                try {
                    result = associateTrafficDistributionGroupUser(associateTrafficDistributionGroupUserRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateTrafficDistributionGroupUserRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * &gt;Associates a set of proficiencies with a user.
     * </p>
     * 
     * @param associateUserProficienciesRequest
     * @return A Java Future object containing the response from the
     *         AssociateUserProficiencies service method, as returned by Amazon
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
    public Future<Void> associateUserProficienciesAsync(
            final AssociateUserProficienciesRequest associateUserProficienciesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                associateUserProficiencies(associateUserProficienciesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * &gt;Associates a set of proficiencies with a user.
     * </p>
     * 
     * @param associateUserProficienciesRequest
     * @return A Java Future object containing the response from the
     *         AssociateUserProficiencies service method, as returned by Amazon
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
    public Future<Void> associateUserProficienciesAsync(
            final AssociateUserProficienciesRequest associateUserProficienciesRequest,
            final AsyncHandler<AssociateUserProficienciesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    associateUserProficiencies(associateUserProficienciesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(associateUserProficienciesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a list of analytics datasets for a given Amazon Connect
     * instance to a target account. You can associate multiple datasets in a
     * single call.
     * </p>
     * 
     * @param batchAssociateAnalyticsDataSetRequest
     * @return A Java Future object containing the response from the
     *         BatchAssociateAnalyticsDataSet service method, as returned by
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
    public Future<BatchAssociateAnalyticsDataSetResult> batchAssociateAnalyticsDataSetAsync(
            final BatchAssociateAnalyticsDataSetRequest batchAssociateAnalyticsDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchAssociateAnalyticsDataSetResult>() {
            public BatchAssociateAnalyticsDataSetResult call() throws Exception {
                return batchAssociateAnalyticsDataSet(batchAssociateAnalyticsDataSetRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Associates a list of analytics datasets for a given Amazon Connect
     * instance to a target account. You can associate multiple datasets in a
     * single call.
     * </p>
     * 
     * @param batchAssociateAnalyticsDataSetRequest
     * @return A Java Future object containing the response from the
     *         BatchAssociateAnalyticsDataSet service method, as returned by
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
    public Future<BatchAssociateAnalyticsDataSetResult> batchAssociateAnalyticsDataSetAsync(
            final BatchAssociateAnalyticsDataSetRequest batchAssociateAnalyticsDataSetRequest,
            final AsyncHandler<BatchAssociateAnalyticsDataSetRequest, BatchAssociateAnalyticsDataSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchAssociateAnalyticsDataSetResult>() {
            public BatchAssociateAnalyticsDataSetResult call() throws Exception {
                BatchAssociateAnalyticsDataSetResult result = null;
                try {
                    result = batchAssociateAnalyticsDataSet(batchAssociateAnalyticsDataSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchAssociateAnalyticsDataSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Removes a list of analytics datasets associated with a given Amazon
     * Connect instance. You can disassociate multiple datasets in a single
     * call.
     * </p>
     * 
     * @param batchDisassociateAnalyticsDataSetRequest
     * @return A Java Future object containing the response from the
     *         BatchDisassociateAnalyticsDataSet service method, as returned by
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
    public Future<BatchDisassociateAnalyticsDataSetResult> batchDisassociateAnalyticsDataSetAsync(
            final BatchDisassociateAnalyticsDataSetRequest batchDisassociateAnalyticsDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDisassociateAnalyticsDataSetResult>() {
            public BatchDisassociateAnalyticsDataSetResult call() throws Exception {
                return batchDisassociateAnalyticsDataSet(batchDisassociateAnalyticsDataSetRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Removes a list of analytics datasets associated with a given Amazon
     * Connect instance. You can disassociate multiple datasets in a single
     * call.
     * </p>
     * 
     * @param batchDisassociateAnalyticsDataSetRequest
     * @return A Java Future object containing the response from the
     *         BatchDisassociateAnalyticsDataSet service method, as returned by
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
    public Future<BatchDisassociateAnalyticsDataSetResult> batchDisassociateAnalyticsDataSetAsync(
            final BatchDisassociateAnalyticsDataSetRequest batchDisassociateAnalyticsDataSetRequest,
            final AsyncHandler<BatchDisassociateAnalyticsDataSetRequest, BatchDisassociateAnalyticsDataSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDisassociateAnalyticsDataSetResult>() {
            public BatchDisassociateAnalyticsDataSetResult call() throws Exception {
                BatchDisassociateAnalyticsDataSetResult result = null;
                try {
                    result = batchDisassociateAnalyticsDataSet(batchDisassociateAnalyticsDataSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchDisassociateAnalyticsDataSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieve the flow associations for the given resources.
     * </p>
     * 
     * @param batchGetFlowAssociationRequest
     * @return A Java Future object containing the response from the
     *         BatchGetFlowAssociation service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchGetFlowAssociationResult> batchGetFlowAssociationAsync(
            final BatchGetFlowAssociationRequest batchGetFlowAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchGetFlowAssociationResult>() {
            public BatchGetFlowAssociationResult call() throws Exception {
                return batchGetFlowAssociation(batchGetFlowAssociationRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieve the flow associations for the given resources.
     * </p>
     * 
     * @param batchGetFlowAssociationRequest
     * @return A Java Future object containing the response from the
     *         BatchGetFlowAssociation service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchGetFlowAssociationResult> batchGetFlowAssociationAsync(
            final BatchGetFlowAssociationRequest batchGetFlowAssociationRequest,
            final AsyncHandler<BatchGetFlowAssociationRequest, BatchGetFlowAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchGetFlowAssociationResult>() {
            public BatchGetFlowAssociationResult call() throws Exception {
                BatchGetFlowAssociationResult result = null;
                try {
                    result = batchGetFlowAssociation(batchGetFlowAssociationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchGetFlowAssociationRequest, result);
                return result;
            }
        });
    }

    /**
     * <note>
     * <p>
     * Only the Amazon Connect outbound campaigns service principal is allowed
     * to assume a role in your account and call this API.
     * </p>
     * </note>
     * <p>
     * Allows you to create a batch of contacts in Amazon Connect. The outbound
     * campaigns capability ingests dial requests via the <a href=
     * "https://docs.aws.amazon.com/connect-outbound/latest/APIReference/API_PutDialRequestBatch.html"
     * >PutDialRequestBatch</a> API. It then uses BatchPutContact to create
     * contacts corresponding to those dial requests. If agents are available,
     * the dial requests are dialed out, which results in a voice call. The
     * resulting voice call uses the same contactId that was created by
     * BatchPutContact.
     * </p>
     * 
     * @param batchPutContactRequest
     * @return A Java Future object containing the response from the
     *         BatchPutContact service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws IdempotencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchPutContactResult> batchPutContactAsync(
            final BatchPutContactRequest batchPutContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<BatchPutContactResult>() {
            public BatchPutContactResult call() throws Exception {
                return batchPutContact(batchPutContactRequest);
            }
        });
    }

    /**
     * <note>
     * <p>
     * Only the Amazon Connect outbound campaigns service principal is allowed
     * to assume a role in your account and call this API.
     * </p>
     * </note>
     * <p>
     * Allows you to create a batch of contacts in Amazon Connect. The outbound
     * campaigns capability ingests dial requests via the <a href=
     * "https://docs.aws.amazon.com/connect-outbound/latest/APIReference/API_PutDialRequestBatch.html"
     * >PutDialRequestBatch</a> API. It then uses BatchPutContact to create
     * contacts corresponding to those dial requests. If agents are available,
     * the dial requests are dialed out, which results in a voice call. The
     * resulting voice call uses the same contactId that was created by
     * BatchPutContact.
     * </p>
     * 
     * @param batchPutContactRequest
     * @return A Java Future object containing the response from the
     *         BatchPutContact service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws IdempotencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchPutContactResult> batchPutContactAsync(
            final BatchPutContactRequest batchPutContactRequest,
            final AsyncHandler<BatchPutContactRequest, BatchPutContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchPutContactResult>() {
            public BatchPutContactResult call() throws Exception {
                BatchPutContactResult result = null;
                try {
                    result = batchPutContact(batchPutContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchPutContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Claims an available phone number to your Amazon Connect instance or
     * traffic distribution group. You can call this API only in the same Amazon
     * Web Services Region where the Amazon Connect instance or traffic
     * distribution group was created.
     * </p>
     * <p>
     * For more information about how to use this operation, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-number.html"
     * >Claim a phone number in your country</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-numbers-traffic-distribution-groups.html"
     * >Claim phone numbers to traffic distribution groups</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * You can call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html"
     * >SearchAvailablePhoneNumbers</a> API for available phone numbers that you
     * can claim. Call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimPhoneNumber.html"
     * >ClaimPhoneNumber</a> operation.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day
     * period, contact us for a service quota exception. Otherwise, it is
     * possible you will be blocked from claiming and releasing any more numbers
     * until 30 days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of
     * active phone numbers during any 30 day period. If you claim and release
     * phone numbers using the UI or API during a rolling 30 day cycle that
     * exceeds 200% of your phone number service level quota, you will be
     * blocked from claiming any more numbers until 30 days past the oldest
     * number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level
     * quota of 99 phone numbers, and in any 30 day period you release 99, claim
     * 99, and then release 99, you will have exceeded the 200% limit. At that
     * point you are blocked from claiming any more numbers until you open an
     * Amazon Web Services support ticket.
     * </p>
     * 
     * @param claimPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         ClaimPhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ClaimPhoneNumberResult> claimPhoneNumberAsync(
            final ClaimPhoneNumberRequest claimPhoneNumberRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ClaimPhoneNumberResult>() {
            public ClaimPhoneNumberResult call() throws Exception {
                return claimPhoneNumber(claimPhoneNumberRequest);
            }
        });
    }

    /**
     * <p>
     * Claims an available phone number to your Amazon Connect instance or
     * traffic distribution group. You can call this API only in the same Amazon
     * Web Services Region where the Amazon Connect instance or traffic
     * distribution group was created.
     * </p>
     * <p>
     * For more information about how to use this operation, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-number.html"
     * >Claim a phone number in your country</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-numbers-traffic-distribution-groups.html"
     * >Claim phone numbers to traffic distribution groups</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * You can call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html"
     * >SearchAvailablePhoneNumbers</a> API for available phone numbers that you
     * can claim. Call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimPhoneNumber.html"
     * >ClaimPhoneNumber</a> operation.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day
     * period, contact us for a service quota exception. Otherwise, it is
     * possible you will be blocked from claiming and releasing any more numbers
     * until 30 days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of
     * active phone numbers during any 30 day period. If you claim and release
     * phone numbers using the UI or API during a rolling 30 day cycle that
     * exceeds 200% of your phone number service level quota, you will be
     * blocked from claiming any more numbers until 30 days past the oldest
     * number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level
     * quota of 99 phone numbers, and in any 30 day period you release 99, claim
     * 99, and then release 99, you will have exceeded the 200% limit. At that
     * point you are blocked from claiming any more numbers until you open an
     * Amazon Web Services support ticket.
     * </p>
     * 
     * @param claimPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         ClaimPhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ClaimPhoneNumberResult> claimPhoneNumberAsync(
            final ClaimPhoneNumberRequest claimPhoneNumberRequest,
            final AsyncHandler<ClaimPhoneNumberRequest, ClaimPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ClaimPhoneNumberResult>() {
            public ClaimPhoneNumberResult call() throws Exception {
                ClaimPhoneNumberResult result = null;
                try {
                    result = claimPhoneNumber(claimPhoneNumberRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(claimPhoneNumberRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates an agent status for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createAgentStatusRequest
     * @return A Java Future object containing the response from the
     *         CreateAgentStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateAgentStatusResult> createAgentStatusAsync(
            final CreateAgentStatusRequest createAgentStatusRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateAgentStatusResult>() {
            public CreateAgentStatusResult call() throws Exception {
                return createAgentStatus(createAgentStatusRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates an agent status for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createAgentStatusRequest
     * @return A Java Future object containing the response from the
     *         CreateAgentStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateAgentStatusResult> createAgentStatusAsync(
            final CreateAgentStatusRequest createAgentStatusRequest,
            final AsyncHandler<CreateAgentStatusRequest, CreateAgentStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAgentStatusResult>() {
            public CreateAgentStatusResult call() throws Exception {
                CreateAgentStatusResult result = null;
                try {
                    result = createAgentStatus(createAgentStatusRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createAgentStatusRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @return A Java Future object containing the response from the
     *         CreateContactFlow service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidContactFlowException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
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
    public Future<CreateContactFlowResult> createContactFlowAsync(
            final CreateContactFlowRequest createContactFlowRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateContactFlowResult>() {
            public CreateContactFlowResult call() throws Exception {
                return createContactFlow(createContactFlowRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @return A Java Future object containing the response from the
     *         CreateContactFlow service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidContactFlowException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
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
    public Future<CreateContactFlowResult> createContactFlowAsync(
            final CreateContactFlowRequest createContactFlowRequest,
            final AsyncHandler<CreateContactFlowRequest, CreateContactFlowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateContactFlowResult>() {
            public CreateContactFlowResult call() throws Exception {
                CreateContactFlowResult result = null;
                try {
                    result = createContactFlow(createContactFlowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createContactFlowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createContactFlowModuleRequest
     * @return A Java Future object containing the response from the
     *         CreateContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidContactFlowModuleException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws IdempotencyException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateContactFlowModuleResult> createContactFlowModuleAsync(
            final CreateContactFlowModuleRequest createContactFlowModuleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateContactFlowModuleResult>() {
            public CreateContactFlowModuleResult call() throws Exception {
                return createContactFlowModule(createContactFlowModuleRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createContactFlowModuleRequest
     * @return A Java Future object containing the response from the
     *         CreateContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidContactFlowModuleException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws IdempotencyException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateContactFlowModuleResult> createContactFlowModuleAsync(
            final CreateContactFlowModuleRequest createContactFlowModuleRequest,
            final AsyncHandler<CreateContactFlowModuleRequest, CreateContactFlowModuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateContactFlowModuleResult>() {
            public CreateContactFlowModuleResult call() throws Exception {
                CreateContactFlowModuleResult result = null;
                try {
                    result = createContactFlowModule(createContactFlowModuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createContactFlowModuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates an evaluation form in the specified Amazon Connect instance. The
     * form can be used to define questions related to agent performance, and
     * create sections to organize such questions. Question and section
     * identifiers cannot be duplicated within the same evaluation form.
     * </p>
     * 
     * @param createEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         CreateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateEvaluationFormResult> createEvaluationFormAsync(
            final CreateEvaluationFormRequest createEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEvaluationFormResult>() {
            public CreateEvaluationFormResult call() throws Exception {
                return createEvaluationForm(createEvaluationFormRequest);
            }
        });
    }

    /**
     * <p>
     * Creates an evaluation form in the specified Amazon Connect instance. The
     * form can be used to define questions related to agent performance, and
     * create sections to organize such questions. Question and section
     * identifiers cannot be duplicated within the same evaluation form.
     * </p>
     * 
     * @param createEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         CreateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateEvaluationFormResult> createEvaluationFormAsync(
            final CreateEvaluationFormRequest createEvaluationFormRequest,
            final AsyncHandler<CreateEvaluationFormRequest, CreateEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEvaluationFormResult>() {
            public CreateEvaluationFormResult call() throws Exception {
                CreateEvaluationFormResult result = null;
                try {
                    result = createEvaluationForm(createEvaluationFormRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createEvaluationFormRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates hours of operation.
     * </p>
     * 
     * @param createHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         CreateHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateHoursOfOperationResult> createHoursOfOperationAsync(
            final CreateHoursOfOperationRequest createHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHoursOfOperationResult>() {
            public CreateHoursOfOperationResult call() throws Exception {
                return createHoursOfOperation(createHoursOfOperationRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates hours of operation.
     * </p>
     * 
     * @param createHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         CreateHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateHoursOfOperationResult> createHoursOfOperationAsync(
            final CreateHoursOfOperationRequest createHoursOfOperationRequest,
            final AsyncHandler<CreateHoursOfOperationRequest, CreateHoursOfOperationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHoursOfOperationResult>() {
            public CreateHoursOfOperationResult call() throws Exception {
                CreateHoursOfOperationResult result = null;
                try {
                    result = createHoursOfOperation(createHoursOfOperationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createHoursOfOperationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Initiates an Amazon Connect instance with all the supported channels
     * enabled. It does not attach any storage, such as Amazon Simple Storage
     * Service (Amazon S3) or Amazon Kinesis. It also does not allow for any
     * configurations on features, such as Contact Lens for Amazon Connect.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you
     * can create or delete in 30 days. If you exceed this limit, you will get
     * an error message indicating there has been an excessive number of
     * attempts at creating or deleting instances. You must wait 30 days before
     * you can restart creating and deleting instances in your account.
     * </p>
     * 
     * @param createInstanceRequest
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
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
    public Future<CreateInstanceResult> createInstanceAsync(
            final CreateInstanceRequest createInstanceRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateInstanceResult>() {
            public CreateInstanceResult call() throws Exception {
                return createInstance(createInstanceRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Initiates an Amazon Connect instance with all the supported channels
     * enabled. It does not attach any storage, such as Amazon Simple Storage
     * Service (Amazon S3) or Amazon Kinesis. It also does not allow for any
     * configurations on features, such as Contact Lens for Amazon Connect.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you
     * can create or delete in 30 days. If you exceed this limit, you will get
     * an error message indicating there has been an excessive number of
     * attempts at creating or deleting instances. You must wait 30 days before
     * you can restart creating and deleting instances in your account.
     * </p>
     * 
     * @param createInstanceRequest
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
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
    public Future<CreateInstanceResult> createInstanceAsync(
            final CreateInstanceRequest createInstanceRequest,
            final AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateInstanceResult>() {
            public CreateInstanceResult call() throws Exception {
                CreateInstanceResult result = null;
                try {
                    result = createInstance(createInstanceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createInstanceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates an Amazon Web Services resource association with an Amazon
     * Connect instance.
     * </p>
     * 
     * @param createIntegrationAssociationRequest
     * @return A Java Future object containing the response from the
     *         CreateIntegrationAssociation service method, as returned by
     *         Amazon Connect.
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(
            final CreateIntegrationAssociationRequest createIntegrationAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateIntegrationAssociationResult>() {
            public CreateIntegrationAssociationResult call() throws Exception {
                return createIntegrationAssociation(createIntegrationAssociationRequest);
            }
        });
    }

    /**
     * <p>
     * Creates an Amazon Web Services resource association with an Amazon
     * Connect instance.
     * </p>
     * 
     * @param createIntegrationAssociationRequest
     * @return A Java Future object containing the response from the
     *         CreateIntegrationAssociation service method, as returned by
     *         Amazon Connect.
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(
            final CreateIntegrationAssociationRequest createIntegrationAssociationRequest,
            final AsyncHandler<CreateIntegrationAssociationRequest, CreateIntegrationAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateIntegrationAssociationResult>() {
            public CreateIntegrationAssociationResult call() throws Exception {
                CreateIntegrationAssociationResult result = null;
                try {
                    result = createIntegrationAssociation(createIntegrationAssociationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createIntegrationAssociationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds a new participant into an on-going chat contact. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-customize-flow.html"
     * >Customize chat flow experiences by integrating custom participants</a>.
     * </p>
     * 
     * @param createParticipantRequest
     * @return A Java Future object containing the response from the
     *         CreateParticipant service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateParticipantResult> createParticipantAsync(
            final CreateParticipantRequest createParticipantRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateParticipantResult>() {
            public CreateParticipantResult call() throws Exception {
                return createParticipant(createParticipantRequest);
            }
        });
    }

    /**
     * <p>
     * Adds a new participant into an on-going chat contact. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-customize-flow.html"
     * >Customize chat flow experiences by integrating custom participants</a>.
     * </p>
     * 
     * @param createParticipantRequest
     * @return A Java Future object containing the response from the
     *         CreateParticipant service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateParticipantResult> createParticipantAsync(
            final CreateParticipantRequest createParticipantRequest,
            final AsyncHandler<CreateParticipantRequest, CreateParticipantResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateParticipantResult>() {
            public CreateParticipantResult call() throws Exception {
                CreateParticipantResult result = null;
                try {
                    result = createParticipant(createParticipantRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createParticipantRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Enables rehydration of chats for the lifespan of a contact. For more
     * information about chat rehydration, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
     * >Enable persistent chat</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param createPersistentContactAssociationRequest
     * @return A Java Future object containing the response from the
     *         CreatePersistentContactAssociation service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
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
    public Future<CreatePersistentContactAssociationResult> createPersistentContactAssociationAsync(
            final CreatePersistentContactAssociationRequest createPersistentContactAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePersistentContactAssociationResult>() {
            public CreatePersistentContactAssociationResult call() throws Exception {
                return createPersistentContactAssociation(createPersistentContactAssociationRequest);
            }
        });
    }

    /**
     * <p>
     * Enables rehydration of chats for the lifespan of a contact. For more
     * information about chat rehydration, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
     * >Enable persistent chat</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param createPersistentContactAssociationRequest
     * @return A Java Future object containing the response from the
     *         CreatePersistentContactAssociation service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
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
    public Future<CreatePersistentContactAssociationResult> createPersistentContactAssociationAsync(
            final CreatePersistentContactAssociationRequest createPersistentContactAssociationRequest,
            final AsyncHandler<CreatePersistentContactAssociationRequest, CreatePersistentContactAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePersistentContactAssociationResult>() {
            public CreatePersistentContactAssociationResult call() throws Exception {
                CreatePersistentContactAssociationResult result = null;
                try {
                    result = createPersistentContactAssociation(createPersistentContactAssociationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createPersistentContactAssociationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new predefined attribute for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param createPredefinedAttributeRequest
     * @return A Java Future object containing the response from the
     *         CreatePredefinedAttribute service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
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
    public Future<Void> createPredefinedAttributeAsync(
            final CreatePredefinedAttributeRequest createPredefinedAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createPredefinedAttribute(createPredefinedAttributeRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Creates a new predefined attribute for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param createPredefinedAttributeRequest
     * @return A Java Future object containing the response from the
     *         CreatePredefinedAttribute service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
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
    public Future<Void> createPredefinedAttributeAsync(
            final CreatePredefinedAttributeRequest createPredefinedAttributeRequest,
            final AsyncHandler<CreatePredefinedAttributeRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    createPredefinedAttribute(createPredefinedAttributeRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createPredefinedAttributeRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a prompt. For more information about prompts, such as supported
     * file types and maximum length, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/prompts.html"
     * >Create prompts</a> in the <i>Amazon Connect Administrator's Guide</i>.
     * </p>
     * 
     * @param createPromptRequest
     * @return A Java Future object containing the response from the
     *         CreatePrompt service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
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
    public Future<CreatePromptResult> createPromptAsync(
            final CreatePromptRequest createPromptRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreatePromptResult>() {
            public CreatePromptResult call() throws Exception {
                return createPrompt(createPromptRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a prompt. For more information about prompts, such as supported
     * file types and maximum length, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/prompts.html"
     * >Create prompts</a> in the <i>Amazon Connect Administrator's Guide</i>.
     * </p>
     * 
     * @param createPromptRequest
     * @return A Java Future object containing the response from the
     *         CreatePrompt service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
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
    public Future<CreatePromptResult> createPromptAsync(
            final CreatePromptRequest createPromptRequest,
            final AsyncHandler<CreatePromptRequest, CreatePromptResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePromptResult>() {
            public CreatePromptResult call() throws Exception {
                CreatePromptResult result = null;
                try {
                    result = createPrompt(createPromptRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createPromptRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates a new queue for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * If the phone number is claimed to a traffic distribution group that was
     * created in the same Region as the Amazon Connect instance where you are
     * calling this API, then you can use a full phone number ARN or a UUID for
     * <code>OutboundCallerIdNumberId</code>. However, if the phone number is
     * claimed to a traffic distribution group that is in one Region, and you
     * are calling this API from an instance in another Amazon Web Services
     * Region that is associated with the traffic distribution group, you must
     * provide a full phone number ARN. If a UUID is provided in this scenario,
     * you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only use the phone number ARN format that doesn't contain
     * <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This
     * is the same ARN format that is returned when you call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you plan to use IAM policies to allow/deny access to this API for
     * phone number resources claimed to a traffic distribution group, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_resource-level-policy-examples.html#allow-deny-queue-actions-replica-region"
     * >Allow or Deny queue API actions for phone numbers in a replica
     * Region</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param createQueueRequest
     * @return A Java Future object containing the response from the CreateQueue
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateQueueResult> createQueueAsync(final CreateQueueRequest createQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateQueueResult>() {
            public CreateQueueResult call() throws Exception {
                return createQueue(createQueueRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Creates a new queue for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * If the phone number is claimed to a traffic distribution group that was
     * created in the same Region as the Amazon Connect instance where you are
     * calling this API, then you can use a full phone number ARN or a UUID for
     * <code>OutboundCallerIdNumberId</code>. However, if the phone number is
     * claimed to a traffic distribution group that is in one Region, and you
     * are calling this API from an instance in another Amazon Web Services
     * Region that is associated with the traffic distribution group, you must
     * provide a full phone number ARN. If a UUID is provided in this scenario,
     * you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only use the phone number ARN format that doesn't contain
     * <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This
     * is the same ARN format that is returned when you call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you plan to use IAM policies to allow/deny access to this API for
     * phone number resources claimed to a traffic distribution group, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_resource-level-policy-examples.html#allow-deny-queue-actions-replica-region"
     * >Allow or Deny queue API actions for phone numbers in a replica
     * Region</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param createQueueRequest
     * @return A Java Future object containing the response from the CreateQueue
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateQueueResult> createQueueAsync(final CreateQueueRequest createQueueRequest,
            final AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateQueueResult>() {
            public CreateQueueResult call() throws Exception {
                CreateQueueResult result = null;
                try {
                    result = createQueue(createQueueRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createQueueRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a quick connect for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQuickConnectRequest
     * @return A Java Future object containing the response from the
     *         CreateQuickConnect service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateQuickConnectResult> createQuickConnectAsync(
            final CreateQuickConnectRequest createQuickConnectRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateQuickConnectResult>() {
            public CreateQuickConnectResult call() throws Exception {
                return createQuickConnect(createQuickConnectRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a quick connect for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQuickConnectRequest
     * @return A Java Future object containing the response from the
     *         CreateQuickConnect service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateQuickConnectResult> createQuickConnectAsync(
            final CreateQuickConnectRequest createQuickConnectRequest,
            final AsyncHandler<CreateQuickConnectRequest, CreateQuickConnectResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateQuickConnectResult>() {
            public CreateQuickConnectResult call() throws Exception {
                CreateQuickConnectResult result = null;
                try {
                    result = createQuickConnect(createQuickConnectRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createQuickConnectRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         CreateRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateRoutingProfileResult> createRoutingProfileAsync(
            final CreateRoutingProfileRequest createRoutingProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateRoutingProfileResult>() {
            public CreateRoutingProfileResult call() throws Exception {
                return createRoutingProfile(createRoutingProfileRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         CreateRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<CreateRoutingProfileResult> createRoutingProfileAsync(
            final CreateRoutingProfileRequest createRoutingProfileRequest,
            final AsyncHandler<CreateRoutingProfileRequest, CreateRoutingProfileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateRoutingProfileResult>() {
            public CreateRoutingProfileResult call() throws Exception {
                CreateRoutingProfileResult result = null;
                try {
                    result = createRoutingProfile(createRoutingProfileRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createRoutingProfileRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html"
     * >Rules Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param createRuleRequest
     * @return A Java Future object containing the response from the CreateRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateRuleResult> createRuleAsync(final CreateRuleRequest createRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateRuleResult>() {
            public CreateRuleResult call() throws Exception {
                return createRule(createRuleRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html"
     * >Rules Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param createRuleRequest
     * @return A Java Future object containing the response from the CreateRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateRuleResult> createRuleAsync(final CreateRuleRequest createRuleRequest,
            final AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateRuleResult>() {
            public CreateRuleResult call() throws Exception {
                CreateRuleResult result = null;
                try {
                    result = createRule(createRuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createRuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         CreateSecurityProfile service method, as returned by Amazon
     *         Connect.
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
    public Future<CreateSecurityProfileResult> createSecurityProfileAsync(
            final CreateSecurityProfileRequest createSecurityProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSecurityProfileResult>() {
            public CreateSecurityProfileResult call() throws Exception {
                return createSecurityProfile(createSecurityProfileRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         CreateSecurityProfile service method, as returned by Amazon
     *         Connect.
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
    public Future<CreateSecurityProfileResult> createSecurityProfileAsync(
            final CreateSecurityProfileRequest createSecurityProfileRequest,
            final AsyncHandler<CreateSecurityProfileRequest, CreateSecurityProfileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSecurityProfileResult>() {
            public CreateSecurityProfileResult call() throws Exception {
                CreateSecurityProfileResult result = null;
                try {
                    result = createSecurityProfile(createSecurityProfileRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createSecurityProfileRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param createTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         CreateTaskTemplate service method, as returned by Amazon Connect.
     * @throws PropertyValidationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateTaskTemplateResult> createTaskTemplateAsync(
            final CreateTaskTemplateRequest createTaskTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTaskTemplateResult>() {
            public CreateTaskTemplateResult call() throws Exception {
                return createTaskTemplate(createTaskTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param createTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         CreateTaskTemplate service method, as returned by Amazon Connect.
     * @throws PropertyValidationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateTaskTemplateResult> createTaskTemplateAsync(
            final CreateTaskTemplateRequest createTaskTemplateRequest,
            final AsyncHandler<CreateTaskTemplateRequest, CreateTaskTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTaskTemplateResult>() {
            public CreateTaskTemplateResult call() throws Exception {
                CreateTaskTemplateResult result = null;
                try {
                    result = createTaskTemplate(createTaskTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createTaskTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a traffic distribution group given an Amazon Connect instance
     * that has been replicated.
     * </p>
     * <note>
     * <p>
     * The <code>SignInConfig</code> distribution is available only on a default
     * <code>TrafficDistributionGroup</code> (see the <code>IsDefault</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_TrafficDistributionGroup.html"
     * >TrafficDistributionGroup</a> data type). If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about creating traffic distribution groups, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-traffic-distribution-groups.html"
     * >Set up traffic distribution groups</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param createTrafficDistributionGroupRequest
     * @return A Java Future object containing the response from the
     *         CreateTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws ResourceNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateTrafficDistributionGroupResult> createTrafficDistributionGroupAsync(
            final CreateTrafficDistributionGroupRequest createTrafficDistributionGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTrafficDistributionGroupResult>() {
            public CreateTrafficDistributionGroupResult call() throws Exception {
                return createTrafficDistributionGroup(createTrafficDistributionGroupRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a traffic distribution group given an Amazon Connect instance
     * that has been replicated.
     * </p>
     * <note>
     * <p>
     * The <code>SignInConfig</code> distribution is available only on a default
     * <code>TrafficDistributionGroup</code> (see the <code>IsDefault</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_TrafficDistributionGroup.html"
     * >TrafficDistributionGroup</a> data type). If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about creating traffic distribution groups, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-traffic-distribution-groups.html"
     * >Set up traffic distribution groups</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param createTrafficDistributionGroupRequest
     * @return A Java Future object containing the response from the
     *         CreateTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws ResourceNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateTrafficDistributionGroupResult> createTrafficDistributionGroupAsync(
            final CreateTrafficDistributionGroupRequest createTrafficDistributionGroupRequest,
            final AsyncHandler<CreateTrafficDistributionGroupRequest, CreateTrafficDistributionGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTrafficDistributionGroupResult>() {
            public CreateTrafficDistributionGroupResult call() throws Exception {
                CreateTrafficDistributionGroupResult result = null;
                try {
                    result = createTrafficDistributionGroup(createTrafficDistributionGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createTrafficDistributionGroupRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a use case for an integration association.
     * </p>
     * 
     * @param createUseCaseRequest
     * @return A Java Future object containing the response from the
     *         CreateUseCase service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateUseCaseResult> createUseCaseAsync(
            final CreateUseCaseRequest createUseCaseRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateUseCaseResult>() {
            public CreateUseCaseResult call() throws Exception {
                return createUseCase(createUseCaseRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a use case for an integration association.
     * </p>
     * 
     * @param createUseCaseRequest
     * @return A Java Future object containing the response from the
     *         CreateUseCase service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateUseCaseResult> createUseCaseAsync(
            final CreateUseCaseRequest createUseCaseRequest,
            final AsyncHandler<CreateUseCaseRequest, CreateUseCaseResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateUseCaseResult>() {
            public CreateUseCaseResult call() throws Exception {
                CreateUseCaseResult result = null;
                try {
                    result = createUseCase(createUseCaseRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createUseCaseRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * Certain <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UserIdentityInfo.html"
     * >UserIdentityInfo</a> parameters are required in some situations. For
     * example, <code>Email</code> is required if you are using SAML for
     * identity management. <code>FirstName</code> and <code>LastName</code> are
     * required if you are using Amazon Connect or SAML for identity management.
     * </p>
     * </important>
     * <p>
     * For information about how to create users using the Amazon Connect admin
     * website, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html"
     * >Add Users</a> in the <i>Amazon Connect Administrator Guide</i>.
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
     * <important>
     * <p>
     * Certain <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UserIdentityInfo.html"
     * >UserIdentityInfo</a> parameters are required in some situations. For
     * example, <code>Email</code> is required if you are using SAML for
     * identity management. <code>FirstName</code> and <code>LastName</code> are
     * required if you are using Amazon Connect or SAML for identity management.
     * </p>
     * </important>
     * <p>
     * For information about how to create users using the Amazon Connect admin
     * website, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html"
     * >Add Users</a> in the <i>Amazon Connect Administrator Guide</i>.
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
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         CreateUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
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
    public Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(
            final CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateUserHierarchyGroupResult>() {
            public CreateUserHierarchyGroupResult call() throws Exception {
                return createUserHierarchyGroup(createUserHierarchyGroupRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         CreateUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
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
    public Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(
            final CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest,
            final AsyncHandler<CreateUserHierarchyGroupRequest, CreateUserHierarchyGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateUserHierarchyGroupResult>() {
            public CreateUserHierarchyGroupResult call() throws Exception {
                CreateUserHierarchyGroupResult result = null;
                try {
                    result = createUserHierarchyGroup(createUserHierarchyGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createUserHierarchyGroupRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new view with the possible status of <code>SAVED</code> or
     * <code>PUBLISHED</code>.
     * </p>
     * <p>
     * The views will have a unique name for each connect instance.
     * </p>
     * <p>
     * It performs basic content validation if the status is <code>SAVED</code>
     * or full content validation if the status is set to <code>PUBLISHED</code>
     * . An error is returned if validation fails. It associates either the
     * <code>$SAVED</code> qualifier or both of the <code>$SAVED</code> and
     * <code>$LATEST</code> qualifiers with the provided view content based on
     * the status. The view is idempotent if ClientToken is provided.
     * </p>
     * 
     * @param createViewRequest
     * @return A Java Future object containing the response from the CreateView
     *         service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws DuplicateResourceException
     * @throws ServiceQuotaExceededException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateViewResult> createViewAsync(final CreateViewRequest createViewRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateViewResult>() {
            public CreateViewResult call() throws Exception {
                return createView(createViewRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new view with the possible status of <code>SAVED</code> or
     * <code>PUBLISHED</code>.
     * </p>
     * <p>
     * The views will have a unique name for each connect instance.
     * </p>
     * <p>
     * It performs basic content validation if the status is <code>SAVED</code>
     * or full content validation if the status is set to <code>PUBLISHED</code>
     * . An error is returned if validation fails. It associates either the
     * <code>$SAVED</code> qualifier or both of the <code>$SAVED</code> and
     * <code>$LATEST</code> qualifiers with the provided view content based on
     * the status. The view is idempotent if ClientToken is provided.
     * </p>
     * 
     * @param createViewRequest
     * @return A Java Future object containing the response from the CreateView
     *         service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws DuplicateResourceException
     * @throws ServiceQuotaExceededException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateViewResult> createViewAsync(final CreateViewRequest createViewRequest,
            final AsyncHandler<CreateViewRequest, CreateViewResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateViewResult>() {
            public CreateViewResult call() throws Exception {
                CreateViewResult result = null;
                try {
                    result = createView(createViewRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createViewRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Publishes a new version of the view identifier.
     * </p>
     * <p>
     * Versions are immutable and monotonically increasing.
     * </p>
     * <p>
     * It returns the highest version if there is no change in content compared
     * to that version. An error is displayed if the supplied ViewContentSha256
     * is different from the ViewContentSha256 of the <code>$LATEST</code>
     * alias.
     * </p>
     * 
     * @param createViewVersionRequest
     * @return A Java Future object containing the response from the
     *         CreateViewVersion service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws ServiceQuotaExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateViewVersionResult> createViewVersionAsync(
            final CreateViewVersionRequest createViewVersionRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateViewVersionResult>() {
            public CreateViewVersionResult call() throws Exception {
                return createViewVersion(createViewVersionRequest);
            }
        });
    }

    /**
     * <p>
     * Publishes a new version of the view identifier.
     * </p>
     * <p>
     * Versions are immutable and monotonically increasing.
     * </p>
     * <p>
     * It returns the highest version if there is no change in content compared
     * to that version. An error is displayed if the supplied ViewContentSha256
     * is different from the ViewContentSha256 of the <code>$LATEST</code>
     * alias.
     * </p>
     * 
     * @param createViewVersionRequest
     * @return A Java Future object containing the response from the
     *         CreateViewVersion service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws ServiceQuotaExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateViewVersionResult> createViewVersionAsync(
            final CreateViewVersionRequest createViewVersionRequest,
            final AsyncHandler<CreateViewVersionRequest, CreateViewVersionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateViewVersionResult>() {
            public CreateViewVersionResult call() throws Exception {
                CreateViewVersionResult result = null;
                try {
                    result = createViewVersion(createViewVersionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createViewVersionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a custom vocabulary associated with your Amazon Connect instance.
     * You can set a custom vocabulary to be your default vocabulary for a given
     * language. Contact Lens for Amazon Connect uses the default vocabulary in
     * post-call and real-time contact analysis sessions for that language.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return A Java Future object containing the response from the
     *         CreateVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateVocabularyResult> createVocabularyAsync(
            final CreateVocabularyRequest createVocabularyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateVocabularyResult>() {
            public CreateVocabularyResult call() throws Exception {
                return createVocabulary(createVocabularyRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a custom vocabulary associated with your Amazon Connect instance.
     * You can set a custom vocabulary to be your default vocabulary for a given
     * language. Contact Lens for Amazon Connect uses the default vocabulary in
     * post-call and real-time contact analysis sessions for that language.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return A Java Future object containing the response from the
     *         CreateVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateVocabularyResult> createVocabularyAsync(
            final CreateVocabularyRequest createVocabularyRequest,
            final AsyncHandler<CreateVocabularyRequest, CreateVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateVocabularyResult>() {
            public CreateVocabularyResult call() throws Exception {
                CreateVocabularyResult result = null;
                try {
                    result = createVocabulary(createVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deactivates an evaluation form in the specified Amazon Connect instance.
     * After a form is deactivated, it is no longer available for users to start
     * new evaluations based on the form.
     * </p>
     * 
     * @param deactivateEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         DeactivateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeactivateEvaluationFormResult> deactivateEvaluationFormAsync(
            final DeactivateEvaluationFormRequest deactivateEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeactivateEvaluationFormResult>() {
            public DeactivateEvaluationFormResult call() throws Exception {
                return deactivateEvaluationForm(deactivateEvaluationFormRequest);
            }
        });
    }

    /**
     * <p>
     * Deactivates an evaluation form in the specified Amazon Connect instance.
     * After a form is deactivated, it is no longer available for users to start
     * new evaluations based on the form.
     * </p>
     * 
     * @param deactivateEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         DeactivateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeactivateEvaluationFormResult> deactivateEvaluationFormAsync(
            final DeactivateEvaluationFormRequest deactivateEvaluationFormRequest,
            final AsyncHandler<DeactivateEvaluationFormRequest, DeactivateEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeactivateEvaluationFormResult>() {
            public DeactivateEvaluationFormResult call() throws Exception {
                DeactivateEvaluationFormResult result = null;
                try {
                    result = deactivateEvaluationForm(deactivateEvaluationFormRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deactivateEvaluationFormRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         DeleteContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteContactEvaluationAsync(
            final DeleteContactEvaluationRequest deleteContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteContactEvaluation(deleteContactEvaluationRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         DeleteContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteContactEvaluationAsync(
            final DeleteContactEvaluationRequest deleteContactEvaluationRequest,
            final AsyncHandler<DeleteContactEvaluationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteContactEvaluation(deleteContactEvaluationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteContactEvaluationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a flow for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactFlowRequest
     * @return A Java Future object containing the response from the
     *         DeleteContactFlow service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteContactFlowResult> deleteContactFlowAsync(
            final DeleteContactFlowRequest deleteContactFlowRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteContactFlowResult>() {
            public DeleteContactFlowResult call() throws Exception {
                return deleteContactFlow(deleteContactFlowRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a flow for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactFlowRequest
     * @return A Java Future object containing the response from the
     *         DeleteContactFlow service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteContactFlowResult> deleteContactFlowAsync(
            final DeleteContactFlowRequest deleteContactFlowRequest,
            final AsyncHandler<DeleteContactFlowRequest, DeleteContactFlowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteContactFlowResult>() {
            public DeleteContactFlowResult call() throws Exception {
                DeleteContactFlowResult result = null;
                try {
                    result = deleteContactFlow(deleteContactFlowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteContactFlowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified flow module.
     * </p>
     * 
     * @param deleteContactFlowModuleRequest
     * @return A Java Future object containing the response from the
     *         DeleteContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
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
    public Future<DeleteContactFlowModuleResult> deleteContactFlowModuleAsync(
            final DeleteContactFlowModuleRequest deleteContactFlowModuleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteContactFlowModuleResult>() {
            public DeleteContactFlowModuleResult call() throws Exception {
                return deleteContactFlowModule(deleteContactFlowModuleRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the specified flow module.
     * </p>
     * 
     * @param deleteContactFlowModuleRequest
     * @return A Java Future object containing the response from the
     *         DeleteContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
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
    public Future<DeleteContactFlowModuleResult> deleteContactFlowModuleAsync(
            final DeleteContactFlowModuleRequest deleteContactFlowModuleRequest,
            final AsyncHandler<DeleteContactFlowModuleRequest, DeleteContactFlowModuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteContactFlowModuleResult>() {
            public DeleteContactFlowModuleResult call() throws Exception {
                DeleteContactFlowModuleResult result = null;
                try {
                    result = deleteContactFlowModule(deleteContactFlowModuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteContactFlowModuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes an evaluation form in the specified Amazon Connect instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the version property is provided, only the specified version of the
     * evaluation form is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If no version is provided, then the full form (all versions) is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         DeleteEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteEvaluationFormAsync(
            final DeleteEvaluationFormRequest deleteEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteEvaluationForm(deleteEvaluationFormRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes an evaluation form in the specified Amazon Connect instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the version property is provided, only the specified version of the
     * evaluation form is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If no version is provided, then the full form (all versions) is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         DeleteEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteEvaluationFormAsync(
            final DeleteEvaluationFormRequest deleteEvaluationFormRequest,
            final AsyncHandler<DeleteEvaluationFormRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteEvaluationForm(deleteEvaluationFormRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteEvaluationFormRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes an hours of operation.
     * </p>
     * 
     * @param deleteHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         DeleteHoursOfOperation service method, as returned by Amazon
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
    public Future<Void> deleteHoursOfOperationAsync(
            final DeleteHoursOfOperationRequest deleteHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteHoursOfOperation(deleteHoursOfOperationRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes an hours of operation.
     * </p>
     * 
     * @param deleteHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         DeleteHoursOfOperation service method, as returned by Amazon
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
    public Future<Void> deleteHoursOfOperationAsync(
            final DeleteHoursOfOperationRequest deleteHoursOfOperationRequest,
            final AsyncHandler<DeleteHoursOfOperationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteHoursOfOperation(deleteHoursOfOperationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteHoursOfOperationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes the Amazon Connect instance.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you
     * can create or delete in 30 days. If you exceed this limit, you will get
     * an error message indicating there has been an excessive number of
     * attempts at creating or deleting instances. You must wait 30 days before
     * you can restart creating and deleting instances in your account.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteInstanceAsync(final DeleteInstanceRequest deleteInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteInstance(deleteInstanceRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes the Amazon Connect instance.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you
     * can create or delete in 30 days. If you exceed this limit, you will get
     * an error message indicating there has been an excessive number of
     * attempts at creating or deleting instances. You must wait 30 days before
     * you can restart creating and deleting instances in your account.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteInstanceAsync(final DeleteInstanceRequest deleteInstanceRequest,
            final AsyncHandler<DeleteInstanceRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteInstance(deleteInstanceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteInstanceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes an Amazon Web Services resource association from an Amazon
     * Connect instance. The association must not have any use cases associated
     * with it.
     * </p>
     * 
     * @param deleteIntegrationAssociationRequest
     * @return A Java Future object containing the response from the
     *         DeleteIntegrationAssociation service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteIntegrationAssociationAsync(
            final DeleteIntegrationAssociationRequest deleteIntegrationAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteIntegrationAssociation(deleteIntegrationAssociationRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes an Amazon Web Services resource association from an Amazon
     * Connect instance. The association must not have any use cases associated
     * with it.
     * </p>
     * 
     * @param deleteIntegrationAssociationRequest
     * @return A Java Future object containing the response from the
     *         DeleteIntegrationAssociation service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteIntegrationAssociationAsync(
            final DeleteIntegrationAssociationRequest deleteIntegrationAssociationRequest,
            final AsyncHandler<DeleteIntegrationAssociationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteIntegrationAssociation(deleteIntegrationAssociationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteIntegrationAssociationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a predefined attribute from the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param deletePredefinedAttributeRequest
     * @return A Java Future object containing the response from the
     *         DeletePredefinedAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceInUseException
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
    public Future<Void> deletePredefinedAttributeAsync(
            final DeletePredefinedAttributeRequest deletePredefinedAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deletePredefinedAttribute(deletePredefinedAttributeRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a predefined attribute from the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param deletePredefinedAttributeRequest
     * @return A Java Future object containing the response from the
     *         DeletePredefinedAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceInUseException
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
    public Future<Void> deletePredefinedAttributeAsync(
            final DeletePredefinedAttributeRequest deletePredefinedAttributeRequest,
            final AsyncHandler<DeletePredefinedAttributeRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deletePredefinedAttribute(deletePredefinedAttributeRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deletePredefinedAttributeRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a prompt.
     * </p>
     * 
     * @param deletePromptRequest
     * @return A Java Future object containing the response from the
     *         DeletePrompt service method, as returned by Amazon Connect.
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
    public Future<Void> deletePromptAsync(final DeletePromptRequest deletePromptRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deletePrompt(deletePromptRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a prompt.
     * </p>
     * 
     * @param deletePromptRequest
     * @return A Java Future object containing the response from the
     *         DeletePrompt service method, as returned by Amazon Connect.
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
    public Future<Void> deletePromptAsync(final DeletePromptRequest deletePromptRequest,
            final AsyncHandler<DeletePromptRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deletePrompt(deletePromptRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deletePromptRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return A Java Future object containing the response from the DeleteQueue
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
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
    public Future<Void> deleteQueueAsync(final DeleteQueueRequest deleteQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteQueue(deleteQueueRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return A Java Future object containing the response from the DeleteQueue
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
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
    public Future<Void> deleteQueueAsync(final DeleteQueueRequest deleteQueueRequest,
            final AsyncHandler<DeleteQueueRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteQueue(deleteQueueRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteQueueRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a quick connect.
     * </p>
     * 
     * @param deleteQuickConnectRequest
     * @return A Java Future object containing the response from the
     *         DeleteQuickConnect service method, as returned by Amazon Connect.
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
    public Future<Void> deleteQuickConnectAsync(
            final DeleteQuickConnectRequest deleteQuickConnectRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteQuickConnect(deleteQuickConnectRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a quick connect.
     * </p>
     * 
     * @param deleteQuickConnectRequest
     * @return A Java Future object containing the response from the
     *         DeleteQuickConnect service method, as returned by Amazon Connect.
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
    public Future<Void> deleteQuickConnectAsync(
            final DeleteQuickConnectRequest deleteQuickConnectRequest,
            final AsyncHandler<DeleteQuickConnectRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteQuickConnect(deleteQuickConnectRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteQuickConnectRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a routing profile.
     * </p>
     * 
     * @param deleteRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         DeleteRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
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
    public Future<Void> deleteRoutingProfileAsync(
            final DeleteRoutingProfileRequest deleteRoutingProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteRoutingProfile(deleteRoutingProfileRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a routing profile.
     * </p>
     * 
     * @param deleteRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         DeleteRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
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
    public Future<Void> deleteRoutingProfileAsync(
            final DeleteRoutingProfileRequest deleteRoutingProfileRequest,
            final AsyncHandler<DeleteRoutingProfileRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteRoutingProfile(deleteRoutingProfileRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteRoutingProfileRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future object containing the response from the DeleteRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteRuleAsync(final DeleteRuleRequest deleteRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteRule(deleteRuleRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future object containing the response from the DeleteRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteRuleAsync(final DeleteRuleRequest deleteRuleRequest,
            final AsyncHandler<DeleteRuleRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteRule(deleteRuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteRuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         DeleteSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteSecurityProfileAsync(
            final DeleteSecurityProfileRequest deleteSecurityProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteSecurityProfile(deleteSecurityProfileRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         DeleteSecurityProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteSecurityProfileAsync(
            final DeleteSecurityProfileRequest deleteSecurityProfileRequest,
            final AsyncHandler<DeleteSecurityProfileRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteSecurityProfile(deleteSecurityProfileRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteSecurityProfileRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the task template.
     * </p>
     * 
     * @param deleteTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         DeleteTaskTemplate service method, as returned by Amazon Connect.
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
    public Future<DeleteTaskTemplateResult> deleteTaskTemplateAsync(
            final DeleteTaskTemplateRequest deleteTaskTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTaskTemplateResult>() {
            public DeleteTaskTemplateResult call() throws Exception {
                return deleteTaskTemplate(deleteTaskTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the task template.
     * </p>
     * 
     * @param deleteTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         DeleteTaskTemplate service method, as returned by Amazon Connect.
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
    public Future<DeleteTaskTemplateResult> deleteTaskTemplateAsync(
            final DeleteTaskTemplateRequest deleteTaskTemplateRequest,
            final AsyncHandler<DeleteTaskTemplateRequest, DeleteTaskTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTaskTemplateResult>() {
            public DeleteTaskTemplateResult call() throws Exception {
                DeleteTaskTemplateResult result = null;
                try {
                    result = deleteTaskTemplate(deleteTaskTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteTaskTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a traffic distribution group. This API can be called only in the
     * Region where the traffic distribution group is created.
     * </p>
     * <p>
     * For more information about deleting traffic distribution groups, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/delete-traffic-distribution-groups.html"
     * >Delete traffic distribution groups</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param deleteTrafficDistributionGroupRequest
     * @return A Java Future object containing the response from the
     *         DeleteTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
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
    public Future<DeleteTrafficDistributionGroupResult> deleteTrafficDistributionGroupAsync(
            final DeleteTrafficDistributionGroupRequest deleteTrafficDistributionGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTrafficDistributionGroupResult>() {
            public DeleteTrafficDistributionGroupResult call() throws Exception {
                return deleteTrafficDistributionGroup(deleteTrafficDistributionGroupRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a traffic distribution group. This API can be called only in the
     * Region where the traffic distribution group is created.
     * </p>
     * <p>
     * For more information about deleting traffic distribution groups, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/delete-traffic-distribution-groups.html"
     * >Delete traffic distribution groups</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param deleteTrafficDistributionGroupRequest
     * @return A Java Future object containing the response from the
     *         DeleteTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
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
    public Future<DeleteTrafficDistributionGroupResult> deleteTrafficDistributionGroupAsync(
            final DeleteTrafficDistributionGroupRequest deleteTrafficDistributionGroupRequest,
            final AsyncHandler<DeleteTrafficDistributionGroupRequest, DeleteTrafficDistributionGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTrafficDistributionGroupResult>() {
            public DeleteTrafficDistributionGroupResult call() throws Exception {
                DeleteTrafficDistributionGroupResult result = null;
                try {
                    result = deleteTrafficDistributionGroup(deleteTrafficDistributionGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteTrafficDistributionGroupRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a use case from an integration association.
     * </p>
     * 
     * @param deleteUseCaseRequest
     * @return A Java Future object containing the response from the
     *         DeleteUseCase service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteUseCaseAsync(final DeleteUseCaseRequest deleteUseCaseRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteUseCase(deleteUseCaseRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a use case from an integration association.
     * </p>
     * 
     * @param deleteUseCaseRequest
     * @return A Java Future object containing the response from the
     *         DeleteUseCase service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteUseCaseAsync(final DeleteUseCaseRequest deleteUseCaseRequest,
            final AsyncHandler<DeleteUseCaseRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteUseCase(deleteUseCaseRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteUseCaseRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about what happens to a user's data when their account is
     * deleted, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/delete-users.html"
     * >Delete Users from Your Amazon Connect Instance</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
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
     * <p>
     * For information about what happens to a user's data when their account is
     * deleted, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/delete-users.html"
     * >Delete Users from Your Amazon Connect Instance</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
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
     * Deletes an existing user hierarchy group. It must not be associated with
     * any agents or have any active child groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         DeleteUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
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
    public Future<Void> deleteUserHierarchyGroupAsync(
            final DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteUserHierarchyGroup(deleteUserHierarchyGroupRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes an existing user hierarchy group. It must not be associated with
     * any agents or have any active child groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         DeleteUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
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
    public Future<Void> deleteUserHierarchyGroupAsync(
            final DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest,
            final AsyncHandler<DeleteUserHierarchyGroupRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteUserHierarchyGroup(deleteUserHierarchyGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteUserHierarchyGroupRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the view entirely. It deletes the view and all associated
     * qualifiers (versions and aliases).
     * </p>
     * 
     * @param deleteViewRequest
     * @return A Java Future object containing the response from the DeleteView
     *         service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteViewResult> deleteViewAsync(final DeleteViewRequest deleteViewRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteViewResult>() {
            public DeleteViewResult call() throws Exception {
                return deleteView(deleteViewRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the view entirely. It deletes the view and all associated
     * qualifiers (versions and aliases).
     * </p>
     * 
     * @param deleteViewRequest
     * @return A Java Future object containing the response from the DeleteView
     *         service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteViewResult> deleteViewAsync(final DeleteViewRequest deleteViewRequest,
            final AsyncHandler<DeleteViewRequest, DeleteViewResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteViewResult>() {
            public DeleteViewResult call() throws Exception {
                DeleteViewResult result = null;
                try {
                    result = deleteView(deleteViewRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteViewRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the particular version specified in <code>ViewVersion</code>
     * identifier.
     * </p>
     * 
     * @param deleteViewVersionRequest
     * @return A Java Future object containing the response from the
     *         DeleteViewVersion service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteViewVersionResult> deleteViewVersionAsync(
            final DeleteViewVersionRequest deleteViewVersionRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteViewVersionResult>() {
            public DeleteViewVersionResult call() throws Exception {
                return deleteViewVersion(deleteViewVersionRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the particular version specified in <code>ViewVersion</code>
     * identifier.
     * </p>
     * 
     * @param deleteViewVersionRequest
     * @return A Java Future object containing the response from the
     *         DeleteViewVersion service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteViewVersionResult> deleteViewVersionAsync(
            final DeleteViewVersionRequest deleteViewVersionRequest,
            final AsyncHandler<DeleteViewVersionRequest, DeleteViewVersionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteViewVersionResult>() {
            public DeleteViewVersionResult call() throws Exception {
                DeleteViewVersionResult result = null;
                try {
                    result = deleteViewVersion(deleteViewVersionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteViewVersionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the vocabulary that has the given identifier.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DeleteVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteVocabularyResult> deleteVocabularyAsync(
            final DeleteVocabularyRequest deleteVocabularyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteVocabularyResult>() {
            public DeleteVocabularyResult call() throws Exception {
                return deleteVocabulary(deleteVocabularyRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the vocabulary that has the given identifier.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DeleteVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteVocabularyResult> deleteVocabularyAsync(
            final DeleteVocabularyRequest deleteVocabularyRequest,
            final AsyncHandler<DeleteVocabularyRequest, DeleteVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteVocabularyResult>() {
            public DeleteVocabularyResult call() throws Exception {
                DeleteVocabularyResult result = null;
                try {
                    result = deleteVocabulary(deleteVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes an agent status.
     * </p>
     * 
     * @param describeAgentStatusRequest
     * @return A Java Future object containing the response from the
     *         DescribeAgentStatus service method, as returned by Amazon
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
    public Future<DescribeAgentStatusResult> describeAgentStatusAsync(
            final DescribeAgentStatusRequest describeAgentStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAgentStatusResult>() {
            public DescribeAgentStatusResult call() throws Exception {
                return describeAgentStatus(describeAgentStatusRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes an agent status.
     * </p>
     * 
     * @param describeAgentStatusRequest
     * @return A Java Future object containing the response from the
     *         DescribeAgentStatus service method, as returned by Amazon
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
    public Future<DescribeAgentStatusResult> describeAgentStatusAsync(
            final DescribeAgentStatusRequest describeAgentStatusRequest,
            final AsyncHandler<DescribeAgentStatusRequest, DescribeAgentStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAgentStatusResult>() {
            public DescribeAgentStatusResult call() throws Exception {
                DescribeAgentStatusResult result = null;
                try {
                    result = describeAgentStatus(describeAgentStatusRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAgentStatusRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified contact.
     * </p>
     * <important>
     * <p>
     * Contact information remains available in Amazon Connect for 24 months,
     * and then it is deleted.
     * </p>
     * <p>
     * Only data from November 12, 2021, and later is returned by this API.
     * </p>
     * </important>
     * 
     * @param describeContactRequest
     * @return A Java Future object containing the response from the
     *         DescribeContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeContactResult> describeContactAsync(
            final DescribeContactRequest describeContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeContactResult>() {
            public DescribeContactResult call() throws Exception {
                return describeContact(describeContactRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified contact.
     * </p>
     * <important>
     * <p>
     * Contact information remains available in Amazon Connect for 24 months,
     * and then it is deleted.
     * </p>
     * <p>
     * Only data from November 12, 2021, and later is returned by this API.
     * </p>
     * </important>
     * 
     * @param describeContactRequest
     * @return A Java Future object containing the response from the
     *         DescribeContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeContactResult> describeContactAsync(
            final DescribeContactRequest describeContactRequest,
            final AsyncHandler<DescribeContactRequest, DescribeContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeContactResult>() {
            public DescribeContactResult call() throws Exception {
                DescribeContactResult result = null;
                try {
                    result = describeContact(describeContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         DescribeContactEvaluation service method, as returned by Amazon
     *         Connect.
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
    public Future<DescribeContactEvaluationResult> describeContactEvaluationAsync(
            final DescribeContactEvaluationRequest describeContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeContactEvaluationResult>() {
            public DescribeContactEvaluationResult call() throws Exception {
                return describeContactEvaluation(describeContactEvaluationRequest);
            }
        });
    }

    /**
     * <p>
     * Describes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         DescribeContactEvaluation service method, as returned by Amazon
     *         Connect.
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
    public Future<DescribeContactEvaluationResult> describeContactEvaluationAsync(
            final DescribeContactEvaluationRequest describeContactEvaluationRequest,
            final AsyncHandler<DescribeContactEvaluationRequest, DescribeContactEvaluationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeContactEvaluationResult>() {
            public DescribeContactEvaluationResult call() throws Exception {
                DescribeContactEvaluationResult result = null;
                try {
                    result = describeContactEvaluation(describeContactEvaluationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeContactEvaluationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param describeContactFlowRequest
     * @return A Java Future object containing the response from the
     *         DescribeContactFlow service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ContactFlowNotPublishedException
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
    public Future<DescribeContactFlowResult> describeContactFlowAsync(
            final DescribeContactFlowRequest describeContactFlowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeContactFlowResult>() {
            public DescribeContactFlowResult call() throws Exception {
                return describeContactFlow(describeContactFlowRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param describeContactFlowRequest
     * @return A Java Future object containing the response from the
     *         DescribeContactFlow service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ContactFlowNotPublishedException
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
    public Future<DescribeContactFlowResult> describeContactFlowAsync(
            final DescribeContactFlowRequest describeContactFlowRequest,
            final AsyncHandler<DescribeContactFlowRequest, DescribeContactFlowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeContactFlowResult>() {
            public DescribeContactFlowResult call() throws Exception {
                DescribeContactFlowResult result = null;
                try {
                    result = describeContactFlow(describeContactFlowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeContactFlowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified flow module.
     * </p>
     * 
     * @param describeContactFlowModuleRequest
     * @return A Java Future object containing the response from the
     *         DescribeContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
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
    public Future<DescribeContactFlowModuleResult> describeContactFlowModuleAsync(
            final DescribeContactFlowModuleRequest describeContactFlowModuleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeContactFlowModuleResult>() {
            public DescribeContactFlowModuleResult call() throws Exception {
                return describeContactFlowModule(describeContactFlowModuleRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified flow module.
     * </p>
     * 
     * @param describeContactFlowModuleRequest
     * @return A Java Future object containing the response from the
     *         DescribeContactFlowModule service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
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
    public Future<DescribeContactFlowModuleResult> describeContactFlowModuleAsync(
            final DescribeContactFlowModuleRequest describeContactFlowModuleRequest,
            final AsyncHandler<DescribeContactFlowModuleRequest, DescribeContactFlowModuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeContactFlowModuleResult>() {
            public DescribeContactFlowModuleResult call() throws Exception {
                DescribeContactFlowModuleResult result = null;
                try {
                    result = describeContactFlowModule(describeContactFlowModuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeContactFlowModuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes an evaluation form in the specified Amazon Connect instance. If
     * the version property is not provided, the latest version of the
     * evaluation form is described.
     * </p>
     * 
     * @param describeEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         DescribeEvaluationForm service method, as returned by Amazon
     *         Connect.
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
    public Future<DescribeEvaluationFormResult> describeEvaluationFormAsync(
            final DescribeEvaluationFormRequest describeEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEvaluationFormResult>() {
            public DescribeEvaluationFormResult call() throws Exception {
                return describeEvaluationForm(describeEvaluationFormRequest);
            }
        });
    }

    /**
     * <p>
     * Describes an evaluation form in the specified Amazon Connect instance. If
     * the version property is not provided, the latest version of the
     * evaluation form is described.
     * </p>
     * 
     * @param describeEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         DescribeEvaluationForm service method, as returned by Amazon
     *         Connect.
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
    public Future<DescribeEvaluationFormResult> describeEvaluationFormAsync(
            final DescribeEvaluationFormRequest describeEvaluationFormRequest,
            final AsyncHandler<DescribeEvaluationFormRequest, DescribeEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEvaluationFormResult>() {
            public DescribeEvaluationFormResult call() throws Exception {
                DescribeEvaluationFormResult result = null;
                try {
                    result = describeEvaluationForm(describeEvaluationFormRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeEvaluationFormRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the hours of operation.
     * </p>
     * 
     * @param describeHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         DescribeHoursOfOperation service method, as returned by Amazon
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
    public Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(
            final DescribeHoursOfOperationRequest describeHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHoursOfOperationResult>() {
            public DescribeHoursOfOperationResult call() throws Exception {
                return describeHoursOfOperation(describeHoursOfOperationRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the hours of operation.
     * </p>
     * 
     * @param describeHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         DescribeHoursOfOperation service method, as returned by Amazon
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
    public Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(
            final DescribeHoursOfOperationRequest describeHoursOfOperationRequest,
            final AsyncHandler<DescribeHoursOfOperationRequest, DescribeHoursOfOperationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHoursOfOperationResult>() {
            public DescribeHoursOfOperationResult call() throws Exception {
                DescribeHoursOfOperationResult result = null;
                try {
                    result = describeHoursOfOperation(describeHoursOfOperationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeHoursOfOperationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns the current state of the specified instance identifier. It tracks
     * the instance while it is being created and returns an error status, if
     * applicable.
     * </p>
     * <p>
     * If an instance is not created successfully, the instance status reason
     * field returns details relevant to the reason. The instance in a failed
     * state is returned only for 24 hours after the CreateInstance API was
     * invoked.
     * </p>
     * 
     * @param describeInstanceRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstance service method, as returned by Amazon Connect.
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
    public Future<DescribeInstanceResult> describeInstanceAsync(
            final DescribeInstanceRequest describeInstanceRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceResult>() {
            public DescribeInstanceResult call() throws Exception {
                return describeInstance(describeInstanceRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns the current state of the specified instance identifier. It tracks
     * the instance while it is being created and returns an error status, if
     * applicable.
     * </p>
     * <p>
     * If an instance is not created successfully, the instance status reason
     * field returns details relevant to the reason. The instance in a failed
     * state is returned only for 24 hours after the CreateInstance API was
     * invoked.
     * </p>
     * 
     * @param describeInstanceRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstance service method, as returned by Amazon Connect.
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
    public Future<DescribeInstanceResult> describeInstanceAsync(
            final DescribeInstanceRequest describeInstanceRequest,
            final AsyncHandler<DescribeInstanceRequest, DescribeInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceResult>() {
            public DescribeInstanceResult call() throws Exception {
                DescribeInstanceResult result = null;
                try {
                    result = describeInstance(describeInstanceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeInstanceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified instance attribute.
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(
            final DescribeInstanceAttributeRequest describeInstanceAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceAttributeResult>() {
            public DescribeInstanceAttributeResult call() throws Exception {
                return describeInstanceAttribute(describeInstanceAttributeRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified instance attribute.
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(
            final DescribeInstanceAttributeRequest describeInstanceAttributeRequest,
            final AsyncHandler<DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceAttributeResult>() {
            public DescribeInstanceAttributeResult call() throws Exception {
                DescribeInstanceAttributeResult result = null;
                try {
                    result = describeInstanceAttribute(describeInstanceAttributeRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeInstanceAttributeRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Retrieves the current storage configurations for the specified resource
     * type, association ID, and instance ID.
     * </p>
     * 
     * @param describeInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(
            final DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceStorageConfigResult>() {
            public DescribeInstanceStorageConfigResult call() throws Exception {
                return describeInstanceStorageConfig(describeInstanceStorageConfigRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Retrieves the current storage configurations for the specified resource
     * type, association ID, and instance ID.
     * </p>
     * 
     * @param describeInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(
            final DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest,
            final AsyncHandler<DescribeInstanceStorageConfigRequest, DescribeInstanceStorageConfigResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceStorageConfigResult>() {
            public DescribeInstanceStorageConfigResult call() throws Exception {
                DescribeInstanceStorageConfigResult result = null;
                try {
                    result = describeInstanceStorageConfig(describeInstanceStorageConfigRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeInstanceStorageConfigRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets details and status of a phone number that’s claimed to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling in the Amazon Web Services Region where the traffic distribution
     * group was created, you can use either a phone number ARN or UUID value
     * for the <code>PhoneNumberId</code> URI request parameter. However, if the
     * number is claimed to a traffic distribution group and you are calling
     * this API in the alternate Amazon Web Services Region associated with the
     * traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param describePhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         DescribePhoneNumber service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribePhoneNumberResult> describePhoneNumberAsync(
            final DescribePhoneNumberRequest describePhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePhoneNumberResult>() {
            public DescribePhoneNumberResult call() throws Exception {
                return describePhoneNumber(describePhoneNumberRequest);
            }
        });
    }

    /**
     * <p>
     * Gets details and status of a phone number that’s claimed to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling in the Amazon Web Services Region where the traffic distribution
     * group was created, you can use either a phone number ARN or UUID value
     * for the <code>PhoneNumberId</code> URI request parameter. However, if the
     * number is claimed to a traffic distribution group and you are calling
     * this API in the alternate Amazon Web Services Region associated with the
     * traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param describePhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         DescribePhoneNumber service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribePhoneNumberResult> describePhoneNumberAsync(
            final DescribePhoneNumberRequest describePhoneNumberRequest,
            final AsyncHandler<DescribePhoneNumberRequest, DescribePhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePhoneNumberResult>() {
            public DescribePhoneNumberResult call() throws Exception {
                DescribePhoneNumberResult result = null;
                try {
                    result = describePhoneNumber(describePhoneNumberRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describePhoneNumberRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes a predefined attribute for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describePredefinedAttributeRequest
     * @return A Java Future object containing the response from the
     *         DescribePredefinedAttribute service method, as returned by Amazon
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
    public Future<DescribePredefinedAttributeResult> describePredefinedAttributeAsync(
            final DescribePredefinedAttributeRequest describePredefinedAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePredefinedAttributeResult>() {
            public DescribePredefinedAttributeResult call() throws Exception {
                return describePredefinedAttribute(describePredefinedAttributeRequest);
            }
        });
    }

    /**
     * <p>
     * Describes a predefined attribute for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describePredefinedAttributeRequest
     * @return A Java Future object containing the response from the
     *         DescribePredefinedAttribute service method, as returned by Amazon
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
    public Future<DescribePredefinedAttributeResult> describePredefinedAttributeAsync(
            final DescribePredefinedAttributeRequest describePredefinedAttributeRequest,
            final AsyncHandler<DescribePredefinedAttributeRequest, DescribePredefinedAttributeResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePredefinedAttributeResult>() {
            public DescribePredefinedAttributeResult call() throws Exception {
                DescribePredefinedAttributeResult result = null;
                try {
                    result = describePredefinedAttribute(describePredefinedAttributeRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describePredefinedAttributeRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the prompt.
     * </p>
     * 
     * @param describePromptRequest
     * @return A Java Future object containing the response from the
     *         DescribePrompt service method, as returned by Amazon Connect.
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
    public Future<DescribePromptResult> describePromptAsync(
            final DescribePromptRequest describePromptRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribePromptResult>() {
            public DescribePromptResult call() throws Exception {
                return describePrompt(describePromptRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the prompt.
     * </p>
     * 
     * @param describePromptRequest
     * @return A Java Future object containing the response from the
     *         DescribePrompt service method, as returned by Amazon Connect.
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
    public Future<DescribePromptResult> describePromptAsync(
            final DescribePromptRequest describePromptRequest,
            final AsyncHandler<DescribePromptRequest, DescribePromptResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePromptResult>() {
            public DescribePromptResult call() throws Exception {
                DescribePromptResult result = null;
                try {
                    result = describePrompt(describePromptRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describePromptRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified queue.
     * </p>
     * 
     * @param describeQueueRequest
     * @return A Java Future object containing the response from the
     *         DescribeQueue service method, as returned by Amazon Connect.
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
    public Future<DescribeQueueResult> describeQueueAsync(
            final DescribeQueueRequest describeQueueRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeQueueResult>() {
            public DescribeQueueResult call() throws Exception {
                return describeQueue(describeQueueRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Describes the specified queue.
     * </p>
     * 
     * @param describeQueueRequest
     * @return A Java Future object containing the response from the
     *         DescribeQueue service method, as returned by Amazon Connect.
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
    public Future<DescribeQueueResult> describeQueueAsync(
            final DescribeQueueRequest describeQueueRequest,
            final AsyncHandler<DescribeQueueRequest, DescribeQueueResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeQueueResult>() {
            public DescribeQueueResult call() throws Exception {
                DescribeQueueResult result = null;
                try {
                    result = describeQueue(describeQueueRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeQueueRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the quick connect.
     * </p>
     * 
     * @param describeQuickConnectRequest
     * @return A Java Future object containing the response from the
     *         DescribeQuickConnect service method, as returned by Amazon
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
    public Future<DescribeQuickConnectResult> describeQuickConnectAsync(
            final DescribeQuickConnectRequest describeQuickConnectRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeQuickConnectResult>() {
            public DescribeQuickConnectResult call() throws Exception {
                return describeQuickConnect(describeQuickConnectRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the quick connect.
     * </p>
     * 
     * @param describeQuickConnectRequest
     * @return A Java Future object containing the response from the
     *         DescribeQuickConnect service method, as returned by Amazon
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
    public Future<DescribeQuickConnectResult> describeQuickConnectAsync(
            final DescribeQuickConnectRequest describeQuickConnectRequest,
            final AsyncHandler<DescribeQuickConnectRequest, DescribeQuickConnectResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeQuickConnectResult>() {
            public DescribeQuickConnectResult call() throws Exception {
                DescribeQuickConnectResult result = null;
                try {
                    result = describeQuickConnect(describeQuickConnectRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeQuickConnectRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         DescribeRoutingProfile service method, as returned by Amazon
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
    public Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(
            final DescribeRoutingProfileRequest describeRoutingProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRoutingProfileResult>() {
            public DescribeRoutingProfileResult call() throws Exception {
                return describeRoutingProfile(describeRoutingProfileRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         DescribeRoutingProfile service method, as returned by Amazon
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
    public Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(
            final DescribeRoutingProfileRequest describeRoutingProfileRequest,
            final AsyncHandler<DescribeRoutingProfileRequest, DescribeRoutingProfileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRoutingProfileResult>() {
            public DescribeRoutingProfileResult call() throws Exception {
                DescribeRoutingProfileResult result = null;
                try {
                    result = describeRoutingProfile(describeRoutingProfileRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeRoutingProfileRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeRuleRequest
     * @return A Java Future object containing the response from the
     *         DescribeRule service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeRuleResult> describeRuleAsync(
            final DescribeRuleRequest describeRuleRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeRuleResult>() {
            public DescribeRuleResult call() throws Exception {
                return describeRule(describeRuleRequest);
            }
        });
    }

    /**
     * <p>
     * Describes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeRuleRequest
     * @return A Java Future object containing the response from the
     *         DescribeRule service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeRuleResult> describeRuleAsync(
            final DescribeRuleRequest describeRuleRequest,
            final AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRuleResult>() {
            public DescribeRuleResult call() throws Exception {
                DescribeRuleResult result = null;
                try {
                    result = describeRule(describeRuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeRuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets basic information about the security profle.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         DescribeSecurityProfile service method, as returned by Amazon
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
    public Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(
            final DescribeSecurityProfileRequest describeSecurityProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSecurityProfileResult>() {
            public DescribeSecurityProfileResult call() throws Exception {
                return describeSecurityProfile(describeSecurityProfileRequest);
            }
        });
    }

    /**
     * <p>
     * Gets basic information about the security profle.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         DescribeSecurityProfile service method, as returned by Amazon
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
    public Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(
            final DescribeSecurityProfileRequest describeSecurityProfileRequest,
            final AsyncHandler<DescribeSecurityProfileRequest, DescribeSecurityProfileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSecurityProfileResult>() {
            public DescribeSecurityProfileResult call() throws Exception {
                DescribeSecurityProfileResult result = null;
                try {
                    result = describeSecurityProfile(describeSecurityProfileRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeSecurityProfileRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets details and status of a traffic distribution group.
     * </p>
     * 
     * @param describeTrafficDistributionGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeTrafficDistributionGroupResult> describeTrafficDistributionGroupAsync(
            final DescribeTrafficDistributionGroupRequest describeTrafficDistributionGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrafficDistributionGroupResult>() {
            public DescribeTrafficDistributionGroupResult call() throws Exception {
                return describeTrafficDistributionGroup(describeTrafficDistributionGroupRequest);
            }
        });
    }

    /**
     * <p>
     * Gets details and status of a traffic distribution group.
     * </p>
     * 
     * @param describeTrafficDistributionGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeTrafficDistributionGroup service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeTrafficDistributionGroupResult> describeTrafficDistributionGroupAsync(
            final DescribeTrafficDistributionGroupRequest describeTrafficDistributionGroupRequest,
            final AsyncHandler<DescribeTrafficDistributionGroupRequest, DescribeTrafficDistributionGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrafficDistributionGroupResult>() {
            public DescribeTrafficDistributionGroupResult call() throws Exception {
                DescribeTrafficDistributionGroupResult result = null;
                try {
                    result = describeTrafficDistributionGroup(describeTrafficDistributionGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeTrafficDistributionGroupRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified user. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID in the Amazon Connect console</a> (it’s the final
     * part of the ARN). The console does not display the user IDs. Instead,
     * list the users and note the IDs provided in the output.
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
     * Describes the specified user. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID in the Amazon Connect console</a> (it’s the final
     * part of the ARN). The console does not display the user IDs. Instead,
     * list the users and note the IDs provided in the output.
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
     * Retrieves the view for the specified Amazon Connect instance and view
     * identifier.
     * </p>
     * <p>
     * The view identifier can be supplied as a ViewId or ARN.
     * </p>
     * <p>
     * <code>$SAVED</code> needs to be supplied if a view is unpublished.
     * </p>
     * <p>
     * The view identifier can contain an optional qualifier, for example,
     * <code>&lt;view-id&gt;:$SAVED</code>, which is either an actual version
     * number or an Amazon Connect managed qualifier
     * <code>$SAVED | $LATEST</code>. If it is not supplied, then
     * <code>$LATEST</code> is assumed for customer managed views and an error
     * is returned if there is no published content available. Version 1 is
     * assumed for Amazon Web Services managed views.
     * </p>
     * 
     * @param describeViewRequest
     * @return A Java Future object containing the response from the
     *         DescribeView service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeViewResult> describeViewAsync(
            final DescribeViewRequest describeViewRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeViewResult>() {
            public DescribeViewResult call() throws Exception {
                return describeView(describeViewRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the view for the specified Amazon Connect instance and view
     * identifier.
     * </p>
     * <p>
     * The view identifier can be supplied as a ViewId or ARN.
     * </p>
     * <p>
     * <code>$SAVED</code> needs to be supplied if a view is unpublished.
     * </p>
     * <p>
     * The view identifier can contain an optional qualifier, for example,
     * <code>&lt;view-id&gt;:$SAVED</code>, which is either an actual version
     * number or an Amazon Connect managed qualifier
     * <code>$SAVED | $LATEST</code>. If it is not supplied, then
     * <code>$LATEST</code> is assumed for customer managed views and an error
     * is returned if there is no published content available. Version 1 is
     * assumed for Amazon Web Services managed views.
     * </p>
     * 
     * @param describeViewRequest
     * @return A Java Future object containing the response from the
     *         DescribeView service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeViewResult> describeViewAsync(
            final DescribeViewRequest describeViewRequest,
            final AsyncHandler<DescribeViewRequest, DescribeViewResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeViewResult>() {
            public DescribeViewResult call() throws Exception {
                DescribeViewResult result = null;
                try {
                    result = describeView(describeViewRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeViewRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified vocabulary.
     * </p>
     * 
     * @param describeVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DescribeVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeVocabularyResult> describeVocabularyAsync(
            final DescribeVocabularyRequest describeVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVocabularyResult>() {
            public DescribeVocabularyResult call() throws Exception {
                return describeVocabulary(describeVocabularyRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified vocabulary.
     * </p>
     * 
     * @param describeVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DescribeVocabulary service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeVocabularyResult> describeVocabularyAsync(
            final DescribeVocabularyRequest describeVocabularyRequest,
            final AsyncHandler<DescribeVocabularyRequest, DescribeVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVocabularyResult>() {
            public DescribeVocabularyResult call() throws Exception {
                DescribeVocabularyResult result = null;
                try {
                    result = describeVocabulary(describeVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Removes the dataset ID associated with a given Amazon Connect instance.
     * </p>
     * 
     * @param disassociateAnalyticsDataSetRequest
     * @return A Java Future object containing the response from the
     *         DisassociateAnalyticsDataSet service method, as returned by
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
    public Future<Void> disassociateAnalyticsDataSetAsync(
            final DisassociateAnalyticsDataSetRequest disassociateAnalyticsDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateAnalyticsDataSet(disassociateAnalyticsDataSetRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Removes the dataset ID associated with a given Amazon Connect instance.
     * </p>
     * 
     * @param disassociateAnalyticsDataSetRequest
     * @return A Java Future object containing the response from the
     *         DisassociateAnalyticsDataSet service method, as returned by
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
    public Future<Void> disassociateAnalyticsDataSetAsync(
            final DisassociateAnalyticsDataSetRequest disassociateAnalyticsDataSetRequest,
            final AsyncHandler<DisassociateAnalyticsDataSetRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateAnalyticsDataSet(disassociateAnalyticsDataSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateAnalyticsDataSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes access to integrated applications from Amazon Connect.
     * </p>
     * 
     * @param disassociateApprovedOriginRequest
     * @return A Java Future object containing the response from the
     *         DisassociateApprovedOrigin service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateApprovedOriginAsync(
            final DisassociateApprovedOriginRequest disassociateApprovedOriginRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateApprovedOrigin(disassociateApprovedOriginRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes access to integrated applications from Amazon Connect.
     * </p>
     * 
     * @param disassociateApprovedOriginRequest
     * @return A Java Future object containing the response from the
     *         DisassociateApprovedOrigin service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateApprovedOriginAsync(
            final DisassociateApprovedOriginRequest disassociateApprovedOriginRequest,
            final AsyncHandler<DisassociateApprovedOriginRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateApprovedOrigin(disassociateApprovedOriginRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateApprovedOriginRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified
     * Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param disassociateBotRequest
     * @return A Java Future object containing the response from the
     *         DisassociateBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateBotAsync(final DisassociateBotRequest disassociateBotRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateBot(disassociateBotRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified
     * Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param disassociateBotRequest
     * @return A Java Future object containing the response from the
     *         DisassociateBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateBotAsync(final DisassociateBotRequest disassociateBotRequest,
            final AsyncHandler<DisassociateBotRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateBot(disassociateBotRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateBotRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Disassociates a connect resource from a flow.
     * </p>
     * 
     * @param disassociateFlowRequest
     * @return A Java Future object containing the response from the
     *         DisassociateFlow service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DisassociateFlowResult> disassociateFlowAsync(
            final DisassociateFlowRequest disassociateFlowRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DisassociateFlowResult>() {
            public DisassociateFlowResult call() throws Exception {
                return disassociateFlow(disassociateFlowRequest);
            }
        });
    }

    /**
     * <p>
     * Disassociates a connect resource from a flow.
     * </p>
     * 
     * @param disassociateFlowRequest
     * @return A Java Future object containing the response from the
     *         DisassociateFlow service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DisassociateFlowResult> disassociateFlowAsync(
            final DisassociateFlowRequest disassociateFlowRequest,
            final AsyncHandler<DisassociateFlowRequest, DisassociateFlowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisassociateFlowResult>() {
            public DisassociateFlowResult call() throws Exception {
                DisassociateFlowResult result = null;
                try {
                    result = disassociateFlow(disassociateFlowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateFlowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Removes the storage type configurations for the specified resource type
     * and association ID.
     * </p>
     * 
     * @param disassociateInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         DisassociateInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateInstanceStorageConfigAsync(
            final DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateInstanceStorageConfig(disassociateInstanceStorageConfigRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Removes the storage type configurations for the specified resource type
     * and association ID.
     * </p>
     * 
     * @param disassociateInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         DisassociateInstanceStorageConfig service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateInstanceStorageConfigAsync(
            final DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest,
            final AsyncHandler<DisassociateInstanceStorageConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateInstanceStorageConfig(disassociateInstanceStorageConfigRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateInstanceStorageConfigRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Remove the Lambda function from the dropdown options available in the
     * relevant flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
     * @return A Java Future object containing the response from the
     *         DisassociateLambdaFunction service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateLambdaFunctionAsync(
            final DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateLambdaFunction(disassociateLambdaFunctionRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Remove the Lambda function from the dropdown options available in the
     * relevant flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
     * @return A Java Future object containing the response from the
     *         DisassociateLambdaFunction service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateLambdaFunctionAsync(
            final DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest,
            final AsyncHandler<DisassociateLambdaFunctionRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateLambdaFunction(disassociateLambdaFunctionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateLambdaFunctionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified
     * Amazon Lex bot.
     * </p>
     * 
     * @param disassociateLexBotRequest
     * @return A Java Future object containing the response from the
     *         DisassociateLexBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateLexBotAsync(
            final DisassociateLexBotRequest disassociateLexBotRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateLexBot(disassociateLexBotRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified
     * Amazon Lex bot.
     * </p>
     * 
     * @param disassociateLexBotRequest
     * @return A Java Future object containing the response from the
     *         DisassociateLexBot service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateLexBotAsync(
            final DisassociateLexBotRequest disassociateLexBotRequest,
            final AsyncHandler<DisassociateLexBotRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateLexBot(disassociateLexBotRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateLexBotRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes the flow association from a phone number claimed to your Amazon
     * Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling this API using an instance in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a
     * full phone number ARN or UUID value for the <code>PhoneNumberId</code>
     * URI request parameter. However, if the number is claimed to a traffic
     * distribution group and you are calling this API using an instance in the
     * alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID
     * is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param disassociatePhoneNumberContactFlowRequest
     * @return A Java Future object containing the response from the
     *         DisassociatePhoneNumberContactFlow service method, as returned by
     *         Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociatePhoneNumberContactFlowAsync(
            final DisassociatePhoneNumberContactFlowRequest disassociatePhoneNumberContactFlowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociatePhoneNumberContactFlow(disassociatePhoneNumberContactFlowRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Removes the flow association from a phone number claimed to your Amazon
     * Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are
     * calling this API using an instance in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a
     * full phone number ARN or UUID value for the <code>PhoneNumberId</code>
     * URI request parameter. However, if the number is claimed to a traffic
     * distribution group and you are calling this API using an instance in the
     * alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID
     * is provided in this scenario, you will receive a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param disassociatePhoneNumberContactFlowRequest
     * @return A Java Future object containing the response from the
     *         DisassociatePhoneNumberContactFlow service method, as returned by
     *         Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociatePhoneNumberContactFlowAsync(
            final DisassociatePhoneNumberContactFlowRequest disassociatePhoneNumberContactFlowRequest,
            final AsyncHandler<DisassociatePhoneNumberContactFlowRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociatePhoneNumberContactFlow(disassociatePhoneNumberContactFlowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociatePhoneNumberContactFlowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Disassociates a set of quick connects from a queue.
     * </p>
     * 
     * @param disassociateQueueQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         DisassociateQueueQuickConnects service method, as returned by
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
    public Future<Void> disassociateQueueQuickConnectsAsync(
            final DisassociateQueueQuickConnectsRequest disassociateQueueQuickConnectsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateQueueQuickConnects(disassociateQueueQuickConnectsRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Disassociates a set of quick connects from a queue.
     * </p>
     * 
     * @param disassociateQueueQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         DisassociateQueueQuickConnects service method, as returned by
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
    public Future<Void> disassociateQueueQuickConnectsAsync(
            final DisassociateQueueQuickConnectsRequest disassociateQueueQuickConnectsRequest,
            final AsyncHandler<DisassociateQueueQuickConnectsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateQueueQuickConnects(disassociateQueueQuickConnectsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateQueueQuickConnectsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         DisassociateRoutingProfileQueues service method, as returned by
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
    public Future<Void> disassociateRoutingProfileQueuesAsync(
            final DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateRoutingProfileQueues(disassociateRoutingProfileQueuesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         DisassociateRoutingProfileQueues service method, as returned by
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
    public Future<Void> disassociateRoutingProfileQueuesAsync(
            final DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest,
            final AsyncHandler<DisassociateRoutingProfileQueuesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateRoutingProfileQueues(disassociateRoutingProfileQueuesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateRoutingProfileQueuesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes the specified security key.
     * </p>
     * 
     * @param disassociateSecurityKeyRequest
     * @return A Java Future object containing the response from the
     *         DisassociateSecurityKey service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateSecurityKeyAsync(
            final DisassociateSecurityKeyRequest disassociateSecurityKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateSecurityKey(disassociateSecurityKeyRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Deletes the specified security key.
     * </p>
     * 
     * @param disassociateSecurityKeyRequest
     * @return A Java Future object containing the response from the
     *         DisassociateSecurityKey service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> disassociateSecurityKeyAsync(
            final DisassociateSecurityKeyRequest disassociateSecurityKeyRequest,
            final AsyncHandler<DisassociateSecurityKeyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateSecurityKey(disassociateSecurityKeyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateSecurityKeyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Disassociates an agent from a traffic distribution group.
     * </p>
     * 
     * @param disassociateTrafficDistributionGroupUserRequest
     * @return A Java Future object containing the response from the
     *         DisassociateTrafficDistributionGroupUser service method, as
     *         returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DisassociateTrafficDistributionGroupUserResult> disassociateTrafficDistributionGroupUserAsync(
            final DisassociateTrafficDistributionGroupUserRequest disassociateTrafficDistributionGroupUserRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DisassociateTrafficDistributionGroupUserResult>() {
                    public DisassociateTrafficDistributionGroupUserResult call() throws Exception {
                        return disassociateTrafficDistributionGroupUser(disassociateTrafficDistributionGroupUserRequest);
                    }
                });
    }

    /**
     * <p>
     * Disassociates an agent from a traffic distribution group.
     * </p>
     * 
     * @param disassociateTrafficDistributionGroupUserRequest
     * @return A Java Future object containing the response from the
     *         DisassociateTrafficDistributionGroupUser service method, as
     *         returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DisassociateTrafficDistributionGroupUserResult> disassociateTrafficDistributionGroupUserAsync(
            final DisassociateTrafficDistributionGroupUserRequest disassociateTrafficDistributionGroupUserRequest,
            final AsyncHandler<DisassociateTrafficDistributionGroupUserRequest, DisassociateTrafficDistributionGroupUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DisassociateTrafficDistributionGroupUserResult>() {
                    public DisassociateTrafficDistributionGroupUserResult call() throws Exception {
                        DisassociateTrafficDistributionGroupUserResult result = null;
                        try {
                            result = disassociateTrafficDistributionGroupUser(disassociateTrafficDistributionGroupUserRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(disassociateTrafficDistributionGroupUserRequest,
                                result);
                        return result;
                    }
                });
    }

    /**
     * <p>
     * Disassociates a set of proficiencies from a user.
     * </p>
     * 
     * @param disassociateUserProficienciesRequest
     * @return A Java Future object containing the response from the
     *         DisassociateUserProficiencies service method, as returned by
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
    public Future<Void> disassociateUserProficienciesAsync(
            final DisassociateUserProficienciesRequest disassociateUserProficienciesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disassociateUserProficiencies(disassociateUserProficienciesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Disassociates a set of proficiencies from a user.
     * </p>
     * 
     * @param disassociateUserProficienciesRequest
     * @return A Java Future object containing the response from the
     *         DisassociateUserProficiencies service method, as returned by
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
    public Future<Void> disassociateUserProficienciesAsync(
            final DisassociateUserProficienciesRequest disassociateUserProficienciesRequest,
            final AsyncHandler<DisassociateUserProficienciesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    disassociateUserProficiencies(disassociateUserProficienciesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disassociateUserProficienciesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Dismisses contacts from an agent’s CCP and returns the agent to an
     * available state, which allows the agent to receive a new routed contact.
     * Contacts can only be dismissed if they are in a <code>MISSED</code>,
     * <code>ERROR</code>, <code>ENDED</code>, or <code>REJECTED</code> state in
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >Agent Event Stream</a>.
     * </p>
     * 
     * @param dismissUserContactRequest
     * @return A Java Future object containing the response from the
     *         DismissUserContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DismissUserContactResult> dismissUserContactAsync(
            final DismissUserContactRequest dismissUserContactRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DismissUserContactResult>() {
            public DismissUserContactResult call() throws Exception {
                return dismissUserContact(dismissUserContactRequest);
            }
        });
    }

    /**
     * <p>
     * Dismisses contacts from an agent’s CCP and returns the agent to an
     * available state, which allows the agent to receive a new routed contact.
     * Contacts can only be dismissed if they are in a <code>MISSED</code>,
     * <code>ERROR</code>, <code>ENDED</code>, or <code>REJECTED</code> state in
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >Agent Event Stream</a>.
     * </p>
     * 
     * @param dismissUserContactRequest
     * @return A Java Future object containing the response from the
     *         DismissUserContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DismissUserContactResult> dismissUserContactAsync(
            final DismissUserContactRequest dismissUserContactRequest,
            final AsyncHandler<DismissUserContactRequest, DismissUserContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DismissUserContactResult>() {
            public DismissUserContactResult call() throws Exception {
                DismissUserContactResult result = null;
                try {
                    result = dismissUserContact(dismissUserContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(dismissUserContactRequest, result);
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
     * For a description of each metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
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
     * For a description of each metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
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
     * Gets the real-time active user data from the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param getCurrentUserDataRequest
     * @return A Java Future object containing the response from the
     *         GetCurrentUserData service method, as returned by Amazon Connect.
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
    public Future<GetCurrentUserDataResult> getCurrentUserDataAsync(
            final GetCurrentUserDataRequest getCurrentUserDataRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCurrentUserDataResult>() {
            public GetCurrentUserDataResult call() throws Exception {
                return getCurrentUserData(getCurrentUserDataRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the real-time active user data from the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param getCurrentUserDataRequest
     * @return A Java Future object containing the response from the
     *         GetCurrentUserData service method, as returned by Amazon Connect.
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
    public Future<GetCurrentUserDataResult> getCurrentUserDataAsync(
            final GetCurrentUserDataRequest getCurrentUserDataRequest,
            final AsyncHandler<GetCurrentUserDataRequest, GetCurrentUserDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCurrentUserDataResult>() {
            public GetCurrentUserDataResult call() throws Exception {
                GetCurrentUserDataResult result = null;
                try {
                    result = getCurrentUserData(getCurrentUserDataRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getCurrentUserDataRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Supports SAML sign-in for Amazon Connect. Retrieves a token for
     * federation. The token is for the Amazon Connect user which corresponds to
     * the IAM credentials that were used to invoke this action.
     * </p>
     * <p>
     * For more information about how SAML sign-in works in Amazon Connect, see
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/configure-saml.html "
     * >Configure SAML with IAM for Amazon Connect in the <i>Amazon Connect
     * Administrator Guide</i>.</a>
     * </p>
     * <note>
     * <p>
     * This API doesn't support root users. If you try to invoke
     * GetFederationToken with root credentials, an error message similar to the
     * following one appears:
     * </p>
     * <p>
     * <code>Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect</code>
     * </p>
     * </note>
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
     * Supports SAML sign-in for Amazon Connect. Retrieves a token for
     * federation. The token is for the Amazon Connect user which corresponds to
     * the IAM credentials that were used to invoke this action.
     * </p>
     * <p>
     * For more information about how SAML sign-in works in Amazon Connect, see
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/configure-saml.html "
     * >Configure SAML with IAM for Amazon Connect in the <i>Amazon Connect
     * Administrator Guide</i>.</a>
     * </p>
     * <note>
     * <p>
     * This API doesn't support root users. If you try to invoke
     * GetFederationToken with root credentials, an error message similar to the
     * following one appears:
     * </p>
     * <p>
     * <code>Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect</code>
     * </p>
     * </note>
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
     * Retrieves the flow associated for a given resource.
     * </p>
     * 
     * @param getFlowAssociationRequest
     * @return A Java Future object containing the response from the
     *         GetFlowAssociation service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetFlowAssociationResult> getFlowAssociationAsync(
            final GetFlowAssociationRequest getFlowAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFlowAssociationResult>() {
            public GetFlowAssociationResult call() throws Exception {
                return getFlowAssociation(getFlowAssociationRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the flow associated for a given resource.
     * </p>
     * 
     * @param getFlowAssociationRequest
     * @return A Java Future object containing the response from the
     *         GetFlowAssociation service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetFlowAssociationResult> getFlowAssociationAsync(
            final GetFlowAssociationRequest getFlowAssociationRequest,
            final AsyncHandler<GetFlowAssociationRequest, GetFlowAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFlowAssociationResult>() {
            public GetFlowAssociationResult call() throws Exception {
                GetFlowAssociationResult result = null;
                try {
                    result = getFlowAssociation(getFlowAssociationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getFlowAssociationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each historical metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical Metrics Definitions</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <note>
     * <p>
     * We recommend using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricDataV2.html"
     * >GetMetricDataV2</a> API. It provides more flexibility, features, and the
     * ability to query longer time ranges than <code>GetMetricData</code>. Use
     * it to retrieve historical agent and contact metrics for the last 3
     * months, at varying intervals. You can also use it to build custom
     * dashboards to measure historical queue and agent performance. For
     * example, you can track the number of incoming contacts for the last 7
     * days, with data split by day, to see how contact volume changed per day
     * of the week.
     * </p>
     * </note>
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
     * For a description of each historical metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical Metrics Definitions</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <note>
     * <p>
     * We recommend using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricDataV2.html"
     * >GetMetricDataV2</a> API. It provides more flexibility, features, and the
     * ability to query longer time ranges than <code>GetMetricData</code>. Use
     * it to retrieve historical agent and contact metrics for the last 3
     * months, at varying intervals. You can also use it to build custom
     * dashboards to measure historical queue and agent performance. For
     * example, you can track the number of incoming contacts for the last 7
     * days, with data split by day, to see how contact volume changed per day
     * of the week.
     * </p>
     * </note>
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
     * Gets metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * <code>GetMetricDataV2</code> offers more features than <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricData.html"
     * >GetMetricData</a>, the previous version of this API. It has new metrics,
     * offers filtering at a metric level, and offers the ability to filter and
     * group data by channels, queues, routing profiles, agents, and agent
     * hierarchy levels. It can retrieve historical data for the last 3 months,
     * at varying intervals.
     * </p>
     * <p>
     * For a description of the historical metrics that are supported by
     * <code>GetMetricDataV2</code> and <code>GetMetricData</code>, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical metrics definitions</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * 
     * @param getMetricDataV2Request
     * @return A Java Future object containing the response from the
     *         GetMetricDataV2 service method, as returned by Amazon Connect.
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
    public Future<GetMetricDataV2Result> getMetricDataV2Async(
            final GetMetricDataV2Request getMetricDataV2Request) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetMetricDataV2Result>() {
            public GetMetricDataV2Result call() throws Exception {
                return getMetricDataV2(getMetricDataV2Request);
            }
        });
    }

    /**
     * <p>
     * Gets metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * <code>GetMetricDataV2</code> offers more features than <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricData.html"
     * >GetMetricData</a>, the previous version of this API. It has new metrics,
     * offers filtering at a metric level, and offers the ability to filter and
     * group data by channels, queues, routing profiles, agents, and agent
     * hierarchy levels. It can retrieve historical data for the last 3 months,
     * at varying intervals.
     * </p>
     * <p>
     * For a description of the historical metrics that are supported by
     * <code>GetMetricDataV2</code> and <code>GetMetricData</code>, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical metrics definitions</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * 
     * @param getMetricDataV2Request
     * @return A Java Future object containing the response from the
     *         GetMetricDataV2 service method, as returned by Amazon Connect.
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
    public Future<GetMetricDataV2Result> getMetricDataV2Async(
            final GetMetricDataV2Request getMetricDataV2Request,
            final AsyncHandler<GetMetricDataV2Request, GetMetricDataV2Result> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMetricDataV2Result>() {
            public GetMetricDataV2Result call() throws Exception {
                GetMetricDataV2Result result = null;
                try {
                    result = getMetricDataV2(getMetricDataV2Request);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getMetricDataV2Request, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the prompt file.
     * </p>
     * 
     * @param getPromptFileRequest
     * @return A Java Future object containing the response from the
     *         GetPromptFile service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws InvalidRequestException
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
    public Future<GetPromptFileResult> getPromptFileAsync(
            final GetPromptFileRequest getPromptFileRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetPromptFileResult>() {
            public GetPromptFileResult call() throws Exception {
                return getPromptFile(getPromptFileRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the prompt file.
     * </p>
     * 
     * @param getPromptFileRequest
     * @return A Java Future object containing the response from the
     *         GetPromptFile service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws InvalidRequestException
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
    public Future<GetPromptFileResult> getPromptFileAsync(
            final GetPromptFileRequest getPromptFileRequest,
            final AsyncHandler<GetPromptFileRequest, GetPromptFileResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPromptFileResult>() {
            public GetPromptFileResult call() throws Exception {
                GetPromptFileResult result = null;
                try {
                    result = getPromptFile(getPromptFileRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getPromptFileRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets details about a specific task template in the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param getTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         GetTaskTemplate service method, as returned by Amazon Connect.
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
    public Future<GetTaskTemplateResult> getTaskTemplateAsync(
            final GetTaskTemplateRequest getTaskTemplateRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetTaskTemplateResult>() {
            public GetTaskTemplateResult call() throws Exception {
                return getTaskTemplate(getTaskTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Gets details about a specific task template in the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param getTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         GetTaskTemplate service method, as returned by Amazon Connect.
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
    public Future<GetTaskTemplateResult> getTaskTemplateAsync(
            final GetTaskTemplateRequest getTaskTemplateRequest,
            final AsyncHandler<GetTaskTemplateRequest, GetTaskTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTaskTemplateResult>() {
            public GetTaskTemplateResult call() throws Exception {
                GetTaskTemplateResult result = null;
                try {
                    result = getTaskTemplate(getTaskTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getTaskTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the current traffic distribution for a given traffic
     * distribution group.
     * </p>
     * 
     * @param getTrafficDistributionRequest
     * @return A Java Future object containing the response from the
     *         GetTrafficDistribution service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetTrafficDistributionResult> getTrafficDistributionAsync(
            final GetTrafficDistributionRequest getTrafficDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTrafficDistributionResult>() {
            public GetTrafficDistributionResult call() throws Exception {
                return getTrafficDistribution(getTrafficDistributionRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the current traffic distribution for a given traffic
     * distribution group.
     * </p>
     * 
     * @param getTrafficDistributionRequest
     * @return A Java Future object containing the response from the
     *         GetTrafficDistribution service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetTrafficDistributionResult> getTrafficDistributionAsync(
            final GetTrafficDistributionRequest getTrafficDistributionRequest,
            final AsyncHandler<GetTrafficDistributionRequest, GetTrafficDistributionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTrafficDistributionResult>() {
            public GetTrafficDistributionResult call() throws Exception {
                GetTrafficDistributionResult result = null;
                try {
                    result = getTrafficDistribution(getTrafficDistributionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getTrafficDistributionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Imports a claimed phone number from an external service, such as Amazon
     * Pinpoint, into an Amazon Connect instance. You can call this API only in
     * the same Amazon Web Services Region where the Amazon Connect instance was
     * created.
     * </p>
     * 
     * @param importPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         ImportPhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ImportPhoneNumberResult> importPhoneNumberAsync(
            final ImportPhoneNumberRequest importPhoneNumberRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ImportPhoneNumberResult>() {
            public ImportPhoneNumberResult call() throws Exception {
                return importPhoneNumber(importPhoneNumberRequest);
            }
        });
    }

    /**
     * <p>
     * Imports a claimed phone number from an external service, such as Amazon
     * Pinpoint, into an Amazon Connect instance. You can call this API only in
     * the same Amazon Web Services Region where the Amazon Connect instance was
     * created.
     * </p>
     * 
     * @param importPhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         ImportPhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ImportPhoneNumberResult> importPhoneNumberAsync(
            final ImportPhoneNumberRequest importPhoneNumberRequest,
            final AsyncHandler<ImportPhoneNumberRequest, ImportPhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ImportPhoneNumberResult>() {
            public ImportPhoneNumberResult call() throws Exception {
                ImportPhoneNumberResult result = null;
                try {
                    result = importPhoneNumber(importPhoneNumberRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(importPhoneNumberRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists agent statuses.
     * </p>
     * 
     * @param listAgentStatusesRequest
     * @return A Java Future object containing the response from the
     *         ListAgentStatuses service method, as returned by Amazon Connect.
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
    public Future<ListAgentStatusesResult> listAgentStatusesAsync(
            final ListAgentStatusesRequest listAgentStatusesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListAgentStatusesResult>() {
            public ListAgentStatusesResult call() throws Exception {
                return listAgentStatuses(listAgentStatusesRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists agent statuses.
     * </p>
     * 
     * @param listAgentStatusesRequest
     * @return A Java Future object containing the response from the
     *         ListAgentStatuses service method, as returned by Amazon Connect.
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
    public Future<ListAgentStatusesResult> listAgentStatusesAsync(
            final ListAgentStatusesRequest listAgentStatusesRequest,
            final AsyncHandler<ListAgentStatusesRequest, ListAgentStatusesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAgentStatusesResult>() {
            public ListAgentStatusesResult call() throws Exception {
                ListAgentStatusesResult result = null;
                try {
                    result = listAgentStatuses(listAgentStatusesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listAgentStatusesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists the association status of requested dataset ID for a given Amazon
     * Connect instance.
     * </p>
     * 
     * @param listAnalyticsDataAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListAnalyticsDataAssociations service method, as returned by
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
    public Future<ListAnalyticsDataAssociationsResult> listAnalyticsDataAssociationsAsync(
            final ListAnalyticsDataAssociationsRequest listAnalyticsDataAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAnalyticsDataAssociationsResult>() {
            public ListAnalyticsDataAssociationsResult call() throws Exception {
                return listAnalyticsDataAssociations(listAnalyticsDataAssociationsRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists the association status of requested dataset ID for a given Amazon
     * Connect instance.
     * </p>
     * 
     * @param listAnalyticsDataAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListAnalyticsDataAssociations service method, as returned by
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
    public Future<ListAnalyticsDataAssociationsResult> listAnalyticsDataAssociationsAsync(
            final ListAnalyticsDataAssociationsRequest listAnalyticsDataAssociationsRequest,
            final AsyncHandler<ListAnalyticsDataAssociationsRequest, ListAnalyticsDataAssociationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAnalyticsDataAssociationsResult>() {
            public ListAnalyticsDataAssociationsResult call() throws Exception {
                ListAnalyticsDataAssociationsResult result = null;
                try {
                    result = listAnalyticsDataAssociations(listAnalyticsDataAssociationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listAnalyticsDataAssociationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all approved origins associated with the
     * instance.
     * </p>
     * 
     * @param listApprovedOriginsRequest
     * @return A Java Future object containing the response from the
     *         ListApprovedOrigins service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListApprovedOriginsResult> listApprovedOriginsAsync(
            final ListApprovedOriginsRequest listApprovedOriginsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListApprovedOriginsResult>() {
            public ListApprovedOriginsResult call() throws Exception {
                return listApprovedOrigins(listApprovedOriginsRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all approved origins associated with the
     * instance.
     * </p>
     * 
     * @param listApprovedOriginsRequest
     * @return A Java Future object containing the response from the
     *         ListApprovedOrigins service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListApprovedOriginsResult> listApprovedOriginsAsync(
            final ListApprovedOriginsRequest listApprovedOriginsRequest,
            final AsyncHandler<ListApprovedOriginsRequest, ListApprovedOriginsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListApprovedOriginsResult>() {
            public ListApprovedOriginsResult call() throws Exception {
                ListApprovedOriginsResult result = null;
                try {
                    result = listApprovedOrigins(listApprovedOriginsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listApprovedOriginsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * For the specified version of Amazon Lex, returns a paginated list of all
     * the Amazon Lex bots currently associated with the instance. Use this API
     * to returns both Amazon Lex V1 and V2 bots.
     * </p>
     * 
     * @param listBotsRequest
     * @return A Java Future object containing the response from the ListBots
     *         service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListBotsResult> listBotsAsync(final ListBotsRequest listBotsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListBotsResult>() {
            public ListBotsResult call() throws Exception {
                return listBots(listBotsRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * For the specified version of Amazon Lex, returns a paginated list of all
     * the Amazon Lex bots currently associated with the instance. Use this API
     * to returns both Amazon Lex V1 and V2 bots.
     * </p>
     * 
     * @param listBotsRequest
     * @return A Java Future object containing the response from the ListBots
     *         service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListBotsResult> listBotsAsync(final ListBotsRequest listBotsRequest,
            final AsyncHandler<ListBotsRequest, ListBotsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListBotsResult>() {
            public ListBotsResult call() throws Exception {
                ListBotsResult result = null;
                try {
                    result = listBots(listBotsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listBotsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists contact evaluations in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactEvaluationsRequest
     * @return A Java Future object containing the response from the
     *         ListContactEvaluations service method, as returned by Amazon
     *         Connect.
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
    public Future<ListContactEvaluationsResult> listContactEvaluationsAsync(
            final ListContactEvaluationsRequest listContactEvaluationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListContactEvaluationsResult>() {
            public ListContactEvaluationsResult call() throws Exception {
                return listContactEvaluations(listContactEvaluationsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists contact evaluations in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactEvaluationsRequest
     * @return A Java Future object containing the response from the
     *         ListContactEvaluations service method, as returned by Amazon
     *         Connect.
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
    public Future<ListContactEvaluationsResult> listContactEvaluationsAsync(
            final ListContactEvaluationsRequest listContactEvaluationsRequest,
            final AsyncHandler<ListContactEvaluationsRequest, ListContactEvaluationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListContactEvaluationsResult>() {
            public ListContactEvaluationsResult call() throws Exception {
                ListContactEvaluationsResult result = null;
                try {
                    result = listContactEvaluations(listContactEvaluationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listContactEvaluationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the flow modules for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listContactFlowModulesRequest
     * @return A Java Future object containing the response from the
     *         ListContactFlowModules service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
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
    public Future<ListContactFlowModulesResult> listContactFlowModulesAsync(
            final ListContactFlowModulesRequest listContactFlowModulesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListContactFlowModulesResult>() {
            public ListContactFlowModulesResult call() throws Exception {
                return listContactFlowModules(listContactFlowModulesRequest);
            }
        });
    }

    /**
     * <p>
     * Provides information about the flow modules for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listContactFlowModulesRequest
     * @return A Java Future object containing the response from the
     *         ListContactFlowModules service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
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
    public Future<ListContactFlowModulesResult> listContactFlowModulesAsync(
            final ListContactFlowModulesRequest listContactFlowModulesRequest,
            final AsyncHandler<ListContactFlowModulesRequest, ListContactFlowModulesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListContactFlowModulesResult>() {
            public ListContactFlowModulesResult call() throws Exception {
                ListContactFlowModulesResult result = null;
                try {
                    result = listContactFlowModules(listContactFlowModulesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listContactFlowModulesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the flows for the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * For more information about flows, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html"
     * >Flows</a> in the <i>Amazon Connect Administrator Guide</i>.
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
     * Provides information about the flows for the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * For more information about flows, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html"
     * >Flows</a> in the <i>Amazon Connect Administrator Guide</i>.
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
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * For the specified <code>referenceTypes</code>, returns a list of
     * references associated with the contact.
     * </p>
     * 
     * @param listContactReferencesRequest
     * @return A Java Future object containing the response from the
     *         ListContactReferences service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListContactReferencesResult> listContactReferencesAsync(
            final ListContactReferencesRequest listContactReferencesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListContactReferencesResult>() {
            public ListContactReferencesResult call() throws Exception {
                return listContactReferences(listContactReferencesRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * For the specified <code>referenceTypes</code>, returns a list of
     * references associated with the contact.
     * </p>
     * 
     * @param listContactReferencesRequest
     * @return A Java Future object containing the response from the
     *         ListContactReferences service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListContactReferencesResult> listContactReferencesAsync(
            final ListContactReferencesRequest listContactReferencesRequest,
            final AsyncHandler<ListContactReferencesRequest, ListContactReferencesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListContactReferencesResult>() {
            public ListContactReferencesResult call() throws Exception {
                ListContactReferencesResult result = null;
                try {
                    result = listContactReferences(listContactReferencesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listContactReferencesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the default vocabularies for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listDefaultVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         ListDefaultVocabularies service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListDefaultVocabulariesResult> listDefaultVocabulariesAsync(
            final ListDefaultVocabulariesRequest listDefaultVocabulariesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDefaultVocabulariesResult>() {
            public ListDefaultVocabulariesResult call() throws Exception {
                return listDefaultVocabularies(listDefaultVocabulariesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the default vocabularies for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listDefaultVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         ListDefaultVocabularies service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListDefaultVocabulariesResult> listDefaultVocabulariesAsync(
            final ListDefaultVocabulariesRequest listDefaultVocabulariesRequest,
            final AsyncHandler<ListDefaultVocabulariesRequest, ListDefaultVocabulariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDefaultVocabulariesResult>() {
            public ListDefaultVocabulariesResult call() throws Exception {
                ListDefaultVocabulariesResult result = null;
                try {
                    result = listDefaultVocabularies(listDefaultVocabulariesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listDefaultVocabulariesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists versions of an evaluation form in the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listEvaluationFormVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListEvaluationFormVersions service method, as returned by Amazon
     *         Connect.
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
    public Future<ListEvaluationFormVersionsResult> listEvaluationFormVersionsAsync(
            final ListEvaluationFormVersionsRequest listEvaluationFormVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEvaluationFormVersionsResult>() {
            public ListEvaluationFormVersionsResult call() throws Exception {
                return listEvaluationFormVersions(listEvaluationFormVersionsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists versions of an evaluation form in the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listEvaluationFormVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListEvaluationFormVersions service method, as returned by Amazon
     *         Connect.
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
    public Future<ListEvaluationFormVersionsResult> listEvaluationFormVersionsAsync(
            final ListEvaluationFormVersionsRequest listEvaluationFormVersionsRequest,
            final AsyncHandler<ListEvaluationFormVersionsRequest, ListEvaluationFormVersionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEvaluationFormVersionsResult>() {
            public ListEvaluationFormVersionsResult call() throws Exception {
                ListEvaluationFormVersionsResult result = null;
                try {
                    result = listEvaluationFormVersions(listEvaluationFormVersionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listEvaluationFormVersionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists evaluation forms in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listEvaluationFormsRequest
     * @return A Java Future object containing the response from the
     *         ListEvaluationForms service method, as returned by Amazon
     *         Connect.
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
    public Future<ListEvaluationFormsResult> listEvaluationFormsAsync(
            final ListEvaluationFormsRequest listEvaluationFormsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEvaluationFormsResult>() {
            public ListEvaluationFormsResult call() throws Exception {
                return listEvaluationForms(listEvaluationFormsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists evaluation forms in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listEvaluationFormsRequest
     * @return A Java Future object containing the response from the
     *         ListEvaluationForms service method, as returned by Amazon
     *         Connect.
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
    public Future<ListEvaluationFormsResult> listEvaluationFormsAsync(
            final ListEvaluationFormsRequest listEvaluationFormsRequest,
            final AsyncHandler<ListEvaluationFormsRequest, ListEvaluationFormsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEvaluationFormsResult>() {
            public ListEvaluationFormsResult call() throws Exception {
                ListEvaluationFormsResult result = null;
                try {
                    result = listEvaluationForms(listEvaluationFormsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listEvaluationFormsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * List the flow association based on the filters.
     * </p>
     * 
     * @param listFlowAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListFlowAssociations service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListFlowAssociationsResult> listFlowAssociationsAsync(
            final ListFlowAssociationsRequest listFlowAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListFlowAssociationsResult>() {
            public ListFlowAssociationsResult call() throws Exception {
                return listFlowAssociations(listFlowAssociationsRequest);
            }
        });
    }

    /**
     * <p>
     * List the flow association based on the filters.
     * </p>
     * 
     * @param listFlowAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListFlowAssociations service method, as returned by Amazon
     *         Connect.
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListFlowAssociationsResult> listFlowAssociationsAsync(
            final ListFlowAssociationsRequest listFlowAssociationsRequest,
            final AsyncHandler<ListFlowAssociationsRequest, ListFlowAssociationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListFlowAssociationsResult>() {
            public ListFlowAssociationsResult call() throws Exception {
                ListFlowAssociationsResult result = null;
                try {
                    result = listFlowAssociations(listFlowAssociationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listFlowAssociationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the hours of operation for the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * For more information about hours of operation, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-hours-operation.html"
     * >Set the Hours of Operation for a Queue</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
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
     * <p>
     * For more information about hours of operation, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-hours-operation.html"
     * >Set the Hours of Operation for a Queue</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
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
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all attribute types for the given instance.
     * </p>
     * 
     * @param listInstanceAttributesRequest
     * @return A Java Future object containing the response from the
     *         ListInstanceAttributes service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListInstanceAttributesResult> listInstanceAttributesAsync(
            final ListInstanceAttributesRequest listInstanceAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInstanceAttributesResult>() {
            public ListInstanceAttributesResult call() throws Exception {
                return listInstanceAttributes(listInstanceAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all attribute types for the given instance.
     * </p>
     * 
     * @param listInstanceAttributesRequest
     * @return A Java Future object containing the response from the
     *         ListInstanceAttributes service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListInstanceAttributesResult> listInstanceAttributesAsync(
            final ListInstanceAttributesRequest listInstanceAttributesRequest,
            final AsyncHandler<ListInstanceAttributesRequest, ListInstanceAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInstanceAttributesResult>() {
            public ListInstanceAttributesResult call() throws Exception {
                ListInstanceAttributesResult result = null;
                try {
                    result = listInstanceAttributes(listInstanceAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listInstanceAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of storage configs for the identified instance
     * and resource type.
     * </p>
     * 
     * @param listInstanceStorageConfigsRequest
     * @return A Java Future object containing the response from the
     *         ListInstanceStorageConfigs service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(
            final ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInstanceStorageConfigsResult>() {
            public ListInstanceStorageConfigsResult call() throws Exception {
                return listInstanceStorageConfigs(listInstanceStorageConfigsRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of storage configs for the identified instance
     * and resource type.
     * </p>
     * 
     * @param listInstanceStorageConfigsRequest
     * @return A Java Future object containing the response from the
     *         ListInstanceStorageConfigs service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(
            final ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest,
            final AsyncHandler<ListInstanceStorageConfigsRequest, ListInstanceStorageConfigsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInstanceStorageConfigsResult>() {
            public ListInstanceStorageConfigsResult call() throws Exception {
                ListInstanceStorageConfigsResult result = null;
                try {
                    result = listInstanceStorageConfigs(listInstanceStorageConfigsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listInstanceStorageConfigsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Return a list of instances which are in active state,
     * creation-in-progress state, and failed state. Instances that aren't
     * successfully created (they are in a failed state) are returned only for
     * 24 hours after the CreateInstance API was invoked.
     * </p>
     * 
     * @param listInstancesRequest
     * @return A Java Future object containing the response from the
     *         ListInstances service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListInstancesResult> listInstancesAsync(
            final ListInstancesRequest listInstancesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListInstancesResult>() {
            public ListInstancesResult call() throws Exception {
                return listInstances(listInstancesRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Return a list of instances which are in active state,
     * creation-in-progress state, and failed state. Instances that aren't
     * successfully created (they are in a failed state) are returned only for
     * 24 hours after the CreateInstance API was invoked.
     * </p>
     * 
     * @param listInstancesRequest
     * @return A Java Future object containing the response from the
     *         ListInstances service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListInstancesResult> listInstancesAsync(
            final ListInstancesRequest listInstancesRequest,
            final AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInstancesResult>() {
            public ListInstancesResult call() throws Exception {
                ListInstancesResult result = null;
                try {
                    result = listInstances(listInstancesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listInstancesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the Amazon Web Services resource
     * associations for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listIntegrationAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListIntegrationAssociations service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(
            final ListIntegrationAssociationsRequest listIntegrationAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIntegrationAssociationsResult>() {
            public ListIntegrationAssociationsResult call() throws Exception {
                return listIntegrationAssociations(listIntegrationAssociationsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the Amazon Web Services resource
     * associations for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listIntegrationAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListIntegrationAssociations service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(
            final ListIntegrationAssociationsRequest listIntegrationAssociationsRequest,
            final AsyncHandler<ListIntegrationAssociationsRequest, ListIntegrationAssociationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIntegrationAssociationsResult>() {
            public ListIntegrationAssociationsResult call() throws Exception {
                ListIntegrationAssociationsResult result = null;
                try {
                    result = listIntegrationAssociations(listIntegrationAssociationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listIntegrationAssociationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all Lambda functions that display in the
     * dropdown options in the relevant flow blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @return A Java Future object containing the response from the
     *         ListLambdaFunctions service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(
            final ListLambdaFunctionsRequest listLambdaFunctionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLambdaFunctionsResult>() {
            public ListLambdaFunctionsResult call() throws Exception {
                return listLambdaFunctions(listLambdaFunctionsRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all Lambda functions that display in the
     * dropdown options in the relevant flow blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @return A Java Future object containing the response from the
     *         ListLambdaFunctions service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(
            final ListLambdaFunctionsRequest listLambdaFunctionsRequest,
            final AsyncHandler<ListLambdaFunctionsRequest, ListLambdaFunctionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLambdaFunctionsResult>() {
            public ListLambdaFunctionsResult call() throws Exception {
                ListLambdaFunctionsResult result = null;
                try {
                    result = listLambdaFunctions(listLambdaFunctionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listLambdaFunctionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all the Amazon Lex V1 bots currently
     * associated with the instance. To return both Amazon Lex V1 and V2 bots,
     * use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListBots.html"
     * >ListBots</a> API.
     * </p>
     * 
     * @param listLexBotsRequest
     * @return A Java Future object containing the response from the ListLexBots
     *         service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListLexBotsResult> listLexBotsAsync(final ListLexBotsRequest listLexBotsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLexBotsResult>() {
            public ListLexBotsResult call() throws Exception {
                return listLexBots(listLexBotsRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all the Amazon Lex V1 bots currently
     * associated with the instance. To return both Amazon Lex V1 and V2 bots,
     * use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListBots.html"
     * >ListBots</a> API.
     * </p>
     * 
     * @param listLexBotsRequest
     * @return A Java Future object containing the response from the ListLexBots
     *         service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListLexBotsResult> listLexBotsAsync(final ListLexBotsRequest listLexBotsRequest,
            final AsyncHandler<ListLexBotsRequest, ListLexBotsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLexBotsResult>() {
            public ListLexBotsResult call() throws Exception {
                ListLexBotsResult result = null;
                try {
                    result = listLexBots(listLexBotsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listLexBotsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon
     * Connect instance.
     * </p>
     * <p>
     * For more information about phone numbers, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html"
     * >Set Up Phone Numbers for Your Contact Center</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * We recommend using <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> to return phone number types. ListPhoneNumbers
     * doesn't support number types <code>UIFN</code>, <code>SHARED</code>,
     * <code>THIRD_PARTY_TF</code>, and <code>THIRD_PARTY_DID</code>. While it
     * returns numbers of those types, it incorrectly lists them as
     * <code>TOLL_FREE</code> or <code>DID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The phone number <code>Arn</code> value that is returned from each of the
     * items in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbers.html#connect-ListPhoneNumbers-response-PhoneNumberSummaryList"
     * >PhoneNumberSummaryList</a> cannot be used to tag phone number resources.
     * It will fail with a <code>ResourceNotFoundException</code>. Instead, use
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API. It returns the new phone number ARN that can
     * be used to tag phone number resources.
     * </p>
     * </li>
     * </ul>
     * </important>
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
     * <p>
     * For more information about phone numbers, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html"
     * >Set Up Phone Numbers for Your Contact Center</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * We recommend using <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> to return phone number types. ListPhoneNumbers
     * doesn't support number types <code>UIFN</code>, <code>SHARED</code>,
     * <code>THIRD_PARTY_TF</code>, and <code>THIRD_PARTY_DID</code>. While it
     * returns numbers of those types, it incorrectly lists them as
     * <code>TOLL_FREE</code> or <code>DID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The phone number <code>Arn</code> value that is returned from each of the
     * items in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbers.html#connect-ListPhoneNumbers-response-PhoneNumberSummaryList"
     * >PhoneNumberSummaryList</a> cannot be used to tag phone number resources.
     * It will fail with a <code>ResourceNotFoundException</code>. Instead, use
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API. It returns the new phone number ARN that can
     * be used to tag phone number resources.
     * </p>
     * </li>
     * </ul>
     * </important>
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
     * Lists phone numbers claimed to your Amazon Connect instance or traffic
     * distribution group. If the provided <code>TargetArn</code> is a traffic
     * distribution group, you can call this API in both Amazon Web Services
     * Regions associated with traffic distribution group.
     * </p>
     * <p>
     * For more information about phone numbers, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html"
     * >Set Up Phone Numbers for Your Contact Center</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * When given an instance ARN, <code>ListPhoneNumbersV2</code> returns only
     * the phone numbers claimed to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * When given a traffic distribution group ARN
     * <code>ListPhoneNumbersV2</code> returns only the phone numbers claimed to
     * the traffic distribution group.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listPhoneNumbersV2Request
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbersV2 service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListPhoneNumbersV2Result> listPhoneNumbersV2Async(
            final ListPhoneNumbersV2Request listPhoneNumbersV2Request)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPhoneNumbersV2Result>() {
            public ListPhoneNumbersV2Result call() throws Exception {
                return listPhoneNumbersV2(listPhoneNumbersV2Request);
            }
        });
    }

    /**
     * <p>
     * Lists phone numbers claimed to your Amazon Connect instance or traffic
     * distribution group. If the provided <code>TargetArn</code> is a traffic
     * distribution group, you can call this API in both Amazon Web Services
     * Regions associated with traffic distribution group.
     * </p>
     * <p>
     * For more information about phone numbers, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html"
     * >Set Up Phone Numbers for Your Contact Center</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * When given an instance ARN, <code>ListPhoneNumbersV2</code> returns only
     * the phone numbers claimed to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * When given a traffic distribution group ARN
     * <code>ListPhoneNumbersV2</code> returns only the phone numbers claimed to
     * the traffic distribution group.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listPhoneNumbersV2Request
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbersV2 service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListPhoneNumbersV2Result> listPhoneNumbersV2Async(
            final ListPhoneNumbersV2Request listPhoneNumbersV2Request,
            final AsyncHandler<ListPhoneNumbersV2Request, ListPhoneNumbersV2Result> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPhoneNumbersV2Result>() {
            public ListPhoneNumbersV2Result call() throws Exception {
                ListPhoneNumbersV2Result result = null;
                try {
                    result = listPhoneNumbersV2(listPhoneNumbersV2Request);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listPhoneNumbersV2Request, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists predefined attributes for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listPredefinedAttributesRequest
     * @return A Java Future object containing the response from the
     *         ListPredefinedAttributes service method, as returned by Amazon
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
    public Future<ListPredefinedAttributesResult> listPredefinedAttributesAsync(
            final ListPredefinedAttributesRequest listPredefinedAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPredefinedAttributesResult>() {
            public ListPredefinedAttributesResult call() throws Exception {
                return listPredefinedAttributes(listPredefinedAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists predefined attributes for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listPredefinedAttributesRequest
     * @return A Java Future object containing the response from the
     *         ListPredefinedAttributes service method, as returned by Amazon
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
    public Future<ListPredefinedAttributesResult> listPredefinedAttributesAsync(
            final ListPredefinedAttributesRequest listPredefinedAttributesRequest,
            final AsyncHandler<ListPredefinedAttributesRequest, ListPredefinedAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPredefinedAttributesResult>() {
            public ListPredefinedAttributesResult call() throws Exception {
                ListPredefinedAttributesResult result = null;
                try {
                    result = listPredefinedAttributes(listPredefinedAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listPredefinedAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @return A Java Future object containing the response from the ListPrompts
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
    public Future<ListPromptsResult> listPromptsAsync(final ListPromptsRequest listPromptsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPromptsResult>() {
            public ListPromptsResult call() throws Exception {
                return listPrompts(listPromptsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @return A Java Future object containing the response from the ListPrompts
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
    public Future<ListPromptsResult> listPromptsAsync(final ListPromptsRequest listPromptsRequest,
            final AsyncHandler<ListPromptsRequest, ListPromptsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPromptsResult>() {
            public ListPromptsResult call() throws Exception {
                ListPromptsResult result = null;
                try {
                    result = listPrompts(listPromptsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listPromptsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists the quick connects associated with a queue.
     * </p>
     * 
     * @param listQueueQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         ListQueueQuickConnects service method, as returned by Amazon
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
    public Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(
            final ListQueueQuickConnectsRequest listQueueQuickConnectsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListQueueQuickConnectsResult>() {
            public ListQueueQuickConnectsResult call() throws Exception {
                return listQueueQuickConnects(listQueueQuickConnectsRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Lists the quick connects associated with a queue.
     * </p>
     * 
     * @param listQueueQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         ListQueueQuickConnects service method, as returned by Amazon
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
    public Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(
            final ListQueueQuickConnectsRequest listQueueQuickConnectsRequest,
            final AsyncHandler<ListQueueQuickConnectsRequest, ListQueueQuickConnectsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListQueueQuickConnectsResult>() {
            public ListQueueQuickConnectsResult call() throws Exception {
                ListQueueQuickConnectsResult result = null;
                try {
                    result = listQueueQuickConnects(listQueueQuickConnectsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listQueueQuickConnectsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * If you do not specify a <code>QueueTypes</code> parameter, both standard
     * and agent queues are returned. This might cause an unexpected truncation
     * of results if you have more than 1000 agents and you limit the number of
     * results of the API call in code.
     * </p>
     * <p>
     * For more information about queues, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-queues-standard-and-agent.html"
     * >Queues: Standard and Agent</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     * <p>
     * If you do not specify a <code>QueueTypes</code> parameter, both standard
     * and agent queues are returned. This might cause an unexpected truncation
     * of results if you have more than 1000 agents and you limit the number of
     * results of the API call in code.
     * </p>
     * <p>
     * For more information about queues, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-queues-standard-and-agent.html"
     * >Queues: Standard and Agent</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     * Provides information about the quick connects for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         ListQuickConnects service method, as returned by Amazon Connect.
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
    public Future<ListQuickConnectsResult> listQuickConnectsAsync(
            final ListQuickConnectsRequest listQuickConnectsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListQuickConnectsResult>() {
            public ListQuickConnectsResult call() throws Exception {
                return listQuickConnects(listQuickConnectsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides information about the quick connects for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         ListQuickConnects service method, as returned by Amazon Connect.
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
    public Future<ListQuickConnectsResult> listQuickConnectsAsync(
            final ListQuickConnectsRequest listQuickConnectsRequest,
            final AsyncHandler<ListQuickConnectsRequest, ListQuickConnectsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListQuickConnectsResult>() {
            public ListQuickConnectsResult call() throws Exception {
                ListQuickConnectsResult result = null;
                try {
                    result = listQuickConnects(listQuickConnectsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listQuickConnectsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides a list of analysis segments for a real-time analysis session.
     * </p>
     * 
     * @param listRealtimeContactAnalysisSegmentsV2Request
     * @return A Java Future object containing the response from the
     *         ListRealtimeContactAnalysisSegmentsV2 service method, as returned
     *         by Amazon Connect.
     * @throws OutputTypeNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListRealtimeContactAnalysisSegmentsV2Result> listRealtimeContactAnalysisSegmentsV2Async(
            final ListRealtimeContactAnalysisSegmentsV2Request listRealtimeContactAnalysisSegmentsV2Request)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRealtimeContactAnalysisSegmentsV2Result>() {
            public ListRealtimeContactAnalysisSegmentsV2Result call() throws Exception {
                return listRealtimeContactAnalysisSegmentsV2(listRealtimeContactAnalysisSegmentsV2Request);
            }
        });
    }

    /**
     * <p>
     * Provides a list of analysis segments for a real-time analysis session.
     * </p>
     * 
     * @param listRealtimeContactAnalysisSegmentsV2Request
     * @return A Java Future object containing the response from the
     *         ListRealtimeContactAnalysisSegmentsV2 service method, as returned
     *         by Amazon Connect.
     * @throws OutputTypeNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListRealtimeContactAnalysisSegmentsV2Result> listRealtimeContactAnalysisSegmentsV2Async(
            final ListRealtimeContactAnalysisSegmentsV2Request listRealtimeContactAnalysisSegmentsV2Request,
            final AsyncHandler<ListRealtimeContactAnalysisSegmentsV2Request, ListRealtimeContactAnalysisSegmentsV2Result> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRealtimeContactAnalysisSegmentsV2Result>() {
            public ListRealtimeContactAnalysisSegmentsV2Result call() throws Exception {
                ListRealtimeContactAnalysisSegmentsV2Result result = null;
                try {
                    result = listRealtimeContactAnalysisSegmentsV2(listRealtimeContactAnalysisSegmentsV2Request);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listRealtimeContactAnalysisSegmentsV2Request, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         ListRoutingProfileQueues service method, as returned by Amazon
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
    public Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(
            final ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRoutingProfileQueuesResult>() {
            public ListRoutingProfileQueuesResult call() throws Exception {
                return listRoutingProfileQueues(listRoutingProfileQueuesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         ListRoutingProfileQueues service method, as returned by Amazon
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
    public Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(
            final ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest,
            final AsyncHandler<ListRoutingProfileQueuesRequest, ListRoutingProfileQueuesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRoutingProfileQueuesResult>() {
            public ListRoutingProfileQueuesResult call() throws Exception {
                ListRoutingProfileQueuesResult result = null;
                try {
                    result = listRoutingProfileQueues(listRoutingProfileQueuesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listRoutingProfileQueuesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * For more information about routing profiles, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing.html"
     * >Routing Profiles</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/routing-profiles.html"
     * >Create a Routing Profile</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     * <p>
     * For more information about routing profiles, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing.html"
     * >Routing Profiles</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/routing-profiles.html"
     * >Create a Routing Profile</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     * List all rules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future object containing the response from the ListRules
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListRulesResult> listRulesAsync(final ListRulesRequest listRulesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRulesResult>() {
            public ListRulesResult call() throws Exception {
                return listRules(listRulesRequest);
            }
        });
    }

    /**
     * <p>
     * List all rules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future object containing the response from the ListRules
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListRulesResult> listRulesAsync(final ListRulesRequest listRulesRequest,
            final AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRulesResult>() {
            public ListRulesResult call() throws Exception {
                ListRulesResult result = null;
                try {
                    result = listRules(listRulesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listRulesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all security keys associated with the
     * instance.
     * </p>
     * 
     * @param listSecurityKeysRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityKeys service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListSecurityKeysResult> listSecurityKeysAsync(
            final ListSecurityKeysRequest listSecurityKeysRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListSecurityKeysResult>() {
            public ListSecurityKeysResult call() throws Exception {
                return listSecurityKeys(listSecurityKeysRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Returns a paginated list of all security keys associated with the
     * instance.
     * </p>
     * 
     * @param listSecurityKeysRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityKeys service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListSecurityKeysResult> listSecurityKeysAsync(
            final ListSecurityKeysRequest listSecurityKeysRequest,
            final AsyncHandler<ListSecurityKeysRequest, ListSecurityKeysResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSecurityKeysResult>() {
            public ListSecurityKeysResult call() throws Exception {
                ListSecurityKeysResult result = null;
                try {
                    result = listSecurityKeys(listSecurityKeysRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listSecurityKeysRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list of third-party applications in a specific security
     * profile.
     * </p>
     * 
     * @param listSecurityProfileApplicationsRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityProfileApplications service method, as returned by
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
    public Future<ListSecurityProfileApplicationsResult> listSecurityProfileApplicationsAsync(
            final ListSecurityProfileApplicationsRequest listSecurityProfileApplicationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSecurityProfileApplicationsResult>() {
            public ListSecurityProfileApplicationsResult call() throws Exception {
                return listSecurityProfileApplications(listSecurityProfileApplicationsRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list of third-party applications in a specific security
     * profile.
     * </p>
     * 
     * @param listSecurityProfileApplicationsRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityProfileApplications service method, as returned by
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
    public Future<ListSecurityProfileApplicationsResult> listSecurityProfileApplicationsAsync(
            final ListSecurityProfileApplicationsRequest listSecurityProfileApplicationsRequest,
            final AsyncHandler<ListSecurityProfileApplicationsRequest, ListSecurityProfileApplicationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSecurityProfileApplicationsResult>() {
            public ListSecurityProfileApplicationsResult call() throws Exception {
                ListSecurityProfileApplicationsResult result = null;
                try {
                    result = listSecurityProfileApplications(listSecurityProfileApplicationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listSecurityProfileApplicationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the permissions granted to a security profile.
     * </p>
     * 
     * @param listSecurityProfilePermissionsRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityProfilePermissions service method, as returned by
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
    public Future<ListSecurityProfilePermissionsResult> listSecurityProfilePermissionsAsync(
            final ListSecurityProfilePermissionsRequest listSecurityProfilePermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSecurityProfilePermissionsResult>() {
            public ListSecurityProfilePermissionsResult call() throws Exception {
                return listSecurityProfilePermissions(listSecurityProfilePermissionsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the permissions granted to a security profile.
     * </p>
     * 
     * @param listSecurityProfilePermissionsRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityProfilePermissions service method, as returned by
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
    public Future<ListSecurityProfilePermissionsResult> listSecurityProfilePermissionsAsync(
            final ListSecurityProfilePermissionsRequest listSecurityProfilePermissionsRequest,
            final AsyncHandler<ListSecurityProfilePermissionsRequest, ListSecurityProfilePermissionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSecurityProfilePermissionsResult>() {
            public ListSecurityProfilePermissionsResult call() throws Exception {
                ListSecurityProfilePermissionsResult result = null;
                try {
                    result = listSecurityProfilePermissions(listSecurityProfilePermissionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listSecurityProfilePermissionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the security profiles for the
     * specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about security profiles, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/connect-security-profiles.html"
     * >Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
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
     * <p>
     * For more information about security profiles, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/connect-security-profiles.html"
     * >Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
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
     * <p>
     * For sample policies that use tags, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html"
     * >Amazon Connect Identity-Based Policy Examples</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
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
     * <p>
     * For sample policies that use tags, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html"
     * >Amazon Connect Identity-Based Policy Examples</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
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
     * Lists task templates for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listTaskTemplatesRequest
     * @return A Java Future object containing the response from the
     *         ListTaskTemplates service method, as returned by Amazon Connect.
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
    public Future<ListTaskTemplatesResult> listTaskTemplatesAsync(
            final ListTaskTemplatesRequest listTaskTemplatesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListTaskTemplatesResult>() {
            public ListTaskTemplatesResult call() throws Exception {
                return listTaskTemplates(listTaskTemplatesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists task templates for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listTaskTemplatesRequest
     * @return A Java Future object containing the response from the
     *         ListTaskTemplates service method, as returned by Amazon Connect.
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
    public Future<ListTaskTemplatesResult> listTaskTemplatesAsync(
            final ListTaskTemplatesRequest listTaskTemplatesRequest,
            final AsyncHandler<ListTaskTemplatesRequest, ListTaskTemplatesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTaskTemplatesResult>() {
            public ListTaskTemplatesResult call() throws Exception {
                ListTaskTemplatesResult result = null;
                try {
                    result = listTaskTemplates(listTaskTemplatesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTaskTemplatesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists traffic distribution group users.
     * </p>
     * 
     * @param listTrafficDistributionGroupUsersRequest
     * @return A Java Future object containing the response from the
     *         ListTrafficDistributionGroupUsers service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws AccessDeniedException
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
    public Future<ListTrafficDistributionGroupUsersResult> listTrafficDistributionGroupUsersAsync(
            final ListTrafficDistributionGroupUsersRequest listTrafficDistributionGroupUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTrafficDistributionGroupUsersResult>() {
            public ListTrafficDistributionGroupUsersResult call() throws Exception {
                return listTrafficDistributionGroupUsers(listTrafficDistributionGroupUsersRequest);
            }
        });
    }

    /**
     * <p>
     * Lists traffic distribution group users.
     * </p>
     * 
     * @param listTrafficDistributionGroupUsersRequest
     * @return A Java Future object containing the response from the
     *         ListTrafficDistributionGroupUsers service method, as returned by
     *         Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws AccessDeniedException
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
    public Future<ListTrafficDistributionGroupUsersResult> listTrafficDistributionGroupUsersAsync(
            final ListTrafficDistributionGroupUsersRequest listTrafficDistributionGroupUsersRequest,
            final AsyncHandler<ListTrafficDistributionGroupUsersRequest, ListTrafficDistributionGroupUsersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTrafficDistributionGroupUsersResult>() {
            public ListTrafficDistributionGroupUsersResult call() throws Exception {
                ListTrafficDistributionGroupUsersResult result = null;
                try {
                    result = listTrafficDistributionGroupUsers(listTrafficDistributionGroupUsersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTrafficDistributionGroupUsersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists traffic distribution groups.
     * </p>
     * 
     * @param listTrafficDistributionGroupsRequest
     * @return A Java Future object containing the response from the
     *         ListTrafficDistributionGroups service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
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
    public Future<ListTrafficDistributionGroupsResult> listTrafficDistributionGroupsAsync(
            final ListTrafficDistributionGroupsRequest listTrafficDistributionGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTrafficDistributionGroupsResult>() {
            public ListTrafficDistributionGroupsResult call() throws Exception {
                return listTrafficDistributionGroups(listTrafficDistributionGroupsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists traffic distribution groups.
     * </p>
     * 
     * @param listTrafficDistributionGroupsRequest
     * @return A Java Future object containing the response from the
     *         ListTrafficDistributionGroups service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
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
    public Future<ListTrafficDistributionGroupsResult> listTrafficDistributionGroupsAsync(
            final ListTrafficDistributionGroupsRequest listTrafficDistributionGroupsRequest,
            final AsyncHandler<ListTrafficDistributionGroupsRequest, ListTrafficDistributionGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTrafficDistributionGroupsResult>() {
            public ListTrafficDistributionGroupsResult call() throws Exception {
                ListTrafficDistributionGroupsResult result = null;
                try {
                    result = listTrafficDistributionGroups(listTrafficDistributionGroupsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTrafficDistributionGroupsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the use cases for the integration association.
     * </p>
     * 
     * @param listUseCasesRequest <p>
     *            Provides summary information about the use cases for the
     *            specified integration association.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListUseCases service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListUseCasesResult> listUseCasesAsync(
            final ListUseCasesRequest listUseCasesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListUseCasesResult>() {
            public ListUseCasesResult call() throws Exception {
                return listUseCases(listUseCasesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the use cases for the integration association.
     * </p>
     * 
     * @param listUseCasesRequest <p>
     *            Provides summary information about the use cases for the
     *            specified integration association.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListUseCases service method, as returned by Amazon Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListUseCasesResult> listUseCasesAsync(
            final ListUseCasesRequest listUseCasesRequest,
            final AsyncHandler<ListUseCasesRequest, ListUseCasesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListUseCasesResult>() {
            public ListUseCasesResult call() throws Exception {
                ListUseCasesResult result = null;
                try {
                    result = listUseCases(listUseCasesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listUseCasesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * For more information about agent hierarchies, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html"
     * >Set Up Agent Hierarchies</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     * <p>
     * For more information about agent hierarchies, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html"
     * >Set Up Agent Hierarchies</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     * Lists proficiencies associated with a user.
     * </p>
     * 
     * @param listUserProficienciesRequest
     * @return A Java Future object containing the response from the
     *         ListUserProficiencies service method, as returned by Amazon
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
    public Future<ListUserProficienciesResult> listUserProficienciesAsync(
            final ListUserProficienciesRequest listUserProficienciesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListUserProficienciesResult>() {
            public ListUserProficienciesResult call() throws Exception {
                return listUserProficiencies(listUserProficienciesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists proficiencies associated with a user.
     * </p>
     * 
     * @param listUserProficienciesRequest
     * @return A Java Future object containing the response from the
     *         ListUserProficiencies service method, as returned by Amazon
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
    public Future<ListUserProficienciesResult> listUserProficienciesAsync(
            final ListUserProficienciesRequest listUserProficienciesRequest,
            final AsyncHandler<ListUserProficienciesRequest, ListUserProficienciesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListUserProficienciesResult>() {
            public ListUserProficienciesResult call() throws Exception {
                ListUserProficienciesResult result = null;
                try {
                    result = listUserProficiencies(listUserProficienciesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listUserProficienciesRequest, result);
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
     * Returns all the available versions for the specified Amazon Connect
     * instance and view identifier.
     * </p>
     * <p>
     * Results will be sorted from highest to lowest.
     * </p>
     * 
     * @param listViewVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListViewVersions service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListViewVersionsResult> listViewVersionsAsync(
            final ListViewVersionsRequest listViewVersionsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListViewVersionsResult>() {
            public ListViewVersionsResult call() throws Exception {
                return listViewVersions(listViewVersionsRequest);
            }
        });
    }

    /**
     * <p>
     * Returns all the available versions for the specified Amazon Connect
     * instance and view identifier.
     * </p>
     * <p>
     * Results will be sorted from highest to lowest.
     * </p>
     * 
     * @param listViewVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListViewVersions service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListViewVersionsResult> listViewVersionsAsync(
            final ListViewVersionsRequest listViewVersionsRequest,
            final AsyncHandler<ListViewVersionsRequest, ListViewVersionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListViewVersionsResult>() {
            public ListViewVersionsResult call() throws Exception {
                ListViewVersionsResult result = null;
                try {
                    result = listViewVersions(listViewVersionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listViewVersionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns views in the given instance.
     * </p>
     * <p>
     * Results are sorted primarily by type, and secondarily by name.
     * </p>
     * 
     * @param listViewsRequest
     * @return A Java Future object containing the response from the ListViews
     *         service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListViewsResult> listViewsAsync(final ListViewsRequest listViewsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListViewsResult>() {
            public ListViewsResult call() throws Exception {
                return listViews(listViewsRequest);
            }
        });
    }

    /**
     * <p>
     * Returns views in the given instance.
     * </p>
     * <p>
     * Results are sorted primarily by type, and secondarily by name.
     * </p>
     * 
     * @param listViewsRequest
     * @return A Java Future object containing the response from the ListViews
     *         service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListViewsResult> listViewsAsync(final ListViewsRequest listViewsRequest,
            final AsyncHandler<ListViewsRequest, ListViewsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListViewsResult>() {
            public ListViewsResult call() throws Exception {
                ListViewsResult result = null;
                try {
                    result = listViews(listViewsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listViewsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Initiates silent monitoring of a contact. The Contact Control Panel (CCP)
     * of the user specified by <i>userId</i> will be set to silent monitoring
     * mode on the contact.
     * </p>
     * 
     * @param monitorContactRequest
     * @return A Java Future object containing the response from the
     *         MonitorContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
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
    public Future<MonitorContactResult> monitorContactAsync(
            final MonitorContactRequest monitorContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<MonitorContactResult>() {
            public MonitorContactResult call() throws Exception {
                return monitorContact(monitorContactRequest);
            }
        });
    }

    /**
     * <p>
     * Initiates silent monitoring of a contact. The Contact Control Panel (CCP)
     * of the user specified by <i>userId</i> will be set to silent monitoring
     * mode on the contact.
     * </p>
     * 
     * @param monitorContactRequest
     * @return A Java Future object containing the response from the
     *         MonitorContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
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
    public Future<MonitorContactResult> monitorContactAsync(
            final MonitorContactRequest monitorContactRequest,
            final AsyncHandler<MonitorContactRequest, MonitorContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<MonitorContactResult>() {
            public MonitorContactResult call() throws Exception {
                MonitorContactResult result = null;
                try {
                    result = monitorContact(monitorContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(monitorContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Allows pausing an ongoing task contact.
     * </p>
     * 
     * @param pauseContactRequest
     * @return A Java Future object containing the response from the
     *         PauseContact service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<PauseContactResult> pauseContactAsync(
            final PauseContactRequest pauseContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<PauseContactResult>() {
            public PauseContactResult call() throws Exception {
                return pauseContact(pauseContactRequest);
            }
        });
    }

    /**
     * <p>
     * Allows pausing an ongoing task contact.
     * </p>
     * 
     * @param pauseContactRequest
     * @return A Java Future object containing the response from the
     *         PauseContact service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<PauseContactResult> pauseContactAsync(
            final PauseContactRequest pauseContactRequest,
            final AsyncHandler<PauseContactRequest, PauseContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PauseContactResult>() {
            public PauseContactResult call() throws Exception {
                PauseContactResult result = null;
                try {
                    result = pauseContact(pauseContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(pauseContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Changes the current status of a user or agent in Amazon Connect. If the
     * agent is currently handling a contact, this sets the agent's next status.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/metrics-agent-status.html"
     * >Agent status</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-next-status.html"
     * >Set your next status</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param putUserStatusRequest
     * @return A Java Future object containing the response from the
     *         PutUserStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<PutUserStatusResult> putUserStatusAsync(
            final PutUserStatusRequest putUserStatusRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<PutUserStatusResult>() {
            public PutUserStatusResult call() throws Exception {
                return putUserStatus(putUserStatusRequest);
            }
        });
    }

    /**
     * <p>
     * Changes the current status of a user or agent in Amazon Connect. If the
     * agent is currently handling a contact, this sets the agent's next status.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/metrics-agent-status.html"
     * >Agent status</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-next-status.html"
     * >Set your next status</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param putUserStatusRequest
     * @return A Java Future object containing the response from the
     *         PutUserStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<PutUserStatusResult> putUserStatusAsync(
            final PutUserStatusRequest putUserStatusRequest,
            final AsyncHandler<PutUserStatusRequest, PutUserStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutUserStatusResult>() {
            public PutUserStatusResult call() throws Exception {
                PutUserStatusResult result = null;
                try {
                    result = putUserStatus(putUserStatusRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putUserStatusRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Releases a phone number previously claimed to an Amazon Connect instance
     * or traffic distribution group. You can call this API only in the Amazon
     * Web Services Region where the number was claimed.
     * </p>
     * <important>
     * <p>
     * To release phone numbers from a traffic distribution group, use the
     * <code>ReleasePhoneNumber</code> API, not the Amazon Connect admin
     * website.
     * </p>
     * <p>
     * After releasing a phone number, the phone number enters into a cooldown
     * period of 30 days. It cannot be searched for or claimed again until the
     * period has ended. If you accidentally release a phone number, contact
     * Amazon Web Services Support.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day
     * period, contact us for a service quota exception. Otherwise, it is
     * possible you will be blocked from claiming and releasing any more numbers
     * until 30 days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of
     * active phone numbers during any 30 day period. If you claim and release
     * phone numbers using the UI or API during a rolling 30 day cycle that
     * exceeds 200% of your phone number service level quota, you will be
     * blocked from claiming any more numbers until 30 days past the oldest
     * number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level
     * quota of 99 phone numbers, and in any 30 day period you release 99, claim
     * 99, and then release 99, you will have exceeded the 200% limit. At that
     * point you are blocked from claiming any more numbers until you open an
     * Amazon Web Services support ticket.
     * </p>
     * 
     * @param releasePhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         ReleasePhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceInUseException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> releasePhoneNumberAsync(
            final ReleasePhoneNumberRequest releasePhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                releasePhoneNumber(releasePhoneNumberRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Releases a phone number previously claimed to an Amazon Connect instance
     * or traffic distribution group. You can call this API only in the Amazon
     * Web Services Region where the number was claimed.
     * </p>
     * <important>
     * <p>
     * To release phone numbers from a traffic distribution group, use the
     * <code>ReleasePhoneNumber</code> API, not the Amazon Connect admin
     * website.
     * </p>
     * <p>
     * After releasing a phone number, the phone number enters into a cooldown
     * period of 30 days. It cannot be searched for or claimed again until the
     * period has ended. If you accidentally release a phone number, contact
     * Amazon Web Services Support.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day
     * period, contact us for a service quota exception. Otherwise, it is
     * possible you will be blocked from claiming and releasing any more numbers
     * until 30 days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of
     * active phone numbers during any 30 day period. If you claim and release
     * phone numbers using the UI or API during a rolling 30 day cycle that
     * exceeds 200% of your phone number service level quota, you will be
     * blocked from claiming any more numbers until 30 days past the oldest
     * number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level
     * quota of 99 phone numbers, and in any 30 day period you release 99, claim
     * 99, and then release 99, you will have exceeded the 200% limit. At that
     * point you are blocked from claiming any more numbers until you open an
     * Amazon Web Services support ticket.
     * </p>
     * 
     * @param releasePhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         ReleasePhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceInUseException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> releasePhoneNumberAsync(
            final ReleasePhoneNumberRequest releasePhoneNumberRequest,
            final AsyncHandler<ReleasePhoneNumberRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    releasePhoneNumber(releasePhoneNumberRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(releasePhoneNumberRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Replicates an Amazon Connect instance in the specified Amazon Web
     * Services Region and copies configuration information for Amazon Connect
     * resources across Amazon Web Services Regions.
     * </p>
     * <p>
     * For more information about replicating an Amazon Connect instance, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-replica-connect-instance.html"
     * >Create a replica of your existing Amazon Connect instance</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param replicateInstanceRequest
     * @return A Java Future object containing the response from the
     *         ReplicateInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ResourceNotReadyException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ReplicateInstanceResult> replicateInstanceAsync(
            final ReplicateInstanceRequest replicateInstanceRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ReplicateInstanceResult>() {
            public ReplicateInstanceResult call() throws Exception {
                return replicateInstance(replicateInstanceRequest);
            }
        });
    }

    /**
     * <p>
     * Replicates an Amazon Connect instance in the specified Amazon Web
     * Services Region and copies configuration information for Amazon Connect
     * resources across Amazon Web Services Regions.
     * </p>
     * <p>
     * For more information about replicating an Amazon Connect instance, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-replica-connect-instance.html"
     * >Create a replica of your existing Amazon Connect instance</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param replicateInstanceRequest
     * @return A Java Future object containing the response from the
     *         ReplicateInstance service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ResourceNotReadyException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ReplicateInstanceResult> replicateInstanceAsync(
            final ReplicateInstanceRequest replicateInstanceRequest,
            final AsyncHandler<ReplicateInstanceRequest, ReplicateInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReplicateInstanceResult>() {
            public ReplicateInstanceResult call() throws Exception {
                ReplicateInstanceResult result = null;
                try {
                    result = replicateInstance(replicateInstanceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(replicateInstanceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Allows resuming a task contact in a paused state.
     * </p>
     * 
     * @param resumeContactRequest
     * @return A Java Future object containing the response from the
     *         ResumeContact service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ResumeContactResult> resumeContactAsync(
            final ResumeContactRequest resumeContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ResumeContactResult>() {
            public ResumeContactResult call() throws Exception {
                return resumeContact(resumeContactRequest);
            }
        });
    }

    /**
     * <p>
     * Allows resuming a task contact in a paused state.
     * </p>
     * 
     * @param resumeContactRequest
     * @return A Java Future object containing the response from the
     *         ResumeContact service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ResumeContactResult> resumeContactAsync(
            final ResumeContactRequest resumeContactRequest,
            final AsyncHandler<ResumeContactRequest, ResumeContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResumeContactResult>() {
            public ResumeContactResult call() throws Exception {
                ResumeContactResult result = null;
                try {
                    result = resumeContact(resumeContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(resumeContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended
     * using SuspendContactRecording, this API resumes recording whatever
     * recording is selected in the flow configuration: call, screen, or both.
     * If only call recording or only screen recording is enabled, then it would
     * resume.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         ResumeContactRecording service method, as returned by Amazon
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
    public Future<ResumeContactRecordingResult> resumeContactRecordingAsync(
            final ResumeContactRecordingRequest resumeContactRecordingRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResumeContactRecordingResult>() {
            public ResumeContactRecordingResult call() throws Exception {
                return resumeContactRecording(resumeContactRecordingRequest);
            }
        });
    }

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended
     * using SuspendContactRecording, this API resumes recording whatever
     * recording is selected in the flow configuration: call, screen, or both.
     * If only call recording or only screen recording is enabled, then it would
     * resume.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         ResumeContactRecording service method, as returned by Amazon
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
    public Future<ResumeContactRecordingResult> resumeContactRecordingAsync(
            final ResumeContactRecordingRequest resumeContactRecordingRequest,
            final AsyncHandler<ResumeContactRecordingRequest, ResumeContactRecordingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResumeContactRecordingResult>() {
            public ResumeContactRecordingResult call() throws Exception {
                ResumeContactRecordingResult result = null;
                try {
                    result = resumeContactRecording(resumeContactRecordingRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(resumeContactRecordingRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches for available phone numbers that you can claim to your Amazon
     * Connect instance or traffic distribution group. If the provided
     * <code>TargetArn</code> is a traffic distribution group, you can call this
     * API in both Amazon Web Services Regions associated with the traffic
     * distribution group.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         SearchAvailablePhoneNumbers service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            final SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchAvailablePhoneNumbersResult>() {
            public SearchAvailablePhoneNumbersResult call() throws Exception {
                return searchAvailablePhoneNumbers(searchAvailablePhoneNumbersRequest);
            }
        });
    }

    /**
     * <p>
     * Searches for available phone numbers that you can claim to your Amazon
     * Connect instance or traffic distribution group. If the provided
     * <code>TargetArn</code> is a traffic distribution group, you can call this
     * API in both Amazon Web Services Regions associated with the traffic
     * distribution group.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         SearchAvailablePhoneNumbers service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            final SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest,
            final AsyncHandler<SearchAvailablePhoneNumbersRequest, SearchAvailablePhoneNumbersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchAvailablePhoneNumbersResult>() {
            public SearchAvailablePhoneNumbersResult call() throws Exception {
                SearchAvailablePhoneNumbersResult result = null;
                try {
                    result = searchAvailablePhoneNumbers(searchAvailablePhoneNumbersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchAvailablePhoneNumbersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches contacts in an Amazon Connect instance.
     * </p>
     * 
     * @param searchContactsRequest
     * @return A Java Future object containing the response from the
     *         SearchContacts service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SearchContactsResult> searchContactsAsync(
            final SearchContactsRequest searchContactsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<SearchContactsResult>() {
            public SearchContactsResult call() throws Exception {
                return searchContacts(searchContactsRequest);
            }
        });
    }

    /**
     * <p>
     * Searches contacts in an Amazon Connect instance.
     * </p>
     * 
     * @param searchContactsRequest
     * @return A Java Future object containing the response from the
     *         SearchContacts service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SearchContactsResult> searchContactsAsync(
            final SearchContactsRequest searchContactsRequest,
            final AsyncHandler<SearchContactsRequest, SearchContactsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchContactsResult>() {
            public SearchContactsResult call() throws Exception {
                SearchContactsResult result = null;
                try {
                    result = searchContacts(searchContactsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchContactsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches the hours of operation in an Amazon Connect instance, with
     * optional filtering.
     * </p>
     * 
     * @param searchHoursOfOperationsRequest
     * @return A Java Future object containing the response from the
     *         SearchHoursOfOperations service method, as returned by Amazon
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
    public Future<SearchHoursOfOperationsResult> searchHoursOfOperationsAsync(
            final SearchHoursOfOperationsRequest searchHoursOfOperationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchHoursOfOperationsResult>() {
            public SearchHoursOfOperationsResult call() throws Exception {
                return searchHoursOfOperations(searchHoursOfOperationsRequest);
            }
        });
    }

    /**
     * <p>
     * Searches the hours of operation in an Amazon Connect instance, with
     * optional filtering.
     * </p>
     * 
     * @param searchHoursOfOperationsRequest
     * @return A Java Future object containing the response from the
     *         SearchHoursOfOperations service method, as returned by Amazon
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
    public Future<SearchHoursOfOperationsResult> searchHoursOfOperationsAsync(
            final SearchHoursOfOperationsRequest searchHoursOfOperationsRequest,
            final AsyncHandler<SearchHoursOfOperationsRequest, SearchHoursOfOperationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchHoursOfOperationsResult>() {
            public SearchHoursOfOperationsResult call() throws Exception {
                SearchHoursOfOperationsResult result = null;
                try {
                    result = searchHoursOfOperations(searchHoursOfOperationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchHoursOfOperationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Predefined attributes that meet certain criteria.
     * </p>
     * 
     * @param searchPredefinedAttributesRequest
     * @return A Java Future object containing the response from the
     *         SearchPredefinedAttributes service method, as returned by Amazon
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
    public Future<SearchPredefinedAttributesResult> searchPredefinedAttributesAsync(
            final SearchPredefinedAttributesRequest searchPredefinedAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchPredefinedAttributesResult>() {
            public SearchPredefinedAttributesResult call() throws Exception {
                return searchPredefinedAttributes(searchPredefinedAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Predefined attributes that meet certain criteria.
     * </p>
     * 
     * @param searchPredefinedAttributesRequest
     * @return A Java Future object containing the response from the
     *         SearchPredefinedAttributes service method, as returned by Amazon
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
    public Future<SearchPredefinedAttributesResult> searchPredefinedAttributesAsync(
            final SearchPredefinedAttributesRequest searchPredefinedAttributesRequest,
            final AsyncHandler<SearchPredefinedAttributesRequest, SearchPredefinedAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchPredefinedAttributesResult>() {
            public SearchPredefinedAttributesResult call() throws Exception {
                SearchPredefinedAttributesResult result = null;
                try {
                    result = searchPredefinedAttributes(searchPredefinedAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchPredefinedAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches prompts in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchPromptsRequest
     * @return A Java Future object containing the response from the
     *         SearchPrompts service method, as returned by Amazon Connect.
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
    public Future<SearchPromptsResult> searchPromptsAsync(
            final SearchPromptsRequest searchPromptsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<SearchPromptsResult>() {
            public SearchPromptsResult call() throws Exception {
                return searchPrompts(searchPromptsRequest);
            }
        });
    }

    /**
     * <p>
     * Searches prompts in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchPromptsRequest
     * @return A Java Future object containing the response from the
     *         SearchPrompts service method, as returned by Amazon Connect.
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
    public Future<SearchPromptsResult> searchPromptsAsync(
            final SearchPromptsRequest searchPromptsRequest,
            final AsyncHandler<SearchPromptsRequest, SearchPromptsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchPromptsResult>() {
            public SearchPromptsResult call() throws Exception {
                SearchPromptsResult result = null;
                try {
                    result = searchPrompts(searchPromptsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchPromptsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches queues in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQueuesRequest
     * @return A Java Future object containing the response from the
     *         SearchQueues service method, as returned by Amazon Connect.
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
    public Future<SearchQueuesResult> searchQueuesAsync(
            final SearchQueuesRequest searchQueuesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<SearchQueuesResult>() {
            public SearchQueuesResult call() throws Exception {
                return searchQueues(searchQueuesRequest);
            }
        });
    }

    /**
     * <p>
     * Searches queues in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQueuesRequest
     * @return A Java Future object containing the response from the
     *         SearchQueues service method, as returned by Amazon Connect.
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
    public Future<SearchQueuesResult> searchQueuesAsync(
            final SearchQueuesRequest searchQueuesRequest,
            final AsyncHandler<SearchQueuesRequest, SearchQueuesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchQueuesResult>() {
            public SearchQueuesResult call() throws Exception {
                SearchQueuesResult result = null;
                try {
                    result = searchQueues(searchQueuesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchQueuesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches quick connects in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         SearchQuickConnects service method, as returned by Amazon
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
    public Future<SearchQuickConnectsResult> searchQuickConnectsAsync(
            final SearchQuickConnectsRequest searchQuickConnectsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchQuickConnectsResult>() {
            public SearchQuickConnectsResult call() throws Exception {
                return searchQuickConnects(searchQuickConnectsRequest);
            }
        });
    }

    /**
     * <p>
     * Searches quick connects in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchQuickConnectsRequest
     * @return A Java Future object containing the response from the
     *         SearchQuickConnects service method, as returned by Amazon
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
    public Future<SearchQuickConnectsResult> searchQuickConnectsAsync(
            final SearchQuickConnectsRequest searchQuickConnectsRequest,
            final AsyncHandler<SearchQuickConnectsRequest, SearchQuickConnectsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchQuickConnectsResult>() {
            public SearchQuickConnectsResult call() throws Exception {
                SearchQuickConnectsResult result = null;
                try {
                    result = searchQuickConnects(searchQuickConnectsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchQuickConnectsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches tags used in an Amazon Connect instance using optional search
     * criteria.
     * </p>
     * 
     * @param searchResourceTagsRequest
     * @return A Java Future object containing the response from the
     *         SearchResourceTags service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws MaximumResultReturnedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SearchResourceTagsResult> searchResourceTagsAsync(
            final SearchResourceTagsRequest searchResourceTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchResourceTagsResult>() {
            public SearchResourceTagsResult call() throws Exception {
                return searchResourceTags(searchResourceTagsRequest);
            }
        });
    }

    /**
     * <p>
     * Searches tags used in an Amazon Connect instance using optional search
     * criteria.
     * </p>
     * 
     * @param searchResourceTagsRequest
     * @return A Java Future object containing the response from the
     *         SearchResourceTags service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws MaximumResultReturnedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SearchResourceTagsResult> searchResourceTagsAsync(
            final SearchResourceTagsRequest searchResourceTagsRequest,
            final AsyncHandler<SearchResourceTagsRequest, SearchResourceTagsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchResourceTagsResult>() {
            public SearchResourceTagsResult call() throws Exception {
                SearchResourceTagsResult result = null;
                try {
                    result = searchResourceTags(searchResourceTagsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchResourceTagsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches routing profiles in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchRoutingProfilesRequest
     * @return A Java Future object containing the response from the
     *         SearchRoutingProfiles service method, as returned by Amazon
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
    public Future<SearchRoutingProfilesResult> searchRoutingProfilesAsync(
            final SearchRoutingProfilesRequest searchRoutingProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchRoutingProfilesResult>() {
            public SearchRoutingProfilesResult call() throws Exception {
                return searchRoutingProfiles(searchRoutingProfilesRequest);
            }
        });
    }

    /**
     * <p>
     * Searches routing profiles in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchRoutingProfilesRequest
     * @return A Java Future object containing the response from the
     *         SearchRoutingProfiles service method, as returned by Amazon
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
    public Future<SearchRoutingProfilesResult> searchRoutingProfilesAsync(
            final SearchRoutingProfilesRequest searchRoutingProfilesRequest,
            final AsyncHandler<SearchRoutingProfilesRequest, SearchRoutingProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchRoutingProfilesResult>() {
            public SearchRoutingProfilesResult call() throws Exception {
                SearchRoutingProfilesResult result = null;
                try {
                    result = searchRoutingProfiles(searchRoutingProfilesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchRoutingProfilesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches security profiles in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         SearchSecurityProfiles service method, as returned by Amazon
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
    public Future<SearchSecurityProfilesResult> searchSecurityProfilesAsync(
            final SearchSecurityProfilesRequest searchSecurityProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchSecurityProfilesResult>() {
            public SearchSecurityProfilesResult call() throws Exception {
                return searchSecurityProfiles(searchSecurityProfilesRequest);
            }
        });
    }

    /**
     * <p>
     * Searches security profiles in an Amazon Connect instance, with optional
     * filtering.
     * </p>
     * 
     * @param searchSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         SearchSecurityProfiles service method, as returned by Amazon
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
    public Future<SearchSecurityProfilesResult> searchSecurityProfilesAsync(
            final SearchSecurityProfilesRequest searchSecurityProfilesRequest,
            final AsyncHandler<SearchSecurityProfilesRequest, SearchSecurityProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchSecurityProfilesResult>() {
            public SearchSecurityProfilesResult call() throws Exception {
                SearchSecurityProfilesResult result = null;
                try {
                    result = searchSecurityProfiles(searchSecurityProfilesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchSecurityProfilesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches users in an Amazon Connect instance, with optional filtering.
     * </p>
     * <note>
     * <p>
     * <code>AfterContactWorkTimeLimit</code> is returned in milliseconds.
     * </p>
     * </note>
     * 
     * @param searchUsersRequest
     * @return A Java Future object containing the response from the SearchUsers
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
    public Future<SearchUsersResult> searchUsersAsync(final SearchUsersRequest searchUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchUsersResult>() {
            public SearchUsersResult call() throws Exception {
                return searchUsers(searchUsersRequest);
            }
        });
    }

    /**
     * <p>
     * Searches users in an Amazon Connect instance, with optional filtering.
     * </p>
     * <note>
     * <p>
     * <code>AfterContactWorkTimeLimit</code> is returned in milliseconds.
     * </p>
     * </note>
     * 
     * @param searchUsersRequest
     * @return A Java Future object containing the response from the SearchUsers
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
    public Future<SearchUsersResult> searchUsersAsync(final SearchUsersRequest searchUsersRequest,
            final AsyncHandler<SearchUsersRequest, SearchUsersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchUsersResult>() {
            public SearchUsersResult call() throws Exception {
                SearchUsersResult result = null;
                try {
                    result = searchUsers(searchUsersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchUsersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Searches for vocabularies within a specific Amazon Connect instance using
     * <code>State</code>, <code>NameStartsWith</code>, and
     * <code>LanguageCode</code>.
     * </p>
     * 
     * @param searchVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         SearchVocabularies service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SearchVocabulariesResult> searchVocabulariesAsync(
            final SearchVocabulariesRequest searchVocabulariesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchVocabulariesResult>() {
            public SearchVocabulariesResult call() throws Exception {
                return searchVocabularies(searchVocabulariesRequest);
            }
        });
    }

    /**
     * <p>
     * Searches for vocabularies within a specific Amazon Connect instance using
     * <code>State</code>, <code>NameStartsWith</code>, and
     * <code>LanguageCode</code>.
     * </p>
     * 
     * @param searchVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         SearchVocabularies service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SearchVocabulariesResult> searchVocabulariesAsync(
            final SearchVocabulariesRequest searchVocabulariesRequest,
            final AsyncHandler<SearchVocabulariesRequest, SearchVocabulariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchVocabulariesResult>() {
            public SearchVocabulariesResult call() throws Exception {
                SearchVocabulariesResult result = null;
                try {
                    result = searchVocabularies(searchVocabulariesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(searchVocabulariesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Processes chat integration events from Amazon Web Services or external
     * integrations to Amazon Connect. A chat integration event includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceId, DestinationId, and Subtype: a set of identifiers, uniquely
     * representing a chat
     * </p>
     * </li>
     * <li>
     * <p>
     * ChatEvent: details of the chat action to perform such as sending a
     * message, event, or disconnecting from a chat
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a chat integration event is sent with chat identifiers that do not
     * map to an active chat contact, a new chat contact is also created before
     * handling chat action.
     * </p>
     * <p>
     * Access to this API is currently restricted to Amazon Pinpoint for
     * supporting SMS integration.
     * </p>
     * 
     * @param sendChatIntegrationEventRequest
     * @return A Java Future object containing the response from the
     *         SendChatIntegrationEvent service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SendChatIntegrationEventResult> sendChatIntegrationEventAsync(
            final SendChatIntegrationEventRequest sendChatIntegrationEventRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendChatIntegrationEventResult>() {
            public SendChatIntegrationEventResult call() throws Exception {
                return sendChatIntegrationEvent(sendChatIntegrationEventRequest);
            }
        });
    }

    /**
     * <p>
     * Processes chat integration events from Amazon Web Services or external
     * integrations to Amazon Connect. A chat integration event includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceId, DestinationId, and Subtype: a set of identifiers, uniquely
     * representing a chat
     * </p>
     * </li>
     * <li>
     * <p>
     * ChatEvent: details of the chat action to perform such as sending a
     * message, event, or disconnecting from a chat
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a chat integration event is sent with chat identifiers that do not
     * map to an active chat contact, a new chat contact is also created before
     * handling chat action.
     * </p>
     * <p>
     * Access to this API is currently restricted to Amazon Pinpoint for
     * supporting SMS integration.
     * </p>
     * 
     * @param sendChatIntegrationEventRequest
     * @return A Java Future object containing the response from the
     *         SendChatIntegrationEvent service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SendChatIntegrationEventResult> sendChatIntegrationEventAsync(
            final SendChatIntegrationEventRequest sendChatIntegrationEventRequest,
            final AsyncHandler<SendChatIntegrationEventRequest, SendChatIntegrationEventResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendChatIntegrationEventResult>() {
            public SendChatIntegrationEventResult call() throws Exception {
                SendChatIntegrationEventResult result = null;
                try {
                    result = sendChatIntegrationEvent(sendChatIntegrationEventRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendChatIntegrationEventRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Initiates a flow to start a new chat for the customer. Response of this
     * API provides a token required to obtain credentials from the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant
     * Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients must subscribe
     * to the participant’s connection for the created chat within 5 minutes.
     * This is achieved by invoking <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and
     * CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a
     * <code>TooManyRequests</code> exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >quota for concurrent active chats</a> is exceeded. Active chat
     * throttling returns a <code>LimitExceededException</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the <code>ChatDurationInMinutes</code> parameter and receive a
     * 400 error, your account may not support the ability to configure custom
     * chat durations. For more information, contact Amazon Web Services
     * Support.
     * </p>
     * <p>
     * For more information about chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html"
     * >Chat</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startChatContactRequest
     * @return A Java Future object containing the response from the
     *         StartChatContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartChatContactResult> startChatContactAsync(
            final StartChatContactRequest startChatContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<StartChatContactResult>() {
            public StartChatContactResult call() throws Exception {
                return startChatContact(startChatContactRequest);
            }
        });
    }

    /**
     * <p>
     * Initiates a flow to start a new chat for the customer. Response of this
     * API provides a token required to obtain credentials from the <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant
     * Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients must subscribe
     * to the participant’s connection for the created chat within 5 minutes.
     * This is achieved by invoking <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and
     * CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a
     * <code>TooManyRequests</code> exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >quota for concurrent active chats</a> is exceeded. Active chat
     * throttling returns a <code>LimitExceededException</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the <code>ChatDurationInMinutes</code> parameter and receive a
     * 400 error, your account may not support the ability to configure custom
     * chat durations. For more information, contact Amazon Web Services
     * Support.
     * </p>
     * <p>
     * For more information about chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html"
     * >Chat</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startChatContactRequest
     * @return A Java Future object containing the response from the
     *         StartChatContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartChatContactResult> startChatContactAsync(
            final StartChatContactRequest startChatContactRequest,
            final AsyncHandler<StartChatContactRequest, StartChatContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartChatContactResult>() {
            public StartChatContactResult call() throws Exception {
                StartChatContactResult result = null;
                try {
                    result = startChatContact(startChatContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startChatContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts an empty evaluation in the specified Amazon Connect instance,
     * using the given evaluation form for the particular contact. The
     * evaluation form version used for the contact evaluation corresponds to
     * the currently activated version. If no version is activated for the
     * evaluation form, the contact evaluation cannot be started.
     * </p>
     * <note>
     * <p>
     * Evaluations created through the public API do not contain answer values
     * suggested from automation.
     * </p>
     * </note>
     * 
     * @param startContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         StartContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartContactEvaluationResult> startContactEvaluationAsync(
            final StartContactEvaluationRequest startContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartContactEvaluationResult>() {
            public StartContactEvaluationResult call() throws Exception {
                return startContactEvaluation(startContactEvaluationRequest);
            }
        });
    }

    /**
     * <p>
     * Starts an empty evaluation in the specified Amazon Connect instance,
     * using the given evaluation form for the particular contact. The
     * evaluation form version used for the contact evaluation corresponds to
     * the currently activated version. If no version is activated for the
     * evaluation form, the contact evaluation cannot be started.
     * </p>
     * <note>
     * <p>
     * Evaluations created through the public API do not contain answer values
     * suggested from automation.
     * </p>
     * </note>
     * 
     * @param startContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         StartContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartContactEvaluationResult> startContactEvaluationAsync(
            final StartContactEvaluationRequest startContactEvaluationRequest,
            final AsyncHandler<StartContactEvaluationRequest, StartContactEvaluationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartContactEvaluationResult>() {
            public StartContactEvaluationResult call() throws Exception {
                StartContactEvaluationResult result = null;
                try {
                    result = startContactEvaluation(startContactEvaluationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startContactEvaluationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts recording the contact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the API is called <i>before</i> the agent joins the call, recording
     * starts when the agent joins the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the API is called <i>after</i> the agent joins the call, recording
     * starts at the time of the API call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * StartContactRecording is a one-time action. For example, if you use
     * StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording
     * has started and you want to suspend and resume it, such as when
     * collecting sensitive information (for example, a credit card number), use
     * SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * You can use this API to override the recording behavior configured in the
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html"
     * >Set recording behavior</a> block.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param startContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         StartContactRecording service method, as returned by Amazon
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
    public Future<StartContactRecordingResult> startContactRecordingAsync(
            final StartContactRecordingRequest startContactRecordingRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartContactRecordingResult>() {
            public StartContactRecordingResult call() throws Exception {
                return startContactRecording(startContactRecordingRequest);
            }
        });
    }

    /**
     * <p>
     * Starts recording the contact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the API is called <i>before</i> the agent joins the call, recording
     * starts when the agent joins the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the API is called <i>after</i> the agent joins the call, recording
     * starts at the time of the API call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * StartContactRecording is a one-time action. For example, if you use
     * StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording
     * has started and you want to suspend and resume it, such as when
     * collecting sensitive information (for example, a credit card number), use
     * SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * You can use this API to override the recording behavior configured in the
     * <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html"
     * >Set recording behavior</a> block.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param startContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         StartContactRecording service method, as returned by Amazon
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
    public Future<StartContactRecordingResult> startContactRecordingAsync(
            final StartContactRecordingRequest startContactRecordingRequest,
            final AsyncHandler<StartContactRecordingRequest, StartContactRecordingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartContactRecordingResult>() {
            public StartContactRecordingResult call() throws Exception {
                StartContactRecordingResult result = null;
                try {
                    result = startContactRecording(startContactRecordingRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startContactRecordingRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Initiates real-time message streaming for a new chat contact.
     * </p>
     * <p>
     * For more information about message streaming, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html"
     * >Enable real-time chat message streaming</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param startContactStreamingRequest
     * @return A Java Future object containing the response from the
     *         StartContactStreaming service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartContactStreamingResult> startContactStreamingAsync(
            final StartContactStreamingRequest startContactStreamingRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartContactStreamingResult>() {
            public StartContactStreamingResult call() throws Exception {
                return startContactStreaming(startContactStreamingRequest);
            }
        });
    }

    /**
     * <p>
     * Initiates real-time message streaming for a new chat contact.
     * </p>
     * <p>
     * For more information about message streaming, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html"
     * >Enable real-time chat message streaming</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param startContactStreamingRequest
     * @return A Java Future object containing the response from the
     *         StartContactStreaming service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartContactStreamingResult> startContactStreamingAsync(
            final StartContactStreamingRequest startContactStreamingRequest,
            final AsyncHandler<StartContactStreamingRequest, StartContactStreamingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartContactStreamingResult>() {
            public StartContactStreamingResult call() throws Exception {
                StartContactStreamingResult result = null;
                try {
                    result = startContactStreaming(startContactStreamingRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startContactStreamingRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Places an outbound call to a contact, and then initiates the flow. It
     * performs the actions in the flow that's specified (in
     * <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not
     * dial the contact. If the flow places an outbound call to a contact, and
     * then puts the contact in queue, the call is then routed to the agent,
     * like any other inbound case.
     * </p>
     * <p>
     * There is a 60-second dialing timeout for this operation. If the call is
     * not connected after 60 seconds, it fails.
     * </p>
     * <note>
     * <p>
     * UK numbers with a 447 prefix are not allowed by default. Before you can
     * dial these UK mobile numbers, you must submit a service quota increase
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >Amazon Connect Service Quotas</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Campaign calls are not allowed by default. Before you can make a call
     * with <code>TrafficType</code> = <code>CAMPAIGN</code>, you must submit a
     * service quota increase request to the quota <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#outbound-communications-quotas"
     * >Amazon Connect campaigns</a>.
     * </p>
     * </note>
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
     * Places an outbound call to a contact, and then initiates the flow. It
     * performs the actions in the flow that's specified (in
     * <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not
     * dial the contact. If the flow places an outbound call to a contact, and
     * then puts the contact in queue, the call is then routed to the agent,
     * like any other inbound case.
     * </p>
     * <p>
     * There is a 60-second dialing timeout for this operation. If the call is
     * not connected after 60 seconds, it fails.
     * </p>
     * <note>
     * <p>
     * UK numbers with a 447 prefix are not allowed by default. Before you can
     * dial these UK mobile numbers, you must submit a service quota increase
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >Amazon Connect Service Quotas</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Campaign calls are not allowed by default. Before you can make a call
     * with <code>TrafficType</code> = <code>CAMPAIGN</code>, you must submit a
     * service quota increase request to the quota <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#outbound-communications-quotas"
     * >Amazon Connect campaigns</a>.
     * </p>
     * </note>
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
     * Initiates a flow to start a new task contact. For more information about
     * task contacts, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html"
     * >Concepts: Tasks in Amazon Connect</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <p>
     * When using <code>PreviousContactId</code> and
     * <code>RelatedContactId</code> input parameters, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PreviousContactId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any updates to user-defined task contact attributes on any contact linked
     * through the same <code>PreviousContactId</code> will affect every contact
     * in the chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * There can be a maximum of 12 linked task contacts in a chain. That is, 12
     * task contacts can be created that share the same
     * <code>PreviousContactId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>RelatedContactId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Copies contact attributes from the related task contact to the new
     * contact.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any update on attributes in a new task contact does not update attributes
     * on previous contact.
     * </p>
     * </li>
     * <li>
     * <p>
     * There’s no limit on the number of task contacts that can be created that
     * use the same <code>RelatedContactId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * In addition, when calling StartTaskContact include only one of these
     * parameters: <code>ContactFlowID</code>, <code>QuickConnectID</code>, or
     * <code>TaskTemplateID</code>. Only one parameter is required as long as
     * the task template has a flow configured to run it. If more than one
     * parameter is specified, or only the <code>TaskTemplateID</code> is
     * specified but it does not have a flow configured, the request returns an
     * error because Amazon Connect cannot identify the unique flow to run when
     * the task is created.
     * </p>
     * <p>
     * A <code>ServiceQuotaExceededException</code> occurs when the number of
     * open tasks exceeds the active tasks quota or there are already 12 tasks
     * referencing the same <code>PreviousContactId</code>. For more information
     * about service quotas for task contacts, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >Amazon Connect service quotas</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param startTaskContactRequest
     * @return A Java Future object containing the response from the
     *         StartTaskContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartTaskContactResult> startTaskContactAsync(
            final StartTaskContactRequest startTaskContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<StartTaskContactResult>() {
            public StartTaskContactResult call() throws Exception {
                return startTaskContact(startTaskContactRequest);
            }
        });
    }

    /**
     * <p>
     * Initiates a flow to start a new task contact. For more information about
     * task contacts, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html"
     * >Concepts: Tasks in Amazon Connect</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <p>
     * When using <code>PreviousContactId</code> and
     * <code>RelatedContactId</code> input parameters, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PreviousContactId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any updates to user-defined task contact attributes on any contact linked
     * through the same <code>PreviousContactId</code> will affect every contact
     * in the chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * There can be a maximum of 12 linked task contacts in a chain. That is, 12
     * task contacts can be created that share the same
     * <code>PreviousContactId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>RelatedContactId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Copies contact attributes from the related task contact to the new
     * contact.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any update on attributes in a new task contact does not update attributes
     * on previous contact.
     * </p>
     * </li>
     * <li>
     * <p>
     * There’s no limit on the number of task contacts that can be created that
     * use the same <code>RelatedContactId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * In addition, when calling StartTaskContact include only one of these
     * parameters: <code>ContactFlowID</code>, <code>QuickConnectID</code>, or
     * <code>TaskTemplateID</code>. Only one parameter is required as long as
     * the task template has a flow configured to run it. If more than one
     * parameter is specified, or only the <code>TaskTemplateID</code> is
     * specified but it does not have a flow configured, the request returns an
     * error because Amazon Connect cannot identify the unique flow to run when
     * the task is created.
     * </p>
     * <p>
     * A <code>ServiceQuotaExceededException</code> occurs when the number of
     * open tasks exceeds the active tasks quota or there are already 12 tasks
     * referencing the same <code>PreviousContactId</code>. For more information
     * about service quotas for task contacts, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
     * >Amazon Connect service quotas</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param startTaskContactRequest
     * @return A Java Future object containing the response from the
     *         StartTaskContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartTaskContactResult> startTaskContactAsync(
            final StartTaskContactRequest startTaskContactRequest,
            final AsyncHandler<StartTaskContactRequest, StartTaskContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartTaskContactResult>() {
            public StartTaskContactResult call() throws Exception {
                StartTaskContactResult result = null;
                try {
                    result = startTaskContact(startTaskContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startTaskContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Places an inbound in-app, web, or video call to a contact, and then
     * initiates the flow. It performs the actions in the flow that are
     * specified (in ContactFlowId) and present in the Amazon Connect instance
     * (specified as InstanceId).
     * </p>
     * 
     * @param startWebRTCContactRequest
     * @return A Java Future object containing the response from the
     *         StartWebRTCContact service method, as returned by Amazon Connect.
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartWebRTCContactResult> startWebRTCContactAsync(
            final StartWebRTCContactRequest startWebRTCContactRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartWebRTCContactResult>() {
            public StartWebRTCContactResult call() throws Exception {
                return startWebRTCContact(startWebRTCContactRequest);
            }
        });
    }

    /**
     * <p>
     * Places an inbound in-app, web, or video call to a contact, and then
     * initiates the flow. It performs the actions in the flow that are
     * specified (in ContactFlowId) and present in the Amazon Connect instance
     * (specified as InstanceId).
     * </p>
     * 
     * @param startWebRTCContactRequest
     * @return A Java Future object containing the response from the
     *         StartWebRTCContact service method, as returned by Amazon Connect.
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartWebRTCContactResult> startWebRTCContactAsync(
            final StartWebRTCContactRequest startWebRTCContactRequest,
            final AsyncHandler<StartWebRTCContactRequest, StartWebRTCContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartWebRTCContactResult>() {
            public StartWebRTCContactResult call() throws Exception {
                StartWebRTCContactResult result = null;
                try {
                    result = startWebRTCContact(startWebRTCContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startWebRTCContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Ends the specified contact. This call does not work for voice contacts
     * that use the following initiation methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCONNECT
     * </p>
     * </li>
     * <li>
     * <p>
     * TRANSFER
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUE_TRANSFER
     * </p>
     * </li>
     * </ul>
     * <p>
     * Chat and task contacts, however, can be terminated in any state,
     * regardless of initiation method.
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
     * Ends the specified contact. This call does not work for voice contacts
     * that use the following initiation methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCONNECT
     * </p>
     * </li>
     * <li>
     * <p>
     * TRANSFER
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUE_TRANSFER
     * </p>
     * </li>
     * </ul>
     * <p>
     * Chat and task contacts, however, can be terminated in any state,
     * regardless of initiation method.
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
     * Stops recording a call when a contact is being recorded.
     * StopContactRecording is a one-time action. If you use
     * StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording
     * has started and you want to suspend it for sensitive information (for
     * example, to collect a credit card number), and then restart it, use
     * SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param stopContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         StopContactRecording service method, as returned by Amazon
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
    public Future<StopContactRecordingResult> stopContactRecordingAsync(
            final StopContactRecordingRequest stopContactRecordingRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopContactRecordingResult>() {
            public StopContactRecordingResult call() throws Exception {
                return stopContactRecording(stopContactRecordingRequest);
            }
        });
    }

    /**
     * <p>
     * Stops recording a call when a contact is being recorded.
     * StopContactRecording is a one-time action. If you use
     * StopContactRecording to stop recording an ongoing call, you can't use
     * StartContactRecording to restart it. For scenarios where the recording
     * has started and you want to suspend it for sensitive information (for
     * example, to collect a credit card number), and then restart it, use
     * SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param stopContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         StopContactRecording service method, as returned by Amazon
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
    public Future<StopContactRecordingResult> stopContactRecordingAsync(
            final StopContactRecordingRequest stopContactRecordingRequest,
            final AsyncHandler<StopContactRecordingRequest, StopContactRecordingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopContactRecordingResult>() {
            public StopContactRecordingResult call() throws Exception {
                StopContactRecordingResult result = null;
                try {
                    result = stopContactRecording(stopContactRecordingRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(stopContactRecordingRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Ends message streaming on a specified contact. To restart message
     * streaming on that contact, call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API.
     * </p>
     * 
     * @param stopContactStreamingRequest
     * @return A Java Future object containing the response from the
     *         StopContactStreaming service method, as returned by Amazon
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
    public Future<StopContactStreamingResult> stopContactStreamingAsync(
            final StopContactStreamingRequest stopContactStreamingRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopContactStreamingResult>() {
            public StopContactStreamingResult call() throws Exception {
                return stopContactStreaming(stopContactStreamingRequest);
            }
        });
    }

    /**
     * <p>
     * Ends message streaming on a specified contact. To restart message
     * streaming on that contact, call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API.
     * </p>
     * 
     * @param stopContactStreamingRequest
     * @return A Java Future object containing the response from the
     *         StopContactStreaming service method, as returned by Amazon
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
    public Future<StopContactStreamingResult> stopContactStreamingAsync(
            final StopContactStreamingRequest stopContactStreamingRequest,
            final AsyncHandler<StopContactStreamingRequest, StopContactStreamingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopContactStreamingResult>() {
            public StopContactStreamingResult call() throws Exception {
                StopContactStreamingResult result = null;
                try {
                    result = stopContactStreaming(stopContactStreamingRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(stopContactStreamingRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Submits a contact evaluation in the specified Amazon Connect instance.
     * Answers included in the request are merged with existing answers for the
     * given evaluation. If no answers or notes are passed, the evaluation is
     * submitted with the existing answers and notes. You can delete an answer
     * or note by passing an empty object (<code>{}</code>) to the question
     * identifier.
     * </p>
     * <p>
     * If a contact evaluation is already in submitted state, this operation
     * will trigger a resubmission.
     * </p>
     * 
     * @param submitContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         SubmitContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SubmitContactEvaluationResult> submitContactEvaluationAsync(
            final SubmitContactEvaluationRequest submitContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SubmitContactEvaluationResult>() {
            public SubmitContactEvaluationResult call() throws Exception {
                return submitContactEvaluation(submitContactEvaluationRequest);
            }
        });
    }

    /**
     * <p>
     * Submits a contact evaluation in the specified Amazon Connect instance.
     * Answers included in the request are merged with existing answers for the
     * given evaluation. If no answers or notes are passed, the evaluation is
     * submitted with the existing answers and notes. You can delete an answer
     * or note by passing an empty object (<code>{}</code>) to the question
     * identifier.
     * </p>
     * <p>
     * If a contact evaluation is already in submitted state, this operation
     * will trigger a resubmission.
     * </p>
     * 
     * @param submitContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         SubmitContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<SubmitContactEvaluationResult> submitContactEvaluationAsync(
            final SubmitContactEvaluationRequest submitContactEvaluationRequest,
            final AsyncHandler<SubmitContactEvaluationRequest, SubmitContactEvaluationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SubmitContactEvaluationResult>() {
            public SubmitContactEvaluationResult call() throws Exception {
                SubmitContactEvaluationResult result = null;
                try {
                    result = submitContactEvaluation(submitContactEvaluationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(submitContactEvaluationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording whatever is
     * selected in the flow configuration: call, screen, or both. If only call
     * recording or only screen recording is enabled, then it would be
     * suspended. For example, you might suspend the screen recording while
     * collecting sensitive information, such as a credit card number. Then use
     * ResumeContactRecording to restart recording the screen.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence
     * in the final recording.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         SuspendContactRecording service method, as returned by Amazon
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
    public Future<SuspendContactRecordingResult> suspendContactRecordingAsync(
            final SuspendContactRecordingRequest suspendContactRecordingRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SuspendContactRecordingResult>() {
            public SuspendContactRecordingResult call() throws Exception {
                return suspendContactRecording(suspendContactRecordingRequest);
            }
        });
    }

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording whatever is
     * selected in the flow configuration: call, screen, or both. If only call
     * recording or only screen recording is enabled, then it would be
     * suspended. For example, you might suspend the screen recording while
     * collecting sensitive information, such as a credit card number. Then use
     * ResumeContactRecording to restart recording the screen.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence
     * in the final recording.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @return A Java Future object containing the response from the
     *         SuspendContactRecording service method, as returned by Amazon
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
    public Future<SuspendContactRecordingResult> suspendContactRecordingAsync(
            final SuspendContactRecordingRequest suspendContactRecordingRequest,
            final AsyncHandler<SuspendContactRecordingRequest, SuspendContactRecordingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SuspendContactRecordingResult>() {
            public SuspendContactRecordingResult call() throws Exception {
                SuspendContactRecordingResult result = null;
                try {
                    result = suspendContactRecording(suspendContactRecordingRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(suspendContactRecordingRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds the specified tags to the contact resource. For more information
     * about this API is used, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/granular-billing.html"
     * >Set up granular billing for a detailed view of your Amazon Connect
     * usage</a>.
     * </p>
     * 
     * @param tagContactRequest
     * @return A Java Future object containing the response from the TagContact
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<TagContactResult> tagContactAsync(final TagContactRequest tagContactRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TagContactResult>() {
            public TagContactResult call() throws Exception {
                return tagContact(tagContactRequest);
            }
        });
    }

    /**
     * <p>
     * Adds the specified tags to the contact resource. For more information
     * about this API is used, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/granular-billing.html"
     * >Set up granular billing for a detailed view of your Amazon Connect
     * usage</a>.
     * </p>
     * 
     * @param tagContactRequest
     * @return A Java Future object containing the response from the TagContact
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<TagContactResult> tagContactAsync(final TagContactRequest tagContactRequest,
            final AsyncHandler<TagContactRequest, TagContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TagContactResult>() {
            public TagContactResult call() throws Exception {
                TagContactResult result = null;
                try {
                    result = tagContact(tagContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(tagContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * Some of the supported resource types are agents, routing profiles,
     * queues, quick connects, contact flows, agent statuses, hours of
     * operation, phone numbers, security profiles, and task templates. For a
     * complete list, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/tagging.html"
     * >Tagging resources in Amazon Connect</a>.
     * </p>
     * <p>
     * For sample policies that use tags, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html"
     * >Amazon Connect Identity-Based Policy Examples</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
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
     * Some of the supported resource types are agents, routing profiles,
     * queues, quick connects, contact flows, agent statuses, hours of
     * operation, phone numbers, security profiles, and task templates. For a
     * complete list, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/tagging.html"
     * >Tagging resources in Amazon Connect</a>.
     * </p>
     * <p>
     * For sample policies that use tags, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html"
     * >Amazon Connect Identity-Based Policy Examples</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
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
     * Transfers contacts from one agent or queue to another agent or queue at
     * any point after a contact is created. You can transfer a contact to
     * another queue by providing the flow which orchestrates the contact to the
     * destination queue. This gives you more control over contact handling and
     * helps you adhere to the service level agreement (SLA) guaranteed to your
     * customers.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Transfer is supported for only <code>TASK</code> contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use both <code>QueueId</code> and <code>UserId</code> in the same
     * call.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following flow types are supported: Inbound flow, Transfer to agent
     * flow, and Transfer to queue flow.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>TransferContact</code> API can be called only on active
     * contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * A contact cannot be transferred more than 11 times.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferContactRequest
     * @return A Java Future object containing the response from the
     *         TransferContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
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
    public Future<TransferContactResult> transferContactAsync(
            final TransferContactRequest transferContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<TransferContactResult>() {
            public TransferContactResult call() throws Exception {
                return transferContact(transferContactRequest);
            }
        });
    }

    /**
     * <p>
     * Transfers contacts from one agent or queue to another agent or queue at
     * any point after a contact is created. You can transfer a contact to
     * another queue by providing the flow which orchestrates the contact to the
     * destination queue. This gives you more control over contact handling and
     * helps you adhere to the service level agreement (SLA) guaranteed to your
     * customers.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Transfer is supported for only <code>TASK</code> contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use both <code>QueueId</code> and <code>UserId</code> in the same
     * call.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following flow types are supported: Inbound flow, Transfer to agent
     * flow, and Transfer to queue flow.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>TransferContact</code> API can be called only on active
     * contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * A contact cannot be transferred more than 11 times.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferContactRequest
     * @return A Java Future object containing the response from the
     *         TransferContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
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
    public Future<TransferContactResult> transferContactAsync(
            final TransferContactRequest transferContactRequest,
            final AsyncHandler<TransferContactRequest, TransferContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TransferContactResult>() {
            public TransferContactResult call() throws Exception {
                TransferContactResult result = null;
                try {
                    result = transferContact(transferContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(transferContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes the specified tags from the contact resource. For more
     * information about this API is used, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/granular-billing.html"
     * >Set up granular billing for a detailed view of your Amazon Connect
     * usage</a>.
     * </p>
     * 
     * @param untagContactRequest
     * @return A Java Future object containing the response from the
     *         UntagContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UntagContactResult> untagContactAsync(
            final UntagContactRequest untagContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UntagContactResult>() {
            public UntagContactResult call() throws Exception {
                return untagContact(untagContactRequest);
            }
        });
    }

    /**
     * <p>
     * Removes the specified tags from the contact resource. For more
     * information about this API is used, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/granular-billing.html"
     * >Set up granular billing for a detailed view of your Amazon Connect
     * usage</a>.
     * </p>
     * 
     * @param untagContactRequest
     * @return A Java Future object containing the response from the
     *         UntagContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UntagContactResult> untagContactAsync(
            final UntagContactRequest untagContactRequest,
            final AsyncHandler<UntagContactRequest, UntagContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UntagContactResult>() {
            public UntagContactResult call() throws Exception {
                UntagContactResult result = null;
                try {
                    result = untagContact(untagContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(untagContactRequest, result);
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
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates agent status.
     * </p>
     * 
     * @param updateAgentStatusRequest
     * @return A Java Future object containing the response from the
     *         UpdateAgentStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<Void> updateAgentStatusAsync(
            final UpdateAgentStatusRequest updateAgentStatusRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateAgentStatus(updateAgentStatusRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates agent status.
     * </p>
     * 
     * @param updateAgentStatusRequest
     * @return A Java Future object containing the response from the
     *         UpdateAgentStatus service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
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
    public Future<Void> updateAgentStatusAsync(
            final UpdateAgentStatusRequest updateAgentStatusRequest,
            final AsyncHandler<UpdateAgentStatusRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateAgentStatus(updateAgentStatusRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateAgentStatusRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Adds or updates user-defined contact information associated with the
     * specified contact. At least one field to be updated must be present in
     * the request.
     * </p>
     * <important>
     * <p>
     * You can add or update user-defined contact information for both ongoing
     * and completed contacts.
     * </p>
     * </important>
     * 
     * @param updateContactRequest
     * @return A Java Future object containing the response from the
     *         UpdateContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactResult> updateContactAsync(
            final UpdateContactRequest updateContactRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdateContactResult>() {
            public UpdateContactResult call() throws Exception {
                return updateContact(updateContactRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Adds or updates user-defined contact information associated with the
     * specified contact. At least one field to be updated must be present in
     * the request.
     * </p>
     * <important>
     * <p>
     * You can add or update user-defined contact information for both ongoing
     * and completed contacts.
     * </p>
     * </important>
     * 
     * @param updateContactRequest
     * @return A Java Future object containing the response from the
     *         UpdateContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactResult> updateContactAsync(
            final UpdateContactRequest updateContactRequest,
            final AsyncHandler<UpdateContactRequest, UpdateContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactResult>() {
            public UpdateContactResult call() throws Exception {
                UpdateContactResult result = null;
                try {
                    result = updateContact(updateContactRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates or updates user-defined contact attributes associated with the
     * specified contact.
     * </p>
     * <p>
     * You can create or update user-defined attributes for both ongoing and
     * completed contacts. For example, while the call is active, you can update
     * the customer's name or the reason the customer called. You can add notes
     * about steps that the agent took during the call that display to the next
     * agent that takes the call. You can also update attributes for a contact
     * using data from your CRM application and save the data with the contact
     * in Amazon Connect. You could also flag calls for additional analysis,
     * such as legal review or to identify abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are
     * then deleted. For information about contact record retention and the
     * maximum size of the contact record attributes section, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     * Creates or updates user-defined contact attributes associated with the
     * specified contact.
     * </p>
     * <p>
     * You can create or update user-defined attributes for both ongoing and
     * completed contacts. For example, while the call is active, you can update
     * the customer's name or the reason the customer called. You can add notes
     * about steps that the agent took during the call that display to the next
     * agent that takes the call. You can also update attributes for a contact
     * using data from your CRM application and save the data with the contact
     * in Amazon Connect. You could also flag calls for additional analysis,
     * such as legal review or to identify abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are
     * then deleted. For information about contact record retention and the
     * maximum size of the contact record attributes section, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     * Updates details about a contact evaluation in the specified Amazon
     * Connect instance. A contact evaluation must be in draft state. Answers
     * included in the request are merged with existing answers for the given
     * evaluation. An answer or note can be deleted by passing an empty object (
     * <code>{}</code>) to the question identifier.
     * </p>
     * 
     * @param updateContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactEvaluationResult> updateContactEvaluationAsync(
            final UpdateContactEvaluationRequest updateContactEvaluationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactEvaluationResult>() {
            public UpdateContactEvaluationResult call() throws Exception {
                return updateContactEvaluation(updateContactEvaluationRequest);
            }
        });
    }

    /**
     * <p>
     * Updates details about a contact evaluation in the specified Amazon
     * Connect instance. A contact evaluation must be in draft state. Answers
     * included in the request are merged with existing answers for the given
     * evaluation. An answer or note can be deleted by passing an empty object (
     * <code>{}</code>) to the question identifier.
     * </p>
     * 
     * @param updateContactEvaluationRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactEvaluation service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactEvaluationResult> updateContactEvaluationAsync(
            final UpdateContactEvaluationRequest updateContactEvaluationRequest,
            final AsyncHandler<UpdateContactEvaluationRequest, UpdateContactEvaluationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactEvaluationResult>() {
            public UpdateContactEvaluationResult call() throws Exception {
                UpdateContactEvaluationResult result = null;
                try {
                    result = updateContactEvaluation(updateContactEvaluationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactEvaluationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowContentRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowContent service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidContactFlowException
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
    public Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(
            final UpdateContactFlowContentRequest updateContactFlowContentRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowContentResult>() {
            public UpdateContactFlowContentResult call() throws Exception {
                return updateContactFlowContent(updateContactFlowContentRequest);
            }
        });
    }

    /**
     * <p>
     * Updates the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowContentRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowContent service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidContactFlowException
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
    public Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(
            final UpdateContactFlowContentRequest updateContactFlowContentRequest,
            final AsyncHandler<UpdateContactFlowContentRequest, UpdateContactFlowContentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowContentResult>() {
            public UpdateContactFlowContentResult call() throws Exception {
                UpdateContactFlowContentResult result = null;
                try {
                    result = updateContactFlowContent(updateContactFlowContentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactFlowContentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates metadata about specified flow.
     * </p>
     * 
     * @param updateContactFlowMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowMetadata service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
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
    public Future<UpdateContactFlowMetadataResult> updateContactFlowMetadataAsync(
            final UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowMetadataResult>() {
            public UpdateContactFlowMetadataResult call() throws Exception {
                return updateContactFlowMetadata(updateContactFlowMetadataRequest);
            }
        });
    }

    /**
     * <p>
     * Updates metadata about specified flow.
     * </p>
     * 
     * @param updateContactFlowMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowMetadata service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
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
    public Future<UpdateContactFlowMetadataResult> updateContactFlowMetadataAsync(
            final UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest,
            final AsyncHandler<UpdateContactFlowMetadataRequest, UpdateContactFlowMetadataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowMetadataResult>() {
            public UpdateContactFlowMetadataResult call() throws Exception {
                UpdateContactFlowMetadataResult result = null;
                try {
                    result = updateContactFlowMetadata(updateContactFlowMetadataRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactFlowMetadataRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates specified flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updateContactFlowModuleContentRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowModuleContent service method, as returned by
     *         Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidContactFlowModuleException
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
    public Future<UpdateContactFlowModuleContentResult> updateContactFlowModuleContentAsync(
            final UpdateContactFlowModuleContentRequest updateContactFlowModuleContentRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowModuleContentResult>() {
            public UpdateContactFlowModuleContentResult call() throws Exception {
                return updateContactFlowModuleContent(updateContactFlowModuleContentRequest);
            }
        });
    }

    /**
     * <p>
     * Updates specified flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updateContactFlowModuleContentRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowModuleContent service method, as returned by
     *         Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidContactFlowModuleException
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
    public Future<UpdateContactFlowModuleContentResult> updateContactFlowModuleContentAsync(
            final UpdateContactFlowModuleContentRequest updateContactFlowModuleContentRequest,
            final AsyncHandler<UpdateContactFlowModuleContentRequest, UpdateContactFlowModuleContentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowModuleContentResult>() {
            public UpdateContactFlowModuleContentResult call() throws Exception {
                UpdateContactFlowModuleContentResult result = null;
                try {
                    result = updateContactFlowModuleContent(updateContactFlowModuleContentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactFlowModuleContentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates metadata about specified flow module.
     * </p>
     * 
     * @param updateContactFlowModuleMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowModuleMetadata service method, as returned by
     *         Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
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
    public Future<UpdateContactFlowModuleMetadataResult> updateContactFlowModuleMetadataAsync(
            final UpdateContactFlowModuleMetadataRequest updateContactFlowModuleMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowModuleMetadataResult>() {
            public UpdateContactFlowModuleMetadataResult call() throws Exception {
                return updateContactFlowModuleMetadata(updateContactFlowModuleMetadataRequest);
            }
        });
    }

    /**
     * <p>
     * Updates metadata about specified flow module.
     * </p>
     * 
     * @param updateContactFlowModuleMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowModuleMetadata service method, as returned by
     *         Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
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
    public Future<UpdateContactFlowModuleMetadataResult> updateContactFlowModuleMetadataAsync(
            final UpdateContactFlowModuleMetadataRequest updateContactFlowModuleMetadataRequest,
            final AsyncHandler<UpdateContactFlowModuleMetadataRequest, UpdateContactFlowModuleMetadataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowModuleMetadataResult>() {
            public UpdateContactFlowModuleMetadataResult call() throws Exception {
                UpdateContactFlowModuleMetadataResult result = null;
                try {
                    result = updateContactFlowModuleMetadata(updateContactFlowModuleMetadataRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactFlowModuleMetadataRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowName service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
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
    public Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(
            final UpdateContactFlowNameRequest updateContactFlowNameRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowNameResult>() {
            public UpdateContactFlowNameResult call() throws Exception {
                return updateContactFlowName(updateContactFlowNameRequest);
            }
        });
    }

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
     * >Amazon Connect Flow language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactFlowName service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
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
    public Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(
            final UpdateContactFlowNameRequest updateContactFlowNameRequest,
            final AsyncHandler<UpdateContactFlowNameRequest, UpdateContactFlowNameResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactFlowNameResult>() {
            public UpdateContactFlowNameResult call() throws Exception {
                UpdateContactFlowNameResult result = null;
                try {
                    result = updateContactFlowName(updateContactFlowNameRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactFlowNameRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates routing priority and age on the contact (<b>QueuePriority</b> and
     * <b>QueueTimeAdjustmentInSeconds</b>). These properties can be used to
     * change a customer's position in the queue. For example, you can move a
     * contact to the back of the queue by setting a lower routing priority
     * relative to other contacts in queue; or you can move a contact to the
     * front of the queue by increasing the routing age which will make the
     * contact look artificially older and therefore higher up in the
     * first-in-first-out routing order. Note that adjusting the routing age of
     * a contact affects only its position in queue, and not its actual queue
     * wait time as reported through metrics. These properties can also be
     * updated by using <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/change-routing-priority.html"
     * >the Set routing priority / age flow block</a>.
     * </p>
     * 
     * @param updateContactRoutingDataRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactRoutingData service method, as returned by Amazon
     *         Connect.
     * @throws ResourceConflictException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactRoutingDataResult> updateContactRoutingDataAsync(
            final UpdateContactRoutingDataRequest updateContactRoutingDataRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactRoutingDataResult>() {
            public UpdateContactRoutingDataResult call() throws Exception {
                return updateContactRoutingData(updateContactRoutingDataRequest);
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates routing priority and age on the contact (<b>QueuePriority</b> and
     * <b>QueueTimeAdjustmentInSeconds</b>). These properties can be used to
     * change a customer's position in the queue. For example, you can move a
     * contact to the back of the queue by setting a lower routing priority
     * relative to other contacts in queue; or you can move a contact to the
     * front of the queue by increasing the routing age which will make the
     * contact look artificially older and therefore higher up in the
     * first-in-first-out routing order. Note that adjusting the routing age of
     * a contact affects only its position in queue, and not its actual queue
     * wait time as reported through metrics. These properties can also be
     * updated by using <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/change-routing-priority.html"
     * >the Set routing priority / age flow block</a>.
     * </p>
     * 
     * @param updateContactRoutingDataRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactRoutingData service method, as returned by Amazon
     *         Connect.
     * @throws ResourceConflictException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactRoutingDataResult> updateContactRoutingDataAsync(
            final UpdateContactRoutingDataRequest updateContactRoutingDataRequest,
            final AsyncHandler<UpdateContactRoutingDataRequest, UpdateContactRoutingDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactRoutingDataResult>() {
            public UpdateContactRoutingDataResult call() throws Exception {
                UpdateContactRoutingDataResult result = null;
                try {
                    result = updateContactRoutingData(updateContactRoutingDataRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactRoutingDataRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the scheduled time of a task contact that is already scheduled.
     * </p>
     * 
     * @param updateContactScheduleRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactSchedule service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactScheduleResult> updateContactScheduleAsync(
            final UpdateContactScheduleRequest updateContactScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactScheduleResult>() {
            public UpdateContactScheduleResult call() throws Exception {
                return updateContactSchedule(updateContactScheduleRequest);
            }
        });
    }

    /**
     * <p>
     * Updates the scheduled time of a task contact that is already scheduled.
     * </p>
     * 
     * @param updateContactScheduleRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactSchedule service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateContactScheduleResult> updateContactScheduleAsync(
            final UpdateContactScheduleRequest updateContactScheduleRequest,
            final AsyncHandler<UpdateContactScheduleRequest, UpdateContactScheduleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateContactScheduleResult>() {
            public UpdateContactScheduleResult call() throws Exception {
                UpdateContactScheduleResult result = null;
                try {
                    result = updateContactSchedule(updateContactScheduleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateContactScheduleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates details about a specific evaluation form version in the specified
     * Amazon Connect instance. Question and section identifiers cannot be
     * duplicated within the same evaluation form.
     * </p>
     * <p>
     * This operation does not support partial updates. Instead it does a full
     * update of evaluation form content.
     * </p>
     * 
     * @param updateEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         UpdateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateEvaluationFormResult> updateEvaluationFormAsync(
            final UpdateEvaluationFormRequest updateEvaluationFormRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateEvaluationFormResult>() {
            public UpdateEvaluationFormResult call() throws Exception {
                return updateEvaluationForm(updateEvaluationFormRequest);
            }
        });
    }

    /**
     * <p>
     * Updates details about a specific evaluation form version in the specified
     * Amazon Connect instance. Question and section identifiers cannot be
     * duplicated within the same evaluation form.
     * </p>
     * <p>
     * This operation does not support partial updates. Instead it does a full
     * update of evaluation form content.
     * </p>
     * 
     * @param updateEvaluationFormRequest
     * @return A Java Future object containing the response from the
     *         UpdateEvaluationForm service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ServiceQuotaExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateEvaluationFormResult> updateEvaluationFormAsync(
            final UpdateEvaluationFormRequest updateEvaluationFormRequest,
            final AsyncHandler<UpdateEvaluationFormRequest, UpdateEvaluationFormResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateEvaluationFormResult>() {
            public UpdateEvaluationFormResult call() throws Exception {
                UpdateEvaluationFormResult result = null;
                try {
                    result = updateEvaluationForm(updateEvaluationFormRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateEvaluationFormRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the hours of operation.
     * </p>
     * 
     * @param updateHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         UpdateHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
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
    public Future<Void> updateHoursOfOperationAsync(
            final UpdateHoursOfOperationRequest updateHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateHoursOfOperation(updateHoursOfOperationRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the hours of operation.
     * </p>
     * 
     * @param updateHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         UpdateHoursOfOperation service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
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
    public Future<Void> updateHoursOfOperationAsync(
            final UpdateHoursOfOperationRequest updateHoursOfOperationRequest,
            final AsyncHandler<UpdateHoursOfOperationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateHoursOfOperation(updateHoursOfOperationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateHoursOfOperationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the value for the specified attribute type.
     * </p>
     * 
     * @param updateInstanceAttributeRequest
     * @return A Java Future object containing the response from the
     *         UpdateInstanceAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateInstanceAttributeAsync(
            final UpdateInstanceAttributeRequest updateInstanceAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateInstanceAttribute(updateInstanceAttributeRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the value for the specified attribute type.
     * </p>
     * 
     * @param updateInstanceAttributeRequest
     * @return A Java Future object containing the response from the
     *         UpdateInstanceAttribute service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateInstanceAttributeAsync(
            final UpdateInstanceAttributeRequest updateInstanceAttributeRequest,
            final AsyncHandler<UpdateInstanceAttributeRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateInstanceAttribute(updateInstanceAttributeRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateInstanceAttributeRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates an existing configuration for a resource type. This API is
     * idempotent.
     * </p>
     * 
     * @param updateInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateInstanceStorageConfig service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateInstanceStorageConfigAsync(
            final UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateInstanceStorageConfig(updateInstanceStorageConfigRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates an existing configuration for a resource type. This API is
     * idempotent.
     * </p>
     * 
     * @param updateInstanceStorageConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateInstanceStorageConfig service method, as returned by Amazon
     *         Connect.
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateInstanceStorageConfigAsync(
            final UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest,
            final AsyncHandler<UpdateInstanceStorageConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateInstanceStorageConfig(updateInstanceStorageConfigRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateInstanceStorageConfigRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates timeouts for when human chat participants are to be considered
     * idle, and when agents are automatically disconnected from a chat due to
     * idleness. You can set four timers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Customer auto-disconnect timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent auto-disconnect timeout
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how chat timeouts work, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html"
     * >Set up chat timeouts for human participants</a>.
     * </p>
     * 
     * @param updateParticipantRoleConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateParticipantRoleConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
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
    public Future<UpdateParticipantRoleConfigResult> updateParticipantRoleConfigAsync(
            final UpdateParticipantRoleConfigRequest updateParticipantRoleConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateParticipantRoleConfigResult>() {
            public UpdateParticipantRoleConfigResult call() throws Exception {
                return updateParticipantRoleConfig(updateParticipantRoleConfigRequest);
            }
        });
    }

    /**
     * <p>
     * Updates timeouts for when human chat participants are to be considered
     * idle, and when agents are automatically disconnected from a chat due to
     * idleness. You can set four timers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Customer auto-disconnect timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent auto-disconnect timeout
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how chat timeouts work, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html"
     * >Set up chat timeouts for human participants</a>.
     * </p>
     * 
     * @param updateParticipantRoleConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateParticipantRoleConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
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
    public Future<UpdateParticipantRoleConfigResult> updateParticipantRoleConfigAsync(
            final UpdateParticipantRoleConfigRequest updateParticipantRoleConfigRequest,
            final AsyncHandler<UpdateParticipantRoleConfigRequest, UpdateParticipantRoleConfigResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateParticipantRoleConfigResult>() {
            public UpdateParticipantRoleConfigResult call() throws Exception {
                UpdateParticipantRoleConfigResult result = null;
                try {
                    result = updateParticipantRoleConfig(updateParticipantRoleConfigRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateParticipantRoleConfigRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates your claimed phone number from its current Amazon Connect
     * instance or traffic distribution group to another Amazon Connect instance
     * or traffic distribution group in the same Amazon Web Services Region.
     * </p>
     * <important>
     * <p>
     * After using this API, you must verify that the phone number is attached
     * to the correct flow in the target instance or traffic distribution group.
     * You need to do this because the API switches only the phone number to a
     * new instance or traffic distribution group. It doesn't migrate the flow
     * configuration of the phone number, too.
     * </p>
     * <p>
     * You can call <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         UpdatePhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceInUseException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(
            final UpdatePhoneNumberRequest updatePhoneNumberRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdatePhoneNumberResult>() {
            public UpdatePhoneNumberResult call() throws Exception {
                return updatePhoneNumber(updatePhoneNumberRequest);
            }
        });
    }

    /**
     * <p>
     * Updates your claimed phone number from its current Amazon Connect
     * instance or traffic distribution group to another Amazon Connect instance
     * or traffic distribution group in the same Amazon Web Services Region.
     * </p>
     * <important>
     * <p>
     * After using this API, you must verify that the phone number is attached
     * to the correct flow in the target instance or traffic distribution group.
     * You need to do this because the API switches only the phone number to a
     * new instance or traffic distribution group. It doesn't migrate the flow
     * configuration of the phone number, too.
     * </p>
     * <p>
     * You can call <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     * >UpdatePhoneNumber</a> operation.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberRequest
     * @return A Java Future object containing the response from the
     *         UpdatePhoneNumber service method, as returned by Amazon Connect.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws ResourceInUseException
     * @throws IdempotencyException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(
            final UpdatePhoneNumberRequest updatePhoneNumberRequest,
            final AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePhoneNumberResult>() {
            public UpdatePhoneNumberResult call() throws Exception {
                UpdatePhoneNumberResult result = null;
                try {
                    result = updatePhoneNumber(updatePhoneNumberRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updatePhoneNumberRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates a phone number’s metadata.
     * </p>
     * <important>
     * <p>
     * To verify the status of a previous UpdatePhoneNumberMetadata operation,
     * call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdatePhoneNumberMetadata service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws IdempotencyException
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
    public Future<Void> updatePhoneNumberMetadataAsync(
            final UpdatePhoneNumberMetadataRequest updatePhoneNumberMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updatePhoneNumberMetadata(updatePhoneNumberMetadataRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates a phone number’s metadata.
     * </p>
     * <important>
     * <p>
     * To verify the status of a previous UpdatePhoneNumberMetadata operation,
     * call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdatePhoneNumberMetadata service method, as returned by Amazon
     *         Connect.
     * @throws InvalidParameterException
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws IdempotencyException
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
    public Future<Void> updatePhoneNumberMetadataAsync(
            final UpdatePhoneNumberMetadataRequest updatePhoneNumberMetadataRequest,
            final AsyncHandler<UpdatePhoneNumberMetadataRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updatePhoneNumberMetadata(updatePhoneNumberMetadataRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updatePhoneNumberMetadataRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates a predefined attribute for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updatePredefinedAttributeRequest
     * @return A Java Future object containing the response from the
     *         UpdatePredefinedAttribute service method, as returned by Amazon
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
    public Future<Void> updatePredefinedAttributeAsync(
            final UpdatePredefinedAttributeRequest updatePredefinedAttributeRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updatePredefinedAttribute(updatePredefinedAttributeRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates a predefined attribute for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updatePredefinedAttributeRequest
     * @return A Java Future object containing the response from the
     *         UpdatePredefinedAttribute service method, as returned by Amazon
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
    public Future<Void> updatePredefinedAttributeAsync(
            final UpdatePredefinedAttributeRequest updatePredefinedAttributeRequest,
            final AsyncHandler<UpdatePredefinedAttributeRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updatePredefinedAttribute(updatePredefinedAttributeRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updatePredefinedAttributeRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates a prompt.
     * </p>
     * 
     * @param updatePromptRequest
     * @return A Java Future object containing the response from the
     *         UpdatePrompt service method, as returned by Amazon Connect.
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
    public Future<UpdatePromptResult> updatePromptAsync(
            final UpdatePromptRequest updatePromptRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdatePromptResult>() {
            public UpdatePromptResult call() throws Exception {
                return updatePrompt(updatePromptRequest);
            }
        });
    }

    /**
     * <p>
     * Updates a prompt.
     * </p>
     * 
     * @param updatePromptRequest
     * @return A Java Future object containing the response from the
     *         UpdatePrompt service method, as returned by Amazon Connect.
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
    public Future<UpdatePromptResult> updatePromptAsync(
            final UpdatePromptRequest updatePromptRequest,
            final AsyncHandler<UpdatePromptRequest, UpdatePromptResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePromptResult>() {
            public UpdatePromptResult call() throws Exception {
                UpdatePromptResult result = null;
                try {
                    result = updatePrompt(updatePromptRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updatePromptRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the hours of operation for the specified queue.
     * </p>
     * 
     * @param updateQueueHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueHoursOfOperation service method, as returned by Amazon
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
    public Future<Void> updateQueueHoursOfOperationAsync(
            final UpdateQueueHoursOfOperationRequest updateQueueHoursOfOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateQueueHoursOfOperation(updateQueueHoursOfOperationRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the hours of operation for the specified queue.
     * </p>
     * 
     * @param updateQueueHoursOfOperationRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueHoursOfOperation service method, as returned by Amazon
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
    public Future<Void> updateQueueHoursOfOperationAsync(
            final UpdateQueueHoursOfOperationRequest updateQueueHoursOfOperationRequest,
            final AsyncHandler<UpdateQueueHoursOfOperationRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateQueueHoursOfOperation(updateQueueHoursOfOperationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateQueueHoursOfOperationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the maximum number of contacts allowed in a queue before it is
     * considered full.
     * </p>
     * 
     * @param updateQueueMaxContactsRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueMaxContacts service method, as returned by Amazon
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
    public Future<Void> updateQueueMaxContactsAsync(
            final UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateQueueMaxContacts(updateQueueMaxContactsRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the maximum number of contacts allowed in a queue before it is
     * considered full.
     * </p>
     * 
     * @param updateQueueMaxContactsRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueMaxContacts service method, as returned by Amazon
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
    public Future<Void> updateQueueMaxContactsAsync(
            final UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest,
            final AsyncHandler<UpdateQueueMaxContactsRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateQueueMaxContacts(updateQueueMaxContactsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateQueueMaxContactsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the name and description of a queue. At least <code>Name</code>
     * or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQueueNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueName service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
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
    public Future<Void> updateQueueNameAsync(final UpdateQueueNameRequest updateQueueNameRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateQueueName(updateQueueNameRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the name and description of a queue. At least <code>Name</code>
     * or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQueueNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueName service method, as returned by Amazon Connect.
     * @throws DuplicateResourceException
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
    public Future<Void> updateQueueNameAsync(final UpdateQueueNameRequest updateQueueNameRequest,
            final AsyncHandler<UpdateQueueNameRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateQueueName(updateQueueNameRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateQueueNameRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the outbound caller ID name, number, and outbound whisper flow
     * for a specified queue.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * If the phone number is claimed to a traffic distribution group that was
     * created in the same Region as the Amazon Connect instance where you are
     * calling this API, then you can use a full phone number ARN or a UUID for
     * <code>OutboundCallerIdNumberId</code>. However, if the phone number is
     * claimed to a traffic distribution group that is in one Region, and you
     * are calling this API from an instance in another Amazon Web Services
     * Region that is associated with the traffic distribution group, you must
     * provide a full phone number ARN. If a UUID is provided in this scenario,
     * you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only use the phone number ARN format that doesn't contain
     * <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This
     * is the same ARN format that is returned when you call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you plan to use IAM policies to allow/deny access to this API for
     * phone number resources claimed to a traffic distribution group, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_resource-level-policy-examples.html#allow-deny-queue-actions-replica-region"
     * >Allow or Deny queue API actions for phone numbers in a replica
     * Region</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param updateQueueOutboundCallerConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueOutboundCallerConfig service method, as returned by
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
    public Future<Void> updateQueueOutboundCallerConfigAsync(
            final UpdateQueueOutboundCallerConfigRequest updateQueueOutboundCallerConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateQueueOutboundCallerConfig(updateQueueOutboundCallerConfigRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the outbound caller ID name, number, and outbound whisper flow
     * for a specified queue.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * If the phone number is claimed to a traffic distribution group that was
     * created in the same Region as the Amazon Connect instance where you are
     * calling this API, then you can use a full phone number ARN or a UUID for
     * <code>OutboundCallerIdNumberId</code>. However, if the phone number is
     * claimed to a traffic distribution group that is in one Region, and you
     * are calling this API from an instance in another Amazon Web Services
     * Region that is associated with the traffic distribution group, you must
     * provide a full phone number ARN. If a UUID is provided in this scenario,
     * you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only use the phone number ARN format that doesn't contain
     * <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This
     * is the same ARN format that is returned when you call the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html"
     * >ListPhoneNumbersV2</a> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you plan to use IAM policies to allow/deny access to this API for
     * phone number resources claimed to a traffic distribution group, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_resource-level-policy-examples.html#allow-deny-queue-actions-replica-region"
     * >Allow or Deny queue API actions for phone numbers in a replica
     * Region</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param updateQueueOutboundCallerConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueOutboundCallerConfig service method, as returned by
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
    public Future<Void> updateQueueOutboundCallerConfigAsync(
            final UpdateQueueOutboundCallerConfigRequest updateQueueOutboundCallerConfigRequest,
            final AsyncHandler<UpdateQueueOutboundCallerConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateQueueOutboundCallerConfig(updateQueueOutboundCallerConfigRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateQueueOutboundCallerConfigRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the status of the queue.
     * </p>
     * 
     * @param updateQueueStatusRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueStatus service method, as returned by Amazon Connect.
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
    public Future<Void> updateQueueStatusAsync(
            final UpdateQueueStatusRequest updateQueueStatusRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateQueueStatus(updateQueueStatusRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to
     * change.
     * </p>
     * <p>
     * Updates the status of the queue.
     * </p>
     * 
     * @param updateQueueStatusRequest
     * @return A Java Future object containing the response from the
     *         UpdateQueueStatus service method, as returned by Amazon Connect.
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
    public Future<Void> updateQueueStatusAsync(
            final UpdateQueueStatusRequest updateQueueStatusRequest,
            final AsyncHandler<UpdateQueueStatusRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateQueueStatus(updateQueueStatusRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateQueueStatusRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the configuration settings for the specified quick connect.
     * </p>
     * 
     * @param updateQuickConnectConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateQuickConnectConfig service method, as returned by Amazon
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
    public Future<Void> updateQuickConnectConfigAsync(
            final UpdateQuickConnectConfigRequest updateQuickConnectConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateQuickConnectConfig(updateQuickConnectConfigRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the configuration settings for the specified quick connect.
     * </p>
     * 
     * @param updateQuickConnectConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateQuickConnectConfig service method, as returned by Amazon
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
    public Future<Void> updateQuickConnectConfigAsync(
            final UpdateQuickConnectConfigRequest updateQuickConnectConfigRequest,
            final AsyncHandler<UpdateQuickConnectConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateQuickConnectConfig(updateQuickConnectConfigRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateQuickConnectConfigRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the name and description of a quick connect. The request accepts
     * the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQuickConnectNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateQuickConnectName service method, as returned by Amazon
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
    public Future<Void> updateQuickConnectNameAsync(
            final UpdateQuickConnectNameRequest updateQuickConnectNameRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateQuickConnectName(updateQuickConnectNameRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the name and description of a quick connect. The request accepts
     * the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQuickConnectNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateQuickConnectName service method, as returned by Amazon
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
    public Future<Void> updateQuickConnectNameAsync(
            final UpdateQuickConnectNameRequest updateQuickConnectNameRequest,
            final AsyncHandler<UpdateQuickConnectNameRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateQuickConnectName(updateQuickConnectNameRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateQuickConnectNameRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * 
     * @param updateRoutingProfileAgentAvailabilityTimerRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileAgentAvailabilityTimer service method, as
     *         returned by Amazon Connect.
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
    public Future<Void> updateRoutingProfileAgentAvailabilityTimerAsync(
            final UpdateRoutingProfileAgentAvailabilityTimerRequest updateRoutingProfileAgentAvailabilityTimerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateRoutingProfileAgentAvailabilityTimer(updateRoutingProfileAgentAvailabilityTimerRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * 
     * @param updateRoutingProfileAgentAvailabilityTimerRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileAgentAvailabilityTimer service method, as
     *         returned by Amazon Connect.
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
    public Future<Void> updateRoutingProfileAgentAvailabilityTimerAsync(
            final UpdateRoutingProfileAgentAvailabilityTimerRequest updateRoutingProfileAgentAvailabilityTimerRequest,
            final AsyncHandler<UpdateRoutingProfileAgentAvailabilityTimerRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateRoutingProfileAgentAvailabilityTimer(updateRoutingProfileAgentAvailabilityTimerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateRoutingProfileAgentAvailabilityTimerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel
     * (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileConcurrency service method, as returned by
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
    public Future<Void> updateRoutingProfileConcurrencyAsync(
            final UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateRoutingProfileConcurrency(updateRoutingProfileConcurrencyRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel
     * (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileConcurrency service method, as returned by
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
    public Future<Void> updateRoutingProfileConcurrencyAsync(
            final UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest,
            final AsyncHandler<UpdateRoutingProfileConcurrencyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateRoutingProfileConcurrency(updateRoutingProfileConcurrencyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateRoutingProfileConcurrencyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileDefaultOutboundQueue service method, as
     *         returned by Amazon Connect.
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
    public Future<Void> updateRoutingProfileDefaultOutboundQueueAsync(
            final UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateRoutingProfileDefaultOutboundQueue(updateRoutingProfileDefaultOutboundQueueRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileDefaultOutboundQueue service method, as
     *         returned by Amazon Connect.
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
    public Future<Void> updateRoutingProfileDefaultOutboundQueueAsync(
            final UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest,
            final AsyncHandler<UpdateRoutingProfileDefaultOutboundQueueRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateRoutingProfileDefaultOutboundQueue(updateRoutingProfileDefaultOutboundQueueRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateRoutingProfileDefaultOutboundQueueRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the name and description of a routing profile. The request
     * accepts the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileName service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
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
    public Future<Void> updateRoutingProfileNameAsync(
            final UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateRoutingProfileName(updateRoutingProfileNameRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the name and description of a routing profile. The request
     * accepts the following data in JSON format. At least <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileName service method, as returned by Amazon
     *         Connect.
     * @throws DuplicateResourceException
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
    public Future<Void> updateRoutingProfileNameAsync(
            final UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest,
            final AsyncHandler<UpdateRoutingProfileNameRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateRoutingProfileName(updateRoutingProfileNameRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateRoutingProfileNameRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing
     * profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileQueues service method, as returned by Amazon
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
    public Future<Void> updateRoutingProfileQueuesAsync(
            final UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateRoutingProfileQueues(updateRoutingProfileQueuesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing
     * profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
     * @return A Java Future object containing the response from the
     *         UpdateRoutingProfileQueues service method, as returned by Amazon
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
    public Future<Void> updateRoutingProfileQueuesAsync(
            final UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest,
            final AsyncHandler<UpdateRoutingProfileQueuesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateRoutingProfileQueues(updateRoutingProfileQueuesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateRoutingProfileQueuesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html"
     * >Rules Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param updateRuleRequest
     * @return A Java Future object containing the response from the UpdateRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateRuleAsync(final UpdateRuleRequest updateRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateRule(updateRuleRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html"
     * >Rules Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param updateRuleRequest
     * @return A Java Future object containing the response from the UpdateRule
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> updateRuleAsync(final UpdateRuleRequest updateRuleRequest,
            final AsyncHandler<UpdateRuleRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateRule(updateRuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateRuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates a security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         UpdateSecurityProfile service method, as returned by Amazon
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
    public Future<Void> updateSecurityProfileAsync(
            final UpdateSecurityProfileRequest updateSecurityProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateSecurityProfile(updateSecurityProfileRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates a security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return A Java Future object containing the response from the
     *         UpdateSecurityProfile service method, as returned by Amazon
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
    public Future<Void> updateSecurityProfileAsync(
            final UpdateSecurityProfileRequest updateSecurityProfileRequest,
            final AsyncHandler<UpdateSecurityProfileRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateSecurityProfile(updateSecurityProfileRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateSecurityProfileRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates details about a specific task template in the specified Amazon
     * Connect instance. This operation does not support partial updates.
     * Instead it does a full update of template content.
     * </p>
     * 
     * @param updateTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         UpdateTaskTemplate service method, as returned by Amazon Connect.
     * @throws PropertyValidationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateTaskTemplateResult> updateTaskTemplateAsync(
            final UpdateTaskTemplateRequest updateTaskTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateTaskTemplateResult>() {
            public UpdateTaskTemplateResult call() throws Exception {
                return updateTaskTemplate(updateTaskTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Updates details about a specific task template in the specified Amazon
     * Connect instance. This operation does not support partial updates.
     * Instead it does a full update of template content.
     * </p>
     * 
     * @param updateTaskTemplateRequest
     * @return A Java Future object containing the response from the
     *         UpdateTaskTemplate service method, as returned by Amazon Connect.
     * @throws PropertyValidationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateTaskTemplateResult> updateTaskTemplateAsync(
            final UpdateTaskTemplateRequest updateTaskTemplateRequest,
            final AsyncHandler<UpdateTaskTemplateRequest, UpdateTaskTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateTaskTemplateResult>() {
            public UpdateTaskTemplateResult call() throws Exception {
                UpdateTaskTemplateResult result = null;
                try {
                    result = updateTaskTemplate(updateTaskTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateTaskTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the traffic distribution for a given traffic distribution group.
     * </p>
     * <note>
     * <p>
     * The <code>SignInConfig</code> distribution is available only on a default
     * <code>TrafficDistributionGroup</code> (see the <code>IsDefault</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_TrafficDistributionGroup.html"
     * >TrafficDistributionGroup</a> data type). If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about updating a traffic distribution group, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/update-telephony-traffic-distribution.html"
     * >Update telephony traffic distribution across Amazon Web Services Regions
     * </a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param updateTrafficDistributionRequest
     * @return A Java Future object containing the response from the
     *         UpdateTrafficDistribution service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
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
    public Future<UpdateTrafficDistributionResult> updateTrafficDistributionAsync(
            final UpdateTrafficDistributionRequest updateTrafficDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateTrafficDistributionResult>() {
            public UpdateTrafficDistributionResult call() throws Exception {
                return updateTrafficDistribution(updateTrafficDistributionRequest);
            }
        });
    }

    /**
     * <p>
     * Updates the traffic distribution for a given traffic distribution group.
     * </p>
     * <note>
     * <p>
     * The <code>SignInConfig</code> distribution is available only on a default
     * <code>TrafficDistributionGroup</code> (see the <code>IsDefault</code>
     * parameter in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_TrafficDistributionGroup.html"
     * >TrafficDistributionGroup</a> data type). If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about updating a traffic distribution group, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/update-telephony-traffic-distribution.html"
     * >Update telephony traffic distribution across Amazon Web Services Regions
     * </a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param updateTrafficDistributionRequest
     * @return A Java Future object containing the response from the
     *         UpdateTrafficDistribution service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
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
    public Future<UpdateTrafficDistributionResult> updateTrafficDistributionAsync(
            final UpdateTrafficDistributionRequest updateTrafficDistributionRequest,
            final AsyncHandler<UpdateTrafficDistributionRequest, UpdateTrafficDistributionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateTrafficDistributionResult>() {
            public UpdateTrafficDistributionResult call() throws Exception {
                UpdateTrafficDistributionResult result = null;
                try {
                    result = updateTrafficDistribution(updateTrafficDistributionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateTrafficDistributionRequest, result);
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
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchyGroupName service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
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
    public Future<Void> updateUserHierarchyGroupNameAsync(
            final UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserHierarchyGroupName(updateUserHierarchyGroupNameRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchyGroupName service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
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
    public Future<Void> updateUserHierarchyGroupNameAsync(
            final UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest,
            final AsyncHandler<UpdateUserHierarchyGroupNameRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateUserHierarchyGroupName(updateUserHierarchyGroupNameRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateUserHierarchyGroupNameRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user
     * hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
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
    public Future<Void> updateUserHierarchyStructureAsync(
            final UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserHierarchyStructure(updateUserHierarchyStructureRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user
     * hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
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
    public Future<Void> updateUserHierarchyStructureAsync(
            final UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest,
            final AsyncHandler<UpdateUserHierarchyStructureRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateUserHierarchyStructure(updateUserHierarchyStructureRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateUserHierarchyStructureRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * <important>
     * <p>
     * We strongly recommend limiting who has the ability to invoke
     * <code>UpdateUserIdentityInfo</code>. Someone with that ability can change
     * the login credentials of other users by changing their email address.
     * This poses a security risk to your organization. They can change the
     * email address of a user to the attacker's email address, and then reset
     * the password through email. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html"
     * >Best Practices for Security Profiles</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * </important>
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
     * <important>
     * <p>
     * We strongly recommend limiting who has the ability to invoke
     * <code>UpdateUserIdentityInfo</code>. Someone with that ability can change
     * the login credentials of other users by changing their email address.
     * This poses a security risk to your organization. They can change the
     * email address of a user to the attacker's email address, and then reset
     * the password through email. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html"
     * >Best Practices for Security Profiles</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * </important>
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
     * Updates the properties associated with the proficiencies of a user.
     * </p>
     * 
     * @param updateUserProficienciesRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserProficiencies service method, as returned by Amazon
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
    public Future<Void> updateUserProficienciesAsync(
            final UpdateUserProficienciesRequest updateUserProficienciesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateUserProficiencies(updateUserProficienciesRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates the properties associated with the proficiencies of a user.
     * </p>
     * 
     * @param updateUserProficienciesRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserProficiencies service method, as returned by Amazon
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
    public Future<Void> updateUserProficienciesAsync(
            final UpdateUserProficienciesRequest updateUserProficienciesRequest,
            final AsyncHandler<UpdateUserProficienciesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateUserProficiencies(updateUserProficienciesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateUserProficienciesRequest, result);
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

    /**
     * <p>
     * Updates the view content of the given view identifier in the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * It performs content validation if <code>Status</code> is set to
     * <code>SAVED</code> and performs full content validation if
     * <code>Status</code> is <code>PUBLISHED</code>. Note that the
     * <code>$SAVED</code> alias' content will always be updated, but the
     * <code>$LATEST</code> alias' content will only be updated if
     * <code>Status</code> is <code>PUBLISHED</code>.
     * </p>
     * 
     * @param updateViewContentRequest
     * @return A Java Future object containing the response from the
     *         UpdateViewContent service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateViewContentResult> updateViewContentAsync(
            final UpdateViewContentRequest updateViewContentRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdateViewContentResult>() {
            public UpdateViewContentResult call() throws Exception {
                return updateViewContent(updateViewContentRequest);
            }
        });
    }

    /**
     * <p>
     * Updates the view content of the given view identifier in the specified
     * Amazon Connect instance.
     * </p>
     * <p>
     * It performs content validation if <code>Status</code> is set to
     * <code>SAVED</code> and performs full content validation if
     * <code>Status</code> is <code>PUBLISHED</code>. Note that the
     * <code>$SAVED</code> alias' content will always be updated, but the
     * <code>$LATEST</code> alias' content will only be updated if
     * <code>Status</code> is <code>PUBLISHED</code>.
     * </p>
     * 
     * @param updateViewContentRequest
     * @return A Java Future object containing the response from the
     *         UpdateViewContent service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateViewContentResult> updateViewContentAsync(
            final UpdateViewContentRequest updateViewContentRequest,
            final AsyncHandler<UpdateViewContentRequest, UpdateViewContentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateViewContentResult>() {
            public UpdateViewContentResult call() throws Exception {
                UpdateViewContentResult result = null;
                try {
                    result = updateViewContent(updateViewContentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateViewContentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the view metadata. Note that either <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateViewMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdateViewMetadata service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws DuplicateResourceException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateViewMetadataResult> updateViewMetadataAsync(
            final UpdateViewMetadataRequest updateViewMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateViewMetadataResult>() {
            public UpdateViewMetadataResult call() throws Exception {
                return updateViewMetadata(updateViewMetadataRequest);
            }
        });
    }

    /**
     * <p>
     * Updates the view metadata. Note that either <code>Name</code> or
     * <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateViewMetadataRequest
     * @return A Java Future object containing the response from the
     *         UpdateViewMetadata service method, as returned by Amazon Connect.
     * @throws AccessDeniedException
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws DuplicateResourceException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateViewMetadataResult> updateViewMetadataAsync(
            final UpdateViewMetadataRequest updateViewMetadataRequest,
            final AsyncHandler<UpdateViewMetadataRequest, UpdateViewMetadataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateViewMetadataResult>() {
            public UpdateViewMetadataResult call() throws Exception {
                UpdateViewMetadataResult result = null;
                try {
                    result = updateViewMetadata(updateViewMetadataRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateViewMetadataRequest, result);
                return result;
            }
        });
    }

}
