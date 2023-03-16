/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Transcribe offers three main types of batch transcription:
 * <b>Standard</b>, <b>Medical</b>, and <b>Call Analytics</b>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Standard transcriptions</b> are the most common option. Refer to for
 * details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Medical transcriptions</b> are tailored to medical professionals and
 * incorporate medical terms. A common use case for this service is transcribing
 * doctor-patient dialogue into after-visit notes. Refer to for details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Call Analytics transcriptions</b> are designed for use with call center
 * audio on two different channels; if you're looking for insight into customer
 * service calls, use this option. Refer to for details.
 * </p>
 * </li>
 * </ul>
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
     * Creates a new Call Analytics category.
     * </p>
     * <p>
     * All categories are automatically applied to your Call Analytics
     * transcriptions. Note that in order to apply categories to your
     * transcriptions, you must create them before submitting your transcription
     * request, as categories cannot be applied retroactively.
     * </p>
     * <p>
     * When creating a new category, you can use the <code>InputType</code>
     * parameter to label the category as a <code>POST_CALL</code> or a
     * <code>REAL_TIME</code> category. <code>POST_CALL</code> categories can
     * only be applied to post-call transcriptions and <code>REAL_TIME</code>
     * categories can only be applied to real-time transcriptions. If you do not
     * include <code>InputType</code>, your category is created as a
     * <code>POST_CALL</code> category by default.
     * </p>
     * <p>
     * Call Analytics categories are composed of rules. For each category, you
     * must create between 1 and 20 rules. Rules can include these parameters: ,
     * , , and .
     * </p>
     * <p>
     * To update an existing category, see .
     * </p>
     * <p>
     * To learn more about Call Analytics categories, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html"
     * >Creating categories for post-call transcriptions</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html"
     * >Creating categories for real-time transcriptions</a>.
     * </p>
     * 
     * @param createCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         CreateCallAnalyticsCategory service method, as returned by Amazon
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
    public Future<CreateCallAnalyticsCategoryResult> createCallAnalyticsCategoryAsync(
            final CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateCallAnalyticsCategoryResult>() {
            public CreateCallAnalyticsCategoryResult call() throws Exception {
                return createCallAnalyticsCategory(createCallAnalyticsCategoryRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new Call Analytics category.
     * </p>
     * <p>
     * All categories are automatically applied to your Call Analytics
     * transcriptions. Note that in order to apply categories to your
     * transcriptions, you must create them before submitting your transcription
     * request, as categories cannot be applied retroactively.
     * </p>
     * <p>
     * When creating a new category, you can use the <code>InputType</code>
     * parameter to label the category as a <code>POST_CALL</code> or a
     * <code>REAL_TIME</code> category. <code>POST_CALL</code> categories can
     * only be applied to post-call transcriptions and <code>REAL_TIME</code>
     * categories can only be applied to real-time transcriptions. If you do not
     * include <code>InputType</code>, your category is created as a
     * <code>POST_CALL</code> category by default.
     * </p>
     * <p>
     * Call Analytics categories are composed of rules. For each category, you
     * must create between 1 and 20 rules. Rules can include these parameters: ,
     * , , and .
     * </p>
     * <p>
     * To update an existing category, see .
     * </p>
     * <p>
     * To learn more about Call Analytics categories, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html"
     * >Creating categories for post-call transcriptions</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html"
     * >Creating categories for real-time transcriptions</a>.
     * </p>
     * 
     * @param createCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         CreateCallAnalyticsCategory service method, as returned by Amazon
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
    public Future<CreateCallAnalyticsCategoryResult> createCallAnalyticsCategoryAsync(
            final CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest,
            final AsyncHandler<CreateCallAnalyticsCategoryRequest, CreateCallAnalyticsCategoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateCallAnalyticsCategoryResult>() {
            public CreateCallAnalyticsCategoryResult call() throws Exception {
                CreateCallAnalyticsCategoryResult result = null;
                try {
                    result = createCallAnalyticsCategory(createCallAnalyticsCategoryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createCallAnalyticsCategoryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new custom language model.
     * </p>
     * <p>
     * When creating a new custom language model, you must specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a Wideband (audio sample rates over 16,000 Hz) or Narrowband
     * (audio sample rates under 16,000 Hz) base model
     * </p>
     * </li>
     * <li>
     * <p>
     * The location of your training and tuning files (this must be an Amazon S3
     * URI)
     * </p>
     * </li>
     * <li>
     * <p>
     * The language of your model
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique name for your model
     * </p>
     * </li>
     * </ul>
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
     * Creates a new custom language model.
     * </p>
     * <p>
     * When creating a new custom language model, you must specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a Wideband (audio sample rates over 16,000 Hz) or Narrowband
     * (audio sample rates under 16,000 Hz) base model
     * </p>
     * </li>
     * <li>
     * <p>
     * The location of your training and tuning files (this must be an Amazon S3
     * URI)
     * </p>
     * </li>
     * <li>
     * <p>
     * The language of your model
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique name for your model
     * </p>
     * </li>
     * </ul>
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
     * Creates a new custom medical vocabulary.
     * </p>
     * <p>
     * Before creating a new custom medical vocabulary, you must first upload a
     * text file that contains your vocabulary table into an Amazon S3 bucket.
     * Note that this differs from , where you can include a list of terms
     * within your request using the <code>Phrases</code> flag;
     * <code>CreateMedicalVocabulary</code> does not support the
     * <code>Phrases</code> flag and only accepts vocabularies in table format.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html"
     * >Custom vocabularies</a>.
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
     * Creates a new custom medical vocabulary.
     * </p>
     * <p>
     * Before creating a new custom medical vocabulary, you must first upload a
     * text file that contains your vocabulary table into an Amazon S3 bucket.
     * Note that this differs from , where you can include a list of terms
     * within your request using the <code>Phrases</code> flag;
     * <code>CreateMedicalVocabulary</code> does not support the
     * <code>Phrases</code> flag and only accepts vocabularies in table format.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html"
     * >Custom vocabularies</a>.
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
     * Creates a new custom vocabulary.
     * </p>
     * <p>
     * When creating a new custom vocabulary, you can either upload a text file
     * that contains your new entries, phrases, and terms into an Amazon S3
     * bucket and include the URI in your request. Or you can include a list of
     * terms directly in your request using the <code>Phrases</code> flag.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html"
     * >Custom vocabularies</a>.
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
     * Creates a new custom vocabulary.
     * </p>
     * <p>
     * When creating a new custom vocabulary, you can either upload a text file
     * that contains your new entries, phrases, and terms into an Amazon S3
     * bucket and include the URI in your request. Or you can include a list of
     * terms directly in your request using the <code>Phrases</code> flag.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html"
     * >Custom vocabularies</a>.
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
     * Creates a new custom vocabulary filter.
     * </p>
     * <p>
     * You can use custom vocabulary filters to mask, delete, or flag specific
     * words from your transcript. Custom vocabulary filters are commonly used
     * to mask profanity in transcripts.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html"
     * >Vocabulary filtering</a>.
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
     * Creates a new custom vocabulary filter.
     * </p>
     * <p>
     * You can use custom vocabulary filters to mask, delete, or flag specific
     * words from your transcript. Custom vocabulary filters are commonly used
     * to mask profanity in transcripts.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html"
     * >Vocabulary filtering</a>.
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
     * Deletes a Call Analytics category. To use this operation, specify the
     * name of the category you want to delete using <code>CategoryName</code>.
     * Category names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         DeleteCallAnalyticsCategory service method, as returned by Amazon
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
    public Future<DeleteCallAnalyticsCategoryResult> deleteCallAnalyticsCategoryAsync(
            final DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteCallAnalyticsCategoryResult>() {
            public DeleteCallAnalyticsCategoryResult call() throws Exception {
                return deleteCallAnalyticsCategory(deleteCallAnalyticsCategoryRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a Call Analytics category. To use this operation, specify the
     * name of the category you want to delete using <code>CategoryName</code>.
     * Category names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         DeleteCallAnalyticsCategory service method, as returned by Amazon
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
    public Future<DeleteCallAnalyticsCategoryResult> deleteCallAnalyticsCategoryAsync(
            final DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest,
            final AsyncHandler<DeleteCallAnalyticsCategoryRequest, DeleteCallAnalyticsCategoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteCallAnalyticsCategoryResult>() {
            public DeleteCallAnalyticsCategoryResult call() throws Exception {
                DeleteCallAnalyticsCategoryResult result = null;
                try {
                    result = deleteCallAnalyticsCategory(deleteCallAnalyticsCategoryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteCallAnalyticsCategoryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a Call Analytics job. To use this operation, specify the name of
     * the job you want to delete using <code>CallAnalyticsJobName</code>. Job
     * names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @return A Java Future object containing the response from the
     *         DeleteCallAnalyticsJob service method, as returned by Amazon
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
    public Future<DeleteCallAnalyticsJobResult> deleteCallAnalyticsJobAsync(
            final DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteCallAnalyticsJobResult>() {
            public DeleteCallAnalyticsJobResult call() throws Exception {
                return deleteCallAnalyticsJob(deleteCallAnalyticsJobRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a Call Analytics job. To use this operation, specify the name of
     * the job you want to delete using <code>CallAnalyticsJobName</code>. Job
     * names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @return A Java Future object containing the response from the
     *         DeleteCallAnalyticsJob service method, as returned by Amazon
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
    public Future<DeleteCallAnalyticsJobResult> deleteCallAnalyticsJobAsync(
            final DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest,
            final AsyncHandler<DeleteCallAnalyticsJobRequest, DeleteCallAnalyticsJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteCallAnalyticsJobResult>() {
            public DeleteCallAnalyticsJobResult call() throws Exception {
                DeleteCallAnalyticsJobResult result = null;
                try {
                    result = deleteCallAnalyticsJob(deleteCallAnalyticsJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteCallAnalyticsJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a custom language model. To use this operation, specify the name
     * of the language model you want to delete using <code>ModelName</code>.
     * custom language model names are case sensitive.
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
     * Deletes a custom language model. To use this operation, specify the name
     * of the language model you want to delete using <code>ModelName</code>.
     * custom language model names are case sensitive.
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
     * Deletes a medical transcription job. To use this operation, specify the
     * name of the job you want to delete using
     * <code>MedicalTranscriptionJobName</code>. Job names are case sensitive.
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
     * Deletes a medical transcription job. To use this operation, specify the
     * name of the job you want to delete using
     * <code>MedicalTranscriptionJobName</code>. Job names are case sensitive.
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
     * Deletes a custom medical vocabulary. To use this operation, specify the
     * name of the custom vocabulary you want to delete using
     * <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
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
     * Deletes a custom medical vocabulary. To use this operation, specify the
     * name of the custom vocabulary you want to delete using
     * <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
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
     * Deletes a transcription job. To use this operation, specify the name of
     * the job you want to delete using <code>TranscriptionJobName</code>. Job
     * names are case sensitive.
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
     * Deletes a transcription job. To use this operation, specify the name of
     * the job you want to delete using <code>TranscriptionJobName</code>. Job
     * names are case sensitive.
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
     * Deletes a custom vocabulary. To use this operation, specify the name of
     * the custom vocabulary you want to delete using
     * <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
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
     * Deletes a custom vocabulary. To use this operation, specify the name of
     * the custom vocabulary you want to delete using
     * <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
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
     * Deletes a custom vocabulary filter. To use this operation, specify the
     * name of the custom vocabulary filter you want to delete using
     * <code>VocabularyFilterName</code>. Custom vocabulary filter names are
     * case sensitive.
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
     * Deletes a custom vocabulary filter. To use this operation, specify the
     * name of the custom vocabulary filter you want to delete using
     * <code>VocabularyFilterName</code>. Custom vocabulary filter names are
     * case sensitive.
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
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This operation also shows if the base language model that you used to
     * create your custom language model has been updated. If Amazon Transcribe
     * has updated the base model, you can create a new custom language model
     * using the updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't
     * successful, you can use <code>DescribeLanguageModel</code> to help
     * identify the reason for this failure.
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
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This operation also shows if the base language model that you used to
     * create your custom language model has been updated. If Amazon Transcribe
     * has updated the base model, you can create a new custom language model
     * using the updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't
     * successful, you can use <code>DescribeLanguageModel</code> to help
     * identify the reason for this failure.
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
     * Provides information about the specified Call Analytics category.
     * </p>
     * <p>
     * To get a list of your Call Analytics categories, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         GetCallAnalyticsCategory service method, as returned by Amazon
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
    public Future<GetCallAnalyticsCategoryResult> getCallAnalyticsCategoryAsync(
            final GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCallAnalyticsCategoryResult>() {
            public GetCallAnalyticsCategoryResult call() throws Exception {
                return getCallAnalyticsCategory(getCallAnalyticsCategoryRequest);
            }
        });
    }

    /**
     * <p>
     * Provides information about the specified Call Analytics category.
     * </p>
     * <p>
     * To get a list of your Call Analytics categories, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         GetCallAnalyticsCategory service method, as returned by Amazon
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
    public Future<GetCallAnalyticsCategoryResult> getCallAnalyticsCategoryAsync(
            final GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest,
            final AsyncHandler<GetCallAnalyticsCategoryRequest, GetCallAnalyticsCategoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCallAnalyticsCategoryResult>() {
            public GetCallAnalyticsCategoryResult call() throws Exception {
                GetCallAnalyticsCategoryResult result = null;
                try {
                    result = getCallAnalyticsCategory(getCallAnalyticsCategoryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getCallAnalyticsCategoryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the specified Call Analytics job.
     * </p>
     * <p>
     * To view the job's status, refer to <code>CallAnalyticsJobStatus</code>.
     * If the status is <code>COMPLETED</code>, the job is finished. You can
     * find your completed transcript at the URI specified in
     * <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your transcription job
     * failed.
     * </p>
     * <p>
     * If you enabled personally identifiable information (PII) redaction, the
     * redacted transcript appears at the location specified in
     * <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * If you chose to redact the audio in your media file, you can find your
     * redacted media file at the location specified in
     * <code>RedactedMediaFileUri</code>.
     * </p>
     * <p>
     * To get a list of your Call Analytics jobs, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsJobRequest
     * @return A Java Future object containing the response from the
     *         GetCallAnalyticsJob service method, as returned by Amazon
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
    public Future<GetCallAnalyticsJobResult> getCallAnalyticsJobAsync(
            final GetCallAnalyticsJobRequest getCallAnalyticsJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCallAnalyticsJobResult>() {
            public GetCallAnalyticsJobResult call() throws Exception {
                return getCallAnalyticsJob(getCallAnalyticsJobRequest);
            }
        });
    }

    /**
     * <p>
     * Provides information about the specified Call Analytics job.
     * </p>
     * <p>
     * To view the job's status, refer to <code>CallAnalyticsJobStatus</code>.
     * If the status is <code>COMPLETED</code>, the job is finished. You can
     * find your completed transcript at the URI specified in
     * <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your transcription job
     * failed.
     * </p>
     * <p>
     * If you enabled personally identifiable information (PII) redaction, the
     * redacted transcript appears at the location specified in
     * <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * If you chose to redact the audio in your media file, you can find your
     * redacted media file at the location specified in
     * <code>RedactedMediaFileUri</code>.
     * </p>
     * <p>
     * To get a list of your Call Analytics jobs, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsJobRequest
     * @return A Java Future object containing the response from the
     *         GetCallAnalyticsJob service method, as returned by Amazon
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
    public Future<GetCallAnalyticsJobResult> getCallAnalyticsJobAsync(
            final GetCallAnalyticsJobRequest getCallAnalyticsJobRequest,
            final AsyncHandler<GetCallAnalyticsJobRequest, GetCallAnalyticsJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCallAnalyticsJobResult>() {
            public GetCallAnalyticsJobResult call() throws Exception {
                GetCallAnalyticsJobResult result = null;
                try {
                    result = getCallAnalyticsJob(getCallAnalyticsJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getCallAnalyticsJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides information about the specified medical transcription job.
     * </p>
     * <p>
     * To view the status of the specified medical transcription job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can find the results at
     * the location specified in <code>TranscriptFileUri</code>. If the status
     * is <code>FAILED</code>, <code>FailureReason</code> provides details on
     * why your transcription job failed.
     * </p>
     * <p>
     * To get a list of your medical transcription jobs, use the operation.
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
     * Provides information about the specified medical transcription job.
     * </p>
     * <p>
     * To view the status of the specified medical transcription job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can find the results at
     * the location specified in <code>TranscriptFileUri</code>. If the status
     * is <code>FAILED</code>, <code>FailureReason</code> provides details on
     * why your transcription job failed.
     * </p>
     * <p>
     * To get a list of your medical transcription jobs, use the operation.
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
     * Provides information about the specified custom medical vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom medical vocabulary, check the
     * <code>VocabularyState</code> field. If the status is <code>READY</code>,
     * your custom vocabulary is available to use. If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom medical vocabularies, use the operation.
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
     * Provides information about the specified custom medical vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom medical vocabulary, check the
     * <code>VocabularyState</code> field. If the status is <code>READY</code>,
     * your custom vocabulary is available to use. If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom medical vocabularies, use the operation.
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
     * Provides information about the specified transcription job.
     * </p>
     * <p>
     * To view the status of the specified transcription job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can find the results at
     * the location specified in <code>TranscriptFileUri</code>. If the status
     * is <code>FAILED</code>, <code>FailureReason</code> provides details on
     * why your transcription job failed.
     * </p>
     * <p>
     * If you enabled content redaction, the redacted transcript can be found at
     * the location specified in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * To get a list of your transcription jobs, use the operation.
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
     * Provides information about the specified transcription job.
     * </p>
     * <p>
     * To view the status of the specified transcription job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can find the results at
     * the location specified in <code>TranscriptFileUri</code>. If the status
     * is <code>FAILED</code>, <code>FailureReason</code> provides details on
     * why your transcription job failed.
     * </p>
     * <p>
     * If you enabled content redaction, the redacted transcript can be found at
     * the location specified in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * To get a list of your transcription jobs, use the operation.
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
     * Provides information about the specified custom vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom vocabulary, check the
     * <code>VocabularyState</code> field. If the status is <code>READY</code>,
     * your custom vocabulary is available to use. If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your custom vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom vocabularies, use the operation.
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
     * Provides information about the specified custom vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom vocabulary, check the
     * <code>VocabularyState</code> field. If the status is <code>READY</code>,
     * your custom vocabulary is available to use. If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your custom vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom vocabularies, use the operation.
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
     * Provides information about the specified custom vocabulary filter.
     * </p>
     * <p>
     * To get a list of your custom vocabulary filters, use the operation.
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
     * Provides information about the specified custom vocabulary filter.
     * </p>
     * <p>
     * To get a list of your custom vocabulary filters, use the operation.
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
     * Provides a list of Call Analytics categories, including all rules that
     * make up each category.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics category, use
     * the operation.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @return A Java Future object containing the response from the
     *         ListCallAnalyticsCategories service method, as returned by Amazon
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
    public Future<ListCallAnalyticsCategoriesResult> listCallAnalyticsCategoriesAsync(
            final ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCallAnalyticsCategoriesResult>() {
            public ListCallAnalyticsCategoriesResult call() throws Exception {
                return listCallAnalyticsCategories(listCallAnalyticsCategoriesRequest);
            }
        });
    }

    /**
     * <p>
     * Provides a list of Call Analytics categories, including all rules that
     * make up each category.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics category, use
     * the operation.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @return A Java Future object containing the response from the
     *         ListCallAnalyticsCategories service method, as returned by Amazon
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
    public Future<ListCallAnalyticsCategoriesResult> listCallAnalyticsCategoriesAsync(
            final ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest,
            final AsyncHandler<ListCallAnalyticsCategoriesRequest, ListCallAnalyticsCategoriesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCallAnalyticsCategoriesResult>() {
            public ListCallAnalyticsCategoriesResult call() throws Exception {
                ListCallAnalyticsCategoriesResult result = null;
                try {
                    result = listCallAnalyticsCategories(listCallAnalyticsCategoriesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listCallAnalyticsCategoriesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides a list of Call Analytics jobs that match the specified criteria.
     * If no criteria are specified, all Call Analytics jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics job, use the
     * operation.
     * </p>
     * 
     * @param listCallAnalyticsJobsRequest
     * @return A Java Future object containing the response from the
     *         ListCallAnalyticsJobs service method, as returned by Amazon
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
    public Future<ListCallAnalyticsJobsResult> listCallAnalyticsJobsAsync(
            final ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCallAnalyticsJobsResult>() {
            public ListCallAnalyticsJobsResult call() throws Exception {
                return listCallAnalyticsJobs(listCallAnalyticsJobsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides a list of Call Analytics jobs that match the specified criteria.
     * If no criteria are specified, all Call Analytics jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics job, use the
     * operation.
     * </p>
     * 
     * @param listCallAnalyticsJobsRequest
     * @return A Java Future object containing the response from the
     *         ListCallAnalyticsJobs service method, as returned by Amazon
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
    public Future<ListCallAnalyticsJobsResult> listCallAnalyticsJobsAsync(
            final ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest,
            final AsyncHandler<ListCallAnalyticsJobsRequest, ListCallAnalyticsJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCallAnalyticsJobsResult>() {
            public ListCallAnalyticsJobsResult call() throws Exception {
                ListCallAnalyticsJobsResult result = null;
                try {
                    result = listCallAnalyticsJobs(listCallAnalyticsJobsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listCallAnalyticsJobsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides a list of custom language models that match the specified
     * criteria. If no criteria are specified, all custom language models are
     * returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom language model, use
     * the operation.
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
     * Provides a list of custom language models that match the specified
     * criteria. If no criteria are specified, all custom language models are
     * returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom language model, use
     * the operation.
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
     * Provides a list of medical transcription jobs that match the specified
     * criteria. If no criteria are specified, all medical transcription jobs
     * are returned.
     * </p>
     * <p>
     * To get detailed information about a specific medical transcription job,
     * use the operation.
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
     * Provides a list of medical transcription jobs that match the specified
     * criteria. If no criteria are specified, all medical transcription jobs
     * are returned.
     * </p>
     * <p>
     * To get detailed information about a specific medical transcription job,
     * use the operation.
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
     * Provides a list of custom medical vocabularies that match the specified
     * criteria. If no criteria are specified, all custom medical vocabularies
     * are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom medical vocabulary,
     * use the operation.
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
     * Provides a list of custom medical vocabularies that match the specified
     * criteria. If no criteria are specified, all custom medical vocabularies
     * are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom medical vocabulary,
     * use the operation.
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
     * Lists all tags associated with the specified transcription job,
     * vocabulary, model, or resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws NotFoundException
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
     * Lists all tags associated with the specified transcription job,
     * vocabulary, model, or resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws NotFoundException
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
     * Provides a list of transcription jobs that match the specified criteria.
     * If no criteria are specified, all transcription jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific transcription job, use the
     * operation.
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
     * Provides a list of transcription jobs that match the specified criteria.
     * If no criteria are specified, all transcription jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific transcription job, use the
     * operation.
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
     * Provides a list of custom vocabularies that match the specified criteria.
     * If no criteria are specified, all custom vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary, use the
     * operation.
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
     * Provides a list of custom vocabularies that match the specified criteria.
     * If no criteria are specified, all custom vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary, use the
     * operation.
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
     * Provides a list of custom vocabulary filters that match the specified
     * criteria. If no criteria are specified, all custom vocabularies are
     * returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary filter,
     * use the operation.
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
     * Provides a list of custom vocabulary filters that match the specified
     * criteria. If no criteria are specified, all custom vocabularies are
     * returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary filter,
     * use the operation.
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
     * Transcribes the audio from a customer service call and applies any
     * additional Request Parameters you choose to include in your request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Call Analytics
     * provides you with call characteristics, call summarization, speaker
     * sentiment, and optional redaction of your text transcript and your audio
     * file. You can also apply custom categories to flag specified conditions.
     * To learn more about these features and insights, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/call-analytics.html"
     * >Analyzing call center audio with Call Analytics</a>.
     * </p>
     * <p>
     * If you want to apply categories to your Call Analytics job, you must
     * create them before submitting your job request. Categories cannot be
     * retroactively applied to a job. To create a new category, use the
     * operation. To learn more about Call Analytics categories, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html"
     * >Creating categories for post-call transcriptions</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html"
     * >Creating categories for real-time transcriptions</a>.
     * </p>
     * <p>
     * To make a <code>StartCallAnalyticsJob</code> request, you must first
     * upload your media file into an Amazon S3 bucket; you can then specify the
     * Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for Call Analytics jobs.
     * </p>
     * <p>
     * You must include the following parameters in your
     * <code>StartCallAnalyticsJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making
     * your request. For a list of Amazon Web Services Regions supported with
     * Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html"
     * >Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CallAnalyticsJobName</code>: A custom name that you create for your
     * transcription job that's unique within your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataAccessRoleArn</code>: The Amazon Resource Name (ARN) of an IAM
     * role that has permissions to access the Amazon S3 bucket that contains
     * your input files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code> or
     * <code>RedactedMediaFileUri</code>): The Amazon S3 location of your media
     * file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * With Call Analytics, you can redact the audio contained in your media
     * file by including <code>RedactedMediaFileUri</code>, instead of
     * <code>MediaFileUri</code>, to specify the location of your input audio.
     * If you choose to redact your audio, you can find your redacted media at
     * the location specified in the <code>RedactedMediaFileUri</code> field of
     * your response.
     * </p>
     * </note>
     * 
     * @param startCallAnalyticsJobRequest
     * @return A Java Future object containing the response from the
     *         StartCallAnalyticsJob service method, as returned by Amazon
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
    public Future<StartCallAnalyticsJobResult> startCallAnalyticsJobAsync(
            final StartCallAnalyticsJobRequest startCallAnalyticsJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartCallAnalyticsJobResult>() {
            public StartCallAnalyticsJobResult call() throws Exception {
                return startCallAnalyticsJob(startCallAnalyticsJobRequest);
            }
        });
    }

    /**
     * <p>
     * Transcribes the audio from a customer service call and applies any
     * additional Request Parameters you choose to include in your request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Call Analytics
     * provides you with call characteristics, call summarization, speaker
     * sentiment, and optional redaction of your text transcript and your audio
     * file. You can also apply custom categories to flag specified conditions.
     * To learn more about these features and insights, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/call-analytics.html"
     * >Analyzing call center audio with Call Analytics</a>.
     * </p>
     * <p>
     * If you want to apply categories to your Call Analytics job, you must
     * create them before submitting your job request. Categories cannot be
     * retroactively applied to a job. To create a new category, use the
     * operation. To learn more about Call Analytics categories, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html"
     * >Creating categories for post-call transcriptions</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html"
     * >Creating categories for real-time transcriptions</a>.
     * </p>
     * <p>
     * To make a <code>StartCallAnalyticsJob</code> request, you must first
     * upload your media file into an Amazon S3 bucket; you can then specify the
     * Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for Call Analytics jobs.
     * </p>
     * <p>
     * You must include the following parameters in your
     * <code>StartCallAnalyticsJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making
     * your request. For a list of Amazon Web Services Regions supported with
     * Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html"
     * >Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CallAnalyticsJobName</code>: A custom name that you create for your
     * transcription job that's unique within your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataAccessRoleArn</code>: The Amazon Resource Name (ARN) of an IAM
     * role that has permissions to access the Amazon S3 bucket that contains
     * your input files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code> or
     * <code>RedactedMediaFileUri</code>): The Amazon S3 location of your media
     * file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * With Call Analytics, you can redact the audio contained in your media
     * file by including <code>RedactedMediaFileUri</code>, instead of
     * <code>MediaFileUri</code>, to specify the location of your input audio.
     * If you choose to redact your audio, you can find your redacted media at
     * the location specified in the <code>RedactedMediaFileUri</code> field of
     * your response.
     * </p>
     * </note>
     * 
     * @param startCallAnalyticsJobRequest
     * @return A Java Future object containing the response from the
     *         StartCallAnalyticsJob service method, as returned by Amazon
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
    public Future<StartCallAnalyticsJobResult> startCallAnalyticsJobAsync(
            final StartCallAnalyticsJobRequest startCallAnalyticsJobRequest,
            final AsyncHandler<StartCallAnalyticsJobRequest, StartCallAnalyticsJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartCallAnalyticsJobResult>() {
            public StartCallAnalyticsJobResult call() throws Exception {
                StartCallAnalyticsJobResult result = null;
                try {
                    result = startCallAnalyticsJob(startCallAnalyticsJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startCallAnalyticsJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Transcribes the audio from a medical dictation or conversation and
     * applies any additional Request Parameters you choose to include in your
     * request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Amazon Transcribe
     * Medical provides you with a robust medical vocabulary and, optionally,
     * content identification, which adds flags to personal health information
     * (PHI). To learn more about these features, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works-med.html"
     * >How Amazon Transcribe Medical works</a>.
     * </p>
     * <p>
     * To make a <code>StartMedicalTranscriptionJob</code> request, you must
     * first upload your media file into an Amazon S3 bucket; you can then
     * specify the S3 location of the file using the <code>Media</code>
     * parameter.
     * </p>
     * <p>
     * You must include the following parameters in your
     * <code>StartMedicalTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making
     * your request. For a list of Amazon Web Services Regions supported with
     * Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html"
     * >Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MedicalTranscriptionJobName</code>: A custom name you create for
     * your transcription job that is unique within your Amazon Web Services
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of
     * your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LanguageCode</code>: This must be <code>en-US</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputBucketName</code>: The Amazon S3 bucket where you want your
     * transcript stored. If you want your output stored in a sub-folder of this
     * bucket, you must also include <code>OutputKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Specialty</code>: This must be <code>PRIMARYCARE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>: Choose whether your audio is a conversation or a
     * dictation.
     * </p>
     * </li>
     * </ul>
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
     * Transcribes the audio from a medical dictation or conversation and
     * applies any additional Request Parameters you choose to include in your
     * request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Amazon Transcribe
     * Medical provides you with a robust medical vocabulary and, optionally,
     * content identification, which adds flags to personal health information
     * (PHI). To learn more about these features, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works-med.html"
     * >How Amazon Transcribe Medical works</a>.
     * </p>
     * <p>
     * To make a <code>StartMedicalTranscriptionJob</code> request, you must
     * first upload your media file into an Amazon S3 bucket; you can then
     * specify the S3 location of the file using the <code>Media</code>
     * parameter.
     * </p>
     * <p>
     * You must include the following parameters in your
     * <code>StartMedicalTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making
     * your request. For a list of Amazon Web Services Regions supported with
     * Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html"
     * >Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MedicalTranscriptionJobName</code>: A custom name you create for
     * your transcription job that is unique within your Amazon Web Services
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of
     * your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LanguageCode</code>: This must be <code>en-US</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputBucketName</code>: The Amazon S3 bucket where you want your
     * transcript stored. If you want your output stored in a sub-folder of this
     * bucket, you must also include <code>OutputKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Specialty</code>: This must be <code>PRIMARYCARE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>: Choose whether your audio is a conversation or a
     * dictation.
     * </p>
     * </li>
     * </ul>
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
     * Transcribes the audio from a media file and applies any additional
     * Request Parameters you choose to include in your request.
     * </p>
     * <p>
     * To make a <code>StartTranscriptionJob</code> request, you must first
     * upload your media file into an Amazon S3 bucket; you can then specify the
     * Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * You must include the following parameters in your
     * <code>StartTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making
     * your request. For a list of Amazon Web Services Regions supported with
     * Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html"
     * >Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TranscriptionJobName</code>: A custom name you create for your
     * transcription job that is unique within your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of
     * your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * One of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code>: If you know the language of your
     * media file, specify it using the <code>LanguageCode</code> parameter; you
     * can find all valid language codes in the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table. If you don't know the languages spoken in
     * your media, use either <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> and let Amazon Transcribe identify
     * the languages for you.
     * </p>
     * </li>
     * </ul>
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
     * Transcribes the audio from a media file and applies any additional
     * Request Parameters you choose to include in your request.
     * </p>
     * <p>
     * To make a <code>StartTranscriptionJob</code> request, you must first
     * upload your media file into an Amazon S3 bucket; you can then specify the
     * Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * You must include the following parameters in your
     * <code>StartTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making
     * your request. For a list of Amazon Web Services Regions supported with
     * Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html"
     * >Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TranscriptionJobName</code>: A custom name you create for your
     * transcription job that is unique within your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of
     * your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * One of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code>: If you know the language of your
     * media file, specify it using the <code>LanguageCode</code> parameter; you
     * can find all valid language codes in the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table. If you don't know the languages spoken in
     * your media, use either <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> and let Amazon Transcribe identify
     * the languages for you.
     * </p>
     * </li>
     * </ul>
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
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the specified resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Transcribe.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
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
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the specified resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Transcribe.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
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
     * Removes the specified tags from the specified Amazon Transcribe resource.
     * </p>
     * <p>
     * If you include <code>UntagResource</code> in your request, you must also
     * include <code>ResourceArn</code> and <code>TagKeys</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Removes the specified tags from the specified Amazon Transcribe resource.
     * </p>
     * <p>
     * If you include <code>UntagResource</code> in your request, you must also
     * include <code>ResourceArn</code> and <code>TagKeys</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Updates the specified Call Analytics category with new rules. Note that
     * the <code>UpdateCallAnalyticsCategory</code> operation overwrites all
     * existing rules contained in the specified category. You cannot append
     * additional rules onto an existing category.
     * </p>
     * <p>
     * To create a new category, see .
     * </p>
     * 
     * @param updateCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         UpdateCallAnalyticsCategory service method, as returned by Amazon
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
    public Future<UpdateCallAnalyticsCategoryResult> updateCallAnalyticsCategoryAsync(
            final UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateCallAnalyticsCategoryResult>() {
            public UpdateCallAnalyticsCategoryResult call() throws Exception {
                return updateCallAnalyticsCategory(updateCallAnalyticsCategoryRequest);
            }
        });
    }

    /**
     * <p>
     * Updates the specified Call Analytics category with new rules. Note that
     * the <code>UpdateCallAnalyticsCategory</code> operation overwrites all
     * existing rules contained in the specified category. You cannot append
     * additional rules onto an existing category.
     * </p>
     * <p>
     * To create a new category, see .
     * </p>
     * 
     * @param updateCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         UpdateCallAnalyticsCategory service method, as returned by Amazon
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
    public Future<UpdateCallAnalyticsCategoryResult> updateCallAnalyticsCategoryAsync(
            final UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest,
            final AsyncHandler<UpdateCallAnalyticsCategoryRequest, UpdateCallAnalyticsCategoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateCallAnalyticsCategoryResult>() {
            public UpdateCallAnalyticsCategoryResult call() throws Exception {
                UpdateCallAnalyticsCategoryResult result = null;
                try {
                    result = updateCallAnalyticsCategory(updateCallAnalyticsCategoryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateCallAnalyticsCategoryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates an existing custom medical vocabulary with new values. This
     * operation overwrites all existing information with your new values; you
     * cannot append new terms onto an existing custom vocabulary.
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
     * Updates an existing custom medical vocabulary with new values. This
     * operation overwrites all existing information with your new values; you
     * cannot append new terms onto an existing custom vocabulary.
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
     * Updates an existing custom vocabulary with new values. This operation
     * overwrites all existing information with your new values; you cannot
     * append new terms onto an existing custom vocabulary.
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
     * Updates an existing custom vocabulary with new values. This operation
     * overwrites all existing information with your new values; you cannot
     * append new terms onto an existing custom vocabulary.
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
     * Updates an existing custom vocabulary filter with a new list of words.
     * The new list you provide overwrites all previous entries; you cannot
     * append new terms onto an existing custom vocabulary filter.
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
     * Updates an existing custom vocabulary filter with a new list of words.
     * The new list you provide overwrites all previous entries; you cannot
     * append new terms onto an existing custom vocabulary filter.
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
