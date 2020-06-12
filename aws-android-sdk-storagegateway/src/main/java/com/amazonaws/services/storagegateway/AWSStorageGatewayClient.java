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

package com.amazonaws.services.storagegateway;

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

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.services.storagegateway.model.transform.*;

/**
 * Client for accessing AWS Storage Gateway. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Storage Gateway Service</fullname>
 * <p>
 * AWS Storage Gateway is the service that connects an on-premises software
 * appliance with cloud-based storage to provide seamless and secure integration
 * between an organization's on-premises IT environment and the AWS storage
 * infrastructure. The service enables you to securely upload data to the AWS
 * Cloud for cost effective backup and rapid disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway
 * Service API Reference</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewayHTTPRequestsHeaders"
 * >AWS Storage Gateway required request headers</a>: Describes the required
 * headers that you must send with every POST request to AWS Storage Gateway.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewaySigningRequests"
 * >Signing requests</a>: AWS Storage Gateway requires that you authenticate
 * every request you send; this topic describes how sign such a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#APIErrorResponses"
 * >Error responses</a>: Provides reference information about AWS Storage
 * Gateway errors.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_Operations.html"
 * >Operations in AWS Storage Gateway</a>: Contains detailed descriptions of all
 * AWS Storage Gateway operations, their request parameters, response elements,
 * possible errors, and examples of requests and responses.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/general/latest/gr/sg.html">AWS Storage
 * Gateway endpoints and quotas:</a> Provides a list of each AWS Region and the
 * endpoints available for use with AWS Storage Gateway.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * AWS Storage Gateway resource IDs are in uppercase. When you use these
 * resource IDs with the Amazon EC2 API, EC2 expects resource IDs in lowercase.
 * You must change your resource ID to lowercase to use it with the EC2 API. For
 * example, in Storage Gateway the ID for a volume might be
 * <code>vol-AA22BB012345DAF670</code>. When you use this ID with the EC2 API,
 * you must change it to <code>vol-aa22bb012345daf670</code>. Otherwise, the EC2
 * API might not behave as expected.
 * </p>
 * </note> <important>
 * <p>
 * IDs for Storage Gateway volumes and Amazon EBS snapshots created from gateway
 * volumes are changing to a longer format. Starting in December 2016, all new
 * volumes and snapshots will be created with a 17-character string. Starting in
 * April 2016, you will be able to use these longer IDs so you can test your
 * systems with the new format. For more information, see <a
 * href="http://aws.amazon.com/ec2/faqs/#longer-ids">Longer EC2 and EBS resource
 * IDs</a>.
 * </p>
 * <p>
 * For example, a volume Amazon Resource Name (ARN) with the longer volume ID
 * format looks like the following:
 * </p>
 * <p>
 * <code>arn:aws:storagegateway:us-west-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABBCCDDEEFFG</code>
 * .
 * </p>
 * <p>
 * A snapshot ID with the longer ID format looks like the following:
 * <code>snap-78e226633445566ee</code>.
 * </p>
 * <p>
 * For more information, see <a
 * href="http://forums.aws.amazon.com/ann.jspa?annID=3557">Announcement:
 * Heads-up – Longer AWS Storage Gateway volume and snapshot IDs coming in
 * 2016</a>.
 * </p>
 * </important>
 */
