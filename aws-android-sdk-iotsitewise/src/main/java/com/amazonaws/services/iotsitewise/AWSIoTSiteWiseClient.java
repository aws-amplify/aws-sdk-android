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

package com.amazonaws.services.iotsitewise;

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

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.services.iotsitewise.model.transform.*;

/**
 * Client for accessing AWS IoT SiteWise. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Welcome to the AWS IoT SiteWise API Reference. AWS IoT SiteWise is an AWS
 * service that connects <a href=
 * "https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications"
 * >Industrial Internet of Things (IIoT)</a> devices to the power of the AWS
 * Cloud. For more information, see the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/">AWS IoT
 * SiteWise User Guide</a>. For information about AWS IoT SiteWise quotas, see
 * <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
 * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
 * </p>
 */
public class AWSIoTSiteWiseClient extends AmazonWebServiceClient implements AWSIoTSiteWise {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS IoT SiteWise exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSIoTSiteWise. A
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
    public AWSIoTSiteWiseClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSIoTSiteWise. A
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
     *            how this client connects to AWSIoTSiteWise (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSIoTSiteWiseClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSIoTSiteWise using
     * the specified AWS account credentials.
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
     *         AWSIoTSiteWiseClient client = new AWSIoTSiteWiseClient(AWSMobileClient.getInstance());
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
    public AWSIoTSiteWiseClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSIoTSiteWise using
     * the specified AWS account credentials and client configuration options.
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
     *         AWSIoTSiteWiseClient client = new AWSIoTSiteWiseClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSIoTSiteWise (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSIoTSiteWiseClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSIoTSiteWise using
     * the specified AWS account credentials provider.
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
     *         AWSIoTSiteWiseClient client = new AWSIoTSiteWiseClient(AWSMobileClient.getInstance());
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
    public AWSIoTSiteWiseClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSIoTSiteWise using
     * the specified AWS account credentials provider and client configuration
     * options.
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
     *         AWSIoTSiteWiseClient client = new AWSIoTSiteWiseClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSIoTSiteWise (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSIoTSiteWiseClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSIoTSiteWise using
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
     *            how this client connects to AWSIoTSiteWise (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSIoTSiteWiseClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSIoTSiteWise using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
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
     *         AWSIoTSiteWiseClient client = new AWSIoTSiteWiseClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSIoTSiteWise (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSIoTSiteWiseClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ConflictingOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("iotsitewise.us-east-1.amazonaws.com");
        this.endpointPrefix = "iotsitewise";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/iotsitewise/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/iotsitewise/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Associates a child asset with the given parent asset through a hierarchy
     * defined in the parent asset's model. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/add-associated-assets.html"
     * >Associating Assets</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param associateAssetsRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void associateAssets(AssociateAssetsRequest associateAssetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAssetsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAssetsRequestMarshaller().marshall(associateAssetsRequest);
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
     * Associates a group (batch) of assets with an AWS IoT SiteWise Monitor
     * project.
     * </p>
     * 
     * @param batchAssociateProjectAssetsRequest
     * @return batchAssociateProjectAssetsResult The response from the
     *         BatchAssociateProjectAssets service method, as returned by AWS
     *         IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchAssociateProjectAssetsResult batchAssociateProjectAssets(
            BatchAssociateProjectAssetsRequest batchAssociateProjectAssetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchAssociateProjectAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchAssociateProjectAssetsRequest> request = null;
        Response<BatchAssociateProjectAssetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchAssociateProjectAssetsRequestMarshaller()
                        .marshall(batchAssociateProjectAssetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchAssociateProjectAssetsResult, JsonUnmarshallerContext> unmarshaller = new BatchAssociateProjectAssetsResultJsonUnmarshaller();
            JsonResponseHandler<BatchAssociateProjectAssetsResult> responseHandler = new JsonResponseHandler<BatchAssociateProjectAssetsResult>(
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
     * Disassociates a group (batch) of assets from an AWS IoT SiteWise Monitor
     * project.
     * </p>
     * 
     * @param batchDisassociateProjectAssetsRequest
     * @return batchDisassociateProjectAssetsResult The response from the
     *         BatchDisassociateProjectAssets service method, as returned by AWS
     *         IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDisassociateProjectAssetsResult batchDisassociateProjectAssets(
            BatchDisassociateProjectAssetsRequest batchDisassociateProjectAssetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDisassociateProjectAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisassociateProjectAssetsRequest> request = null;
        Response<BatchDisassociateProjectAssetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisassociateProjectAssetsRequestMarshaller()
                        .marshall(batchDisassociateProjectAssetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDisassociateProjectAssetsResult, JsonUnmarshallerContext> unmarshaller = new BatchDisassociateProjectAssetsResultJsonUnmarshaller();
            JsonResponseHandler<BatchDisassociateProjectAssetsResult> responseHandler = new JsonResponseHandler<BatchDisassociateProjectAssetsResult>(
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
     * Sends a list of asset property values to AWS IoT SiteWise. Each value is
     * a timestamp-quality-value (TQV) data point. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/ingest-api.html"
     * >Ingesting Data Using the API</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an
     * asset property's alias, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * With respect to Unix epoch time, AWS IoT SiteWise accepts only TQVs that
     * have a timestamp of no more than 15 minutes in the past and no more than
     * 5 minutes in the future. AWS IoT SiteWise rejects timestamps outside of
     * the inclusive range of [-15, +5] minutes and returns a
     * <code>TimestampOutOfRangeException</code> error.
     * </p>
     * <p>
     * For each asset property, AWS IoT SiteWise overwrites TQVs with duplicate
     * timestamps unless the newer TQV has a different quality. For example, if
     * you store a TQV <code>{T1, GOOD, V1}</code>, then storing
     * <code>{T1, GOOD, V2}</code> replaces the existing TQV.
     * </p>
     * </important>
     * 
     * @param batchPutAssetPropertyValueRequest
     * @return batchPutAssetPropertyValueResult The response from the
     *         BatchPutAssetPropertyValue service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ServiceUnavailableException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchPutAssetPropertyValueResult batchPutAssetPropertyValue(
            BatchPutAssetPropertyValueRequest batchPutAssetPropertyValueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchPutAssetPropertyValueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutAssetPropertyValueRequest> request = null;
        Response<BatchPutAssetPropertyValueResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutAssetPropertyValueRequestMarshaller()
                        .marshall(batchPutAssetPropertyValueRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchPutAssetPropertyValueResult, JsonUnmarshallerContext> unmarshaller = new BatchPutAssetPropertyValueResultJsonUnmarshaller();
            JsonResponseHandler<BatchPutAssetPropertyValueResult> responseHandler = new JsonResponseHandler<BatchPutAssetPropertyValueResult>(
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
     * Creates an access policy that grants the specified AWS Single Sign-On
     * user or group access to the specified AWS IoT SiteWise Monitor portal or
     * project resource.
     * </p>
     * 
     * @param createAccessPolicyRequest
     * @return createAccessPolicyResult The response from the CreateAccessPolicy
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateAccessPolicyResult createAccessPolicy(
            CreateAccessPolicyRequest createAccessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessPolicyRequest> request = null;
        Response<CreateAccessPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessPolicyRequestMarshaller()
                        .marshall(createAccessPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAccessPolicyResult, JsonUnmarshallerContext> unmarshaller = new CreateAccessPolicyResultJsonUnmarshaller();
            JsonResponseHandler<CreateAccessPolicyResult> responseHandler = new JsonResponseHandler<CreateAccessPolicyResult>(
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
     * Creates an asset from an existing asset model. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-assets.html"
     * >Creating Assets</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetRequest
     * @return createAssetResult The response from the CreateAsset service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateAssetResult createAsset(CreateAssetRequest createAssetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssetRequest> request = null;
        Response<CreateAssetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssetRequestMarshaller().marshall(createAssetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAssetResult, JsonUnmarshallerContext> unmarshaller = new CreateAssetResultJsonUnmarshaller();
            JsonResponseHandler<CreateAssetResult> responseHandler = new JsonResponseHandler<CreateAssetResult>(
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
     * Creates an asset model from specified property and hierarchy definitions.
     * You create assets from asset models. With asset models, you can easily
     * create assets of the same type that have standardized definitions. Each
     * asset created from a model inherits the asset model's property and
     * hierarchy definitions. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html"
     * >Defining Asset Models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetModelRequest
     * @return createAssetModelResult The response from the CreateAssetModel
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateAssetModelResult createAssetModel(CreateAssetModelRequest createAssetModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAssetModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssetModelRequest> request = null;
        Response<CreateAssetModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssetModelRequestMarshaller().marshall(createAssetModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAssetModelResult, JsonUnmarshallerContext> unmarshaller = new CreateAssetModelResultJsonUnmarshaller();
            JsonResponseHandler<CreateAssetModelResult> responseHandler = new JsonResponseHandler<CreateAssetModelResult>(
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
     * Creates a dashboard in an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param createDashboardRequest
     * @return createDashboardResult The response from the CreateDashboard
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDashboardResult createDashboard(CreateDashboardRequest createDashboardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDashboardRequest> request = null;
        Response<CreateDashboardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDashboardRequestMarshaller().marshall(createDashboardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDashboardResult, JsonUnmarshallerContext> unmarshaller = new CreateDashboardResultJsonUnmarshaller();
            JsonResponseHandler<CreateDashboardResult> responseHandler = new JsonResponseHandler<CreateDashboardResult>(
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
     * Creates a gateway, which is a virtual or edge device that delivers
     * industrial data streams from local servers to AWS IoT SiteWise. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html"
     * >Ingesting data using a gateway</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * 
     * @param createGatewayRequest
     * @return createGatewayResult The response from the CreateGateway service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateGatewayResult createGateway(CreateGatewayRequest createGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGatewayRequest> request = null;
        Response<CreateGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGatewayRequestMarshaller().marshall(createGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGatewayResult, JsonUnmarshallerContext> unmarshaller = new CreateGatewayResultJsonUnmarshaller();
            JsonResponseHandler<CreateGatewayResult> responseHandler = new JsonResponseHandler<CreateGatewayResult>(
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
     * Creates a portal, which can contain projects and dashboards. Before you
     * can create a portal, you must configure AWS Single Sign-On in the current
     * Region. AWS IoT SiteWise Monitor uses AWS SSO to manage user permissions.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso"
     * >Enabling AWS SSO</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Before you can sign in to a new portal, you must add at least one AWS SSO
     * user or group to that portal. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins"
     * >Adding or Removing Portal Administrators</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createPortalRequest
     * @return createPortalResult The response from the CreatePortal service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreatePortalResult createPortal(CreatePortalRequest createPortalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePortalRequest> request = null;
        Response<CreatePortalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePortalRequestMarshaller().marshall(createPortalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePortalResult, JsonUnmarshallerContext> unmarshaller = new CreatePortalResultJsonUnmarshaller();
            JsonResponseHandler<CreatePortalResult> responseHandler = new JsonResponseHandler<CreatePortalResult>(
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
     * Creates a project in the specified portal.
     * </p>
     * 
     * @param createProjectRequest
     * @return createProjectResult The response from the CreateProject service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateProjectResult createProject(CreateProjectRequest createProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestMarshaller().marshall(createProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProjectResult, JsonUnmarshallerContext> unmarshaller = new CreateProjectResultJsonUnmarshaller();
            JsonResponseHandler<CreateProjectResult> responseHandler = new JsonResponseHandler<CreateProjectResult>(
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
     * Deletes an access policy that grants the specified AWS Single Sign-On
     * identity access to the specified AWS IoT SiteWise Monitor resource. You
     * can use this operation to revoke access to an AWS IoT SiteWise Monitor
     * resource.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @return deleteAccessPolicyResult The response from the DeleteAccessPolicy
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteAccessPolicyResult deleteAccessPolicy(
            DeleteAccessPolicyRequest deleteAccessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPolicyRequest> request = null;
        Response<DeleteAccessPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessPolicyRequestMarshaller()
                        .marshall(deleteAccessPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAccessPolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteAccessPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAccessPolicyResult> responseHandler = new JsonResponseHandler<DeleteAccessPolicyResult>(
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
     * Deletes an asset. This action can't be undone. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html"
     * >Deleting Assets and Models</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can't delete an asset that's associated to another asset. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DisassociateAssets.html"
     * >DisassociateAssets</a>.
     * </p>
     * </note>
     * 
     * @param deleteAssetRequest
     * @return deleteAssetResult The response from the DeleteAsset service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteAssetResult deleteAsset(DeleteAssetRequest deleteAssetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssetRequest> request = null;
        Response<DeleteAssetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssetRequestMarshaller().marshall(deleteAssetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAssetResult, JsonUnmarshallerContext> unmarshaller = new DeleteAssetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAssetResult> responseHandler = new JsonResponseHandler<DeleteAssetResult>(
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
     * Deletes an asset model. This action can't be undone. You must delete all
     * assets created from an asset model before you can delete the model. Also,
     * you can't delete an asset model if a parent asset model exists that
     * contains a property formula expression that depends on the asset model
     * that you want to delete. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html"
     * >Deleting Assets and Models</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * 
     * @param deleteAssetModelRequest
     * @return deleteAssetModelResult The response from the DeleteAssetModel
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteAssetModelResult deleteAssetModel(DeleteAssetModelRequest deleteAssetModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAssetModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssetModelRequest> request = null;
        Response<DeleteAssetModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssetModelRequestMarshaller().marshall(deleteAssetModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAssetModelResult, JsonUnmarshallerContext> unmarshaller = new DeleteAssetModelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAssetModelResult> responseHandler = new JsonResponseHandler<DeleteAssetModelResult>(
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
     * Deletes a dashboard from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return deleteDashboardResult The response from the DeleteDashboard
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDashboardResult deleteDashboard(DeleteDashboardRequest deleteDashboardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDashboardRequest> request = null;
        Response<DeleteDashboardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDashboardRequestMarshaller().marshall(deleteDashboardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDashboardResult, JsonUnmarshallerContext> unmarshaller = new DeleteDashboardResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDashboardResult> responseHandler = new JsonResponseHandler<DeleteDashboardResult>(
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
     * Deletes a gateway from AWS IoT SiteWise. When you delete a gateway, some
     * of the gateway's files remain in your gateway's file system. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-retention.html"
     * >Data retention</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteGateway(DeleteGatewayRequest deleteGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayRequestMarshaller().marshall(deleteGatewayRequest);
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
     * Deletes a portal from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deletePortalRequest
     * @return deletePortalResult The response from the DeletePortal service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeletePortalResult deletePortal(DeletePortalRequest deletePortalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePortalRequest> request = null;
        Response<DeletePortalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePortalRequestMarshaller().marshall(deletePortalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePortalResult, JsonUnmarshallerContext> unmarshaller = new DeletePortalResultJsonUnmarshaller();
            JsonResponseHandler<DeletePortalResult> responseHandler = new JsonResponseHandler<DeletePortalResult>(
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
     * Deletes a project from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return deleteProjectResult The response from the DeleteProject service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestMarshaller().marshall(deleteProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProjectResult, JsonUnmarshallerContext> unmarshaller = new DeleteProjectResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProjectResult> responseHandler = new JsonResponseHandler<DeleteProjectResult>(
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
     * Describes an access policy, which specifies an AWS SSO user or group's
     * access to an AWS IoT SiteWise Monitor portal or project.
     * </p>
     * 
     * @param describeAccessPolicyRequest
     * @return describeAccessPolicyResult The response from the
     *         DescribeAccessPolicy service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAccessPolicyResult describeAccessPolicy(
            DescribeAccessPolicyRequest describeAccessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccessPolicyRequest> request = null;
        Response<DescribeAccessPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccessPolicyRequestMarshaller()
                        .marshall(describeAccessPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAccessPolicyResult, JsonUnmarshallerContext> unmarshaller = new DescribeAccessPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAccessPolicyResult> responseHandler = new JsonResponseHandler<DescribeAccessPolicyResult>(
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
     * Retrieves information about an asset.
     * </p>
     * 
     * @param describeAssetRequest
     * @return describeAssetResult The response from the DescribeAsset service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAssetResult describeAsset(DescribeAssetRequest describeAssetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssetRequest> request = null;
        Response<DescribeAssetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssetRequestMarshaller().marshall(describeAssetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAssetResult, JsonUnmarshallerContext> unmarshaller = new DescribeAssetResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAssetResult> responseHandler = new JsonResponseHandler<DescribeAssetResult>(
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
     * Retrieves information about an asset model.
     * </p>
     * 
     * @param describeAssetModelRequest
     * @return describeAssetModelResult The response from the DescribeAssetModel
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAssetModelResult describeAssetModel(
            DescribeAssetModelRequest describeAssetModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAssetModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssetModelRequest> request = null;
        Response<DescribeAssetModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssetModelRequestMarshaller()
                        .marshall(describeAssetModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAssetModelResult, JsonUnmarshallerContext> unmarshaller = new DescribeAssetModelResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAssetModelResult> responseHandler = new JsonResponseHandler<DescribeAssetModelResult>(
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
     * Retrieves information about an asset's property.
     * </p>
     * 
     * @param describeAssetPropertyRequest
     * @return describeAssetPropertyResult The response from the
     *         DescribeAssetProperty service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAssetPropertyResult describeAssetProperty(
            DescribeAssetPropertyRequest describeAssetPropertyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAssetPropertyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssetPropertyRequest> request = null;
        Response<DescribeAssetPropertyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssetPropertyRequestMarshaller()
                        .marshall(describeAssetPropertyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAssetPropertyResult, JsonUnmarshallerContext> unmarshaller = new DescribeAssetPropertyResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAssetPropertyResult> responseHandler = new JsonResponseHandler<DescribeAssetPropertyResult>(
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
     * Retrieves information about a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return describeDashboardResult The response from the DescribeDashboard
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDashboardResult describeDashboard(
            DescribeDashboardRequest describeDashboardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDashboardRequest> request = null;
        Response<DescribeDashboardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDashboardRequestMarshaller()
                        .marshall(describeDashboardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDashboardResult, JsonUnmarshallerContext> unmarshaller = new DescribeDashboardResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDashboardResult> responseHandler = new JsonResponseHandler<DescribeDashboardResult>(
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
     * Retrieves information about a gateway.
     * </p>
     * 
     * @param describeGatewayRequest
     * @return describeGatewayResult The response from the DescribeGateway
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeGatewayResult describeGateway(DescribeGatewayRequest describeGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayRequest> request = null;
        Response<DescribeGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayRequestMarshaller().marshall(describeGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeGatewayResult, JsonUnmarshallerContext> unmarshaller = new DescribeGatewayResultJsonUnmarshaller();
            JsonResponseHandler<DescribeGatewayResult> responseHandler = new JsonResponseHandler<DescribeGatewayResult>(
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
     * Retrieves information about a gateway capability configuration. Each
     * gateway capability defines data sources for a gateway. A capability
     * configuration can contain multiple data source configurations. If you
     * define OPC-UA sources for a gateway in the AWS IoT SiteWise console, all
     * of your OPC-UA sources are stored in one capability configuration. To
     * list all capability configurations for a gateway, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html"
     * >DescribeGateway</a>.
     * </p>
     * 
     * @param describeGatewayCapabilityConfigurationRequest
     * @return describeGatewayCapabilityConfigurationResult The response from
     *         the DescribeGatewayCapabilityConfiguration service method, as
     *         returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeGatewayCapabilityConfigurationResult describeGatewayCapabilityConfiguration(
            DescribeGatewayCapabilityConfigurationRequest describeGatewayCapabilityConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeGatewayCapabilityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayCapabilityConfigurationRequest> request = null;
        Response<DescribeGatewayCapabilityConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayCapabilityConfigurationRequestMarshaller()
                        .marshall(describeGatewayCapabilityConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeGatewayCapabilityConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DescribeGatewayCapabilityConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeGatewayCapabilityConfigurationResult> responseHandler = new JsonResponseHandler<DescribeGatewayCapabilityConfigurationResult>(
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
     * Retrieves the current AWS IoT SiteWise logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return describeLoggingOptionsResult The response from the
     *         DescribeLoggingOptions service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLoggingOptionsResult describeLoggingOptions(
            DescribeLoggingOptionsRequest describeLoggingOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoggingOptionsRequest> request = null;
        Response<DescribeLoggingOptionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoggingOptionsRequestMarshaller()
                        .marshall(describeLoggingOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLoggingOptionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeLoggingOptionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLoggingOptionsResult> responseHandler = new JsonResponseHandler<DescribeLoggingOptionsResult>(
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
     * Retrieves information about a portal.
     * </p>
     * 
     * @param describePortalRequest
     * @return describePortalResult The response from the DescribePortal service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribePortalResult describePortal(DescribePortalRequest describePortalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePortalRequest> request = null;
        Response<DescribePortalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePortalRequestMarshaller().marshall(describePortalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePortalResult, JsonUnmarshallerContext> unmarshaller = new DescribePortalResultJsonUnmarshaller();
            JsonResponseHandler<DescribePortalResult> responseHandler = new JsonResponseHandler<DescribePortalResult>(
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
     * Retrieves information about a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return describeProjectResult The response from the DescribeProject
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeProjectResult describeProject(DescribeProjectRequest describeProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectRequest> request = null;
        Response<DescribeProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectRequestMarshaller().marshall(describeProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProjectResult, JsonUnmarshallerContext> unmarshaller = new DescribeProjectResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProjectResult> responseHandler = new JsonResponseHandler<DescribeProjectResult>(
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
     * Disassociates a child asset from the given parent asset through a
     * hierarchy defined in the parent asset's model.
     * </p>
     * 
     * @param disassociateAssetsRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void disassociateAssets(DisassociateAssetsRequest disassociateAssetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAssetsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAssetsRequestMarshaller()
                        .marshall(disassociateAssetsRequest);
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
     * Gets aggregated values for an asset property. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#aggregates"
     * >Querying Aggregated Property Values</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an
     * asset property's alias, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyAggregatesRequest
     * @return getAssetPropertyAggregatesResult The response from the
     *         GetAssetPropertyAggregates service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAssetPropertyAggregatesResult getAssetPropertyAggregates(
            GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAssetPropertyAggregatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetPropertyAggregatesRequest> request = null;
        Response<GetAssetPropertyAggregatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetPropertyAggregatesRequestMarshaller()
                        .marshall(getAssetPropertyAggregatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAssetPropertyAggregatesResult, JsonUnmarshallerContext> unmarshaller = new GetAssetPropertyAggregatesResultJsonUnmarshaller();
            JsonResponseHandler<GetAssetPropertyAggregatesResult> responseHandler = new JsonResponseHandler<GetAssetPropertyAggregatesResult>(
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
     * Gets an asset property's current value. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#current-values"
     * >Querying Current Property Values</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an
     * asset property's alias, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueRequest
     * @return getAssetPropertyValueResult The response from the
     *         GetAssetPropertyValue service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAssetPropertyValueResult getAssetPropertyValue(
            GetAssetPropertyValueRequest getAssetPropertyValueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAssetPropertyValueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetPropertyValueRequest> request = null;
        Response<GetAssetPropertyValueResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetPropertyValueRequestMarshaller()
                        .marshall(getAssetPropertyValueRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAssetPropertyValueResult, JsonUnmarshallerContext> unmarshaller = new GetAssetPropertyValueResultJsonUnmarshaller();
            JsonResponseHandler<GetAssetPropertyValueResult> responseHandler = new JsonResponseHandler<GetAssetPropertyValueResult>(
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
     * Gets the history of an asset property's values. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#historical-values"
     * >Querying Historical Property Values</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an
     * asset property's alias, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueHistoryRequest
     * @return getAssetPropertyValueHistoryResult The response from the
     *         GetAssetPropertyValueHistory service method, as returned by AWS
     *         IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAssetPropertyValueHistoryResult getAssetPropertyValueHistory(
            GetAssetPropertyValueHistoryRequest getAssetPropertyValueHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAssetPropertyValueHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetPropertyValueHistoryRequest> request = null;
        Response<GetAssetPropertyValueHistoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetPropertyValueHistoryRequestMarshaller()
                        .marshall(getAssetPropertyValueHistoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAssetPropertyValueHistoryResult, JsonUnmarshallerContext> unmarshaller = new GetAssetPropertyValueHistoryResultJsonUnmarshaller();
            JsonResponseHandler<GetAssetPropertyValueHistoryResult> responseHandler = new JsonResponseHandler<GetAssetPropertyValueHistoryResult>(
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
     * Retrieves a paginated list of access policies for an AWS SSO identity (a
     * user or group) or an AWS IoT SiteWise Monitor resource (a portal or
     * project).
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return listAccessPoliciesResult The response from the ListAccessPolicies
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAccessPoliciesResult listAccessPolicies(
            ListAccessPoliciesRequest listAccessPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAccessPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessPoliciesRequest> request = null;
        Response<ListAccessPoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessPoliciesRequestMarshaller()
                        .marshall(listAccessPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAccessPoliciesResult, JsonUnmarshallerContext> unmarshaller = new ListAccessPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<ListAccessPoliciesResult> responseHandler = new JsonResponseHandler<ListAccessPoliciesResult>(
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
     * Retrieves a paginated list of summaries of all asset models.
     * </p>
     * 
     * @param listAssetModelsRequest
     * @return listAssetModelsResult The response from the ListAssetModels
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAssetModelsResult listAssetModels(ListAssetModelsRequest listAssetModelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAssetModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssetModelsRequest> request = null;
        Response<ListAssetModelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssetModelsRequestMarshaller().marshall(listAssetModelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAssetModelsResult, JsonUnmarshallerContext> unmarshaller = new ListAssetModelsResultJsonUnmarshaller();
            JsonResponseHandler<ListAssetModelsResult> responseHandler = new JsonResponseHandler<ListAssetModelsResult>(
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
     * Retrieves a paginated list of asset summaries.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List assets based on a specific asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * List top-level assets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't use this operation to list all assets. To retrieve summaries
     * for all of your assets, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_ListAssetModels.html"
     * >ListAssetModels</a> to get all of your asset model IDs. Then, use
     * ListAssets to get all assets for each asset model.
     * </p>
     * 
     * @param listAssetsRequest
     * @return listAssetsResult The response from the ListAssets service method,
     *         as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAssetsResult listAssets(ListAssetsRequest listAssetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssetsRequest> request = null;
        Response<ListAssetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssetsRequestMarshaller().marshall(listAssetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAssetsResult, JsonUnmarshallerContext> unmarshaller = new ListAssetsResultJsonUnmarshaller();
            JsonResponseHandler<ListAssetsResult> responseHandler = new JsonResponseHandler<ListAssetsResult>(
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
     * Retrieves a paginated list of the assets associated to a parent asset (
     * <code>assetId</code>) by a given hierarchy (<code>hierarchyId</code>).
     * </p>
     * 
     * @param listAssociatedAssetsRequest
     * @return listAssociatedAssetsResult The response from the
     *         ListAssociatedAssets service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAssociatedAssetsResult listAssociatedAssets(
            ListAssociatedAssetsRequest listAssociatedAssetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAssociatedAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociatedAssetsRequest> request = null;
        Response<ListAssociatedAssetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociatedAssetsRequestMarshaller()
                        .marshall(listAssociatedAssetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAssociatedAssetsResult, JsonUnmarshallerContext> unmarshaller = new ListAssociatedAssetsResultJsonUnmarshaller();
            JsonResponseHandler<ListAssociatedAssetsResult> responseHandler = new JsonResponseHandler<ListAssociatedAssetsResult>(
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
     * Retrieves a paginated list of dashboards for an AWS IoT SiteWise Monitor
     * project.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return listDashboardsResult The response from the ListDashboards service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDashboardsResult listDashboards(ListDashboardsRequest listDashboardsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDashboardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDashboardsRequest> request = null;
        Response<ListDashboardsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDashboardsRequestMarshaller().marshall(listDashboardsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDashboardsResult, JsonUnmarshallerContext> unmarshaller = new ListDashboardsResultJsonUnmarshaller();
            JsonResponseHandler<ListDashboardsResult> responseHandler = new JsonResponseHandler<ListDashboardsResult>(
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
     * Retrieves a paginated list of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return listGatewaysResult The response from the ListGateways service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewaysRequest> request = null;
        Response<ListGatewaysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewaysRequestMarshaller().marshall(listGatewaysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGatewaysResult, JsonUnmarshallerContext> unmarshaller = new ListGatewaysResultJsonUnmarshaller();
            JsonResponseHandler<ListGatewaysResult> responseHandler = new JsonResponseHandler<ListGatewaysResult>(
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
     * Retrieves a paginated list of AWS IoT SiteWise Monitor portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @return listPortalsResult The response from the ListPortals service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListPortalsResult listPortals(ListPortalsRequest listPortalsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPortalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPortalsRequest> request = null;
        Response<ListPortalsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPortalsRequestMarshaller().marshall(listPortalsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPortalsResult, JsonUnmarshallerContext> unmarshaller = new ListPortalsResultJsonUnmarshaller();
            JsonResponseHandler<ListPortalsResult> responseHandler = new JsonResponseHandler<ListPortalsResult>(
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
     * Retrieves a paginated list of assets associated with an AWS IoT SiteWise
     * Monitor project.
     * </p>
     * 
     * @param listProjectAssetsRequest
     * @return listProjectAssetsResult The response from the ListProjectAssets
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListProjectAssetsResult listProjectAssets(
            ListProjectAssetsRequest listProjectAssetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProjectAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectAssetsRequest> request = null;
        Response<ListProjectAssetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectAssetsRequestMarshaller()
                        .marshall(listProjectAssetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProjectAssetsResult, JsonUnmarshallerContext> unmarshaller = new ListProjectAssetsResultJsonUnmarshaller();
            JsonResponseHandler<ListProjectAssetsResult> responseHandler = new JsonResponseHandler<ListProjectAssetsResult>(
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
     * Retrieves a paginated list of projects for an AWS IoT SiteWise Monitor
     * portal.
     * </p>
     * 
     * @param listProjectsRequest
     * @return listProjectsResult The response from the ListProjects service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestMarshaller().marshall(listProjectsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProjectsResult, JsonUnmarshallerContext> unmarshaller = new ListProjectsResultJsonUnmarshaller();
            JsonResponseHandler<ListProjectsResult> responseHandler = new JsonResponseHandler<ListProjectsResult>(
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
     * Retrieves the list of tags for an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
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
     * Sets logging options for AWS IoT SiteWise.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return putLoggingOptionsResult The response from the PutLoggingOptions
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ConflictingOperationException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutLoggingOptionsResult putLoggingOptions(
            PutLoggingOptionsRequest putLoggingOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLoggingOptionsRequest> request = null;
        Response<PutLoggingOptionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLoggingOptionsRequestMarshaller()
                        .marshall(putLoggingOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutLoggingOptionsResult, JsonUnmarshallerContext> unmarshaller = new PutLoggingOptionsResultJsonUnmarshaller();
            JsonResponseHandler<PutLoggingOptionsResult> responseHandler = new JsonResponseHandler<PutLoggingOptionsResult>(
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
     * Adds tags to an AWS IoT SiteWise resource. If a tag already exists for
     * the resource, this operation updates the tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
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
     * Removes a tag from an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
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
     * Updates an existing access policy that specifies an AWS SSO user or
     * group's access to an AWS IoT SiteWise Monitor portal or project resource.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @return updateAccessPolicyResult The response from the UpdateAccessPolicy
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAccessPolicyResult updateAccessPolicy(
            UpdateAccessPolicyRequest updateAccessPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAccessPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccessPolicyRequest> request = null;
        Response<UpdateAccessPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccessPolicyRequestMarshaller()
                        .marshall(updateAccessPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAccessPolicyResult, JsonUnmarshallerContext> unmarshaller = new UpdateAccessPolicyResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAccessPolicyResult> responseHandler = new JsonResponseHandler<UpdateAccessPolicyResult>(
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
     * Updates an asset's name. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html"
     * >Updating Assets and Models</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * 
     * @param updateAssetRequest
     * @return updateAssetResult The response from the UpdateAsset service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAssetResult updateAsset(UpdateAssetRequest updateAssetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssetRequest> request = null;
        Response<UpdateAssetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssetRequestMarshaller().marshall(updateAssetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAssetResult, JsonUnmarshallerContext> unmarshaller = new UpdateAssetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAssetResult> responseHandler = new JsonResponseHandler<UpdateAssetResult>(
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
     * Updates an asset model and all of the assets that were created from the
     * model. Each asset created from the model inherits the updated asset
     * model's property and hierarchy definitions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html"
     * >Updating Assets and Models</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * This operation overwrites the existing model with the provided model. To
     * avoid deleting your asset model's properties or hierarchies, you must
     * include their IDs and definitions in the updated asset model payload. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html"
     * >DescribeAssetModel</a>.
     * </p>
     * <p>
     * If you remove a property from an asset model or update a property's
     * formula expression, AWS IoT SiteWise deletes all previous data for that
     * property. If you remove a hierarchy definition from an asset model, AWS
     * IoT SiteWise disassociates every asset associated with that hierarchy.
     * You can't change the type or data type of an existing property.
     * </p>
     * </important>
     * 
     * @param updateAssetModelRequest
     * @return updateAssetModelResult The response from the UpdateAssetModel
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAssetModelResult updateAssetModel(UpdateAssetModelRequest updateAssetModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAssetModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssetModelRequest> request = null;
        Response<UpdateAssetModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssetModelRequestMarshaller().marshall(updateAssetModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAssetModelResult, JsonUnmarshallerContext> unmarshaller = new UpdateAssetModelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAssetModelResult> responseHandler = new JsonResponseHandler<UpdateAssetModelResult>(
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
     * Updates an asset property's alias and notification state.
     * </p>
     * <important>
     * <p>
     * This operation overwrites the property's existing alias and notification
     * state. To keep your existing property's alias or notification state, you
     * must include the existing values in the UpdateAssetProperty request. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetProperty.html"
     * >DescribeAssetProperty</a>.
     * </p>
     * </important>
     * 
     * @param updateAssetPropertyRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateAssetProperty(UpdateAssetPropertyRequest updateAssetPropertyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAssetPropertyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssetPropertyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssetPropertyRequestMarshaller()
                        .marshall(updateAssetPropertyRequest);
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
     * Updates an AWS IoT SiteWise Monitor dashboard.
     * </p>
     * 
     * @param updateDashboardRequest
     * @return updateDashboardResult The response from the UpdateDashboard
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDashboardResult updateDashboard(UpdateDashboardRequest updateDashboardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDashboardRequest> request = null;
        Response<UpdateDashboardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDashboardRequestMarshaller().marshall(updateDashboardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDashboardResult, JsonUnmarshallerContext> unmarshaller = new UpdateDashboardResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDashboardResult> responseHandler = new JsonResponseHandler<UpdateDashboardResult>(
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
     * Updates a gateway's name.
     * </p>
     * 
     * @param updateGatewayRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ConflictingOperationException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateGateway(UpdateGatewayRequest updateGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayRequestMarshaller().marshall(updateGatewayRequest);
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
     * Updates a gateway capability configuration or defines a new capability
     * configuration. Each gateway capability defines data sources for a
     * gateway. A capability configuration can contain multiple data source
     * configurations. If you define OPC-UA sources for a gateway in the AWS IoT
     * SiteWise console, all of your OPC-UA sources are stored in one capability
     * configuration. To list all capability configurations for a gateway, use
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html"
     * >DescribeGateway</a>.
     * </p>
     * 
     * @param updateGatewayCapabilityConfigurationRequest
     * @return updateGatewayCapabilityConfigurationResult The response from the
     *         UpdateGatewayCapabilityConfiguration service method, as returned
     *         by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ConflictingOperationException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateGatewayCapabilityConfigurationResult updateGatewayCapabilityConfiguration(
            UpdateGatewayCapabilityConfigurationRequest updateGatewayCapabilityConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGatewayCapabilityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayCapabilityConfigurationRequest> request = null;
        Response<UpdateGatewayCapabilityConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayCapabilityConfigurationRequestMarshaller()
                        .marshall(updateGatewayCapabilityConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGatewayCapabilityConfigurationResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewayCapabilityConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGatewayCapabilityConfigurationResult> responseHandler = new JsonResponseHandler<UpdateGatewayCapabilityConfigurationResult>(
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
     * Updates an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @return updatePortalResult The response from the UpdatePortal service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdatePortalResult updatePortal(UpdatePortalRequest updatePortalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePortalRequest> request = null;
        Response<UpdatePortalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePortalRequestMarshaller().marshall(updatePortalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePortalResult, JsonUnmarshallerContext> unmarshaller = new UpdatePortalResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePortalResult> responseHandler = new JsonResponseHandler<UpdatePortalResult>(
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
     * Updates an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return updateProjectResult The response from the UpdateProject service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestMarshaller().marshall(updateProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateProjectResult, JsonUnmarshallerContext> unmarshaller = new UpdateProjectResultJsonUnmarshaller();
            JsonResponseHandler<UpdateProjectResult> responseHandler = new JsonResponseHandler<UpdateProjectResult>(
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
