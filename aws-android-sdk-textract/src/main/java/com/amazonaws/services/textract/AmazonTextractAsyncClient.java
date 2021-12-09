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

package com.amazonaws.services.textract;

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

import com.amazonaws.services.textract.model.*;

/**
 * Interface for accessing Amazon Textract asynchronously.
 * <p>
 * Amazon Textract detects and analyzes text in documents and converts it into
 * machine-readable text. This is the API reference documentation for Amazon
 * Textract.
 * </p>
 **/
public class AmazonTextractAsyncClient extends AmazonTextractClient implements AmazonTextractAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Textract. A credentials provider chain will be used that searches for
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
    public AmazonTextractAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Textract. A credentials provider chain will be used that searches for
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
     *            how this client connects to Amazon Textract (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonTextractAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Textract using the specified AWS account credentials. Default client
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
    public AmazonTextractAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Textract using the specified AWS account credentials and executor
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
    public AmazonTextractAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Textract using the specified AWS account credentials, executor service,
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
    public AmazonTextractAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Textract using the specified AWS account credentials provider. Default
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
    public AmazonTextractAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Textract using the specified AWS account credentials provider and
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
    public AmazonTextractAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Textract using the specified AWS account credentials provider and client
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
    public AmazonTextractAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Textract using the specified AWS account credentials provider, executor
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
    public AmazonTextractAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Analyzes an input document for relationships between detected items.
     * </p>
     * <p>
     * The types of information returned are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Form data (key-value pairs). The related information is returned in two
     * <a>Block</a> objects, each of type <code>KEY_VALUE_SET</code>: a KEY
     * <code>Block</code> object and a VALUE <code>Block</code> object. For
     * example, <i>Name: Ana Silva Carolina</i> contains a key and value.
     * <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE <code>Block</code> object contains
     * information about a detected table. A CELL <code>Block</code> object is
     * returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE <code>Block</code> object contains one or
     * more WORD <code>Block</code> objects. All lines and words that are
     * detected in the document are returned (including text that doesn't have a
     * relationship with the value of <code>FeatureTypes</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Selection elements such as check boxes and option buttons (radio buttons)
     * can be detected in form data and in tables. A SELECTION_ELEMENT
     * <code>Block</code> object contains information about a selection element,
     * including the selection status.
     * </p>
     * <p>
     * You can choose which type of analysis to perform by specifying the
     * <code>FeatureTypes</code> list.
     * </p>
     * <p>
     * The output is returned in a list of <code>Block</code> objects.
     * </p>
     * <p>
     * <code>AnalyzeDocument</code> is a synchronous operation. To analyze
     * documents asynchronously, use <a>StartDocumentAnalysis</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
     * >Document Text Analysis</a>.
     * </p>
     * 
     * @param analyzeDocumentRequest
     * @return A Java Future object containing the response from the
     *         AnalyzeDocument service method, as returned by Amazon Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws HumanLoopQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AnalyzeDocumentResult> analyzeDocumentAsync(
            final AnalyzeDocumentRequest analyzeDocumentRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<AnalyzeDocumentResult>() {
            public AnalyzeDocumentResult call() throws Exception {
                return analyzeDocument(analyzeDocumentRequest);
            }
        });
    }

    /**
     * <p>
     * Analyzes an input document for relationships between detected items.
     * </p>
     * <p>
     * The types of information returned are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Form data (key-value pairs). The related information is returned in two
     * <a>Block</a> objects, each of type <code>KEY_VALUE_SET</code>: a KEY
     * <code>Block</code> object and a VALUE <code>Block</code> object. For
     * example, <i>Name: Ana Silva Carolina</i> contains a key and value.
     * <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE <code>Block</code> object contains
     * information about a detected table. A CELL <code>Block</code> object is
     * returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE <code>Block</code> object contains one or
     * more WORD <code>Block</code> objects. All lines and words that are
     * detected in the document are returned (including text that doesn't have a
     * relationship with the value of <code>FeatureTypes</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Selection elements such as check boxes and option buttons (radio buttons)
     * can be detected in form data and in tables. A SELECTION_ELEMENT
     * <code>Block</code> object contains information about a selection element,
     * including the selection status.
     * </p>
     * <p>
     * You can choose which type of analysis to perform by specifying the
     * <code>FeatureTypes</code> list.
     * </p>
     * <p>
     * The output is returned in a list of <code>Block</code> objects.
     * </p>
     * <p>
     * <code>AnalyzeDocument</code> is a synchronous operation. To analyze
     * documents asynchronously, use <a>StartDocumentAnalysis</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
     * >Document Text Analysis</a>.
     * </p>
     * 
     * @param analyzeDocumentRequest
     * @return A Java Future object containing the response from the
     *         AnalyzeDocument service method, as returned by Amazon Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws HumanLoopQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AnalyzeDocumentResult> analyzeDocumentAsync(
            final AnalyzeDocumentRequest analyzeDocumentRequest,
            final AsyncHandler<AnalyzeDocumentRequest, AnalyzeDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AnalyzeDocumentResult>() {
            public AnalyzeDocumentResult call() throws Exception {
                AnalyzeDocumentResult result = null;
                try {
                    result = analyzeDocument(analyzeDocumentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(analyzeDocumentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * <code>AnalyzeExpense</code> synchronously analyzes an input document for
     * financially related relationships between text.
     * </p>
     * <p>
     * Information is returned as <code>ExpenseDocuments</code> and seperated as
     * follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LineItemGroups</code>- A data set containing <code>LineItems</code>
     * which store information about the lines of text, such as an item
     * purchased and its price on a receipt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SummaryFields</code>- Contains all other information a receipt,
     * such as header information or the vendors name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param analyzeExpenseRequest
     * @return A Java Future object containing the response from the
     *         AnalyzeExpense service method, as returned by Amazon Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AnalyzeExpenseResult> analyzeExpenseAsync(
            final AnalyzeExpenseRequest analyzeExpenseRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<AnalyzeExpenseResult>() {
            public AnalyzeExpenseResult call() throws Exception {
                return analyzeExpense(analyzeExpenseRequest);
            }
        });
    }

    /**
     * <p>
     * <code>AnalyzeExpense</code> synchronously analyzes an input document for
     * financially related relationships between text.
     * </p>
     * <p>
     * Information is returned as <code>ExpenseDocuments</code> and seperated as
     * follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LineItemGroups</code>- A data set containing <code>LineItems</code>
     * which store information about the lines of text, such as an item
     * purchased and its price on a receipt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SummaryFields</code>- Contains all other information a receipt,
     * such as header information or the vendors name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param analyzeExpenseRequest
     * @return A Java Future object containing the response from the
     *         AnalyzeExpense service method, as returned by Amazon Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AnalyzeExpenseResult> analyzeExpenseAsync(
            final AnalyzeExpenseRequest analyzeExpenseRequest,
            final AsyncHandler<AnalyzeExpenseRequest, AnalyzeExpenseResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AnalyzeExpenseResult>() {
            public AnalyzeExpenseResult call() throws Exception {
                AnalyzeExpenseResult result = null;
                try {
                    result = analyzeExpense(analyzeExpenseRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(analyzeExpenseRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Analyzes identity documents for relevant information. This information is
     * extracted and returned as <code>IdentityDocumentFields</code>, which
     * records both the normalized field and value of the extracted text.
     * </p>
     * 
     * @param analyzeIDRequest
     * @return A Java Future object containing the response from the AnalyzeID
     *         service method, as returned by Amazon Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AnalyzeIDResult> analyzeIDAsync(final AnalyzeIDRequest analyzeIDRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AnalyzeIDResult>() {
            public AnalyzeIDResult call() throws Exception {
                return analyzeID(analyzeIDRequest);
            }
        });
    }

    /**
     * <p>
     * Analyzes identity documents for relevant information. This information is
     * extracted and returned as <code>IdentityDocumentFields</code>, which
     * records both the normalized field and value of the extracted text.
     * </p>
     * 
     * @param analyzeIDRequest
     * @return A Java Future object containing the response from the AnalyzeID
     *         service method, as returned by Amazon Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<AnalyzeIDResult> analyzeIDAsync(final AnalyzeIDRequest analyzeIDRequest,
            final AsyncHandler<AnalyzeIDRequest, AnalyzeIDResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AnalyzeIDResult>() {
            public AnalyzeIDResult call() throws Exception {
                AnalyzeIDResult result = null;
                try {
                    result = analyzeID(analyzeIDRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(analyzeIDRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Detects text in the input document. Amazon Textract can detect lines of
     * text and the words that make up a line of text. The input document must
     * be an image in JPEG or PNG format. <code>DetectDocumentText</code>
     * returns the detected text in an array of <a>Block</a> objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE.
     * Each PAGE <code>Block</code> object is the parent of LINE
     * <code>Block</code> objects that represent the lines of detected text on a
     * page. A LINE <code>Block</code> object is a parent for each word that
     * makes up the line. Words are represented by <code>Block</code> objects of
     * type WORD.
     * </p>
     * <p>
     * <code>DetectDocumentText</code> is a synchronous operation. To analyze
     * documents asynchronously, use <a>StartDocumentTextDetection</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
     * >Document Text Detection</a>.
     * </p>
     * 
     * @param detectDocumentTextRequest
     * @return A Java Future object containing the response from the
     *         DetectDocumentText service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectDocumentTextResult> detectDocumentTextAsync(
            final DetectDocumentTextRequest detectDocumentTextRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetectDocumentTextResult>() {
            public DetectDocumentTextResult call() throws Exception {
                return detectDocumentText(detectDocumentTextRequest);
            }
        });
    }

    /**
     * <p>
     * Detects text in the input document. Amazon Textract can detect lines of
     * text and the words that make up a line of text. The input document must
     * be an image in JPEG or PNG format. <code>DetectDocumentText</code>
     * returns the detected text in an array of <a>Block</a> objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE.
     * Each PAGE <code>Block</code> object is the parent of LINE
     * <code>Block</code> objects that represent the lines of detected text on a
     * page. A LINE <code>Block</code> object is a parent for each word that
     * makes up the line. Words are represented by <code>Block</code> objects of
     * type WORD.
     * </p>
     * <p>
     * <code>DetectDocumentText</code> is a synchronous operation. To analyze
     * documents asynchronously, use <a>StartDocumentTextDetection</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
     * >Document Text Detection</a>.
     * </p>
     * 
     * @param detectDocumentTextRequest
     * @return A Java Future object containing the response from the
     *         DetectDocumentText service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<DetectDocumentTextResult> detectDocumentTextAsync(
            final DetectDocumentTextRequest detectDocumentTextRequest,
            final AsyncHandler<DetectDocumentTextRequest, DetectDocumentTextResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DetectDocumentTextResult>() {
            public DetectDocumentTextResult call() throws Exception {
                DetectDocumentTextResult result = null;
                try {
                    result = detectDocumentText(detectDocumentTextRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(detectDocumentTextRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that
     * analyzes text in a document.
     * </p>
     * <p>
     * You start asynchronous text analysis by calling
     * <a>StartDocumentAnalysis</a>, which returns a job identifier (
     * <code>JobId</code>). When the text analysis operation finishes, Amazon
     * Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartDocumentAnalysis</code>. To get the results of the
     * text-detection operation, first check that the status value published to
     * the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentAnalysis</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * <code>GetDocumentAnalysis</code> returns an array of <a>Block</a>
     * objects. The following types of information are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Form data (key-value pairs). The related information is returned in two
     * <a>Block</a> objects, each of type <code>KEY_VALUE_SET</code>: a KEY
     * <code>Block</code> object and a VALUE <code>Block</code> object. For
     * example, <i>Name: Ana Silva Carolina</i> contains a key and value.
     * <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE <code>Block</code> object contains
     * information about a detected table. A CELL <code>Block</code> object is
     * returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE <code>Block</code> object contains one or
     * more WORD <code>Block</code> objects. All lines and words that are
     * detected in the document are returned (including text that doesn't have a
     * relationship with the value of the <code>StartDocumentAnalysis</code>
     * <code>FeatureTypes</code> input parameter).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Selection elements such as check boxes and option buttons (radio buttons)
     * can be detected in form data and in tables. A SELECTION_ELEMENT
     * <code>Block</code> object contains information about a selection element,
     * including the selection status.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of blocks
     * that are returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetDocumentAnalysis</code>, and populate the <code>NextToken</code>
     * request parameter with the token value that's returned from the previous
     * call to <code>GetDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
     * >Document Text Analysis</a>.
     * </p>
     * 
     * @param getDocumentAnalysisRequest
     * @return A Java Future object containing the response from the
     *         GetDocumentAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidJobIdException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetDocumentAnalysisResult> getDocumentAnalysisAsync(
            final GetDocumentAnalysisRequest getDocumentAnalysisRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDocumentAnalysisResult>() {
            public GetDocumentAnalysisResult call() throws Exception {
                return getDocumentAnalysis(getDocumentAnalysisRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that
     * analyzes text in a document.
     * </p>
     * <p>
     * You start asynchronous text analysis by calling
     * <a>StartDocumentAnalysis</a>, which returns a job identifier (
     * <code>JobId</code>). When the text analysis operation finishes, Amazon
     * Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartDocumentAnalysis</code>. To get the results of the
     * text-detection operation, first check that the status value published to
     * the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentAnalysis</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * <code>GetDocumentAnalysis</code> returns an array of <a>Block</a>
     * objects. The following types of information are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Form data (key-value pairs). The related information is returned in two
     * <a>Block</a> objects, each of type <code>KEY_VALUE_SET</code>: a KEY
     * <code>Block</code> object and a VALUE <code>Block</code> object. For
     * example, <i>Name: Ana Silva Carolina</i> contains a key and value.
     * <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE <code>Block</code> object contains
     * information about a detected table. A CELL <code>Block</code> object is
     * returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE <code>Block</code> object contains one or
     * more WORD <code>Block</code> objects. All lines and words that are
     * detected in the document are returned (including text that doesn't have a
     * relationship with the value of the <code>StartDocumentAnalysis</code>
     * <code>FeatureTypes</code> input parameter).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Selection elements such as check boxes and option buttons (radio buttons)
     * can be detected in form data and in tables. A SELECTION_ELEMENT
     * <code>Block</code> object contains information about a selection element,
     * including the selection status.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of blocks
     * that are returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetDocumentAnalysis</code>, and populate the <code>NextToken</code>
     * request parameter with the token value that's returned from the previous
     * call to <code>GetDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
     * >Document Text Analysis</a>.
     * </p>
     * 
     * @param getDocumentAnalysisRequest
     * @return A Java Future object containing the response from the
     *         GetDocumentAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidJobIdException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetDocumentAnalysisResult> getDocumentAnalysisAsync(
            final GetDocumentAnalysisRequest getDocumentAnalysisRequest,
            final AsyncHandler<GetDocumentAnalysisRequest, GetDocumentAnalysisResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDocumentAnalysisResult>() {
            public GetDocumentAnalysisResult call() throws Exception {
                GetDocumentAnalysisResult result = null;
                try {
                    result = getDocumentAnalysis(getDocumentAnalysisRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getDocumentAnalysisRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that
     * detects text in a document. Amazon Textract can detect lines of text and
     * the words that make up a line of text.
     * </p>
     * <p>
     * You start asynchronous text detection by calling
     * <a>StartDocumentTextDetection</a>, which returns a job identifier (
     * <code>JobId</code>). When the text detection operation finishes, Amazon
     * Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartDocumentTextDetection</code>. To get the results of the
     * text-detection operation, first check that the status value published to
     * the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentTextDetection</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * <code>GetDocumentTextDetection</code> returns an array of <a>Block</a>
     * objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE.
     * Each PAGE <code>Block</code> object is the parent of LINE
     * <code>Block</code> objects that represent the lines of detected text on a
     * page. A LINE <code>Block</code> object is a parent for each word that
     * makes up the line. Words are represented by <code>Block</code> objects of
     * type WORD.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are
     * returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetDocumentTextDetection</code>, and populate the
     * <code>NextToken</code> request parameter with the token value that's
     * returned from the previous call to <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
     * >Document Text Detection</a>.
     * </p>
     * 
     * @param getDocumentTextDetectionRequest
     * @return A Java Future object containing the response from the
     *         GetDocumentTextDetection service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidJobIdException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetDocumentTextDetectionResult> getDocumentTextDetectionAsync(
            final GetDocumentTextDetectionRequest getDocumentTextDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDocumentTextDetectionResult>() {
            public GetDocumentTextDetectionResult call() throws Exception {
                return getDocumentTextDetection(getDocumentTextDetectionRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that
     * detects text in a document. Amazon Textract can detect lines of text and
     * the words that make up a line of text.
     * </p>
     * <p>
     * You start asynchronous text detection by calling
     * <a>StartDocumentTextDetection</a>, which returns a job identifier (
     * <code>JobId</code>). When the text detection operation finishes, Amazon
     * Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartDocumentTextDetection</code>. To get the results of the
     * text-detection operation, first check that the status value published to
     * the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentTextDetection</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * <code>GetDocumentTextDetection</code> returns an array of <a>Block</a>
     * objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE.
     * Each PAGE <code>Block</code> object is the parent of LINE
     * <code>Block</code> objects that represent the lines of detected text on a
     * page. A LINE <code>Block</code> object is a parent for each word that
     * makes up the line. Words are represented by <code>Block</code> objects of
     * type WORD.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are
     * returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetDocumentTextDetection</code>, and populate the
     * <code>NextToken</code> request parameter with the token value that's
     * returned from the previous call to <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
     * >Document Text Detection</a>.
     * </p>
     * 
     * @param getDocumentTextDetectionRequest
     * @return A Java Future object containing the response from the
     *         GetDocumentTextDetection service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidJobIdException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetDocumentTextDetectionResult> getDocumentTextDetectionAsync(
            final GetDocumentTextDetectionRequest getDocumentTextDetectionRequest,
            final AsyncHandler<GetDocumentTextDetectionRequest, GetDocumentTextDetectionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDocumentTextDetectionResult>() {
            public GetDocumentTextDetectionResult call() throws Exception {
                GetDocumentTextDetectionResult result = null;
                try {
                    result = getDocumentTextDetection(getDocumentTextDetectionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getDocumentTextDetectionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that
     * analyzes invoices and receipts. Amazon Textract finds contact
     * information, items purchased, and vendor name, from input invoices and
     * receipts.
     * </p>
     * <p>
     * You start asynchronous invoice/receipt analysis by calling
     * <a>StartExpenseAnalysis</a>, which returns a job identifier (
     * <code>JobId</code>). Upon completion of the invoice/receipt analysis,
     * Amazon Textract publishes the completion status to the Amazon Simple
     * Notification Service (Amazon SNS) topic. This topic must be registered in
     * the initial call to <code>StartExpenseAnalysis</code>. To get the results
     * of the invoice/receipt analysis operation, first ensure that the status
     * value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
     * call <code>GetExpenseAnalysis</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartExpenseAnalysis</code>.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are
     * returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetExpenseAnalysis</code>, and populate the <code>NextToken</code>
     * request parameter with the token value that's returned from the previous
     * call to <code>GetExpenseAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/invoices-receipts.html"
     * >Analyzing Invoices and Receipts</a>.
     * </p>
     * 
     * @param getExpenseAnalysisRequest
     * @return A Java Future object containing the response from the
     *         GetExpenseAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidJobIdException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetExpenseAnalysisResult> getExpenseAnalysisAsync(
            final GetExpenseAnalysisRequest getExpenseAnalysisRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetExpenseAnalysisResult>() {
            public GetExpenseAnalysisResult call() throws Exception {
                return getExpenseAnalysis(getExpenseAnalysisRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that
     * analyzes invoices and receipts. Amazon Textract finds contact
     * information, items purchased, and vendor name, from input invoices and
     * receipts.
     * </p>
     * <p>
     * You start asynchronous invoice/receipt analysis by calling
     * <a>StartExpenseAnalysis</a>, which returns a job identifier (
     * <code>JobId</code>). Upon completion of the invoice/receipt analysis,
     * Amazon Textract publishes the completion status to the Amazon Simple
     * Notification Service (Amazon SNS) topic. This topic must be registered in
     * the initial call to <code>StartExpenseAnalysis</code>. To get the results
     * of the invoice/receipt analysis operation, first ensure that the status
     * value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
     * call <code>GetExpenseAnalysis</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartExpenseAnalysis</code>.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are
     * returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetExpenseAnalysis</code>, and populate the <code>NextToken</code>
     * request parameter with the token value that's returned from the previous
     * call to <code>GetExpenseAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/invoices-receipts.html"
     * >Analyzing Invoices and Receipts</a>.
     * </p>
     * 
     * @param getExpenseAnalysisRequest
     * @return A Java Future object containing the response from the
     *         GetExpenseAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidJobIdException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<GetExpenseAnalysisResult> getExpenseAnalysisAsync(
            final GetExpenseAnalysisRequest getExpenseAnalysisRequest,
            final AsyncHandler<GetExpenseAnalysisRequest, GetExpenseAnalysisResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetExpenseAnalysisResult>() {
            public GetExpenseAnalysisResult call() throws Exception {
                GetExpenseAnalysisResult result = null;
                try {
                    result = getExpenseAnalysis(getExpenseAnalysisRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getExpenseAnalysisRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts the asynchronous analysis of an input document for relationships
     * between detected items such as key-value pairs, tables, and selection
     * elements.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> can analyze text in documents that are
     * in JPEG, PNG, TIFF, and PDF format. The documents are stored in an Amazon
     * S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name and
     * file name of the document.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation.
     * When text analysis is finished, Amazon Textract publishes a completion
     * status to the Amazon Simple Notification Service (Amazon SNS) topic that
     * you specify in <code>NotificationChannel</code>. To get the results of
     * the text analysis operation, first check that the status value published
     * to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetDocumentAnalysis</a>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
     * >Document Text Analysis</a>.
     * </p>
     * 
     * @param startDocumentAnalysisRequest
     * @return A Java Future object containing the response from the
     *         StartDocumentAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws IdempotentParameterMismatchException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartDocumentAnalysisResult> startDocumentAnalysisAsync(
            final StartDocumentAnalysisRequest startDocumentAnalysisRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartDocumentAnalysisResult>() {
            public StartDocumentAnalysisResult call() throws Exception {
                return startDocumentAnalysis(startDocumentAnalysisRequest);
            }
        });
    }

    /**
     * <p>
     * Starts the asynchronous analysis of an input document for relationships
     * between detected items such as key-value pairs, tables, and selection
     * elements.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> can analyze text in documents that are
     * in JPEG, PNG, TIFF, and PDF format. The documents are stored in an Amazon
     * S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name and
     * file name of the document.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation.
     * When text analysis is finished, Amazon Textract publishes a completion
     * status to the Amazon Simple Notification Service (Amazon SNS) topic that
     * you specify in <code>NotificationChannel</code>. To get the results of
     * the text analysis operation, first check that the status value published
     * to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetDocumentAnalysis</a>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
     * >Document Text Analysis</a>.
     * </p>
     * 
     * @param startDocumentAnalysisRequest
     * @return A Java Future object containing the response from the
     *         StartDocumentAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws IdempotentParameterMismatchException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartDocumentAnalysisResult> startDocumentAnalysisAsync(
            final StartDocumentAnalysisRequest startDocumentAnalysisRequest,
            final AsyncHandler<StartDocumentAnalysisRequest, StartDocumentAnalysisResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartDocumentAnalysisResult>() {
            public StartDocumentAnalysisResult call() throws Exception {
                StartDocumentAnalysisResult result = null;
                try {
                    result = startDocumentAnalysis(startDocumentAnalysisRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startDocumentAnalysisRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts the asynchronous detection of text in a document. Amazon Textract
     * can detect lines of text and the words that make up a line of text.
     * </p>
     * <p>
     * <code>StartDocumentTextDetection</code> can analyze text in documents
     * that are in JPEG, PNG, TIFF, and PDF format. The documents are stored in
     * an Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket
     * name and file name of the document.
     * </p>
     * <p>
     * <code>StartTextDetection</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation.
     * When text detection is finished, Amazon Textract publishes a completion
     * status to the Amazon Simple Notification Service (Amazon SNS) topic that
     * you specify in <code>NotificationChannel</code>. To get the results of
     * the text detection operation, first check that the status value published
     * to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetDocumentTextDetection</a>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
     * >Document Text Detection</a>.
     * </p>
     * 
     * @param startDocumentTextDetectionRequest
     * @return A Java Future object containing the response from the
     *         StartDocumentTextDetection service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws IdempotentParameterMismatchException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartDocumentTextDetectionResult> startDocumentTextDetectionAsync(
            final StartDocumentTextDetectionRequest startDocumentTextDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartDocumentTextDetectionResult>() {
            public StartDocumentTextDetectionResult call() throws Exception {
                return startDocumentTextDetection(startDocumentTextDetectionRequest);
            }
        });
    }

    /**
     * <p>
     * Starts the asynchronous detection of text in a document. Amazon Textract
     * can detect lines of text and the words that make up a line of text.
     * </p>
     * <p>
     * <code>StartDocumentTextDetection</code> can analyze text in documents
     * that are in JPEG, PNG, TIFF, and PDF format. The documents are stored in
     * an Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket
     * name and file name of the document.
     * </p>
     * <p>
     * <code>StartTextDetection</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation.
     * When text detection is finished, Amazon Textract publishes a completion
     * status to the Amazon Simple Notification Service (Amazon SNS) topic that
     * you specify in <code>NotificationChannel</code>. To get the results of
     * the text detection operation, first check that the status value published
     * to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetDocumentTextDetection</a>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
     * >Document Text Detection</a>.
     * </p>
     * 
     * @param startDocumentTextDetectionRequest
     * @return A Java Future object containing the response from the
     *         StartDocumentTextDetection service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws IdempotentParameterMismatchException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartDocumentTextDetectionResult> startDocumentTextDetectionAsync(
            final StartDocumentTextDetectionRequest startDocumentTextDetectionRequest,
            final AsyncHandler<StartDocumentTextDetectionRequest, StartDocumentTextDetectionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartDocumentTextDetectionResult>() {
            public StartDocumentTextDetectionResult call() throws Exception {
                StartDocumentTextDetectionResult result = null;
                try {
                    result = startDocumentTextDetection(startDocumentTextDetectionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startDocumentTextDetectionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Starts the asynchronous analysis of invoices or receipts for data like
     * contact information, items purchased, and vendor names.
     * </p>
     * <p>
     * <code>StartExpenseAnalysis</code> can analyze text in documents that are
     * in JPEG, PNG, and PDF format. The documents must be stored in an Amazon
     * S3 bucket. Use the <a>DocumentLocation</a> parameter to specify the name
     * of your S3 bucket and the name of the document in that bucket.
     * </p>
     * <p>
     * <code>StartExpenseAnalysis</code> returns a job identifier (
     * <code>JobId</code>) that you will provide to
     * <code>GetExpenseAnalysis</code> to retrieve the results of the operation.
     * When the analysis of the input invoices/receipts is finished, Amazon
     * Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that you provide to the
     * <code>NotificationChannel</code>. To obtain the results of the invoice
     * and receipt analysis operation, ensure that the status value published to
     * the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetExpenseAnalysis</a>, and pass the job identifier (
     * <code>JobId</code>) that was returned by your call to
     * <code>StartExpenseAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/invoice-receipts.html"
     * >Analyzing Invoices and Receipts</a>.
     * </p>
     * 
     * @param startExpenseAnalysisRequest
     * @return A Java Future object containing the response from the
     *         StartExpenseAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws IdempotentParameterMismatchException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartExpenseAnalysisResult> startExpenseAnalysisAsync(
            final StartExpenseAnalysisRequest startExpenseAnalysisRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartExpenseAnalysisResult>() {
            public StartExpenseAnalysisResult call() throws Exception {
                return startExpenseAnalysis(startExpenseAnalysisRequest);
            }
        });
    }

    /**
     * <p>
     * Starts the asynchronous analysis of invoices or receipts for data like
     * contact information, items purchased, and vendor names.
     * </p>
     * <p>
     * <code>StartExpenseAnalysis</code> can analyze text in documents that are
     * in JPEG, PNG, and PDF format. The documents must be stored in an Amazon
     * S3 bucket. Use the <a>DocumentLocation</a> parameter to specify the name
     * of your S3 bucket and the name of the document in that bucket.
     * </p>
     * <p>
     * <code>StartExpenseAnalysis</code> returns a job identifier (
     * <code>JobId</code>) that you will provide to
     * <code>GetExpenseAnalysis</code> to retrieve the results of the operation.
     * When the analysis of the input invoices/receipts is finished, Amazon
     * Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that you provide to the
     * <code>NotificationChannel</code>. To obtain the results of the invoice
     * and receipt analysis operation, ensure that the status value published to
     * the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetExpenseAnalysis</a>, and pass the job identifier (
     * <code>JobId</code>) that was returned by your call to
     * <code>StartExpenseAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/invoice-receipts.html"
     * >Analyzing Invoices and Receipts</a>.
     * </p>
     * 
     * @param startExpenseAnalysisRequest
     * @return A Java Future object containing the response from the
     *         StartExpenseAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InvalidKMSKeyException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws IdempotentParameterMismatchException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public Future<StartExpenseAnalysisResult> startExpenseAnalysisAsync(
            final StartExpenseAnalysisRequest startExpenseAnalysisRequest,
            final AsyncHandler<StartExpenseAnalysisRequest, StartExpenseAnalysisResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartExpenseAnalysisResult>() {
            public StartExpenseAnalysisResult call() throws Exception {
                StartExpenseAnalysisResult result = null;
                try {
                    result = startExpenseAnalysis(startExpenseAnalysisRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startExpenseAnalysisRequest, result);
                return result;
            }
        });
    }

}
