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

package com.amazonaws.services.comprehend;

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

import com.amazonaws.services.comprehend.model.*;

/**
 * Interface for accessing Amazon Comprehend asynchronously.
 * <p>
 * Amazon Comprehend is an AWS service for gaining insight into the content of
 * documents. Use these actions to determine the topics contained in your
 * documents, the topics they discuss, the predominant sentiment expressed in
 * them, the predominant language used, and more.
 * </p>
 **/
public class AmazonComprehendAsyncClient extends AmazonComprehendClient implements
        AmazonComprehendAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Comprehend. A credentials provider chain will be used that searches for
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
    public AmazonComprehendAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Comprehend. A credentials provider chain will be used that searches for
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
     *            how this client connects to Amazon Comprehend (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonComprehendAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Comprehend using the specified AWS account credentials. Default client
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
    public AmazonComprehendAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Comprehend using the specified AWS account credentials and executor
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
    public AmazonComprehendAsyncClient(AWSCredentials awsCredentials,
            ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Comprehend using the specified AWS account credentials, executor service,
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
    public AmazonComprehendAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Comprehend using the specified AWS account credentials provider. Default
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
    public AmazonComprehendAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Comprehend using the specified AWS account credentials provider and
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
    public AmazonComprehendAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Comprehend using the specified AWS account credentials provider and
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
    public AmazonComprehendAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Comprehend using the specified AWS account credentials provider, executor
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
    public AmazonComprehendAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Determines the dominant language of the input text for a batch of
     * documents. For a list of languages that Amazon Comprehend can detect, see
     * <a href=
     * "http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(
            final BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDetectDominantLanguageResult>() {
            public BatchDetectDominantLanguageResult call() throws Exception {
                return batchDetectDominantLanguage(batchDetectDominantLanguageRequest);
            }
        });
    }

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of
     * documents. For a list of languages that Amazon Comprehend can detect, see
     * <a href=
     * "http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(
            final BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest,
            final AsyncHandler<BatchDetectDominantLanguageRequest, BatchDetectDominantLanguageResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDetectDominantLanguageResult>() {
            public BatchDetectDominantLanguageResult call() throws Exception {
                BatchDetectDominantLanguageResult result = null;
                try {
                    result = batchDetectDominantLanguage(batchDetectDominantLanguageRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchDetectDominantLanguageRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Inspects the text of a batch of documents for named entities and returns
     * information about them. For more information about named entities, see
     * <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(
            final BatchDetectEntitiesRequest batchDetectEntitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDetectEntitiesResult>() {
            public BatchDetectEntitiesResult call() throws Exception {
                return batchDetectEntities(batchDetectEntitiesRequest);
            }
        });
    }

    /**
     * <p>
     * Inspects the text of a batch of documents for named entities and returns
     * information about them. For more information about named entities, see
     * <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(
            final BatchDetectEntitiesRequest batchDetectEntitiesRequest,
            final AsyncHandler<BatchDetectEntitiesRequest, BatchDetectEntitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDetectEntitiesResult>() {
            public BatchDetectEntitiesResult call() throws Exception {
                BatchDetectEntitiesResult result = null;
                try {
                    result = batchDetectEntities(batchDetectEntitiesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchDetectEntitiesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectKeyPhrases service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(
            final BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDetectKeyPhrasesResult>() {
            public BatchDetectKeyPhrasesResult call() throws Exception {
                return batchDetectKeyPhrases(batchDetectKeyPhrasesRequest);
            }
        });
    }

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectKeyPhrases service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(
            final BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest,
            final AsyncHandler<BatchDetectKeyPhrasesRequest, BatchDetectKeyPhrasesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDetectKeyPhrasesResult>() {
            public BatchDetectKeyPhrasesResult call() throws Exception {
                BatchDetectKeyPhrasesResult result = null;
                try {
                    result = batchDetectKeyPhrases(batchDetectKeyPhrasesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchDetectKeyPhrasesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing
     * sentiment, <code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectSentiment service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectSentimentResult> batchDetectSentimentAsync(
            final BatchDetectSentimentRequest batchDetectSentimentRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDetectSentimentResult>() {
            public BatchDetectSentimentResult call() throws Exception {
                return batchDetectSentiment(batchDetectSentimentRequest);
            }
        });
    }

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing
     * sentiment, <code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectSentiment service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectSentimentResult> batchDetectSentimentAsync(
            final BatchDetectSentimentRequest batchDetectSentimentRequest,
            final AsyncHandler<BatchDetectSentimentRequest, BatchDetectSentimentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDetectSentimentResult>() {
            public BatchDetectSentimentResult call() throws Exception {
                BatchDetectSentimentResult result = null;
                try {
                    result = batchDetectSentiment(batchDetectSentimentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchDetectSentimentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Inspects the text of a batch of documents for the syntax and part of
     * speech of the words in the document and returns information about them.
     * For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @param batchDetectSyntaxRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectSyntax service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(
            final BatchDetectSyntaxRequest batchDetectSyntaxRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<BatchDetectSyntaxResult>() {
            public BatchDetectSyntaxResult call() throws Exception {
                return batchDetectSyntax(batchDetectSyntaxRequest);
            }
        });
    }

    /**
     * <p>
     * Inspects the text of a batch of documents for the syntax and part of
     * speech of the words in the document and returns information about them.
     * For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @param batchDetectSyntaxRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectSyntax service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(
            final BatchDetectSyntaxRequest batchDetectSyntaxRequest,
            final AsyncHandler<BatchDetectSyntaxRequest, BatchDetectSyntaxResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchDetectSyntaxResult>() {
            public BatchDetectSyntaxResult call() throws Exception {
                BatchDetectSyntaxResult result = null;
                try {
                    result = batchDetectSyntax(batchDetectSyntaxRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(batchDetectSyntaxRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new document classifier that you can use to categorize
     * documents. To create a classifier you provide a set of training documents
     * that labeled with the categories that you want to use. After the
     * classifier is trained you can use it to categorize a set of labeled
     * documents into the categories.
     * </p>
     * 
     * @param createDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         CreateDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateDocumentClassifierResult> createDocumentClassifierAsync(
            final CreateDocumentClassifierRequest createDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDocumentClassifierResult>() {
            public CreateDocumentClassifierResult call() throws Exception {
                return createDocumentClassifier(createDocumentClassifierRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new document classifier that you can use to categorize
     * documents. To create a classifier you provide a set of training documents
     * that labeled with the categories that you want to use. After the
     * classifier is trained you can use it to categorize a set of labeled
     * documents into the categories.
     * </p>
     * 
     * @param createDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         CreateDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateDocumentClassifierResult> createDocumentClassifierAsync(
            final CreateDocumentClassifierRequest createDocumentClassifierRequest,
            final AsyncHandler<CreateDocumentClassifierRequest, CreateDocumentClassifierResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDocumentClassifierResult>() {
            public CreateDocumentClassifierResult call() throws Exception {
                CreateDocumentClassifierResult result = null;
                try {
                    result = createDocumentClassifier(createDocumentClassifierRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createDocumentClassifierRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates an entity recognizer using submitted files. After your
     * <code>CreateEntityRecognizer</code> request is submitted, you can check
     * job status using the API.
     * </p>
     * 
     * @param createEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         CreateEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateEntityRecognizerResult> createEntityRecognizerAsync(
            final CreateEntityRecognizerRequest createEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEntityRecognizerResult>() {
            public CreateEntityRecognizerResult call() throws Exception {
                return createEntityRecognizer(createEntityRecognizerRequest);
            }
        });
    }

    /**
     * <p>
     * Creates an entity recognizer using submitted files. After your
     * <code>CreateEntityRecognizer</code> request is submitted, you can check
     * job status using the API.
     * </p>
     * 
     * @param createEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         CreateEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<CreateEntityRecognizerResult> createEntityRecognizerAsync(
            final CreateEntityRecognizerRequest createEntityRecognizerRequest,
            final AsyncHandler<CreateEntityRecognizerRequest, CreateEntityRecognizerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateEntityRecognizerResult>() {
            public CreateEntityRecognizerResult call() throws Exception {
                CreateEntityRecognizerResult result = null;
                try {
                    result = createEntityRecognizer(createEntityRecognizerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createEntityRecognizerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a previously created document classifier
     * </p>
     * <p>
     * Only those classifiers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the classifier into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * classifier disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         DeleteDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteDocumentClassifierResult> deleteDocumentClassifierAsync(
            final DeleteDocumentClassifierRequest deleteDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDocumentClassifierResult>() {
            public DeleteDocumentClassifierResult call() throws Exception {
                return deleteDocumentClassifier(deleteDocumentClassifierRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a previously created document classifier
     * </p>
     * <p>
     * Only those classifiers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the classifier into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * classifier disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         DeleteDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteDocumentClassifierResult> deleteDocumentClassifierAsync(
            final DeleteDocumentClassifierRequest deleteDocumentClassifierRequest,
            final AsyncHandler<DeleteDocumentClassifierRequest, DeleteDocumentClassifierResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDocumentClassifierResult>() {
            public DeleteDocumentClassifierResult call() throws Exception {
                DeleteDocumentClassifierResult result = null;
                try {
                    result = deleteDocumentClassifier(deleteDocumentClassifierRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteDocumentClassifierRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes an entity recognizer.
     * </p>
     * <p>
     * Only those recognizers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the recognizer into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * recognizer disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         DeleteEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteEntityRecognizerResult> deleteEntityRecognizerAsync(
            final DeleteEntityRecognizerRequest deleteEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteEntityRecognizerResult>() {
            public DeleteEntityRecognizerResult call() throws Exception {
                return deleteEntityRecognizer(deleteEntityRecognizerRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes an entity recognizer.
     * </p>
     * <p>
     * Only those recognizers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the recognizer into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * recognizer disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         DeleteEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DeleteEntityRecognizerResult> deleteEntityRecognizerAsync(
            final DeleteEntityRecognizerRequest deleteEntityRecognizerRequest,
            final AsyncHandler<DeleteEntityRecognizerRequest, DeleteEntityRecognizerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteEntityRecognizerResult>() {
            public DeleteEntityRecognizerResult call() throws Exception {
                DeleteEntityRecognizerResult result = null;
                try {
                    result = deleteEntityRecognizer(deleteEntityRecognizerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteEntityRecognizerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a document classification job. Use
     * this operation to get the status of a classification job.
     * </p>
     * 
     * @param describeDocumentClassificationJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeDocumentClassificationJobResult> describeDocumentClassificationJobAsync(
            final DescribeDocumentClassificationJobRequest describeDocumentClassificationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentClassificationJobResult>() {
            public DescribeDocumentClassificationJobResult call() throws Exception {
                return describeDocumentClassificationJob(describeDocumentClassificationJobRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a document classification job. Use
     * this operation to get the status of a classification job.
     * </p>
     * 
     * @param describeDocumentClassificationJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeDocumentClassificationJobResult> describeDocumentClassificationJobAsync(
            final DescribeDocumentClassificationJobRequest describeDocumentClassificationJobRequest,
            final AsyncHandler<DescribeDocumentClassificationJobRequest, DescribeDocumentClassificationJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentClassificationJobResult>() {
            public DescribeDocumentClassificationJobResult call() throws Exception {
                DescribeDocumentClassificationJobResult result = null;
                try {
                    result = describeDocumentClassificationJob(describeDocumentClassificationJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeDocumentClassificationJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a document classifier.
     * </p>
     * 
     * @param describeDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeDocumentClassifierResult> describeDocumentClassifierAsync(
            final DescribeDocumentClassifierRequest describeDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentClassifierResult>() {
            public DescribeDocumentClassifierResult call() throws Exception {
                return describeDocumentClassifier(describeDocumentClassifierRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a document classifier.
     * </p>
     * 
     * @param describeDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeDocumentClassifierResult> describeDocumentClassifierAsync(
            final DescribeDocumentClassifierRequest describeDocumentClassifierRequest,
            final AsyncHandler<DescribeDocumentClassifierRequest, DescribeDocumentClassifierResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentClassifierResult>() {
            public DescribeDocumentClassifierResult call() throws Exception {
                DescribeDocumentClassifierResult result = null;
                try {
                    result = describeDocumentClassifier(describeDocumentClassifierRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeDocumentClassifierRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a dominant language detection job.
     * Use this operation to get the status of a detection job.
     * </p>
     * 
     * @param describeDominantLanguageDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeDominantLanguageDetectionJob service method, as returned
     *         by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            final DescribeDominantLanguageDetectionJobRequest describeDominantLanguageDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDominantLanguageDetectionJobResult>() {
            public DescribeDominantLanguageDetectionJobResult call() throws Exception {
                return describeDominantLanguageDetectionJob(describeDominantLanguageDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a dominant language detection job.
     * Use this operation to get the status of a detection job.
     * </p>
     * 
     * @param describeDominantLanguageDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeDominantLanguageDetectionJob service method, as returned
     *         by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            final DescribeDominantLanguageDetectionJobRequest describeDominantLanguageDetectionJobRequest,
            final AsyncHandler<DescribeDominantLanguageDetectionJobRequest, DescribeDominantLanguageDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDominantLanguageDetectionJobResult>() {
            public DescribeDominantLanguageDetectionJobResult call() throws Exception {
                DescribeDominantLanguageDetectionJobResult result = null;
                try {
                    result = describeDominantLanguageDetectionJob(describeDominantLanguageDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeDominantLanguageDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with an entities detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(
            final DescribeEntitiesDetectionJobRequest describeEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEntitiesDetectionJobResult>() {
            public DescribeEntitiesDetectionJobResult call() throws Exception {
                return describeEntitiesDetectionJob(describeEntitiesDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with an entities detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(
            final DescribeEntitiesDetectionJobRequest describeEntitiesDetectionJobRequest,
            final AsyncHandler<DescribeEntitiesDetectionJobRequest, DescribeEntitiesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEntitiesDetectionJobResult>() {
            public DescribeEntitiesDetectionJobResult call() throws Exception {
                DescribeEntitiesDetectionJobResult result = null;
                try {
                    result = describeEntitiesDetectionJob(describeEntitiesDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeEntitiesDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides details about an entity recognizer including status, S3 buckets
     * containing training data, recognizer metadata, metrics, and so on.
     * </p>
     * 
     * @param describeEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         DescribeEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeEntityRecognizerResult> describeEntityRecognizerAsync(
            final DescribeEntityRecognizerRequest describeEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEntityRecognizerResult>() {
            public DescribeEntityRecognizerResult call() throws Exception {
                return describeEntityRecognizer(describeEntityRecognizerRequest);
            }
        });
    }

    /**
     * <p>
     * Provides details about an entity recognizer including status, S3 buckets
     * containing training data, recognizer metadata, metrics, and so on.
     * </p>
     * 
     * @param describeEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         DescribeEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeEntityRecognizerResult> describeEntityRecognizerAsync(
            final DescribeEntityRecognizerRequest describeEntityRecognizerRequest,
            final AsyncHandler<DescribeEntityRecognizerRequest, DescribeEntityRecognizerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEntityRecognizerResult>() {
            public DescribeEntityRecognizerResult call() throws Exception {
                DescribeEntityRecognizerResult result = null;
                try {
                    result = describeEntityRecognizer(describeEntityRecognizerRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeEntityRecognizerRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a key phrases detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeKeyPhrasesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeKeyPhrasesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(
            final DescribeKeyPhrasesDetectionJobRequest describeKeyPhrasesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeKeyPhrasesDetectionJobResult>() {
            public DescribeKeyPhrasesDetectionJobResult call() throws Exception {
                return describeKeyPhrasesDetectionJob(describeKeyPhrasesDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a key phrases detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeKeyPhrasesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeKeyPhrasesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(
            final DescribeKeyPhrasesDetectionJobRequest describeKeyPhrasesDetectionJobRequest,
            final AsyncHandler<DescribeKeyPhrasesDetectionJobRequest, DescribeKeyPhrasesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeKeyPhrasesDetectionJobResult>() {
            public DescribeKeyPhrasesDetectionJobResult call() throws Exception {
                DescribeKeyPhrasesDetectionJobResult result = null;
                try {
                    result = describeKeyPhrasesDetectionJob(describeKeyPhrasesDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeKeyPhrasesDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a sentiment detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeSentimentDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(
            final DescribeSentimentDetectionJobRequest describeSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSentimentDetectionJobResult>() {
            public DescribeSentimentDetectionJobResult call() throws Exception {
                return describeSentimentDetectionJob(describeSentimentDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a sentiment detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeSentimentDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(
            final DescribeSentimentDetectionJobRequest describeSentimentDetectionJobRequest,
            final AsyncHandler<DescribeSentimentDetectionJobRequest, DescribeSentimentDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSentimentDetectionJobResult>() {
            public DescribeSentimentDetectionJobResult call() throws Exception {
                DescribeSentimentDetectionJobResult result = null;
                try {
                    result = describeSentimentDetectionJob(describeSentimentDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeSentimentDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(
            final DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTopicsDetectionJobResult>() {
            public DescribeTopicsDetectionJobResult call() throws Exception {
                return describeTopicsDetectionJob(describeTopicsDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(
            final DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest,
            final AsyncHandler<DescribeTopicsDetectionJobRequest, DescribeTopicsDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTopicsDetectionJobResult>() {
            public DescribeTopicsDetectionJobResult call() throws Exception {
                DescribeTopicsDetectionJobResult result = null;
                try {
                    result = describeTopicsDetectionJob(describeTopicsDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeTopicsDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of
     * languages that Amazon Comprehend can detect, see <a href=
     * "http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @return A Java Future object containing the response from the
     *         DetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectDominantLanguageResult> detectDominantLanguageAsync(
            final DetectDominantLanguageRequest detectDominantLanguageRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetectDominantLanguageResult>() {
            public DetectDominantLanguageResult call() throws Exception {
                return detectDominantLanguage(detectDominantLanguageRequest);
            }
        });
    }

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of
     * languages that Amazon Comprehend can detect, see <a href=
     * "http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @return A Java Future object containing the response from the
     *         DetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectDominantLanguageResult> detectDominantLanguageAsync(
            final DetectDominantLanguageRequest detectDominantLanguageRequest,
            final AsyncHandler<DetectDominantLanguageRequest, DetectDominantLanguageResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetectDominantLanguageResult>() {
            public DetectDominantLanguageResult call() throws Exception {
                DetectDominantLanguageResult result = null;
                try {
                    result = detectDominantLanguage(detectDominantLanguageRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detectDominantLanguageRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Inspects text for named entities, and returns information about them. For
     * more information, about named entities, see <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return A Java Future object containing the response from the
     *         DetectEntities service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectEntitiesResult> detectEntitiesAsync(
            final DetectEntitiesRequest detectEntitiesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DetectEntitiesResult>() {
            public DetectEntitiesResult call() throws Exception {
                return detectEntities(detectEntitiesRequest);
            }
        });
    }

    /**
     * <p>
     * Inspects text for named entities, and returns information about them. For
     * more information, about named entities, see <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return A Java Future object containing the response from the
     *         DetectEntities service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectEntitiesResult> detectEntitiesAsync(
            final DetectEntitiesRequest detectEntitiesRequest,
            final AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetectEntitiesResult>() {
            public DetectEntitiesResult call() throws Exception {
                DetectEntitiesResult result = null;
                try {
                    result = detectEntities(detectEntitiesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detectEntitiesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @return A Java Future object containing the response from the
     *         DetectKeyPhrases service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(
            final DetectKeyPhrasesRequest detectKeyPhrasesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DetectKeyPhrasesResult>() {
            public DetectKeyPhrasesResult call() throws Exception {
                return detectKeyPhrases(detectKeyPhrasesRequest);
            }
        });
    }

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @return A Java Future object containing the response from the
     *         DetectKeyPhrases service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(
            final DetectKeyPhrasesRequest detectKeyPhrasesRequest,
            final AsyncHandler<DetectKeyPhrasesRequest, DetectKeyPhrasesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetectKeyPhrasesResult>() {
            public DetectKeyPhrasesResult call() throws Exception {
                DetectKeyPhrasesResult result = null;
                try {
                    result = detectKeyPhrases(detectKeyPhrasesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detectKeyPhrasesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (
     * <code>POSITIVE</code>, <code>NEUTRAL</code>, <code>MIXED</code>, or
     * <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @return A Java Future object containing the response from the
     *         DetectSentiment service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectSentimentResult> detectSentimentAsync(
            final DetectSentimentRequest detectSentimentRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DetectSentimentResult>() {
            public DetectSentimentResult call() throws Exception {
                return detectSentiment(detectSentimentRequest);
            }
        });
    }

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (
     * <code>POSITIVE</code>, <code>NEUTRAL</code>, <code>MIXED</code>, or
     * <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @return A Java Future object containing the response from the
     *         DetectSentiment service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectSentimentResult> detectSentimentAsync(
            final DetectSentimentRequest detectSentimentRequest,
            final AsyncHandler<DetectSentimentRequest, DetectSentimentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetectSentimentResult>() {
            public DetectSentimentResult call() throws Exception {
                DetectSentimentResult result = null;
                try {
                    result = detectSentiment(detectSentimentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detectSentimentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Inspects text for syntax and the part of speech of words in the document.
     * For more information, <a>how-syntax</a>.
     * </p>
     * 
     * @param detectSyntaxRequest
     * @return A Java Future object containing the response from the
     *         DetectSyntax service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectSyntaxResult> detectSyntaxAsync(
            final DetectSyntaxRequest detectSyntaxRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DetectSyntaxResult>() {
            public DetectSyntaxResult call() throws Exception {
                return detectSyntax(detectSyntaxRequest);
            }
        });
    }

    /**
     * <p>
     * Inspects text for syntax and the part of speech of words in the document.
     * For more information, <a>how-syntax</a>.
     * </p>
     * 
     * @param detectSyntaxRequest
     * @return A Java Future object containing the response from the
     *         DetectSyntax service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectSyntaxResult> detectSyntaxAsync(
            final DetectSyntaxRequest detectSyntaxRequest,
            final AsyncHandler<DetectSyntaxRequest, DetectSyntaxResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetectSyntaxResult>() {
            public DetectSyntaxResult call() throws Exception {
                DetectSyntaxResult result = null;
                try {
                    result = detectSyntax(detectSyntaxRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detectSyntaxRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets a list of the documentation classification jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDocumentClassificationJobsRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentClassificationJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListDocumentClassificationJobsResult> listDocumentClassificationJobsAsync(
            final ListDocumentClassificationJobsRequest listDocumentClassificationJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDocumentClassificationJobsResult>() {
            public ListDocumentClassificationJobsResult call() throws Exception {
                return listDocumentClassificationJobs(listDocumentClassificationJobsRequest);
            }
        });
    }

    /**
     * <p>
     * Gets a list of the documentation classification jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDocumentClassificationJobsRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentClassificationJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListDocumentClassificationJobsResult> listDocumentClassificationJobsAsync(
            final ListDocumentClassificationJobsRequest listDocumentClassificationJobsRequest,
            final AsyncHandler<ListDocumentClassificationJobsRequest, ListDocumentClassificationJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDocumentClassificationJobsResult>() {
            public ListDocumentClassificationJobsResult call() throws Exception {
                ListDocumentClassificationJobsResult result = null;
                try {
                    result = listDocumentClassificationJobs(listDocumentClassificationJobsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listDocumentClassificationJobsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets a list of the document classifiers that you have created.
     * </p>
     * 
     * @param listDocumentClassifiersRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentClassifiers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListDocumentClassifiersResult> listDocumentClassifiersAsync(
            final ListDocumentClassifiersRequest listDocumentClassifiersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDocumentClassifiersResult>() {
            public ListDocumentClassifiersResult call() throws Exception {
                return listDocumentClassifiers(listDocumentClassifiersRequest);
            }
        });
    }

    /**
     * <p>
     * Gets a list of the document classifiers that you have created.
     * </p>
     * 
     * @param listDocumentClassifiersRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentClassifiers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListDocumentClassifiersResult> listDocumentClassifiersAsync(
            final ListDocumentClassifiersRequest listDocumentClassifiersRequest,
            final AsyncHandler<ListDocumentClassifiersRequest, ListDocumentClassifiersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDocumentClassifiersResult>() {
            public ListDocumentClassifiersResult call() throws Exception {
                ListDocumentClassifiersResult result = null;
                try {
                    result = listDocumentClassifiers(listDocumentClassifiersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listDocumentClassifiersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets a list of the dominant language detection jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDominantLanguageDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListDominantLanguageDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            final ListDominantLanguageDetectionJobsRequest listDominantLanguageDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDominantLanguageDetectionJobsResult>() {
            public ListDominantLanguageDetectionJobsResult call() throws Exception {
                return listDominantLanguageDetectionJobs(listDominantLanguageDetectionJobsRequest);
            }
        });
    }

    /**
     * <p>
     * Gets a list of the dominant language detection jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDominantLanguageDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListDominantLanguageDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            final ListDominantLanguageDetectionJobsRequest listDominantLanguageDetectionJobsRequest,
            final AsyncHandler<ListDominantLanguageDetectionJobsRequest, ListDominantLanguageDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDominantLanguageDetectionJobsResult>() {
            public ListDominantLanguageDetectionJobsResult call() throws Exception {
                ListDominantLanguageDetectionJobsResult result = null;
                try {
                    result = listDominantLanguageDetectionJobs(listDominantLanguageDetectionJobsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listDominantLanguageDetectionJobsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets a list of the entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListEntitiesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(
            final ListEntitiesDetectionJobsRequest listEntitiesDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEntitiesDetectionJobsResult>() {
            public ListEntitiesDetectionJobsResult call() throws Exception {
                return listEntitiesDetectionJobs(listEntitiesDetectionJobsRequest);
            }
        });
    }

    /**
     * <p>
     * Gets a list of the entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListEntitiesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(
            final ListEntitiesDetectionJobsRequest listEntitiesDetectionJobsRequest,
            final AsyncHandler<ListEntitiesDetectionJobsRequest, ListEntitiesDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEntitiesDetectionJobsResult>() {
            public ListEntitiesDetectionJobsResult call() throws Exception {
                ListEntitiesDetectionJobsResult result = null;
                try {
                    result = listEntitiesDetectionJobs(listEntitiesDetectionJobsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listEntitiesDetectionJobsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets a list of the properties of all entity recognizers that you created,
     * including recognizers currently in training. Allows you to filter the
     * list of recognizers based on criteria such as status and submission time.
     * This call returns up to 500 entity recognizers in the list, with a
     * default number of 100 recognizers in the list.
     * </p>
     * <p>
     * The results of this list are not in any particular order. Please get the
     * list and sort locally if needed.
     * </p>
     * 
     * @param listEntityRecognizersRequest
     * @return A Java Future object containing the response from the
     *         ListEntityRecognizers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListEntityRecognizersResult> listEntityRecognizersAsync(
            final ListEntityRecognizersRequest listEntityRecognizersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEntityRecognizersResult>() {
            public ListEntityRecognizersResult call() throws Exception {
                return listEntityRecognizers(listEntityRecognizersRequest);
            }
        });
    }

    /**
     * <p>
     * Gets a list of the properties of all entity recognizers that you created,
     * including recognizers currently in training. Allows you to filter the
     * list of recognizers based on criteria such as status and submission time.
     * This call returns up to 500 entity recognizers in the list, with a
     * default number of 100 recognizers in the list.
     * </p>
     * <p>
     * The results of this list are not in any particular order. Please get the
     * list and sort locally if needed.
     * </p>
     * 
     * @param listEntityRecognizersRequest
     * @return A Java Future object containing the response from the
     *         ListEntityRecognizers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListEntityRecognizersResult> listEntityRecognizersAsync(
            final ListEntityRecognizersRequest listEntityRecognizersRequest,
            final AsyncHandler<ListEntityRecognizersRequest, ListEntityRecognizersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEntityRecognizersResult>() {
            public ListEntityRecognizersResult call() throws Exception {
                ListEntityRecognizersResult result = null;
                try {
                    result = listEntityRecognizers(listEntityRecognizersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listEntityRecognizersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Get a list of key phrase detection jobs that you have submitted.
     * </p>
     * 
     * @param listKeyPhrasesDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListKeyPhrasesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(
            final ListKeyPhrasesDetectionJobsRequest listKeyPhrasesDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListKeyPhrasesDetectionJobsResult>() {
            public ListKeyPhrasesDetectionJobsResult call() throws Exception {
                return listKeyPhrasesDetectionJobs(listKeyPhrasesDetectionJobsRequest);
            }
        });
    }

    /**
     * <p>
     * Get a list of key phrase detection jobs that you have submitted.
     * </p>
     * 
     * @param listKeyPhrasesDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListKeyPhrasesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(
            final ListKeyPhrasesDetectionJobsRequest listKeyPhrasesDetectionJobsRequest,
            final AsyncHandler<ListKeyPhrasesDetectionJobsRequest, ListKeyPhrasesDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListKeyPhrasesDetectionJobsResult>() {
            public ListKeyPhrasesDetectionJobsResult call() throws Exception {
                ListKeyPhrasesDetectionJobsResult result = null;
                try {
                    result = listKeyPhrasesDetectionJobs(listKeyPhrasesDetectionJobsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listKeyPhrasesDetectionJobsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets a list of sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listSentimentDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListSentimentDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(
            final ListSentimentDetectionJobsRequest listSentimentDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSentimentDetectionJobsResult>() {
            public ListSentimentDetectionJobsResult call() throws Exception {
                return listSentimentDetectionJobs(listSentimentDetectionJobsRequest);
            }
        });
    }

    /**
     * <p>
     * Gets a list of sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listSentimentDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListSentimentDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(
            final ListSentimentDetectionJobsRequest listSentimentDetectionJobsRequest,
            final AsyncHandler<ListSentimentDetectionJobsRequest, ListSentimentDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSentimentDetectionJobsResult>() {
            public ListSentimentDetectionJobsResult call() throws Exception {
                ListSentimentDetectionJobsResult result = null;
                try {
                    result = listSentimentDetectionJobs(listSentimentDetectionJobsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listSentimentDetectionJobsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListTopicsDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(
            final ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTopicsDetectionJobsResult>() {
            public ListTopicsDetectionJobsResult call() throws Exception {
                return listTopicsDetectionJobs(listTopicsDetectionJobsRequest);
            }
        });
    }

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListTopicsDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(
            final ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest,
            final AsyncHandler<ListTopicsDetectionJobsRequest, ListTopicsDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTopicsDetectionJobsResult>() {
            public ListTopicsDetectionJobsResult call() throws Exception {
                ListTopicsDetectionJobsResult result = null;
                try {
                    result = listTopicsDetectionJobs(listTopicsDetectionJobsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTopicsDetectionJobsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous document classification job. Use the operation to
     * track the progress of the job.
     * </p>
     * 
     * @param startDocumentClassificationJobRequest
     * @return A Java Future object containing the response from the
     *         StartDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartDocumentClassificationJobResult> startDocumentClassificationJobAsync(
            final StartDocumentClassificationJobRequest startDocumentClassificationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartDocumentClassificationJobResult>() {
            public StartDocumentClassificationJobResult call() throws Exception {
                return startDocumentClassificationJob(startDocumentClassificationJobRequest);
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous document classification job. Use the operation to
     * track the progress of the job.
     * </p>
     * 
     * @param startDocumentClassificationJobRequest
     * @return A Java Future object containing the response from the
     *         StartDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartDocumentClassificationJobResult> startDocumentClassificationJobAsync(
            final StartDocumentClassificationJobRequest startDocumentClassificationJobRequest,
            final AsyncHandler<StartDocumentClassificationJobRequest, StartDocumentClassificationJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartDocumentClassificationJobResult>() {
            public StartDocumentClassificationJobResult call() throws Exception {
                StartDocumentClassificationJobResult result = null;
                try {
                    result = startDocumentClassificationJob(startDocumentClassificationJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startDocumentClassificationJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous dominant language detection job for a collection
     * of documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startDominantLanguageDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            final StartDominantLanguageDetectionJobRequest startDominantLanguageDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartDominantLanguageDetectionJobResult>() {
            public StartDominantLanguageDetectionJobResult call() throws Exception {
                return startDominantLanguageDetectionJob(startDominantLanguageDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous dominant language detection job for a collection
     * of documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startDominantLanguageDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            final StartDominantLanguageDetectionJobRequest startDominantLanguageDetectionJobRequest,
            final AsyncHandler<StartDominantLanguageDetectionJobRequest, StartDominantLanguageDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartDominantLanguageDetectionJobResult>() {
            public StartDominantLanguageDetectionJobResult call() throws Exception {
                StartDominantLanguageDetectionJobResult result = null;
                try {
                    result = startDominantLanguageDetectionJob(startDominantLanguageDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startDominantLanguageDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous entity detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * <p>
     * This API can be used for either standard entity detection or custom
     * entity recognition. In order to be used for custom entity recognition,
     * the optional <code>EntityRecognizerArn</code> must be used in order to
     * provide access to the recognizer being used to detect the custom entity.
     * </p>
     * 
     * @param startEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(
            final StartEntitiesDetectionJobRequest startEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartEntitiesDetectionJobResult>() {
            public StartEntitiesDetectionJobResult call() throws Exception {
                return startEntitiesDetectionJob(startEntitiesDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous entity detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * <p>
     * This API can be used for either standard entity detection or custom
     * entity recognition. In order to be used for custom entity recognition,
     * the optional <code>EntityRecognizerArn</code> must be used in order to
     * provide access to the recognizer being used to detect the custom entity.
     * </p>
     * 
     * @param startEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(
            final StartEntitiesDetectionJobRequest startEntitiesDetectionJobRequest,
            final AsyncHandler<StartEntitiesDetectionJobRequest, StartEntitiesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartEntitiesDetectionJobResult>() {
            public StartEntitiesDetectionJobResult call() throws Exception {
                StartEntitiesDetectionJobResult result = null;
                try {
                    result = startEntitiesDetectionJob(startEntitiesDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startEntitiesDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous key phrase detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startKeyPhrasesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(
            final StartKeyPhrasesDetectionJobRequest startKeyPhrasesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartKeyPhrasesDetectionJobResult>() {
            public StartKeyPhrasesDetectionJobResult call() throws Exception {
                return startKeyPhrasesDetectionJob(startKeyPhrasesDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous key phrase detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startKeyPhrasesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(
            final StartKeyPhrasesDetectionJobRequest startKeyPhrasesDetectionJobRequest,
            final AsyncHandler<StartKeyPhrasesDetectionJobRequest, StartKeyPhrasesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartKeyPhrasesDetectionJobResult>() {
            public StartKeyPhrasesDetectionJobResult call() throws Exception {
                StartKeyPhrasesDetectionJobResult result = null;
                try {
                    result = startKeyPhrasesDetectionJob(startKeyPhrasesDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startKeyPhrasesDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous sentiment detection job for a collection of
     * documents. use the operation to track the status of a job.
     * </p>
     * 
     * @param startSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(
            final StartSentimentDetectionJobRequest startSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartSentimentDetectionJobResult>() {
            public StartSentimentDetectionJobResult call() throws Exception {
                return startSentimentDetectionJob(startSentimentDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous sentiment detection job for a collection of
     * documents. use the operation to track the status of a job.
     * </p>
     * 
     * @param startSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(
            final StartSentimentDetectionJobRequest startSentimentDetectionJobRequest,
            final AsyncHandler<StartSentimentDetectionJobRequest, StartSentimentDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartSentimentDetectionJobResult>() {
            public StartSentimentDetectionJobResult call() throws Exception {
                StartSentimentDetectionJobResult result = null;
                try {
                    result = startSentimentDetectionJob(startSentimentDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startSentimentDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the
     * <code>DescribeTopicDetectionJob</code> operation to track the status of a
     * job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(
            final StartTopicsDetectionJobRequest startTopicsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartTopicsDetectionJobResult>() {
            public StartTopicsDetectionJobResult call() throws Exception {
                return startTopicsDetectionJob(startTopicsDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the
     * <code>DescribeTopicDetectionJob</code> operation to track the status of a
     * job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(
            final StartTopicsDetectionJobRequest startTopicsDetectionJobRequest,
            final AsyncHandler<StartTopicsDetectionJobRequest, StartTopicsDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartTopicsDetectionJobResult>() {
            public StartTopicsDetectionJobResult call() throws Exception {
                StartTopicsDetectionJobResult result = null;
                try {
                    result = startTopicsDetectionJob(startTopicsDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startTopicsDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Stops a dominant language detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopDominantLanguageDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            final StopDominantLanguageDetectionJobRequest stopDominantLanguageDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopDominantLanguageDetectionJobResult>() {
            public StopDominantLanguageDetectionJobResult call() throws Exception {
                return stopDominantLanguageDetectionJob(stopDominantLanguageDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Stops a dominant language detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopDominantLanguageDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            final StopDominantLanguageDetectionJobRequest stopDominantLanguageDetectionJobRequest,
            final AsyncHandler<StopDominantLanguageDetectionJobRequest, StopDominantLanguageDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopDominantLanguageDetectionJobResult>() {
            public StopDominantLanguageDetectionJobResult call() throws Exception {
                StopDominantLanguageDetectionJobResult result = null;
                try {
                    result = stopDominantLanguageDetectionJob(stopDominantLanguageDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(stopDominantLanguageDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Stops an entities detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(
            final StopEntitiesDetectionJobRequest stopEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopEntitiesDetectionJobResult>() {
            public StopEntitiesDetectionJobResult call() throws Exception {
                return stopEntitiesDetectionJob(stopEntitiesDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Stops an entities detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(
            final StopEntitiesDetectionJobRequest stopEntitiesDetectionJobRequest,
            final AsyncHandler<StopEntitiesDetectionJobRequest, StopEntitiesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopEntitiesDetectionJobResult>() {
            public StopEntitiesDetectionJobResult call() throws Exception {
                StopEntitiesDetectionJobResult result = null;
                try {
                    result = stopEntitiesDetectionJob(stopEntitiesDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(stopEntitiesDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Stops a key phrases detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopKeyPhrasesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(
            final StopKeyPhrasesDetectionJobRequest stopKeyPhrasesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopKeyPhrasesDetectionJobResult>() {
            public StopKeyPhrasesDetectionJobResult call() throws Exception {
                return stopKeyPhrasesDetectionJob(stopKeyPhrasesDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Stops a key phrases detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopKeyPhrasesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(
            final StopKeyPhrasesDetectionJobRequest stopKeyPhrasesDetectionJobRequest,
            final AsyncHandler<StopKeyPhrasesDetectionJobRequest, StopKeyPhrasesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopKeyPhrasesDetectionJobResult>() {
            public StopKeyPhrasesDetectionJobResult call() throws Exception {
                StopKeyPhrasesDetectionJobResult result = null;
                try {
                    result = stopKeyPhrasesDetectionJob(stopKeyPhrasesDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(stopKeyPhrasesDetectionJobRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Stops a sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put
     * into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(
            final StopSentimentDetectionJobRequest stopSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopSentimentDetectionJobResult>() {
            public StopSentimentDetectionJobResult call() throws Exception {
                return stopSentimentDetectionJob(stopSentimentDetectionJobRequest);
            }
        });
    }

    /**
     * <p>
     * Stops a sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put
     * into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(
            final StopSentimentDetectionJobRequest stopSentimentDetectionJobRequest,
            final AsyncHandler<StopSentimentDetectionJobRequest, StopSentimentDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopSentimentDetectionJobResult>() {
            public StopSentimentDetectionJobResult call() throws Exception {
                StopSentimentDetectionJobResult result = null;
                try {
                    result = stopSentimentDetectionJob(stopSentimentDetectionJobRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(stopSentimentDetectionJobRequest, result);
                return result;
            }
        });
    }

}
