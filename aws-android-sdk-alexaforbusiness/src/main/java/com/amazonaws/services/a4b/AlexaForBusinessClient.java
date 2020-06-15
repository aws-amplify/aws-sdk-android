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

package com.amazonaws.services.a4b;

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

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.services.a4b.model.transform.*;

/**
 * Client for accessing Alexa For Business. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Alexa for Business helps you use Alexa in your organization. Alexa for
 * Business provides you with the tools to manage Alexa devices, enroll your
 * users, and assign skills, at scale. You can build your own context-aware
 * voice skills using the Alexa Skills Kit and the Alexa for Business API
 * operations. You can also make these available as private skills for your
 * organization. Alexa for Business makes it efficient to voice-enable your
 * products and services, thus providing context-aware voice experiences for
 * your customers. Device makers building with the Alexa Voice Service (AVS) can
 * create fully integrated solutions, register their products with Alexa for
 * Business, and manage them as shared devices in their organization.
 * </p>
 */
public class AlexaForBusinessClient extends AmazonWebServiceClient implements AlexaForBusiness {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Alexa For Business exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AlexaForBusiness. A
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
    public AlexaForBusinessClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AlexaForBusiness. A
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
     *            how this client connects to AlexaForBusiness (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AlexaForBusinessClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AlexaForBusiness
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
     *         AlexaForBusinessClient client = new AlexaForBusinessClient(AWSMobileClient.getInstance());
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
    public AlexaForBusinessClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AlexaForBusiness
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
     *         AlexaForBusinessClient client = new AlexaForBusinessClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AlexaForBusiness (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AlexaForBusinessClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AlexaForBusiness
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
     *         AlexaForBusinessClient client = new AlexaForBusinessClient(AWSMobileClient.getInstance());
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
    public AlexaForBusinessClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AlexaForBusiness
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
     *         AlexaForBusinessClient client = new AlexaForBusinessClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AlexaForBusiness (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AlexaForBusinessClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AlexaForBusiness
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
     *            how this client connects to AlexaForBusiness (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AlexaForBusinessClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AlexaForBusiness
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
     *         AlexaForBusinessClient client = new AlexaForBusinessClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AlexaForBusiness (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AlexaForBusinessClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeviceNotRegisteredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidCertificateAuthorityExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeviceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSecretsManagerResourceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidServiceLinkedRoleStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidUserStatusExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NameInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAssociatedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SkillNotLinkedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("a4b.us-east-1.amazonaws.com");
        this.endpointPrefix = "a4b";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/a4b/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/a4b/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Associates a skill with the organization under the customer's AWS
     * account. If a skill is private, the user implicitly accepts access to
     * this skill during enablement.
     * </p>
     * 
     * @param approveSkillRequest
     * @return approveSkillResult The response from the ApproveSkill service
     *         method, as returned by Alexa For Business.
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ApproveSkillResult approveSkill(ApproveSkillRequest approveSkillRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(approveSkillRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApproveSkillRequest> request = null;
        Response<ApproveSkillResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApproveSkillRequestMarshaller().marshall(approveSkillRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ApproveSkillResult, JsonUnmarshallerContext> unmarshaller = new ApproveSkillResultJsonUnmarshaller();
            JsonResponseHandler<ApproveSkillResult> responseHandler = new JsonResponseHandler<ApproveSkillResult>(
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
     * Associates a contact with a given address book.
     * </p>
     * 
     * @param associateContactWithAddressBookRequest
     * @return associateContactWithAddressBookResult The response from the
     *         AssociateContactWithAddressBook service method, as returned by
     *         Alexa For Business.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateContactWithAddressBookResult associateContactWithAddressBook(
            AssociateContactWithAddressBookRequest associateContactWithAddressBookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateContactWithAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateContactWithAddressBookRequest> request = null;
        Response<AssociateContactWithAddressBookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateContactWithAddressBookRequestMarshaller()
                        .marshall(associateContactWithAddressBookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateContactWithAddressBookResult, JsonUnmarshallerContext> unmarshaller = new AssociateContactWithAddressBookResultJsonUnmarshaller();
            JsonResponseHandler<AssociateContactWithAddressBookResult> responseHandler = new JsonResponseHandler<AssociateContactWithAddressBookResult>(
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
     * Associates a device with the specified network profile.
     * </p>
     * 
     * @param associateDeviceWithNetworkProfileRequest
     * @return associateDeviceWithNetworkProfileResult The response from the
     *         AssociateDeviceWithNetworkProfile service method, as returned by
     *         Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateDeviceWithNetworkProfileResult associateDeviceWithNetworkProfile(
            AssociateDeviceWithNetworkProfileRequest associateDeviceWithNetworkProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateDeviceWithNetworkProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDeviceWithNetworkProfileRequest> request = null;
        Response<AssociateDeviceWithNetworkProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDeviceWithNetworkProfileRequestMarshaller()
                        .marshall(associateDeviceWithNetworkProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateDeviceWithNetworkProfileResult, JsonUnmarshallerContext> unmarshaller = new AssociateDeviceWithNetworkProfileResultJsonUnmarshaller();
            JsonResponseHandler<AssociateDeviceWithNetworkProfileResult> responseHandler = new JsonResponseHandler<AssociateDeviceWithNetworkProfileResult>(
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
     * Associates a device with a given room. This applies all the settings from
     * the room profile to the device, and all the skills in any skill groups
     * added to that room. This operation requires the device to be online, or
     * else a manual sync is required.
     * </p>
     * 
     * @param associateDeviceWithRoomRequest
     * @return associateDeviceWithRoomResult The response from the
     *         AssociateDeviceWithRoom service method, as returned by Alexa For
     *         Business.
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateDeviceWithRoomResult associateDeviceWithRoom(
            AssociateDeviceWithRoomRequest associateDeviceWithRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateDeviceWithRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDeviceWithRoomRequest> request = null;
        Response<AssociateDeviceWithRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDeviceWithRoomRequestMarshaller()
                        .marshall(associateDeviceWithRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateDeviceWithRoomResult, JsonUnmarshallerContext> unmarshaller = new AssociateDeviceWithRoomResultJsonUnmarshaller();
            JsonResponseHandler<AssociateDeviceWithRoomResult> responseHandler = new JsonResponseHandler<AssociateDeviceWithRoomResult>(
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
     * Associates a skill group with a given room. This enables all skills in
     * the associated skill group on all devices in the room.
     * </p>
     * 
     * @param associateSkillGroupWithRoomRequest
     * @return associateSkillGroupWithRoomResult The response from the
     *         AssociateSkillGroupWithRoom service method, as returned by Alexa
     *         For Business.
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(
            AssociateSkillGroupWithRoomRequest associateSkillGroupWithRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateSkillGroupWithRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSkillGroupWithRoomRequest> request = null;
        Response<AssociateSkillGroupWithRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSkillGroupWithRoomRequestMarshaller()
                        .marshall(associateSkillGroupWithRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateSkillGroupWithRoomResult, JsonUnmarshallerContext> unmarshaller = new AssociateSkillGroupWithRoomResultJsonUnmarshaller();
            JsonResponseHandler<AssociateSkillGroupWithRoomResult> responseHandler = new JsonResponseHandler<AssociateSkillGroupWithRoomResult>(
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
     * Associates a skill with a skill group.
     * </p>
     * 
     * @param associateSkillWithSkillGroupRequest
     * @return associateSkillWithSkillGroupResult The response from the
     *         AssociateSkillWithSkillGroup service method, as returned by Alexa
     *         For Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws SkillNotLinkedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateSkillWithSkillGroupResult associateSkillWithSkillGroup(
            AssociateSkillWithSkillGroupRequest associateSkillWithSkillGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateSkillWithSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSkillWithSkillGroupRequest> request = null;
        Response<AssociateSkillWithSkillGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSkillWithSkillGroupRequestMarshaller()
                        .marshall(associateSkillWithSkillGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateSkillWithSkillGroupResult, JsonUnmarshallerContext> unmarshaller = new AssociateSkillWithSkillGroupResultJsonUnmarshaller();
            JsonResponseHandler<AssociateSkillWithSkillGroupResult> responseHandler = new JsonResponseHandler<AssociateSkillWithSkillGroupResult>(
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
     * Makes a private skill available for enrolled users to enable on their
     * devices.
     * </p>
     * 
     * @param associateSkillWithUsersRequest
     * @return associateSkillWithUsersResult The response from the
     *         AssociateSkillWithUsers service method, as returned by Alexa For
     *         Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateSkillWithUsersResult associateSkillWithUsers(
            AssociateSkillWithUsersRequest associateSkillWithUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateSkillWithUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSkillWithUsersRequest> request = null;
        Response<AssociateSkillWithUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSkillWithUsersRequestMarshaller()
                        .marshall(associateSkillWithUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateSkillWithUsersResult, JsonUnmarshallerContext> unmarshaller = new AssociateSkillWithUsersResultJsonUnmarshaller();
            JsonResponseHandler<AssociateSkillWithUsersResult> responseHandler = new JsonResponseHandler<AssociateSkillWithUsersResult>(
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
     * Creates an address book with the specified details.
     * </p>
     * 
     * @param createAddressBookRequest
     * @return createAddressBookResult The response from the CreateAddressBook
     *         service method, as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateAddressBookResult createAddressBook(
            CreateAddressBookRequest createAddressBookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAddressBookRequest> request = null;
        Response<CreateAddressBookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAddressBookRequestMarshaller()
                        .marshall(createAddressBookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAddressBookResult, JsonUnmarshallerContext> unmarshaller = new CreateAddressBookResultJsonUnmarshaller();
            JsonResponseHandler<CreateAddressBookResult> responseHandler = new JsonResponseHandler<CreateAddressBookResult>(
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
     * Creates a recurring schedule for usage reports to deliver to the
     * specified S3 location with a specified daily or weekly interval.
     * </p>
     * 
     * @param createBusinessReportScheduleRequest
     * @return createBusinessReportScheduleResult The response from the
     *         CreateBusinessReportSchedule service method, as returned by Alexa
     *         For Business.
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateBusinessReportScheduleResult createBusinessReportSchedule(
            CreateBusinessReportScheduleRequest createBusinessReportScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBusinessReportScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBusinessReportScheduleRequest> request = null;
        Response<CreateBusinessReportScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBusinessReportScheduleRequestMarshaller()
                        .marshall(createBusinessReportScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBusinessReportScheduleResult, JsonUnmarshallerContext> unmarshaller = new CreateBusinessReportScheduleResultJsonUnmarshaller();
            JsonResponseHandler<CreateBusinessReportScheduleResult> responseHandler = new JsonResponseHandler<CreateBusinessReportScheduleResult>(
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
     * Adds a new conference provider under the user's AWS account.
     * </p>
     * 
     * @param createConferenceProviderRequest
     * @return createConferenceProviderResult The response from the
     *         CreateConferenceProvider service method, as returned by Alexa For
     *         Business.
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateConferenceProviderResult createConferenceProvider(
            CreateConferenceProviderRequest createConferenceProviderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConferenceProviderRequest> request = null;
        Response<CreateConferenceProviderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConferenceProviderRequestMarshaller()
                        .marshall(createConferenceProviderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateConferenceProviderResult, JsonUnmarshallerContext> unmarshaller = new CreateConferenceProviderResultJsonUnmarshaller();
            JsonResponseHandler<CreateConferenceProviderResult> responseHandler = new JsonResponseHandler<CreateConferenceProviderResult>(
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
     * Creates a contact with the specified details.
     * </p>
     * 
     * @param createContactRequest
     * @return createContactResult The response from the CreateContact service
     *         method, as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateContactResult createContact(CreateContactRequest createContactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContactRequest> request = null;
        Response<CreateContactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContactRequestMarshaller().marshall(createContactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateContactResult, JsonUnmarshallerContext> unmarshaller = new CreateContactResultJsonUnmarshaller();
            JsonResponseHandler<CreateContactResult> responseHandler = new JsonResponseHandler<CreateContactResult>(
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
     * Creates a gateway group with the specified details.
     * </p>
     * 
     * @param createGatewayGroupRequest
     * @return createGatewayGroupResult The response from the CreateGatewayGroup
     *         service method, as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateGatewayGroupResult createGatewayGroup(
            CreateGatewayGroupRequest createGatewayGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGatewayGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGatewayGroupRequest> request = null;
        Response<CreateGatewayGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGatewayGroupRequestMarshaller()
                        .marshall(createGatewayGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGatewayGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateGatewayGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateGatewayGroupResult> responseHandler = new JsonResponseHandler<CreateGatewayGroupResult>(
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
     * Creates a network profile with the specified details.
     * </p>
     * 
     * @param createNetworkProfileRequest
     * @return createNetworkProfileResult The response from the
     *         CreateNetworkProfile service method, as returned by Alexa For
     *         Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws InvalidCertificateAuthorityException
     * @throws InvalidServiceLinkedRoleStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateNetworkProfileResult createNetworkProfile(
            CreateNetworkProfileRequest createNetworkProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createNetworkProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkProfileRequest> request = null;
        Response<CreateNetworkProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkProfileRequestMarshaller()
                        .marshall(createNetworkProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateNetworkProfileResult, JsonUnmarshallerContext> unmarshaller = new CreateNetworkProfileResultJsonUnmarshaller();
            JsonResponseHandler<CreateNetworkProfileResult> responseHandler = new JsonResponseHandler<CreateNetworkProfileResult>(
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
     * Creates a new room profile with the specified details.
     * </p>
     * 
     * @param createProfileRequest
     * @return createProfileResult The response from the CreateProfile service
     *         method, as returned by Alexa For Business.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateProfileResult createProfile(CreateProfileRequest createProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProfileRequest> request = null;
        Response<CreateProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProfileRequestMarshaller().marshall(createProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProfileResult, JsonUnmarshallerContext> unmarshaller = new CreateProfileResultJsonUnmarshaller();
            JsonResponseHandler<CreateProfileResult> responseHandler = new JsonResponseHandler<CreateProfileResult>(
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
     * Creates a room with the specified details.
     * </p>
     * 
     * @param createRoomRequest
     * @return createRoomResult The response from the CreateRoom service method,
     *         as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRoomResult createRoom(CreateRoomRequest createRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoomRequest> request = null;
        Response<CreateRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoomRequestMarshaller().marshall(createRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRoomResult, JsonUnmarshallerContext> unmarshaller = new CreateRoomResultJsonUnmarshaller();
            JsonResponseHandler<CreateRoomResult> responseHandler = new JsonResponseHandler<CreateRoomResult>(
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
     * Creates a skill group with a specified name and description.
     * </p>
     * 
     * @param createSkillGroupRequest
     * @return createSkillGroupResult The response from the CreateSkillGroup
     *         service method, as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSkillGroupResult createSkillGroup(CreateSkillGroupRequest createSkillGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSkillGroupRequest> request = null;
        Response<CreateSkillGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSkillGroupRequestMarshaller().marshall(createSkillGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSkillGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateSkillGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateSkillGroupResult> responseHandler = new JsonResponseHandler<CreateSkillGroupResult>(
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
     * Creates a user.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by Alexa For Business.
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateUserResult createUser(CreateUserRequest createUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestMarshaller().marshall(createUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserResult, JsonUnmarshallerContext> unmarshaller = new CreateUserResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserResult> responseHandler = new JsonResponseHandler<CreateUserResult>(
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
     * Deletes an address book by the address book ARN.
     * </p>
     * 
     * @param deleteAddressBookRequest
     * @return deleteAddressBookResult The response from the DeleteAddressBook
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteAddressBookResult deleteAddressBook(
            DeleteAddressBookRequest deleteAddressBookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAddressBookRequest> request = null;
        Response<DeleteAddressBookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAddressBookRequestMarshaller()
                        .marshall(deleteAddressBookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAddressBookResult, JsonUnmarshallerContext> unmarshaller = new DeleteAddressBookResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAddressBookResult> responseHandler = new JsonResponseHandler<DeleteAddressBookResult>(
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
     * Deletes the recurring report delivery schedule with the specified
     * schedule ARN.
     * </p>
     * 
     * @param deleteBusinessReportScheduleRequest
     * @return deleteBusinessReportScheduleResult The response from the
     *         DeleteBusinessReportSchedule service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteBusinessReportScheduleResult deleteBusinessReportSchedule(
            DeleteBusinessReportScheduleRequest deleteBusinessReportScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBusinessReportScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBusinessReportScheduleRequest> request = null;
        Response<DeleteBusinessReportScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBusinessReportScheduleRequestMarshaller()
                        .marshall(deleteBusinessReportScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBusinessReportScheduleResult, JsonUnmarshallerContext> unmarshaller = new DeleteBusinessReportScheduleResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBusinessReportScheduleResult> responseHandler = new JsonResponseHandler<DeleteBusinessReportScheduleResult>(
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
     * Deletes a conference provider.
     * </p>
     * 
     * @param deleteConferenceProviderRequest
     * @return deleteConferenceProviderResult The response from the
     *         DeleteConferenceProvider service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteConferenceProviderResult deleteConferenceProvider(
            DeleteConferenceProviderRequest deleteConferenceProviderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConferenceProviderRequest> request = null;
        Response<DeleteConferenceProviderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConferenceProviderRequestMarshaller()
                        .marshall(deleteConferenceProviderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteConferenceProviderResult, JsonUnmarshallerContext> unmarshaller = new DeleteConferenceProviderResultJsonUnmarshaller();
            JsonResponseHandler<DeleteConferenceProviderResult> responseHandler = new JsonResponseHandler<DeleteConferenceProviderResult>(
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
     * Deletes a contact by the contact ARN.
     * </p>
     * 
     * @param deleteContactRequest
     * @return deleteContactResult The response from the DeleteContact service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteContactResult deleteContact(DeleteContactRequest deleteContactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactRequest> request = null;
        Response<DeleteContactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactRequestMarshaller().marshall(deleteContactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteContactResult, JsonUnmarshallerContext> unmarshaller = new DeleteContactResultJsonUnmarshaller();
            JsonResponseHandler<DeleteContactResult> responseHandler = new JsonResponseHandler<DeleteContactResult>(
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
     * Removes a device from Alexa For Business.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return deleteDeviceResult The response from the DeleteDevice service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws InvalidCertificateAuthorityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDeviceResult deleteDevice(DeleteDeviceRequest deleteDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeviceRequest> request = null;
        Response<DeleteDeviceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeviceRequestMarshaller().marshall(deleteDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDeviceResult, JsonUnmarshallerContext> unmarshaller = new DeleteDeviceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDeviceResult> responseHandler = new JsonResponseHandler<DeleteDeviceResult>(
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
     * When this action is called for a specified shared device, it allows
     * authorized users to delete the device's entire previous history of voice
     * input data and associated response data. This action can be called once
     * every 24 hours for a specific shared device.
     * </p>
     * 
     * @param deleteDeviceUsageDataRequest
     * @return deleteDeviceUsageDataResult The response from the
     *         DeleteDeviceUsageData service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws DeviceNotRegisteredException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDeviceUsageDataResult deleteDeviceUsageData(
            DeleteDeviceUsageDataRequest deleteDeviceUsageDataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDeviceUsageDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeviceUsageDataRequest> request = null;
        Response<DeleteDeviceUsageDataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeviceUsageDataRequestMarshaller()
                        .marshall(deleteDeviceUsageDataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDeviceUsageDataResult, JsonUnmarshallerContext> unmarshaller = new DeleteDeviceUsageDataResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDeviceUsageDataResult> responseHandler = new JsonResponseHandler<DeleteDeviceUsageDataResult>(
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
     * Deletes a gateway group.
     * </p>
     * 
     * @param deleteGatewayGroupRequest
     * @return deleteGatewayGroupResult The response from the DeleteGatewayGroup
     *         service method, as returned by Alexa For Business.
     * @throws ResourceAssociatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteGatewayGroupResult deleteGatewayGroup(
            DeleteGatewayGroupRequest deleteGatewayGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGatewayGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayGroupRequest> request = null;
        Response<DeleteGatewayGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayGroupRequestMarshaller()
                        .marshall(deleteGatewayGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGatewayGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteGatewayGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGatewayGroupResult> responseHandler = new JsonResponseHandler<DeleteGatewayGroupResult>(
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
     * Deletes a network profile by the network profile ARN.
     * </p>
     * 
     * @param deleteNetworkProfileRequest
     * @return deleteNetworkProfileResult The response from the
     *         DeleteNetworkProfile service method, as returned by Alexa For
     *         Business.
     * @throws ResourceInUseException
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteNetworkProfileResult deleteNetworkProfile(
            DeleteNetworkProfileRequest deleteNetworkProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteNetworkProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNetworkProfileRequest> request = null;
        Response<DeleteNetworkProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNetworkProfileRequestMarshaller()
                        .marshall(deleteNetworkProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteNetworkProfileResult, JsonUnmarshallerContext> unmarshaller = new DeleteNetworkProfileResultJsonUnmarshaller();
            JsonResponseHandler<DeleteNetworkProfileResult> responseHandler = new JsonResponseHandler<DeleteNetworkProfileResult>(
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
     * Deletes a room profile by the profile ARN.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return deleteProfileResult The response from the DeleteProfile service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteProfileResult deleteProfile(DeleteProfileRequest deleteProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileRequest> request = null;
        Response<DeleteProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileRequestMarshaller().marshall(deleteProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProfileResult, JsonUnmarshallerContext> unmarshaller = new DeleteProfileResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProfileResult> responseHandler = new JsonResponseHandler<DeleteProfileResult>(
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
     * Deletes a room by the room ARN.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return deleteRoomResult The response from the DeleteRoom service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRoomResult deleteRoom(DeleteRoomRequest deleteRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoomRequest> request = null;
        Response<DeleteRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoomRequestMarshaller().marshall(deleteRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRoomResult, JsonUnmarshallerContext> unmarshaller = new DeleteRoomResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRoomResult> responseHandler = new JsonResponseHandler<DeleteRoomResult>(
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
     * Deletes room skill parameter details by room, skill, and parameter key
     * ID.
     * </p>
     * 
     * @param deleteRoomSkillParameterRequest
     * @return deleteRoomSkillParameterResult The response from the
     *         DeleteRoomSkillParameter service method, as returned by Alexa For
     *         Business.
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteRoomSkillParameterResult deleteRoomSkillParameter(
            DeleteRoomSkillParameterRequest deleteRoomSkillParameterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRoomSkillParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoomSkillParameterRequest> request = null;
        Response<DeleteRoomSkillParameterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoomSkillParameterRequestMarshaller()
                        .marshall(deleteRoomSkillParameterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRoomSkillParameterResult, JsonUnmarshallerContext> unmarshaller = new DeleteRoomSkillParameterResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRoomSkillParameterResult> responseHandler = new JsonResponseHandler<DeleteRoomSkillParameterResult>(
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
     * Unlinks a third-party account from a skill.
     * </p>
     * 
     * @param deleteSkillAuthorizationRequest
     * @return deleteSkillAuthorizationResult The response from the
     *         DeleteSkillAuthorization service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteSkillAuthorizationResult deleteSkillAuthorization(
            DeleteSkillAuthorizationRequest deleteSkillAuthorizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSkillAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSkillAuthorizationRequest> request = null;
        Response<DeleteSkillAuthorizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSkillAuthorizationRequestMarshaller()
                        .marshall(deleteSkillAuthorizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSkillAuthorizationResult, JsonUnmarshallerContext> unmarshaller = new DeleteSkillAuthorizationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSkillAuthorizationResult> responseHandler = new JsonResponseHandler<DeleteSkillAuthorizationResult>(
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
     * Deletes a skill group by skill group ARN.
     * </p>
     * 
     * @param deleteSkillGroupRequest
     * @return deleteSkillGroupResult The response from the DeleteSkillGroup
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteSkillGroupResult deleteSkillGroup(DeleteSkillGroupRequest deleteSkillGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSkillGroupRequest> request = null;
        Response<DeleteSkillGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSkillGroupRequestMarshaller().marshall(deleteSkillGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSkillGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteSkillGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSkillGroupResult> responseHandler = new JsonResponseHandler<DeleteSkillGroupResult>(
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
     * Deletes a specified user by user ARN and enrollment ARN.
     * </p>
     * 
     * @param deleteUserRequest
     * @return deleteUserResult The response from the DeleteUser service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller().marshall(deleteUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteUserResult, JsonUnmarshallerContext> unmarshaller = new DeleteUserResultJsonUnmarshaller();
            JsonResponseHandler<DeleteUserResult> responseHandler = new JsonResponseHandler<DeleteUserResult>(
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
     * Disassociates a contact from a given address book.
     * </p>
     * 
     * @param disassociateContactFromAddressBookRequest
     * @return disassociateContactFromAddressBookResult The response from the
     *         DisassociateContactFromAddressBook service method, as returned by
     *         Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateContactFromAddressBookResult disassociateContactFromAddressBook(
            DisassociateContactFromAddressBookRequest disassociateContactFromAddressBookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateContactFromAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateContactFromAddressBookRequest> request = null;
        Response<DisassociateContactFromAddressBookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateContactFromAddressBookRequestMarshaller()
                        .marshall(disassociateContactFromAddressBookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateContactFromAddressBookResult, JsonUnmarshallerContext> unmarshaller = new DisassociateContactFromAddressBookResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateContactFromAddressBookResult> responseHandler = new JsonResponseHandler<DisassociateContactFromAddressBookResult>(
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
     * Disassociates a device from its current room. The device continues to be
     * connected to the Wi-Fi network and is still registered to the account.
     * The device settings and skills are removed from the room.
     * </p>
     * 
     * @param disassociateDeviceFromRoomRequest
     * @return disassociateDeviceFromRoomResult The response from the
     *         DisassociateDeviceFromRoom service method, as returned by Alexa
     *         For Business.
     * @throws ConcurrentModificationException
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateDeviceFromRoomResult disassociateDeviceFromRoom(
            DisassociateDeviceFromRoomRequest disassociateDeviceFromRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateDeviceFromRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDeviceFromRoomRequest> request = null;
        Response<DisassociateDeviceFromRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDeviceFromRoomRequestMarshaller()
                        .marshall(disassociateDeviceFromRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateDeviceFromRoomResult, JsonUnmarshallerContext> unmarshaller = new DisassociateDeviceFromRoomResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateDeviceFromRoomResult> responseHandler = new JsonResponseHandler<DisassociateDeviceFromRoomResult>(
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
     * Disassociates a skill from a skill group.
     * </p>
     * 
     * @param disassociateSkillFromSkillGroupRequest
     * @return disassociateSkillFromSkillGroupResult The response from the
     *         DisassociateSkillFromSkillGroup service method, as returned by
     *         Alexa For Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateSkillFromSkillGroupResult disassociateSkillFromSkillGroup(
            DisassociateSkillFromSkillGroupRequest disassociateSkillFromSkillGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateSkillFromSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSkillFromSkillGroupRequest> request = null;
        Response<DisassociateSkillFromSkillGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSkillFromSkillGroupRequestMarshaller()
                        .marshall(disassociateSkillFromSkillGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateSkillFromSkillGroupResult, JsonUnmarshallerContext> unmarshaller = new DisassociateSkillFromSkillGroupResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateSkillFromSkillGroupResult> responseHandler = new JsonResponseHandler<DisassociateSkillFromSkillGroupResult>(
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
     * Makes a private skill unavailable for enrolled users and prevents them
     * from enabling it on their devices.
     * </p>
     * 
     * @param disassociateSkillFromUsersRequest
     * @return disassociateSkillFromUsersResult The response from the
     *         DisassociateSkillFromUsers service method, as returned by Alexa
     *         For Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateSkillFromUsersResult disassociateSkillFromUsers(
            DisassociateSkillFromUsersRequest disassociateSkillFromUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateSkillFromUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSkillFromUsersRequest> request = null;
        Response<DisassociateSkillFromUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSkillFromUsersRequestMarshaller()
                        .marshall(disassociateSkillFromUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateSkillFromUsersResult, JsonUnmarshallerContext> unmarshaller = new DisassociateSkillFromUsersResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateSkillFromUsersResult> responseHandler = new JsonResponseHandler<DisassociateSkillFromUsersResult>(
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
     * Disassociates a skill group from a specified room. This disables all
     * skills in the skill group on all devices in the room.
     * </p>
     * 
     * @param disassociateSkillGroupFromRoomRequest
     * @return disassociateSkillGroupFromRoomResult The response from the
     *         DisassociateSkillGroupFromRoom service method, as returned by
     *         Alexa For Business.
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateSkillGroupFromRoomResult disassociateSkillGroupFromRoom(
            DisassociateSkillGroupFromRoomRequest disassociateSkillGroupFromRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateSkillGroupFromRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSkillGroupFromRoomRequest> request = null;
        Response<DisassociateSkillGroupFromRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSkillGroupFromRoomRequestMarshaller()
                        .marshall(disassociateSkillGroupFromRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateSkillGroupFromRoomResult, JsonUnmarshallerContext> unmarshaller = new DisassociateSkillGroupFromRoomResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateSkillGroupFromRoomResult> responseHandler = new JsonResponseHandler<DisassociateSkillGroupFromRoomResult>(
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
     * Forgets smart home appliances associated to a room.
     * </p>
     * 
     * @param forgetSmartHomeAppliancesRequest
     * @return forgetSmartHomeAppliancesResult The response from the
     *         ForgetSmartHomeAppliances service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ForgetSmartHomeAppliancesResult forgetSmartHomeAppliances(
            ForgetSmartHomeAppliancesRequest forgetSmartHomeAppliancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(forgetSmartHomeAppliancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgetSmartHomeAppliancesRequest> request = null;
        Response<ForgetSmartHomeAppliancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgetSmartHomeAppliancesRequestMarshaller()
                        .marshall(forgetSmartHomeAppliancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ForgetSmartHomeAppliancesResult, JsonUnmarshallerContext> unmarshaller = new ForgetSmartHomeAppliancesResultJsonUnmarshaller();
            JsonResponseHandler<ForgetSmartHomeAppliancesResult> responseHandler = new JsonResponseHandler<ForgetSmartHomeAppliancesResult>(
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
     * Gets address the book details by the address book ARN.
     * </p>
     * 
     * @param getAddressBookRequest
     * @return getAddressBookResult The response from the GetAddressBook service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAddressBookResult getAddressBook(GetAddressBookRequest getAddressBookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAddressBookRequest> request = null;
        Response<GetAddressBookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAddressBookRequestMarshaller().marshall(getAddressBookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAddressBookResult, JsonUnmarshallerContext> unmarshaller = new GetAddressBookResultJsonUnmarshaller();
            JsonResponseHandler<GetAddressBookResult> responseHandler = new JsonResponseHandler<GetAddressBookResult>(
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
     * Retrieves the existing conference preferences.
     * </p>
     * 
     * @param getConferencePreferenceRequest
     * @return getConferencePreferenceResult The response from the
     *         GetConferencePreference service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetConferencePreferenceResult getConferencePreference(
            GetConferencePreferenceRequest getConferencePreferenceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getConferencePreferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConferencePreferenceRequest> request = null;
        Response<GetConferencePreferenceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConferencePreferenceRequestMarshaller()
                        .marshall(getConferencePreferenceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetConferencePreferenceResult, JsonUnmarshallerContext> unmarshaller = new GetConferencePreferenceResultJsonUnmarshaller();
            JsonResponseHandler<GetConferencePreferenceResult> responseHandler = new JsonResponseHandler<GetConferencePreferenceResult>(
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
     * Gets details about a specific conference provider.
     * </p>
     * 
     * @param getConferenceProviderRequest
     * @return getConferenceProviderResult The response from the
     *         GetConferenceProvider service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetConferenceProviderResult getConferenceProvider(
            GetConferenceProviderRequest getConferenceProviderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConferenceProviderRequest> request = null;
        Response<GetConferenceProviderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConferenceProviderRequestMarshaller()
                        .marshall(getConferenceProviderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetConferenceProviderResult, JsonUnmarshallerContext> unmarshaller = new GetConferenceProviderResultJsonUnmarshaller();
            JsonResponseHandler<GetConferenceProviderResult> responseHandler = new JsonResponseHandler<GetConferenceProviderResult>(
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
     * Gets the contact details by the contact ARN.
     * </p>
     * 
     * @param getContactRequest
     * @return getContactResult The response from the GetContact service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetContactResult getContact(GetContactRequest getContactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactRequest> request = null;
        Response<GetContactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactRequestMarshaller().marshall(getContactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetContactResult, JsonUnmarshallerContext> unmarshaller = new GetContactResultJsonUnmarshaller();
            JsonResponseHandler<GetContactResult> responseHandler = new JsonResponseHandler<GetContactResult>(
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
     * Gets the details of a device by device ARN.
     * </p>
     * 
     * @param getDeviceRequest
     * @return getDeviceResult The response from the GetDevice service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceRequest> request = null;
        Response<GetDeviceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceRequestMarshaller().marshall(getDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeviceResult, JsonUnmarshallerContext> unmarshaller = new GetDeviceResultJsonUnmarshaller();
            JsonResponseHandler<GetDeviceResult> responseHandler = new JsonResponseHandler<GetDeviceResult>(
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
     * Retrieves the details of a gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @return getGatewayResult The response from the GetGateway service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetGatewayResult getGateway(GetGatewayRequest getGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGatewayRequest> request = null;
        Response<GetGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGatewayRequestMarshaller().marshall(getGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetGatewayResult, JsonUnmarshallerContext> unmarshaller = new GetGatewayResultJsonUnmarshaller();
            JsonResponseHandler<GetGatewayResult> responseHandler = new JsonResponseHandler<GetGatewayResult>(
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
     * Retrieves the details of a gateway group.
     * </p>
     * 
     * @param getGatewayGroupRequest
     * @return getGatewayGroupResult The response from the GetGatewayGroup
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest getGatewayGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getGatewayGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGatewayGroupRequest> request = null;
        Response<GetGatewayGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGatewayGroupRequestMarshaller().marshall(getGatewayGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetGatewayGroupResult, JsonUnmarshallerContext> unmarshaller = new GetGatewayGroupResultJsonUnmarshaller();
            JsonResponseHandler<GetGatewayGroupResult> responseHandler = new JsonResponseHandler<GetGatewayGroupResult>(
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
     * Retrieves the configured values for the user enrollment invitation email
     * template.
     * </p>
     * 
     * @param getInvitationConfigurationRequest
     * @return getInvitationConfigurationResult The response from the
     *         GetInvitationConfiguration service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInvitationConfigurationResult getInvitationConfiguration(
            GetInvitationConfigurationRequest getInvitationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInvitationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInvitationConfigurationRequest> request = null;
        Response<GetInvitationConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInvitationConfigurationRequestMarshaller()
                        .marshall(getInvitationConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInvitationConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetInvitationConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetInvitationConfigurationResult> responseHandler = new JsonResponseHandler<GetInvitationConfigurationResult>(
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
     * Gets the network profile details by the network profile ARN.
     * </p>
     * 
     * @param getNetworkProfileRequest
     * @return getNetworkProfileResult The response from the GetNetworkProfile
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws InvalidSecretsManagerResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetNetworkProfileResult getNetworkProfile(
            GetNetworkProfileRequest getNetworkProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getNetworkProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkProfileRequest> request = null;
        Response<GetNetworkProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkProfileRequestMarshaller()
                        .marshall(getNetworkProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetNetworkProfileResult, JsonUnmarshallerContext> unmarshaller = new GetNetworkProfileResultJsonUnmarshaller();
            JsonResponseHandler<GetNetworkProfileResult> responseHandler = new JsonResponseHandler<GetNetworkProfileResult>(
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
     * Gets the details of a room profile by profile ARN.
     * </p>
     * 
     * @param getProfileRequest
     * @return getProfileResult The response from the GetProfile service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetProfileResult getProfile(GetProfileRequest getProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileRequest> request = null;
        Response<GetProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileRequestMarshaller().marshall(getProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetProfileResult, JsonUnmarshallerContext> unmarshaller = new GetProfileResultJsonUnmarshaller();
            JsonResponseHandler<GetProfileResult> responseHandler = new JsonResponseHandler<GetProfileResult>(
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
     * Gets room details by room ARN.
     * </p>
     * 
     * @param getRoomRequest
     * @return getRoomResult The response from the GetRoom service method, as
     *         returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRoomResult getRoom(GetRoomRequest getRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoomRequest> request = null;
        Response<GetRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoomRequestMarshaller().marshall(getRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRoomResult, JsonUnmarshallerContext> unmarshaller = new GetRoomResultJsonUnmarshaller();
            JsonResponseHandler<GetRoomResult> responseHandler = new JsonResponseHandler<GetRoomResult>(
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
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     * </p>
     * 
     * @param getRoomSkillParameterRequest
     * @return getRoomSkillParameterResult The response from the
     *         GetRoomSkillParameter service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRoomSkillParameterResult getRoomSkillParameter(
            GetRoomSkillParameterRequest getRoomSkillParameterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRoomSkillParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoomSkillParameterRequest> request = null;
        Response<GetRoomSkillParameterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoomSkillParameterRequestMarshaller()
                        .marshall(getRoomSkillParameterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRoomSkillParameterResult, JsonUnmarshallerContext> unmarshaller = new GetRoomSkillParameterResultJsonUnmarshaller();
            JsonResponseHandler<GetRoomSkillParameterResult> responseHandler = new JsonResponseHandler<GetRoomSkillParameterResult>(
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
     * Gets skill group details by skill group ARN.
     * </p>
     * 
     * @param getSkillGroupRequest
     * @return getSkillGroupResult The response from the GetSkillGroup service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSkillGroupResult getSkillGroup(GetSkillGroupRequest getSkillGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSkillGroupRequest> request = null;
        Response<GetSkillGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSkillGroupRequestMarshaller().marshall(getSkillGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSkillGroupResult, JsonUnmarshallerContext> unmarshaller = new GetSkillGroupResultJsonUnmarshaller();
            JsonResponseHandler<GetSkillGroupResult> responseHandler = new JsonResponseHandler<GetSkillGroupResult>(
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
     * Lists the details of the schedules that a user configured. A download URL
     * of the report associated with each schedule is returned every time this
     * action is called. A new download URL is returned each time, and is valid
     * for 24 hours.
     * </p>
     * 
     * @param listBusinessReportSchedulesRequest
     * @return listBusinessReportSchedulesResult The response from the
     *         ListBusinessReportSchedules service method, as returned by Alexa
     *         For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBusinessReportSchedulesResult listBusinessReportSchedules(
            ListBusinessReportSchedulesRequest listBusinessReportSchedulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBusinessReportSchedulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBusinessReportSchedulesRequest> request = null;
        Response<ListBusinessReportSchedulesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBusinessReportSchedulesRequestMarshaller()
                        .marshall(listBusinessReportSchedulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBusinessReportSchedulesResult, JsonUnmarshallerContext> unmarshaller = new ListBusinessReportSchedulesResultJsonUnmarshaller();
            JsonResponseHandler<ListBusinessReportSchedulesResult> responseHandler = new JsonResponseHandler<ListBusinessReportSchedulesResult>(
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
     * Lists conference providers under a specific AWS account.
     * </p>
     * 
     * @param listConferenceProvidersRequest
     * @return listConferenceProvidersResult The response from the
     *         ListConferenceProviders service method, as returned by Alexa For
     *         Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListConferenceProvidersResult listConferenceProviders(
            ListConferenceProvidersRequest listConferenceProvidersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listConferenceProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConferenceProvidersRequest> request = null;
        Response<ListConferenceProvidersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConferenceProvidersRequestMarshaller()
                        .marshall(listConferenceProvidersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListConferenceProvidersResult, JsonUnmarshallerContext> unmarshaller = new ListConferenceProvidersResultJsonUnmarshaller();
            JsonResponseHandler<ListConferenceProvidersResult> responseHandler = new JsonResponseHandler<ListConferenceProvidersResult>(
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
     * Lists the device event history, including device connection status, for
     * up to 30 days.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @return listDeviceEventsResult The response from the ListDeviceEvents
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDeviceEventsResult listDeviceEvents(ListDeviceEventsRequest listDeviceEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDeviceEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeviceEventsRequest> request = null;
        Response<ListDeviceEventsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeviceEventsRequestMarshaller().marshall(listDeviceEventsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeviceEventsResult, JsonUnmarshallerContext> unmarshaller = new ListDeviceEventsResultJsonUnmarshaller();
            JsonResponseHandler<ListDeviceEventsResult> responseHandler = new JsonResponseHandler<ListDeviceEventsResult>(
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
     * Retrieves a list of gateway group summaries. Use GetGatewayGroup to
     * retrieve details of a specific gateway group.
     * </p>
     * 
     * @param listGatewayGroupsRequest
     * @return listGatewayGroupsResult The response from the ListGatewayGroups
     *         service method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListGatewayGroupsResult listGatewayGroups(
            ListGatewayGroupsRequest listGatewayGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGatewayGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewayGroupsRequest> request = null;
        Response<ListGatewayGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewayGroupsRequestMarshaller()
                        .marshall(listGatewayGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGatewayGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListGatewayGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListGatewayGroupsResult> responseHandler = new JsonResponseHandler<ListGatewayGroupsResult>(
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
     * Retrieves a list of gateway summaries. Use GetGateway to retrieve details
     * of a specific gateway. An optional gateway group ARN can be provided to
     * only retrieve gateway summaries of gateways that are associated with that
     * gateway group ARN.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return listGatewaysResult The response from the ListGateways service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
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
     * Lists all enabled skills in a specific skill group.
     * </p>
     * 
     * @param listSkillsRequest
     * @return listSkillsResult The response from the ListSkills service method,
     *         as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSkillsResult listSkills(ListSkillsRequest listSkillsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSkillsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSkillsRequest> request = null;
        Response<ListSkillsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSkillsRequestMarshaller().marshall(listSkillsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSkillsResult, JsonUnmarshallerContext> unmarshaller = new ListSkillsResultJsonUnmarshaller();
            JsonResponseHandler<ListSkillsResult> responseHandler = new JsonResponseHandler<ListSkillsResult>(
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
     * Lists all categories in the Alexa skill store.
     * </p>
     * 
     * @param listSkillsStoreCategoriesRequest
     * @return listSkillsStoreCategoriesResult The response from the
     *         ListSkillsStoreCategories service method, as returned by Alexa
     *         For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSkillsStoreCategoriesResult listSkillsStoreCategories(
            ListSkillsStoreCategoriesRequest listSkillsStoreCategoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSkillsStoreCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSkillsStoreCategoriesRequest> request = null;
        Response<ListSkillsStoreCategoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSkillsStoreCategoriesRequestMarshaller()
                        .marshall(listSkillsStoreCategoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSkillsStoreCategoriesResult, JsonUnmarshallerContext> unmarshaller = new ListSkillsStoreCategoriesResultJsonUnmarshaller();
            JsonResponseHandler<ListSkillsStoreCategoriesResult> responseHandler = new JsonResponseHandler<ListSkillsStoreCategoriesResult>(
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
     * Lists all skills in the Alexa skill store by category.
     * </p>
     * 
     * @param listSkillsStoreSkillsByCategoryRequest
     * @return listSkillsStoreSkillsByCategoryResult The response from the
     *         ListSkillsStoreSkillsByCategory service method, as returned by
     *         Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSkillsStoreSkillsByCategoryResult listSkillsStoreSkillsByCategory(
            ListSkillsStoreSkillsByCategoryRequest listSkillsStoreSkillsByCategoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSkillsStoreSkillsByCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSkillsStoreSkillsByCategoryRequest> request = null;
        Response<ListSkillsStoreSkillsByCategoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSkillsStoreSkillsByCategoryRequestMarshaller()
                        .marshall(listSkillsStoreSkillsByCategoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSkillsStoreSkillsByCategoryResult, JsonUnmarshallerContext> unmarshaller = new ListSkillsStoreSkillsByCategoryResultJsonUnmarshaller();
            JsonResponseHandler<ListSkillsStoreSkillsByCategoryResult> responseHandler = new JsonResponseHandler<ListSkillsStoreSkillsByCategoryResult>(
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
     * Lists all of the smart home appliances associated with a room.
     * </p>
     * 
     * @param listSmartHomeAppliancesRequest
     * @return listSmartHomeAppliancesResult The response from the
     *         ListSmartHomeAppliances service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSmartHomeAppliancesResult listSmartHomeAppliances(
            ListSmartHomeAppliancesRequest listSmartHomeAppliancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSmartHomeAppliancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSmartHomeAppliancesRequest> request = null;
        Response<ListSmartHomeAppliancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSmartHomeAppliancesRequestMarshaller()
                        .marshall(listSmartHomeAppliancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSmartHomeAppliancesResult, JsonUnmarshallerContext> unmarshaller = new ListSmartHomeAppliancesResultJsonUnmarshaller();
            JsonResponseHandler<ListSmartHomeAppliancesResult> responseHandler = new JsonResponseHandler<ListSmartHomeAppliancesResult>(
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
     * Lists all tags for the specified resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return listTagsResult The response from the ListTags service method, as
     *         returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Sets the conference preferences on a specific conference provider at the
     * account level.
     * </p>
     * 
     * @param putConferencePreferenceRequest
     * @return putConferencePreferenceResult The response from the
     *         PutConferencePreference service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutConferencePreferenceResult putConferencePreference(
            PutConferencePreferenceRequest putConferencePreferenceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putConferencePreferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConferencePreferenceRequest> request = null;
        Response<PutConferencePreferenceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConferencePreferenceRequestMarshaller()
                        .marshall(putConferencePreferenceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutConferencePreferenceResult, JsonUnmarshallerContext> unmarshaller = new PutConferencePreferenceResultJsonUnmarshaller();
            JsonResponseHandler<PutConferencePreferenceResult> responseHandler = new JsonResponseHandler<PutConferencePreferenceResult>(
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
     * Configures the email template for the user enrollment invitation with the
     * specified attributes.
     * </p>
     * 
     * @param putInvitationConfigurationRequest
     * @return putInvitationConfigurationResult The response from the
     *         PutInvitationConfiguration service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutInvitationConfigurationResult putInvitationConfiguration(
            PutInvitationConfigurationRequest putInvitationConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putInvitationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutInvitationConfigurationRequest> request = null;
        Response<PutInvitationConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutInvitationConfigurationRequestMarshaller()
                        .marshall(putInvitationConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutInvitationConfigurationResult, JsonUnmarshallerContext> unmarshaller = new PutInvitationConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<PutInvitationConfigurationResult> responseHandler = new JsonResponseHandler<PutInvitationConfigurationResult>(
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
     * Updates room skill parameter details by room, skill, and parameter key
     * ID. Not all skills have a room skill parameter.
     * </p>
     * 
     * @param putRoomSkillParameterRequest
     * @return putRoomSkillParameterResult The response from the
     *         PutRoomSkillParameter service method, as returned by Alexa For
     *         Business.
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutRoomSkillParameterResult putRoomSkillParameter(
            PutRoomSkillParameterRequest putRoomSkillParameterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putRoomSkillParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRoomSkillParameterRequest> request = null;
        Response<PutRoomSkillParameterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRoomSkillParameterRequestMarshaller()
                        .marshall(putRoomSkillParameterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutRoomSkillParameterResult, JsonUnmarshallerContext> unmarshaller = new PutRoomSkillParameterResultJsonUnmarshaller();
            JsonResponseHandler<PutRoomSkillParameterResult> responseHandler = new JsonResponseHandler<PutRoomSkillParameterResult>(
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
     * Links a user's account to a third-party skill provider. If this API
     * operation is called by an assumed IAM role, the skill being linked must
     * be a private skill. Also, the skill must be owned by the AWS account that
     * assumed the IAM role.
     * </p>
     * 
     * @param putSkillAuthorizationRequest
     * @return putSkillAuthorizationResult The response from the
     *         PutSkillAuthorization service method, as returned by Alexa For
     *         Business.
     * @throws UnauthorizedException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutSkillAuthorizationResult putSkillAuthorization(
            PutSkillAuthorizationRequest putSkillAuthorizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putSkillAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSkillAuthorizationRequest> request = null;
        Response<PutSkillAuthorizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSkillAuthorizationRequestMarshaller()
                        .marshall(putSkillAuthorizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutSkillAuthorizationResult, JsonUnmarshallerContext> unmarshaller = new PutSkillAuthorizationResultJsonUnmarshaller();
            JsonResponseHandler<PutSkillAuthorizationResult> responseHandler = new JsonResponseHandler<PutSkillAuthorizationResult>(
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
     * Registers an Alexa-enabled device built by an Original Equipment
     * Manufacturer (OEM) using Alexa Voice Service (AVS).
     * </p>
     * 
     * @param registerAVSDeviceRequest
     * @return registerAVSDeviceResult The response from the RegisterAVSDevice
     *         service method, as returned by Alexa For Business.
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws InvalidDeviceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RegisterAVSDeviceResult registerAVSDevice(
            RegisterAVSDeviceRequest registerAVSDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerAVSDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterAVSDeviceRequest> request = null;
        Response<RegisterAVSDeviceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterAVSDeviceRequestMarshaller()
                        .marshall(registerAVSDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterAVSDeviceResult, JsonUnmarshallerContext> unmarshaller = new RegisterAVSDeviceResultJsonUnmarshaller();
            JsonResponseHandler<RegisterAVSDeviceResult> responseHandler = new JsonResponseHandler<RegisterAVSDeviceResult>(
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
     * Disassociates a skill from the organization under a user's AWS account.
     * If the skill is a private skill, it moves to an AcceptStatus of PENDING.
     * Any private or public skill that is rejected can be added later by
     * calling the ApproveSkill API.
     * </p>
     * 
     * @param rejectSkillRequest
     * @return rejectSkillResult The response from the RejectSkill service
     *         method, as returned by Alexa For Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RejectSkillResult rejectSkill(RejectSkillRequest rejectSkillRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rejectSkillRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectSkillRequest> request = null;
        Response<RejectSkillResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectSkillRequestMarshaller().marshall(rejectSkillRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RejectSkillResult, JsonUnmarshallerContext> unmarshaller = new RejectSkillResultJsonUnmarshaller();
            JsonResponseHandler<RejectSkillResult> responseHandler = new JsonResponseHandler<RejectSkillResult>(
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
     * Determines the details for the room from which a skill request was
     * invoked. This operation is used by skill developers.
     * </p>
     * 
     * @param resolveRoomRequest
     * @return resolveRoomResult The response from the ResolveRoom service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ResolveRoomResult resolveRoom(ResolveRoomRequest resolveRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resolveRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveRoomRequest> request = null;
        Response<ResolveRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveRoomRequestMarshaller().marshall(resolveRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResolveRoomResult, JsonUnmarshallerContext> unmarshaller = new ResolveRoomResultJsonUnmarshaller();
            JsonResponseHandler<ResolveRoomResult> responseHandler = new JsonResponseHandler<ResolveRoomResult>(
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
     * Revokes an invitation and invalidates the enrollment URL.
     * </p>
     * 
     * @param revokeInvitationRequest
     * @return revokeInvitationResult The response from the RevokeInvitation
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RevokeInvitationResult revokeInvitation(RevokeInvitationRequest revokeInvitationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(revokeInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeInvitationRequest> request = null;
        Response<RevokeInvitationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeInvitationRequestMarshaller().marshall(revokeInvitationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RevokeInvitationResult, JsonUnmarshallerContext> unmarshaller = new RevokeInvitationResultJsonUnmarshaller();
            JsonResponseHandler<RevokeInvitationResult> responseHandler = new JsonResponseHandler<RevokeInvitationResult>(
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
     * Searches address books and lists the ones that meet a set of filter and
     * sort criteria.
     * </p>
     * 
     * @param searchAddressBooksRequest
     * @return searchAddressBooksResult The response from the SearchAddressBooks
     *         service method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchAddressBooksResult searchAddressBooks(
            SearchAddressBooksRequest searchAddressBooksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchAddressBooksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchAddressBooksRequest> request = null;
        Response<SearchAddressBooksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchAddressBooksRequestMarshaller()
                        .marshall(searchAddressBooksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchAddressBooksResult, JsonUnmarshallerContext> unmarshaller = new SearchAddressBooksResultJsonUnmarshaller();
            JsonResponseHandler<SearchAddressBooksResult> responseHandler = new JsonResponseHandler<SearchAddressBooksResult>(
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
     * Searches contacts and lists the ones that meet a set of filter and sort
     * criteria.
     * </p>
     * 
     * @param searchContactsRequest
     * @return searchContactsResult The response from the SearchContacts service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchContactsResult searchContacts(SearchContactsRequest searchContactsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchContactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchContactsRequest> request = null;
        Response<SearchContactsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchContactsRequestMarshaller().marshall(searchContactsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchContactsResult, JsonUnmarshallerContext> unmarshaller = new SearchContactsResultJsonUnmarshaller();
            JsonResponseHandler<SearchContactsResult> responseHandler = new JsonResponseHandler<SearchContactsResult>(
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
     * Searches devices and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchDevicesRequest
     * @return searchDevicesResult The response from the SearchDevices service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchDevicesResult searchDevices(SearchDevicesRequest searchDevicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchDevicesRequest> request = null;
        Response<SearchDevicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchDevicesRequestMarshaller().marshall(searchDevicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchDevicesResult, JsonUnmarshallerContext> unmarshaller = new SearchDevicesResultJsonUnmarshaller();
            JsonResponseHandler<SearchDevicesResult> responseHandler = new JsonResponseHandler<SearchDevicesResult>(
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
     * Searches network profiles and lists the ones that meet a set of filter
     * and sort criteria.
     * </p>
     * 
     * @param searchNetworkProfilesRequest
     * @return searchNetworkProfilesResult The response from the
     *         SearchNetworkProfiles service method, as returned by Alexa For
     *         Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchNetworkProfilesResult searchNetworkProfiles(
            SearchNetworkProfilesRequest searchNetworkProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchNetworkProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchNetworkProfilesRequest> request = null;
        Response<SearchNetworkProfilesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchNetworkProfilesRequestMarshaller()
                        .marshall(searchNetworkProfilesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchNetworkProfilesResult, JsonUnmarshallerContext> unmarshaller = new SearchNetworkProfilesResultJsonUnmarshaller();
            JsonResponseHandler<SearchNetworkProfilesResult> responseHandler = new JsonResponseHandler<SearchNetworkProfilesResult>(
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
     * Searches room profiles and lists the ones that meet a set of filter
     * criteria.
     * </p>
     * 
     * @param searchProfilesRequest
     * @return searchProfilesResult The response from the SearchProfiles service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchProfilesResult searchProfiles(SearchProfilesRequest searchProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProfilesRequest> request = null;
        Response<SearchProfilesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProfilesRequestMarshaller().marshall(searchProfilesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchProfilesResult, JsonUnmarshallerContext> unmarshaller = new SearchProfilesResultJsonUnmarshaller();
            JsonResponseHandler<SearchProfilesResult> responseHandler = new JsonResponseHandler<SearchProfilesResult>(
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
     * Searches rooms and lists the ones that meet a set of filter and sort
     * criteria.
     * </p>
     * 
     * @param searchRoomsRequest
     * @return searchRoomsResult The response from the SearchRooms service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchRoomsResult searchRooms(SearchRoomsRequest searchRoomsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchRoomsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRoomsRequest> request = null;
        Response<SearchRoomsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRoomsRequestMarshaller().marshall(searchRoomsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchRoomsResult, JsonUnmarshallerContext> unmarshaller = new SearchRoomsResultJsonUnmarshaller();
            JsonResponseHandler<SearchRoomsResult> responseHandler = new JsonResponseHandler<SearchRoomsResult>(
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
     * Searches skill groups and lists the ones that meet a set of filter and
     * sort criteria.
     * </p>
     * 
     * @param searchSkillGroupsRequest
     * @return searchSkillGroupsResult The response from the SearchSkillGroups
     *         service method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchSkillGroupsResult searchSkillGroups(
            SearchSkillGroupsRequest searchSkillGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchSkillGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchSkillGroupsRequest> request = null;
        Response<SearchSkillGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchSkillGroupsRequestMarshaller()
                        .marshall(searchSkillGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchSkillGroupsResult, JsonUnmarshallerContext> unmarshaller = new SearchSkillGroupsResultJsonUnmarshaller();
            JsonResponseHandler<SearchSkillGroupsResult> responseHandler = new JsonResponseHandler<SearchSkillGroupsResult>(
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
     * Searches users and lists the ones that meet a set of filter and sort
     * criteria.
     * </p>
     * 
     * @param searchUsersRequest
     * @return searchUsersResult The response from the SearchUsers service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchUsersResult searchUsers(SearchUsersRequest searchUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchUsersRequest> request = null;
        Response<SearchUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchUsersRequestMarshaller().marshall(searchUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchUsersResult, JsonUnmarshallerContext> unmarshaller = new SearchUsersResultJsonUnmarshaller();
            JsonResponseHandler<SearchUsersResult> responseHandler = new JsonResponseHandler<SearchUsersResult>(
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
     * Triggers an asynchronous flow to send text, SSML, or audio announcements
     * to rooms that are identified by a search or filter.
     * </p>
     * 
     * @param sendAnnouncementRequest
     * @return sendAnnouncementResult The response from the SendAnnouncement
     *         service method, as returned by Alexa For Business.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SendAnnouncementResult sendAnnouncement(SendAnnouncementRequest sendAnnouncementRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendAnnouncementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendAnnouncementRequest> request = null;
        Response<SendAnnouncementResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendAnnouncementRequestMarshaller().marshall(sendAnnouncementRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendAnnouncementResult, JsonUnmarshallerContext> unmarshaller = new SendAnnouncementResultJsonUnmarshaller();
            JsonResponseHandler<SendAnnouncementResult> responseHandler = new JsonResponseHandler<SendAnnouncementResult>(
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
     * Sends an enrollment invitation email with a URL to a user. The URL is
     * valid for 30 days or until you call this operation again, whichever comes
     * first.
     * </p>
     * 
     * @param sendInvitationRequest
     * @return sendInvitationResult The response from the SendInvitation service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws InvalidUserStatusException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SendInvitationResult sendInvitation(SendInvitationRequest sendInvitationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendInvitationRequest> request = null;
        Response<SendInvitationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendInvitationRequestMarshaller().marshall(sendInvitationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendInvitationResult, JsonUnmarshallerContext> unmarshaller = new SendInvitationResultJsonUnmarshaller();
            JsonResponseHandler<SendInvitationResult> responseHandler = new JsonResponseHandler<SendInvitationResult>(
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
     * Resets a device and its account to the known default settings. This
     * clears all information and settings set by previous users in the
     * following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Bluetooth - This unpairs all bluetooth devices paired with your echo
     * device.
     * </p>
     * </li>
     * <li>
     * <p>
     * Volume - This resets the echo device's volume to the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notifications - This clears all notifications from your echo device.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists - This clears all to-do items from your echo device.
     * </p>
     * </li>
     * <li>
     * <p>
     * Settings - This internally syncs the room's profile (if the device is
     * assigned to a room), contacts, address books, delegation access for
     * account linking, and communications (if enabled on the room profile).
     * </p>
     * </li>
     * </ul>
     * 
     * @param startDeviceSyncRequest
     * @return startDeviceSyncResult The response from the StartDeviceSync
     *         service method, as returned by Alexa For Business.
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartDeviceSyncResult startDeviceSync(StartDeviceSyncRequest startDeviceSyncRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startDeviceSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDeviceSyncRequest> request = null;
        Response<StartDeviceSyncResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDeviceSyncRequestMarshaller().marshall(startDeviceSyncRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartDeviceSyncResult, JsonUnmarshallerContext> unmarshaller = new StartDeviceSyncResultJsonUnmarshaller();
            JsonResponseHandler<StartDeviceSyncResult> responseHandler = new JsonResponseHandler<StartDeviceSyncResult>(
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
     * Initiates the discovery of any smart home appliances associated with the
     * room.
     * </p>
     * 
     * @param startSmartHomeApplianceDiscoveryRequest
     * @return startSmartHomeApplianceDiscoveryResult The response from the
     *         StartSmartHomeApplianceDiscovery service method, as returned by
     *         Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartSmartHomeApplianceDiscoveryResult startSmartHomeApplianceDiscovery(
            StartSmartHomeApplianceDiscoveryRequest startSmartHomeApplianceDiscoveryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startSmartHomeApplianceDiscoveryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSmartHomeApplianceDiscoveryRequest> request = null;
        Response<StartSmartHomeApplianceDiscoveryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSmartHomeApplianceDiscoveryRequestMarshaller()
                        .marshall(startSmartHomeApplianceDiscoveryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartSmartHomeApplianceDiscoveryResult, JsonUnmarshallerContext> unmarshaller = new StartSmartHomeApplianceDiscoveryResultJsonUnmarshaller();
            JsonResponseHandler<StartSmartHomeApplianceDiscoveryResult> responseHandler = new JsonResponseHandler<StartSmartHomeApplianceDiscoveryResult>(
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
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
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
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
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
     * Updates address book details by the address book ARN.
     * </p>
     * 
     * @param updateAddressBookRequest
     * @return updateAddressBookResult The response from the UpdateAddressBook
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAddressBookResult updateAddressBook(
            UpdateAddressBookRequest updateAddressBookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAddressBookRequest> request = null;
        Response<UpdateAddressBookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAddressBookRequestMarshaller()
                        .marshall(updateAddressBookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAddressBookResult, JsonUnmarshallerContext> unmarshaller = new UpdateAddressBookResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAddressBookResult> responseHandler = new JsonResponseHandler<UpdateAddressBookResult>(
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
     * Updates the configuration of the report delivery schedule with the
     * specified schedule ARN.
     * </p>
     * 
     * @param updateBusinessReportScheduleRequest
     * @return updateBusinessReportScheduleResult The response from the
     *         UpdateBusinessReportSchedule service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateBusinessReportScheduleResult updateBusinessReportSchedule(
            UpdateBusinessReportScheduleRequest updateBusinessReportScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateBusinessReportScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBusinessReportScheduleRequest> request = null;
        Response<UpdateBusinessReportScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBusinessReportScheduleRequestMarshaller()
                        .marshall(updateBusinessReportScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBusinessReportScheduleResult, JsonUnmarshallerContext> unmarshaller = new UpdateBusinessReportScheduleResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBusinessReportScheduleResult> responseHandler = new JsonResponseHandler<UpdateBusinessReportScheduleResult>(
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
     * Updates an existing conference provider's settings.
     * </p>
     * 
     * @param updateConferenceProviderRequest
     * @return updateConferenceProviderResult The response from the
     *         UpdateConferenceProvider service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateConferenceProviderResult updateConferenceProvider(
            UpdateConferenceProviderRequest updateConferenceProviderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConferenceProviderRequest> request = null;
        Response<UpdateConferenceProviderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConferenceProviderRequestMarshaller()
                        .marshall(updateConferenceProviderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateConferenceProviderResult, JsonUnmarshallerContext> unmarshaller = new UpdateConferenceProviderResultJsonUnmarshaller();
            JsonResponseHandler<UpdateConferenceProviderResult> responseHandler = new JsonResponseHandler<UpdateConferenceProviderResult>(
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
     * Updates the contact details by the contact ARN.
     * </p>
     * 
     * @param updateContactRequest
     * @return updateContactResult The response from the UpdateContact service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateContactResult updateContact(UpdateContactRequest updateContactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactRequest> request = null;
        Response<UpdateContactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactRequestMarshaller().marshall(updateContactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateContactResult, JsonUnmarshallerContext> unmarshaller = new UpdateContactResultJsonUnmarshaller();
            JsonResponseHandler<UpdateContactResult> responseHandler = new JsonResponseHandler<UpdateContactResult>(
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
     * Updates the device name by device ARN.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return updateDeviceResult The response from the UpdateDevice service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDeviceResult updateDevice(UpdateDeviceRequest updateDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceRequest> request = null;
        Response<UpdateDeviceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceRequestMarshaller().marshall(updateDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDeviceResult, JsonUnmarshallerContext> unmarshaller = new UpdateDeviceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDeviceResult> responseHandler = new JsonResponseHandler<UpdateDeviceResult>(
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
     * Updates the details of a gateway. If any optional field is not provided,
     * the existing corresponding value is left unmodified.
     * </p>
     * 
     * @param updateGatewayRequest
     * @return updateGatewayResult The response from the UpdateGateway service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateGatewayResult updateGateway(UpdateGatewayRequest updateGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayRequest> request = null;
        Response<UpdateGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayRequestMarshaller().marshall(updateGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGatewayResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewayResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGatewayResult> responseHandler = new JsonResponseHandler<UpdateGatewayResult>(
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
     * Updates the details of a gateway group. If any optional field is not
     * provided, the existing corresponding value is left unmodified.
     * </p>
     * 
     * @param updateGatewayGroupRequest
     * @return updateGatewayGroupResult The response from the UpdateGatewayGroup
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateGatewayGroupResult updateGatewayGroup(
            UpdateGatewayGroupRequest updateGatewayGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGatewayGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayGroupRequest> request = null;
        Response<UpdateGatewayGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayGroupRequestMarshaller()
                        .marshall(updateGatewayGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGatewayGroupResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewayGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGatewayGroupResult> responseHandler = new JsonResponseHandler<UpdateGatewayGroupResult>(
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
     * Updates a network profile by the network profile ARN.
     * </p>
     * 
     * @param updateNetworkProfileRequest
     * @return updateNetworkProfileResult The response from the
     *         UpdateNetworkProfile service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws ConcurrentModificationException
     * @throws InvalidCertificateAuthorityException
     * @throws InvalidSecretsManagerResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateNetworkProfileResult updateNetworkProfile(
            UpdateNetworkProfileRequest updateNetworkProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateNetworkProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNetworkProfileRequest> request = null;
        Response<UpdateNetworkProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNetworkProfileRequestMarshaller()
                        .marshall(updateNetworkProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateNetworkProfileResult, JsonUnmarshallerContext> unmarshaller = new UpdateNetworkProfileResultJsonUnmarshaller();
            JsonResponseHandler<UpdateNetworkProfileResult> responseHandler = new JsonResponseHandler<UpdateNetworkProfileResult>(
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
     * Updates an existing room profile by room profile ARN.
     * </p>
     * 
     * @param updateProfileRequest
     * @return updateProfileResult The response from the UpdateProfile service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateProfileResult updateProfile(UpdateProfileRequest updateProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProfileRequest> request = null;
        Response<UpdateProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProfileRequestMarshaller().marshall(updateProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateProfileResult, JsonUnmarshallerContext> unmarshaller = new UpdateProfileResultJsonUnmarshaller();
            JsonResponseHandler<UpdateProfileResult> responseHandler = new JsonResponseHandler<UpdateProfileResult>(
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
     * Updates room details by room ARN.
     * </p>
     * 
     * @param updateRoomRequest
     * @return updateRoomResult The response from the UpdateRoom service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRoomResult updateRoom(UpdateRoomRequest updateRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoomRequest> request = null;
        Response<UpdateRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoomRequestMarshaller().marshall(updateRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRoomResult, JsonUnmarshallerContext> unmarshaller = new UpdateRoomResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRoomResult> responseHandler = new JsonResponseHandler<UpdateRoomResult>(
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
     * Updates skill group details by skill group ARN.
     * </p>
     * 
     * @param updateSkillGroupRequest
     * @return updateSkillGroupResult The response from the UpdateSkillGroup
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateSkillGroupResult updateSkillGroup(UpdateSkillGroupRequest updateSkillGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSkillGroupRequest> request = null;
        Response<UpdateSkillGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSkillGroupRequestMarshaller().marshall(updateSkillGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSkillGroupResult, JsonUnmarshallerContext> unmarshaller = new UpdateSkillGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSkillGroupResult> responseHandler = new JsonResponseHandler<UpdateSkillGroupResult>(
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
