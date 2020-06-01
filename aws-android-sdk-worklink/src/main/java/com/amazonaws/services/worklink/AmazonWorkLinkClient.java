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

package com.amazonaws.services.worklink;

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

import com.amazonaws.services.worklink.model.*;
import com.amazonaws.services.worklink.model.transform.*;

/**
 * Client for accessing Amazon WorkLink. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon WorkLink is a cloud-based service that provides secure access to
 * internal websites and web apps from iOS and Android phones. In a single step,
 * your users, such as employees, can access internal websites as efficiently as
 * they access any other public website. They enter a URL in their web browser,
 * or choose a link to an internal website in an email. Amazon WorkLink
 * authenticates the user's access and securely renders authorized internal web
 * content in a secure rendering service in the AWS cloud. Amazon WorkLink
 * doesn't download or store any internal web content on mobile devices.
 * </p>
 */
public class AmazonWorkLinkClient extends AmazonWebServiceClient implements AmazonWorkLink {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon WorkLink exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonWorkLink. A
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
    public AmazonWorkLinkClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkLink. A
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
     *            how this client connects to AmazonWorkLink (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonWorkLinkClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkLink using
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
     *         AmazonWorkLinkClient client = new AmazonWorkLinkClient(AWSMobileClient.getInstance());
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
    public AmazonWorkLinkClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkLink using
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
     *         AmazonWorkLinkClient client = new AmazonWorkLinkClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonWorkLink (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonWorkLinkClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkLink using
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
     *         AmazonWorkLinkClient client = new AmazonWorkLinkClient(AWSMobileClient.getInstance());
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
    public AmazonWorkLinkClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkLink using
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
     *         AmazonWorkLinkClient client = new AmazonWorkLinkClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonWorkLink (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonWorkLinkClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkLink using
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
     *            how this client connects to AmazonWorkLink (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonWorkLinkClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonWorkLink using
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
     *         AmazonWorkLinkClient client = new AmazonWorkLinkClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonWorkLink (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonWorkLinkClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("worklink.us-east-1.amazonaws.com");
        this.endpointPrefix = "worklink";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/worklink/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/worklink/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Specifies a domain to be associated to Amazon WorkLink.
     * </p>
     * 
     * @param associateDomainRequest
     * @return associateDomainResult The response from the AssociateDomain
     *         service method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateDomainResult associateDomain(AssociateDomainRequest associateDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDomainRequest> request = null;
        Response<AssociateDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDomainRequestMarshaller().marshall(associateDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateDomainResult, JsonUnmarshallerContext> unmarshaller = new AssociateDomainResultJsonUnmarshaller();
            JsonResponseHandler<AssociateDomainResult> responseHandler = new JsonResponseHandler<AssociateDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Associates a website authorization provider with a specified fleet. This
     * is used to authorize users against associated websites in the company
     * network.
     * </p>
     * 
     * @param associateWebsiteAuthorizationProviderRequest
     * @return associateWebsiteAuthorizationProviderResult The response from the
     *         AssociateWebsiteAuthorizationProvider service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateWebsiteAuthorizationProviderResult associateWebsiteAuthorizationProvider(
            AssociateWebsiteAuthorizationProviderRequest associateWebsiteAuthorizationProviderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateWebsiteAuthorizationProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWebsiteAuthorizationProviderRequest> request = null;
        Response<AssociateWebsiteAuthorizationProviderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWebsiteAuthorizationProviderRequestMarshaller()
                        .marshall(associateWebsiteAuthorizationProviderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateWebsiteAuthorizationProviderResult, JsonUnmarshallerContext> unmarshaller = new AssociateWebsiteAuthorizationProviderResultJsonUnmarshaller();
            JsonResponseHandler<AssociateWebsiteAuthorizationProviderResult> responseHandler = new JsonResponseHandler<AssociateWebsiteAuthorizationProviderResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Imports the root certificate of a certificate authority (CA) used to
     * obtain TLS certificates used by associated websites within the company
     * network.
     * </p>
     * 
     * @param associateWebsiteCertificateAuthorityRequest
     * @return associateWebsiteCertificateAuthorityResult The response from the
     *         AssociateWebsiteCertificateAuthority service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateWebsiteCertificateAuthorityResult associateWebsiteCertificateAuthority(
            AssociateWebsiteCertificateAuthorityRequest associateWebsiteCertificateAuthorityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateWebsiteCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWebsiteCertificateAuthorityRequest> request = null;
        Response<AssociateWebsiteCertificateAuthorityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWebsiteCertificateAuthorityRequestMarshaller()
                        .marshall(associateWebsiteCertificateAuthorityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateWebsiteCertificateAuthorityResult, JsonUnmarshallerContext> unmarshaller = new AssociateWebsiteCertificateAuthorityResultJsonUnmarshaller();
            JsonResponseHandler<AssociateWebsiteCertificateAuthorityResult> responseHandler = new JsonResponseHandler<AssociateWebsiteCertificateAuthorityResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a fleet. A fleet consists of resources and the configuration that
     * delivers associated websites to authorized users who download and set up
     * the Amazon WorkLink app.
     * </p>
     * 
     * @param createFleetRequest
     * @return createFleetResult The response from the CreateFleet service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateFleetResult createFleet(CreateFleetRequest createFleetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFleetRequest> request = null;
        Response<CreateFleetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFleetRequestMarshaller().marshall(createFleetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateFleetResult, JsonUnmarshallerContext> unmarshaller = new CreateFleetResultJsonUnmarshaller();
            JsonResponseHandler<CreateFleetResult> responseHandler = new JsonResponseHandler<CreateFleetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a fleet. Prevents users from accessing previously associated
     * websites.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return deleteFleetResult The response from the DeleteFleet service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetRequest> request = null;
        Response<DeleteFleetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetRequestMarshaller().marshall(deleteFleetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteFleetResult, JsonUnmarshallerContext> unmarshaller = new DeleteFleetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteFleetResult> responseHandler = new JsonResponseHandler<DeleteFleetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the configuration for delivering audit streams to the customer
     * account.
     * </p>
     * 
     * @param describeAuditStreamConfigurationRequest
     * @return describeAuditStreamConfigurationResult The response from the
     *         DescribeAuditStreamConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAuditStreamConfigurationResult describeAuditStreamConfiguration(
            DescribeAuditStreamConfigurationRequest describeAuditStreamConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAuditStreamConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAuditStreamConfigurationRequest> request = null;
        Response<DescribeAuditStreamConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAuditStreamConfigurationRequestMarshaller()
                        .marshall(describeAuditStreamConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAuditStreamConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DescribeAuditStreamConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAuditStreamConfigurationResult> responseHandler = new JsonResponseHandler<DescribeAuditStreamConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the networking configuration to access the internal websites
     * associated with the specified fleet.
     * </p>
     * 
     * @param describeCompanyNetworkConfigurationRequest
     * @return describeCompanyNetworkConfigurationResult The response from the
     *         DescribeCompanyNetworkConfiguration service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCompanyNetworkConfigurationResult describeCompanyNetworkConfiguration(
            DescribeCompanyNetworkConfigurationRequest describeCompanyNetworkConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCompanyNetworkConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCompanyNetworkConfigurationRequest> request = null;
        Response<DescribeCompanyNetworkConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCompanyNetworkConfigurationRequestMarshaller()
                        .marshall(describeCompanyNetworkConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCompanyNetworkConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DescribeCompanyNetworkConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCompanyNetworkConfigurationResult> responseHandler = new JsonResponseHandler<DescribeCompanyNetworkConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides information about a user's device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return describeDeviceResult The response from the DescribeDevice service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDeviceResult describeDevice(DescribeDeviceRequest describeDeviceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeviceRequest> request = null;
        Response<DescribeDeviceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeviceRequestMarshaller().marshall(describeDeviceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDeviceResult, JsonUnmarshallerContext> unmarshaller = new DescribeDeviceResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDeviceResult> responseHandler = new JsonResponseHandler<DescribeDeviceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the device policy configuration for the specified fleet.
     * </p>
     * 
     * @param describeDevicePolicyConfigurationRequest
     * @return describeDevicePolicyConfigurationResult The response from the
     *         DescribeDevicePolicyConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDevicePolicyConfigurationResult describeDevicePolicyConfiguration(
            DescribeDevicePolicyConfigurationRequest describeDevicePolicyConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDevicePolicyConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDevicePolicyConfigurationRequest> request = null;
        Response<DescribeDevicePolicyConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDevicePolicyConfigurationRequestMarshaller()
                        .marshall(describeDevicePolicyConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDevicePolicyConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DescribeDevicePolicyConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDevicePolicyConfigurationResult> responseHandler = new JsonResponseHandler<DescribeDevicePolicyConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides information about the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return describeDomainResult The response from the DescribeDomain service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DescribeDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestMarshaller().marshall(describeDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDomainResult, JsonUnmarshallerContext> unmarshaller = new DescribeDomainResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDomainResult> responseHandler = new JsonResponseHandler<DescribeDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides basic information for the specified fleet, excluding identity
     * provider, networking, and device configuration details.
     * </p>
     * 
     * @param describeFleetMetadataRequest
     * @return describeFleetMetadataResult The response from the
     *         DescribeFleetMetadata service method, as returned by Amazon
     *         WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeFleetMetadataResult describeFleetMetadata(
            DescribeFleetMetadataRequest describeFleetMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeFleetMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetMetadataRequest> request = null;
        Response<DescribeFleetMetadataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetMetadataRequestMarshaller()
                        .marshall(describeFleetMetadataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeFleetMetadataResult, JsonUnmarshallerContext> unmarshaller = new DescribeFleetMetadataResultJsonUnmarshaller();
            JsonResponseHandler<DescribeFleetMetadataResult> responseHandler = new JsonResponseHandler<DescribeFleetMetadataResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the identity provider configuration of the specified fleet.
     * </p>
     * 
     * @param describeIdentityProviderConfigurationRequest
     * @return describeIdentityProviderConfigurationResult The response from the
     *         DescribeIdentityProviderConfiguration service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeIdentityProviderConfigurationResult describeIdentityProviderConfiguration(
            DescribeIdentityProviderConfigurationRequest describeIdentityProviderConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeIdentityProviderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityProviderConfigurationRequest> request = null;
        Response<DescribeIdentityProviderConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityProviderConfigurationRequestMarshaller()
                        .marshall(describeIdentityProviderConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeIdentityProviderConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DescribeIdentityProviderConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeIdentityProviderConfigurationResult> responseHandler = new JsonResponseHandler<DescribeIdentityProviderConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides information about the certificate authority.
     * </p>
     * 
     * @param describeWebsiteCertificateAuthorityRequest
     * @return describeWebsiteCertificateAuthorityResult The response from the
     *         DescribeWebsiteCertificateAuthority service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeWebsiteCertificateAuthorityResult describeWebsiteCertificateAuthority(
            DescribeWebsiteCertificateAuthorityRequest describeWebsiteCertificateAuthorityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeWebsiteCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWebsiteCertificateAuthorityRequest> request = null;
        Response<DescribeWebsiteCertificateAuthorityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWebsiteCertificateAuthorityRequestMarshaller()
                        .marshall(describeWebsiteCertificateAuthorityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeWebsiteCertificateAuthorityResult, JsonUnmarshallerContext> unmarshaller = new DescribeWebsiteCertificateAuthorityResultJsonUnmarshaller();
            JsonResponseHandler<DescribeWebsiteCertificateAuthorityResult> responseHandler = new JsonResponseHandler<DescribeWebsiteCertificateAuthorityResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disassociates a domain from Amazon WorkLink. End users lose the ability
     * to access the domain with Amazon WorkLink.
     * </p>
     * 
     * @param disassociateDomainRequest
     * @return disassociateDomainResult The response from the DisassociateDomain
     *         service method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateDomainResult disassociateDomain(
            DisassociateDomainRequest disassociateDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDomainRequest> request = null;
        Response<DisassociateDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDomainRequestMarshaller()
                        .marshall(disassociateDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateDomainResult, JsonUnmarshallerContext> unmarshaller = new DisassociateDomainResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateDomainResult> responseHandler = new JsonResponseHandler<DisassociateDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disassociates a website authorization provider from a specified fleet.
     * After the disassociation, users can't load any associated websites that
     * require this authorization provider.
     * </p>
     * 
     * @param disassociateWebsiteAuthorizationProviderRequest
     * @return disassociateWebsiteAuthorizationProviderResult The response from
     *         the DisassociateWebsiteAuthorizationProvider service method, as
     *         returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateWebsiteAuthorizationProviderResult disassociateWebsiteAuthorizationProvider(
            DisassociateWebsiteAuthorizationProviderRequest disassociateWebsiteAuthorizationProviderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateWebsiteAuthorizationProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWebsiteAuthorizationProviderRequest> request = null;
        Response<DisassociateWebsiteAuthorizationProviderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWebsiteAuthorizationProviderRequestMarshaller()
                        .marshall(disassociateWebsiteAuthorizationProviderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateWebsiteAuthorizationProviderResult, JsonUnmarshallerContext> unmarshaller = new DisassociateWebsiteAuthorizationProviderResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateWebsiteAuthorizationProviderResult> responseHandler = new JsonResponseHandler<DisassociateWebsiteAuthorizationProviderResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes a certificate authority (CA).
     * </p>
     * 
     * @param disassociateWebsiteCertificateAuthorityRequest
     * @return disassociateWebsiteCertificateAuthorityResult The response from
     *         the DisassociateWebsiteCertificateAuthority service method, as
     *         returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateWebsiteCertificateAuthorityResult disassociateWebsiteCertificateAuthority(
            DisassociateWebsiteCertificateAuthorityRequest disassociateWebsiteCertificateAuthorityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateWebsiteCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWebsiteCertificateAuthorityRequest> request = null;
        Response<DisassociateWebsiteCertificateAuthorityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWebsiteCertificateAuthorityRequestMarshaller()
                        .marshall(disassociateWebsiteCertificateAuthorityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateWebsiteCertificateAuthorityResult, JsonUnmarshallerContext> unmarshaller = new DisassociateWebsiteCertificateAuthorityResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateWebsiteCertificateAuthorityResult> responseHandler = new JsonResponseHandler<DisassociateWebsiteCertificateAuthorityResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a list of devices registered with the specified fleet.
     * </p>
     * 
     * @param listDevicesRequest
     * @return listDevicesResult The response from the ListDevices service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicesRequest> request = null;
        Response<ListDevicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicesRequestMarshaller().marshall(listDevicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDevicesResult, JsonUnmarshallerContext> unmarshaller = new ListDevicesResultJsonUnmarshaller();
            JsonResponseHandler<ListDevicesResult> responseHandler = new JsonResponseHandler<ListDevicesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a list of domains associated to a specified fleet.
     * </p>
     * 
     * @param listDomainsRequest
     * @return listDomainsResult The response from the ListDomains service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestMarshaller().marshall(listDomainsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDomainsResult, JsonUnmarshallerContext> unmarshaller = new ListDomainsResultJsonUnmarshaller();
            JsonResponseHandler<ListDomainsResult> responseHandler = new JsonResponseHandler<ListDomainsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a list of fleets for the current account and Region.
     * </p>
     * 
     * @param listFleetsRequest
     * @return listFleetsResult The response from the ListFleets service method,
     *         as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFleetsRequest> request = null;
        Response<ListFleetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFleetsRequestMarshaller().marshall(listFleetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListFleetsResult, JsonUnmarshallerContext> unmarshaller = new ListFleetsResultJsonUnmarshaller();
            JsonResponseHandler<ListFleetsResult> responseHandler = new JsonResponseHandler<ListFleetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a list of tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         WorkLink.
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
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
     * Retrieves a list of website authorization providers associated with a
     * specified fleet.
     * </p>
     * 
     * @param listWebsiteAuthorizationProvidersRequest
     * @return listWebsiteAuthorizationProvidersResult The response from the
     *         ListWebsiteAuthorizationProviders service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListWebsiteAuthorizationProvidersResult listWebsiteAuthorizationProviders(
            ListWebsiteAuthorizationProvidersRequest listWebsiteAuthorizationProvidersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listWebsiteAuthorizationProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebsiteAuthorizationProvidersRequest> request = null;
        Response<ListWebsiteAuthorizationProvidersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebsiteAuthorizationProvidersRequestMarshaller()
                        .marshall(listWebsiteAuthorizationProvidersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListWebsiteAuthorizationProvidersResult, JsonUnmarshallerContext> unmarshaller = new ListWebsiteAuthorizationProvidersResultJsonUnmarshaller();
            JsonResponseHandler<ListWebsiteAuthorizationProvidersResult> responseHandler = new JsonResponseHandler<ListWebsiteAuthorizationProvidersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a list of certificate authorities added for the current account
     * and Region.
     * </p>
     * 
     * @param listWebsiteCertificateAuthoritiesRequest
     * @return listWebsiteCertificateAuthoritiesResult The response from the
     *         ListWebsiteCertificateAuthorities service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListWebsiteCertificateAuthoritiesResult listWebsiteCertificateAuthorities(
            ListWebsiteCertificateAuthoritiesRequest listWebsiteCertificateAuthoritiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listWebsiteCertificateAuthoritiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebsiteCertificateAuthoritiesRequest> request = null;
        Response<ListWebsiteCertificateAuthoritiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebsiteCertificateAuthoritiesRequestMarshaller()
                        .marshall(listWebsiteCertificateAuthoritiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListWebsiteCertificateAuthoritiesResult, JsonUnmarshallerContext> unmarshaller = new ListWebsiteCertificateAuthoritiesResultJsonUnmarshaller();
            JsonResponseHandler<ListWebsiteCertificateAuthoritiesResult> responseHandler = new JsonResponseHandler<ListWebsiteCertificateAuthoritiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Moves a domain to ACTIVE status if it was in the INACTIVE status.
     * </p>
     * 
     * @param restoreDomainAccessRequest
     * @return restoreDomainAccessResult The response from the
     *         RestoreDomainAccess service method, as returned by Amazon
     *         WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RestoreDomainAccessResult restoreDomainAccess(
            RestoreDomainAccessRequest restoreDomainAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreDomainAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDomainAccessRequest> request = null;
        Response<RestoreDomainAccessResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreDomainAccessRequestMarshaller()
                        .marshall(restoreDomainAccessRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RestoreDomainAccessResult, JsonUnmarshallerContext> unmarshaller = new RestoreDomainAccessResultJsonUnmarshaller();
            JsonResponseHandler<RestoreDomainAccessResult> responseHandler = new JsonResponseHandler<RestoreDomainAccessResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Moves a domain to INACTIVE status if it was in the ACTIVE status.
     * </p>
     * 
     * @param revokeDomainAccessRequest
     * @return revokeDomainAccessResult The response from the RevokeDomainAccess
     *         service method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RevokeDomainAccessResult revokeDomainAccess(
            RevokeDomainAccessRequest revokeDomainAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(revokeDomainAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeDomainAccessRequest> request = null;
        Response<RevokeDomainAccessResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeDomainAccessRequestMarshaller()
                        .marshall(revokeDomainAccessRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RevokeDomainAccessResult, JsonUnmarshallerContext> unmarshaller = new RevokeDomainAccessResultJsonUnmarshaller();
            JsonResponseHandler<RevokeDomainAccessResult> responseHandler = new JsonResponseHandler<RevokeDomainAccessResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Signs the user out from all of their devices. The user can sign in again
     * if they have valid credentials.
     * </p>
     * 
     * @param signOutUserRequest
     * @return signOutUserResult The response from the SignOutUser service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SignOutUserResult signOutUser(SignOutUserRequest signOutUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(signOutUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignOutUserRequest> request = null;
        Response<SignOutUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignOutUserRequestMarshaller().marshall(signOutUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SignOutUserResult, JsonUnmarshallerContext> unmarshaller = new SignOutUserResultJsonUnmarshaller();
            JsonResponseHandler<SignOutUserResult> responseHandler = new JsonResponseHandler<SignOutUserResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource, such as a
     * fleet. Each tag consists of a key and an optional value. If a resource
     * already has a tag with the same key, this operation updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon WorkLink.
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
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
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon WorkLink.
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
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
     * Updates the audit stream configuration for the fleet.
     * </p>
     * 
     * @param updateAuditStreamConfigurationRequest
     * @return updateAuditStreamConfigurationResult The response from the
     *         UpdateAuditStreamConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAuditStreamConfigurationResult updateAuditStreamConfiguration(
            UpdateAuditStreamConfigurationRequest updateAuditStreamConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAuditStreamConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAuditStreamConfigurationRequest> request = null;
        Response<UpdateAuditStreamConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAuditStreamConfigurationRequestMarshaller()
                        .marshall(updateAuditStreamConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAuditStreamConfigurationResult, JsonUnmarshallerContext> unmarshaller = new UpdateAuditStreamConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAuditStreamConfigurationResult> responseHandler = new JsonResponseHandler<UpdateAuditStreamConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the company network configuration for the fleet.
     * </p>
     * 
     * @param updateCompanyNetworkConfigurationRequest
     * @return updateCompanyNetworkConfigurationResult The response from the
     *         UpdateCompanyNetworkConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateCompanyNetworkConfigurationResult updateCompanyNetworkConfiguration(
            UpdateCompanyNetworkConfigurationRequest updateCompanyNetworkConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCompanyNetworkConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCompanyNetworkConfigurationRequest> request = null;
        Response<UpdateCompanyNetworkConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCompanyNetworkConfigurationRequestMarshaller()
                        .marshall(updateCompanyNetworkConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCompanyNetworkConfigurationResult, JsonUnmarshallerContext> unmarshaller = new UpdateCompanyNetworkConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCompanyNetworkConfigurationResult> responseHandler = new JsonResponseHandler<UpdateCompanyNetworkConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the device policy configuration for the fleet.
     * </p>
     * 
     * @param updateDevicePolicyConfigurationRequest
     * @return updateDevicePolicyConfigurationResult The response from the
     *         UpdateDevicePolicyConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDevicePolicyConfigurationResult updateDevicePolicyConfiguration(
            UpdateDevicePolicyConfigurationRequest updateDevicePolicyConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDevicePolicyConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDevicePolicyConfigurationRequest> request = null;
        Response<UpdateDevicePolicyConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDevicePolicyConfigurationRequestMarshaller()
                        .marshall(updateDevicePolicyConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDevicePolicyConfigurationResult, JsonUnmarshallerContext> unmarshaller = new UpdateDevicePolicyConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDevicePolicyConfigurationResult> responseHandler = new JsonResponseHandler<UpdateDevicePolicyConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates domain metadata, such as DisplayName.
     * </p>
     * 
     * @param updateDomainMetadataRequest
     * @return updateDomainMetadataResult The response from the
     *         UpdateDomainMetadata service method, as returned by Amazon
     *         WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDomainMetadataResult updateDomainMetadata(
            UpdateDomainMetadataRequest updateDomainMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDomainMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainMetadataRequest> request = null;
        Response<UpdateDomainMetadataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainMetadataRequestMarshaller()
                        .marshall(updateDomainMetadataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainMetadataResult, JsonUnmarshallerContext> unmarshaller = new UpdateDomainMetadataResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainMetadataResult> responseHandler = new JsonResponseHandler<UpdateDomainMetadataResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates fleet metadata, such as DisplayName.
     * </p>
     * 
     * @param updateFleetMetadataRequest
     * @return updateFleetMetadataResult The response from the
     *         UpdateFleetMetadata service method, as returned by Amazon
     *         WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateFleetMetadataResult updateFleetMetadata(
            UpdateFleetMetadataRequest updateFleetMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateFleetMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetMetadataRequest> request = null;
        Response<UpdateFleetMetadataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetMetadataRequestMarshaller()
                        .marshall(updateFleetMetadataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateFleetMetadataResult, JsonUnmarshallerContext> unmarshaller = new UpdateFleetMetadataResultJsonUnmarshaller();
            JsonResponseHandler<UpdateFleetMetadataResult> responseHandler = new JsonResponseHandler<UpdateFleetMetadataResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the identity provider configuration for the fleet.
     * </p>
     * 
     * @param updateIdentityProviderConfigurationRequest
     * @return updateIdentityProviderConfigurationResult The response from the
     *         UpdateIdentityProviderConfiguration service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateIdentityProviderConfigurationResult updateIdentityProviderConfiguration(
            UpdateIdentityProviderConfigurationRequest updateIdentityProviderConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateIdentityProviderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdentityProviderConfigurationRequest> request = null;
        Response<UpdateIdentityProviderConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdentityProviderConfigurationRequestMarshaller()
                        .marshall(updateIdentityProviderConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateIdentityProviderConfigurationResult, JsonUnmarshallerContext> unmarshaller = new UpdateIdentityProviderConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateIdentityProviderConfigurationResult> responseHandler = new JsonResponseHandler<UpdateIdentityProviderConfigurationResult>(
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
