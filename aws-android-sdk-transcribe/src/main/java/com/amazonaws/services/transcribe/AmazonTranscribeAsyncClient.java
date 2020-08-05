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

package com.amazonaws.services.transcribe;

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

import com.amazonaws.services.transcribe.model.*;

/**
 * Interface for accessing Amazon Transcribe asynchronously.
 * <p>
 * Operations and objects for transcribing speech to text.
 * </p>
 **/
public class AmazonTranscribeAsyncClient extends AmazonTranscribeClient implements
        AmazonTranscribeAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Transcribe. A credentials provider chain will be used that searches for
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
    public AmazonTranscribeAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Transcribe. A credentials provider chain will be used that searches for
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
     *            how this client connects to Amazon Transcribe (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonTranscribeAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Transcribe using the specified AWS account credentials. Default client
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
    public AmazonTranscribeAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Transcribe using the specified AWS account credentials and executor
     * service. Default client settings will be used.
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
    public AmazonTranscribeAsyncClient(AWSCredentials awsCredentials,
            ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Transcribe using the specified AWS account credentials, executor service,
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
    public AmazonTranscribeAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Transcribe using the specified AWS account credentials provider. Default
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
    public AmazonTranscribeAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Transcribe using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
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
    public AmazonTranscribeAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Transcribe using the specified AWS account credentials provider and
     * client configuration options.
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
    public AmazonTranscribeAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Transcribe using the specified AWS account credentials provider, executor
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
    public AmazonTranscribeAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Creates a new custom language model. Use Amazon S3 prefixes to provide
     * the location of your input files. The time it takes to create your model
     * depends on the size of your training data.
     * </p>
     * 
     * @param createLanguageModelRequest
     * @return A Java Future object containing the response from the
     *         CreateLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateLanguageModelResult> createLanguageModelAsync(
            final CreateLanguageModelRequest createLanguageModelRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLanguageModelResult>() {
            public CreateLanguageModelResult call() throws Exception {
                return createLanguageModel(createLanguageModelRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new custom language model. Use Amazon S3 prefixes to provide
     * the location of your input files. The time it takes to create your model
     * depends on the size of your training data.
     * </p>
     * 
     * @param createLanguageModelRequest
     * @return A Java Future object containing the response from the
     *         CreateLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateLanguageModelResult> createLanguageModelAsync(
            final CreateLanguageModelRequest createLanguageModelRequest,
            final AsyncHandler<CreateLanguageModelRequest, CreateLanguageModelResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLanguageModelResult>() {
            public CreateLanguageModelResult call() throws Exception {
                CreateLanguageModelResult result = null;
                try {
                    result = createLanguageModel(createLanguageModelRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createLanguageModelRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new custom vocabulary that you can use to change how Amazon
     * Transcribe Medical transcribes your audio file.
     * </p>
     * 
     * @param createMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         CreateMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateMedicalVocabularyResult> createMedicalVocabularyAsync(
            final CreateMedicalVocabularyRequest createMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateMedicalVocabularyResult>() {
            public CreateMedicalVocabularyResult call() throws Exception {
                return createMedicalVocabulary(createMedicalVocabularyRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new custom vocabulary that you can use to change how Amazon
     * Transcribe Medical transcribes your audio file.
     * </p>
     * 
     * @param createMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         CreateMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateMedicalVocabularyResult> createMedicalVocabularyAsync(
            final CreateMedicalVocabularyRequest createMedicalVocabularyRequest,
            final AsyncHandler<CreateMedicalVocabularyRequest, CreateMedicalVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateMedicalVocabularyResult>() {
            public CreateMedicalVocabularyResult call() throws Exception {
                CreateMedicalVocabularyResult result = null;
                try {
                    result = createMedicalVocabulary(createMedicalVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createMedicalVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new custom vocabulary that you can use to change the way Amazon
     * Transcribe handles transcription of an audio file.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return A Java Future object containing the response from the
     *         CreateVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
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
     * Creates a new custom vocabulary that you can use to change the way Amazon
     * Transcribe handles transcription of an audio file.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return A Java Future object containing the response from the
     *         CreateVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
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
     * Creates a new vocabulary filter that you can use to filter words, such as
     * profane words, from the output of a transcription job.
     * </p>
     * 
     * @param createVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         CreateVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(
            final CreateVocabularyFilterRequest createVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateVocabularyFilterResult>() {
            public CreateVocabularyFilterResult call() throws Exception {
                return createVocabularyFilter(createVocabularyFilterRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new vocabulary filter that you can use to filter words, such as
     * profane words, from the output of a transcription job.
     * </p>
     * 
     * @param createVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         CreateVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(
            final CreateVocabularyFilterRequest createVocabularyFilterRequest,
            final AsyncHandler<CreateVocabularyFilterRequest, CreateVocabularyFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateVocabularyFilterResult>() {
            public CreateVocabularyFilterResult call() throws Exception {
                CreateVocabularyFilterResult result = null;
                try {
                    result = createVocabularyFilter(createVocabularyFilterRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createVocabularyFilterRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a custom language model using its name.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @return A Java Future object containing the response from the
     *         DeleteLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteLanguageModelAsync(
            final DeleteLanguageModelRequest deleteLanguageModelRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLanguageModel(deleteLanguageModelRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a custom language model using its name.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @return A Java Future object containing the response from the
     *         DeleteLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteLanguageModelAsync(
            final DeleteLanguageModelRequest deleteLanguageModelRequest,
            final AsyncHandler<DeleteLanguageModelRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteLanguageModel(deleteLanguageModelRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteLanguageModelRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a transcription job generated by Amazon Transcribe Medical and
     * any related information.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         DeleteMedicalTranscriptionJob service method, as returned by
     *         Amazon Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteMedicalTranscriptionJobAsync(
            final DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteMedicalTranscriptionJob(deleteMedicalTranscriptionJobRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a transcription job generated by Amazon Transcribe Medical and
     * any related information.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         DeleteMedicalTranscriptionJob service method, as returned by
     *         Amazon Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteMedicalTranscriptionJobAsync(
            final DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest,
            final AsyncHandler<DeleteMedicalTranscriptionJobRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteMedicalTranscriptionJob(deleteMedicalTranscriptionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteMedicalTranscriptionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a vocabulary from Amazon Transcribe Medical.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DeleteMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteMedicalVocabularyAsync(
            final DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteMedicalVocabulary(deleteMedicalVocabularyRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a vocabulary from Amazon Transcribe Medical.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DeleteMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteMedicalVocabularyAsync(
            final DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest,
            final AsyncHandler<DeleteMedicalVocabularyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteMedicalVocabulary(deleteMedicalVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteMedicalVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a previously submitted transcription job along with any other
     * generated results such as the transcription, models, and so on.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         DeleteTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteTranscriptionJobAsync(
            final DeleteTranscriptionJobRequest deleteTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteTranscriptionJob(deleteTranscriptionJobRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a previously submitted transcription job along with any other
     * generated results such as the transcription, models, and so on.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         DeleteTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteTranscriptionJobAsync(
            final DeleteTranscriptionJobRequest deleteTranscriptionJobRequest,
            final AsyncHandler<DeleteTranscriptionJobRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteTranscriptionJob(deleteTranscriptionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteTranscriptionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a vocabulary from Amazon Transcribe.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DeleteVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteVocabularyAsync(final DeleteVocabularyRequest deleteVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteVocabulary(deleteVocabularyRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes a vocabulary from Amazon Transcribe.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DeleteVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteVocabularyAsync(
            final DeleteVocabularyRequest deleteVocabularyRequest,
            final AsyncHandler<DeleteVocabularyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteVocabulary(deleteVocabularyRequest);
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
     * Removes a vocabulary filter.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         DeleteVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteVocabularyFilterAsync(
            final DeleteVocabularyFilterRequest deleteVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteVocabularyFilter(deleteVocabularyFilterRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Removes a vocabulary filter.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         DeleteVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteVocabularyFilterAsync(
            final DeleteVocabularyFilterRequest deleteVocabularyFilterRequest,
            final AsyncHandler<DeleteVocabularyFilterRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteVocabularyFilter(deleteVocabularyFilterRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteVocabularyFilterRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets information about a single custom language model. Use this
     * information to see details about the language model in your AWS account.
     * You can also see whether the base language model used to create your
     * custom language model has been updated. If Amazon Transcribe has updated
     * the base model, you can create a new custom language model using the
     * updated base model. If the language model wasn't created, you can use
     * this operation to understand why Amazon Transcribe couldn't create it.
     * </p>
     * 
     * @param describeLanguageModelRequest
     * @return A Java Future object containing the response from the
     *         DescribeLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeLanguageModelResult> describeLanguageModelAsync(
            final DescribeLanguageModelRequest describeLanguageModelRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLanguageModelResult>() {
            public DescribeLanguageModelResult call() throws Exception {
                return describeLanguageModel(describeLanguageModelRequest);
            }
        });
    }

    /**
     * <p>
     * Gets information about a single custom language model. Use this
     * information to see details about the language model in your AWS account.
     * You can also see whether the base language model used to create your
     * custom language model has been updated. If Amazon Transcribe has updated
     * the base model, you can create a new custom language model using the
     * updated base model. If the language model wasn't created, you can use
     * this operation to understand why Amazon Transcribe couldn't create it.
     * </p>
     * 
     * @param describeLanguageModelRequest
     * @return A Java Future object containing the response from the
     *         DescribeLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeLanguageModelResult> describeLanguageModelAsync(
            final DescribeLanguageModelRequest describeLanguageModelRequest,
            final AsyncHandler<DescribeLanguageModelRequest, DescribeLanguageModelResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLanguageModelResult>() {
            public DescribeLanguageModelResult call() throws Exception {
                DescribeLanguageModelResult result = null;
                try {
                    result = describeLanguageModel(describeLanguageModelRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeLanguageModelRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns information about a transcription job from Amazon Transcribe
     * Medical. To see the status of the job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You find the results of the
     * completed job in the <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param getMedicalTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         GetMedicalTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(
            final GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMedicalTranscriptionJobResult>() {
            public GetMedicalTranscriptionJobResult call() throws Exception {
                return getMedicalTranscriptionJob(getMedicalTranscriptionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Returns information about a transcription job from Amazon Transcribe
     * Medical. To see the status of the job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You find the results of the
     * completed job in the <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param getMedicalTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         GetMedicalTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(
            final GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest,
            final AsyncHandler<GetMedicalTranscriptionJobRequest, GetMedicalTranscriptionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMedicalTranscriptionJobResult>() {
            public GetMedicalTranscriptionJobResult call() throws Exception {
                GetMedicalTranscriptionJobResult result = null;
                try {
                    result = getMedicalTranscriptionJob(getMedicalTranscriptionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getMedicalTranscriptionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves information about a medical vocabulary.
     * </p>
     * 
     * @param getMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         GetMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetMedicalVocabularyResult> getMedicalVocabularyAsync(
            final GetMedicalVocabularyRequest getMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMedicalVocabularyResult>() {
            public GetMedicalVocabularyResult call() throws Exception {
                return getMedicalVocabulary(getMedicalVocabularyRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves information about a medical vocabulary.
     * </p>
     * 
     * @param getMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         GetMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetMedicalVocabularyResult> getMedicalVocabularyAsync(
            final GetMedicalVocabularyRequest getMedicalVocabularyRequest,
            final AsyncHandler<GetMedicalVocabularyRequest, GetMedicalVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMedicalVocabularyResult>() {
            public GetMedicalVocabularyResult call() throws Exception {
                GetMedicalVocabularyResult result = null;
                try {
                    result = getMedicalVocabulary(getMedicalVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getMedicalVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns information about a transcription job. To see the status of the
     * job, check the <code>TranscriptionJobStatus</code> field. If the status
     * is <code>COMPLETED</code>, the job is finished and you can find the
     * results at the location specified in the <code>TranscriptFileUri</code>
     * field. If you enable content redaction, the redacted transcript appears
     * in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         GetTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetTranscriptionJobResult> getTranscriptionJobAsync(
            final GetTranscriptionJobRequest getTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTranscriptionJobResult>() {
            public GetTranscriptionJobResult call() throws Exception {
                return getTranscriptionJob(getTranscriptionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Returns information about a transcription job. To see the status of the
     * job, check the <code>TranscriptionJobStatus</code> field. If the status
     * is <code>COMPLETED</code>, the job is finished and you can find the
     * results at the location specified in the <code>TranscriptFileUri</code>
     * field. If you enable content redaction, the redacted transcript appears
     * in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         GetTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetTranscriptionJobResult> getTranscriptionJobAsync(
            final GetTranscriptionJobRequest getTranscriptionJobRequest,
            final AsyncHandler<GetTranscriptionJobRequest, GetTranscriptionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTranscriptionJobResult>() {
            public GetTranscriptionJobResult call() throws Exception {
                GetTranscriptionJobResult result = null;
                try {
                    result = getTranscriptionJob(getTranscriptionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getTranscriptionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets information about a vocabulary.
     * </p>
     * 
     * @param getVocabularyRequest
     * @return A Java Future object containing the response from the
     *         GetVocabulary service method, as returned by Amazon Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetVocabularyResult> getVocabularyAsync(
            final GetVocabularyRequest getVocabularyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetVocabularyResult>() {
            public GetVocabularyResult call() throws Exception {
                return getVocabulary(getVocabularyRequest);
            }
        });
    }

    /**
     * <p>
     * Gets information about a vocabulary.
     * </p>
     * 
     * @param getVocabularyRequest
     * @return A Java Future object containing the response from the
     *         GetVocabulary service method, as returned by Amazon Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetVocabularyResult> getVocabularyAsync(
            final GetVocabularyRequest getVocabularyRequest,
            final AsyncHandler<GetVocabularyRequest, GetVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetVocabularyResult>() {
            public GetVocabularyResult call() throws Exception {
                GetVocabularyResult result = null;
                try {
                    result = getVocabulary(getVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns information about a vocabulary filter.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         GetVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetVocabularyFilterResult> getVocabularyFilterAsync(
            final GetVocabularyFilterRequest getVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetVocabularyFilterResult>() {
            public GetVocabularyFilterResult call() throws Exception {
                return getVocabularyFilter(getVocabularyFilterRequest);
            }
        });
    }

    /**
     * <p>
     * Returns information about a vocabulary filter.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         GetVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetVocabularyFilterResult> getVocabularyFilterAsync(
            final GetVocabularyFilterRequest getVocabularyFilterRequest,
            final AsyncHandler<GetVocabularyFilterRequest, GetVocabularyFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetVocabularyFilterResult>() {
            public GetVocabularyFilterResult call() throws Exception {
                GetVocabularyFilterResult result = null;
                try {
                    result = getVocabularyFilter(getVocabularyFilterRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getVocabularyFilterRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides more information about the custom language models you've
     * created. You can use the information in this list to find a specific
     * custom language model. You can then use the operation to get more
     * information about it.
     * </p>
     * 
     * @param listLanguageModelsRequest
     * @return A Java Future object containing the response from the
     *         ListLanguageModels service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListLanguageModelsResult> listLanguageModelsAsync(
            final ListLanguageModelsRequest listLanguageModelsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLanguageModelsResult>() {
            public ListLanguageModelsResult call() throws Exception {
                return listLanguageModels(listLanguageModelsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides more information about the custom language models you've
     * created. You can use the information in this list to find a specific
     * custom language model. You can then use the operation to get more
     * information about it.
     * </p>
     * 
     * @param listLanguageModelsRequest
     * @return A Java Future object containing the response from the
     *         ListLanguageModels service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListLanguageModelsResult> listLanguageModelsAsync(
            final ListLanguageModelsRequest listLanguageModelsRequest,
            final AsyncHandler<ListLanguageModelsRequest, ListLanguageModelsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLanguageModelsResult>() {
            public ListLanguageModelsResult call() throws Exception {
                ListLanguageModelsResult result = null;
                try {
                    result = listLanguageModels(listLanguageModelsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listLanguageModelsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists medical transcription jobs with a specified status or substring
     * that matches their names.
     * </p>
     * 
     * @param listMedicalTranscriptionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListMedicalTranscriptionJobs service method, as returned by
     *         Amazon Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(
            final ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListMedicalTranscriptionJobsResult>() {
            public ListMedicalTranscriptionJobsResult call() throws Exception {
                return listMedicalTranscriptionJobs(listMedicalTranscriptionJobsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists medical transcription jobs with a specified status or substring
     * that matches their names.
     * </p>
     * 
     * @param listMedicalTranscriptionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListMedicalTranscriptionJobs service method, as returned by
     *         Amazon Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(
            final ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest,
            final AsyncHandler<ListMedicalTranscriptionJobsRequest, ListMedicalTranscriptionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListMedicalTranscriptionJobsResult>() {
            public ListMedicalTranscriptionJobsResult call() throws Exception {
                ListMedicalTranscriptionJobsResult result = null;
                try {
                    result = listMedicalTranscriptionJobs(listMedicalTranscriptionJobsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listMedicalTranscriptionJobsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If you
     * don't enter a value in any of the request parameters, returns the entire
     * list of vocabularies.
     * </p>
     * 
     * @param listMedicalVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         ListMedicalVocabularies service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListMedicalVocabulariesResult> listMedicalVocabulariesAsync(
            final ListMedicalVocabulariesRequest listMedicalVocabulariesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListMedicalVocabulariesResult>() {
            public ListMedicalVocabulariesResult call() throws Exception {
                return listMedicalVocabularies(listMedicalVocabulariesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If you
     * don't enter a value in any of the request parameters, returns the entire
     * list of vocabularies.
     * </p>
     * 
     * @param listMedicalVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         ListMedicalVocabularies service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListMedicalVocabulariesResult> listMedicalVocabulariesAsync(
            final ListMedicalVocabulariesRequest listMedicalVocabulariesRequest,
            final AsyncHandler<ListMedicalVocabulariesRequest, ListMedicalVocabulariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListMedicalVocabulariesResult>() {
            public ListMedicalVocabulariesResult call() throws Exception {
                ListMedicalVocabulariesResult result = null;
                try {
                    result = listMedicalVocabularies(listMedicalVocabulariesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listMedicalVocabulariesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists transcription jobs with the specified status.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListTranscriptionJobs service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(
            final ListTranscriptionJobsRequest listTranscriptionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTranscriptionJobsResult>() {
            public ListTranscriptionJobsResult call() throws Exception {
                return listTranscriptionJobs(listTranscriptionJobsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists transcription jobs with the specified status.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListTranscriptionJobs service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(
            final ListTranscriptionJobsRequest listTranscriptionJobsRequest,
            final AsyncHandler<ListTranscriptionJobsRequest, ListTranscriptionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTranscriptionJobsResult>() {
            public ListTranscriptionJobsResult call() throws Exception {
                ListTranscriptionJobsResult result = null;
                try {
                    result = listTranscriptionJobs(listTranscriptionJobsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTranscriptionJobsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If no
     * criteria are specified, returns the entire list of vocabularies.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         ListVocabularies service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListVocabulariesResult> listVocabulariesAsync(
            final ListVocabulariesRequest listVocabulariesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListVocabulariesResult>() {
            public ListVocabulariesResult call() throws Exception {
                return listVocabularies(listVocabulariesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If no
     * criteria are specified, returns the entire list of vocabularies.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         ListVocabularies service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListVocabulariesResult> listVocabulariesAsync(
            final ListVocabulariesRequest listVocabulariesRequest,
            final AsyncHandler<ListVocabulariesRequest, ListVocabulariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVocabulariesResult>() {
            public ListVocabulariesResult call() throws Exception {
                ListVocabulariesResult result = null;
                try {
                    result = listVocabularies(listVocabulariesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listVocabulariesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets information about vocabulary filters.
     * </p>
     * 
     * @param listVocabularyFiltersRequest
     * @return A Java Future object containing the response from the
     *         ListVocabularyFilters service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(
            final ListVocabularyFiltersRequest listVocabularyFiltersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVocabularyFiltersResult>() {
            public ListVocabularyFiltersResult call() throws Exception {
                return listVocabularyFilters(listVocabularyFiltersRequest);
            }
        });
    }

    /**
     * <p>
     * Gets information about vocabulary filters.
     * </p>
     * 
     * @param listVocabularyFiltersRequest
     * @return A Java Future object containing the response from the
     *         ListVocabularyFilters service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(
            final ListVocabularyFiltersRequest listVocabularyFiltersRequest,
            final AsyncHandler<ListVocabularyFiltersRequest, ListVocabularyFiltersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVocabularyFiltersResult>() {
            public ListVocabularyFiltersResult call() throws Exception {
                ListVocabularyFiltersResult result = null;
                try {
                    result = listVocabularyFilters(listVocabularyFiltersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listVocabularyFiltersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts a batch job to transcribe medical speech to text.
     * </p>
     * 
     * @param startMedicalTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         StartMedicalTranscriptionJob service method, as returned by
     *         Amazon Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(
            final StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartMedicalTranscriptionJobResult>() {
            public StartMedicalTranscriptionJobResult call() throws Exception {
                return startMedicalTranscriptionJob(startMedicalTranscriptionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Starts a batch job to transcribe medical speech to text.
     * </p>
     * 
     * @param startMedicalTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         StartMedicalTranscriptionJob service method, as returned by
     *         Amazon Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(
            final StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest,
            final AsyncHandler<StartMedicalTranscriptionJobRequest, StartMedicalTranscriptionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartMedicalTranscriptionJobResult>() {
            public StartMedicalTranscriptionJobResult call() throws Exception {
                StartMedicalTranscriptionJobResult result = null;
                try {
                    result = startMedicalTranscriptionJob(startMedicalTranscriptionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startMedicalTranscriptionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
     * 
     * @param startTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         StartTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartTranscriptionJobResult> startTranscriptionJobAsync(
            final StartTranscriptionJobRequest startTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartTranscriptionJobResult>() {
            public StartTranscriptionJobResult call() throws Exception {
                return startTranscriptionJob(startTranscriptionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
     * 
     * @param startTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         StartTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartTranscriptionJobResult> startTranscriptionJobAsync(
            final StartTranscriptionJobRequest startTranscriptionJobRequest,
            final AsyncHandler<StartTranscriptionJobRequest, StartTranscriptionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartTranscriptionJobResult>() {
            public StartTranscriptionJobResult call() throws Exception {
                StartTranscriptionJobResult result = null;
                try {
                    result = startTranscriptionJob(startTranscriptionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startTranscriptionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates a vocabulary with new values that you provide in a different text
     * file from the one you used to create the vocabulary. The
     * <code>UpdateMedicalVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         UpdateMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateMedicalVocabularyResult> updateMedicalVocabularyAsync(
            final UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMedicalVocabularyResult>() {
            public UpdateMedicalVocabularyResult call() throws Exception {
                return updateMedicalVocabulary(updateMedicalVocabularyRequest);
            }
        });
    }

    /**
     * <p>
     * Updates a vocabulary with new values that you provide in a different text
     * file from the one you used to create the vocabulary. The
     * <code>UpdateMedicalVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         UpdateMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateMedicalVocabularyResult> updateMedicalVocabularyAsync(
            final UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest,
            final AsyncHandler<UpdateMedicalVocabularyRequest, UpdateMedicalVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMedicalVocabularyResult>() {
            public UpdateMedicalVocabularyResult call() throws Exception {
                UpdateMedicalVocabularyResult result = null;
                try {
                    result = updateMedicalVocabulary(updateMedicalVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateMedicalVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates an existing vocabulary with new values. The
     * <code>UpdateVocabulary</code> operation overwrites all of the existing
     * information with the values that you provide in the request.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return A Java Future object containing the response from the
     *         UpdateVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateVocabularyResult> updateVocabularyAsync(
            final UpdateVocabularyRequest updateVocabularyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdateVocabularyResult>() {
            public UpdateVocabularyResult call() throws Exception {
                return updateVocabulary(updateVocabularyRequest);
            }
        });
    }

    /**
     * <p>
     * Updates an existing vocabulary with new values. The
     * <code>UpdateVocabulary</code> operation overwrites all of the existing
     * information with the values that you provide in the request.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return A Java Future object containing the response from the
     *         UpdateVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateVocabularyResult> updateVocabularyAsync(
            final UpdateVocabularyRequest updateVocabularyRequest,
            final AsyncHandler<UpdateVocabularyRequest, UpdateVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateVocabularyResult>() {
            public UpdateVocabularyResult call() throws Exception {
                UpdateVocabularyResult result = null;
                try {
                    result = updateVocabulary(updateVocabularyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateVocabularyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates a vocabulary filter with a new list of filtered words.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         UpdateVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(
            final UpdateVocabularyFilterRequest updateVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateVocabularyFilterResult>() {
            public UpdateVocabularyFilterResult call() throws Exception {
                return updateVocabularyFilter(updateVocabularyFilterRequest);
            }
        });
    }

    /**
     * <p>
     * Updates a vocabulary filter with a new list of filtered words.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         UpdateVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(
            final UpdateVocabularyFilterRequest updateVocabularyFilterRequest,
            final AsyncHandler<UpdateVocabularyFilterRequest, UpdateVocabularyFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateVocabularyFilterResult>() {
            public UpdateVocabularyFilterResult call() throws Exception {
                UpdateVocabularyFilterResult result = null;
                try {
                    result = updateVocabularyFilter(updateVocabularyFilterRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateVocabularyFilterRequest, result);
                return result;
            }
        });
    }

}
