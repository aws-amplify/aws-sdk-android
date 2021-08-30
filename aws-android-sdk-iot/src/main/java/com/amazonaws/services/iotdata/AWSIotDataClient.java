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

package com.amazonaws.services.iotdata;

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

import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.services.iotdata.model.transform.*;

/**
 * Client for accessing AWS IoT Data. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>IoT data</fullname>
 * <p>
 * IoT data enables secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded devices, or
 * smart appliances) and the Amazon Web Services cloud. It implements a broker
 * for applications and things to publish messages over HTTP (Publish) and
 * retrieve, update, and delete shadows. A shadow is a persistent representation
 * of your things and their state in the Amazon Web Services cloud.
 * </p>
 * <p>
 * Find the endpoint address for actions in IoT data by running this CLI
 * command:
 * </p>
 * <p>
 * <code>aws iot describe-endpoint --endpoint-type iot:Data-ATS</code>
 * </p>
 * <p>
 * The service name used by <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Amazon Web ServicesSignature Version 4</a> to sign requests is:
 * <i>iotdevicegateway</i>.
 * </p>
 */
public class AWSIotDataClient extends AmazonWebServiceClient implements AWSIotData {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS IoT Data exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSIotData. A
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
    public AWSIotDataClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSIotData. A
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
     *            how this client connects to AWSIotData (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSIotDataClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSIotData using the
     * specified AWS account credentials.
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
     *         AWSIotDataClient client = new AWSIotDataClient(AWSMobileClient.getInstance());
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
    public AWSIotDataClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSIotData using the
     * specified AWS account credentials and client configuration options.
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
     *         AWSIotDataClient client = new AWSIotDataClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSIotData (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSIotDataClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSIotData using the
     * specified AWS account credentials provider.
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
     *         AWSIotDataClient client = new AWSIotDataClient(AWSMobileClient.getInstance());
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
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSIotData using the
     * specified AWS account credentials provider and client configuration
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
     *         AWSIotDataClient client = new AWSIotDataClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSIotData (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSIotData using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSIotData (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSIotData using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
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
     *         AWSIotDataClient client = new AWSIotDataClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSIotData (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MethodNotAllowedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RequestEntityTooLargeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedDocumentEncodingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        setServiceNameIntern("iotdata");
        this.setEndpoint("data.iot.us-east-1.amazonaws.com");
        this.endpointPrefix = "data.iot";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/iotdata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/iotdata/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Deletes the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html"
     * >DeleteThingShadow</a> in the IoT Developer Guide.
     * </p>
     * 
     * @param deleteThingShadowRequest <p>
     *            The input for the DeleteThingShadow operation.
     *            </p>
     * @return deleteThingShadowResult The response from the DeleteThingShadow
     *         service method, as returned by AWS IoT Data.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws UnsupportedDocumentEncodingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteThingShadowResult deleteThingShadow(
            DeleteThingShadowRequest deleteThingShadowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteThingShadowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingShadowRequest> request = null;
        Response<DeleteThingShadowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingShadowRequestMarshaller()
                        .marshall(deleteThingShadowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteThingShadowResult, JsonUnmarshallerContext> unmarshaller = new DeleteThingShadowResultJsonUnmarshaller();
            JsonResponseHandler<DeleteThingShadowResult> responseHandler = new JsonResponseHandler<DeleteThingShadowResult>(
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
     * Gets the details of a single retained message for the specified topic.
     * </p>
     * <p>
     * This action returns the message payload of the retained message, which
     * can incur messaging costs. To list only the topic names of the retained
     * messages, call <a
     * href="/iot/latest/developerguide/API_iotdata_ListRetainedMessages.html"
     * >ListRetainedMessages</a>.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >GetRetainedMessage</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">IoT Core pricing
     * - Messaging</a>.
     * </p>
     * 
     * @param getRetainedMessageRequest <p>
     *            The input for the GetRetainedMessage operation.
     *            </p>
     * @return getRetainedMessageResult The response from the GetRetainedMessage
     *         service method, as returned by AWS IoT Data.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRetainedMessageResult getRetainedMessage(
            GetRetainedMessageRequest getRetainedMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRetainedMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRetainedMessageRequest> request = null;
        Response<GetRetainedMessageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRetainedMessageRequestMarshaller()
                        .marshall(getRetainedMessageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRetainedMessageResult, JsonUnmarshallerContext> unmarshaller = new GetRetainedMessageResultJsonUnmarshaller();
            JsonResponseHandler<GetRetainedMessageResult> responseHandler = new JsonResponseHandler<GetRetainedMessageResult>(
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
     * Gets the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html"
     * >GetThingShadow</a> in the IoT Developer Guide.
     * </p>
     * 
     * @param getThingShadowRequest <p>
     *            The input for the GetThingShadow operation.
     *            </p>
     * @return getThingShadowResult The response from the GetThingShadow service
     *         method, as returned by AWS IoT Data.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws UnsupportedDocumentEncodingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetThingShadowResult getThingShadow(GetThingShadowRequest getThingShadowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getThingShadowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetThingShadowRequest> request = null;
        Response<GetThingShadowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetThingShadowRequestMarshaller().marshall(getThingShadowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetThingShadowResult, JsonUnmarshallerContext> unmarshaller = new GetThingShadowResultJsonUnmarshaller();
            JsonResponseHandler<GetThingShadowResult> responseHandler = new JsonResponseHandler<GetThingShadowResult>(
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
     * Lists the shadows for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListNamedShadowsForThing</a> action.
     * </p>
     * 
     * @param listNamedShadowsForThingRequest
     * @return listNamedShadowsForThingResult The response from the
     *         ListNamedShadowsForThing service method, as returned by AWS IoT
     *         Data.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListNamedShadowsForThingResult listNamedShadowsForThing(
            ListNamedShadowsForThingRequest listNamedShadowsForThingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listNamedShadowsForThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNamedShadowsForThingRequest> request = null;
        Response<ListNamedShadowsForThingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNamedShadowsForThingRequestMarshaller()
                        .marshall(listNamedShadowsForThingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListNamedShadowsForThingResult, JsonUnmarshallerContext> unmarshaller = new ListNamedShadowsForThingResultJsonUnmarshaller();
            JsonResponseHandler<ListNamedShadowsForThingResult> responseHandler = new JsonResponseHandler<ListNamedShadowsForThingResult>(
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
     * Lists summary information about the retained messages stored for the
     * account.
     * </p>
     * <p>
     * This action returns only the topic names of the retained messages. It
     * doesn't return any message payloads. Although this action doesn't return
     * a message payload, it can still incur messaging costs.
     * </p>
     * <p>
     * To get the message payload of a retained message, call <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/API_iotdata_GetRetainedMessage.html"
     * >GetRetainedMessage</a> with the topic name of the retained message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >ListRetainedMessages</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">IoT Core pricing
     * - Messaging</a>.
     * </p>
     * 
     * @param listRetainedMessagesRequest
     * @return listRetainedMessagesResult The response from the
     *         ListRetainedMessages service method, as returned by AWS IoT Data.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRetainedMessagesResult listRetainedMessages(
            ListRetainedMessagesRequest listRetainedMessagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRetainedMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRetainedMessagesRequest> request = null;
        Response<ListRetainedMessagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRetainedMessagesRequestMarshaller()
                        .marshall(listRetainedMessagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRetainedMessagesResult, JsonUnmarshallerContext> unmarshaller = new ListRetainedMessagesResultJsonUnmarshaller();
            JsonResponseHandler<ListRetainedMessagesResult> responseHandler = new JsonResponseHandler<ListRetainedMessagesResult>(
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
     * Publishes an MQTT message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >Publish</a> action.
     * </p>
     * <p>
     * For more information about MQTT messages, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html"
     * >MQTT Protocol</a> in the IoT Developer Guide.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">IoT Core pricing
     * - Messaging</a>.
     * </p>
     * 
     * @param publishRequest <p>
     *            The input for the Publish operation.
     *            </p>
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws MethodNotAllowedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void publish(PublishRequest publishRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(publishRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishRequestMarshaller().marshall(publishRequest);
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
     * Updates the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html"
     * >UpdateThingShadow</a> in the IoT Developer Guide.
     * </p>
     * 
     * @param updateThingShadowRequest <p>
     *            The input for the UpdateThingShadow operation.
     *            </p>
     * @return updateThingShadowResult The response from the UpdateThingShadow
     *         service method, as returned by AWS IoT Data.
     * @throws ConflictException
     * @throws RequestEntityTooLargeException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws UnsupportedDocumentEncodingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateThingShadowResult updateThingShadow(
            UpdateThingShadowRequest updateThingShadowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateThingShadowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThingShadowRequest> request = null;
        Response<UpdateThingShadowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThingShadowRequestMarshaller()
                        .marshall(updateThingShadowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateThingShadowResult, JsonUnmarshallerContext> unmarshaller = new UpdateThingShadowResultJsonUnmarshaller();
            JsonResponseHandler<UpdateThingShadowResult> responseHandler = new JsonResponseHandler<UpdateThingShadowResult>(
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