public class AWSStorageGatewayClient extends AmazonWebServiceClient implements AWSStorageGateway {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Storage Gateway exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSStorageGateway. A
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
    public AWSStorageGatewayClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSStorageGateway. A
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
     *            how this client connects to AWSStorageGateway (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSStorageGatewayClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSStorageGateway
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
     *         AWSStorageGatewayClient client = new AWSStorageGatewayClient(AWSMobileClient.getInstance());
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
    public AWSStorageGatewayClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSStorageGateway
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
     *         AWSStorageGatewayClient client = new AWSStorageGatewayClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSStorageGateway (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSStorageGatewayClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSStorageGateway
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
     *         AWSStorageGatewayClient client = new AWSStorageGatewayClient(AWSMobileClient.getInstance());
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
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSStorageGateway
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
     *         AWSStorageGatewayClient client = new AWSStorageGatewayClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSStorageGateway (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSStorageGateway
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
     *            how this client connects to AWSStorageGateway (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSStorageGateway
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
     *         AWSStorageGatewayClient client = new AWSStorageGatewayClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSStorageGateway (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidGatewayRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("storagegateway.us-east-1.amazonaws.com");
        this.endpointPrefix = "storagegateway";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/storagegateway/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/storagegateway/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Activates the gateway you previously deployed on your host. In the
     * activation process, you specify information such as the AWS Region that
     * you want to use for storing snapshots or tapes, the time zone for
     * scheduled snapshots the gateway snapshot schedule window, an activation
     * key, and a name for your gateway. The activation process also associates
     * your gateway with your account. For more information, see
     * <a>UpdateGatewayInformation</a>.
     * </p>
     * <note>
     * <p>
     * You must turn on the gateway VM before you can activate your gateway.
     * </p>
     * </note>
     * 
     * @param activateGatewayRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$ActivationKey</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$GatewayName</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$GatewayRegion</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$GatewayTimezone</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$GatewayType</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$MediumChangerType</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivateGatewayInput$TapeDriveType</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return activateGatewayResult The response from the ActivateGateway
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ActivateGatewayResult activateGateway(ActivateGatewayRequest activateGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(activateGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateGatewayRequest> request = null;
        Response<ActivateGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateGatewayRequestMarshaller().marshall(activateGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ActivateGatewayResult, JsonUnmarshallerContext> unmarshaller = new ActivateGatewayResultJsonUnmarshaller();
            JsonResponseHandler<ActivateGatewayResult> responseHandler = new JsonResponseHandler<ActivateGatewayResult>(
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
     * Configures one or more gateway local disks as cache for a gateway. This
     * operation is only supported in the cached volume, tape, and file gateway
     * type (see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html"
     * >How AWS Storage Gateway works (architecture)</a>.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add cache, and one or more disk IDs that you want to
     * configure as cache.
     * </p>
     * 
     * @param addCacheRequest
     * @return addCacheResult The response from the AddCache service method, as
     *         returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AddCacheResult addCache(AddCacheRequest addCacheRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCacheRequest> request = null;
        Response<AddCacheResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCacheRequestMarshaller().marshall(addCacheRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddCacheResult, JsonUnmarshallerContext> unmarshaller = new AddCacheResultJsonUnmarshaller();
            JsonResponseHandler<AddCacheResult> responseHandler = new JsonResponseHandler<AddCacheResult>(
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
     * Adds one or more tags to the specified resource. You use tags to add
     * metadata to resources, which you can use to categorize these resources.
     * For example, you can categorize resources by purpose, owner, environment,
     * or team. Each tag consists of a key and a value, which you define. You
     * can add tags to the following AWS Storage Gateway resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Storage gateways of all types
     * </p>
     * </li>
     * <li>
     * <p>
     * Storage volumes
     * </p>
     * </li>
     * <li>
     * <p>
     * Virtual tapes
     * </p>
     * </li>
     * <li>
     * <p>
     * NFS and SMB file shares
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a maximum of 50 tags for each resource. Virtual tapes and
     * storage volumes that are recovered to a new gateway maintain their tags.
     * </p>
     * 
     * @param addTagsToResourceRequest <p>
     *            AddTagsToResourceInput
     *            </p>
     * @return addTagsToResourceResult The response from the AddTagsToResource
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AddTagsToResourceResult addTagsToResource(
            AddTagsToResourceRequest addTagsToResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestMarshaller()
                        .marshall(addTagsToResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddTagsToResourceResult, JsonUnmarshallerContext> unmarshaller = new AddTagsToResourceResultJsonUnmarshaller();
            JsonResponseHandler<AddTagsToResourceResult> responseHandler = new JsonResponseHandler<AddTagsToResourceResult>(
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
     * Configures one or more gateway local disks as upload buffer for a
     * specified gateway. This operation is supported for the stored volume,
     * cached volume and tape gateway types.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add upload buffer, and one or more disk IDs that you
     * want to configure as upload buffer.
     * </p>
     * 
     * @param addUploadBufferRequest
     * @return addUploadBufferResult The response from the AddUploadBuffer
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AddUploadBufferResult addUploadBuffer(AddUploadBufferRequest addUploadBufferRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addUploadBufferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddUploadBufferRequest> request = null;
        Response<AddUploadBufferResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddUploadBufferRequestMarshaller().marshall(addUploadBufferRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddUploadBufferResult, JsonUnmarshallerContext> unmarshaller = new AddUploadBufferResultJsonUnmarshaller();
            JsonResponseHandler<AddUploadBufferResult> responseHandler = new JsonResponseHandler<AddUploadBufferResult>(
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
     * Configures one or more gateway local disks as working storage for a
     * gateway. This operation is only supported in the stored volume gateway
     * type. This operation is deprecated in cached volume API version 20120630.
     * Use <a>AddUploadBuffer</a> instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the <a>AddUploadBuffer</a> operation to add upload buffer to a stored
     * volume gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add working storage, and one or more disk IDs that you
     * want to configure as working storage.
     * </p>
     * 
     * @param addWorkingStorageRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>AddWorkingStorageInput$DiskIds</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return addWorkingStorageResult The response from the AddWorkingStorage
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AddWorkingStorageResult addWorkingStorage(
            AddWorkingStorageRequest addWorkingStorageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addWorkingStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddWorkingStorageRequest> request = null;
        Response<AddWorkingStorageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddWorkingStorageRequestMarshaller()
                        .marshall(addWorkingStorageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddWorkingStorageResult, JsonUnmarshallerContext> unmarshaller = new AddWorkingStorageResultJsonUnmarshaller();
            JsonResponseHandler<AddWorkingStorageResult> responseHandler = new JsonResponseHandler<AddWorkingStorageResult>(
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
     * Assigns a tape to a tape pool for archiving. The tape assigned to a pool
     * is archived in the S3 storage class that is associated with the pool.
     * When you use your backup application to eject the tape, the tape is
     * archived directly into the S3 storage class (S3 Glacier or S3 Glacier
     * Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * 
     * @param assignTapePoolRequest
     * @return assignTapePoolResult The response from the AssignTapePool service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AssignTapePoolResult assignTapePool(AssignTapePoolRequest assignTapePoolRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(assignTapePoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssignTapePoolRequest> request = null;
        Response<AssignTapePoolResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssignTapePoolRequestMarshaller().marshall(assignTapePoolRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssignTapePoolResult, JsonUnmarshallerContext> unmarshaller = new AssignTapePoolResultJsonUnmarshaller();
            JsonResponseHandler<AssignTapePoolResult> responseHandler = new JsonResponseHandler<AssignTapePoolResult>(
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
     * Connects a volume to an iSCSI connection and then attaches the volume to
     * the specified gateway. Detaching and attaching a volume enables you to
     * recover your data from one gateway to a different gateway without
     * creating a snapshot. It also makes it easier to move your volumes from an
     * on-premises gateway to a gateway hosted on an Amazon EC2 instance.
     * </p>
     * 
     * @param attachVolumeRequest <p>
     *            AttachVolumeInput
     *            </p>
     * @return attachVolumeResult The response from the AttachVolume service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AttachVolumeResult attachVolume(AttachVolumeRequest attachVolumeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(attachVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachVolumeRequest> request = null;
        Response<AttachVolumeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachVolumeRequestMarshaller().marshall(attachVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AttachVolumeResult, JsonUnmarshallerContext> unmarshaller = new AttachVolumeResultJsonUnmarshaller();
            JsonResponseHandler<AttachVolumeResult> responseHandler = new JsonResponseHandler<AttachVolumeResult>(
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
     * Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after
     * the archiving process is initiated. This operation is only supported in
     * the tape gateway type.
     * </p>
     * 
     * @param cancelArchivalRequest <p>
     *            CancelArchivalInput
     *            </p>
     * @return cancelArchivalResult The response from the CancelArchival service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CancelArchivalResult cancelArchival(CancelArchivalRequest cancelArchivalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelArchivalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelArchivalRequest> request = null;
        Response<CancelArchivalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelArchivalRequestMarshaller().marshall(cancelArchivalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelArchivalResult, JsonUnmarshallerContext> unmarshaller = new CancelArchivalResultJsonUnmarshaller();
            JsonResponseHandler<CancelArchivalResult> responseHandler = new JsonResponseHandler<CancelArchivalResult>(
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
     * Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to
     * a gateway after the retrieval process is initiated. The virtual tape is
     * returned to the VTS. This operation is only supported in the tape gateway
     * type.
     * </p>
     * 
     * @param cancelRetrievalRequest <p>
     *            CancelRetrievalInput
     *            </p>
     * @return cancelRetrievalResult The response from the CancelRetrieval
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CancelRetrievalResult cancelRetrieval(CancelRetrievalRequest cancelRetrievalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelRetrievalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelRetrievalRequest> request = null;
        Response<CancelRetrievalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelRetrievalRequestMarshaller().marshall(cancelRetrievalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelRetrievalResult, JsonUnmarshallerContext> unmarshaller = new CancelRetrievalResultJsonUnmarshaller();
            JsonResponseHandler<CancelRetrievalResult> responseHandler = new JsonResponseHandler<CancelRetrievalResult>(
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
     * Creates a cached volume on a specified cached volume gateway. This
     * operation is only supported in the cached volume gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a
     * cached volume. Use the <a>AddCache</a> operation to add cache storage to
     * a gateway.
     * </p>
     * </note>
     * <p>
     * In the request, you must specify the gateway, size of the volume in
     * bytes, the iSCSI target name, an IP address on which to expose the
     * target, and a unique client token. In response, the gateway creates the
     * volume and returns information about it. This information includes the
     * volume Amazon Resource Name (ARN), its size, and the iSCSI target ARN
     * that initiators can use to connect to the volume target.
     * </p>
     * <p>
     * Optionally, you can provide the ARN for an existing volume as the
     * <code>SourceVolumeARN</code> for this cached volume, which creates an
     * exact copy of the existing volume’s latest recovery point. The
     * <code>VolumeSizeInBytes</code> value must be equal to or larger than the
     * size of the copied volume, in bytes.
     * </p>
     * 
     * @param createCachediSCSIVolumeRequest
     * @return createCachediSCSIVolumeResult The response from the
     *         CreateCachediSCSIVolume service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateCachediSCSIVolumeResult createCachediSCSIVolume(
            CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCachediSCSIVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCachediSCSIVolumeRequest> request = null;
        Response<CreateCachediSCSIVolumeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCachediSCSIVolumeRequestMarshaller()
                        .marshall(createCachediSCSIVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCachediSCSIVolumeResult, JsonUnmarshallerContext> unmarshaller = new CreateCachediSCSIVolumeResultJsonUnmarshaller();
            JsonResponseHandler<CreateCachediSCSIVolumeResult> responseHandler = new JsonResponseHandler<CreateCachediSCSIVolumeResult>(
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
     * Creates a Network File System (NFS) file share on an existing file
     * gateway. In Storage Gateway, a file share is a file system mount point
     * backed by Amazon S3 cloud storage. Storage Gateway exposes file shares
     * using an NFS interface. This operation is only supported for file
     * gateways.
     * </p>
     * <important>
     * <p>
     * File gateway requires AWS Security Token Service (AWS STS) to be
     * activated to enable you to create a file share. Make sure AWS STS is
     * activated in the AWS Region you are creating your file gateway in. If AWS
     * STS is not activated in the AWS Region, activate it. For information
     * about how to activate AWS STS, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * <p>
     * File gateway does not support creating hard or symbolic links on a file
     * share.
     * </p>
     * </important>
     * 
     * @param createNFSFileShareRequest <p>
     *            CreateNFSFileShareInput
     *            </p>
     * @return createNFSFileShareResult The response from the CreateNFSFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateNFSFileShareResult createNFSFileShare(
            CreateNFSFileShareRequest createNFSFileShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createNFSFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNFSFileShareRequest> request = null;
        Response<CreateNFSFileShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNFSFileShareRequestMarshaller()
                        .marshall(createNFSFileShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateNFSFileShareResult, JsonUnmarshallerContext> unmarshaller = new CreateNFSFileShareResultJsonUnmarshaller();
            JsonResponseHandler<CreateNFSFileShareResult> responseHandler = new JsonResponseHandler<CreateNFSFileShareResult>(
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
     * Creates a Server Message Block (SMB) file share on an existing file
     * gateway. In Storage Gateway, a file share is a file system mount point
     * backed by Amazon S3 cloud storage. Storage Gateway expose file shares
     * using an SMB interface. This operation is only supported for file
     * gateways.
     * </p>
     * <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be
     * activated to enable you to create a file share. Make sure that AWS STS is
     * activated in the AWS Region you are creating your file gateway in. If AWS
     * STS is not activated in this AWS Region, activate it. For information
     * about how to activate AWS STS, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file
     * share.
     * </p>
     * </important>
     * 
     * @param createSMBFileShareRequest <p>
     *            CreateSMBFileShareInput
     *            </p>
     * @return createSMBFileShareResult The response from the CreateSMBFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateSMBFileShareResult createSMBFileShare(
            CreateSMBFileShareRequest createSMBFileShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSMBFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSMBFileShareRequest> request = null;
        Response<CreateSMBFileShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSMBFileShareRequestMarshaller()
                        .marshall(createSMBFileShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSMBFileShareResult, JsonUnmarshallerContext> unmarshaller = new CreateSMBFileShareResultJsonUnmarshaller();
            JsonResponseHandler<CreateSMBFileShareResult> responseHandler = new JsonResponseHandler<CreateSMBFileShareResult>(
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
     * Initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time
     * snapshots of your data to Amazon Simple Storage (Amazon S3) for durable
     * off-site recovery, as well as import the data to an Amazon Elastic Block
     * Store (EBS) volume in Amazon Elastic Compute Cloud (EC2). You can take
     * snapshots of your gateway volume on a scheduled or ad hoc basis. This API
     * enables you to take ad-hoc snapshot. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#SchedulingSnapshot"
     * >Editing a snapshot schedule</a>.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide description for the
     * snapshot. When AWS Storage Gateway takes the snapshot of specified
     * volume, the snapshot and description appears in the AWS Storage Gateway
     * Console. In response, AWS Storage Gateway returns you a snapshot ID. You
     * can use this snapshot ID to check the snapshot progress or later use it
     * when you want to create a volume from a snapshot. This operation is only
     * supported in stored and cached volume gateway type.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSnapshots.html"
     * >DescribeSnapshots</a> or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteSnapshot.html"
     * >DeleteSnapshot</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * </note> <important>
     * <p>
     * Volume and snapshot IDs are changing to a longer length ID format. For
     * more information, see the important note on the <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/APIReference/Welcome.html"
     * >Welcome</a> page.
     * </p>
     * </important>
     * 
     * @param createSnapshotRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>CreateSnapshotInput$SnapshotDescription</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateSnapshotInput$VolumeARN</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return createSnapshotResult The response from the CreateSnapshot service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller().marshall(createSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSnapshotResult, JsonUnmarshallerContext> unmarshaller = new CreateSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CreateSnapshotResult> responseHandler = new JsonResponseHandler<CreateSnapshotResult>(
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
     * Initiates a snapshot of a gateway from a volume recovery point. This
     * operation is only supported in the cached volume gateway type.
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot. To get a
     * list of volume recovery point for cached volume gateway, use
     * <a>ListVolumeRecoveryPoints</a>.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you
     * identify the volume by providing its Amazon Resource Name (ARN). You must
     * also provide a description for the snapshot. When the gateway takes a
     * snapshot of the specified volume, the snapshot and its description appear
     * in the AWS Storage Gateway console. In response, the gateway returns you
     * a snapshot ID. You can use this snapshot ID to check the snapshot
     * progress or later use it when you want to create a volume from a
     * snapshot.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSnapshots.html"
     * >DescribeSnapshots</a> or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteSnapshot.html"
     * >DeleteSnapshot</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * </note>
     * 
     * @param createSnapshotFromVolumeRecoveryPointRequest
     * @return createSnapshotFromVolumeRecoveryPointResult The response from the
     *         CreateSnapshotFromVolumeRecoveryPoint service method, as returned
     *         by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws ServiceUnavailableErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateSnapshotFromVolumeRecoveryPointResult createSnapshotFromVolumeRecoveryPoint(
            CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSnapshotFromVolumeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotFromVolumeRecoveryPointRequest> request = null;
        Response<CreateSnapshotFromVolumeRecoveryPointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotFromVolumeRecoveryPointRequestMarshaller()
                        .marshall(createSnapshotFromVolumeRecoveryPointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSnapshotFromVolumeRecoveryPointResult, JsonUnmarshallerContext> unmarshaller = new CreateSnapshotFromVolumeRecoveryPointResultJsonUnmarshaller();
            JsonResponseHandler<CreateSnapshotFromVolumeRecoveryPointResult> responseHandler = new JsonResponseHandler<CreateSnapshotFromVolumeRecoveryPointResult>(
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
     * Creates a volume on a specified gateway. This operation is only supported
     * in the stored volume gateway type.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You can
     * choose to preserve existing data on the disk, create volume from an
     * existing snapshot, or create an empty volume. If you choose to create an
     * empty gateway volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information on
     * which you are creating the volume. In response, the gateway creates the
     * volume and returns volume information such as the volume Amazon Resource
     * Name (ARN), its size, and the iSCSI target ARN that initiators can use to
     * connect to the volume target.
     * </p>
     * 
     * @param createStorediSCSIVolumeRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$DiskId</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$PreserveExistingData</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$SnapshotId</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>CreateStorediSCSIVolumeInput$TargetName</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return createStorediSCSIVolumeResult The response from the
     *         CreateStorediSCSIVolume service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateStorediSCSIVolumeResult createStorediSCSIVolume(
            CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStorediSCSIVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorediSCSIVolumeRequest> request = null;
        Response<CreateStorediSCSIVolumeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorediSCSIVolumeRequestMarshaller()
                        .marshall(createStorediSCSIVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateStorediSCSIVolumeResult, JsonUnmarshallerContext> unmarshaller = new CreateStorediSCSIVolumeResultJsonUnmarshaller();
            JsonResponseHandler<CreateStorediSCSIVolumeResult> responseHandler = new JsonResponseHandler<CreateStorediSCSIVolumeResult>(
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
     * Creates a virtual tape by using your own barcode. You write data to the
     * virtual tape and then archive the tape. A barcode is unique and can not
     * be reused if it has already been used on a tape. This applies to barcodes
     * used on deleted tapes. This operation is only supported in the tape
     * gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create a
     * virtual tape. Use the <a>AddCache</a> operation to add cache storage to a
     * gateway.
     * </p>
     * </note>
     * 
     * @param createTapeWithBarcodeRequest <p>
     *            CreateTapeWithBarcodeInput
     *            </p>
     * @return createTapeWithBarcodeResult The response from the
     *         CreateTapeWithBarcode service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateTapeWithBarcodeResult createTapeWithBarcode(
            CreateTapeWithBarcodeRequest createTapeWithBarcodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTapeWithBarcodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTapeWithBarcodeRequest> request = null;
        Response<CreateTapeWithBarcodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTapeWithBarcodeRequestMarshaller()
                        .marshall(createTapeWithBarcodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTapeWithBarcodeResult, JsonUnmarshallerContext> unmarshaller = new CreateTapeWithBarcodeResultJsonUnmarshaller();
            JsonResponseHandler<CreateTapeWithBarcodeResult> responseHandler = new JsonResponseHandler<CreateTapeWithBarcodeResult>(
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
     * Creates one or more virtual tapes. You write data to the virtual tapes
     * and then archive the tapes. This operation is only supported in the tape
     * gateway type.
     * </p>
     * <note>
     * <p>
     * Cache storage must be allocated to the gateway before you can create
     * virtual tapes. Use the <a>AddCache</a> operation to add cache storage to
     * a gateway.
     * </p>
     * </note>
     * 
     * @param createTapesRequest <p>
     *            CreateTapesInput
     *            </p>
     * @return createTapesResult The response from the CreateTapes service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateTapesResult createTapes(CreateTapesRequest createTapesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTapesRequest> request = null;
        Response<CreateTapesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTapesRequestMarshaller().marshall(createTapesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTapesResult, JsonUnmarshallerContext> unmarshaller = new CreateTapesResultJsonUnmarshaller();
            JsonResponseHandler<CreateTapesResult> responseHandler = new JsonResponseHandler<CreateTapesResult>(
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
     * Deletes the automatic tape creation policy of a gateway. If you delete
     * this policy, new virtual tapes must be created manually. Use the Amazon
     * Resource Name (ARN) of the gateway in your request to remove the policy.
     * </p>
     * 
     * @param deleteAutomaticTapeCreationPolicyRequest
     * @return deleteAutomaticTapeCreationPolicyResult The response from the
     *         DeleteAutomaticTapeCreationPolicy service method, as returned by
     *         AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteAutomaticTapeCreationPolicyResult deleteAutomaticTapeCreationPolicy(
            DeleteAutomaticTapeCreationPolicyRequest deleteAutomaticTapeCreationPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAutomaticTapeCreationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAutomaticTapeCreationPolicyRequest> request = null;
        Response<DeleteAutomaticTapeCreationPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAutomaticTapeCreationPolicyRequestMarshaller()
                        .marshall(deleteAutomaticTapeCreationPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAutomaticTapeCreationPolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteAutomaticTapeCreationPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAutomaticTapeCreationPolicyResult> responseHandler = new JsonResponseHandler<DeleteAutomaticTapeCreationPolicyResult>(
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
     * Deletes the bandwidth rate limits of a gateway. You can delete either the
     * upload and download bandwidth rate limit, or you can delete both. If you
     * delete only one of the limits, the other limit remains unchanged. To
     * specify which gateway to work with, use the Amazon Resource Name (ARN) of
     * the gateway in your request. This operation is supported for the stored
     * volume, cached volume and tape gateway types.
     * </p>
     * 
     * @param deleteBandwidthRateLimitRequest <p>
     *            A JSON object containing the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>DeleteBandwidthRateLimitInput$BandwidthType</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return deleteBandwidthRateLimitResult The response from the
     *         DeleteBandwidthRateLimit service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteBandwidthRateLimitResult deleteBandwidthRateLimit(
            DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBandwidthRateLimitRequest> request = null;
        Response<DeleteBandwidthRateLimitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBandwidthRateLimitRequestMarshaller()
                        .marshall(deleteBandwidthRateLimitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBandwidthRateLimitResult, JsonUnmarshallerContext> unmarshaller = new DeleteBandwidthRateLimitResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<DeleteBandwidthRateLimitResult>(
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
     * Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials
     * for a specified iSCSI target and initiator pair. This operation is
     * supported in volume and tape gateway types.
     * </p>
     * 
     * @param deleteChapCredentialsRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>DeleteChapCredentialsInput$InitiatorName</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>DeleteChapCredentialsInput$TargetARN</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return deleteChapCredentialsResult The response from the
     *         DeleteChapCredentials service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteChapCredentialsResult deleteChapCredentials(
            DeleteChapCredentialsRequest deleteChapCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChapCredentialsRequest> request = null;
        Response<DeleteChapCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChapCredentialsRequestMarshaller()
                        .marshall(deleteChapCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteChapCredentialsResult, JsonUnmarshallerContext> unmarshaller = new DeleteChapCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<DeleteChapCredentialsResult> responseHandler = new JsonResponseHandler<DeleteChapCredentialsResult>(
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
     * Deletes a file share from a file gateway. This operation is only
     * supported for file gateways.
     * </p>
     * 
     * @param deleteFileShareRequest <p>
     *            DeleteFileShareInput
     *            </p>
     * @return deleteFileShareResult The response from the DeleteFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteFileShareResult deleteFileShare(DeleteFileShareRequest deleteFileShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileShareRequest> request = null;
        Response<DeleteFileShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileShareRequestMarshaller().marshall(deleteFileShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteFileShareResult, JsonUnmarshallerContext> unmarshaller = new DeleteFileShareResultJsonUnmarshaller();
            JsonResponseHandler<DeleteFileShareResult> responseHandler = new JsonResponseHandler<DeleteFileShareResult>(
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
     * Deletes a gateway. To specify which gateway to delete, use the Amazon
     * Resource Name (ARN) of the gateway in your request. The operation deletes
     * the gateway; however, it does not delete the gateway virtual machine (VM)
     * from your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed snapshots
     * of the gateway volumes are not deleted upon deleting the gateway,
     * however, pending snapshots will not complete. After you delete a gateway,
     * your next step is to remove it from your environment.
     * </p>
     * <important>
     * <p>
     * You no longer pay software charges after the gateway is deleted; however,
     * your existing Amazon EBS snapshots persist and you will continue to be
     * billed for these snapshots. You can choose to remove all remaining Amazon
     * EBS snapshots by canceling your Amazon EC2 subscription.  If you prefer
     * not to cancel your Amazon EC2 subscription, you can delete your snapshots
     * using the Amazon EC2 console. For more information, see the <a
     * href="http://aws.amazon.com/storagegateway">AWS Storage Gateway detail
     * page</a>.
     * </p>
     * </important>
     * 
     * @param deleteGatewayRequest <p>
     *            A JSON object containing the ID of the gateway to delete.
     *            </p>
     * @return deleteGatewayResult The response from the DeleteGateway service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteGatewayResult deleteGateway(DeleteGatewayRequest deleteGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayRequest> request = null;
        Response<DeleteGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayRequestMarshaller().marshall(deleteGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGatewayResult, JsonUnmarshallerContext> unmarshaller = new DeleteGatewayResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGatewayResult> responseHandler = new JsonResponseHandler<DeleteGatewayResult>(
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
     * Deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or ad hoc
     * basis. This API action enables you to delete a snapshot schedule for a
     * volume. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegatewaylatest/userguide/backing-up-volumes.html"
     * >Backing up your volumes</a>. In the <code>DeleteSnapshotSchedule</code>
     * request, you identify the volume by providing its Amazon Resource Name
     * (ARN). This operation is only supported in stored and cached volume
     * gateway types.
     * </p>
     * <note>
     * <p>
     * To list or delete a snapshot, you must use the Amazon EC2 API. For more
     * information, go to <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return deleteSnapshotScheduleResult The response from the
     *         DeleteSnapshotSchedule service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteSnapshotScheduleResult deleteSnapshotSchedule(
            DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotScheduleRequest> request = null;
        Response<DeleteSnapshotScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotScheduleRequestMarshaller()
                        .marshall(deleteSnapshotScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSnapshotScheduleResult, JsonUnmarshallerContext> unmarshaller = new DeleteSnapshotScheduleResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSnapshotScheduleResult> responseHandler = new JsonResponseHandler<DeleteSnapshotScheduleResult>(
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
     * Deletes the specified virtual tape. This operation is only supported in
     * the tape gateway type.
     * </p>
     * 
     * @param deleteTapeRequest <p>
     *            DeleteTapeInput
     *            </p>
     * @return deleteTapeResult The response from the DeleteTape service method,
     *         as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteTapeResult deleteTape(DeleteTapeRequest deleteTapeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTapeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTapeRequest> request = null;
        Response<DeleteTapeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTapeRequestMarshaller().marshall(deleteTapeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTapeResult, JsonUnmarshallerContext> unmarshaller = new DeleteTapeResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTapeResult> responseHandler = new JsonResponseHandler<DeleteTapeResult>(
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
     * Deletes the specified virtual tape from the virtual tape shelf (VTS).
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param deleteTapeArchiveRequest <p>
     *            DeleteTapeArchiveInput
     *            </p>
     * @return deleteTapeArchiveResult The response from the DeleteTapeArchive
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteTapeArchiveResult deleteTapeArchive(
            DeleteTapeArchiveRequest deleteTapeArchiveRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTapeArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTapeArchiveRequest> request = null;
        Response<DeleteTapeArchiveResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTapeArchiveRequestMarshaller()
                        .marshall(deleteTapeArchiveRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTapeArchiveResult, JsonUnmarshallerContext> unmarshaller = new DeleteTapeArchiveResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTapeArchiveResult> responseHandler = new JsonResponseHandler<DeleteTapeArchiveResult>(
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
     * Deletes the specified storage volume that you previously created using
     * the <a>CreateCachediSCSIVolume</a> or <a>CreateStorediSCSIVolume</a> API.
     * This operation is only supported in the cached volume and stored volume
     * types. For stored volume gateways, the local disk that was configured as
     * the storage volume is not deleted. You can reuse the local disk to create
     * another storage volume.
     * </p>
     * <p>
     * Before you delete a volume, make sure there are no iSCSI connections to
     * the volume you are deleting. You should also make sure there is no
     * snapshot in progress. You can use the Amazon Elastic Compute Cloud
     * (Amazon EC2) API to query snapshots on the volume you are deleting and
     * check the snapshot status. For more information, go to <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the
     * storage volume you want to delete.
     * </p>
     * 
     * @param deleteVolumeRequest <p>
     *            A JSON object containing the
     *            <a>DeleteVolumeInput$VolumeARN</a> to delete.
     *            </p>
     * @return deleteVolumeResult The response from the DeleteVolume service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteVolumeResult deleteVolume(DeleteVolumeRequest deleteVolumeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVolumeRequest> request = null;
        Response<DeleteVolumeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVolumeRequestMarshaller().marshall(deleteVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteVolumeResult, JsonUnmarshallerContext> unmarshaller = new DeleteVolumeResultJsonUnmarshaller();
            JsonResponseHandler<DeleteVolumeResult> responseHandler = new JsonResponseHandler<DeleteVolumeResult>(
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
     * Returns information about the most recent High Availability monitoring
     * test that was performed on the host in a cluster. If a test isn't
     * performed, the status and start time in the response would be null.
     * </p>
     * 
     * @param describeAvailabilityMonitorTestRequest
     * @return describeAvailabilityMonitorTestResult The response from the
     *         DescribeAvailabilityMonitorTest service method, as returned by
     *         AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeAvailabilityMonitorTestResult describeAvailabilityMonitorTest(
            DescribeAvailabilityMonitorTestRequest describeAvailabilityMonitorTestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAvailabilityMonitorTestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAvailabilityMonitorTestRequest> request = null;
        Response<DescribeAvailabilityMonitorTestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAvailabilityMonitorTestRequestMarshaller()
                        .marshall(describeAvailabilityMonitorTestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAvailabilityMonitorTestResult, JsonUnmarshallerContext> unmarshaller = new DescribeAvailabilityMonitorTestResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAvailabilityMonitorTestResult> responseHandler = new JsonResponseHandler<DescribeAvailabilityMonitorTestResult>(
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
     * Returns the bandwidth rate limits of a gateway. By default, these limits
     * are not set, which means no bandwidth rate limiting is in effect. This
     * operation is supported for the stored volume, cached volume and tape
     * gateway types.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if
     * the limit is set. If no limits are set for the gateway, then this
     * operation returns only the gateway ARN in the response body. To specify
     * which gateway to describe, use the Amazon Resource Name (ARN) of the
     * gateway in your request.
     * </p>
     * 
     * @param describeBandwidthRateLimitRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway.
     *            </p>
     * @return describeBandwidthRateLimitResult The response from the
     *         DescribeBandwidthRateLimit service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeBandwidthRateLimitResult describeBandwidthRateLimit(
            DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBandwidthRateLimitRequest> request = null;
        Response<DescribeBandwidthRateLimitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBandwidthRateLimitRequestMarshaller()
                        .marshall(describeBandwidthRateLimitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeBandwidthRateLimitResult, JsonUnmarshallerContext> unmarshaller = new DescribeBandwidthRateLimitResultJsonUnmarshaller();
            JsonResponseHandler<DescribeBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<DescribeBandwidthRateLimitResult>(
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
     * Returns information about the cache of a gateway. This operation is only
     * supported in the cached volume, tape, and file gateway types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it
     * includes the amount of cache allocated and used.
     * </p>
     * 
     * @param describeCacheRequest
     * @return describeCacheResult The response from the DescribeCache service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeCacheResult describeCache(DescribeCacheRequest describeCacheRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheRequest> request = null;
        Response<DescribeCacheResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheRequestMarshaller().marshall(describeCacheRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCacheResult, JsonUnmarshallerContext> unmarshaller = new DescribeCacheResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCacheResult> responseHandler = new JsonResponseHandler<DescribeCacheResult>(
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
     * Returns a description of the gateway volumes specified in the request.
     * This operation is only supported in the cached volume gateway types.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway. In
     * the response, AWS Storage Gateway returns volume information sorted by
     * volume Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCachediSCSIVolumesRequest
     * @return describeCachediSCSIVolumesResult The response from the
     *         DescribeCachediSCSIVolumes service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeCachediSCSIVolumesResult describeCachediSCSIVolumes(
            DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCachediSCSIVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCachediSCSIVolumesRequest> request = null;
        Response<DescribeCachediSCSIVolumesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCachediSCSIVolumesRequestMarshaller()
                        .marshall(describeCachediSCSIVolumesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCachediSCSIVolumesResult, JsonUnmarshallerContext> unmarshaller = new DescribeCachediSCSIVolumesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCachediSCSIVolumesResult> responseHandler = new JsonResponseHandler<DescribeCachediSCSIVolumesResult>(
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
     * Returns an array of Challenge-Handshake Authentication Protocol (CHAP)
     * credentials information for a specified iSCSI target, one for each
     * target-initiator pair. This operation is supported in the volume and tape
     * gateway types.
     * </p>
     * 
     * @param describeChapCredentialsRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            iSCSI volume target.
     *            </p>
     * @return describeChapCredentialsResult The response from the
     *         DescribeChapCredentials service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeChapCredentialsResult describeChapCredentials(
            DescribeChapCredentialsRequest describeChapCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChapCredentialsRequest> request = null;
        Response<DescribeChapCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChapCredentialsRequestMarshaller()
                        .marshall(describeChapCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeChapCredentialsResult, JsonUnmarshallerContext> unmarshaller = new DescribeChapCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeChapCredentialsResult> responseHandler = new JsonResponseHandler<DescribeChapCredentialsResult>(
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
     * Returns metadata about a gateway such as its name, network interfaces,
     * configured time zone, and the state (whether the gateway is running or
     * not). To specify which gateway to describe, use the Amazon Resource Name
     * (ARN) of the gateway in your request.
     * </p>
     * 
     * @param describeGatewayInformationRequest <p>
     *            A JSON object containing the ID of the gateway.
     *            </p>
     * @return describeGatewayInformationResult The response from the
     *         DescribeGatewayInformation service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeGatewayInformationResult describeGatewayInformation(
            DescribeGatewayInformationRequest describeGatewayInformationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeGatewayInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayInformationRequest> request = null;
        Response<DescribeGatewayInformationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayInformationRequestMarshaller()
                        .marshall(describeGatewayInformationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeGatewayInformationResult, JsonUnmarshallerContext> unmarshaller = new DescribeGatewayInformationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeGatewayInformationResult> responseHandler = new JsonResponseHandler<DescribeGatewayInformationResult>(
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
     * Returns your gateway's weekly maintenance start time including the day
     * and time of the week. Note that values are in terms of the gateway's time
     * zone.
     * </p>
     * 
     * @param describeMaintenanceStartTimeRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway.
     *            </p>
     * @return describeMaintenanceStartTimeResult The response from the
     *         DescribeMaintenanceStartTime service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeMaintenanceStartTimeResult describeMaintenanceStartTime(
            DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceStartTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceStartTimeRequest> request = null;
        Response<DescribeMaintenanceStartTimeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceStartTimeRequestMarshaller()
                        .marshall(describeMaintenanceStartTimeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceStartTimeResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceStartTimeResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceStartTimeResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceStartTimeResult>(
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
     * Gets a description for one or more Network File System (NFS) file shares
     * from a file gateway. This operation is only supported for file gateways.
     * </p>
     * 
     * @param describeNFSFileSharesRequest <p>
     *            DescribeNFSFileSharesInput
     *            </p>
     * @return describeNFSFileSharesResult The response from the
     *         DescribeNFSFileShares service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeNFSFileSharesResult describeNFSFileShares(
            DescribeNFSFileSharesRequest describeNFSFileSharesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeNFSFileSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNFSFileSharesRequest> request = null;
        Response<DescribeNFSFileSharesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNFSFileSharesRequestMarshaller()
                        .marshall(describeNFSFileSharesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeNFSFileSharesResult, JsonUnmarshallerContext> unmarshaller = new DescribeNFSFileSharesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeNFSFileSharesResult> responseHandler = new JsonResponseHandler<DescribeNFSFileSharesResult>(
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
     * Gets a description for one or more Server Message Block (SMB) file shares
     * from a file gateway. This operation is only supported for file gateways.
     * </p>
     * 
     * @param describeSMBFileSharesRequest <p>
     *            DescribeSMBFileSharesInput
     *            </p>
     * @return describeSMBFileSharesResult The response from the
     *         DescribeSMBFileShares service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeSMBFileSharesResult describeSMBFileShares(
            DescribeSMBFileSharesRequest describeSMBFileSharesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSMBFileSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSMBFileSharesRequest> request = null;
        Response<DescribeSMBFileSharesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSMBFileSharesRequestMarshaller()
                        .marshall(describeSMBFileSharesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSMBFileSharesResult, JsonUnmarshallerContext> unmarshaller = new DescribeSMBFileSharesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSMBFileSharesResult> responseHandler = new JsonResponseHandler<DescribeSMBFileSharesResult>(
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
     * Gets a description of a Server Message Block (SMB) file share settings
     * from a file gateway. This operation is only supported for file gateways.
     * </p>
     * 
     * @param describeSMBSettingsRequest
     * @return describeSMBSettingsResult The response from the
     *         DescribeSMBSettings service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeSMBSettingsResult describeSMBSettings(
            DescribeSMBSettingsRequest describeSMBSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSMBSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSMBSettingsRequest> request = null;
        Response<DescribeSMBSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSMBSettingsRequestMarshaller()
                        .marshall(describeSMBSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSMBSettingsResult, JsonUnmarshallerContext> unmarshaller = new DescribeSMBSettingsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSMBSettingsResult> responseHandler = new JsonResponseHandler<DescribeSMBSettingsResult>(
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
     * Describes the snapshot schedule for the specified gateway volume. The
     * snapshot schedule information includes intervals at which snapshots are
     * automatically initiated on the volume. This operation is only supported
     * in the cached volume and stored volume types.
     * </p>
     * 
     * @param describeSnapshotScheduleRequest <p>
     *            A JSON object containing the
     *            <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.
     *            </p>
     * @return describeSnapshotScheduleResult The response from the
     *         DescribeSnapshotSchedule service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeSnapshotScheduleResult describeSnapshotSchedule(
            DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotScheduleRequest> request = null;
        Response<DescribeSnapshotScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotScheduleRequestMarshaller()
                        .marshall(describeSnapshotScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSnapshotScheduleResult, JsonUnmarshallerContext> unmarshaller = new DescribeSnapshotScheduleResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSnapshotScheduleResult> responseHandler = new JsonResponseHandler<DescribeSnapshotScheduleResult>(
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
     * Returns the description of the gateway volumes specified in the request.
     * The list of gateway volumes in the request must be from one gateway. In
     * the response, AWS Storage Gateway returns volume information sorted by
     * volume ARNs. This operation is only supported in stored volume gateway
     * type.
     * </p>
     * 
     * @param describeStorediSCSIVolumesRequest <p>
     *            A JSON object containing a list of
     *            <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.
     *            </p>
     * @return describeStorediSCSIVolumesResult The response from the
     *         DescribeStorediSCSIVolumes service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeStorediSCSIVolumesResult describeStorediSCSIVolumes(
            DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStorediSCSIVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStorediSCSIVolumesRequest> request = null;
        Response<DescribeStorediSCSIVolumesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStorediSCSIVolumesRequestMarshaller()
                        .marshall(describeStorediSCSIVolumesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStorediSCSIVolumesResult, JsonUnmarshallerContext> unmarshaller = new DescribeStorediSCSIVolumesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStorediSCSIVolumesResult> responseHandler = new JsonResponseHandler<DescribeStorediSCSIVolumesResult>(
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
     * Returns a description of specified virtual tapes in the virtual tape
     * shelf (VTS). This operation is only supported in the tape gateway type.
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage Gateway
     * returns a description of all virtual tapes found in the VTS associated
     * with your account.
     * </p>
     * 
     * @param describeTapeArchivesRequest <p>
     *            DescribeTapeArchivesInput
     *            </p>
     * @return describeTapeArchivesResult The response from the
     *         DescribeTapeArchives service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeTapeArchivesResult describeTapeArchives(
            DescribeTapeArchivesRequest describeTapeArchivesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTapeArchivesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapeArchivesRequest> request = null;
        Response<DescribeTapeArchivesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapeArchivesRequestMarshaller()
                        .marshall(describeTapeArchivesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTapeArchivesResult, JsonUnmarshallerContext> unmarshaller = new DescribeTapeArchivesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTapeArchivesResult> responseHandler = new JsonResponseHandler<DescribeTapeArchivesResult>(
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
     * Returns a list of virtual tape recovery points that are available for the
     * specified tape gateway.
     * </p>
     * <p>
     * A recovery point is a point-in-time view of a virtual tape at which all
     * the data on the virtual tape is consistent. If your gateway crashes,
     * virtual tapes that have recovery points can be recovered to a new
     * gateway. This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapeRecoveryPointsRequest <p>
     *            DescribeTapeRecoveryPointsInput
     *            </p>
     * @return describeTapeRecoveryPointsResult The response from the
     *         DescribeTapeRecoveryPoints service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeTapeRecoveryPointsResult describeTapeRecoveryPoints(
            DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTapeRecoveryPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapeRecoveryPointsRequest> request = null;
        Response<DescribeTapeRecoveryPointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapeRecoveryPointsRequestMarshaller()
                        .marshall(describeTapeRecoveryPointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTapeRecoveryPointsResult, JsonUnmarshallerContext> unmarshaller = new DescribeTapeRecoveryPointsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTapeRecoveryPointsResult> responseHandler = new JsonResponseHandler<DescribeTapeRecoveryPointsResult>(
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
     * Returns a description of the specified Amazon Resource Name (ARN) of
     * virtual tapes. If a <code>TapeARN</code> is not specified, returns a
     * description of all virtual tapes associated with the specified gateway.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeTapesRequest <p>
     *            DescribeTapesInput
     *            </p>
     * @return describeTapesResult The response from the DescribeTapes service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeTapesResult describeTapes(DescribeTapesRequest describeTapesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapesRequest> request = null;
        Response<DescribeTapesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapesRequestMarshaller().marshall(describeTapesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTapesResult, JsonUnmarshallerContext> unmarshaller = new DescribeTapesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTapesResult> responseHandler = new JsonResponseHandler<DescribeTapesResult>(
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
     * Returns information about the upload buffer of a gateway. This operation
     * is supported for the stored volume, cached volume, and tape gateway
     * types.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer
     * space, and it includes the amount of upload buffer space allocated and
     * used.
     * </p>
     * 
     * @param describeUploadBufferRequest
     * @return describeUploadBufferResult The response from the
     *         DescribeUploadBuffer service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeUploadBufferResult describeUploadBuffer(
            DescribeUploadBufferRequest describeUploadBufferRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUploadBufferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUploadBufferRequest> request = null;
        Response<DescribeUploadBufferResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUploadBufferRequestMarshaller()
                        .marshall(describeUploadBufferRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUploadBufferResult, JsonUnmarshallerContext> unmarshaller = new DescribeUploadBufferResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUploadBufferResult> responseHandler = new JsonResponseHandler<DescribeUploadBufferResult>(
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
     * Returns a description of virtual tape library (VTL) devices for the
     * specified tape gateway. In the response, AWS Storage Gateway returns VTL
     * device information.
     * </p>
     * <p>
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param describeVTLDevicesRequest <p>
     *            DescribeVTLDevicesInput
     *            </p>
     * @return describeVTLDevicesResult The response from the DescribeVTLDevices
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeVTLDevicesResult describeVTLDevices(
            DescribeVTLDevicesRequest describeVTLDevicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeVTLDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVTLDevicesRequest> request = null;
        Response<DescribeVTLDevicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVTLDevicesRequestMarshaller()
                        .marshall(describeVTLDevicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeVTLDevicesResult, JsonUnmarshallerContext> unmarshaller = new DescribeVTLDevicesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeVTLDevicesResult> responseHandler = new JsonResponseHandler<DescribeVTLDevicesResult>(
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
     * Returns information about the working storage of a gateway. This
     * operation is only supported in the stored volumes gateway type. This
     * operation is deprecated in cached volumes API version (20120630). Use
     * DescribeUploadBuffer instead.
     * </p>
     * <note>
     * <p>
     * Working storage is also referred to as upload buffer. You can also use
     * the DescribeUploadBuffer operation to add upload buffer to a stored
     * volume gateway.
     * </p>
     * </note>
     * <p>
     * The response includes disk IDs that are configured as working storage,
     * and it includes the amount of working storage allocated and used.
     * </p>
     * 
     * @param describeWorkingStorageRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway.
     *            </p>
     * @return describeWorkingStorageResult The response from the
     *         DescribeWorkingStorage service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeWorkingStorageResult describeWorkingStorage(
            DescribeWorkingStorageRequest describeWorkingStorageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeWorkingStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkingStorageRequest> request = null;
        Response<DescribeWorkingStorageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkingStorageRequestMarshaller()
                        .marshall(describeWorkingStorageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeWorkingStorageResult, JsonUnmarshallerContext> unmarshaller = new DescribeWorkingStorageResultJsonUnmarshaller();
            JsonResponseHandler<DescribeWorkingStorageResult> responseHandler = new JsonResponseHandler<DescribeWorkingStorageResult>(
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
     * Disconnects a volume from an iSCSI connection and then detaches the
     * volume from the specified gateway. Detaching and attaching a volume
     * enables you to recover your data from one gateway to a different gateway
     * without creating a snapshot. It also makes it easier to move your volumes
     * from an on-premises gateway to a gateway hosted on an Amazon EC2
     * instance. This operation is only supported in the volume gateway type.
     * </p>
     * 
     * @param detachVolumeRequest <p>
     *            AttachVolumeInput
     *            </p>
     * @return detachVolumeResult The response from the DetachVolume service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DetachVolumeResult detachVolume(DetachVolumeRequest detachVolumeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detachVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachVolumeRequest> request = null;
        Response<DetachVolumeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachVolumeRequestMarshaller().marshall(detachVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetachVolumeResult, JsonUnmarshallerContext> unmarshaller = new DetachVolumeResultJsonUnmarshaller();
            JsonResponseHandler<DetachVolumeResult> responseHandler = new JsonResponseHandler<DetachVolumeResult>(
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
     * Disables a tape gateway when the gateway is no longer functioning. For
     * example, if your gateway VM is damaged, you can disable the gateway so
     * you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a tape gateway that is not reachable or not
     * functioning. This operation is only supported in the tape gateway type.
     * </p>
     * <important>
     * <p>
     * After a gateway is disabled, it cannot be enabled.
     * </p>
     * </important>
     * 
     * @param disableGatewayRequest <p>
     *            DisableGatewayInput
     *            </p>
     * @return disableGatewayResult The response from the DisableGateway service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisableGatewayResult disableGateway(DisableGatewayRequest disableGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableGatewayRequest> request = null;
        Response<DisableGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableGatewayRequestMarshaller().marshall(disableGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableGatewayResult, JsonUnmarshallerContext> unmarshaller = new DisableGatewayResultJsonUnmarshaller();
            JsonResponseHandler<DisableGatewayResult> responseHandler = new JsonResponseHandler<DisableGatewayResult>(
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
     * Adds a file gateway to an Active Directory domain. This operation is only
     * supported for file gateways that support the SMB file protocol.
     * </p>
     * 
     * @param joinDomainRequest <p>
     *            JoinDomainInput
     *            </p>
     * @return joinDomainResult The response from the JoinDomain service method,
     *         as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public JoinDomainResult joinDomain(JoinDomainRequest joinDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(joinDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<JoinDomainRequest> request = null;
        Response<JoinDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new JoinDomainRequestMarshaller().marshall(joinDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<JoinDomainResult, JsonUnmarshallerContext> unmarshaller = new JoinDomainResultJsonUnmarshaller();
            JsonResponseHandler<JoinDomainResult> responseHandler = new JsonResponseHandler<JoinDomainResult>(
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
     * Lists the automatic tape creation policies for a gateway. If there are no
     * automatic tape creation policies for the gateway, it returns an empty
     * list.
     * </p>
     * <p>
     * This operation is only supported for tape gateways.
     * </p>
     * 
     * @param listAutomaticTapeCreationPoliciesRequest
     * @return listAutomaticTapeCreationPoliciesResult The response from the
     *         ListAutomaticTapeCreationPolicies service method, as returned by
     *         AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListAutomaticTapeCreationPoliciesResult listAutomaticTapeCreationPolicies(
            ListAutomaticTapeCreationPoliciesRequest listAutomaticTapeCreationPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAutomaticTapeCreationPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAutomaticTapeCreationPoliciesRequest> request = null;
        Response<ListAutomaticTapeCreationPoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAutomaticTapeCreationPoliciesRequestMarshaller()
                        .marshall(listAutomaticTapeCreationPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAutomaticTapeCreationPoliciesResult, JsonUnmarshallerContext> unmarshaller = new ListAutomaticTapeCreationPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<ListAutomaticTapeCreationPoliciesResult> responseHandler = new JsonResponseHandler<ListAutomaticTapeCreationPoliciesResult>(
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
     * Gets a list of the file shares for a specific file gateway, or the list
     * of file shares that belong to the calling user account. This operation is
     * only supported for file gateways.
     * </p>
     * 
     * @param listFileSharesRequest <p>
     *            ListFileShareInput
     *            </p>
     * @return listFileSharesResult The response from the ListFileShares service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListFileSharesResult listFileShares(ListFileSharesRequest listFileSharesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFileSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFileSharesRequest> request = null;
        Response<ListFileSharesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFileSharesRequestMarshaller().marshall(listFileSharesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListFileSharesResult, JsonUnmarshallerContext> unmarshaller = new ListFileSharesResultJsonUnmarshaller();
            JsonResponseHandler<ListFileSharesResult> responseHandler = new JsonResponseHandler<ListFileSharesResult>(
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
     * Lists gateways owned by an AWS account in an AWS Region specified in the
     * request. The returned list is ordered by gateway Amazon Resource Name
     * (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This
     * operation supports pagination that allows you to optionally reduce the
     * number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response (that is, the
     * response returns only a truncated list of your gateways), the response
     * contains a marker that you can specify in your next request to fetch the
     * next page of gateways.
     * </p>
     * 
     * @param listGatewaysRequest <p>
     *            A JSON object containing zero or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ListGatewaysInput$Limit</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ListGatewaysInput$Marker</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return listGatewaysResult The response from the ListGateways service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Returns a list of the gateway's local disks. To specify which gateway to
     * describe, you use the Amazon Resource Name (ARN) of the gateway in the
     * body of the request.
     * </p>
     * <p>
     * The request returns a list of all disks, specifying which are configured
     * as working storage, cache storage, or stored volume or not configured at
     * all. The response includes a <code>DiskStatus</code> field. This field
     * can have a value of present (the disk is available to use), missing (the
     * disk is no longer connected to the gateway), or mismatch (the disk node
     * is occupied by a disk that has incorrect metadata or the disk content is
     * corrupted).
     * </p>
     * 
     * @param listLocalDisksRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway.
     *            </p>
     * @return listLocalDisksResult The response from the ListLocalDisks service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListLocalDisksResult listLocalDisks(ListLocalDisksRequest listLocalDisksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listLocalDisksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLocalDisksRequest> request = null;
        Response<ListLocalDisksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLocalDisksRequestMarshaller().marshall(listLocalDisksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListLocalDisksResult, JsonUnmarshallerContext> unmarshaller = new ListLocalDisksResultJsonUnmarshaller();
            JsonResponseHandler<ListLocalDisksResult> responseHandler = new JsonResponseHandler<ListLocalDisksResult>(
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
     * Lists the tags that have been added to the specified resource. This
     * operation is supported in storage gateways of all types.
     * </p>
     * 
     * @param listTagsForResourceRequest <p>
     *            ListTagsForResourceInput
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Lists virtual tapes in your virtual tape library (VTL) and your virtual
     * tape shelf (VTS). You specify the tapes to list by specifying one or more
     * tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the
     * operation lists all virtual tapes in both your VTL and VTS.
     * </p>
     * <p>
     * This operation supports pagination. By default, the operation returns a
     * maximum of up to 100 tapes. You can optionally specify the
     * <code>Limit</code> parameter in the body to limit the number of tapes in
     * the response. If the number of tapes returned in the response is
     * truncated, the response includes a <code>Marker</code> element that you
     * can use in your subsequent request to retrieve the next set of tapes.
     * This operation is only supported in the tape gateway type.
     * </p>
     * 
     * @param listTapesRequest <p>
     *            A JSON object that contains one or more of the following
     *            fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ListTapesInput$Limit</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ListTapesInput$Marker</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ListTapesInput$TapeARNs</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return listTapesResult The response from the ListTapes service method,
     *         as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTapesResult listTapes(ListTapesRequest listTapesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTapesRequest> request = null;
        Response<ListTapesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTapesRequestMarshaller().marshall(listTapesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTapesResult, JsonUnmarshallerContext> unmarshaller = new ListTapesResultJsonUnmarshaller();
            JsonResponseHandler<ListTapesResult> responseHandler = new JsonResponseHandler<ListTapesResult>(
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
     * Lists iSCSI initiators that are connected to a volume. You can use this
     * operation to determine whether a volume is being used or not. This
     * operation is only supported in the cached volume and stored volume
     * gateway types.
     * </p>
     * 
     * @param listVolumeInitiatorsRequest <p>
     *            ListVolumeInitiatorsInput
     *            </p>
     * @return listVolumeInitiatorsResult The response from the
     *         ListVolumeInitiators service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListVolumeInitiatorsResult listVolumeInitiators(
            ListVolumeInitiatorsRequest listVolumeInitiatorsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVolumeInitiatorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumeInitiatorsRequest> request = null;
        Response<ListVolumeInitiatorsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumeInitiatorsRequestMarshaller()
                        .marshall(listVolumeInitiatorsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVolumeInitiatorsResult, JsonUnmarshallerContext> unmarshaller = new ListVolumeInitiatorsResultJsonUnmarshaller();
            JsonResponseHandler<ListVolumeInitiatorsResult> responseHandler = new JsonResponseHandler<ListVolumeInitiatorsResult>(
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
     * Lists the recovery points for a specified gateway. This operation is only
     * supported in the cached volume gateway type.
     * </p>
     * <p>
     * Each cache volume has one recovery point. A volume recovery point is a
     * point in time at which all data of the volume is consistent and from
     * which you can create a snapshot or clone a new cached volume from a
     * source volume. To create a snapshot from a volume recovery point use the
     * <a>CreateSnapshotFromVolumeRecoveryPoint</a> operation.
     * </p>
     * 
     * @param listVolumeRecoveryPointsRequest
     * @return listVolumeRecoveryPointsResult The response from the
     *         ListVolumeRecoveryPoints service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListVolumeRecoveryPointsResult listVolumeRecoveryPoints(
            ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVolumeRecoveryPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumeRecoveryPointsRequest> request = null;
        Response<ListVolumeRecoveryPointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumeRecoveryPointsRequestMarshaller()
                        .marshall(listVolumeRecoveryPointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVolumeRecoveryPointsResult, JsonUnmarshallerContext> unmarshaller = new ListVolumeRecoveryPointsResultJsonUnmarshaller();
            JsonResponseHandler<ListVolumeRecoveryPointsResult> responseHandler = new JsonResponseHandler<ListVolumeRecoveryPointsResult>(
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
     * Lists the iSCSI stored volumes of a gateway. Results are sorted by volume
     * ARN. The response includes only the volume ARNs. If you want additional
     * volume information, use the <a>DescribeStorediSCSIVolumes</a> or the
     * <a>DescribeCachediSCSIVolumes</a> API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a
     * maximum of up to 100 volumes. You can optionally specify the
     * <code>Limit</code> field in the body to limit the number of volumes in
     * the response. If the number of volumes returned in the response is
     * truncated, the response includes a Marker field. You can use this Marker
     * value in your subsequent request to retrieve the next set of volumes.
     * This operation is only supported in the cached volume and stored volume
     * gateway types.
     * </p>
     * 
     * @param listVolumesRequest <p>
     *            A JSON object that contains one or more of the following
     *            fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>ListVolumesInput$Limit</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ListVolumesInput$Marker</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return listVolumesResult The response from the ListVolumes service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListVolumesResult listVolumes(ListVolumesRequest listVolumesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumesRequest> request = null;
        Response<ListVolumesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumesRequestMarshaller().marshall(listVolumesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVolumesResult, JsonUnmarshallerContext> unmarshaller = new ListVolumesResultJsonUnmarshaller();
            JsonResponseHandler<ListVolumesResult> responseHandler = new JsonResponseHandler<ListVolumesResult>(
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
     * Sends you notification through CloudWatch Events when all files written
     * to your file share have been uploaded to Amazon S3.
     * </p>
     * <p>
     * AWS Storage Gateway can send a notification through Amazon CloudWatch
     * Events when all files written to your file share up to that point in time
     * have been uploaded to Amazon S3. These files include files written to the
     * file share up to the time that you make a request for notification. When
     * the upload is done, Storage Gateway sends you notification through an
     * Amazon CloudWatch Event. You can configure CloudWatch Events to send the
     * notification through event targets such as Amazon SNS or AWS Lambda
     * function. This operation is only supported for file gateways.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification"
     * >Getting file upload notification</a> in the <i>AWS Storage Gateway User
     * Guide</i>.
     * </p>
     * 
     * @param notifyWhenUploadedRequest
     * @return notifyWhenUploadedResult The response from the NotifyWhenUploaded
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public NotifyWhenUploadedResult notifyWhenUploaded(
            NotifyWhenUploadedRequest notifyWhenUploadedRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(notifyWhenUploadedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<NotifyWhenUploadedRequest> request = null;
        Response<NotifyWhenUploadedResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new NotifyWhenUploadedRequestMarshaller()
                        .marshall(notifyWhenUploadedRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<NotifyWhenUploadedResult, JsonUnmarshallerContext> unmarshaller = new NotifyWhenUploadedResultJsonUnmarshaller();
            JsonResponseHandler<NotifyWhenUploadedResult> responseHandler = new JsonResponseHandler<NotifyWhenUploadedResult>(
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
     * Refreshes the cache for the specified file share. This operation finds
     * objects in the Amazon S3 bucket that were added, removed or replaced
     * since the gateway last listed the bucket's contents and cached the
     * results. This operation is only supported in the file gateway type. You
     * can subscribe to be notified through an Amazon CloudWatch event when your
     * RefreshCache operation completes. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
     * >Getting notified about file operations</a> in the <i>AWS Storage Gateway
     * User Guide</i>.
     * </p>
     * <p>
     * When this API is called, it only initiates the refresh operation. When
     * the API call completes and returns a success code, it doesn't necessarily
     * mean that the file refresh has completed. You should use the
     * refresh-complete notification to determine that the operation has
     * completed before you check for new files on the gateway file share. You
     * can subscribe to be notified through an CloudWatch event when your
     * <code>RefreshCache</code> operation completes.
     * </p>
     * <p>
     * Throttle limit: This API is asynchronous so the gateway will accept no
     * more than two refreshes at any time. We recommend using the
     * refresh-complete CloudWatch event notification before issuing additional
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
     * >Getting notified about file operations</a> in the <i>AWS Storage Gateway
     * User Guide</i>.
     * </p>
     * <p>
     * If you invoke the RefreshCache API when two requests are already being
     * processed, any new request will cause an
     * <code>InvalidGatewayRequestException</code> error because too many
     * requests were sent to the server.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
     * >Getting notified about file operations</a> in the <i>AWS Storage Gateway
     * User Guide</i>.
     * </p>
     * 
     * @param refreshCacheRequest <p>
     *            RefreshCacheInput
     *            </p>
     * @return refreshCacheResult The response from the RefreshCache service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RefreshCacheResult refreshCache(RefreshCacheRequest refreshCacheRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(refreshCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshCacheRequest> request = null;
        Response<RefreshCacheResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshCacheRequestMarshaller().marshall(refreshCacheRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RefreshCacheResult, JsonUnmarshallerContext> unmarshaller = new RefreshCacheResultJsonUnmarshaller();
            JsonResponseHandler<RefreshCacheResult> responseHandler = new JsonResponseHandler<RefreshCacheResult>(
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
     * Removes one or more tags from the specified resource. This operation is
     * supported in storage gateways of all types.
     * </p>
     * 
     * @param removeTagsFromResourceRequest <p>
     *            RemoveTagsFromResourceInput
     *            </p>
     * @return removeTagsFromResourceResult The response from the
     *         RemoveTagsFromResource service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestMarshaller()
                        .marshall(removeTagsFromResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RemoveTagsFromResourceResult, JsonUnmarshallerContext> unmarshaller = new RemoveTagsFromResourceResultJsonUnmarshaller();
            JsonResponseHandler<RemoveTagsFromResourceResult> responseHandler = new JsonResponseHandler<RemoveTagsFromResourceResult>(
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
     * Resets all cache disks that have encountered an error and makes the disks
     * available for reconfiguration as cache storage. If your cache disk
     * encounters an error, the gateway prevents read and write operations on
     * virtual tapes in the gateway. For example, an error can occur when a disk
     * is corrupted or removed from the gateway. When a cache is reset, the
     * gateway loses its cache storage. At this point, you can reconfigure the
     * disks as cache disks. This operation is only supported in the cached
     * volume and tape types.
     * </p>
     * <important>
     * <p>
     * If the cache disk you are resetting contains data that has not been
     * uploaded to Amazon S3 yet, that data can be lost. After you reset cache
     * disks, there will be no configured cache disks left in the gateway, so
     * you must configure at least one new cache disk for your gateway to
     * function properly.
     * </p>
     * </important>
     * 
     * @param resetCacheRequest
     * @return resetCacheResult The response from the ResetCache service method,
     *         as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ResetCacheResult resetCache(ResetCacheRequest resetCacheRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resetCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetCacheRequest> request = null;
        Response<ResetCacheResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetCacheRequestMarshaller().marshall(resetCacheRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResetCacheResult, JsonUnmarshallerContext> unmarshaller = new ResetCacheResultJsonUnmarshaller();
            JsonResponseHandler<ResetCacheResult> responseHandler = new JsonResponseHandler<ResetCacheResult>(
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
     * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a
     * tape gateway. Virtual tapes archived in the VTS are not associated with
     * any gateway. However after a tape is retrieved, it is associated with a
     * gateway, even though it is also listed in the VTS, that is, archive. This
     * operation is only supported in the tape gateway type.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be
     * retrieved again to another gateway. You must archive the tape again
     * before you can retrieve it to another gateway. This operation is only
     * supported in the tape gateway type.
     * </p>
     * 
     * @param retrieveTapeArchiveRequest <p>
     *            RetrieveTapeArchiveInput
     *            </p>
     * @return retrieveTapeArchiveResult The response from the
     *         RetrieveTapeArchive service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RetrieveTapeArchiveResult retrieveTapeArchive(
            RetrieveTapeArchiveRequest retrieveTapeArchiveRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(retrieveTapeArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveTapeArchiveRequest> request = null;
        Response<RetrieveTapeArchiveResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveTapeArchiveRequestMarshaller()
                        .marshall(retrieveTapeArchiveRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RetrieveTapeArchiveResult, JsonUnmarshallerContext> unmarshaller = new RetrieveTapeArchiveResultJsonUnmarshaller();
            JsonResponseHandler<RetrieveTapeArchiveResult> responseHandler = new JsonResponseHandler<RetrieveTapeArchiveResult>(
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
     * Retrieves the recovery point for the specified virtual tape. This
     * operation is only supported in the tape gateway type.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which all
     * the data on the tape is consistent. If your gateway crashes, virtual
     * tapes that have recovery points can be recovered to a new gateway.
     * </p>
     * <note>
     * <p>
     * The virtual tape can be retrieved to only one gateway. The retrieved tape
     * is read-only. The virtual tape can be retrieved to only a tape gateway.
     * There is no charge for retrieving recovery points.
     * </p>
     * </note>
     * 
     * @param retrieveTapeRecoveryPointRequest <p>
     *            RetrieveTapeRecoveryPointInput
     *            </p>
     * @return retrieveTapeRecoveryPointResult The response from the
     *         RetrieveTapeRecoveryPoint service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RetrieveTapeRecoveryPointResult retrieveTapeRecoveryPoint(
            RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(retrieveTapeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveTapeRecoveryPointRequest> request = null;
        Response<RetrieveTapeRecoveryPointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveTapeRecoveryPointRequestMarshaller()
                        .marshall(retrieveTapeRecoveryPointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RetrieveTapeRecoveryPointResult, JsonUnmarshallerContext> unmarshaller = new RetrieveTapeRecoveryPointResultJsonUnmarshaller();
            JsonResponseHandler<RetrieveTapeRecoveryPointResult> responseHandler = new JsonResponseHandler<RetrieveTapeRecoveryPointResult>(
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
     * Sets the password for your VM local console. When you log in to the local
     * console for the first time, you log in to the VM with the default
     * credentials. We recommend that you set a new password. You don't need to
     * know the default password to set a new password.
     * </p>
     * 
     * @param setLocalConsolePasswordRequest <p>
     *            SetLocalConsolePasswordInput
     *            </p>
     * @return setLocalConsolePasswordResult The response from the
     *         SetLocalConsolePassword service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SetLocalConsolePasswordResult setLocalConsolePassword(
            SetLocalConsolePasswordRequest setLocalConsolePasswordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setLocalConsolePasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLocalConsolePasswordRequest> request = null;
        Response<SetLocalConsolePasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLocalConsolePasswordRequestMarshaller()
                        .marshall(setLocalConsolePasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SetLocalConsolePasswordResult, JsonUnmarshallerContext> unmarshaller = new SetLocalConsolePasswordResultJsonUnmarshaller();
            JsonResponseHandler<SetLocalConsolePasswordResult> responseHandler = new JsonResponseHandler<SetLocalConsolePasswordResult>(
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
     * Sets the password for the guest user <code>smbguest</code>. The
     * <code>smbguest</code> user is the user when the authentication method for
     * the file share is set to <code>GuestAccess</code>.
     * </p>
     * 
     * @param setSMBGuestPasswordRequest <p>
     *            SetSMBGuestPasswordInput
     *            </p>
     * @return setSMBGuestPasswordResult The response from the
     *         SetSMBGuestPassword service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SetSMBGuestPasswordResult setSMBGuestPassword(
            SetSMBGuestPasswordRequest setSMBGuestPasswordRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setSMBGuestPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetSMBGuestPasswordRequest> request = null;
        Response<SetSMBGuestPasswordResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetSMBGuestPasswordRequestMarshaller()
                        .marshall(setSMBGuestPasswordRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SetSMBGuestPasswordResult, JsonUnmarshallerContext> unmarshaller = new SetSMBGuestPasswordResultJsonUnmarshaller();
            JsonResponseHandler<SetSMBGuestPasswordResult> responseHandler = new JsonResponseHandler<SetSMBGuestPasswordResult>(
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
     * Shuts down a gateway. To specify which gateway to shut down, use the
     * Amazon Resource Name (ARN) of the gateway in the body of your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the
     * gateway's virtual machine (VM) and not the host VM.
     * </p>
     * <note>
     * <p>
     * If you want to shut down the VM, it is recommended that you first shut
     * down the gateway component in the VM to avoid unpredictable conditions.
     * </p>
     * </note>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except
     * <a>StartGateway</a>, <a>DescribeGatewayInformation</a>, and
     * <a>ListGateways</a>. For more information, see <a>ActivateGateway</a>.
     * Your applications cannot read from or write to the gateway's storage
     * volumes, and there are no snapshots taken.
     * </p>
     * <note>
     * <p>
     * When you make a shutdown request, you will get a <code>200 OK</code>
     * success response immediately. However, it might take some time for the
     * gateway to shut down. You can call the <a>DescribeGatewayInformation</a>
     * API to check the status. For more information, see
     * <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway
     * (using <a>DeleteGateway</a>) to no longer pay software charges associated
     * with the gateway.
     * </p>
     * 
     * @param shutdownGatewayRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway to shut down.
     *            </p>
     * @return shutdownGatewayResult The response from the ShutdownGateway
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ShutdownGatewayResult shutdownGateway(ShutdownGatewayRequest shutdownGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(shutdownGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ShutdownGatewayRequest> request = null;
        Response<ShutdownGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ShutdownGatewayRequestMarshaller().marshall(shutdownGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ShutdownGatewayResult, JsonUnmarshallerContext> unmarshaller = new ShutdownGatewayResultJsonUnmarshaller();
            JsonResponseHandler<ShutdownGatewayResult> responseHandler = new JsonResponseHandler<ShutdownGatewayResult>(
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
     * Start a test that verifies that the specified gateway is configured for
     * High Availability monitoring in your host environment. This request only
     * initiates the test and that a successful response only indicates that the
     * test was started. It doesn't indicate that the test passed. For the
     * status of the test, invoke the
     * <code>DescribeAvailabilityMonitorTest</code> API.
     * </p>
     * <note>
     * <p>
     * Starting this test will cause your gateway to go offline for a brief
     * period.
     * </p>
     * </note>
     * 
     * @param startAvailabilityMonitorTestRequest
     * @return startAvailabilityMonitorTestResult The response from the
     *         StartAvailabilityMonitorTest service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public StartAvailabilityMonitorTestResult startAvailabilityMonitorTest(
            StartAvailabilityMonitorTestRequest startAvailabilityMonitorTestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startAvailabilityMonitorTestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAvailabilityMonitorTestRequest> request = null;
        Response<StartAvailabilityMonitorTestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAvailabilityMonitorTestRequestMarshaller()
                        .marshall(startAvailabilityMonitorTestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartAvailabilityMonitorTestResult, JsonUnmarshallerContext> unmarshaller = new StartAvailabilityMonitorTestResultJsonUnmarshaller();
            JsonResponseHandler<StartAvailabilityMonitorTestResult> responseHandler = new JsonResponseHandler<StartAvailabilityMonitorTestResult>(
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
     * Starts a gateway that you previously shut down (see
     * <a>ShutdownGateway</a>). After the gateway starts, you can then make
     * other API calls, your applications can read from or write to the
     * gateway's storage volumes and you will be able to take snapshot backups.
     * </p>
     * <note>
     * <p>
     * When you make a request, you will get a 200 OK success response
     * immediately. However, it might take some time for the gateway to be
     * ready. You should call <a>DescribeGatewayInformation</a> and check the
     * status before making any additional API calls. For more information, see
     * <a>ActivateGateway</a>.
     * </p>
     * </note>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param startGatewayRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway to start.
     *            </p>
     * @return startGatewayResult The response from the StartGateway service
     *         method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public StartGatewayResult startGateway(StartGatewayRequest startGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartGatewayRequest> request = null;
        Response<StartGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartGatewayRequestMarshaller().marshall(startGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartGatewayResult, JsonUnmarshallerContext> unmarshaller = new StartGatewayResultJsonUnmarshaller();
            JsonResponseHandler<StartGatewayResult> responseHandler = new JsonResponseHandler<StartGatewayResult>(
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
     * Updates the automatic tape creation policy of a gateway. Use this to
     * update the policy with a new set of automatic tape creation rules. This
     * is only supported for tape gateways.
     * </p>
     * <p>
     * By default, there is no automatic tape creation policy.
     * </p>
     * <note>
     * <p>
     * A gateway can have only one automatic tape creation policy.
     * </p>
     * </note>
     * 
     * @param updateAutomaticTapeCreationPolicyRequest
     * @return updateAutomaticTapeCreationPolicyResult The response from the
     *         UpdateAutomaticTapeCreationPolicy service method, as returned by
     *         AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateAutomaticTapeCreationPolicyResult updateAutomaticTapeCreationPolicy(
            UpdateAutomaticTapeCreationPolicyRequest updateAutomaticTapeCreationPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAutomaticTapeCreationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAutomaticTapeCreationPolicyRequest> request = null;
        Response<UpdateAutomaticTapeCreationPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAutomaticTapeCreationPolicyRequestMarshaller()
                        .marshall(updateAutomaticTapeCreationPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAutomaticTapeCreationPolicyResult, JsonUnmarshallerContext> unmarshaller = new UpdateAutomaticTapeCreationPolicyResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAutomaticTapeCreationPolicyResult> responseHandler = new JsonResponseHandler<UpdateAutomaticTapeCreationPolicyResult>(
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
     * Updates the bandwidth rate limits of a gateway. You can update both the
     * upload and download bandwidth rate limit or specify only one of the two.
     * If you don't set a bandwidth rate limit, the existing rate limit remains.
     * This operation is supported for the stored volume, cached volume, and
     * tape gateway types.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you don't
     * set any limit, the gateway does not have any limitations on its bandwidth
     * usage and could potentially use the maximum available bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN) of
     * the gateway in your request.
     * </p>
     * 
     * @param updateBandwidthRateLimitRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>
     *            UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec
     *            </a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>
     *            UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec
     *            </a>
     *            </p>
     *            </li>
     *            </ul>
     * @return updateBandwidthRateLimitResult The response from the
     *         UpdateBandwidthRateLimit service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateBandwidthRateLimitResult updateBandwidthRateLimit(
            UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBandwidthRateLimitRequest> request = null;
        Response<UpdateBandwidthRateLimitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBandwidthRateLimitRequestMarshaller()
                        .marshall(updateBandwidthRateLimitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBandwidthRateLimitResult, JsonUnmarshallerContext> unmarshaller = new UpdateBandwidthRateLimitResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<UpdateBandwidthRateLimitResult>(
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
     * Updates the Challenge-Handshake Authentication Protocol (CHAP)
     * credentials for a specified iSCSI target. By default, a gateway does not
     * have CHAP enabled; however, for added security, you might use it. This
     * operation is supported in the volume and tape gateway types.
     * </p>
     * <important>
     * <p>
     * When you update CHAP credentials, all existing connections on the target
     * are closed and initiators must reconnect with the new credentials.
     * </p>
     * </important>
     * 
     * @param updateChapCredentialsRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>UpdateChapCredentialsInput$InitiatorName</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a
     *            >
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateChapCredentialsInput$TargetARN</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return updateChapCredentialsResult The response from the
     *         UpdateChapCredentials service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateChapCredentialsResult updateChapCredentials(
            UpdateChapCredentialsRequest updateChapCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChapCredentialsRequest> request = null;
        Response<UpdateChapCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChapCredentialsRequestMarshaller()
                        .marshall(updateChapCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateChapCredentialsResult, JsonUnmarshallerContext> unmarshaller = new UpdateChapCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateChapCredentialsResult> responseHandler = new JsonResponseHandler<UpdateChapCredentialsResult>(
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
     * Updates a gateway's metadata, which includes the gateway's name and time
     * zone. To specify which gateway to update, use the Amazon Resource Name
     * (ARN) of the gateway in your request.
     * </p>
     * <note>
     * <p>
     * For Gateways activated after September 2, 2015, the gateway's ARN
     * contains the gateway ID rather than the gateway name. However, changing
     * the name of the gateway has no effect on the gateway's ARN.
     * </p>
     * </note>
     * 
     * @param updateGatewayInformationRequest
     * @return updateGatewayInformationResult The response from the
     *         UpdateGatewayInformation service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateGatewayInformationResult updateGatewayInformation(
            UpdateGatewayInformationRequest updateGatewayInformationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGatewayInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayInformationRequest> request = null;
        Response<UpdateGatewayInformationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayInformationRequestMarshaller()
                        .marshall(updateGatewayInformationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGatewayInformationResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewayInformationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGatewayInformationResult> responseHandler = new JsonResponseHandler<UpdateGatewayInformationResult>(
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
     * Updates the gateway virtual machine (VM) software. The request
     * immediately triggers the software update.
     * </p>
     * <note>
     * <p>
     * When you make this request, you get a <code>200 OK</code> success
     * response immediately. However, it might take some time for the update to
     * complete. You can call <a>DescribeGatewayInformation</a> to verify the
     * gateway is in the <code>STATE_RUNNING</code> state.
     * </p>
     * </note> <important>
     * <p>
     * A software update forces a system restart of your gateway. You can
     * minimize the chance of any disruption to your applications by increasing
     * your iSCSI Initiators' timeouts. For more information about increasing
     * iSCSI Initiator timeouts for Windows and Linux, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings"
     * >Customizing your Windows iSCSI settings</a> and <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings"
     * >Customizing your Linux iSCSI settings</a>, respectively.
     * </p>
     * </important>
     * 
     * @param updateGatewaySoftwareNowRequest <p>
     *            A JSON object containing the Amazon Resource Name (ARN) of the
     *            gateway to update.
     *            </p>
     * @return updateGatewaySoftwareNowResult The response from the
     *         UpdateGatewaySoftwareNow service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(
            UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGatewaySoftwareNowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewaySoftwareNowRequest> request = null;
        Response<UpdateGatewaySoftwareNowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewaySoftwareNowRequestMarshaller()
                        .marshall(updateGatewaySoftwareNowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGatewaySoftwareNowResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewaySoftwareNowResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGatewaySoftwareNowResult> responseHandler = new JsonResponseHandler<UpdateGatewaySoftwareNowResult>(
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
     * Updates a gateway's weekly maintenance start time information, including
     * day and time of the week. The maintenance time is the time in your
     * gateway's time zone.
     * </p>
     * 
     * @param updateMaintenanceStartTimeRequest <p>
     *            A JSON object containing the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>UpdateMaintenanceStartTimeInput$DayOfMonth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateMaintenanceStartTimeInput$DayOfWeek</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateMaintenanceStartTimeInput$HourOfDay</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return updateMaintenanceStartTimeResult The response from the
     *         UpdateMaintenanceStartTime service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateMaintenanceStartTimeResult updateMaintenanceStartTime(
            UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMaintenanceStartTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceStartTimeRequest> request = null;
        Response<UpdateMaintenanceStartTimeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceStartTimeRequestMarshaller()
                        .marshall(updateMaintenanceStartTimeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMaintenanceStartTimeResult, JsonUnmarshallerContext> unmarshaller = new UpdateMaintenanceStartTimeResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMaintenanceStartTimeResult> responseHandler = new JsonResponseHandler<UpdateMaintenanceStartTimeResult>(
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
     * Updates a Network File System (NFS) file share. This operation is only
     * supported in the file gateway type.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field
     * to null.
     * </p>
     * </note>
     * <p>
     * Updates the following file share setting:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Default storage class for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Metadata defaults for your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed NFS clients for your file share
     * </p>
     * </li>
     * <li>
     * <p>
     * Squash settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Write status of your file share
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field
     * to null. This operation is only supported in file gateways.
     * </p>
     * </note>
     * 
     * @param updateNFSFileShareRequest <p>
     *            UpdateNFSFileShareInput
     *            </p>
     * @return updateNFSFileShareResult The response from the UpdateNFSFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateNFSFileShareResult updateNFSFileShare(
            UpdateNFSFileShareRequest updateNFSFileShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateNFSFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNFSFileShareRequest> request = null;
        Response<UpdateNFSFileShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNFSFileShareRequestMarshaller()
                        .marshall(updateNFSFileShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateNFSFileShareResult, JsonUnmarshallerContext> unmarshaller = new UpdateNFSFileShareResultJsonUnmarshaller();
            JsonResponseHandler<UpdateNFSFileShareResult> responseHandler = new JsonResponseHandler<UpdateNFSFileShareResult>(
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
     * Updates a Server Message Block (SMB) file share.
     * </p>
     * <note>
     * <p>
     * To leave a file share field unchanged, set the corresponding input field
     * to null. This operation is only supported for file gateways.
     * </p>
     * </note> <important>
     * <p>
     * File gateways require AWS Security Token Service (AWS STS) to be
     * activated to enable you to create a file share. Make sure that AWS STS is
     * activated in the AWS Region you are creating your file gateway in. If AWS
     * STS is not activated in this AWS Region, activate it. For information
     * about how to activate AWS STS, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * <p>
     * File gateways don't support creating hard or symbolic links on a file
     * share.
     * </p>
     * </important>
     * 
     * @param updateSMBFileShareRequest <p>
     *            UpdateSMBFileShareInput
     *            </p>
     * @return updateSMBFileShareResult The response from the UpdateSMBFileShare
     *         service method, as returned by AWS Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateSMBFileShareResult updateSMBFileShare(
            UpdateSMBFileShareRequest updateSMBFileShareRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSMBFileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSMBFileShareRequest> request = null;
        Response<UpdateSMBFileShareResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSMBFileShareRequestMarshaller()
                        .marshall(updateSMBFileShareRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSMBFileShareResult, JsonUnmarshallerContext> unmarshaller = new UpdateSMBFileShareResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSMBFileShareResult> responseHandler = new JsonResponseHandler<UpdateSMBFileShareResult>(
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
     * Updates the SMB security strategy on a file gateway. This action is only
     * supported in file gateways.
     * </p>
     * <note>
     * <p>
     * This API is called Security level in the User Guide.
     * </p>
     * <p>
     * A higher security level can affect performance of the gateway.
     * </p>
     * </note>
     * 
     * @param updateSMBSecurityStrategyRequest
     * @return updateSMBSecurityStrategyResult The response from the
     *         UpdateSMBSecurityStrategy service method, as returned by AWS
     *         Storage Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateSMBSecurityStrategyResult updateSMBSecurityStrategy(
            UpdateSMBSecurityStrategyRequest updateSMBSecurityStrategyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSMBSecurityStrategyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSMBSecurityStrategyRequest> request = null;
        Response<UpdateSMBSecurityStrategyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSMBSecurityStrategyRequestMarshaller()
                        .marshall(updateSMBSecurityStrategyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSMBSecurityStrategyResult, JsonUnmarshallerContext> unmarshaller = new UpdateSMBSecurityStrategyResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSMBSecurityStrategyResult> responseHandler = new JsonResponseHandler<UpdateSMBSecurityStrategyResult>(
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
     * Updates a snapshot schedule configured for a gateway volume. This
     * operation is only supported in the cached volume and stored volume
     * gateway types.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours, starting
     * at the creation time of the volume. You can use this API to change the
     * snapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot
     * schedule you want to update, and the schedule information, including when
     * you want the snapshot to begin on a day and the frequency (in hours) of
     * snapshots.
     * </p>
     * 
     * @param updateSnapshotScheduleRequest <p>
     *            A JSON object containing one or more of the following fields:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>UpdateSnapshotScheduleInput$Description</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateSnapshotScheduleInput$RecurrenceInHours</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateSnapshotScheduleInput$StartAt</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>UpdateSnapshotScheduleInput$VolumeARN</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return updateSnapshotScheduleResult The response from the
     *         UpdateSnapshotSchedule service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateSnapshotScheduleResult updateSnapshotSchedule(
            UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSnapshotScheduleRequest> request = null;
        Response<UpdateSnapshotScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSnapshotScheduleRequestMarshaller()
                        .marshall(updateSnapshotScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSnapshotScheduleResult, JsonUnmarshallerContext> unmarshaller = new UpdateSnapshotScheduleResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSnapshotScheduleResult> responseHandler = new JsonResponseHandler<UpdateSnapshotScheduleResult>(
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
     * Updates the type of medium changer in a tape gateway. When you activate a
     * tape gateway, you select a medium changer type for the tape gateway. This
     * operation enables you to select a different type of medium changer after
     * a tape gateway is activated. This operation is only supported in the tape
     * gateway type.
     * </p>
     * 
     * @param updateVTLDeviceTypeRequest
     * @return updateVTLDeviceTypeResult The response from the
     *         UpdateVTLDeviceType service method, as returned by AWS Storage
     *         Gateway.
     * @throws InvalidGatewayRequestException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Storage Gateway indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateVTLDeviceTypeResult updateVTLDeviceType(
            UpdateVTLDeviceTypeRequest updateVTLDeviceTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVTLDeviceTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVTLDeviceTypeRequest> request = null;
        Response<UpdateVTLDeviceTypeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVTLDeviceTypeRequestMarshaller()
                        .marshall(updateVTLDeviceTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVTLDeviceTypeResult, JsonUnmarshallerContext> unmarshaller = new UpdateVTLDeviceTypeResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVTLDeviceTypeResult> responseHandler = new JsonResponseHandler<UpdateVTLDeviceTypeResult>(
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
