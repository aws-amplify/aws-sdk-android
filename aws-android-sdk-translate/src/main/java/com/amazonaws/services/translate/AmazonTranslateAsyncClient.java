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

package com.amazonaws.services.translate;

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

import com.amazonaws.services.translate.model.*;

/**
 * Interface for accessing Amazon Translate asynchronously.
 * <p>
 * Provides translation between one source language and another of the same set
 * of languages.
 * </p>
 **/
public class AmazonTranslateAsyncClient extends AmazonTranslateClient implements
        AmazonTranslateAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Translate. A credentials provider chain will be used that searches for
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
    public AmazonTranslateAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Translate. A credentials provider chain will be used that searches for
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
     *            how this client connects to Amazon Translate (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonTranslateAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Translate using the specified AWS account credentials. Default client
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
    public AmazonTranslateAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Translate using the specified AWS account credentials and executor
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
    public AmazonTranslateAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Translate using the specified AWS account credentials, executor service,
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
    public AmazonTranslateAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Translate using the specified AWS account credentials provider. Default
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
    public AmazonTranslateAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Translate using the specified AWS account credentials provider and
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
    public AmazonTranslateAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Translate using the specified AWS account credentials provider and client
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
    public AmazonTranslateAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Translate using the specified AWS account credentials provider, executor
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
    public AmazonTranslateAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @return A Java Future object containing the response from the
     *         DeleteTerminology service method, as returned by Amazon
     *         Translate.
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteTerminologyAsync(
            final DeleteTerminologyRequest deleteTerminologyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteTerminology(deleteTerminologyRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @return A Java Future object containing the response from the
     *         DeleteTerminology service method, as returned by Amazon
     *         Translate.
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<Void> deleteTerminologyAsync(
            final DeleteTerminologyRequest deleteTerminologyRequest,
            final AsyncHandler<DeleteTerminologyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteTerminology(deleteTerminologyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteTerminologyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @return A Java Future object containing the response from the
     *         GetTerminology service method, as returned by Amazon Translate.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetTerminologyResult> getTerminologyAsync(
            final GetTerminologyRequest getTerminologyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetTerminologyResult>() {
            public GetTerminologyResult call() throws Exception {
                return getTerminology(getTerminologyRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @return A Java Future object containing the response from the
     *         GetTerminology service method, as returned by Amazon Translate.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetTerminologyResult> getTerminologyAsync(
            final GetTerminologyRequest getTerminologyRequest,
            final AsyncHandler<GetTerminologyRequest, GetTerminologyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTerminologyResult>() {
            public GetTerminologyResult call() throws Exception {
                GetTerminologyResult result = null;
                try {
                    result = getTerminology(getTerminologyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getTerminologyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether or not one
     * already exists for the given terminology name. Importing a terminology
     * with the same name as an existing one will merge the terminologies based
     * on the chosen merge strategy. Currently, the only supported merge
     * strategy is OVERWRITE, and so the imported terminology will overwrite an
     * existing terminology of the same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new
     * terminology take up to 10 minutes to fully propagate and be available for
     * use in a translation due to cache policies with the DataPlane service
     * that performs the translations.
     * </p>
     * 
     * @param importTerminologyRequest
     * @return A Java Future object containing the response from the
     *         ImportTerminology service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ImportTerminologyResult> importTerminologyAsync(
            final ImportTerminologyRequest importTerminologyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ImportTerminologyResult>() {
            public ImportTerminologyResult call() throws Exception {
                return importTerminology(importTerminologyRequest);
            }
        });
    }

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether or not one
     * already exists for the given terminology name. Importing a terminology
     * with the same name as an existing one will merge the terminologies based
     * on the chosen merge strategy. Currently, the only supported merge
     * strategy is OVERWRITE, and so the imported terminology will overwrite an
     * existing terminology of the same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new
     * terminology take up to 10 minutes to fully propagate and be available for
     * use in a translation due to cache policies with the DataPlane service
     * that performs the translations.
     * </p>
     * 
     * @param importTerminologyRequest
     * @return A Java Future object containing the response from the
     *         ImportTerminology service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ImportTerminologyResult> importTerminologyAsync(
            final ImportTerminologyRequest importTerminologyRequest,
            final AsyncHandler<ImportTerminologyRequest, ImportTerminologyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ImportTerminologyResult>() {
            public ImportTerminologyResult call() throws Exception {
                ImportTerminologyResult result = null;
                try {
                    result = importTerminology(importTerminologyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(importTerminologyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @return A Java Future object containing the response from the
     *         ListTerminologies service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListTerminologiesResult> listTerminologiesAsync(
            final ListTerminologiesRequest listTerminologiesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListTerminologiesResult>() {
            public ListTerminologiesResult call() throws Exception {
                return listTerminologies(listTerminologiesRequest);
            }
        });
    }

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @return A Java Future object containing the response from the
     *         ListTerminologies service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<ListTerminologiesResult> listTerminologiesAsync(
            final ListTerminologiesRequest listTerminologiesRequest,
            final AsyncHandler<ListTerminologiesRequest, ListTerminologiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTerminologiesResult>() {
            public ListTerminologiesResult call() throws Exception {
                ListTerminologiesResult result = null;
                try {
                    result = listTerminologies(listTerminologiesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTerminologiesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Translates input text from the source language to the target language. It
     * is not necessary to use English (en) as either the source or the target
     * language but not all language combinations are supported by Amazon
     * Translate. For more information, see <a
     * href="http://docs.aws.amazon.com/translate/latest/dg/pairs.html"
     * >Supported Language Pairs</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Arabic (ar)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Simplified) (zh)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Traditional) (zh-TW)
     * </p>
     * </li>
     * <li>
     * <p>
     * Czech (cs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Danish (da)
     * </p>
     * </li>
     * <li>
     * <p>
     * Dutch (nl)
     * </p>
     * </li>
     * <li>
     * <p>
     * English (en)
     * </p>
     * </li>
     * <li>
     * <p>
     * Finnish (fi)
     * </p>
     * </li>
     * <li>
     * <p>
     * French (fr)
     * </p>
     * </li>
     * <li>
     * <p>
     * German (de)
     * </p>
     * </li>
     * <li>
     * <p>
     * Hebrew (he)
     * </p>
     * </li>
     * <li>
     * <p>
     * Indonesian (id)
     * </p>
     * </li>
     * <li>
     * <p>
     * Italian (it)
     * </p>
     * </li>
     * <li>
     * <p>
     * Japanese (ja)
     * </p>
     * </li>
     * <li>
     * <p>
     * Korean (ko)
     * </p>
     * </li>
     * <li>
     * <p>
     * Polish (pl)
     * </p>
     * </li>
     * <li>
     * <p>
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Russian (ru)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * <li>
     * <p>
     * Swedish (sv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Turkish (tr)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call
     * Amazon Comprehend to determine the source language.
     * </p>
     * 
     * @param translateTextRequest
     * @return A Java Future object containing the response from the
     *         TranslateText service method, as returned by Amazon Translate.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws TooManyRequestsException
     * @throws UnsupportedLanguagePairException
     * @throws DetectedLanguageLowConfidenceException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<TranslateTextResult> translateTextAsync(
            final TranslateTextRequest translateTextRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<TranslateTextResult>() {
            public TranslateTextResult call() throws Exception {
                return translateText(translateTextRequest);
            }
        });
    }

    /**
     * <p>
     * Translates input text from the source language to the target language. It
     * is not necessary to use English (en) as either the source or the target
     * language but not all language combinations are supported by Amazon
     * Translate. For more information, see <a
     * href="http://docs.aws.amazon.com/translate/latest/dg/pairs.html"
     * >Supported Language Pairs</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Arabic (ar)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Simplified) (zh)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Traditional) (zh-TW)
     * </p>
     * </li>
     * <li>
     * <p>
     * Czech (cs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Danish (da)
     * </p>
     * </li>
     * <li>
     * <p>
     * Dutch (nl)
     * </p>
     * </li>
     * <li>
     * <p>
     * English (en)
     * </p>
     * </li>
     * <li>
     * <p>
     * Finnish (fi)
     * </p>
     * </li>
     * <li>
     * <p>
     * French (fr)
     * </p>
     * </li>
     * <li>
     * <p>
     * German (de)
     * </p>
     * </li>
     * <li>
     * <p>
     * Hebrew (he)
     * </p>
     * </li>
     * <li>
     * <p>
     * Indonesian (id)
     * </p>
     * </li>
     * <li>
     * <p>
     * Italian (it)
     * </p>
     * </li>
     * <li>
     * <p>
     * Japanese (ja)
     * </p>
     * </li>
     * <li>
     * <p>
     * Korean (ko)
     * </p>
     * </li>
     * <li>
     * <p>
     * Polish (pl)
     * </p>
     * </li>
     * <li>
     * <p>
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Russian (ru)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * <li>
     * <p>
     * Swedish (sv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Turkish (tr)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call
     * Amazon Comprehend to determine the source language.
     * </p>
     * 
     * @param translateTextRequest
     * @return A Java Future object containing the response from the
     *         TranslateText service method, as returned by Amazon Translate.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws TooManyRequestsException
     * @throws UnsupportedLanguagePairException
     * @throws DetectedLanguageLowConfidenceException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<TranslateTextResult> translateTextAsync(
            final TranslateTextRequest translateTextRequest,
            final AsyncHandler<TranslateTextRequest, TranslateTextResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TranslateTextResult>() {
            public TranslateTextResult call() throws Exception {
                TranslateTextResult result = null;
                try {
                    result = translateText(translateTextRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(translateTextRequest, result);
                return result;
            }
        });
    }

}
