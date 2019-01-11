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

package com.amazonaws.services.polly;

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

import com.amazonaws.services.polly.model.*;
import com.amazonaws.services.polly.model.transform.*;

/**
 * Client for accessing Amazon Polly. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon Polly is a web service that makes it easy to synthesize speech from
 * text.
 * </p>
 * <p>
 * The Amazon Polly service provides API operations for synthesizing
 * high-quality speech from plain text and Speech Synthesis Markup Language
 * (SSML), along with managing pronunciations lexicons that enable you to get
 * the best results for your application domain.
 * </p>
 */
public class AmazonPollyClient extends AmazonWebServiceClient implements AmazonPolly {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Polly exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonPolly. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AmazonPollyClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPolly. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *            how this client connects to AmazonPolly (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonPollyClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPolly using
     * the specified AWS account credentials.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonPollyClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPolly using
     * the specified AWS account credentials and client configuration options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonPolly (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonPollyClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPolly using
     * the specified AWS account credentials provider.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonPollyClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPolly using
     * the specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonPolly (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonPollyClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPolly using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonPolly (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonPollyClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPolly using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonPolly (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonPollyClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InvalidLexiconExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidS3BucketExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidS3KeyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSampleRateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSnsTopicArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSsmlExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTaskIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LanguageNotSupportedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LexiconNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LexiconSizeExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MarksNotSupportedForFormatExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaxLexemeLengthExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaxLexiconsNumberExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SsmlMarksNotSupportedForTextTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SynthesisTaskNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TextLengthExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedPlsAlphabetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedPlsLanguageExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://polly.us-east-1.amazonaws.com");
        this.endpointPrefix = "polly";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/polly/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/polly/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Deletes the specified pronunciation lexicon stored in an AWS Region. A
     * lexicon which has been deleted is not available for speech synthesis, nor
     * is it possible to retrieve it using either the <code>GetLexicon</code> or
     * <code>ListLexicon</code> APIs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
     * >Managing Lexicons</a>.
     * </p>
     * 
     * @param deleteLexiconRequest
     * @return deleteLexiconResult The response from the DeleteLexicon service
     *         method, as returned by Amazon Polly.
     * @throws LexiconNotFoundException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteLexiconResult deleteLexicon(DeleteLexiconRequest deleteLexiconRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLexiconRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLexiconRequest> request = null;
        Response<DeleteLexiconResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLexiconRequestMarshaller().marshall(deleteLexiconRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteLexiconResult, JsonUnmarshallerContext> unmarshaller = new DeleteLexiconResultJsonUnmarshaller();
            JsonResponseHandler<DeleteLexiconResult> responseHandler = new JsonResponseHandler<DeleteLexiconResult>(
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
     * Returns the list of voices that are available for use when requesting
     * speech synthesis. Each voice speaks a specified language, is either male
     * or female, and is identified by an ID, which is the ASCII version of the
     * voice name.
     * </p>
     * <p>
     * When synthesizing speech ( <code>SynthesizeSpeech</code> ), you provide
     * the voice ID for the voice you want from the list of voices returned by
     * <code>DescribeVoices</code>.
     * </p>
     * <p>
     * For example, you want your news reader application to read news in a
     * specific language, but giving a user the option to choose the voice.
     * Using the <code>DescribeVoices</code> operation you can provide the user
     * with a list of available voices to select from.
     * </p>
     * <p>
     * You can optionally specify a language code to filter the available
     * voices. For example, if you specify <code>en-US</code>, the operation
     * returns a list of all available US English voices.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>polly:DescribeVoices</code> action.
     * </p>
     * 
     * @param describeVoicesRequest
     * @return describeVoicesResult The response from the DescribeVoices service
     *         method, as returned by Amazon Polly.
     * @throws InvalidNextTokenException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeVoicesResult describeVoices(DescribeVoicesRequest describeVoicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeVoicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVoicesRequest> request = null;
        Response<DescribeVoicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVoicesRequestMarshaller().marshall(describeVoicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeVoicesResult, JsonUnmarshallerContext> unmarshaller = new DescribeVoicesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeVoicesResult> responseHandler = new JsonResponseHandler<DescribeVoicesResult>(
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
     * Returns the content of the specified pronunciation lexicon stored in an
     * AWS Region. For more information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
     * >Managing Lexicons</a>.
     * </p>
     * 
     * @param getLexiconRequest
     * @return getLexiconResult The response from the GetLexicon service method,
     *         as returned by Amazon Polly.
     * @throws LexiconNotFoundException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetLexiconResult getLexicon(GetLexiconRequest getLexiconRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLexiconRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLexiconRequest> request = null;
        Response<GetLexiconResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLexiconRequestMarshaller().marshall(getLexiconRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLexiconResult, JsonUnmarshallerContext> unmarshaller = new GetLexiconResultJsonUnmarshaller();
            JsonResponseHandler<GetLexiconResult> responseHandler = new JsonResponseHandler<GetLexiconResult>(
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
     * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This
     * object contains information about the given speech synthesis task,
     * including the status of the task, and a link to the S3 bucket containing
     * the output of the task.
     * </p>
     * 
     * @param getSpeechSynthesisTaskRequest
     * @return getSpeechSynthesisTaskResult The response from the
     *         GetSpeechSynthesisTask service method, as returned by Amazon
     *         Polly.
     * @throws InvalidTaskIdException
     * @throws ServiceFailureException
     * @throws SynthesisTaskNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSpeechSynthesisTaskResult getSpeechSynthesisTask(
            GetSpeechSynthesisTaskRequest getSpeechSynthesisTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSpeechSynthesisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSpeechSynthesisTaskRequest> request = null;
        Response<GetSpeechSynthesisTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSpeechSynthesisTaskRequestMarshaller()
                        .marshall(getSpeechSynthesisTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSpeechSynthesisTaskResult, JsonUnmarshallerContext> unmarshaller = new GetSpeechSynthesisTaskResultJsonUnmarshaller();
            JsonResponseHandler<GetSpeechSynthesisTaskResult> responseHandler = new JsonResponseHandler<GetSpeechSynthesisTaskResult>(
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
     * Returns a list of pronunciation lexicons stored in an AWS Region. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
     * >Managing Lexicons</a>.
     * </p>
     * 
     * @param listLexiconsRequest
     * @return listLexiconsResult The response from the ListLexicons service
     *         method, as returned by Amazon Polly.
     * @throws InvalidNextTokenException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListLexiconsResult listLexicons(ListLexiconsRequest listLexiconsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listLexiconsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLexiconsRequest> request = null;
        Response<ListLexiconsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLexiconsRequestMarshaller().marshall(listLexiconsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListLexiconsResult, JsonUnmarshallerContext> unmarshaller = new ListLexiconsResultJsonUnmarshaller();
            JsonResponseHandler<ListLexiconsResult> responseHandler = new JsonResponseHandler<ListLexiconsResult>(
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
     * Returns a list of SpeechSynthesisTask objects ordered by their creation
     * date. This operation can filter the tasks by their status, for example,
     * allowing users to list only tasks that are completed.
     * </p>
     * 
     * @param listSpeechSynthesisTasksRequest
     * @return listSpeechSynthesisTasksResult The response from the
     *         ListSpeechSynthesisTasks service method, as returned by Amazon
     *         Polly.
     * @throws InvalidNextTokenException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSpeechSynthesisTasksResult listSpeechSynthesisTasks(
            ListSpeechSynthesisTasksRequest listSpeechSynthesisTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSpeechSynthesisTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSpeechSynthesisTasksRequest> request = null;
        Response<ListSpeechSynthesisTasksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSpeechSynthesisTasksRequestMarshaller()
                        .marshall(listSpeechSynthesisTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSpeechSynthesisTasksResult, JsonUnmarshallerContext> unmarshaller = new ListSpeechSynthesisTasksResultJsonUnmarshaller();
            JsonResponseHandler<ListSpeechSynthesisTasksResult> responseHandler = new JsonResponseHandler<ListSpeechSynthesisTasksResult>(
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
     * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the
     * same name already exists in the region, it is overwritten by the new
     * lexicon. Lexicon operations have eventual consistency, therefore, it
     * might take some time before the lexicon is available to the
     * SynthesizeSpeech operation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
     * >Managing Lexicons</a>.
     * </p>
     * 
     * @param putLexiconRequest
     * @return putLexiconResult The response from the PutLexicon service method,
     *         as returned by Amazon Polly.
     * @throws InvalidLexiconException
     * @throws UnsupportedPlsAlphabetException
     * @throws UnsupportedPlsLanguageException
     * @throws LexiconSizeExceededException
     * @throws MaxLexemeLengthExceededException
     * @throws MaxLexiconsNumberExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutLexiconResult putLexicon(PutLexiconRequest putLexiconRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putLexiconRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLexiconRequest> request = null;
        Response<PutLexiconResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLexiconRequestMarshaller().marshall(putLexiconRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutLexiconResult, JsonUnmarshallerContext> unmarshaller = new PutLexiconResultJsonUnmarshaller();
            JsonResponseHandler<PutLexiconResult> responseHandler = new JsonResponseHandler<PutLexiconResult>(
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
     * Allows the creation of an asynchronous synthesis task, by starting a new
     * <code>SpeechSynthesisTask</code>. This operation requires all the
     * standard information needed for speech synthesis, plus the name of an
     * Amazon S3 bucket for the service to store the output of the synthesis
     * task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn).
     * Once the synthesis task is created, this operation will return a
     * SpeechSynthesisTask object, which will include an identifier of this task
     * as well as the current status.
     * </p>
     * 
     * @param startSpeechSynthesisTaskRequest
     * @return startSpeechSynthesisTaskResult The response from the
     *         StartSpeechSynthesisTask service method, as returned by Amazon
     *         Polly.
     * @throws TextLengthExceededException
     * @throws InvalidS3BucketException
     * @throws InvalidS3KeyException
     * @throws InvalidSampleRateException
     * @throws InvalidSnsTopicArnException
     * @throws InvalidSsmlException
     * @throws LexiconNotFoundException
     * @throws ServiceFailureException
     * @throws MarksNotSupportedForFormatException
     * @throws SsmlMarksNotSupportedForTextTypeException
     * @throws LanguageNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartSpeechSynthesisTaskResult startSpeechSynthesisTask(
            StartSpeechSynthesisTaskRequest startSpeechSynthesisTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startSpeechSynthesisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSpeechSynthesisTaskRequest> request = null;
        Response<StartSpeechSynthesisTaskResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSpeechSynthesisTaskRequestMarshaller()
                        .marshall(startSpeechSynthesisTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartSpeechSynthesisTaskResult, JsonUnmarshallerContext> unmarshaller = new StartSpeechSynthesisTaskResultJsonUnmarshaller();
            JsonResponseHandler<StartSpeechSynthesisTaskResult> responseHandler = new JsonResponseHandler<StartSpeechSynthesisTaskResult>(
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
     * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML
     * input must be valid, well-formed SSML. Some alphabets might not be
     * available with all the voices (for example, Cyrillic might not be read at
     * all by English voices) unless phoneme mapping is used. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html"
     * >How it Works</a>.
     * </p>
     * 
     * @param synthesizeSpeechRequest
     * @return synthesizeSpeechResult The response from the SynthesizeSpeech
     *         service method, as returned by Amazon Polly.
     * @throws TextLengthExceededException
     * @throws InvalidSampleRateException
     * @throws InvalidSsmlException
     * @throws LexiconNotFoundException
     * @throws ServiceFailureException
     * @throws MarksNotSupportedForFormatException
     * @throws SsmlMarksNotSupportedForTextTypeException
     * @throws LanguageNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SynthesizeSpeechResult synthesizeSpeech(SynthesizeSpeechRequest synthesizeSpeechRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(synthesizeSpeechRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SynthesizeSpeechRequest> request = null;
        Response<SynthesizeSpeechResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SynthesizeSpeechRequestMarshaller().marshall(synthesizeSpeechRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SynthesizeSpeechResult, JsonUnmarshallerContext> unmarshaller = new SynthesizeSpeechResultJsonUnmarshaller();
            JsonResponseHandler<SynthesizeSpeechResult> responseHandler = new JsonResponseHandler<SynthesizeSpeechResult>(
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
