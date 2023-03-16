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

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.services.transcribe.model.transform.*;

/**
 * Client for accessing Amazon Transcribe. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
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
 */
public class AmazonTranscribeClient extends AmazonWebServiceClient implements AmazonTranscribe {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Transcribe exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonTranscribe. A
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
    public AmazonTranscribeClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonTranscribe. A
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
     *            how this client connects to AmazonTranscribe (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonTranscribeClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonTranscribe
     * using the specified AWS account credentials.
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
     *         AmazonTranscribeClient client = new AmazonTranscribeClient(AWSMobileClient.getInstance());
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
    public AmazonTranscribeClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonTranscribe
     * using the specified AWS account credentials and client configuration
     * options.
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
     *         AmazonTranscribeClient client = new AmazonTranscribeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonTranscribe (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonTranscribeClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonTranscribe
     * using the specified AWS account credentials provider.
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
     *         AmazonTranscribeClient client = new AmazonTranscribeClient(AWSMobileClient.getInstance());
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
    public AmazonTranscribeClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonTranscribe
     * using the specified AWS account credentials provider and client
     * configuration options.
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
     *         AmazonTranscribeClient client = new AmazonTranscribeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonTranscribe (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonTranscribeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonTranscribe
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonTranscribe (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonTranscribeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonTranscribe
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
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
     *         AmazonTranscribeClient client = new AmazonTranscribeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonTranscribe (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonTranscribeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        setServiceNameIntern("transcribe");
        this.setEndpoint("transcribe.us-east-1.amazonaws.com");
        this.endpointPrefix = "transcribe";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/transcribe/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/transcribe/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
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
     * @return createCallAnalyticsCategoryResult The response from the
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
    public CreateCallAnalyticsCategoryResult createCallAnalyticsCategory(
            CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCallAnalyticsCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCallAnalyticsCategoryRequest> request = null;
        Response<CreateCallAnalyticsCategoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCallAnalyticsCategoryRequestMarshaller()
                        .marshall(createCallAnalyticsCategoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCallAnalyticsCategoryResult, JsonUnmarshallerContext> unmarshaller = new CreateCallAnalyticsCategoryResultJsonUnmarshaller();
            JsonResponseHandler<CreateCallAnalyticsCategoryResult> responseHandler = new JsonResponseHandler<CreateCallAnalyticsCategoryResult>(
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
     * @return createLanguageModelResult The response from the
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
    public CreateLanguageModelResult createLanguageModel(
            CreateLanguageModelRequest createLanguageModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLanguageModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLanguageModelRequest> request = null;
        Response<CreateLanguageModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLanguageModelRequestMarshaller()
                        .marshall(createLanguageModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateLanguageModelResult, JsonUnmarshallerContext> unmarshaller = new CreateLanguageModelResultJsonUnmarshaller();
            JsonResponseHandler<CreateLanguageModelResult> responseHandler = new JsonResponseHandler<CreateLanguageModelResult>(
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
     * @return createMedicalVocabularyResult The response from the
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
    public CreateMedicalVocabularyResult createMedicalVocabulary(
            CreateMedicalVocabularyRequest createMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMedicalVocabularyRequest> request = null;
        Response<CreateMedicalVocabularyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMedicalVocabularyRequestMarshaller()
                        .marshall(createMedicalVocabularyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMedicalVocabularyResult, JsonUnmarshallerContext> unmarshaller = new CreateMedicalVocabularyResultJsonUnmarshaller();
            JsonResponseHandler<CreateMedicalVocabularyResult> responseHandler = new JsonResponseHandler<CreateMedicalVocabularyResult>(
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
     * @return createVocabularyResult The response from the CreateVocabulary
     *         service method, as returned by Amazon Transcribe.
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
    public CreateVocabularyResult createVocabulary(CreateVocabularyRequest createVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVocabularyRequest> request = null;
        Response<CreateVocabularyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVocabularyRequestMarshaller().marshall(createVocabularyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateVocabularyResult, JsonUnmarshallerContext> unmarshaller = new CreateVocabularyResultJsonUnmarshaller();
            JsonResponseHandler<CreateVocabularyResult> responseHandler = new JsonResponseHandler<CreateVocabularyResult>(
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
     * @return createVocabularyFilterResult The response from the
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
    public CreateVocabularyFilterResult createVocabularyFilter(
            CreateVocabularyFilterRequest createVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVocabularyFilterRequest> request = null;
        Response<CreateVocabularyFilterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVocabularyFilterRequestMarshaller()
                        .marshall(createVocabularyFilterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateVocabularyFilterResult, JsonUnmarshallerContext> unmarshaller = new CreateVocabularyFilterResultJsonUnmarshaller();
            JsonResponseHandler<CreateVocabularyFilterResult> responseHandler = new JsonResponseHandler<CreateVocabularyFilterResult>(
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
     * Deletes a Call Analytics category. To use this operation, specify the
     * name of the category you want to delete using <code>CategoryName</code>.
     * Category names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @return deleteCallAnalyticsCategoryResult The response from the
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
    public DeleteCallAnalyticsCategoryResult deleteCallAnalyticsCategory(
            DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCallAnalyticsCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCallAnalyticsCategoryRequest> request = null;
        Response<DeleteCallAnalyticsCategoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCallAnalyticsCategoryRequestMarshaller()
                        .marshall(deleteCallAnalyticsCategoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCallAnalyticsCategoryResult, JsonUnmarshallerContext> unmarshaller = new DeleteCallAnalyticsCategoryResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCallAnalyticsCategoryResult> responseHandler = new JsonResponseHandler<DeleteCallAnalyticsCategoryResult>(
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
     * Deletes a Call Analytics job. To use this operation, specify the name of
     * the job you want to delete using <code>CallAnalyticsJobName</code>. Job
     * names are case sensitive.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @return deleteCallAnalyticsJobResult The response from the
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
    public DeleteCallAnalyticsJobResult deleteCallAnalyticsJob(
            DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCallAnalyticsJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCallAnalyticsJobRequest> request = null;
        Response<DeleteCallAnalyticsJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCallAnalyticsJobRequestMarshaller()
                        .marshall(deleteCallAnalyticsJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCallAnalyticsJobResult, JsonUnmarshallerContext> unmarshaller = new DeleteCallAnalyticsJobResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCallAnalyticsJobResult> responseHandler = new JsonResponseHandler<DeleteCallAnalyticsJobResult>(
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
     * Deletes a custom language model. To use this operation, specify the name
     * of the language model you want to delete using <code>ModelName</code>.
     * custom language model names are case sensitive.
     * </p>
     * 
     * @param deleteLanguageModelRequest
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
    public void deleteLanguageModel(DeleteLanguageModelRequest deleteLanguageModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLanguageModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLanguageModelRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLanguageModelRequestMarshaller()
                        .marshall(deleteLanguageModelRequest);
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
     * Deletes a medical transcription job. To use this operation, specify the
     * name of the job you want to delete using
     * <code>MedicalTranscriptionJobName</code>. Job names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
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
    public void deleteMedicalTranscriptionJob(
            DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMedicalTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMedicalTranscriptionJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMedicalTranscriptionJobRequestMarshaller()
                        .marshall(deleteMedicalTranscriptionJobRequest);
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
     * Deletes a custom medical vocabulary. To use this operation, specify the
     * name of the custom vocabulary you want to delete using
     * <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
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
    public void deleteMedicalVocabulary(
            DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMedicalVocabularyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMedicalVocabularyRequestMarshaller()
                        .marshall(deleteMedicalVocabularyRequest);
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
     * Deletes a transcription job. To use this operation, specify the name of
     * the job you want to delete using <code>TranscriptionJobName</code>. Job
     * names are case sensitive.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
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
    public void deleteTranscriptionJob(DeleteTranscriptionJobRequest deleteTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTranscriptionJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTranscriptionJobRequestMarshaller()
                        .marshall(deleteTranscriptionJobRequest);
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
     * Deletes a custom vocabulary. To use this operation, specify the name of
     * the custom vocabulary you want to delete using
     * <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
     * </p>
     * 
     * @param deleteVocabularyRequest
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
    public void deleteVocabulary(DeleteVocabularyRequest deleteVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVocabularyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVocabularyRequestMarshaller().marshall(deleteVocabularyRequest);
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
     * Deletes a custom vocabulary filter. To use this operation, specify the
     * name of the custom vocabulary filter you want to delete using
     * <code>VocabularyFilterName</code>. Custom vocabulary filter names are
     * case sensitive.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
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
    public void deleteVocabularyFilter(DeleteVocabularyFilterRequest deleteVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVocabularyFilterRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVocabularyFilterRequestMarshaller()
                        .marshall(deleteVocabularyFilterRequest);
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
     * @return describeLanguageModelResult The response from the
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
    public DescribeLanguageModelResult describeLanguageModel(
            DescribeLanguageModelRequest describeLanguageModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLanguageModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLanguageModelRequest> request = null;
        Response<DescribeLanguageModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLanguageModelRequestMarshaller()
                        .marshall(describeLanguageModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLanguageModelResult, JsonUnmarshallerContext> unmarshaller = new DescribeLanguageModelResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLanguageModelResult> responseHandler = new JsonResponseHandler<DescribeLanguageModelResult>(
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
     * Provides information about the specified Call Analytics category.
     * </p>
     * <p>
     * To get a list of your Call Analytics categories, use the operation.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @return getCallAnalyticsCategoryResult The response from the
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
    public GetCallAnalyticsCategoryResult getCallAnalyticsCategory(
            GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCallAnalyticsCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCallAnalyticsCategoryRequest> request = null;
        Response<GetCallAnalyticsCategoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCallAnalyticsCategoryRequestMarshaller()
                        .marshall(getCallAnalyticsCategoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCallAnalyticsCategoryResult, JsonUnmarshallerContext> unmarshaller = new GetCallAnalyticsCategoryResultJsonUnmarshaller();
            JsonResponseHandler<GetCallAnalyticsCategoryResult> responseHandler = new JsonResponseHandler<GetCallAnalyticsCategoryResult>(
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
     * @return getCallAnalyticsJobResult The response from the
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
    public GetCallAnalyticsJobResult getCallAnalyticsJob(
            GetCallAnalyticsJobRequest getCallAnalyticsJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCallAnalyticsJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCallAnalyticsJobRequest> request = null;
        Response<GetCallAnalyticsJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCallAnalyticsJobRequestMarshaller()
                        .marshall(getCallAnalyticsJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCallAnalyticsJobResult, JsonUnmarshallerContext> unmarshaller = new GetCallAnalyticsJobResultJsonUnmarshaller();
            JsonResponseHandler<GetCallAnalyticsJobResult> responseHandler = new JsonResponseHandler<GetCallAnalyticsJobResult>(
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
     * @return getMedicalTranscriptionJobResult The response from the
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
    public GetMedicalTranscriptionJobResult getMedicalTranscriptionJob(
            GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMedicalTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMedicalTranscriptionJobRequest> request = null;
        Response<GetMedicalTranscriptionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMedicalTranscriptionJobRequestMarshaller()
                        .marshall(getMedicalTranscriptionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMedicalTranscriptionJobResult, JsonUnmarshallerContext> unmarshaller = new GetMedicalTranscriptionJobResultJsonUnmarshaller();
            JsonResponseHandler<GetMedicalTranscriptionJobResult> responseHandler = new JsonResponseHandler<GetMedicalTranscriptionJobResult>(
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
     * @return getMedicalVocabularyResult The response from the
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
    public GetMedicalVocabularyResult getMedicalVocabulary(
            GetMedicalVocabularyRequest getMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMedicalVocabularyRequest> request = null;
        Response<GetMedicalVocabularyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMedicalVocabularyRequestMarshaller()
                        .marshall(getMedicalVocabularyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMedicalVocabularyResult, JsonUnmarshallerContext> unmarshaller = new GetMedicalVocabularyResultJsonUnmarshaller();
            JsonResponseHandler<GetMedicalVocabularyResult> responseHandler = new JsonResponseHandler<GetMedicalVocabularyResult>(
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
     * @return getTranscriptionJobResult The response from the
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
    public GetTranscriptionJobResult getTranscriptionJob(
            GetTranscriptionJobRequest getTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTranscriptionJobRequest> request = null;
        Response<GetTranscriptionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTranscriptionJobRequestMarshaller()
                        .marshall(getTranscriptionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTranscriptionJobResult, JsonUnmarshallerContext> unmarshaller = new GetTranscriptionJobResultJsonUnmarshaller();
            JsonResponseHandler<GetTranscriptionJobResult> responseHandler = new JsonResponseHandler<GetTranscriptionJobResult>(
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
     * @return getVocabularyResult The response from the GetVocabulary service
     *         method, as returned by Amazon Transcribe.
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
    public GetVocabularyResult getVocabulary(GetVocabularyRequest getVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVocabularyRequest> request = null;
        Response<GetVocabularyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVocabularyRequestMarshaller().marshall(getVocabularyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVocabularyResult, JsonUnmarshallerContext> unmarshaller = new GetVocabularyResultJsonUnmarshaller();
            JsonResponseHandler<GetVocabularyResult> responseHandler = new JsonResponseHandler<GetVocabularyResult>(
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
     * Provides information about the specified custom vocabulary filter.
     * </p>
     * <p>
     * To get a list of your custom vocabulary filters, use the operation.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return getVocabularyFilterResult The response from the
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
    public GetVocabularyFilterResult getVocabularyFilter(
            GetVocabularyFilterRequest getVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVocabularyFilterRequest> request = null;
        Response<GetVocabularyFilterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVocabularyFilterRequestMarshaller()
                        .marshall(getVocabularyFilterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVocabularyFilterResult, JsonUnmarshallerContext> unmarshaller = new GetVocabularyFilterResultJsonUnmarshaller();
            JsonResponseHandler<GetVocabularyFilterResult> responseHandler = new JsonResponseHandler<GetVocabularyFilterResult>(
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
     * Provides a list of Call Analytics categories, including all rules that
     * make up each category.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics category, use
     * the operation.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @return listCallAnalyticsCategoriesResult The response from the
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
    public ListCallAnalyticsCategoriesResult listCallAnalyticsCategories(
            ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCallAnalyticsCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCallAnalyticsCategoriesRequest> request = null;
        Response<ListCallAnalyticsCategoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCallAnalyticsCategoriesRequestMarshaller()
                        .marshall(listCallAnalyticsCategoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCallAnalyticsCategoriesResult, JsonUnmarshallerContext> unmarshaller = new ListCallAnalyticsCategoriesResultJsonUnmarshaller();
            JsonResponseHandler<ListCallAnalyticsCategoriesResult> responseHandler = new JsonResponseHandler<ListCallAnalyticsCategoriesResult>(
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
     * Provides a list of Call Analytics jobs that match the specified criteria.
     * If no criteria are specified, all Call Analytics jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics job, use the
     * operation.
     * </p>
     * 
     * @param listCallAnalyticsJobsRequest
     * @return listCallAnalyticsJobsResult The response from the
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
    public ListCallAnalyticsJobsResult listCallAnalyticsJobs(
            ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCallAnalyticsJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCallAnalyticsJobsRequest> request = null;
        Response<ListCallAnalyticsJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCallAnalyticsJobsRequestMarshaller()
                        .marshall(listCallAnalyticsJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCallAnalyticsJobsResult, JsonUnmarshallerContext> unmarshaller = new ListCallAnalyticsJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListCallAnalyticsJobsResult> responseHandler = new JsonResponseHandler<ListCallAnalyticsJobsResult>(
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
     * @return listLanguageModelsResult The response from the ListLanguageModels
     *         service method, as returned by Amazon Transcribe.
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
    public ListLanguageModelsResult listLanguageModels(
            ListLanguageModelsRequest listLanguageModelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listLanguageModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLanguageModelsRequest> request = null;
        Response<ListLanguageModelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLanguageModelsRequestMarshaller()
                        .marshall(listLanguageModelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListLanguageModelsResult, JsonUnmarshallerContext> unmarshaller = new ListLanguageModelsResultJsonUnmarshaller();
            JsonResponseHandler<ListLanguageModelsResult> responseHandler = new JsonResponseHandler<ListLanguageModelsResult>(
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
     * @return listMedicalTranscriptionJobsResult The response from the
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
    public ListMedicalTranscriptionJobsResult listMedicalTranscriptionJobs(
            ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMedicalTranscriptionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMedicalTranscriptionJobsRequest> request = null;
        Response<ListMedicalTranscriptionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMedicalTranscriptionJobsRequestMarshaller()
                        .marshall(listMedicalTranscriptionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMedicalTranscriptionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListMedicalTranscriptionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListMedicalTranscriptionJobsResult> responseHandler = new JsonResponseHandler<ListMedicalTranscriptionJobsResult>(
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
     * @return listMedicalVocabulariesResult The response from the
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
    public ListMedicalVocabulariesResult listMedicalVocabularies(
            ListMedicalVocabulariesRequest listMedicalVocabulariesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMedicalVocabulariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMedicalVocabulariesRequest> request = null;
        Response<ListMedicalVocabulariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMedicalVocabulariesRequestMarshaller()
                        .marshall(listMedicalVocabulariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMedicalVocabulariesResult, JsonUnmarshallerContext> unmarshaller = new ListMedicalVocabulariesResultJsonUnmarshaller();
            JsonResponseHandler<ListMedicalVocabulariesResult> responseHandler = new JsonResponseHandler<ListMedicalVocabulariesResult>(
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
     * @return listTagsForResourceResult The response from the
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
     * Provides a list of transcription jobs that match the specified criteria.
     * If no criteria are specified, all transcription jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific transcription job, use the
     * operation.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return listTranscriptionJobsResult The response from the
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
    public ListTranscriptionJobsResult listTranscriptionJobs(
            ListTranscriptionJobsRequest listTranscriptionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTranscriptionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTranscriptionJobsRequest> request = null;
        Response<ListTranscriptionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTranscriptionJobsRequestMarshaller()
                        .marshall(listTranscriptionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTranscriptionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListTranscriptionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListTranscriptionJobsResult> responseHandler = new JsonResponseHandler<ListTranscriptionJobsResult>(
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
     * Provides a list of custom vocabularies that match the specified criteria.
     * If no criteria are specified, all custom vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary, use the
     * operation.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @return listVocabulariesResult The response from the ListVocabularies
     *         service method, as returned by Amazon Transcribe.
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
    public ListVocabulariesResult listVocabularies(ListVocabulariesRequest listVocabulariesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVocabulariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVocabulariesRequest> request = null;
        Response<ListVocabulariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVocabulariesRequestMarshaller().marshall(listVocabulariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVocabulariesResult, JsonUnmarshallerContext> unmarshaller = new ListVocabulariesResultJsonUnmarshaller();
            JsonResponseHandler<ListVocabulariesResult> responseHandler = new JsonResponseHandler<ListVocabulariesResult>(
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
     * @return listVocabularyFiltersResult The response from the
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
    public ListVocabularyFiltersResult listVocabularyFilters(
            ListVocabularyFiltersRequest listVocabularyFiltersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVocabularyFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVocabularyFiltersRequest> request = null;
        Response<ListVocabularyFiltersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVocabularyFiltersRequestMarshaller()
                        .marshall(listVocabularyFiltersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVocabularyFiltersResult, JsonUnmarshallerContext> unmarshaller = new ListVocabularyFiltersResultJsonUnmarshaller();
            JsonResponseHandler<ListVocabularyFiltersResult> responseHandler = new JsonResponseHandler<ListVocabularyFiltersResult>(
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
     * @return startCallAnalyticsJobResult The response from the
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
    public StartCallAnalyticsJobResult startCallAnalyticsJob(
            StartCallAnalyticsJobRequest startCallAnalyticsJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startCallAnalyticsJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCallAnalyticsJobRequest> request = null;
        Response<StartCallAnalyticsJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCallAnalyticsJobRequestMarshaller()
                        .marshall(startCallAnalyticsJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartCallAnalyticsJobResult, JsonUnmarshallerContext> unmarshaller = new StartCallAnalyticsJobResultJsonUnmarshaller();
            JsonResponseHandler<StartCallAnalyticsJobResult> responseHandler = new JsonResponseHandler<StartCallAnalyticsJobResult>(
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
     * @return startMedicalTranscriptionJobResult The response from the
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
    public StartMedicalTranscriptionJobResult startMedicalTranscriptionJob(
            StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startMedicalTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMedicalTranscriptionJobRequest> request = null;
        Response<StartMedicalTranscriptionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMedicalTranscriptionJobRequestMarshaller()
                        .marshall(startMedicalTranscriptionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartMedicalTranscriptionJobResult, JsonUnmarshallerContext> unmarshaller = new StartMedicalTranscriptionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartMedicalTranscriptionJobResult> responseHandler = new JsonResponseHandler<StartMedicalTranscriptionJobResult>(
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
     * @return startTranscriptionJobResult The response from the
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
    public StartTranscriptionJobResult startTranscriptionJob(
            StartTranscriptionJobRequest startTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startTranscriptionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTranscriptionJobRequest> request = null;
        Response<StartTranscriptionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTranscriptionJobRequestMarshaller()
                        .marshall(startTranscriptionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartTranscriptionJobResult, JsonUnmarshallerContext> unmarshaller = new StartTranscriptionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartTranscriptionJobResult> responseHandler = new JsonResponseHandler<StartTranscriptionJobResult>(
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
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Transcribe.
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
     * Removes the specified tags from the specified Amazon Transcribe resource.
     * </p>
     * <p>
     * If you include <code>UntagResource</code> in your request, you must also
     * include <code>ResourceArn</code> and <code>TagKeys</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Transcribe.
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
     * @return updateCallAnalyticsCategoryResult The response from the
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
    public UpdateCallAnalyticsCategoryResult updateCallAnalyticsCategory(
            UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCallAnalyticsCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCallAnalyticsCategoryRequest> request = null;
        Response<UpdateCallAnalyticsCategoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCallAnalyticsCategoryRequestMarshaller()
                        .marshall(updateCallAnalyticsCategoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCallAnalyticsCategoryResult, JsonUnmarshallerContext> unmarshaller = new UpdateCallAnalyticsCategoryResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCallAnalyticsCategoryResult> responseHandler = new JsonResponseHandler<UpdateCallAnalyticsCategoryResult>(
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
     * Updates an existing custom medical vocabulary with new values. This
     * operation overwrites all existing information with your new values; you
     * cannot append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return updateMedicalVocabularyResult The response from the
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
    public UpdateMedicalVocabularyResult updateMedicalVocabulary(
            UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMedicalVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMedicalVocabularyRequest> request = null;
        Response<UpdateMedicalVocabularyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMedicalVocabularyRequestMarshaller()
                        .marshall(updateMedicalVocabularyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMedicalVocabularyResult, JsonUnmarshallerContext> unmarshaller = new UpdateMedicalVocabularyResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMedicalVocabularyResult> responseHandler = new JsonResponseHandler<UpdateMedicalVocabularyResult>(
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
     * Updates an existing custom vocabulary with new values. This operation
     * overwrites all existing information with your new values; you cannot
     * append new terms onto an existing custom vocabulary.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return updateVocabularyResult The response from the UpdateVocabulary
     *         service method, as returned by Amazon Transcribe.
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
    public UpdateVocabularyResult updateVocabulary(UpdateVocabularyRequest updateVocabularyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVocabularyRequest> request = null;
        Response<UpdateVocabularyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVocabularyRequestMarshaller().marshall(updateVocabularyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVocabularyResult, JsonUnmarshallerContext> unmarshaller = new UpdateVocabularyResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVocabularyResult> responseHandler = new JsonResponseHandler<UpdateVocabularyResult>(
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
     * Updates an existing custom vocabulary filter with a new list of words.
     * The new list you provide overwrites all previous entries; you cannot
     * append new terms onto an existing custom vocabulary filter.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return updateVocabularyFilterResult The response from the
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
    public UpdateVocabularyFilterResult updateVocabularyFilter(
            UpdateVocabularyFilterRequest updateVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVocabularyFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVocabularyFilterRequest> request = null;
        Response<UpdateVocabularyFilterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVocabularyFilterRequestMarshaller()
                        .marshall(updateVocabularyFilterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVocabularyFilterResult, JsonUnmarshallerContext> unmarshaller = new UpdateVocabularyFilterResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVocabularyFilterResult> responseHandler = new JsonResponseHandler<UpdateVocabularyFilterResult>(
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
