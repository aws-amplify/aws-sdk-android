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

package com.amazonaws.services.amazonelasticsearchservice;

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

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.services.amazonelasticsearchservice.model.transform.*;

/**
 * Client for accessing Amazon Elasticsearch Service. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Amazon Elasticsearch Configuration Service</fullname>
 * <p>
 * Use the Amazon Elasticsearch Configuration API to create, configure, and
 * manage Elasticsearch domains.
 * </p>
 * <p>
 * For sample code that uses the Configuration API, see the <a href=
 * "https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-samples.html"
 * >Amazon Elasticsearch Service Developer Guide</a>. The guide also contains <a
 * href=
 * "https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-request-signing.html"
 * >sample code for sending signed HTTP requests to the Elasticsearch APIs</a>.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific:
 * es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For
 * a current list of supported regions and endpoints, see <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions"
 * target="_blank">Regions and Endpoints</a>.
 * </p>
 */
public class AmazonElasticsearchServiceClient extends AmazonWebServiceClient implements
        AmazonElasticsearchService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Elasticsearch Service
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticsearchService. A credentials provider chain will be used
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
    public AmazonElasticsearchServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticsearchService. A credentials provider chain will be used
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
     *            how this client connects to AmazonElasticsearchService (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonElasticsearchServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticsearchService using the specified AWS account credentials.
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
     *         AmazonElasticsearchServiceClient client = new AmazonElasticsearchServiceClient(
     *                 AWSMobileClient.getInstance());
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
    public AmazonElasticsearchServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticsearchService using the specified AWS account credentials
     * and client configuration options.
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
     *         AmazonElasticsearchServiceClient client = new AmazonElasticsearchServiceClient(
     *                 AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonElasticsearchService (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonElasticsearchServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticsearchService using the specified AWS account credentials
     * provider.
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
     *         AmazonElasticsearchServiceClient client = new AmazonElasticsearchServiceClient(
     *                 AWSMobileClient.getInstance());
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
    public AmazonElasticsearchServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticsearchService using the specified AWS account credentials
     * provider and client configuration options.
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
     *         AmazonElasticsearchServiceClient client = new AmazonElasticsearchServiceClient(
     *                 AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonElasticsearchService (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonElasticsearchServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticsearchService using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonElasticsearchService (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonElasticsearchServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticsearchService using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
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
     *         AmazonElasticsearchServiceClient client = new AmazonElasticsearchServiceClient(
     *                 AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonElasticsearchService (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonElasticsearchServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BaseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DisabledOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("es.us-east-1.amazonaws.com");
        this.endpointPrefix = "es";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazonelasticsearchservice/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amazonelasticsearchservice/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of
     * case-sensitive key value pairs. An Elasticsearch domain may have up to 10
     * tags. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-awsresorcetagging"
     * target="_blank"> Tagging Amazon Elasticsearch Service Domains for more
     * information.</a>
     * </p>
     * 
     * @param addTagsRequest <p>
     *            Container for the parameters to the
     *            <code><a>AddTags</a></code> operation. Specify the tags that
     *            you want to attach to the Elasticsearch domain.
     *            </p>
     * @throws BaseException
     * @throws LimitExceededException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void addTags(AddTagsRequest addTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestMarshaller().marshall(addTagsRequest);
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
     * Associates a package with an Amazon ES domain.
     * </p>
     * 
     * @param associatePackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>AssociatePackage</a> </code> operation.
     *            </p>
     * @return associatePackageResult The response from the AssociatePackage
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public AssociatePackageResult associatePackage(AssociatePackageRequest associatePackageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associatePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePackageRequest> request = null;
        Response<AssociatePackageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePackageRequestMarshaller().marshall(associatePackageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociatePackageResult, JsonUnmarshallerContext> unmarshaller = new AssociatePackageResultJsonUnmarshaller();
            JsonResponseHandler<AssociatePackageResult> responseHandler = new JsonResponseHandler<AssociatePackageResult>(
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
     * Cancels a scheduled service software update for an Amazon ES domain. You
     * can only perform this operation before the
     * <code>AutomatedUpdateDate</code> and when the <code>UpdateStatus</code>
     * is in the <code>PENDING_UPDATE</code> state.
     * </p>
     * 
     * @param cancelElasticsearchServiceSoftwareUpdateRequest <p>
     *            Container for the parameters to the
     *            <code><a>CancelElasticsearchServiceSoftwareUpdate</a></code>
     *            operation. Specifies the name of the Elasticsearch domain that
     *            you wish to cancel a service software update on.
     *            </p>
     * @return cancelElasticsearchServiceSoftwareUpdateResult The response from
     *         the CancelElasticsearchServiceSoftwareUpdate service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CancelElasticsearchServiceSoftwareUpdateResult cancelElasticsearchServiceSoftwareUpdate(
            CancelElasticsearchServiceSoftwareUpdateRequest cancelElasticsearchServiceSoftwareUpdateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelElasticsearchServiceSoftwareUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelElasticsearchServiceSoftwareUpdateRequest> request = null;
        Response<CancelElasticsearchServiceSoftwareUpdateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelElasticsearchServiceSoftwareUpdateRequestMarshaller()
                        .marshall(cancelElasticsearchServiceSoftwareUpdateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelElasticsearchServiceSoftwareUpdateResult, JsonUnmarshallerContext> unmarshaller = new CancelElasticsearchServiceSoftwareUpdateResultJsonUnmarshaller();
            JsonResponseHandler<CancelElasticsearchServiceSoftwareUpdateResult> responseHandler = new JsonResponseHandler<CancelElasticsearchServiceSoftwareUpdateResult>(
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
     * Creates a new Elasticsearch domain. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon
     * Elasticsearch Service Developer Guide</i>.
     * </p>
     * 
     * @param createElasticsearchDomainRequest
     * @return createElasticsearchDomainResult The response from the
     *         CreateElasticsearchDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws DisabledOperationException
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws LimitExceededException
     * @throws ResourceAlreadyExistsException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateElasticsearchDomainResult createElasticsearchDomain(
            CreateElasticsearchDomainRequest createElasticsearchDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateElasticsearchDomainRequest> request = null;
        Response<CreateElasticsearchDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateElasticsearchDomainRequestMarshaller()
                        .marshall(createElasticsearchDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateElasticsearchDomainResult, JsonUnmarshallerContext> unmarshaller = new CreateElasticsearchDomainResultJsonUnmarshaller();
            JsonResponseHandler<CreateElasticsearchDomainResult> responseHandler = new JsonResponseHandler<CreateElasticsearchDomainResult>(
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
     * Create a package for use with Amazon ES domains.
     * </p>
     * 
     * @param createPackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>CreatePackage</a> </code> operation.
     *            </p>
     * @return createPackageResult The response from the CreatePackage service
     *         method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidTypeException
     * @throws ResourceAlreadyExistsException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreatePackageResult createPackage(CreatePackageRequest createPackageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePackageRequest> request = null;
        Response<CreatePackageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePackageRequestMarshaller().marshall(createPackageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePackageResult, JsonUnmarshallerContext> unmarshaller = new CreatePackageResultJsonUnmarshaller();
            JsonResponseHandler<CreatePackageResult> responseHandler = new JsonResponseHandler<CreatePackageResult>(
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
     * Permanently deletes the specified Elasticsearch domain and all of its
     * data. Once a domain is deleted, it cannot be recovered.
     * </p>
     * 
     * @param deleteElasticsearchDomainRequest <p>
     *            Container for the parameters to the
     *            <code><a>DeleteElasticsearchDomain</a></code> operation.
     *            Specifies the name of the Elasticsearch domain that you want
     *            to delete.
     *            </p>
     * @return deleteElasticsearchDomainResult The response from the
     *         DeleteElasticsearchDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteElasticsearchDomainResult deleteElasticsearchDomain(
            DeleteElasticsearchDomainRequest deleteElasticsearchDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteElasticsearchDomainRequest> request = null;
        Response<DeleteElasticsearchDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteElasticsearchDomainRequestMarshaller()
                        .marshall(deleteElasticsearchDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteElasticsearchDomainResult, JsonUnmarshallerContext> unmarshaller = new DeleteElasticsearchDomainResultJsonUnmarshaller();
            JsonResponseHandler<DeleteElasticsearchDomainResult> responseHandler = new JsonResponseHandler<DeleteElasticsearchDomainResult>(
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
     * Deletes the service-linked role that Elasticsearch Service uses to manage
     * and maintain VPC domains. Role deletion will fail if any existing VPC
     * domains use the role. You must delete any such Elasticsearch domains
     * before deleting the role. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-enabling-slr"
     * target="_blank">Deleting Elasticsearch Service Role</a> in <i>VPC
     * Endpoints for Amazon Elasticsearch Service Domains</i>.
     * </p>
     * 
     * @param deleteElasticsearchServiceRoleRequest
     * @throws BaseException
     * @throws InternalException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void deleteElasticsearchServiceRole(
            DeleteElasticsearchServiceRoleRequest deleteElasticsearchServiceRoleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteElasticsearchServiceRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteElasticsearchServiceRoleRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteElasticsearchServiceRoleRequestMarshaller()
                        .marshall(deleteElasticsearchServiceRoleRequest);
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
     * Delete the package.
     * </p>
     * 
     * @param deletePackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>DeletePackage</a> </code> operation.
     *            </p>
     * @return deletePackageResult The response from the DeletePackage service
     *         method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeletePackageResult deletePackage(DeletePackageRequest deletePackageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePackageRequest> request = null;
        Response<DeletePackageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePackageRequestMarshaller().marshall(deletePackageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePackageResult, JsonUnmarshallerContext> unmarshaller = new DeletePackageResultJsonUnmarshaller();
            JsonResponseHandler<DeletePackageResult> responseHandler = new JsonResponseHandler<DeletePackageResult>(
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
     * Returns domain configuration information about the specified
     * Elasticsearch domain, including the domain ID, domain endpoint, and
     * domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainRequest <p>
     *            Container for the parameters to the
     *            <code><a>DescribeElasticsearchDomain</a></code> operation.
     *            </p>
     * @return describeElasticsearchDomainResult The response from the
     *         DescribeElasticsearchDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeElasticsearchDomainResult describeElasticsearchDomain(
            DescribeElasticsearchDomainRequest describeElasticsearchDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchDomainRequest> request = null;
        Response<DescribeElasticsearchDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchDomainRequestMarshaller()
                        .marshall(describeElasticsearchDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeElasticsearchDomainResult, JsonUnmarshallerContext> unmarshaller = new DescribeElasticsearchDomainResultJsonUnmarshaller();
            JsonResponseHandler<DescribeElasticsearchDomainResult> responseHandler = new JsonResponseHandler<DescribeElasticsearchDomainResult>(
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
     * Provides cluster configuration information about the specified
     * Elasticsearch domain, such as the state, creation date, update version,
     * and update date for cluster options.
     * </p>
     * 
     * @param describeElasticsearchDomainConfigRequest <p>
     *            Container for the parameters to the
     *            <code>DescribeElasticsearchDomainConfig</code> operation.
     *            Specifies the domain name for which you want configuration
     *            information.
     *            </p>
     * @return describeElasticsearchDomainConfigResult The response from the
     *         DescribeElasticsearchDomainConfig service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeElasticsearchDomainConfigResult describeElasticsearchDomainConfig(
            DescribeElasticsearchDomainConfigRequest describeElasticsearchDomainConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeElasticsearchDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchDomainConfigRequest> request = null;
        Response<DescribeElasticsearchDomainConfigResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchDomainConfigRequestMarshaller()
                        .marshall(describeElasticsearchDomainConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeElasticsearchDomainConfigResult, JsonUnmarshallerContext> unmarshaller = new DescribeElasticsearchDomainConfigResultJsonUnmarshaller();
            JsonResponseHandler<DescribeElasticsearchDomainConfigResult> responseHandler = new JsonResponseHandler<DescribeElasticsearchDomainConfigResult>(
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
     * Returns domain configuration information about the specified
     * Elasticsearch domains, including the domain ID, domain endpoint, and
     * domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainsRequest <p>
     *            Container for the parameters to the
     *            <code><a>DescribeElasticsearchDomains</a></code> operation. By
     *            default, the API returns the status of all Elasticsearch
     *            domains.
     *            </p>
     * @return describeElasticsearchDomainsResult The response from the
     *         DescribeElasticsearchDomains service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeElasticsearchDomainsResult describeElasticsearchDomains(
            DescribeElasticsearchDomainsRequest describeElasticsearchDomainsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeElasticsearchDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchDomainsRequest> request = null;
        Response<DescribeElasticsearchDomainsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchDomainsRequestMarshaller()
                        .marshall(describeElasticsearchDomainsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeElasticsearchDomainsResult, JsonUnmarshallerContext> unmarshaller = new DescribeElasticsearchDomainsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeElasticsearchDomainsResult> responseHandler = new JsonResponseHandler<DescribeElasticsearchDomainsResult>(
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
     * Describe Elasticsearch Limits for a given InstanceType and
     * ElasticsearchVersion. When modifying existing Domain, specify the
     * <code> <a>DomainName</a> </code> to know what Limits are supported for
     * modifying.
     * </p>
     * 
     * @param describeElasticsearchInstanceTypeLimitsRequest <p>
     *            Container for the parameters to
     *            <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code>
     *            operation.
     *            </p>
     * @return describeElasticsearchInstanceTypeLimitsResult The response from
     *         the DescribeElasticsearchInstanceTypeLimits service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeElasticsearchInstanceTypeLimitsResult describeElasticsearchInstanceTypeLimits(
            DescribeElasticsearchInstanceTypeLimitsRequest describeElasticsearchInstanceTypeLimitsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeElasticsearchInstanceTypeLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticsearchInstanceTypeLimitsRequest> request = null;
        Response<DescribeElasticsearchInstanceTypeLimitsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticsearchInstanceTypeLimitsRequestMarshaller()
                        .marshall(describeElasticsearchInstanceTypeLimitsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeElasticsearchInstanceTypeLimitsResult, JsonUnmarshallerContext> unmarshaller = new DescribeElasticsearchInstanceTypeLimitsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeElasticsearchInstanceTypeLimitsResult> responseHandler = new JsonResponseHandler<DescribeElasticsearchInstanceTypeLimitsResult>(
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
     * Describes all packages available to Amazon ES. Includes options for
     * filtering, limiting the number of results, and pagination.
     * </p>
     * 
     * @param describePackagesRequest <p>
     *            Container for request parameters to
     *            <code> <a>DescribePackage</a> </code> operation.
     *            </p>
     * @return describePackagesResult The response from the DescribePackages
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribePackagesResult describePackages(DescribePackagesRequest describePackagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackagesRequest> request = null;
        Response<DescribePackagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackagesRequestMarshaller().marshall(describePackagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePackagesResult, JsonUnmarshallerContext> unmarshaller = new DescribePackagesResultJsonUnmarshaller();
            JsonResponseHandler<DescribePackagesResult> responseHandler = new JsonResponseHandler<DescribePackagesResult>(
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
     * Lists available reserved Elasticsearch instance offerings.
     * </p>
     * 
     * @param describeReservedElasticsearchInstanceOfferingsRequest <p>
     *            Container for parameters to
     *            <code>DescribeReservedElasticsearchInstanceOfferings</code>
     *            </p>
     * @return describeReservedElasticsearchInstanceOfferingsResult The response
     *         from the DescribeReservedElasticsearchInstanceOfferings service
     *         method, as returned by Amazon Elasticsearch Service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws DisabledOperationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeReservedElasticsearchInstanceOfferingsResult describeReservedElasticsearchInstanceOfferings(
            DescribeReservedElasticsearchInstanceOfferingsRequest describeReservedElasticsearchInstanceOfferingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReservedElasticsearchInstanceOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedElasticsearchInstanceOfferingsRequest> request = null;
        Response<DescribeReservedElasticsearchInstanceOfferingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedElasticsearchInstanceOfferingsRequestMarshaller()
                        .marshall(describeReservedElasticsearchInstanceOfferingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeReservedElasticsearchInstanceOfferingsResult, JsonUnmarshallerContext> unmarshaller = new DescribeReservedElasticsearchInstanceOfferingsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeReservedElasticsearchInstanceOfferingsResult> responseHandler = new JsonResponseHandler<DescribeReservedElasticsearchInstanceOfferingsResult>(
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
     * Returns information about reserved Elasticsearch instances for this
     * account.
     * </p>
     * 
     * @param describeReservedElasticsearchInstancesRequest <p>
     *            Container for parameters to
     *            <code>DescribeReservedElasticsearchInstances</code>
     *            </p>
     * @return describeReservedElasticsearchInstancesResult The response from
     *         the DescribeReservedElasticsearchInstances service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws ResourceNotFoundException
     * @throws InternalException
     * @throws ValidationException
     * @throws DisabledOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeReservedElasticsearchInstancesResult describeReservedElasticsearchInstances(
            DescribeReservedElasticsearchInstancesRequest describeReservedElasticsearchInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReservedElasticsearchInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedElasticsearchInstancesRequest> request = null;
        Response<DescribeReservedElasticsearchInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedElasticsearchInstancesRequestMarshaller()
                        .marshall(describeReservedElasticsearchInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeReservedElasticsearchInstancesResult, JsonUnmarshallerContext> unmarshaller = new DescribeReservedElasticsearchInstancesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeReservedElasticsearchInstancesResult> responseHandler = new JsonResponseHandler<DescribeReservedElasticsearchInstancesResult>(
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
     * Dissociates a package from the Amazon ES domain.
     * </p>
     * 
     * @param dissociatePackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>DissociatePackage</a> </code> operation.
     *            </p>
     * @return dissociatePackageResult The response from the DissociatePackage
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DissociatePackageResult dissociatePackage(
            DissociatePackageRequest dissociatePackageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(dissociatePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DissociatePackageRequest> request = null;
        Response<DissociatePackageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DissociatePackageRequestMarshaller()
                        .marshall(dissociatePackageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DissociatePackageResult, JsonUnmarshallerContext> unmarshaller = new DissociatePackageResultJsonUnmarshaller();
            JsonResponseHandler<DissociatePackageResult> responseHandler = new JsonResponseHandler<DissociatePackageResult>(
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
     * Returns a list of upgrade compatible Elastisearch versions. You can
     * optionally pass a <code> <a>DomainName</a> </code> to get all upgrade
     * compatible Elasticsearch versions for that specific domain.
     * </p>
     * 
     * @param getCompatibleElasticsearchVersionsRequest <p>
     *            Container for request parameters to
     *            <code> <a>GetCompatibleElasticsearchVersions</a> </code>
     *            operation.
     *            </p>
     * @return getCompatibleElasticsearchVersionsResult The response from the
     *         GetCompatibleElasticsearchVersions service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetCompatibleElasticsearchVersionsResult getCompatibleElasticsearchVersions(
            GetCompatibleElasticsearchVersionsRequest getCompatibleElasticsearchVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCompatibleElasticsearchVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCompatibleElasticsearchVersionsRequest> request = null;
        Response<GetCompatibleElasticsearchVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCompatibleElasticsearchVersionsRequestMarshaller()
                        .marshall(getCompatibleElasticsearchVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCompatibleElasticsearchVersionsResult, JsonUnmarshallerContext> unmarshaller = new GetCompatibleElasticsearchVersionsResultJsonUnmarshaller();
            JsonResponseHandler<GetCompatibleElasticsearchVersionsResult> responseHandler = new JsonResponseHandler<GetCompatibleElasticsearchVersionsResult>(
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
     * Retrieves the complete history of the last 10 upgrades that were
     * performed on the domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest <p>
     *            Container for request parameters to
     *            <code> <a>GetUpgradeHistory</a> </code> operation.
     *            </p>
     * @return getUpgradeHistoryResult The response from the GetUpgradeHistory
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetUpgradeHistoryResult getUpgradeHistory(
            GetUpgradeHistoryRequest getUpgradeHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUpgradeHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUpgradeHistoryRequest> request = null;
        Response<GetUpgradeHistoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUpgradeHistoryRequestMarshaller()
                        .marshall(getUpgradeHistoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUpgradeHistoryResult, JsonUnmarshallerContext> unmarshaller = new GetUpgradeHistoryResultJsonUnmarshaller();
            JsonResponseHandler<GetUpgradeHistoryResult> responseHandler = new JsonResponseHandler<GetUpgradeHistoryResult>(
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
     * Retrieves the latest status of the last upgrade or upgrade eligibility
     * check that was performed on the domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest <p>
     *            Container for request parameters to
     *            <code> <a>GetUpgradeStatus</a> </code> operation.
     *            </p>
     * @return getUpgradeStatusResult The response from the GetUpgradeStatus
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetUpgradeStatusResult getUpgradeStatus(GetUpgradeStatusRequest getUpgradeStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUpgradeStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUpgradeStatusRequest> request = null;
        Response<GetUpgradeStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUpgradeStatusRequestMarshaller().marshall(getUpgradeStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUpgradeStatusResult, JsonUnmarshallerContext> unmarshaller = new GetUpgradeStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetUpgradeStatusResult> responseHandler = new JsonResponseHandler<GetUpgradeStatusResult>(
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
     * Returns the name of all Elasticsearch domains owned by the current user's
     * account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @return listDomainNamesResult The response from the ListDomainNames
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListDomainNamesResult listDomainNames(ListDomainNamesRequest listDomainNamesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDomainNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainNamesRequest> request = null;
        Response<ListDomainNamesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainNamesRequestMarshaller().marshall(listDomainNamesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDomainNamesResult, JsonUnmarshallerContext> unmarshaller = new ListDomainNamesResultJsonUnmarshaller();
            JsonResponseHandler<ListDomainNamesResult> responseHandler = new JsonResponseHandler<ListDomainNamesResult>(
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
     * Lists all Amazon ES domains associated with the package.
     * </p>
     * 
     * @param listDomainsForPackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>ListDomainsForPackage</a> </code> operation.
     *            </p>
     * @return listDomainsForPackageResult The response from the
     *         ListDomainsForPackage service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListDomainsForPackageResult listDomainsForPackage(
            ListDomainsForPackageRequest listDomainsForPackageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDomainsForPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsForPackageRequest> request = null;
        Response<ListDomainsForPackageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsForPackageRequestMarshaller()
                        .marshall(listDomainsForPackageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDomainsForPackageResult, JsonUnmarshallerContext> unmarshaller = new ListDomainsForPackageResultJsonUnmarshaller();
            JsonResponseHandler<ListDomainsForPackageResult> responseHandler = new JsonResponseHandler<ListDomainsForPackageResult>(
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
     * List all Elasticsearch instance types that are supported for given
     * ElasticsearchVersion
     * </p>
     * 
     * @param listElasticsearchInstanceTypesRequest <p>
     *            Container for the parameters to the
     *            <code> <a>ListElasticsearchInstanceTypes</a> </code>
     *            operation.
     *            </p>
     * @return listElasticsearchInstanceTypesResult The response from the
     *         ListElasticsearchInstanceTypes service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListElasticsearchInstanceTypesResult listElasticsearchInstanceTypes(
            ListElasticsearchInstanceTypesRequest listElasticsearchInstanceTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listElasticsearchInstanceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListElasticsearchInstanceTypesRequest> request = null;
        Response<ListElasticsearchInstanceTypesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListElasticsearchInstanceTypesRequestMarshaller()
                        .marshall(listElasticsearchInstanceTypesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListElasticsearchInstanceTypesResult, JsonUnmarshallerContext> unmarshaller = new ListElasticsearchInstanceTypesResultJsonUnmarshaller();
            JsonResponseHandler<ListElasticsearchInstanceTypesResult> responseHandler = new JsonResponseHandler<ListElasticsearchInstanceTypesResult>(
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
     * List all supported Elasticsearch versions
     * </p>
     * 
     * @param listElasticsearchVersionsRequest <p>
     *            Container for the parameters to the
     *            <code> <a>ListElasticsearchVersions</a> </code> operation.
     *            <p>
     *            Use <code> <a>MaxResults</a> </code> to control the maximum
     *            number of results to retrieve in a single call.
     *            </p>
     *            <p>
     *            Use <code> <a>NextToken</a> </code> in response to retrieve
     *            more results. If the received response does not contain a
     *            NextToken, then there are no more results to retrieve.
     *            </p>
     *            </p>
     * @return listElasticsearchVersionsResult The response from the
     *         ListElasticsearchVersions service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListElasticsearchVersionsResult listElasticsearchVersions(
            ListElasticsearchVersionsRequest listElasticsearchVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listElasticsearchVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListElasticsearchVersionsRequest> request = null;
        Response<ListElasticsearchVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListElasticsearchVersionsRequestMarshaller()
                        .marshall(listElasticsearchVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListElasticsearchVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListElasticsearchVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListElasticsearchVersionsResult> responseHandler = new JsonResponseHandler<ListElasticsearchVersionsResult>(
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
     * Lists all packages associated with the Amazon ES domain.
     * </p>
     * 
     * @param listPackagesForDomainRequest <p>
     *            Container for request parameters to
     *            <code> <a>ListPackagesForDomain</a> </code> operation.
     *            </p>
     * @return listPackagesForDomainResult The response from the
     *         ListPackagesForDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListPackagesForDomainResult listPackagesForDomain(
            ListPackagesForDomainRequest listPackagesForDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPackagesForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackagesForDomainRequest> request = null;
        Response<ListPackagesForDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackagesForDomainRequestMarshaller()
                        .marshall(listPackagesForDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPackagesForDomainResult, JsonUnmarshallerContext> unmarshaller = new ListPackagesForDomainResultJsonUnmarshaller();
            JsonResponseHandler<ListPackagesForDomainResult> responseHandler = new JsonResponseHandler<ListPackagesForDomainResult>(
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
     * Returns all tags for the given Elasticsearch domain.
     * </p>
     * 
     * @param listTagsRequest <p>
     *            Container for the parameters to the
     *            <code><a>ListTags</a></code> operation. Specify the
     *            <code>ARN</code> for the Elasticsearch domain to which the
     *            tags are attached that you want to view are attached.
     *            </p>
     * @return listTagsResult The response from the ListTags service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListTagsResult listTags(ListTagsRequest listTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestMarshaller().marshall(listTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsResult, JsonUnmarshallerContext> unmarshaller = new ListTagsResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsResult> responseHandler = new JsonResponseHandler<ListTagsResult>(
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
     * Allows you to purchase reserved Elasticsearch instances.
     * </p>
     * 
     * @param purchaseReservedElasticsearchInstanceOfferingRequest <p>
     *            Container for parameters to
     *            <code>PurchaseReservedElasticsearchInstanceOffering</code>
     *            </p>
     * @return purchaseReservedElasticsearchInstanceOfferingResult The response
     *         from the PurchaseReservedElasticsearchInstanceOffering service
     *         method, as returned by Amazon Elasticsearch Service.
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PurchaseReservedElasticsearchInstanceOfferingResult purchaseReservedElasticsearchInstanceOffering(
            PurchaseReservedElasticsearchInstanceOfferingRequest purchaseReservedElasticsearchInstanceOfferingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(purchaseReservedElasticsearchInstanceOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedElasticsearchInstanceOfferingRequest> request = null;
        Response<PurchaseReservedElasticsearchInstanceOfferingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedElasticsearchInstanceOfferingRequestMarshaller()
                        .marshall(purchaseReservedElasticsearchInstanceOfferingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PurchaseReservedElasticsearchInstanceOfferingResult, JsonUnmarshallerContext> unmarshaller = new PurchaseReservedElasticsearchInstanceOfferingResultJsonUnmarshaller();
            JsonResponseHandler<PurchaseReservedElasticsearchInstanceOfferingResult> responseHandler = new JsonResponseHandler<PurchaseReservedElasticsearchInstanceOfferingResult>(
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
     * Removes the specified set of tags from the specified Elasticsearch
     * domain.
     * </p>
     * 
     * @param removeTagsRequest <p>
     *            Container for the parameters to the
     *            <code><a>RemoveTags</a></code> operation. Specify the
     *            <code>ARN</code> for the Elasticsearch domain from which you
     *            want to remove the specified <code>TagKey</code>.
     *            </p>
     * @throws BaseException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public void removeTags(RemoveTagsRequest removeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestMarshaller().marshall(removeTagsRequest);
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
     * Schedules a service software update for an Amazon ES domain.
     * </p>
     * 
     * @param startElasticsearchServiceSoftwareUpdateRequest <p>
     *            Container for the parameters to the
     *            <code><a>StartElasticsearchServiceSoftwareUpdate</a></code>
     *            operation. Specifies the name of the Elasticsearch domain that
     *            you wish to schedule a service software update on.
     *            </p>
     * @return startElasticsearchServiceSoftwareUpdateResult The response from
     *         the StartElasticsearchServiceSoftwareUpdate service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public StartElasticsearchServiceSoftwareUpdateResult startElasticsearchServiceSoftwareUpdate(
            StartElasticsearchServiceSoftwareUpdateRequest startElasticsearchServiceSoftwareUpdateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startElasticsearchServiceSoftwareUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartElasticsearchServiceSoftwareUpdateRequest> request = null;
        Response<StartElasticsearchServiceSoftwareUpdateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartElasticsearchServiceSoftwareUpdateRequestMarshaller()
                        .marshall(startElasticsearchServiceSoftwareUpdateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartElasticsearchServiceSoftwareUpdateResult, JsonUnmarshallerContext> unmarshaller = new StartElasticsearchServiceSoftwareUpdateResultJsonUnmarshaller();
            JsonResponseHandler<StartElasticsearchServiceSoftwareUpdateResult> responseHandler = new JsonResponseHandler<StartElasticsearchServiceSoftwareUpdateResult>(
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
     * Modifies the cluster configuration of the specified Elasticsearch domain,
     * setting as setting the instance type and the number of instances.
     * </p>
     * 
     * @param updateElasticsearchDomainConfigRequest <p>
     *            Container for the parameters to the
     *            <code><a>UpdateElasticsearchDomain</a></code> operation.
     *            Specifies the type and number of instances in the domain
     *            cluster.
     *            </p>
     * @return updateElasticsearchDomainConfigResult The response from the
     *         UpdateElasticsearchDomainConfig service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateElasticsearchDomainConfigResult updateElasticsearchDomainConfig(
            UpdateElasticsearchDomainConfigRequest updateElasticsearchDomainConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateElasticsearchDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateElasticsearchDomainConfigRequest> request = null;
        Response<UpdateElasticsearchDomainConfigResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateElasticsearchDomainConfigRequestMarshaller()
                        .marshall(updateElasticsearchDomainConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateElasticsearchDomainConfigResult, JsonUnmarshallerContext> unmarshaller = new UpdateElasticsearchDomainConfigResultJsonUnmarshaller();
            JsonResponseHandler<UpdateElasticsearchDomainConfigResult> responseHandler = new JsonResponseHandler<UpdateElasticsearchDomainConfigResult>(
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
     * Allows you to either upgrade your domain or perform an Upgrade
     * eligibility check to a compatible Elasticsearch version.
     * </p>
     * 
     * @param upgradeElasticsearchDomainRequest <p>
     *            Container for request parameters to
     *            <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
     *            </p>
     * @return upgradeElasticsearchDomainResult The response from the
     *         UpgradeElasticsearchDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpgradeElasticsearchDomainResult upgradeElasticsearchDomain(
            UpgradeElasticsearchDomainRequest upgradeElasticsearchDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(upgradeElasticsearchDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpgradeElasticsearchDomainRequest> request = null;
        Response<UpgradeElasticsearchDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpgradeElasticsearchDomainRequestMarshaller()
                        .marshall(upgradeElasticsearchDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpgradeElasticsearchDomainResult, JsonUnmarshallerContext> unmarshaller = new UpgradeElasticsearchDomainResultJsonUnmarshaller();
            JsonResponseHandler<UpgradeElasticsearchDomainResult> responseHandler = new JsonResponseHandler<UpgradeElasticsearchDomainResult>(
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
